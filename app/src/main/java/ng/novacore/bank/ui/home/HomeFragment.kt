package ng.novacore.bank.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import ng.novacore.bank.R
import ng.novacore.bank.adapter.CategoryAdapter
import ng.novacore.bank.adapter.TransactionAdapter
import ng.novacore.bank.databinding.FragmentHomeBinding
import ng.novacore.bank.model.QuickAction

@AndroidEntryPoint
class HomeFragment : Fragment() {
    private var binding :  FragmentHomeBinding?= null
    private  val homeViewModel: HomeViewModel by viewModels()
    lateinit var categoryAdapter : CategoryAdapter
    lateinit var transactionAdapter : TransactionAdapter

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        categoryAdapter = CategoryAdapter {}
        transactionAdapter = TransactionAdapter()
        binding?.apply {
            categoryRecycler.adapter = categoryAdapter
            transactionRecycler.adapter = transactionAdapter
            lifecycleOwner = viewLifecycleOwner
        }
        lifecycleScope.launch {
            categoryAdapter.submitList(QuickAction.allActions())
            homeViewModel.transactions.collectLatest {
                transactionAdapter.submitData(it)
            }
        }
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }


}
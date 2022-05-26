package com.communityteam.mycommunity.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.communityteam.mycommunity.R
import com.communityteam.mycommunity.databinding.FragmentDashBoardBinding
import com.communityteam.mycommunity.repository.ViewModelFactory

class DashBoardFragment : Fragment() {

    private val viewModel: DashBoardViewModel by lazy {
        ViewModelProvider(this, ViewModelFactory()).get(DashBoardViewModel::class.java)
    }

    private var _binding: FragmentDashBoardBinding? = null
    private val binding get() = _binding!!

    private val dashBoardEventAdapter: DashBoardEventAdapter by lazy {
        DashBoardEventAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDashBoardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.eventRecyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = dashBoardEventAdapter
        }

        viewModel.creatMockEvent()

        viewModel.event.observe(viewLifecycleOwner) {
            dashBoardEventAdapter.setEvents(it)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
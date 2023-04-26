package com.example.projectmariaapp

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.projectmariaapp.databinding.FragmentHomeBinding
import com.example.projectmariaapp.databinding.FragmentSendDetailsBinding

class SendDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = SendDetailsFragment()
    }

    private lateinit var viewModel: SendDetailsViewModel
    private var _binding: FragmentSendDetailsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSendDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSubmitDetails.setOnClickListener() {
            findNavController().navigate(R.id.action_sendDetailsFragment_to_updateStatusFragment)
        }

    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SendDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
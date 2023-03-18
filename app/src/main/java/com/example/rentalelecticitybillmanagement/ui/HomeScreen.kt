package com.example.rentalelecticitybillmanagement.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.rentalelecticitybillmanagement.R
import com.example.rentalelecticitybillmanagement.databinding.LayoutHomeScreenBinding
import com.example.rentalelecticitybillmanagement.repo.Tenant
import com.example.rentalelecticitybillmanagement.viewmodel.HomeScreenViewModel

class HomeScreen : AppCompatActivity() {

    private val viewModel : HomeScreenViewModel by viewModels()
    private lateinit var binding : LayoutHomeScreenBinding
    private var tenantList : ArrayList<Tenant>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.layout_home_screen)
        setupUI()
        setupAdapter()
        setupListener()
    }

    private fun setupListener() {
        binding.btnCreateTenant.setOnClickListener {
            // Start Next Activity Here
        }
    }

    private fun setupAdapter() {

    }

    private fun setupUI() {
        binding.tvHeader.text = getString(R.string.welcome_naveen_gahlot)
        binding.tvList.text = getString(R.string.tenant_list)
    }

}
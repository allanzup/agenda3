package br.com.zup.agenda.ui.detail.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import br.com.zup.agenda.R
import br.com.zup.agenda.data.model.UserResult
import br.com.zup.agenda.databinding.FragmentDetailBinding
import br.com.zup.agenda.ui.detail.viewmodel.DetailViewModel
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding
    private val viewModel: DetailViewModel by lazy {
        ViewModelProvider(this)[DetailViewModel::class.java]
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(layoutInflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        retrieveViewUserData()
    }

    private fun retrieveViewUserData() {
        val user = arguments?.getParcelable<UserResult>("CONTACT")
        if (user != null){
            displayInformation(user)
            clickNoButtonDelete(user)
            clickOnButtonEdit(user)

        }
    }

    private fun displayInformation(user: UserResult){
        binding.tvName.text = "NOME: " + user.name
        binding.tvPhone.text = "TELEFONE: " + user.phone
        binding.tvRoad.text = "RUA: " + user.logradouro
        binding.tvNunber.text = "NUMERO: " + user.number
        binding.tvDistrict.text = "BAIRRO: " + user.estado
        binding.tvState.text = "ESTADO: " + user.estado
        binding.tvCity.text = "CIDADE: " + user.cidade



    }

    private fun clickOnButtonEdit(user: UserResult){
        binding.btnEdit.setOnClickListener {
            val bundle = bundleOf("USER" to user)
            NavHostFragment.findNavController(this)
                .navigate(R.id.action_detailFragment_to_editUserFragment, bundle)
        }
    }


    fun clickNoButtonDelete(user: UserResult){
        binding.btnDelete.setOnClickListener {
            showConfirmationDialog(user)

        }
    }

    private fun showConfirmationDialog(user: UserResult) {
        MaterialAlertDialogBuilder(requireContext())
            .setTitle(getString(R.string.dialog_alert_title))
            .setMessage(getString(R.string.delete_question))
            .setCancelable(false)
            .setNegativeButton(getString(R.string.no)) { _, _ -> }
            .setPositiveButton(getString(R.string.yes)) { _, _ ->
                deleteUser(user)
            }
            .show()
    }
    private fun deleteUser(user: UserResult) {
        viewModel.deleteAllList(user)
        findNavController().navigateUp()
    }
}
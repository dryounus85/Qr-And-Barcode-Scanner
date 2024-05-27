package com.hgapp.qrbar.feature.tabs.create.barcode

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import com.hgapp.qrbar.R
import com.hgapp.qrbar.extension.isNotBlank
import com.hgapp.qrbar.extension.textString
import com.hgapp.qrbar.feature.tabs.create.BaseCreateBarcodeFragment
import com.hgapp.qrbar.model.schema.Other
import com.hgapp.qrbar.model.schema.Schema
import kotlinx.android.synthetic.main.fragment_create_codabar.*

class CreateCodabarFragment : BaseCreateBarcodeFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_create_codabar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        edit_text.requestFocus()
        edit_text.addTextChangedListener {
            parentActivity.isCreateBarcodeButtonEnabled = edit_text.isNotBlank()
        }
    }

    override fun getBarcodeSchema(): Schema {
        return Other(edit_text.textString)
    }
}
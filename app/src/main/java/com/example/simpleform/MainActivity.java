package com.example.simpleform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.input_nama)
    EditText inputNama;
    @BindView(R.id.input_nik)
    EditText inputNIK;
    @BindView(R.id.input_alamat)
    EditText inputAlamat;
    @BindView(R.id.input_umur)
    EditText inputUmur;
    @BindView(R.id.input_institusi)
    EditText inputInstitusi;

    @BindView(R.id.simpan_button)
    Button simpan_button;

    @BindView(R.id.hasil_nama)
    TextView hasilNama;
    @BindView(R.id.hasil_nik)
    TextView hasillNik;
    @BindView(R.id.hasil_umur)
    TextView hasilUmur;
    @BindView(R.id.hasil_alamat)
    TextView hasilAlamat;
    @BindView(R.id.hasil_institusi)
    TextView hasilInstutusi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

@OnClick(R.id.simpan_button)
    public void btnClicked(){
        String nama = inputNama.getText().toString();
        hasilNama.setText(nama);
        String nik = inputNIK.getText().toString();
        hasillNik.setText(nik);
        String umur = inputUmur.getText().toString();
        hasilUmur.setText(umur);
        String alamat = inputAlamat.getText().toString();
        hasilAlamat.setText(alamat);
        String institusi = inputInstitusi.getText().toString();
        hasilInstutusi.setText(institusi);
}
}

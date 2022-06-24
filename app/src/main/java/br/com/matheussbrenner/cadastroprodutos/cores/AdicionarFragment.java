package br.com.matheussbrenner.cadastroprodutos.cores;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import br.com.matheussbrenner.cadastroprodutos.R;


public class AdicionarFragment extends Fragment {

    public AdicionarFragment() { }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.cores_fragment_adicionar, container, false);

        Button btnAdicionar = v.findViewById(R.id.button_adicionar_cor);
        btnAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame_cor, new ListarFragment()).commit();

            }
        });

        return v;
    }
}
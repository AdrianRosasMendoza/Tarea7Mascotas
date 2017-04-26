package angelapps.com.tareacourseramascotas.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import angelapps.com.tareacourseramascotas.Adapter.mascotaAdaptador;
import angelapps.com.tareacourseramascotas.POGO.mascota;
import angelapps.com.tareacourseramascotas.R;
import angelapps.com.tareacourseramascotas.presentador.IRecyclerViewFragmentPresenter;
import angelapps.com.tareacourseramascotas.presentador.RecyclerViewFragmentPresenter;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReciclerViewFragment extends Fragment implements IRecyclerViewFragmentView {

    ArrayList<mascota> mascotas;
    private RecyclerView listaMascotas;
    private IRecyclerViewFragmentPresenter presenter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_recicler_view, container, false);
        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);
        presenter = new RecyclerViewFragmentPresenter(this, getContext());
        return v;
    }

    @Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager llm =new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
    }

    @Override
    public mascotaAdaptador crearAdaptador(ArrayList<mascota> mascotas) {
        mascotaAdaptador adaptador = new mascotaAdaptador (mascotas, getActivity());
        return adaptador;
    }

    @Override
    public void inicializarAdaptadorRV(mascotaAdaptador adaptador) {
        listaMascotas.setAdapter(adaptador);
    }
}

package angelapps.com.tareacourseramascotas.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import angelapps.com.tareacourseramascotas.Adapter.PerfilAdapter;
import angelapps.com.tareacourseramascotas.Adapter.mascotaAdaptador;
import angelapps.com.tareacourseramascotas.POGO.mascota;
import angelapps.com.tareacourseramascotas.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {

    ArrayList<mascota> mascotas2;
    private RecyclerView listaMascotas;


       @Override
       public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                Bundle savedInstanceState) {
           // Inflate the layout for this fragment
           View v= inflater.inflate(R.layout.fragment_perfil, container, false);

           listaMascotas = (RecyclerView) v.findViewById(R.id.rvpefil);

           GridLayoutManager glm = new GridLayoutManager(getContext(), 3);
           listaMascotas.setLayoutManager(glm);

           inicializarListaMascotasP();
           inicializarAdaptadorP();


           return v;
       }

    public void inicializarAdaptadorP(){
        PerfilAdapter adaptador1 = new PerfilAdapter (mascotas2, getActivity());
        listaMascotas.setAdapter(adaptador1);

    }

    public void inicializarListaMascotasP() {
        mascotas2 = new ArrayList<mascota>();

        mascotas2.add(new mascota(R.drawable.lenon, "Lenon", 5));
        mascotas2.add(new mascota(R.drawable.ghost, "Ghost", 6));
        mascotas2.add(new mascota(R.drawable.mishky, "Mishky", 7));
        mascotas2.add(new mascota(R.drawable.baloo, "Baloo", 8));
        mascotas2.add(new mascota(R.drawable.wero, "Wero", 10));

    }

}

package angelapps.com.tareacourseramascotas.Fragments;


import java.util.ArrayList;

import angelapps.com.tareacourseramascotas.Adapter.mascotaAdaptador;
import angelapps.com.tareacourseramascotas.POGO.mascota;

public interface IRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();
    public mascotaAdaptador crearAdaptador(ArrayList<mascota> mascotas);
    public void inicializarAdaptadorRV(mascotaAdaptador adaptador);
}

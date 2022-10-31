
class vpAdaptador(fa:FragmentActivity):FragmentStateAdapter(fa) {

    companion object {
        private const val ARG_OBJECT = "object"
    }

    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment {
        val fragmento = VistaFragment()
        fragmento.arguments = Bundle().apply {
            putInt(ARG_OBJECT,position+1)
        }
        return fragmento

        /* return when(position){
             0->{
                 VistaFragmento()
             }
             1 ->{
                 OtroFragmento()
             }
         }*/

    }
}

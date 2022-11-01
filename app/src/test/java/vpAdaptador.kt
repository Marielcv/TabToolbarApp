import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tabtoolbarapp.Fragment2
import com.example.tabtoolbarapp.VistaFragment

class vpAdaptador(fa:FragmentActivity):FragmentStateAdapter(fa) {

    companion object {
        private const val ARG_OBJECT = "object"
    }

    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment {
        val fragment = VistaFragment()
        fragment.arguments = Bundle().apply {
            putInt(ARG_OBJECT,position+1)
        }
        return fragment

        /* return when(position){
             0->{
                 VistaFragment()
             }
             1 ->{
                 Fragment2()
             }
         }*/

    }
}

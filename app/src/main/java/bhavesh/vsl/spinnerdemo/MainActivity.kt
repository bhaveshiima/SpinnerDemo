package bhavesh.vsl.spinnerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //
        sp2.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener{
            // Nothing is Selected [ START ]
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
            // Nothing is Selected [ END ]


            // IF Selected [ START ]
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                //Display selected value using Toast (display messge for short time) [ START ]
                Toast.makeText(this@MainActivity,
                        sp2.selectedItem.toString(),Toast.LENGTH_SHORT).show()
                //Display selected value using Toast (display messge for short time) [ END ]

            }


        })


    }
}

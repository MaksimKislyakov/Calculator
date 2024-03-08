import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.projectprac.calculator.R

class ActivityMainBinding {
    val btn_0: TextView
    val mathOperation: TextView
    val result: TextView
    val allCleanBtn: TextView
    val leftBracketBtn: TextView
    val rightBracketBtn: TextView
    val divideBtn: TextView
    val multiplyBtn: TextView
    val plusBtn: TextView
    val minusBtn: TextView
    val pointBtn: TextView
    val clearBtn: TextView
    val equalBtn: TextView
    val btn_1: TextView
    val btn_2: TextView
    val btn_3: TextView
    val btn_4: TextView
    val btn_5: TextView
    val btn_6: TextView
    val btn_7: TextView
    val btn_8: TextView
    val btn_9: TextView

    constructor(root: View, ZeroBivideBtn: TextView) : super() {
        btn_0 = root.findViewById<TextView>(R.id.btn_0)
        mathOperation = root.findViewById<TextView>(R.id.math_operation)
        result = root.findViewById<TextView>(R.id.result)
        allCleanBtn = root.findViewById<TextView>(R.id.allClean_btn)
        leftBracketBtn = root.findViewById<TextView>(R.id.leftBracket_btn)
        rightBracketBtn = root.findViewById<TextView>(R.id.rightBracket_btn)
        divideBtn = root.findViewById<TextView>(R.id.divide_btn)
        multiplyBtn = root.findViewById<TextView>(R.id.multiply_btn)
        plusBtn = root.findViewById<TextView>(R.id.plus_btn)
        minusBtn = root.findViewById<TextView>(R.id.minus_btn)
        pointBtn = root.findViewById<TextView>(R.id.point_btn)
        clearBtn = root.findViewById<TextView>(R.id.clear_btn)
        equalBtn = root.findViewById<TextView>(R.id.equal_btn)
        btn_1 = root.findViewById<TextView>(R.id.btn_1)
        btn_2 = root.findViewById<TextView>(R.id.btn_2)
        btn_3 = root.findViewById<TextView>(R.id.btn_3)
        btn_4 = root.findViewById<TextView>(R.id.btn_4)
        btn_5 = root.findViewById<TextView>(R.id.btn_5)
        btn_6 = root.findViewById<TextView>(R.id.btn_6)
        btn_7 = root.findViewById<TextView>(R.id.btn_7)
        btn_8 = root.findViewById<TextView>(R.id.btn_8)
        btn_9 = root.findViewById<TextView>(R.id.btn_9)

    }
}
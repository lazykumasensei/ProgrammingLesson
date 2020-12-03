package com.myapp.programminglesson2.lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myapp.programminglesson2.R
import kotlinx.android.synthetic.main.activity_lesson3.*

class Lesson3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson3)

        var animal: Mammalia = Dog()

        addLog("상속과 재정의\n")

        addLog(animal.name)
        addLog(animal.getType())
        addLog(animal.walk())
        addLog(animal.getRoot())
        addLog("\n")

        animal = Human()
        addLog(animal.name)
        addLog(animal.getType())
        addLog(animal.walk())
        addLog(animal.getRoot())
        addLog("\n\n")

        addLog("함수와 인자 그리고 리턴\n")
        var cal = MyCalculator()
        addLog("addition : ${cal.addition(5, 3)}")
        addLog("subtraction : ${cal.subtraction(5, 3)}")
        addLog("multiplication : ${cal.multiplication(5, 3)}")
        addLog("division : ${cal.division(5, 3)}")
        addLog("divisionFloat : ${cal.divisionFloat(5f, 3f)}")
        addLog("result : ${cal.result}")
        cal.changeResult(3)
        addLog("result : ${cal.result}")
    }

    fun addLog(text:String){
        aLesson3_log.append("$text \n")
    }

    abstract class Mammalia {
        var name:String = "없음"
        abstract fun walk():String

        open fun getType():String {
            return "포유류"
        }

        fun getRoot():String {
            return "포유류"
        }
    }

    class Dog : Mammalia() {
        init {
            name = "퍼피"
        }
        override fun walk(): String {
            return "네발로 걸어요"
        }

        override fun getType(): String {
            return "강아지"
        }
    }

    class Human : Mammalia(){
        init {
            name = "홍길동"
        }

        override fun walk(): String {
            return "두발로 걸어요"
        }

        override fun getType(): String {
            return "인간"
        }
    }

    class MyCalculator{
        var result:Int = 0

        fun addition(value1:Int, value2:Int):Int{
            return value1 + value2
        }

        fun subtraction(value1:Int, value2:Int):Int{
            return value1 - value2
        }

        fun multiplication(value1:Int, value2:Int):Int{
            return value1 * value2
        }

        fun division(value1:Int, value2:Int):Int{
            return value1 / value2
        }

        fun divisionFloat(value1:Float, value2:Float):Float{
            return value1 / value2
        }

        fun changeResult(result:Int){
            this.result = result
        }
    }
}
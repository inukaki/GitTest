class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btClick = findViewById<Button>(R.id.btClick)
        val listener = HelloListener()
        btClick.setOnClickListener(listener)

        val btClear = findViewById<Button>(R.id.btClear)
        btClear.setOnClickListener(listener)
    }

    //ボタンをクリックした時のリスナクラス
    private inner class HelloListener : View.OnClickListener{
        override fun onClick(view:View) {
            val input = findViewById<EditText>(R.id.etName)
            val output = findViewById<TextView>(R.id.tvOutput)

            when (view.id) {
                R.id.btClick-> {
                    val inputStr = input.text.toString()
                    output.text = inputStr + "さん、こんにちは！"
                }
                R.id.btClear->{
                    input.setText("")
                    output.text=""
                }
            }
        }
    }
}
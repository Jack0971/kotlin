// TODO: muted automatically, investigate should it be ran for JS or not
// IGNORE_BACKEND: JS

fun stringConcat(n : Int) : String? {
  var string : String? = ""
  for (i in 0..(n - 1))
    string += "LOL "
  return string
}

fun box() = if(stringConcat(3) == "LOL LOL LOL ") "OK" else "fail"

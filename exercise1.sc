def concatenate(string: String, numberOfTimes: Int): String = {

  def loop(accString: String, number: Int): String = {
    if (number > numberOfTimes) accString

    else loop(accString + string, number + 1)
  }

  if (numberOfTimes <= 1) string
  else loop(string, 2)
}

concatenate("a", 4)

def length(string: String): Int = {
  ???

  def loop(index: Int): Int = {
    if (try {
      string(index)
      false
    } catch {
      case e: StringIndexOutOfBoundsException => true
    }) index
    else loop(index + 1)
  }
  loop(0)
}

length("Zenas")
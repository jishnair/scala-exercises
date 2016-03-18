

val l = List(1.0, 2.0, 4.0)
def product(ds: List[Double]): Double = ds match {
  case Nil => 1.0
  case 0.0 :: _ => 0.0
  case x :: xs => x * product(xs)
}

val a = List(1, 2, 3, 4)
//***********************************************
//remove the last element of a list
def init[A](l: List[A]): List[A] = l match {
  case Nil => Nil
  case _ :: Nil => Nil
  case x :: xs => x :: init(xs)
}

init(a)


//**********************************************

//product using foldRight

def product2(l: List[Double]): Double =
  l.foldRight(1.0) ((x,y)=>x*y)


product(l)

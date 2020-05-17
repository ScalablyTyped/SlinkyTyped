package typingsSlinky.yeomanGenerator.mod

import typingsSlinky.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.yeomanGenerator.mod.Question[A]
  - js.Array[typingsSlinky.yeomanGenerator.mod.Question[A]]
  - typingsSlinky.rxjs.mod.Observable_[typingsSlinky.yeomanGenerator.mod.Question[A]]
*/
trait Questions[A /* <: Answers */] extends js.Object

object Questions {
  @scala.inline
  implicit def apply[A](value: js.Array[Question[A]]): Questions[A] = value.asInstanceOf[Questions[A]]
  @scala.inline
  implicit def apply[A](value: Observable_[Question[A]]): Questions[A] = value.asInstanceOf[Questions[A]]
  @scala.inline
  implicit def apply[A](value: Question[A]): Questions[A] = value.asInstanceOf[Questions[A]]
}


package typingsSlinky.yup.mod

import typingsSlinky.std.Record
import typingsSlinky.yup.anon.PartialTestMessageParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Function1[/ * params * / Extra with typingsSlinky.yup.anon.PartialTestMessageParams, R]
*/
trait TestOptionsMessage[Extra /* <: Record[String, _] */, R] extends js.Object

object TestOptionsMessage {
  @scala.inline
  implicit def apply[Extra, R](value: js.Function1[/* params */ Extra with PartialTestMessageParams, R]): TestOptionsMessage[Extra, R] = value.asInstanceOf[TestOptionsMessage[Extra, R]]
  @scala.inline
  implicit def apply[Extra, R](value: String): TestOptionsMessage[Extra, R] = value.asInstanceOf[TestOptionsMessage[Extra, R]]
}


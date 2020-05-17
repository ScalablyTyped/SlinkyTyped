package typingsSlinky.yup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Function1[/ * params * / typingsSlinky.yup.mod.FormatErrorParams, java.lang.String]
*/
trait LocaleValue extends js.Object

object LocaleValue {
  @scala.inline
  implicit def apply(value: js.Function1[/* params */ FormatErrorParams, String]): LocaleValue = value.asInstanceOf[LocaleValue]
  @scala.inline
  implicit def apply(value: String): LocaleValue = value.asInstanceOf[LocaleValue]
}


package typingsSlinky.toMarkdown.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
  - js.Function1[/ * node * / typingsSlinky.std.HTMLElement, scala.Boolean]
*/
trait Filter extends js.Object

object Filter {
  @scala.inline
  implicit def apply(value: js.Array[String]): Filter = value.asInstanceOf[Filter]
  @scala.inline
  implicit def apply(value: js.Function1[/* node */ HTMLElement, Boolean]): Filter = value.asInstanceOf[Filter]
  @scala.inline
  implicit def apply(value: String): Filter = value.asInstanceOf[Filter]
}


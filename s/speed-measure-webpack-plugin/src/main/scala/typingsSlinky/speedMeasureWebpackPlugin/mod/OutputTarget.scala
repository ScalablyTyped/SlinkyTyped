package typingsSlinky.speedMeasureWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Function2[/ * output * / java.lang.String, / * repeated * / js.Any, scala.Unit]
*/
trait OutputTarget extends js.Object

object OutputTarget {
  @scala.inline
  implicit def apply(value: js.Function2[/* output */ String, /* repeated */ js.Any, Unit]): OutputTarget = value.asInstanceOf[OutputTarget]
  @scala.inline
  implicit def apply(value: String): OutputTarget = value.asInstanceOf[OutputTarget]
}


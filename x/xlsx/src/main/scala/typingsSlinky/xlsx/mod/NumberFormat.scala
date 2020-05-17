package typingsSlinky.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
*/
trait NumberFormat extends js.Object

object NumberFormat {
  @scala.inline
  implicit def apply(value: Double): NumberFormat = value.asInstanceOf[NumberFormat]
  @scala.inline
  implicit def apply(value: String): NumberFormat = value.asInstanceOf[NumberFormat]
}


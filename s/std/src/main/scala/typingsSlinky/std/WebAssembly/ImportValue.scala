package typingsSlinky.std.WebAssembly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.WebAssembly.ExportValue
  - scala.Double
*/
trait ImportValue extends js.Object

object ImportValue {
  @scala.inline
  implicit def apply(value: Double): ImportValue = value.asInstanceOf[ImportValue]
  @scala.inline
  implicit def apply(value: ExportValue): ImportValue = value.asInstanceOf[ImportValue]
}


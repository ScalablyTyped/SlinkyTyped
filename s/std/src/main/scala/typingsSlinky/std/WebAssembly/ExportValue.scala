package typingsSlinky.std.WebAssembly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function
  - typingsSlinky.std.WebAssembly.Global
  - typingsSlinky.std.WebAssembly.Memory
  - typingsSlinky.std.WebAssembly.Table
*/
trait ExportValue extends ImportValue

object ExportValue {
  @scala.inline
  implicit def apply(value: js.Function): ExportValue = value.asInstanceOf[ExportValue]
  @scala.inline
  implicit def apply(value: Global): ExportValue = value.asInstanceOf[ExportValue]
  @scala.inline
  implicit def apply(value: Memory): ExportValue = value.asInstanceOf[ExportValue]
  @scala.inline
  implicit def apply(value: Table): ExportValue = value.asInstanceOf[ExportValue]
}


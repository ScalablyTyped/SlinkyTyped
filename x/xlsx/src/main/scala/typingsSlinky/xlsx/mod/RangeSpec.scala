package typingsSlinky.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.xlsx.mod.Range
  - typingsSlinky.xlsx.mod.CellAddress
*/
trait RangeSpec extends js.Object

object RangeSpec {
  @scala.inline
  implicit def apply(value: CellAddress): RangeSpec = value.asInstanceOf[RangeSpec]
  @scala.inline
  implicit def apply(value: Range): RangeSpec = value.asInstanceOf[RangeSpec]
  @scala.inline
  implicit def apply(value: String): RangeSpec = value.asInstanceOf[RangeSpec]
}


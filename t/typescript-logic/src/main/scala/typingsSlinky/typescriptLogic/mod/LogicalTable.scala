package typingsSlinky.typescriptLogic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - nAnB
  - nAB
  - AnB
  - AB
*/
trait LogicalTable[A /* <: Boolean */, B /* <: Boolean */, AB, AnB, nAB, nAnB] extends js.Object

object LogicalTable {
  @scala.inline
  implicit def apply[A, B, AB, AnB, nAB, nAnB](value: AB | AnB | nAB | nAnB): LogicalTable[A, B, AB, AnB, nAB, nAnB] = value.asInstanceOf[LogicalTable[A, B, AB, AnB, nAB, nAnB]]
}


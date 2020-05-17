package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.AdditiveOperatorOrHigher
  - typingsSlinky.typescript.mod.ShiftOperator
*/
trait ShiftOperatorOrHigher extends RelationalOperatorOrHigher

object ShiftOperatorOrHigher {
  @scala.inline
  implicit def apply(value: AdditiveOperatorOrHigher): ShiftOperatorOrHigher = value.asInstanceOf[ShiftOperatorOrHigher]
  @scala.inline
  implicit def apply(value: ShiftOperator): ShiftOperatorOrHigher = value.asInstanceOf[ShiftOperatorOrHigher]
}


package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.ShiftOperatorOrHigher
  - typingsSlinky.typescript.mod.RelationalOperator
*/
trait RelationalOperatorOrHigher extends EqualityOperatorOrHigher

object RelationalOperatorOrHigher {
  @scala.inline
  implicit def apply(value: RelationalOperator): RelationalOperatorOrHigher = value.asInstanceOf[RelationalOperatorOrHigher]
  @scala.inline
  implicit def apply(value: ShiftOperatorOrHigher): RelationalOperatorOrHigher = value.asInstanceOf[RelationalOperatorOrHigher]
}


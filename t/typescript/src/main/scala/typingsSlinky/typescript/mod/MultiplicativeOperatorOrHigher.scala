package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.ExponentiationOperator
  - typingsSlinky.typescript.mod.MultiplicativeOperator
*/
trait MultiplicativeOperatorOrHigher extends AdditiveOperatorOrHigher

object MultiplicativeOperatorOrHigher {
  @scala.inline
  implicit def apply(value: ExponentiationOperator): MultiplicativeOperatorOrHigher = value.asInstanceOf[MultiplicativeOperatorOrHigher]
  @scala.inline
  implicit def apply(value: MultiplicativeOperator): MultiplicativeOperatorOrHigher = value.asInstanceOf[MultiplicativeOperatorOrHigher]
}


package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.MultiplicativeOperatorOrHigher
  - typingsSlinky.typescript.mod.AdditiveOperator
*/
trait AdditiveOperatorOrHigher extends ShiftOperatorOrHigher

object AdditiveOperatorOrHigher {
  @scala.inline
  implicit def apply(value: AdditiveOperator): AdditiveOperatorOrHigher = value.asInstanceOf[AdditiveOperatorOrHigher]
  @scala.inline
  implicit def apply(value: MultiplicativeOperatorOrHigher): AdditiveOperatorOrHigher = value.asInstanceOf[AdditiveOperatorOrHigher]
}


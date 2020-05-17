package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.EqualityOperatorOrHigher
  - typingsSlinky.typescript.mod.BitwiseOperator
*/
trait BitwiseOperatorOrHigher extends LogicalOperatorOrHigher

object BitwiseOperatorOrHigher {
  @scala.inline
  implicit def apply(value: BitwiseOperator): BitwiseOperatorOrHigher = value.asInstanceOf[BitwiseOperatorOrHigher]
  @scala.inline
  implicit def apply(value: EqualityOperatorOrHigher): BitwiseOperatorOrHigher = value.asInstanceOf[BitwiseOperatorOrHigher]
}


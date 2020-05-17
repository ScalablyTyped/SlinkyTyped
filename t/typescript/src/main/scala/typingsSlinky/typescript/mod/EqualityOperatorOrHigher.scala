package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.RelationalOperatorOrHigher
  - typingsSlinky.typescript.mod.EqualityOperator
*/
trait EqualityOperatorOrHigher extends BitwiseOperatorOrHigher

object EqualityOperatorOrHigher {
  @scala.inline
  implicit def apply(value: EqualityOperator): EqualityOperatorOrHigher = value.asInstanceOf[EqualityOperatorOrHigher]
  @scala.inline
  implicit def apply(value: RelationalOperatorOrHigher): EqualityOperatorOrHigher = value.asInstanceOf[EqualityOperatorOrHigher]
}


package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.ThisTypePredicate
  - typingsSlinky.typescript.mod.IdentifierTypePredicate
  - typingsSlinky.typescript.mod.AssertsThisTypePredicate
  - typingsSlinky.typescript.mod.AssertsIdentifierTypePredicate
*/
trait TypePredicate extends js.Object

object TypePredicate {
  @scala.inline
  implicit def apply(value: AssertsIdentifierTypePredicate): TypePredicate = value.asInstanceOf[TypePredicate]
  @scala.inline
  implicit def apply(value: AssertsThisTypePredicate): TypePredicate = value.asInstanceOf[TypePredicate]
  @scala.inline
  implicit def apply(value: IdentifierTypePredicate): TypePredicate = value.asInstanceOf[TypePredicate]
  @scala.inline
  implicit def apply(value: ThisTypePredicate): TypePredicate = value.asInstanceOf[TypePredicate]
}


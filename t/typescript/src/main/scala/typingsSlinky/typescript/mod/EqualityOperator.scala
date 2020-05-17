package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.EqualsEqualsEqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.EqualsEqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.ExclamationEqualsEqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.ExclamationEqualsToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.SyntaxKind.EqualsEqualsToken
  - typingsSlinky.typescript.mod.SyntaxKind.EqualsEqualsEqualsToken
  - typingsSlinky.typescript.mod.SyntaxKind.ExclamationEqualsEqualsToken
  - typingsSlinky.typescript.mod.SyntaxKind.ExclamationEqualsToken
*/
trait EqualityOperator extends EqualityOperatorOrHigher

object EqualityOperator {
  @scala.inline
  implicit def apply(value: EqualsEqualsEqualsToken): EqualityOperator = value.asInstanceOf[EqualityOperator]
  @scala.inline
  implicit def apply(value: EqualsEqualsToken): EqualityOperator = value.asInstanceOf[EqualityOperator]
  @scala.inline
  implicit def apply(value: ExclamationEqualsEqualsToken): EqualityOperator = value.asInstanceOf[EqualityOperator]
  @scala.inline
  implicit def apply(value: ExclamationEqualsToken): EqualityOperator = value.asInstanceOf[EqualityOperator]
}


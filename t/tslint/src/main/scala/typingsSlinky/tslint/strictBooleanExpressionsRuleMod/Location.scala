package typingsSlinky.tslint.strictBooleanExpressionsRuleMod

import typingsSlinky.typescript.mod.BinaryExpression
import typingsSlinky.typescript.mod.ConditionalExpression
import typingsSlinky.typescript.mod.DoStatement
import typingsSlinky.typescript.mod.ForStatement
import typingsSlinky.typescript.mod.IfStatement
import typingsSlinky.typescript.mod.PrefixUnaryExpression
import typingsSlinky.typescript.mod.WhileStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.PrefixUnaryExpression
  - typingsSlinky.typescript.mod.IfStatement
  - typingsSlinky.typescript.mod.WhileStatement
  - typingsSlinky.typescript.mod.DoStatement
  - typingsSlinky.typescript.mod.ForStatement
  - typingsSlinky.typescript.mod.ConditionalExpression
  - typingsSlinky.typescript.mod.BinaryExpression
*/
trait Location extends js.Object

object Location {
  @scala.inline
  implicit def apply(value: BinaryExpression): Location = value.asInstanceOf[Location]
  @scala.inline
  implicit def apply(value: ConditionalExpression): Location = value.asInstanceOf[Location]
  @scala.inline
  implicit def apply(value: DoStatement): Location = value.asInstanceOf[Location]
  @scala.inline
  implicit def apply(value: ForStatement): Location = value.asInstanceOf[Location]
  @scala.inline
  implicit def apply(value: IfStatement): Location = value.asInstanceOf[Location]
  @scala.inline
  implicit def apply(value: PrefixUnaryExpression): Location = value.asInstanceOf[Location]
  @scala.inline
  implicit def apply(value: WhileStatement): Location = value.asInstanceOf[Location]
}


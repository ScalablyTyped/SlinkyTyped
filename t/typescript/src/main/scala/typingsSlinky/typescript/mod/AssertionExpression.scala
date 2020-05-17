package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.TypeAssertion
  - typingsSlinky.typescript.mod.AsExpression
*/
trait AssertionExpression extends HasType

object AssertionExpression {
  @scala.inline
  implicit def apply(value: AsExpression): AssertionExpression = value.asInstanceOf[AssertionExpression]
  @scala.inline
  implicit def apply(value: TypeAssertion): AssertionExpression = value.asInstanceOf[AssertionExpression]
}


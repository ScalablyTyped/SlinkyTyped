package typingsSlinky.sparqljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sparqljs.mod.OperationExpression
  - typingsSlinky.sparqljs.mod.FunctionCallExpression
  - typingsSlinky.sparqljs.mod.AggregateExpression
  - typingsSlinky.sparqljs.mod.BgpPattern
  - typingsSlinky.sparqljs.mod.GroupPattern
  - typingsSlinky.sparqljs.mod.Tuple
  - typingsSlinky.sparqljs.mod.Term
*/
trait Expression extends js.Object

object Expression {
  @scala.inline
  implicit def apply(value: AggregateExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: BgpPattern): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: FunctionCallExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: GroupPattern): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: OperationExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: Term): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: Tuple): Expression = value.asInstanceOf[Expression]
}


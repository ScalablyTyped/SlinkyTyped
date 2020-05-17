package typingsSlinky.sparqljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sparqljs.mod.VariableExpression
  - typingsSlinky.sparqljs.mod.Term
*/
trait Variable extends js.Object

object Variable {
  @scala.inline
  implicit def apply(value: Term): Variable = value.asInstanceOf[Variable]
  @scala.inline
  implicit def apply(value: VariableExpression): Variable = value.asInstanceOf[Variable]
}


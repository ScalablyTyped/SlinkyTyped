package typingsSlinky.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tableau.tableau.CategoricalFilter
  - typingsSlinky.tableau.tableau.QuantitativeFilter
  - typingsSlinky.tableau.tableau.RelativeDateFilter
*/
trait ConcreteFilter extends js.Object

object ConcreteFilter {
  @scala.inline
  implicit def apply(value: CategoricalFilter): ConcreteFilter = value.asInstanceOf[ConcreteFilter]
  @scala.inline
  implicit def apply(value: QuantitativeFilter): ConcreteFilter = value.asInstanceOf[ConcreteFilter]
  @scala.inline
  implicit def apply(value: RelativeDateFilter): ConcreteFilter = value.asInstanceOf[ConcreteFilter]
}


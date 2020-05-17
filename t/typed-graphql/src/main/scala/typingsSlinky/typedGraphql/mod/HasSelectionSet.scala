package typingsSlinky.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typedGraphql.mod.OperationDefinition
  - typingsSlinky.typedGraphql.mod.FragmentDefinition
*/
trait HasSelectionSet extends js.Object

object HasSelectionSet {
  @scala.inline
  implicit def apply(value: FragmentDefinition): HasSelectionSet = value.asInstanceOf[HasSelectionSet]
  @scala.inline
  implicit def apply(value: OperationDefinition): HasSelectionSet = value.asInstanceOf[HasSelectionSet]
}


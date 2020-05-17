package typingsSlinky.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typedGraphql.mod.OperationDefinition
  - typingsSlinky.typedGraphql.mod.FragmentDefinition
  - typingsSlinky.typedGraphql.mod.TypeDefinition
*/
trait Definition extends js.Object

object Definition {
  @scala.inline
  implicit def apply(value: FragmentDefinition): Definition = value.asInstanceOf[Definition]
  @scala.inline
  implicit def apply(value: OperationDefinition): Definition = value.asInstanceOf[Definition]
  @scala.inline
  implicit def apply(value: TypeDefinition): Definition = value.asInstanceOf[Definition]
}


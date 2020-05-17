package typingsSlinky.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typedGraphql.mod.Field
  - typingsSlinky.typedGraphql.mod.FragmentSpread
  - typingsSlinky.typedGraphql.mod.InlineFragment
*/
trait Selection extends js.Object

object Selection {
  @scala.inline
  implicit def apply(value: Field): Selection = value.asInstanceOf[Selection]
  @scala.inline
  implicit def apply(value: FragmentSpread): Selection = value.asInstanceOf[Selection]
  @scala.inline
  implicit def apply(value: InlineFragment): Selection = value.asInstanceOf[Selection]
}


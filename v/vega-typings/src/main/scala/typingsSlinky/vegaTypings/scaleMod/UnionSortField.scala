package typingsSlinky.vegaTypings.scaleMod

import typingsSlinky.vegaTypings.anon.FieldOp
import typingsSlinky.vegaTypings.anon.OpOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typingsSlinky.vegaTypings.anon.OpOrder
  - typingsSlinky.vegaTypings.anon.FieldOp
*/
trait UnionSortField extends js.Object

object UnionSortField {
  @scala.inline
  implicit def apply(value: Boolean): UnionSortField = value.asInstanceOf[UnionSortField]
  @scala.inline
  implicit def apply(value: FieldOp): UnionSortField = value.asInstanceOf[UnionSortField]
  @scala.inline
  implicit def apply(value: OpOrder): UnionSortField = value.asInstanceOf[UnionSortField]
}


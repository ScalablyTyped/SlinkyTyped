package typingsSlinky.sparqljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sparqljs.mod.InsertDeleteOperation
  - typingsSlinky.sparqljs.mod.ManagementOperation
*/
trait UpdateOperation extends js.Object

object UpdateOperation {
  @scala.inline
  implicit def apply(value: InsertDeleteOperation): UpdateOperation = value.asInstanceOf[UpdateOperation]
  @scala.inline
  implicit def apply(value: ManagementOperation): UpdateOperation = value.asInstanceOf[UpdateOperation]
}


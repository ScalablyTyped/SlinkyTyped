package typingsSlinky.sparqljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sparqljs.mod.CopyMoveAddOperation
  - typingsSlinky.sparqljs.mod.LoadOperation
  - typingsSlinky.sparqljs.mod.CreateOperation
  - typingsSlinky.sparqljs.mod.ClearDropOperation
*/
trait ManagementOperation extends UpdateOperation

object ManagementOperation {
  @scala.inline
  implicit def apply(value: ClearDropOperation): ManagementOperation = value.asInstanceOf[ManagementOperation]
  @scala.inline
  implicit def apply(value: CopyMoveAddOperation): ManagementOperation = value.asInstanceOf[ManagementOperation]
  @scala.inline
  implicit def apply(value: CreateOperation): ManagementOperation = value.asInstanceOf[ManagementOperation]
  @scala.inline
  implicit def apply(value: LoadOperation): ManagementOperation = value.asInstanceOf[ManagementOperation]
}


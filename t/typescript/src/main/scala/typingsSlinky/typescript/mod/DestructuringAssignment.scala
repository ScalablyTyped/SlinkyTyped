package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.ObjectDestructuringAssignment
  - typingsSlinky.typescript.mod.ArrayDestructuringAssignment
*/
trait DestructuringAssignment extends js.Object

object DestructuringAssignment {
  @scala.inline
  implicit def apply(value: ArrayDestructuringAssignment): DestructuringAssignment = value.asInstanceOf[DestructuringAssignment]
  @scala.inline
  implicit def apply(value: ObjectDestructuringAssignment): DestructuringAssignment = value.asInstanceOf[DestructuringAssignment]
}


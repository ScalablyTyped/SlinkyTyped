package typingsSlinky.undertaker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.undertaker.mod.TaskFunction
*/
trait Task extends js.Object

object Task {
  @scala.inline
  implicit def apply(value: String): Task = value.asInstanceOf[Task]
  @scala.inline
  implicit def apply(value: TaskFunction): Task = value.asInstanceOf[Task]
}


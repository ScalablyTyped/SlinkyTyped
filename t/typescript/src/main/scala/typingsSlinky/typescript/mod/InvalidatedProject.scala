package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.UpdateOutputFileStampsProject
  - typingsSlinky.typescript.mod.BuildInvalidedProject[T]
  - typingsSlinky.typescript.mod.UpdateBundleProject[T]
*/
trait InvalidatedProject[T /* <: BuilderProgram */] extends js.Object

object InvalidatedProject {
  @scala.inline
  implicit def apply[T](value: BuildInvalidedProject[T]): InvalidatedProject[T] = value.asInstanceOf[InvalidatedProject[T]]
  @scala.inline
  implicit def apply[T](value: UpdateBundleProject[T]): InvalidatedProject[T] = value.asInstanceOf[InvalidatedProject[T]]
  @scala.inline
  implicit def apply[T](value: UpdateOutputFileStampsProject): InvalidatedProject[T] = value.asInstanceOf[InvalidatedProject[T]]
}


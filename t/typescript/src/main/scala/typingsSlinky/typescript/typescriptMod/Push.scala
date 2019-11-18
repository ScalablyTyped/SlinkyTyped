package typingsSlinky.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Array that is only intended to be pushed to, never read. */
trait Push[T] extends js.Object {
  def push(values: T*): Unit
}

object Push {
  @scala.inline
  def apply[T](push: /* repeated */ T => Unit): Push[T] = {
    val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
  
    __obj.asInstanceOf[Push[T]]
  }
}


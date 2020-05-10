package typingsSlinky.typedoc.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecoratorsContainer[T] extends js.Object {
  var decorators: js.Array[T] = js.native
}

object DecoratorsContainer {
  @scala.inline
  def apply[T](decorators: js.Array[T]): DecoratorsContainer[T] = {
    val __obj = js.Dynamic.literal(decorators = decorators.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecoratorsContainer[T]]
  }
  @scala.inline
  implicit class DecoratorsContainerOps[Self[t] <: DecoratorsContainer[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDecorators(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorators")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


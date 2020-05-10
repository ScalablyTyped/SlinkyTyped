package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReadable[R, T] extends js.Object {
  var readable: org.scalajs.dom.experimental.ReadableStream[T] = js.native
  var writable: WritableStream[R] = js.native
}

object AnonReadable {
  @scala.inline
  def apply[R, T](readable: org.scalajs.dom.experimental.ReadableStream[T], writable: WritableStream[R]): AnonReadable[R, T] = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReadable[R, T]]
  }
  @scala.inline
  implicit class AnonReadableOps[Self[r, t] <: AnonReadable[r, t], R, T] (val x: Self[R, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[R, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[R, T]) with Other]
    @scala.inline
    def withReadable(value: org.scalajs.dom.experimental.ReadableStream[T]): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWritable(value: WritableStream[R]): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


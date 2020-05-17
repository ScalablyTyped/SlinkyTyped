package typingsSlinky.std.anon

import org.scalajs.dom.experimental.ReadableStream
import typingsSlinky.std.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Readable[R, T] extends js.Object {
  var readable: ReadableStream[T] = js.native
  var writable: WritableStream[R] = js.native
}

object Readable {
  @scala.inline
  def apply[R, T](readable: ReadableStream[T], writable: WritableStream[R]): Readable[R, T] = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readable[R, T]]
  }
  @scala.inline
  implicit class ReadableOps[Self[r, t] <: Readable[r, t], R, T] (val x: Self[R, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[R, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[R, T]) with Other]
    @scala.inline
    def withReadable(value: ReadableStream[T]): Self[R, T] = {
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


package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformStream[I, O] extends js.Object {
  val readable: org.scalajs.dom.experimental.ReadableStream[O] = js.native
  val writable: WritableStream[I] = js.native
}

object TransformStream {
  @scala.inline
  def apply[I, O](readable: org.scalajs.dom.experimental.ReadableStream[O], writable: WritableStream[I]): TransformStream[I, O] = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformStream[I, O]]
  }
  @scala.inline
  implicit class TransformStreamOps[Self[i, o] <: TransformStream[i, o], I, O] (val x: Self[I, O]) extends AnyVal {
    @scala.inline
    def duplicate: Self[I, O] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[I, O]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[I, O]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[I, O]) with Other]
    @scala.inline
    def withReadable(value: org.scalajs.dom.experimental.ReadableStream[O]): Self[I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWritable(value: WritableStream[I]): Self[I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


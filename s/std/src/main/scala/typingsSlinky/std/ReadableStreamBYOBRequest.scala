package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadableStreamBYOBRequest extends js.Object {
  val view: js.typedarray.ArrayBufferView = js.native
  def respond(bytesWritten: Double): Unit = js.native
  def respondWithNewView(view: js.typedarray.ArrayBufferView): Unit = js.native
}

object ReadableStreamBYOBRequest {
  @scala.inline
  def apply(
    respond: Double => Unit,
    respondWithNewView: js.typedarray.ArrayBufferView => Unit,
    view: js.typedarray.ArrayBufferView
  ): ReadableStreamBYOBRequest = {
    val __obj = js.Dynamic.literal(respond = js.Any.fromFunction1(respond), respondWithNewView = js.Any.fromFunction1(respondWithNewView), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableStreamBYOBRequest]
  }
  @scala.inline
  implicit class ReadableStreamBYOBRequestOps[Self <: ReadableStreamBYOBRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRespond(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respond")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRespondWithNewView(value: js.typedarray.ArrayBufferView => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respondWithNewView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withView(value: js.typedarray.ArrayBufferView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


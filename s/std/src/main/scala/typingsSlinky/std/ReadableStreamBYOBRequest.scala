package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableStreamBYOBRequest extends js.Object {
  val view: scala.scalajs.js.typedarray.ArrayBufferView
  def respond(bytesWritten: Double): Unit
  def respondWithNewView(view: scala.scalajs.js.typedarray.ArrayBufferView): Unit
}

object ReadableStreamBYOBRequest {
  @scala.inline
  def apply(
    respond: Double => Unit,
    respondWithNewView: scala.scalajs.js.typedarray.ArrayBufferView => Unit,
    view: scala.scalajs.js.typedarray.ArrayBufferView
  ): ReadableStreamBYOBRequest = {
    val __obj = js.Dynamic.literal(respond = js.Any.fromFunction1(respond), respondWithNewView = js.Any.fromFunction1(respondWithNewView), view = view.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadableStreamBYOBRequest]
  }
}


package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  val body: org.scalajs.dom.experimental.ReadableStream[scala.scalajs.js.typedarray.Uint8Array] | Null
  val bodyUsed: scala.Boolean
  def arrayBuffer(): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer]
  def blob(): js.Promise[org.scalajs.dom.raw.Blob]
  def formData(): js.Promise[org.scalajs.dom.raw.FormData]
  def json(): js.Promise[_]
  def text(): js.Promise[java.lang.String]
}

object Body {
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[scala.scalajs.js.typedarray.ArrayBuffer],
    blob: () => js.Promise[org.scalajs.dom.raw.Blob],
    bodyUsed: scala.Boolean,
    formData: () => js.Promise[org.scalajs.dom.raw.FormData],
    json: () => js.Promise[_],
    text: () => js.Promise[java.lang.String],
    body: org.scalajs.dom.experimental.ReadableStream[scala.scalajs.js.typedarray.Uint8Array] = null
  ): Body = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text))
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}


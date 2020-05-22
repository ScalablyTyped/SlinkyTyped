package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Fetch API interface represents the response to a request. */
trait Response extends Body {
  val headers: org.scalajs.dom.experimental.Headers
  val ok: scala.Boolean
  val redirected: scala.Boolean
  val status: Double
  val statusText: java.lang.String
  val trailer: js.Promise[org.scalajs.dom.experimental.Headers]
  val `type`: org.scalajs.dom.experimental.ResponseType
  val url: java.lang.String
}

object Response {
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
    blob: () => js.Promise[org.scalajs.dom.raw.Blob],
    bodyUsed: scala.Boolean,
    formData: () => js.Promise[org.scalajs.dom.raw.FormData],
    headers: org.scalajs.dom.experimental.Headers,
    json: () => js.Promise[_],
    ok: scala.Boolean,
    redirected: scala.Boolean,
    status: Double,
    statusText: java.lang.String,
    text: () => js.Promise[java.lang.String],
    trailer: js.Promise[org.scalajs.dom.experimental.Headers],
    `type`: org.scalajs.dom.experimental.ResponseType,
    url: java.lang.String,
    body: org.scalajs.dom.experimental.ReadableStream[js.typedarray.Uint8Array] = null
  ): Response = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), trailer = trailer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}


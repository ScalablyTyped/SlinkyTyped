package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Response")
@js.native
class ResponseCls () extends Response {
  def this(body: BodyInit) = this()
  def this(body: Null, init: org.scalajs.dom.experimental.ResponseInit) = this()
  def this(body: BodyInit, init: org.scalajs.dom.experimental.ResponseInit) = this()
  /* CompleteClass */
  override val body: org.scalajs.dom.experimental.ReadableStream[scala.scalajs.js.typedarray.Uint8Array] | Null = js.native
  /* CompleteClass */
  override val bodyUsed: scala.Boolean = js.native
  /* CompleteClass */
  override val headers: org.scalajs.dom.experimental.Headers = js.native
  /* CompleteClass */
  override val ok: scala.Boolean = js.native
  /* CompleteClass */
  override val redirected: scala.Boolean = js.native
  /* CompleteClass */
  override val status: Double = js.native
  /* CompleteClass */
  override val statusText: java.lang.String = js.native
  /* CompleteClass */
  override val trailer: js.Promise[org.scalajs.dom.experimental.Headers] = js.native
  /* CompleteClass */
  override val `type`: org.scalajs.dom.experimental.ResponseType = js.native
  /* CompleteClass */
  override val url: java.lang.String = js.native
  /* CompleteClass */
  override def arrayBuffer(): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  /* CompleteClass */
  override def blob(): js.Promise[org.scalajs.dom.raw.Blob] = js.native
  /* CompleteClass */
  override def formData(): js.Promise[org.scalajs.dom.raw.FormData] = js.native
  /* CompleteClass */
  override def json(): js.Promise[_] = js.native
  /* CompleteClass */
  override def text(): js.Promise[java.lang.String] = js.native
}


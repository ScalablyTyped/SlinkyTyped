package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Fetch API interface represents the response to a request. */
@js.native
trait Response extends Body {
  val headers: org.scalajs.dom.experimental.Headers = js.native
  val ok: scala.Boolean = js.native
  val redirected: scala.Boolean = js.native
  val status: Double = js.native
  val statusText: java.lang.String = js.native
  val trailer: js.Promise[org.scalajs.dom.experimental.Headers] = js.native
  val `type`: org.scalajs.dom.experimental.ResponseType = js.native
  val url: java.lang.String = js.native
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
    url: java.lang.String
  ): Response = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), trailer = trailer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: org.scalajs.dom.experimental.Response] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaders(value: org.scalajs.dom.experimental.Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOk(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ok")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirected(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusText(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrailer(value: js.Promise[org.scalajs.dom.experimental.Headers]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: org.scalajs.dom.experimental.ResponseType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


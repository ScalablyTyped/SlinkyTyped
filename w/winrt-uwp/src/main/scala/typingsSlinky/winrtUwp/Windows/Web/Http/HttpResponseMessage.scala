package typingsSlinky.winrtUwp.Windows.Web.Http

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpResponseHeaderCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an HTTP response message including headers, the status code, and data. */
@js.native
trait HttpResponseMessage extends js.Object {
  /** Gets or sets the content of the HTTP response message on the HttpResponseMessage object. */
  var content: IHttpContent = js.native
  /** Gets the collection of HTTP response headers associated with the HttpResponseMessage that were sent by the server. */
  var headers: HttpResponseHeaderCollection = js.native
  /** Gets a value that indicates whether the HTTP response was successful. */
  var isSuccessStatusCode: Boolean = js.native
  /** Gets or sets the reason phrase which typically is sent by servers together with the status code. */
  var reasonPhrase: String = js.native
  /** Gets or sets the request message which led to this response message. */
  var requestMessage: HttpRequestMessage = js.native
  /** Gets the source of the data received in the HttpResponseMessage . */
  var source: HttpResponseMessageSource = js.native
  /** Gets or sets the status code of the HTTP response. */
  var statusCode: HttpStatusCode = js.native
  /** Gets or sets the HTTP protocol version used on the HttpResponseMessage object. */
  var version: HttpVersion = js.native
  /** Closes the HttpResponseMessage instance and releases allocated resources. */
  def close(): Unit = js.native
  /**
    * Throws an exception if the IsSuccessStatusCode property for the HTTP response is false.
    * @return The HTTP response if the request was successful.
    */
  def ensureSuccessStatusCode(): HttpResponseMessage = js.native
}

object HttpResponseMessage {
  @scala.inline
  def apply(
    close: () => Unit,
    content: IHttpContent,
    ensureSuccessStatusCode: () => HttpResponseMessage,
    headers: HttpResponseHeaderCollection,
    isSuccessStatusCode: Boolean,
    reasonPhrase: String,
    requestMessage: HttpRequestMessage,
    source: HttpResponseMessageSource,
    statusCode: HttpStatusCode,
    version: HttpVersion
  ): HttpResponseMessage = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), content = content.asInstanceOf[js.Any], ensureSuccessStatusCode = js.Any.fromFunction0(ensureSuccessStatusCode), headers = headers.asInstanceOf[js.Any], isSuccessStatusCode = isSuccessStatusCode.asInstanceOf[js.Any], reasonPhrase = reasonPhrase.asInstanceOf[js.Any], requestMessage = requestMessage.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpResponseMessage]
  }
  @scala.inline
  implicit class HttpResponseMessageOps[Self <: HttpResponseMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContent(value: IHttpContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnsureSuccessStatusCode(value: () => HttpResponseMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ensureSuccessStatusCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeaders(value: HttpResponseHeaderCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSuccessStatusCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSuccessStatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReasonPhrase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonPhrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestMessage(value: HttpRequestMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: HttpResponseMessageSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: HttpStatusCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: HttpVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


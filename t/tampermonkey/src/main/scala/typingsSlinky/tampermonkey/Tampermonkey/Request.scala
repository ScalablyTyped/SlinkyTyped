package typingsSlinky.tampermonkey.Tampermonkey

import typingsSlinky.tampermonkey.tampermonkeyStrings.GET
import typingsSlinky.tampermonkey.tampermonkeyStrings.HEAD
import typingsSlinky.tampermonkey.tampermonkeyStrings.POST
import typingsSlinky.tampermonkey.tampermonkeyStrings.arraybuffer
import typingsSlinky.tampermonkey.tampermonkeyStrings.blob
import typingsSlinky.tampermonkey.tampermonkeyStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request[TContext] extends js.Object {
  /** Don't send cookies with the requests (please see the fetch notes) */
  var anonymous: js.UndefOr[Boolean] = js.native
  /** Send the data string in binary mode */
  var binary: js.UndefOr[Boolean] = js.native
  /** Property which will be added to the response object */
  var context: js.UndefOr[TContext] = js.native
  /** String to send via a POST request */
  var data: js.UndefOr[String] = js.native
  /**
    * (Beta) Use a fetch instead of a xhr request(at Chrome this causes
    * `xhr.abort`, `details.timeout` and `xhr.onprogress` to not work and
    * makes `xhr.onreadystatechange` receive only readyState 4 events)
    */
  var fetch: js.UndefOr[Boolean] = js.native
  /**
    * i.e. user-agent, referer... (some special headers are not supported
    * by Safari and Android browsers)
    */
  var headers: js.UndefOr[RequestHeaders] = js.native
  var method: js.UndefOr[GET | HEAD | POST] = js.native
  // Events
  /** Callback to be executed if the request was aborted */
  var onabort: js.UndefOr[js.Function0[Unit]] = js.native
  /** Callback to be executed if the request ended up with an error */
  var onerror: js.UndefOr[RequestEventListener[ErrorResponse]] = js.native
  /** Callback to be executed if the request was loaded */
  var onload: js.UndefOr[RequestEventListener[Response[TContext]]] = js.native
  /** Callback to be executed if the request started to load */
  var onloadstart: js.UndefOr[RequestEventListener[Response[TContext]]] = js.native
  /** Callback to be executed if the request made some progress */
  var onprogress: js.UndefOr[RequestEventListener[ProgressResponse[TContext]]] = js.native
  /** Callback to be executed if the request's ready state changed */
  var onreadystatechange: js.UndefOr[RequestEventListener[Response[TContext]]] = js.native
  /** Callback to be executed if the request failed due to a timeout */
  var ontimeout: js.UndefOr[js.Function0[Unit]] = js.native
  /** MIME type for the request */
  var overrideMimeType: js.UndefOr[String] = js.native
  var password: js.UndefOr[String] = js.native
  var responseType: js.UndefOr[arraybuffer | blob | json] = js.native
  /** Timeout in ms */
  var timeout: js.UndefOr[Double] = js.native
  /** Destination URL */
  var url: String = js.native
  /** Username for authentication */
  var username: js.UndefOr[String] = js.native
}

object Request {
  @scala.inline
  def apply[TContext](url: String): Request[TContext] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request[TContext]]
  }
  @scala.inline
  implicit class RequestOps[Self[tcontext] <: Request[tcontext], TContext] (val x: Self[TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TContext] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TContext] with Other]
    @scala.inline
    def withUrl(value: String): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnonymous(value: Boolean): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnonymous: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymous")(js.undefined)
        ret
    }
    @scala.inline
    def withBinary(value: Boolean): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinary: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: TContext): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: String): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withFetch(value: Boolean): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetch: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: RequestHeaders): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: GET | HEAD | POST): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withOnabort(value: () => Unit): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onabort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnabort: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onabort")(js.undefined)
        ret
    }
    @scala.inline
    def withOnerror(value: RequestEventListener[ErrorResponse]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnerror: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.undefined)
        ret
    }
    @scala.inline
    def withOnload(value: RequestEventListener[Response[TContext]]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnload: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(js.undefined)
        ret
    }
    @scala.inline
    def withOnloadstart(value: RequestEventListener[Response[TContext]]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloadstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnloadstart: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloadstart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnprogress(value: RequestEventListener[ProgressResponse[TContext]]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprogress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnprogress: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprogress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnreadystatechange(value: RequestEventListener[Response[TContext]]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onreadystatechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnreadystatechange: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onreadystatechange")(js.undefined)
        ret
    }
    @scala.inline
    def withOntimeout(value: () => Unit): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontimeout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOntimeout: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideMimeType(value: String): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideMimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideMimeType: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideMimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseType(value: arraybuffer | blob | json): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseType: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}


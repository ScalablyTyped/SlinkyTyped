package typingsSlinky.xhr.mod

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.xhr.xhrStrings.DELETE
import typingsSlinky.xhr.xhrStrings.GET
import typingsSlinky.xhr.xhrStrings.HEAD
import typingsSlinky.xhr.xhrStrings.OPTIONS
import typingsSlinky.xhr.xhrStrings.POST
import typingsSlinky.xhr.xhrStrings.PUT
import typingsSlinky.xhr.xhrStrings._empty
import typingsSlinky.xhr.xhrStrings.arraybuffer
import typingsSlinky.xhr.xhrStrings.blob
import typingsSlinky.xhr.xhrStrings.document
import typingsSlinky.xhr.xhrStrings.json
import typingsSlinky.xhr.xhrStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XhrUriConfig extends XhrBaseConfig {
  var uri: String
}

object XhrUriConfig {
  @scala.inline
  def apply(
    uri: String,
    beforeSend: /* xhrObject */ XMLHttpRequest => Unit = null,
    body: String | js.Any = null,
    headers: XhrHeaders = null,
    json: js.UndefOr[Boolean] = js.undefined,
    method: DELETE | GET | HEAD | OPTIONS | POST | PUT = null,
    password: String = null,
    responseType: _empty | arraybuffer | blob | document | json | text = null,
    sync: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    useXDR: js.UndefOr[Boolean] = js.undefined,
    username: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined,
    xhr: XMLHttpRequest = null
  ): XhrUriConfig = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction1(beforeSend))
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useXDR)) __obj.updateDynamic("useXDR")(useXDR.get.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.get.asInstanceOf[js.Any])
    if (xhr != null) __obj.updateDynamic("xhr")(xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[XhrUriConfig]
  }
}


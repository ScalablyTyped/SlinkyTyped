package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInit extends js.Object {
  /**
    * A BodyInit object or null to set request's body.
    */
  var body: js.UndefOr[BodyInit | Null] = js.undefined
  /**
    * A string indicating how the request will interact with the browser's cache to set request's cache.
    */
  var cache: js.UndefOr[org.scalajs.dom.experimental.RequestCache] = js.undefined
  /**
    * A string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL. Sets request's credentials.
    */
  var credentials: js.UndefOr[org.scalajs.dom.experimental.RequestCredentials] = js.undefined
  /**
    * A Headers object, an object literal, or an array of two-item arrays to set request's headers.
    */
  var headers: js.UndefOr[HeadersInit] = js.undefined
  /**
    * A cryptographic hash of the resource to be fetched by request. Sets request's integrity.
    */
  var integrity: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A boolean to set request's keepalive.
    */
  var keepalive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A string to set request's method.
    */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A string to indicate whether the request will use CORS, or will be restricted to same-origin URLs. Sets request's mode.
    */
  var mode: js.UndefOr[org.scalajs.dom.experimental.RequestMode] = js.undefined
  /**
    * A string indicating whether request follows redirects, results in an error upon encountering a redirect, or returns the redirect (in an opaque fashion). Sets request's redirect.
    */
  var redirect: js.UndefOr[org.scalajs.dom.experimental.RequestRedirect] = js.undefined
  /**
    * A string whose value is a same-origin URL, "about:client", or the empty string, to set request's referrer.
    */
  var referrer: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A referrer policy to set request's referrerPolicy.
    */
  var referrerPolicy: js.UndefOr[org.scalajs.dom.experimental.ReferrerPolicy] = js.undefined
  /**
    * An AbortSignal to set request's signal.
    */
  var signal: js.UndefOr[org.scalajs.dom.experimental.AbortSignal | Null] = js.undefined
  /**
    * Can only be null. Used to disassociate request from any Window.
    */
  var window: js.UndefOr[js.Any] = js.undefined
}

object RequestInit {
  @scala.inline
  def apply(
    body: js.UndefOr[Null | BodyInit] = js.undefined,
    cache: org.scalajs.dom.experimental.RequestCache = null,
    credentials: org.scalajs.dom.experimental.RequestCredentials = null,
    headers: HeadersInit = null,
    integrity: java.lang.String = null,
    keepalive: js.UndefOr[scala.Boolean] = js.undefined,
    method: java.lang.String = null,
    mode: org.scalajs.dom.experimental.RequestMode = null,
    redirect: org.scalajs.dom.experimental.RequestRedirect = null,
    referrer: java.lang.String = null,
    referrerPolicy: org.scalajs.dom.experimental.ReferrerPolicy = null,
    signal: js.UndefOr[Null | org.scalajs.dom.experimental.AbortSignal] = js.undefined,
    window: js.Any = null
  ): RequestInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(body)) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(signal)) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestInit]
  }
}


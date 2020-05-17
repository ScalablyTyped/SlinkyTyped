package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Fetch API interface represents a resource request. */
@js.native
trait Request
  extends Body
     with RequestInfo {
  /**
    * Returns the cache mode associated with request, which is a string indicating how the request will interact with the browser's cache when fetching.
    */
  val cache: org.scalajs.dom.experimental.RequestCache = js.native
  /**
    * Returns the credentials mode associated with request, which is a string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL.
    */
  val credentials: org.scalajs.dom.experimental.RequestCredentials = js.native
  /**
    * Returns the kind of resource requested by request, e.g., "document" or "script".
    */
  val destination: org.scalajs.dom.experimental.RequestDestination = js.native
  /**
    * Returns a Headers object consisting of the headers associated with request. Note that headers added in the network layer by the user agent will not be accounted for in this object, e.g., the "Host" header.
    */
  val headers: org.scalajs.dom.experimental.Headers = js.native
  /**
    * Returns request's subresource integrity metadata, which is a cryptographic hash of the resource being fetched. Its value consists of multiple hashes separated by whitespace. [SRI]
    */
  val integrity: java.lang.String = js.native
  /**
    * Returns a boolean indicating whether or not request is for a history navigation (a.k.a. back-foward navigation).
    */
  val isHistoryNavigation: scala.Boolean = js.native
  /**
    * Returns a boolean indicating whether or not request is for a reload navigation.
    */
  val isReloadNavigation: scala.Boolean = js.native
  /**
    * Returns a boolean indicating whether or not request can outlive the global in which it was created.
    */
  val keepalive: scala.Boolean = js.native
  /**
    * Returns request's HTTP method, which is "GET" by default.
    */
  val method: java.lang.String = js.native
  /**
    * Returns the mode associated with request, which is a string indicating whether the request will use CORS, or will be restricted to same-origin URLs.
    */
  val mode: org.scalajs.dom.experimental.RequestMode = js.native
  /**
    * Returns the redirect mode associated with request, which is a string indicating how redirects for the request will be handled during fetching. A request will follow redirects by default.
    */
  val redirect: org.scalajs.dom.experimental.RequestRedirect = js.native
  /**
    * Returns the referrer of request. Its value can be a same-origin URL if explicitly set in init, the empty string to indicate no referrer, and "about:client" when defaulting to the global's default. This is used during fetching to determine the value of the `Referer` header of the request being made.
    */
  val referrer: java.lang.String = js.native
  /**
    * Returns the referrer policy associated with request. This is used during fetching to compute the value of the request's referrer.
    */
  val referrerPolicy: org.scalajs.dom.experimental.ReferrerPolicy = js.native
  /**
    * Returns the signal associated with request, which is an AbortSignal object indicating whether or not request has been aborted, and its abort event handler.
    */
  val signal: org.scalajs.dom.experimental.AbortSignal = js.native
  /**
    * Returns the URL of request as a string.
    */
  val url: java.lang.String = js.native
}

object Request {
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
    blob: () => js.Promise[org.scalajs.dom.raw.Blob],
    bodyUsed: scala.Boolean,
    cache: org.scalajs.dom.experimental.RequestCache,
    credentials: org.scalajs.dom.experimental.RequestCredentials,
    destination: org.scalajs.dom.experimental.RequestDestination,
    formData: () => js.Promise[org.scalajs.dom.raw.FormData],
    headers: org.scalajs.dom.experimental.Headers,
    integrity: java.lang.String,
    isHistoryNavigation: scala.Boolean,
    isReloadNavigation: scala.Boolean,
    json: () => js.Promise[_],
    keepalive: scala.Boolean,
    method: java.lang.String,
    mode: org.scalajs.dom.experimental.RequestMode,
    redirect: org.scalajs.dom.experimental.RequestRedirect,
    referrer: java.lang.String,
    referrerPolicy: org.scalajs.dom.experimental.ReferrerPolicy,
    signal: org.scalajs.dom.experimental.AbortSignal,
    text: () => js.Promise[java.lang.String],
    url: java.lang.String
  ): Request = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], integrity = integrity.asInstanceOf[js.Any], isHistoryNavigation = isHistoryNavigation.asInstanceOf[js.Any], isReloadNavigation = isReloadNavigation.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), keepalive = keepalive.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], referrerPolicy = referrerPolicy.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: org.scalajs.dom.experimental.Request] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: org.scalajs.dom.experimental.RequestCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCredentials(value: org.scalajs.dom.experimental.RequestCredentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestination(value: org.scalajs.dom.experimental.RequestDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: org.scalajs.dom.experimental.Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntegrity(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHistoryNavigation(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHistoryNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReloadNavigation(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReloadNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepalive(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepalive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: org.scalajs.dom.experimental.RequestMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirect(value: org.scalajs.dom.experimental.RequestRedirect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferrer(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferrerPolicy(value: org.scalajs.dom.experimental.ReferrerPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrerPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignal(value: org.scalajs.dom.experimental.AbortSignal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(value.asInstanceOf[js.Any])
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


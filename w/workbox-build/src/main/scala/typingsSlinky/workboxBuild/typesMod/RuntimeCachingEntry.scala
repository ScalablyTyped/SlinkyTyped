package typingsSlinky.workboxBuild.typesMod

import org.scalajs.dom.experimental.Response
import typingsSlinky.workboxRouting.routeHandlerMod.RouteHandlerCallback
import typingsSlinky.workboxRouting.routeHandlerMod.RouteHandlerCallbackContext
import typingsSlinky.workboxRouting.routeMatchCallbackMod.RouteMatchCallback
import typingsSlinky.workboxRouting.routeMatchCallbackMod.RouteMatchCallbackOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuntimeCachingEntry extends js.Object {
  /**
    * * Either the name of one of the [built-in strategy classes](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-strategies)
    * or custom handler callback to use when the generated route matches.
    */
  var handler: String | RouteHandlerCallback = js.native
  /**
    * The [HTTP method](https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods) that
    * will match the generated route.
    *
    * @default 'GET'
    */
  var method: js.UndefOr[String] = js.native
  var options: js.UndefOr[RuntimeCachingEntryOptions] = js.native
  /**
    * The value that will be passed to [`registerRoute()`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-routing#.registerRoute),
    * used to determine whether the generated route will match a given request.
    */
  var urlPattern: String | js.RegExp | RouteMatchCallback[_] = js.native
}

object RuntimeCachingEntry {
  @scala.inline
  def apply(handler: String | RouteHandlerCallback, urlPattern: String | js.RegExp | RouteMatchCallback[_]): RuntimeCachingEntry = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], urlPattern = urlPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeCachingEntry]
  }
  @scala.inline
  implicit class RuntimeCachingEntryOps[Self <: RuntimeCachingEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandlerFunction1(value: /* context */ RouteHandlerCallbackContext => js.Promise[Response]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHandler(value: String | RouteHandlerCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrlPatternFunction1(value: /* options */ RouteMatchCallbackOptions => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlPattern")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUrlPatternRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrlPattern(value: String | js.RegExp | RouteMatchCallback[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: RuntimeCachingEntryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}


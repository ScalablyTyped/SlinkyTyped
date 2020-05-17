package typingsSlinky.semanticUiApi.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jquery.JQuery.Deferred
import typingsSlinky.jquery.JQuery.jqXHR
import typingsSlinky.semanticUiApi.JQuery
import typingsSlinky.semanticUiApi.SemanticUI.Api.ClassNameSettings
import typingsSlinky.semanticUiApi.SemanticUI.Api.ErrorSettings
import typingsSlinky.semanticUiApi.SemanticUI.Api.MetadataSettings
import typingsSlinky.semanticUiApi.SemanticUI.Api.RegExpSettings
import typingsSlinky.semanticUiApi.SemanticUI.Api.SelectorSettings
import typingsSlinky.semanticUiApi.SemanticUI.ApiSettings
import typingsSlinky.semanticUiApi.semanticUiApiBooleans.`false`
import typingsSlinky.semanticUiApi.semanticUiApiBooleans.`true`
import typingsSlinky.semanticUiApi.semanticUiApiStrings.auto
import typingsSlinky.semanticUiApi.semanticUiApiStrings.delete
import typingsSlinky.semanticUiApi.semanticUiApiStrings.get
import typingsSlinky.semanticUiApi.semanticUiApiStrings.head
import typingsSlinky.semanticUiApi.semanticUiApiStrings.html
import typingsSlinky.semanticUiApi.semanticUiApiStrings.json
import typingsSlinky.semanticUiApi.semanticUiApiStrings.jsonp
import typingsSlinky.semanticUiApi.semanticUiApiStrings.local
import typingsSlinky.semanticUiApi.semanticUiApiStrings.options
import typingsSlinky.semanticUiApi.semanticUiApiStrings.patch
import typingsSlinky.semanticUiApi.semanticUiApiStrings.post
import typingsSlinky.semanticUiApi.semanticUiApiStrings.put
import typingsSlinky.semanticUiApi.semanticUiApiStrings.script
import typingsSlinky.semanticUiApi.semanticUiApiStrings.text
import typingsSlinky.semanticUiApi.semanticUiApiStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, keyof semantic-ui-api.SemanticUI.ApiSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImpl extends js.Object {
  var action: js.UndefOr[String | `false`] = js.native
  var api: js.UndefOr[StringDictionary[String]] = js.native
  var beforeSend: js.UndefOr[js.Function1[/* settings */ ApiSettings, _]] = js.native
  var beforeXHR: js.UndefOr[js.Function1[/* xhrObject */ jqXHR[_], _]] = js.native
  var cache: js.UndefOr[local | Boolean] = js.native
  var className: js.UndefOr[ClassNameSettings] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var dataType: js.UndefOr[xml | json | jsonp | script | html | text] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var defaultData: js.UndefOr[Boolean] = js.native
  var encodeParameters: js.UndefOr[Boolean] = js.native
  var error: js.UndefOr[ErrorSettings] = js.native
  var errorDuration: js.UndefOr[`true` | Double] = js.native
  var hideError: js.UndefOr[auto | Boolean] = js.native
  var interruptRequests: js.UndefOr[Boolean] = js.native
  var loadingDuration: js.UndefOr[Double] = js.native
  var metadata: js.UndefOr[MetadataSettings] = js.native
  var method: js.UndefOr[post | get | put | delete | head | options | patch] = js.native
  var mockResponse: js.UndefOr[js.Any | `false`] = js.native
  var mockResponseAsync: js.UndefOr[
    (js.Function2[
      /* settings */ ApiSettings, 
      /* callback */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]) | `false`
  ] = js.native
  var name: js.UndefOr[String] = js.native
  var namespace: js.UndefOr[String] = js.native
  var on: js.UndefOr[String] = js.native
  var onAbort: js.UndefOr[
    js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
  ] = js.native
  var onComplete: js.UndefOr[
    js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
  ] = js.native
  var onError: js.UndefOr[
    js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
  ] = js.native
  var onFailure: js.UndefOr[js.Function2[/* response */ js.Any, /* element */ JQuery, Unit]] = js.native
  var onRequest: js.UndefOr[js.Function2[/* promise */ Deferred[_, _, _], /* xhr */ jqXHR[_], Unit]] = js.native
  var onResponse: js.UndefOr[js.Function1[/* response */ js.Any, Unit]] = js.native
  var onSuccess: js.UndefOr[
    js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
  ] = js.native
  var performance: js.UndefOr[Boolean] = js.native
  var regExp: js.UndefOr[RegExpSettings] = js.native
  var response: js.UndefOr[js.Any | `false`] = js.native
  var responseAsync: js.UndefOr[
    (js.Function2[
      /* settings */ ApiSettings, 
      /* callback */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]) | `false`
  ] = js.native
  var selector: js.UndefOr[SelectorSettings] = js.native
  var serializeForm: js.UndefOr[Boolean] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var stateContext: js.UndefOr[String | JQuery] = js.native
  var successTest: js.UndefOr[js.Function1[/* response */ js.Any, Boolean]] = js.native
  var throttle: js.UndefOr[Double] = js.native
  var throttleFirstRequest: js.UndefOr[Boolean] = js.native
  var url: js.UndefOr[String | `false`] = js.native
  var urlData: js.UndefOr[js.Any | `false`] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplOps[Self <: PartialPickImplkeyofImpl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withApi(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSend(value: /* settings */ ApiSettings => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeSend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSend")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeXHR(value: /* xhrObject */ jqXHR[_] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeXHR")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeXHR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeXHR")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: local | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: ClassNameSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDataType(value: xml | json | jsonp | script | html | text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultData")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodeParameters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodeParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: ErrorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorDuration(value: `true` | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withHideError(value: auto | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideError")(js.undefined)
        ret
    }
    @scala.inline
    def withInterruptRequests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interruptRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterruptRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interruptRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: MetadataSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: post | get | put | delete | head | options | patch): Self = {
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
    def withMockResponse(value: js.Any | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mockResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMockResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mockResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withMockResponseAsyncFunction2(
      value: (/* settings */ ApiSettings, /* callback */ js.Function1[/* response */ js.Any, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mockResponseAsync")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMockResponseAsync(
      value: (js.Function2[
          /* settings */ ApiSettings, 
          /* callback */ js.Function1[/* response */ js.Any, Unit], 
          Unit
        ]) | `false`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mockResponseAsync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMockResponseAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mockResponseAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAbort(value: (/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbort")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnAbort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbort")(js.undefined)
        ret
    }
    @scala.inline
    def withOnComplete(value: (/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: (/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFailure(value: (/* response */ js.Any, /* element */ JQuery) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFailure")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRequest(value: (/* promise */ Deferred[_, _, _], /* xhr */ jqXHR[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequest")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponse(value: /* response */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuccess(value: (/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(js.undefined)
        ret
    }
    @scala.inline
    def withRegExp(value: RegExpSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regExp")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse(value: js.Any | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseAsyncFunction2(
      value: (/* settings */ ApiSettings, /* callback */ js.Function1[/* response */ js.Any, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseAsync")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withResponseAsync(
      value: (js.Function2[
          /* settings */ ApiSettings, 
          /* callback */ js.Function1[/* response */ js.Any, Unit], 
          Unit
        ]) | `false`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseAsync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: SelectorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializeForm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeForm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerializeForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeForm")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withStateContext(value: String | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateContext")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessTest(value: /* response */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successTest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccessTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successTest")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottleFirstRequest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttleFirstRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottleFirstRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttleFirstRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlData(value: js.Any | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlData")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}


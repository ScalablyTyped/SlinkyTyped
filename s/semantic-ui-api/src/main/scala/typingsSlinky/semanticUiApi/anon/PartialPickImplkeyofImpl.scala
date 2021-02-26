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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, keyof semantic-ui-api.SemanticUI.ApiSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImpl extends StObject {
  
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
  implicit class PartialPickImplkeyofImplMutableBuilder[Self <: PartialPickImplkeyofImpl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String | `false`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setApi(value: StringDictionary[String]): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    @scala.inline
    def setBeforeSend(value: /* settings */ ApiSettings => _): Self = StObject.set(x, "beforeSend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
    
    @scala.inline
    def setBeforeXHR(value: /* xhrObject */ jqXHR[_] => _): Self = StObject.set(x, "beforeXHR", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeXHRUndefined: Self = StObject.set(x, "beforeXHR", js.undefined)
    
    @scala.inline
    def setCache(value: local | Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataType(value: xml | json | jsonp | script | html | text): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setDefaultData(value: Boolean): Self = StObject.set(x, "defaultData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDataUndefined: Self = StObject.set(x, "defaultData", js.undefined)
    
    @scala.inline
    def setEncodeParameters(value: Boolean): Self = StObject.set(x, "encodeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodeParametersUndefined: Self = StObject.set(x, "encodeParameters", js.undefined)
    
    @scala.inline
    def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDuration(value: `true` | Double): Self = StObject.set(x, "errorDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDurationUndefined: Self = StObject.set(x, "errorDuration", js.undefined)
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setHideError(value: auto | Boolean): Self = StObject.set(x, "hideError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideErrorUndefined: Self = StObject.set(x, "hideError", js.undefined)
    
    @scala.inline
    def setInterruptRequests(value: Boolean): Self = StObject.set(x, "interruptRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterruptRequestsUndefined: Self = StObject.set(x, "interruptRequests", js.undefined)
    
    @scala.inline
    def setLoadingDuration(value: Double): Self = StObject.set(x, "loadingDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingDurationUndefined: Self = StObject.set(x, "loadingDuration", js.undefined)
    
    @scala.inline
    def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setMethod(value: post | get | put | delete | head | options | patch): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setMockResponse(value: js.Any | `false`): Self = StObject.set(x, "mockResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMockResponseAsync(
      value: (js.Function2[
          /* settings */ ApiSettings, 
          /* callback */ js.Function1[/* response */ js.Any, Unit], 
          Unit
        ]) | `false`
    ): Self = StObject.set(x, "mockResponseAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMockResponseAsyncFunction2(
      value: (/* settings */ ApiSettings, /* callback */ js.Function1[/* response */ js.Any, Unit]) => Unit
    ): Self = StObject.set(x, "mockResponseAsync", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMockResponseAsyncUndefined: Self = StObject.set(x, "mockResponseAsync", js.undefined)
    
    @scala.inline
    def setMockResponseUndefined: Self = StObject.set(x, "mockResponse", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setOn(value: String): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAbort(value: (/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_]) => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    @scala.inline
    def setOnComplete(value: (/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_]) => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    @scala.inline
    def setOnError(value: (/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_]) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnFailure(value: (/* response */ js.Any, /* element */ JQuery) => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
    
    @scala.inline
    def setOnRequest(value: (/* promise */ Deferred[_, _, _], /* xhr */ jqXHR[_]) => Unit): Self = StObject.set(x, "onRequest", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRequestUndefined: Self = StObject.set(x, "onRequest", js.undefined)
    
    @scala.inline
    def setOnResponse(value: /* response */ js.Any => Unit): Self = StObject.set(x, "onResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResponseUndefined: Self = StObject.set(x, "onResponse", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: (/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_]) => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
    
    @scala.inline
    def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    @scala.inline
    def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    @scala.inline
    def setRegExp(value: RegExpSettings): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegExpUndefined: Self = StObject.set(x, "regExp", js.undefined)
    
    @scala.inline
    def setResponse(value: js.Any | `false`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseAsync(
      value: (js.Function2[
          /* settings */ ApiSettings, 
          /* callback */ js.Function1[/* response */ js.Any, Unit], 
          Unit
        ]) | `false`
    ): Self = StObject.set(x, "responseAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseAsyncFunction2(
      value: (/* settings */ ApiSettings, /* callback */ js.Function1[/* response */ js.Any, Unit]) => Unit
    ): Self = StObject.set(x, "responseAsync", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResponseAsyncUndefined: Self = StObject.set(x, "responseAsync", js.undefined)
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    @scala.inline
    def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setSerializeForm(value: Boolean): Self = StObject.set(x, "serializeForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializeFormUndefined: Self = StObject.set(x, "serializeForm", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setStateContext(value: String | JQuery): Self = StObject.set(x, "stateContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateContextUndefined: Self = StObject.set(x, "stateContext", js.undefined)
    
    @scala.inline
    def setSuccessTest(value: /* response */ js.Any => Boolean): Self = StObject.set(x, "successTest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessTestUndefined: Self = StObject.set(x, "successTest", js.undefined)
    
    @scala.inline
    def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottleFirstRequest(value: Boolean): Self = StObject.set(x, "throttleFirstRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottleFirstRequestUndefined: Self = StObject.set(x, "throttleFirstRequest", js.undefined)
    
    @scala.inline
    def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    
    @scala.inline
    def setUrl(value: String | `false`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlData(value: js.Any | `false`): Self = StObject.set(x, "urlData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlDataUndefined: Self = StObject.set(x, "urlData", js.undefined)
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}

package typingsSlinky.semanticUiApi.SemanticUI

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jquery.JQuery.Deferred
import typingsSlinky.jquery.JQuery.jqXHR
import typingsSlinky.jquery.JQueryDeferred
import typingsSlinky.semanticUiApi.JQuery
import typingsSlinky.semanticUiApi.SemanticUI.Api.ClassNameSettings
import typingsSlinky.semanticUiApi.SemanticUI.Api.ErrorSettings
import typingsSlinky.semanticUiApi.SemanticUI.Api.MetadataSettings
import typingsSlinky.semanticUiApi.SemanticUI.Api.RegExpSettings
import typingsSlinky.semanticUiApi.SemanticUI.Api.SelectorSettings
import typingsSlinky.semanticUiApi.semanticUiApiBooleans.`false`
import typingsSlinky.semanticUiApi.semanticUiApiBooleans.`true`
import typingsSlinky.semanticUiApi.semanticUiApiStrings.`add url data`
import typingsSlinky.semanticUiApi.semanticUiApiStrings.`create cache`
import typingsSlinky.semanticUiApi.semanticUiApiStrings.`get event`
import typingsSlinky.semanticUiApi.semanticUiApiStrings.`get request`
import typingsSlinky.semanticUiApi.semanticUiApiStrings.`get url encoded value`
import typingsSlinky.semanticUiApi.semanticUiApiStrings.`is disabled`
import typingsSlinky.semanticUiApi.semanticUiApiStrings.`is loading`
import typingsSlinky.semanticUiApi.semanticUiApiStrings.`is mocked`
import typingsSlinky.semanticUiApi.semanticUiApiStrings.`read cached response`
import typingsSlinky.semanticUiApi.semanticUiApiStrings.`remove error`
import typingsSlinky.semanticUiApi.semanticUiApiStrings.`remove loading`
import typingsSlinky.semanticUiApi.semanticUiApiStrings.`set error`
import typingsSlinky.semanticUiApi.semanticUiApiStrings.`set loading`
import typingsSlinky.semanticUiApi.semanticUiApiStrings.`was cancelled`
import typingsSlinky.semanticUiApi.semanticUiApiStrings.`was complete`
import typingsSlinky.semanticUiApi.semanticUiApiStrings.`was failure`
import typingsSlinky.semanticUiApi.semanticUiApiStrings.`was successful`
import typingsSlinky.semanticUiApi.semanticUiApiStrings.`write cached response`
import typingsSlinky.semanticUiApi.semanticUiApiStrings.abort
import typingsSlinky.semanticUiApi.semanticUiApiStrings.action
import typingsSlinky.semanticUiApi.semanticUiApiStrings.api
import typingsSlinky.semanticUiApi.semanticUiApiStrings.auto
import typingsSlinky.semanticUiApi.semanticUiApiStrings.beforeSend
import typingsSlinky.semanticUiApi.semanticUiApiStrings.beforeXHR
import typingsSlinky.semanticUiApi.semanticUiApiStrings.cache
import typingsSlinky.semanticUiApi.semanticUiApiStrings.className
import typingsSlinky.semanticUiApi.semanticUiApiStrings.data
import typingsSlinky.semanticUiApi.semanticUiApiStrings.dataType
import typingsSlinky.semanticUiApi.semanticUiApiStrings.debug
import typingsSlinky.semanticUiApi.semanticUiApiStrings.defaultData
import typingsSlinky.semanticUiApi.semanticUiApiStrings.delete
import typingsSlinky.semanticUiApi.semanticUiApiStrings.destroy
import typingsSlinky.semanticUiApi.semanticUiApiStrings.encodeParameters
import typingsSlinky.semanticUiApi.semanticUiApiStrings.error
import typingsSlinky.semanticUiApi.semanticUiApiStrings.errorDuration
import typingsSlinky.semanticUiApi.semanticUiApiStrings.get
import typingsSlinky.semanticUiApi.semanticUiApiStrings.head
import typingsSlinky.semanticUiApi.semanticUiApiStrings.hideError
import typingsSlinky.semanticUiApi.semanticUiApiStrings.html
import typingsSlinky.semanticUiApi.semanticUiApiStrings.interruptRequests
import typingsSlinky.semanticUiApi.semanticUiApiStrings.json
import typingsSlinky.semanticUiApi.semanticUiApiStrings.jsonp
import typingsSlinky.semanticUiApi.semanticUiApiStrings.loadingDuration
import typingsSlinky.semanticUiApi.semanticUiApiStrings.local
import typingsSlinky.semanticUiApi.semanticUiApiStrings.metadata
import typingsSlinky.semanticUiApi.semanticUiApiStrings.method
import typingsSlinky.semanticUiApi.semanticUiApiStrings.mockResponse
import typingsSlinky.semanticUiApi.semanticUiApiStrings.mockResponseAsync
import typingsSlinky.semanticUiApi.semanticUiApiStrings.name
import typingsSlinky.semanticUiApi.semanticUiApiStrings.namespace
import typingsSlinky.semanticUiApi.semanticUiApiStrings.on
import typingsSlinky.semanticUiApi.semanticUiApiStrings.onAbort
import typingsSlinky.semanticUiApi.semanticUiApiStrings.onComplete
import typingsSlinky.semanticUiApi.semanticUiApiStrings.onError
import typingsSlinky.semanticUiApi.semanticUiApiStrings.onFailure
import typingsSlinky.semanticUiApi.semanticUiApiStrings.onRequest
import typingsSlinky.semanticUiApi.semanticUiApiStrings.onResponse
import typingsSlinky.semanticUiApi.semanticUiApiStrings.onSuccess
import typingsSlinky.semanticUiApi.semanticUiApiStrings.options
import typingsSlinky.semanticUiApi.semanticUiApiStrings.patch
import typingsSlinky.semanticUiApi.semanticUiApiStrings.performance
import typingsSlinky.semanticUiApi.semanticUiApiStrings.post
import typingsSlinky.semanticUiApi.semanticUiApiStrings.put
import typingsSlinky.semanticUiApi.semanticUiApiStrings.query
import typingsSlinky.semanticUiApi.semanticUiApiStrings.regExp
import typingsSlinky.semanticUiApi.semanticUiApiStrings.reset
import typingsSlinky.semanticUiApi.semanticUiApiStrings.response
import typingsSlinky.semanticUiApi.semanticUiApiStrings.responseAsync
import typingsSlinky.semanticUiApi.semanticUiApiStrings.script
import typingsSlinky.semanticUiApi.semanticUiApiStrings.selector
import typingsSlinky.semanticUiApi.semanticUiApiStrings.serializeForm
import typingsSlinky.semanticUiApi.semanticUiApiStrings.setting
import typingsSlinky.semanticUiApi.semanticUiApiStrings.silent
import typingsSlinky.semanticUiApi.semanticUiApiStrings.stateContext
import typingsSlinky.semanticUiApi.semanticUiApiStrings.successTest
import typingsSlinky.semanticUiApi.semanticUiApiStrings.text
import typingsSlinky.semanticUiApi.semanticUiApiStrings.throttle
import typingsSlinky.semanticUiApi.semanticUiApiStrings.throttleFirstRequest
import typingsSlinky.semanticUiApi.semanticUiApiStrings.url
import typingsSlinky.semanticUiApi.semanticUiApiStrings.urlData
import typingsSlinky.semanticUiApi.semanticUiApiStrings.verbose
import typingsSlinky.semanticUiApi.semanticUiApiStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Api_ extends js.Object {
  var settings: ApiSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Adds data to existing templated url and returns full url string
    */
  def apply(behavior: `add url data`, url: String, data: js.Any): String = js.native
  /**
    * Creates new cache, removing all locally cached URLs
    */
  def apply(behavior: `create cache`): JQuery = js.native
  /**
    * Gets event that API request will occur on
    */
  def apply(behavior: `get event`): String = js.native
  /**
    * Gets promise for current API request
    */
  def apply(behavior: `get request`): JQueryDeferred[_] | `false` = js.native
  /**
    * Returns encodeURIComponent value only if value passed is not already encoded
    */
  def apply(behavior: `get url encoded value`, value: js.Any): String = js.native
  /**
    * Returns whether element is disabled
    */
  def apply(behavior: `is disabled`): Boolean = js.native
  /**
    * Returns whether element is loading
    */
  def apply(behavior: `is loading`): Boolean = js.native
  /**
    * Returns whether element response is mocked
    */
  def apply(behavior: `is mocked`): Boolean = js.native
  /**
    * Reads a locally cached response for a URL
    */
  def apply(behavior: `read cached response`, url: String): js.Any = js.native
  /**
    * Removes error state to element
    */
  def apply(behavior: `remove error`): JQuery = js.native
  /**
    * Removes loading state to element
    */
  def apply(behavior: `remove loading`): JQuery = js.native
  /**
    * Sets error state to element
    */
  def apply(behavior: `set error`): JQuery = js.native
  /**
    * Sets loading state to element
    */
  def apply(behavior: `set loading`): JQuery = js.native
  /**
    * Returns whether last request was cancelled
    */
  def apply(behavior: `was cancelled`): Boolean = js.native
  /**
    * Returns whether last request was completed
    */
  def apply(behavior: `was complete`): Boolean = js.native
  /**
    * Returns whether last request was failure
    */
  def apply(behavior: `was failure`): Boolean = js.native
  /**
    * Returns whether last request was successful
    */
  def apply(behavior: `was successful`): Boolean = js.native
  /**
    * Writes a cached response for a URL
    */
  def apply(behavior: `write cached response`, url: String, response: js.Any): JQuery = js.native
  /**
    * Aborts current API request
    */
  def apply(behavior: abort): JQuery = js.native
  /**
    * Removes API settings from the page and all events
    */
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Execute query using existing API settings
    */
  def apply(behavior: query): JQuery = js.native
  /**
    * Removes loading and error state from element
    */
  def apply(behavior: reset): JQuery = js.native
  def apply(behavior: setting, name: action): String | `false` = js.native
  def apply(behavior: setting, name: action, value: String): JQuery = js.native
  def apply(behavior: setting, name: action, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: api): StringDictionary[String] = js.native
  def apply(behavior: setting, name: api, value: StringDictionary[String]): JQuery = js.native
  def apply(behavior: setting, name: beforeSend): js.Function1[/* settings */ ApiSettings, _] = js.native
  def apply(behavior: setting, name: beforeSend, value: js.Function1[/* settings */ ApiSettings, _]): JQuery = js.native
  def apply(behavior: setting, name: beforeXHR): js.Function1[/* xhrObject */ jqXHR[_], _] = js.native
  def apply(behavior: setting, name: beforeXHR, value: js.Function1[/* xhrObject */ jqXHR[_], _]): JQuery = js.native
  def apply(behavior: setting, name: cache): local | Boolean = js.native
  def apply(behavior: setting, name: cache, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: cache, value: local): JQuery = js.native
  def apply(behavior: setting, name: className): ClassNameSettings = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: data): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-api.SemanticUI.ApiSettings._Impl['data'] */ js.Any = js.native
  def apply(behavior: setting, name: dataType): xml | json | jsonp | script | html | text = js.native
  def apply(behavior: setting, name: dataType, value: html): JQuery = js.native
  def apply(behavior: setting, name: dataType, value: json): JQuery = js.native
  def apply(behavior: setting, name: dataType, value: jsonp): JQuery = js.native
  def apply(behavior: setting, name: dataType, value: script): JQuery = js.native
  def apply(behavior: setting, name: dataType, value: text): JQuery = js.native
  def apply(behavior: setting, name: dataType, value: xml): JQuery = js.native
  def apply(
    behavior: setting,
    name: data,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-api.SemanticUI.ApiSettings._Impl['data'] */ js.Any
  ): JQuery = js.native
  def apply(behavior: setting, name: debug): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: defaultData): Boolean = js.native
  def apply(behavior: setting, name: defaultData, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: encodeParameters): Boolean = js.native
  def apply(behavior: setting, name: encodeParameters, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: error): ErrorSettings = js.native
  def apply(behavior: setting, name: errorDuration): `true` | Double = js.native
  def apply(behavior: setting, name: errorDuration, value: Double): JQuery = js.native
  def apply(behavior: setting, name: errorDuration, value: `true`): JQuery = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: hideError): auto | Boolean = js.native
  def apply(behavior: setting, name: hideError, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: hideError, value: auto): JQuery = js.native
  def apply(behavior: setting, name: interruptRequests): Boolean = js.native
  def apply(behavior: setting, name: interruptRequests, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: loadingDuration): Double = js.native
  def apply(behavior: setting, name: loadingDuration, value: Double): JQuery = js.native
  def apply(behavior: setting, name: metadata): MetadataSettings = js.native
  def apply(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
  def apply(behavior: setting, name: method): post | get | put | delete | head | options | patch = js.native
  def apply(behavior: setting, name: method, value: delete): JQuery = js.native
  def apply(behavior: setting, name: method, value: get): JQuery = js.native
  def apply(behavior: setting, name: method, value: head): JQuery = js.native
  def apply(behavior: setting, name: method, value: options): JQuery = js.native
  def apply(behavior: setting, name: method, value: patch): JQuery = js.native
  def apply(behavior: setting, name: method, value: post): JQuery = js.native
  def apply(behavior: setting, name: method, value: put): JQuery = js.native
  def apply(behavior: setting, name: mockResponse): js.Any | `false` = js.native
  def apply(behavior: setting, name: mockResponseAsync): (js.Function2[
    /* settings */ ApiSettings, 
    /* callback */ js.Function1[/* response */ js.Any, Unit], 
    Unit
  ]) | `false` = js.native
  def apply(
    behavior: setting,
    name: mockResponseAsync,
    value: js.Function2[
      /* settings */ ApiSettings, 
      /* callback */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]
  ): JQuery = js.native
  def apply(behavior: setting, name: mockResponseAsync, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: mockResponse, value: js.Any): JQuery = js.native
  def apply(behavior: setting, name: mockResponse, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: name): String = js.native
  def apply(behavior: setting, name: namespace): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: on): String = js.native
  def apply(behavior: setting, name: onAbort): js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_], Unit] = js.native
  def apply(
    behavior: setting,
    name: onAbort,
    value: js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onComplete): js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_], Unit] = js.native
  def apply(
    behavior: setting,
    name: onComplete,
    value: js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onError): js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_], Unit] = js.native
  def apply(
    behavior: setting,
    name: onError,
    value: js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onFailure): js.Function2[/* response */ js.Any, /* element */ JQuery, Unit] = js.native
  def apply(
    behavior: setting,
    name: onFailure,
    value: js.Function2[/* response */ js.Any, /* element */ JQuery, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onRequest): js.Function2[/* promise */ Deferred[_, _, _], /* xhr */ jqXHR[_], Unit] = js.native
  def apply(
    behavior: setting,
    name: onRequest,
    value: js.Function2[/* promise */ Deferred[_, _, _], /* xhr */ jqXHR[_], Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onResponse): js.Function1[/* response */ js.Any, Unit] = js.native
  def apply(behavior: setting, name: onResponse, value: js.Function1[/* response */ js.Any, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onSuccess): js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_], Unit] = js.native
  def apply(
    behavior: setting,
    name: onSuccess,
    value: js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: on, value: String): JQuery = js.native
  def apply(behavior: setting, name: performance): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: regExp): RegExpSettings = js.native
  def apply(behavior: setting, name: regExp, value: RegExpSettings): JQuery = js.native
  def apply(behavior: setting, name: response): js.Any | `false` = js.native
  def apply(behavior: setting, name: responseAsync): (js.Function2[
    /* settings */ ApiSettings, 
    /* callback */ js.Function1[/* response */ js.Any, Unit], 
    Unit
  ]) | `false` = js.native
  def apply(
    behavior: setting,
    name: responseAsync,
    value: js.Function2[
      /* settings */ ApiSettings, 
      /* callback */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]
  ): JQuery = js.native
  def apply(behavior: setting, name: responseAsync, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: response, value: js.Any): JQuery = js.native
  def apply(behavior: setting, name: response, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: selector): SelectorSettings = js.native
  def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def apply(behavior: setting, name: serializeForm): Boolean = js.native
  def apply(behavior: setting, name: serializeForm, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: silent): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: stateContext): String | JQuery = js.native
  def apply(behavior: setting, name: stateContext, value: String): JQuery = js.native
  def apply(behavior: setting, name: stateContext, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: successTest): js.Function1[/* response */ js.Any, Boolean] = js.native
  def apply(behavior: setting, name: successTest, value: js.Function1[/* response */ js.Any, Boolean]): JQuery = js.native
  def apply(behavior: setting, name: throttle): Double = js.native
  def apply(behavior: setting, name: throttleFirstRequest): Boolean = js.native
  def apply(behavior: setting, name: throttleFirstRequest, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: throttle, value: Double): JQuery = js.native
  def apply(behavior: setting, name: url): String | `false` = js.native
  def apply(behavior: setting, name: urlData): js.Any | `false` = js.native
  def apply(behavior: setting, name: urlData, value: js.Any): JQuery = js.native
  def apply(behavior: setting, name: urlData, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: url, value: String): JQuery = js.native
  def apply(behavior: setting, name: url, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: verbose): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: ApiSettings): JQuery = js.native
  def apply(settings: ApiSettings): JQuery = js.native
}


package typingsSlinky.semanticUiApi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jquery.JQuery.Deferred
import typingsSlinky.jquery.JQuery.jqXHR
import typingsSlinky.jquery.JQueryDeferred
import typingsSlinky.semanticUiApi.SemanticUI.Api.ClassNameSettings
import typingsSlinky.semanticUiApi.SemanticUI.Api.ClassNameSettings.Param
import typingsSlinky.semanticUiApi.SemanticUI.Api.ErrorSettings
import typingsSlinky.semanticUiApi.SemanticUI.Api.MetadataSettings
import typingsSlinky.semanticUiApi.SemanticUI.Api.RegExpSettings
import typingsSlinky.semanticUiApi.SemanticUI.Api.SelectorSettings
import typingsSlinky.semanticUiApi.anon.PartialPickImplkeyofImpl
import typingsSlinky.semanticUiApi.anon.PartialPickImplkeyofImplAction
import typingsSlinky.semanticUiApi.anon.PartialPickImplkeyofImplBeforeSend
import typingsSlinky.semanticUiApi.anon.PartialPickImplkeyofImplDisabled
import typingsSlinky.semanticUiApi.anon.PartialPickImplkeyofImplError
import typingsSlinky.semanticUiApi.anon.PartialPickImplkeyofImplOptional
import typingsSlinky.semanticUiApi.anon.PickImplJSONParse
import typingsSlinky.semanticUiApi.anon.PickImplaction
import typingsSlinky.semanticUiApi.anon.PickImplactionAction
import typingsSlinky.semanticUiApi.anon.PickImplapi
import typingsSlinky.semanticUiApi.anon.PickImplbeforeSend
import typingsSlinky.semanticUiApi.anon.PickImplbeforeSendBeforeSend
import typingsSlinky.semanticUiApi.anon.PickImplbeforeXHR
import typingsSlinky.semanticUiApi.anon.PickImplcache
import typingsSlinky.semanticUiApi.anon.PickImplclassName
import typingsSlinky.semanticUiApi.anon.PickImpldata
import typingsSlinky.semanticUiApi.anon.PickImpldataType
import typingsSlinky.semanticUiApi.anon.PickImpldebug
import typingsSlinky.semanticUiApi.anon.PickImpldefaultData
import typingsSlinky.semanticUiApi.anon.PickImpldisabled
import typingsSlinky.semanticUiApi.anon.PickImplencodeParameters
import typingsSlinky.semanticUiApi.anon.PickImplerror
import typingsSlinky.semanticUiApi.anon.PickImplerrorDuration
import typingsSlinky.semanticUiApi.anon.PickImplerrorError
import typingsSlinky.semanticUiApi.anon.PickImplexitConditions
import typingsSlinky.semanticUiApi.anon.PickImplform
import typingsSlinky.semanticUiApi.anon.PickImplhideError
import typingsSlinky.semanticUiApi.anon.PickImplinterruptRequests
import typingsSlinky.semanticUiApi.anon.PickImpllegacyParameters
import typingsSlinky.semanticUiApi.anon.PickImplloading
import typingsSlinky.semanticUiApi.anon.PickImplloadingDuration
import typingsSlinky.semanticUiApi.anon.PickImplmetadata
import typingsSlinky.semanticUiApi.anon.PickImplmethod
import typingsSlinky.semanticUiApi.anon.PickImplmissingAction
import typingsSlinky.semanticUiApi.anon.PickImplmissingSerialize
import typingsSlinky.semanticUiApi.anon.PickImplmissingURL
import typingsSlinky.semanticUiApi.anon.PickImplmockResponse
import typingsSlinky.semanticUiApi.anon.PickImplmockResponseAsync
import typingsSlinky.semanticUiApi.anon.PickImplname
import typingsSlinky.semanticUiApi.anon.PickImplnamespace
import typingsSlinky.semanticUiApi.anon.PickImplnoReturnedValue
import typingsSlinky.semanticUiApi.anon.PickImplon
import typingsSlinky.semanticUiApi.anon.PickImplonAbort
import typingsSlinky.semanticUiApi.anon.PickImplonComplete
import typingsSlinky.semanticUiApi.anon.PickImplonError
import typingsSlinky.semanticUiApi.anon.PickImplonFailure
import typingsSlinky.semanticUiApi.anon.PickImplonRequest
import typingsSlinky.semanticUiApi.anon.PickImplonResponse
import typingsSlinky.semanticUiApi.anon.PickImplonSuccess
import typingsSlinky.semanticUiApi.anon.PickImploptional
import typingsSlinky.semanticUiApi.anon.PickImplparseError
import typingsSlinky.semanticUiApi.anon.PickImplperformance
import typingsSlinky.semanticUiApi.anon.PickImplregExp
import typingsSlinky.semanticUiApi.anon.PickImplrequired
import typingsSlinky.semanticUiApi.anon.PickImplrequiredParameter
import typingsSlinky.semanticUiApi.anon.PickImplresponse
import typingsSlinky.semanticUiApi.anon.PickImplresponseAsync
import typingsSlinky.semanticUiApi.anon.PickImplselector
import typingsSlinky.semanticUiApi.anon.PickImplserializeForm
import typingsSlinky.semanticUiApi.anon.PickImplsilent
import typingsSlinky.semanticUiApi.anon.PickImplstateContext
import typingsSlinky.semanticUiApi.anon.PickImplstatusMessage
import typingsSlinky.semanticUiApi.anon.PickImplsuccessTest
import typingsSlinky.semanticUiApi.anon.PickImplthrottle
import typingsSlinky.semanticUiApi.anon.PickImplthrottleFirstRequ
import typingsSlinky.semanticUiApi.anon.PickImpltimeout
import typingsSlinky.semanticUiApi.anon.PickImplurl
import typingsSlinky.semanticUiApi.anon.PickImplurlData
import typingsSlinky.semanticUiApi.anon.PickImplurlUrl
import typingsSlinky.semanticUiApi.anon.PickImplverbose
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Api extends StObject {
    
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
    def apply(behavior: setting, name: action, value: js.UndefOr[scala.Nothing]): String | `false` = js.native
    def apply(behavior: setting, name: action, value: String): JQuery = js.native
    def apply(behavior: setting, name: action, value: `false`): JQuery = js.native
    def apply(behavior: setting, name: api, value: js.UndefOr[scala.Nothing]): StringDictionary[String] = js.native
    def apply(behavior: setting, name: api, value: StringDictionary[String]): JQuery = js.native
    def apply(behavior: setting, name: beforeSend, value: js.UndefOr[scala.Nothing]): js.Function1[/* settings */ ApiSettings, _] = js.native
    def apply(behavior: setting, name: beforeSend, value: js.Function1[/* settings */ ApiSettings, _]): JQuery = js.native
    def apply(behavior: setting, name: beforeXHR, value: js.UndefOr[scala.Nothing]): js.Function1[/* xhrObject */ jqXHR[_], _] = js.native
    def apply(behavior: setting, name: beforeXHR, value: js.Function1[/* xhrObject */ jqXHR[_], _]): JQuery = js.native
    def apply(behavior: setting, name: cache, value: js.UndefOr[scala.Nothing]): local | Boolean = js.native
    def apply(behavior: setting, name: cache, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: cache, value: local): JQuery = js.native
    def apply(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
    def apply(behavior: setting, name: dataType, value: js.UndefOr[scala.Nothing]): xml | json | jsonp | script | html | text = js.native
    def apply(behavior: setting, name: dataType, value: html): JQuery = js.native
    def apply(behavior: setting, name: dataType, value: json): JQuery = js.native
    def apply(behavior: setting, name: dataType, value: jsonp): JQuery = js.native
    def apply(behavior: setting, name: dataType, value: script): JQuery = js.native
    def apply(behavior: setting, name: dataType, value: text): JQuery = js.native
    def apply(behavior: setting, name: dataType, value: xml): JQuery = js.native
    def apply(behavior: setting, name: data, value: js.UndefOr[scala.Nothing]): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-api.SemanticUI.ApiSettings._Impl['data'] */ js.Any = js.native
    def apply(
      behavior: setting,
      name: data,
      value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-api.SemanticUI.ApiSettings._Impl['data'] */ js.Any
    ): JQuery = js.native
    def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: defaultData, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: defaultData, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: encodeParameters, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: encodeParameters, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: errorDuration, value: js.UndefOr[scala.Nothing]): `true` | Double = js.native
    def apply(behavior: setting, name: errorDuration, value: Double): JQuery = js.native
    def apply(behavior: setting, name: errorDuration, value: `true`): JQuery = js.native
    def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
    def apply(behavior: setting, name: hideError, value: js.UndefOr[scala.Nothing]): auto | Boolean = js.native
    def apply(behavior: setting, name: hideError, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: hideError, value: auto): JQuery = js.native
    def apply(behavior: setting, name: interruptRequests, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: interruptRequests, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: loadingDuration, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: loadingDuration, value: Double): JQuery = js.native
    def apply(behavior: setting, name: metadata, value: js.UndefOr[scala.Nothing]): MetadataSettings = js.native
    def apply(behavior: setting, name: method, value: js.UndefOr[scala.Nothing]): post | get | put | delete | head | options | patch = js.native
    def apply(behavior: setting, name: method, value: delete): JQuery = js.native
    def apply(behavior: setting, name: method, value: get): JQuery = js.native
    def apply(behavior: setting, name: method, value: head): JQuery = js.native
    def apply(behavior: setting, name: method, value: options): JQuery = js.native
    def apply(behavior: setting, name: method, value: patch): JQuery = js.native
    def apply(behavior: setting, name: method, value: post): JQuery = js.native
    def apply(behavior: setting, name: method, value: put): JQuery = js.native
    def apply(behavior: setting, name: mockResponseAsync, value: js.UndefOr[scala.Nothing]): (js.Function2[
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
    def apply(behavior: setting, name: mockResponse, value: js.UndefOr[scala.Nothing]): js.Any | `false` = js.native
    def apply(behavior: setting, name: mockResponse, value: js.Any): JQuery = js.native
    def apply(behavior: setting, name: mockResponse, value: `false`): JQuery = js.native
    def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
    def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: name, value: String): JQuery = js.native
    def apply(behavior: setting, name: onAbort, value: js.UndefOr[scala.Nothing]): js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_], Unit] = js.native
    def apply(
      behavior: setting,
      name: onAbort,
      value: js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: onComplete, value: js.UndefOr[scala.Nothing]): js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_], Unit] = js.native
    def apply(
      behavior: setting,
      name: onComplete,
      value: js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: onError, value: js.UndefOr[scala.Nothing]): js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_], Unit] = js.native
    def apply(
      behavior: setting,
      name: onError,
      value: js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: onFailure, value: js.UndefOr[scala.Nothing]): js.Function2[/* response */ js.Any, /* element */ JQuery, Unit] = js.native
    def apply(
      behavior: setting,
      name: onFailure,
      value: js.Function2[/* response */ js.Any, /* element */ JQuery, Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: onRequest, value: js.UndefOr[scala.Nothing]): js.Function2[/* promise */ Deferred[_, _, _], /* xhr */ jqXHR[_], Unit] = js.native
    def apply(
      behavior: setting,
      name: onRequest,
      value: js.Function2[/* promise */ Deferred[_, _, _], /* xhr */ jqXHR[_], Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: onResponse, value: js.UndefOr[scala.Nothing]): js.Function1[/* response */ js.Any, Unit] = js.native
    def apply(behavior: setting, name: onResponse, value: js.Function1[/* response */ js.Any, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onSuccess, value: js.UndefOr[scala.Nothing]): js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_], Unit] = js.native
    def apply(
      behavior: setting,
      name: onSuccess,
      value: js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: on, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: on, value: String): JQuery = js.native
    def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: regExp, value: js.UndefOr[scala.Nothing]): RegExpSettings = js.native
    def apply(behavior: setting, name: responseAsync, value: js.UndefOr[scala.Nothing]): (js.Function2[
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
    def apply(behavior: setting, name: response, value: js.UndefOr[scala.Nothing]): js.Any | `false` = js.native
    def apply(behavior: setting, name: response, value: js.Any): JQuery = js.native
    def apply(behavior: setting, name: response, value: `false`): JQuery = js.native
    def apply(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
    def apply(behavior: setting, name: serializeForm, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: serializeForm, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: stateContext, value: js.UndefOr[scala.Nothing]): String | JQuery = js.native
    def apply(behavior: setting, name: stateContext, value: String): JQuery = js.native
    def apply(behavior: setting, name: stateContext, value: JQuery): JQuery = js.native
    def apply(behavior: setting, name: successTest, value: js.UndefOr[scala.Nothing]): js.Function1[/* response */ js.Any, Boolean] = js.native
    def apply(behavior: setting, name: successTest, value: js.Function1[/* response */ js.Any, Boolean]): JQuery = js.native
    def apply(behavior: setting, name: throttleFirstRequest, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: throttleFirstRequest, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: throttle, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: throttle, value: Double): JQuery = js.native
    def apply(behavior: setting, name: urlData, value: js.UndefOr[scala.Nothing]): js.Any | `false` = js.native
    def apply(behavior: setting, name: urlData, value: js.Any): JQuery = js.native
    def apply(behavior: setting, name: urlData, value: `false`): JQuery = js.native
    def apply(behavior: setting, name: url, value: js.UndefOr[scala.Nothing]): String | `false` = js.native
    def apply(behavior: setting, name: url, value: String): JQuery = js.native
    def apply(behavior: setting, name: url, value: `false`): JQuery = js.native
    def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
    def apply(behavior: setting, value: ApiSettings): JQuery = js.native
    def apply(settings: ApiSettings): JQuery = js.native
    
    var settings: ApiSettings = js.native
  }
  object Api {
    
    object ClassNameSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'error'
          */
        var error: String = js.native
        
        /**
          * @default 'loading'
          */
        var loading: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(error: String, loading: String): Impl = {
          val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplloading | PickImplerrorError) with PartialPickImplkeyofImplError
    }
    type ClassNameSettings = Param
    
    object ErrorSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'JSON could not be parsed during error handling'
          */
        var JSONParse: String = js.native
        
        /**
          * @default 'The before send function has aborted the request'
          */
        var beforeSend: String = js.native
        
        /**
          * @default 'There was an error with your request'
          */
        var error: String = js.native
        
        /**
          * @default 'API Request Aborted. Exit conditions met'
          */
        var exitConditions: String = js.native
        
        /**
          * @default 'You are using legacy API success callback names'
          */
        var legacyParameters: String = js.native
        
        /**
          * @default 'API action used but no url was defined'
          */
        var missingAction: String = js.native
        
        /**
          * @default 'Required dependency jquery-serialize-object missing, using basic serialize'
          */
        var missingSerialize: String = js.native
        
        /**
          * @default 'No URL specified for API event'
          */
        var missingURL: String = js.native
        
        /**
          * @default 'The beforeSend callback must return a settings object, beforeSend ignored.'
          */
        var noReturnedValue: String = js.native
        
        /**
          * @default 'There was an error parsing your request'
          */
        var parseError: String = js.native
        
        /**
          * @default 'Missing a required URL parameter: '
          */
        var requiredParameter: String = js.native
        
        /**
          * @default 'Server gave an error: '
          */
        var statusMessage: String = js.native
        
        /**
          * @default 'Your request timed out'
          */
        var timeout: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(
          JSONParse: String,
          beforeSend: String,
          error: String,
          exitConditions: String,
          legacyParameters: String,
          missingAction: String,
          missingSerialize: String,
          missingURL: String,
          noReturnedValue: String,
          parseError: String,
          requiredParameter: String,
          statusMessage: String,
          timeout: String
        ): Impl = {
          val __obj = js.Dynamic.literal(JSONParse = JSONParse.asInstanceOf[js.Any], beforeSend = beforeSend.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], exitConditions = exitConditions.asInstanceOf[js.Any], legacyParameters = legacyParameters.asInstanceOf[js.Any], missingAction = missingAction.asInstanceOf[js.Any], missingSerialize = missingSerialize.asInstanceOf[js.Any], missingURL = missingURL.asInstanceOf[js.Any], noReturnedValue = noReturnedValue.asInstanceOf[js.Any], parseError = parseError.asInstanceOf[js.Any], requiredParameter = requiredParameter.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setBeforeSend(value: String): Self = StObject.set(x, "beforeSend", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setExitConditions(value: String): Self = StObject.set(x, "exitConditions", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setJSONParse(value: String): Self = StObject.set(x, "JSONParse", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLegacyParameters(value: String): Self = StObject.set(x, "legacyParameters", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMissingAction(value: String): Self = StObject.set(x, "missingAction", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMissingSerialize(value: String): Self = StObject.set(x, "missingSerialize", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMissingURL(value: String): Self = StObject.set(x, "missingURL", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNoReturnedValue(value: String): Self = StObject.set(x, "noReturnedValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setParseError(value: String): Self = StObject.set(x, "parseError", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRequiredParameter(value: String): Self = StObject.set(x, "requiredParameter", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplbeforeSendBeforeSend | PickImplerrorError | PickImplexitConditions | PickImplJSONParse | PickImpllegacyParameters | PickImplmissingAction | PickImplmissingSerialize | PickImplmissingURL | PickImplnoReturnedValue | PickImplparseError | PickImplrequiredParameter | PickImplstatusMessage | PickImpltimeout) with PartialPickImplkeyofImplBeforeSend
    }
    type ErrorSettings = typingsSlinky.semanticUiApi.SemanticUI.Api.ErrorSettings.Param
    
    object MetadataSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'action'
          */
        var action: String = js.native
        
        /**
          * @default 'url'
          */
        var url: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(action: String, url: String): Impl = {
          val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplactionAction | PickImplurlUrl) with PartialPickImplkeyofImplAction
    }
    type MetadataSettings = typingsSlinky.semanticUiApi.SemanticUI.Api.MetadataSettings.Param
    
    object RegExpSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default /\{\/\$*[A-z0-9]+\}/g
          */
        var optional: js.RegExp = js.native
        
        /**
          * @default /\{\$*[A-z0-9]+\}/g
          */
        var required: js.RegExp = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(optional: js.RegExp, required: js.RegExp): Impl = {
          val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setOptional(value: js.RegExp): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRequired(value: js.RegExp): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplrequired | PickImploptional) with PartialPickImplkeyofImplOptional
    }
    type RegExpSettings = typingsSlinky.semanticUiApi.SemanticUI.Api.RegExpSettings.Param
    
    object SelectorSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default '.disabled'
          */
        var disabled: String = js.native
        
        /**
          * @default 'form'
          */
        var form: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(disabled: String, form: String): Impl = {
          val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImpldisabled | PickImplform) with PartialPickImplkeyofImplDisabled
    }
    type SelectorSettings = typingsSlinky.semanticUiApi.SemanticUI.Api.SelectorSettings.Param
  }
  
  object ApiSettings {
    
    @js.native
    trait Impl extends StObject {
      
      // endregion
      // region Request Settings
      /**
        * Named API action for query, originally specified in $.fn.settings.api
        */
      var action: String | `false` = js.native
      
      var api: StringDictionary[String] = js.native
      
      // endregion
      // region Callbacks
      /**
        * Allows modifying settings before request, or cancelling request
        */
      def beforeSend(settings: ApiSettings): js.Any = js.native
      
      /**
        * Allows modifying XHR object for request
        */
      def beforeXHR(xhrObject: jqXHR[_]): js.Any = js.native
      
      /**
        * Can be set to 'local' to cache successful returned AJAX responses when using a JSON API.
        * This helps avoid server round trips when API endpoints will return the same results when accessed repeatedly.
        * Setting to false, will add cache busting parameters to the URL.
        *
        * @default true
        */
      var cache: local | Boolean = js.native
      
      /**
        * Class names used to determine element state
        */
      var className: ClassNameSettings = js.native
      
      /**
        * POST/GET Data to Send with Request
        */
      var data: js.Any = js.native
      
      /**
        * Expected data type of response
        */
      var dataType: xml | json | jsonp | script | html | text = js.native
      
      /**
        * Debug output to console
        */
      var debug: Boolean = js.native
      
      /**
        * Whether to automatically include default data like {value} and {text}
        *
        * @default true
        */
      var defaultData: Boolean = js.native
      
      /**
        * Whether to encode parameters with encodeURIComponent before adding into url string
        *
        * @default true
        */
      var encodeParameters: Boolean = js.native
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings = js.native
      
      /**
        * Setting to true, will not remove error.
        * Setting to a duration in milliseconds to show error state after request error.
        *
        * @default 2000
        */
      var errorDuration: `true` | Double = js.native
      
      /**
        * The default auto will automatically remove error state after error duration, unless the element is a form
        *
        * @default 'auto'
        */
      var hideError: auto | Boolean = js.native
      
      /**
        * Whether an API request can occur while another request is still pending
        *
        * @default false
        */
      var interruptRequests: Boolean = js.native
      
      /**
        * Minimum duration to show loading indication
        *
        * @default 0
        */
      var loadingDuration: Double = js.native
      
      /**
        * Metadata used to store XHR and response promise
        */
      var metadata: MetadataSettings = js.native
      
      /**
        * Method for transmitting request to server
        */
      var method: post | get | put | delete | head | options | patch = js.native
      
      /**
        * @see response
        */
      var mockResponse: js.Any | `false` = js.native
      
      /**
        * @see responseAsync
        */
      var mockResponseAsync: (js.Function2[
            /* settings */ ApiSettings, 
            /* callback */ js.Function1[/* response */ js.Any, Unit], 
            Unit
          ]) | `false` = js.native
      
      // endregion
      // region Debug Settings
      /**
        * Name used in log statements
        */
      var name: String = js.native
      
      // endregion
      // region Component Settings
      // region DOM Settings
      /**
        * Event namespace. Makes sure module teardown does not effect other events attached to an element.
        */
      var namespace: String = js.native
      
      // region Behavior
      /**
        * When API event should occur
        *
        * @default 'auto'
        */
      var on: String = js.native
      
      /**
        * Callback on abort caused by user clicking a link or manually cancelling request.
        */
      def onAbort(errorMessage: String, element: JQuery, xhr: jqXHR[_]): Unit = js.native
      
      /**
        * Callback on request complete regardless of conditions
        */
      def onComplete(response: js.Any, element: JQuery, xhr: jqXHR[_]): Unit = js.native
      
      /**
        * Callback on server error from returned status code, or XHR failure.
        */
      def onError(errorMessage: String, element: JQuery, xhr: jqXHR[_]): Unit = js.native
      
      /**
        * Callback on failed response, or JSON response that fails successTest
        */
      def onFailure(response: js.Any, element: JQuery): Unit = js.native
      
      /**
        * Callback that occurs when request is made. Receives both the API success promise and the XHR request promise.
        */
      def onRequest(promise: Deferred[_, _, _], xhr: jqXHR[_]): Unit = js.native
      
      /**
        * Allows modifying the server's response before parsed by other callbacks to determine API event success
        */
      def onResponse(response: js.Any): Unit = js.native
      
      /**
        * Callback after successful response, JSON response must pass successTest
        */
      def onSuccess(response: js.Any, element: JQuery, xhr: jqXHR[_]): Unit = js.native
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean = js.native
      
      // endregion
      // region DOM Settings
      /**
        * Regular expressions used for template matching
        */
      var regExp: RegExpSettings = js.native
      
      /**
        * Can be set to a Javascript object which will be returned automatically instead of requesting JSON from server
        */
      var response: js.Any | `false` = js.native
      
      /**
        * When specified, this function can be used to retrieve content from a server and return it asynchronously instead of a standard AJAX call.
        * The callback function should return the server response.
        *
        * @default false
        */
      var responseAsync: (js.Function2[
            /* settings */ ApiSettings, 
            /* callback */ js.Function1[/* response */ js.Any, Unit], 
            Unit
          ]) | `false` = js.native
      
      /**
        * Selectors used to find parts of a module
        */
      var selector: SelectorSettings = js.native
      
      /**
        * Whether to serialize closest form and include in request
        *
        * @default false
        */
      var serializeForm: Boolean = js.native
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean = js.native
      
      /**
        * UI state will be applied to this element, defaults to triggering element.
        */
      var stateContext: String | JQuery = js.native
      
      /**
        * Determines whether completed JSON response should be treated as successful
        *
        * @see {@link http://semantic-ui.com/behaviors/api.html#determining-json-success}
        */
      def successTest(response: js.Any): Boolean = js.native
      
      /**
        * How long to wait when a request is made before triggering request, useful for rate limiting oninput
        *
        * @default 0
        */
      var throttle: Double = js.native
      
      /**
        * When set to false will not delay the first request made, when no others are queued
        *
        * @default true
        */
      var throttleFirstRequest: Boolean = js.native
      
      /**
        * Templated URL for query, will override specified action
        */
      var url: String | `false` = js.native
      
      /**
        * Variables to use for replacement
        */
      var urlData: js.Any | `false` = js.native
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(
        action: String | `false`,
        api: StringDictionary[String],
        beforeSend: ApiSettings => js.Any,
        beforeXHR: jqXHR[_] => js.Any,
        cache: local | Boolean,
        className: ClassNameSettings,
        data: js.Any,
        dataType: xml | json | jsonp | script | html | text,
        debug: Boolean,
        defaultData: Boolean,
        encodeParameters: Boolean,
        error: ErrorSettings,
        errorDuration: `true` | Double,
        hideError: auto | Boolean,
        interruptRequests: Boolean,
        loadingDuration: Double,
        metadata: MetadataSettings,
        method: post | get | put | delete | head | options | patch,
        mockResponse: js.Any | `false`,
        mockResponseAsync: (js.Function2[
              /* settings */ ApiSettings, 
              /* callback */ js.Function1[/* response */ js.Any, Unit], 
              Unit
            ]) | `false`,
        name: String,
        namespace: String,
        on: String,
        onAbort: (String, JQuery, jqXHR[_]) => Unit,
        onComplete: (js.Any, JQuery, jqXHR[_]) => Unit,
        onError: (String, JQuery, jqXHR[_]) => Unit,
        onFailure: (js.Any, JQuery) => Unit,
        onRequest: (Deferred[_, _, _], jqXHR[_]) => Unit,
        onResponse: js.Any => Unit,
        onSuccess: (js.Any, JQuery, jqXHR[_]) => Unit,
        performance: Boolean,
        regExp: RegExpSettings,
        response: js.Any | `false`,
        responseAsync: (js.Function2[
              /* settings */ ApiSettings, 
              /* callback */ js.Function1[/* response */ js.Any, Unit], 
              Unit
            ]) | `false`,
        selector: SelectorSettings,
        serializeForm: Boolean,
        silent: Boolean,
        stateContext: String | JQuery,
        successTest: js.Any => Boolean,
        throttle: Double,
        throttleFirstRequest: Boolean,
        url: String | `false`,
        urlData: js.Any | `false`,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], beforeSend = js.Any.fromFunction1(beforeSend), beforeXHR = js.Any.fromFunction1(beforeXHR), cache = cache.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], defaultData = defaultData.asInstanceOf[js.Any], encodeParameters = encodeParameters.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], errorDuration = errorDuration.asInstanceOf[js.Any], hideError = hideError.asInstanceOf[js.Any], interruptRequests = interruptRequests.asInstanceOf[js.Any], loadingDuration = loadingDuration.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], mockResponse = mockResponse.asInstanceOf[js.Any], mockResponseAsync = mockResponseAsync.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], onAbort = js.Any.fromFunction3(onAbort), onComplete = js.Any.fromFunction3(onComplete), onError = js.Any.fromFunction3(onError), onFailure = js.Any.fromFunction2(onFailure), onRequest = js.Any.fromFunction2(onRequest), onResponse = js.Any.fromFunction1(onResponse), onSuccess = js.Any.fromFunction3(onSuccess), performance = performance.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseAsync = responseAsync.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], serializeForm = serializeForm.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], stateContext = stateContext.asInstanceOf[js.Any], successTest = js.Any.fromFunction1(successTest), throttle = throttle.asInstanceOf[js.Any], throttleFirstRequest = throttleFirstRequest.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urlData = urlData.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAction(value: String | `false`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setApi(value: StringDictionary[String]): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBeforeSend(value: ApiSettings => js.Any): Self = StObject.set(x, "beforeSend", js.Any.fromFunction1(value))
        
        @scala.inline
        def setBeforeXHR(value: jqXHR[_] => js.Any): Self = StObject.set(x, "beforeXHR", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCache(value: local | Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataType(value: xml | json | jsonp | script | html | text): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultData(value: Boolean): Self = StObject.set(x, "defaultData", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEncodeParameters(value: Boolean): Self = StObject.set(x, "encodeParameters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorDuration(value: `true` | Double): Self = StObject.set(x, "errorDuration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHideError(value: auto | Boolean): Self = StObject.set(x, "hideError", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInterruptRequests(value: Boolean): Self = StObject.set(x, "interruptRequests", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLoadingDuration(value: Double): Self = StObject.set(x, "loadingDuration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethod(value: post | get | put | delete | head | options | patch): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
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
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOn(value: String): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnAbort(value: (String, JQuery, jqXHR[_]) => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction3(value))
        
        @scala.inline
        def setOnComplete(value: (js.Any, JQuery, jqXHR[_]) => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction3(value))
        
        @scala.inline
        def setOnError(value: (String, JQuery, jqXHR[_]) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction3(value))
        
        @scala.inline
        def setOnFailure(value: (js.Any, JQuery) => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOnRequest(value: (Deferred[_, _, _], jqXHR[_]) => Unit): Self = StObject.set(x, "onRequest", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOnResponse(value: js.Any => Unit): Self = StObject.set(x, "onResponse", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnSuccess(value: (js.Any, JQuery, jqXHR[_]) => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction3(value))
        
        @scala.inline
        def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegExp(value: RegExpSettings): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
        
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
        def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSerializeForm(value: Boolean): Self = StObject.set(x, "serializeForm", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStateContext(value: String | JQuery): Self = StObject.set(x, "stateContext", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSuccessTest(value: js.Any => Boolean): Self = StObject.set(x, "successTest", js.Any.fromFunction1(value))
        
        @scala.inline
        def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThrottleFirstRequest(value: Boolean): Self = StObject.set(x, "throttleFirstRequest", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrl(value: String | `false`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlData(value: js.Any | `false`): Self = StObject.set(x, "urlData", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImplapi | PickImplon | PickImplcache | PickImplstateContext | PickImplencodeParameters | PickImpldefaultData | PickImplserializeForm | PickImplthrottle | PickImplthrottleFirstRequ | PickImplinterruptRequests | PickImplloadingDuration | PickImplhideError | PickImplerrorDuration | PickImplaction | PickImplurl | PickImplurlData | PickImplresponse | PickImplresponseAsync | PickImplmockResponse | PickImplmockResponseAsync | PickImplmethod | PickImpldataType | PickImpldata | PickImplbeforeSend | PickImplbeforeXHR | PickImplonRequest | PickImplonResponse | PickImplsuccessTest | PickImplonSuccess | PickImplonComplete | PickImplonFailure | PickImplonError | PickImplonAbort | PickImplregExp | PickImplselector | PickImplclassName | PickImplmetadata | PickImplerror | PickImplnamespace | PickImplname | PickImplsilent | PickImpldebug | PickImplperformance | PickImplverbose) with PartialPickImplkeyofImpl
  }
  /**
    * @see {@link http://semantic-ui.com/behaviors/api.html#/settings}
    */
  type ApiSettings = typingsSlinky.semanticUiApi.SemanticUI.ApiSettings.Param
}

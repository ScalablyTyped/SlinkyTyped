package typingsSlinky.semanticDashUiDashApi.SemanticUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ApiSettings {
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.action
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.api
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.beforeSend
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.beforeXHR
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.cache
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.className
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.data
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.dataType
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.debug
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.defaultData
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.encodeParameters
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.error
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.errorDuration
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.hideError
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.interruptRequests
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.loadingDuration
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.metadata
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.method
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.mockResponse
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.mockResponseAsync
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.name
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.namespace
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.on
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.onAbort
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.onComplete
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.onError
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.onFailure
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.onRequest
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.onResponse
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.onSuccess
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.performance
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.regExp
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.response
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.responseAsync
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.selector
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.serializeForm
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.silent
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.stateContext
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.successTest
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.throttle
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.throttleFirstRequest
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.url
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.urlData
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.verbose
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    api | on | cache | stateContext | encodeParameters | defaultData | serializeForm | throttle | throttleFirstRequest | interruptRequests | loadingDuration | hideError | errorDuration | action | url | urlData | response | responseAsync | mockResponse | mockResponseAsync | method | dataType | data | beforeSend | beforeXHR | onRequest | onResponse | successTest | onSuccess | onComplete | onFailure | onError | onAbort | regExp | selector | className | metadata | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      api | on | cache | stateContext | encodeParameters | defaultData | serializeForm | throttle | throttleFirstRequest | interruptRequests | loadingDuration | hideError | errorDuration | action | url | urlData | response | responseAsync | mockResponse | mockResponseAsync | method | dataType | data | regExp | selector | className | metadata | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}

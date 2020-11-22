package typingsSlinky.sentryCore

import typingsSlinky.sentryCore.apiMod.API
import typingsSlinky.sentryTypes.eventMod.Event
import typingsSlinky.sentryTypes.requestMod.SentryRequest
import typingsSlinky.sentryTypes.sessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/core/dist/request", JSImport.Namespace)
@js.native
object requestMod extends js.Object {
  
  def eventToSentryRequest(event: Event, api: API): SentryRequest = js.native
  
  def sessionToSentryRequest(session: Session, api: API): SentryRequest = js.native
}

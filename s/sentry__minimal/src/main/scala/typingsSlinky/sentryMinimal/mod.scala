package typingsSlinky.sentryMinimal

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sentryHub.mod.Scope
import typingsSlinky.sentryTypes.breadcrumbMod.Breadcrumb
import typingsSlinky.sentryTypes.eventMod.Event
import typingsSlinky.sentryTypes.extraMod.Extra
import typingsSlinky.sentryTypes.extraMod.Extras
import typingsSlinky.sentryTypes.scopeMod.CaptureContext
import typingsSlinky.sentryTypes.severityMod.Severity
import typingsSlinky.sentryTypes.transactionMod.CustomSamplingContext
import typingsSlinky.sentryTypes.transactionMod.Transaction
import typingsSlinky.sentryTypes.transactionMod.TransactionContext
import typingsSlinky.sentryTypes.userMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sentry/minimal", "addBreadcrumb")
  @js.native
  def addBreadcrumb(breadcrumb: Breadcrumb): Unit = js.native
  
  @JSImport("@sentry/minimal", "_callOnClient")
  @js.native
  def callOnClient(method: String, args: js.Any*): Unit = js.native
  
  @JSImport("@sentry/minimal", "captureEvent")
  @js.native
  def captureEvent(event: Event): String = js.native
  
  @JSImport("@sentry/minimal", "captureException")
  @js.native
  def captureException(exception: js.Any): String = js.native
  @JSImport("@sentry/minimal", "captureException")
  @js.native
  def captureException(exception: js.Any, captureContext: CaptureContext): String = js.native
  
  @JSImport("@sentry/minimal", "captureMessage")
  @js.native
  def captureMessage(message: String): String = js.native
  @JSImport("@sentry/minimal", "captureMessage")
  @js.native
  def captureMessage(message: String, captureContext: CaptureContext): String = js.native
  @JSImport("@sentry/minimal", "captureMessage")
  @js.native
  def captureMessage(message: String, captureContext: Severity): String = js.native
  
  @JSImport("@sentry/minimal", "configureScope")
  @js.native
  def configureScope(callback: js.Function1[/* scope */ Scope, Unit]): Unit = js.native
  
  @JSImport("@sentry/minimal", "setContext")
  @js.native
  def setContext(name: String): Unit = js.native
  @JSImport("@sentry/minimal", "setContext")
  @js.native
  def setContext(name: String, context: StringDictionary[js.Any]): Unit = js.native
  
  @JSImport("@sentry/minimal", "setExtra")
  @js.native
  def setExtra(key: String, extra: Extra): Unit = js.native
  
  @JSImport("@sentry/minimal", "setExtras")
  @js.native
  def setExtras(extras: Extras): Unit = js.native
  
  @JSImport("@sentry/minimal", "setTag")
  @js.native
  def setTag(key: String, value: String): Unit = js.native
  
  @JSImport("@sentry/minimal", "setTags")
  @js.native
  def setTags(tags: StringDictionary[String]): Unit = js.native
  
  @JSImport("@sentry/minimal", "setUser")
  @js.native
  def setUser(): Unit = js.native
  @JSImport("@sentry/minimal", "setUser")
  @js.native
  def setUser(user: User): Unit = js.native
  
  @JSImport("@sentry/minimal", "startTransaction")
  @js.native
  def startTransaction(context: TransactionContext): Transaction = js.native
  @JSImport("@sentry/minimal", "startTransaction")
  @js.native
  def startTransaction(context: TransactionContext, customSamplingContext: CustomSamplingContext): Transaction = js.native
  
  @JSImport("@sentry/minimal", "withScope")
  @js.native
  def withScope(callback: js.Function1[/* scope */ Scope, Unit]): Unit = js.native
}

package typingsSlinky.sentryBrowser

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sentryBrowser.backendMod.BrowserOptions
import typingsSlinky.sentryBrowser.helpersMod.ReportDialogOptions
import typingsSlinky.sentryBrowser.integrationsMod.Breadcrumbs
import typingsSlinky.sentryBrowser.integrationsMod.GlobalHandlers
import typingsSlinky.sentryBrowser.integrationsMod.LinkedErrors
import typingsSlinky.sentryBrowser.integrationsMod.TryCatch
import typingsSlinky.sentryBrowser.integrationsMod.UserAgent
import typingsSlinky.sentryCore.mod.Integrations.FunctionToString
import typingsSlinky.sentryCore.mod.Integrations.InboundFilters
import typingsSlinky.sentryHub.interfacesMod.Carrier
import typingsSlinky.sentryTypes.breadcrumbMod.Breadcrumb
import typingsSlinky.sentryTypes.clientMod.Client
import typingsSlinky.sentryTypes.eventMod.Event
import typingsSlinky.sentryTypes.eventMod.EventHint
import typingsSlinky.sentryTypes.eventprocessorMod.EventProcessor
import typingsSlinky.sentryTypes.extraMod.Extra
import typingsSlinky.sentryTypes.extraMod.Extras
import typingsSlinky.sentryTypes.optionsMod.Options
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

object exportsMod {
  
  @JSImport("@sentry/browser/dist/exports", "BrowserClient")
  @js.native
  /**
    * Creates a new Browser SDK instance.
    *
    * @param options Configuration options for this SDK.
    */
  class BrowserClient ()
    extends typingsSlinky.sentryBrowser.clientMod.BrowserClient {
    def this(options: BrowserOptions) = this()
  }
  
  @JSImport("@sentry/browser/dist/exports", "Hub")
  @js.native
  /**
    * Creates a new instance of the hub, will push one {@link Layer} into the
    * internal stack on creation.
    *
    * @param client bound to the hub.
    * @param scope bound to the hub.
    * @param version number, higher number means higher priority.
    */
  class Hub ()
    extends typingsSlinky.sentryCore.mod.Hub {
    def this(client: Client[Options]) = this()
    def this(client: js.UndefOr[scala.Nothing], scope: typingsSlinky.sentryHub.scopeMod.Scope) = this()
    def this(client: Client[Options], scope: typingsSlinky.sentryHub.scopeMod.Scope) = this()
    def this(client: js.UndefOr[scala.Nothing], scope: js.UndefOr[scala.Nothing], _version: Double) = this()
    def this(client: js.UndefOr[scala.Nothing], scope: typingsSlinky.sentryHub.scopeMod.Scope, _version: Double) = this()
    def this(client: Client[Options], scope: js.UndefOr[scala.Nothing], _version: Double) = this()
    def this(client: Client[Options], scope: typingsSlinky.sentryHub.scopeMod.Scope, _version: Double) = this()
  }
  
  @JSImport("@sentry/browser/dist/exports", "SDK_NAME")
  @js.native
  val SDK_NAME: /* "sentry.javascript.browser" */ String = js.native
  
  @JSImport("@sentry/browser/dist/exports", "SDK_VERSION")
  @js.native
  val SDK_VERSION: /* "5.27.4" */ String = js.native
  
  @JSImport("@sentry/browser/dist/exports", "Scope")
  @js.native
  class Scope ()
    extends typingsSlinky.sentryCore.mod.Scope
  /* static members */
  object Scope {
    
    @JSImport("@sentry/browser/dist/exports", "Scope.clone")
    @js.native
    def clone(scope: typingsSlinky.sentryHub.scopeMod.Scope): typingsSlinky.sentryHub.scopeMod.Scope = js.native
  }
  
  @JSImport("@sentry/browser/dist/exports", "Severity")
  @js.native
  object Severity extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.sentryTypes.severityMod.Severity with String] = js.native
    
    /* "critical" */ val Critical: typingsSlinky.sentryTypes.severityMod.Severity.Critical with String = js.native
    
    /* "debug" */ val Debug: typingsSlinky.sentryTypes.severityMod.Severity.Debug with String = js.native
    
    /* "error" */ val Error: typingsSlinky.sentryTypes.severityMod.Severity.Error with String = js.native
    
    /* "fatal" */ val Fatal: typingsSlinky.sentryTypes.severityMod.Severity.Fatal with String = js.native
    
    /* "info" */ val Info: typingsSlinky.sentryTypes.severityMod.Severity.Info with String = js.native
    
    /* "log" */ val Log: typingsSlinky.sentryTypes.severityMod.Severity.Log with String = js.native
    
    /* "warning" */ val Warning: typingsSlinky.sentryTypes.severityMod.Severity.Warning with String = js.native
    
    /**
      * Converts a string-based level into a {@link Severity}.
      *
      * @param level string representation of Severity
      * @returns Severity
      */
    def fromString(level: String): typingsSlinky.sentryTypes.severityMod.Severity = js.native
  }
  
  @JSImport("@sentry/browser/dist/exports", "Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.sentryTypes.statusMod.Status with String] = js.native
    
    /* "failed" */ val Failed: typingsSlinky.sentryTypes.statusMod.Status.Failed with String = js.native
    
    /* "invalid" */ val Invalid: typingsSlinky.sentryTypes.statusMod.Status.Invalid with String = js.native
    
    /* "rate_limit" */ val RateLimit: typingsSlinky.sentryTypes.statusMod.Status.RateLimit with String = js.native
    
    /* "skipped" */ val Skipped: typingsSlinky.sentryTypes.statusMod.Status.Skipped with String = js.native
    
    /* "success" */ val Success: typingsSlinky.sentryTypes.statusMod.Status.Success with String = js.native
    
    /* "unknown" */ val Unknown: typingsSlinky.sentryTypes.statusMod.Status.Unknown with String = js.native
    
    /**
      * Converts a HTTP status code into a {@link Status}.
      *
      * @param code The HTTP response status code.
      * @returns The send status or {@link Status.Unknown}.
      */
    def fromHttpCode(code: Double): typingsSlinky.sentryTypes.statusMod.Status = js.native
  }
  
  @JSImport("@sentry/browser/dist/exports", "addBreadcrumb")
  @js.native
  def addBreadcrumb(breadcrumb: Breadcrumb): Unit = js.native
  
  @JSImport("@sentry/browser/dist/exports", "addGlobalEventProcessor")
  @js.native
  def addGlobalEventProcessor(callback: EventProcessor): Unit = js.native
  
  @JSImport("@sentry/browser/dist/exports", "captureEvent")
  @js.native
  def captureEvent(event: Event): String = js.native
  
  @JSImport("@sentry/browser/dist/exports", "captureException")
  @js.native
  def captureException(exception: js.Any): String = js.native
  @JSImport("@sentry/browser/dist/exports", "captureException")
  @js.native
  def captureException(exception: js.Any, captureContext: CaptureContext): String = js.native
  
  @JSImport("@sentry/browser/dist/exports", "captureMessage")
  @js.native
  def captureMessage(message: String): String = js.native
  @JSImport("@sentry/browser/dist/exports", "captureMessage")
  @js.native
  def captureMessage(message: String, captureContext: CaptureContext): String = js.native
  @JSImport("@sentry/browser/dist/exports", "captureMessage")
  @js.native
  def captureMessage(message: String, captureContext: Severity): String = js.native
  
  @JSImport("@sentry/browser/dist/exports", "close")
  @js.native
  def close(): js.Thenable[Boolean] = js.native
  @JSImport("@sentry/browser/dist/exports", "close")
  @js.native
  def close(timeout: Double): js.Thenable[Boolean] = js.native
  
  @JSImport("@sentry/browser/dist/exports", "configureScope")
  @js.native
  def configureScope(callback: js.Function1[/* scope */ typingsSlinky.sentryHub.mod.Scope, Unit]): Unit = js.native
  
  @JSImport("@sentry/browser/dist/exports", "defaultIntegrations")
  @js.native
  val defaultIntegrations: js.Array[
    FunctionToString | InboundFilters | GlobalHandlers | TryCatch | Breadcrumbs | LinkedErrors | UserAgent
  ] = js.native
  
  @JSImport("@sentry/browser/dist/exports", "eventFromException")
  @js.native
  def eventFromException(options: Options, exception: js.Any): js.Thenable[Event] = js.native
  @JSImport("@sentry/browser/dist/exports", "eventFromException")
  @js.native
  def eventFromException(options: Options, exception: js.Any, hint: EventHint): js.Thenable[Event] = js.native
  
  @JSImport("@sentry/browser/dist/exports", "eventFromMessage")
  @js.native
  def eventFromMessage(options: Options, message: String): js.Thenable[Event] = js.native
  @JSImport("@sentry/browser/dist/exports", "eventFromMessage")
  @js.native
  def eventFromMessage(options: Options, message: String, level: js.UndefOr[scala.Nothing], hint: EventHint): js.Thenable[Event] = js.native
  @JSImport("@sentry/browser/dist/exports", "eventFromMessage")
  @js.native
  def eventFromMessage(options: Options, message: String, level: Severity): js.Thenable[Event] = js.native
  @JSImport("@sentry/browser/dist/exports", "eventFromMessage")
  @js.native
  def eventFromMessage(options: Options, message: String, level: Severity, hint: EventHint): js.Thenable[Event] = js.native
  
  @JSImport("@sentry/browser/dist/exports", "flush")
  @js.native
  def flush(): js.Thenable[Boolean] = js.native
  @JSImport("@sentry/browser/dist/exports", "flush")
  @js.native
  def flush(timeout: Double): js.Thenable[Boolean] = js.native
  
  @JSImport("@sentry/browser/dist/exports", "forceLoad")
  @js.native
  def forceLoad(): Unit = js.native
  
  @JSImport("@sentry/browser/dist/exports", "getCurrentHub")
  @js.native
  def getCurrentHub(): typingsSlinky.sentryHub.hubMod.Hub = js.native
  
  @JSImport("@sentry/browser/dist/exports", "getHubFromCarrier")
  @js.native
  def getHubFromCarrier(carrier: Carrier): typingsSlinky.sentryHub.hubMod.Hub = js.native
  
  @JSImport("@sentry/browser/dist/exports", "init")
  @js.native
  def init(): Unit = js.native
  @JSImport("@sentry/browser/dist/exports", "init")
  @js.native
  def init(options: BrowserOptions): Unit = js.native
  
  @JSImport("@sentry/browser/dist/exports", "injectReportDialog")
  @js.native
  def injectReportDialog(): Unit = js.native
  @JSImport("@sentry/browser/dist/exports", "injectReportDialog")
  @js.native
  def injectReportDialog(options: ReportDialogOptions): Unit = js.native
  
  @JSImport("@sentry/browser/dist/exports", "lastEventId")
  @js.native
  def lastEventId(): js.UndefOr[String] = js.native
  
  @JSImport("@sentry/browser/dist/exports", "makeMain")
  @js.native
  def makeMain(hub: typingsSlinky.sentryHub.hubMod.Hub): typingsSlinky.sentryHub.hubMod.Hub = js.native
  
  @JSImport("@sentry/browser/dist/exports", "onLoad")
  @js.native
  def onLoad(callback: js.Function0[Unit]): Unit = js.native
  
  @JSImport("@sentry/browser/dist/exports", "setContext")
  @js.native
  def setContext(name: String): Unit = js.native
  @JSImport("@sentry/browser/dist/exports", "setContext")
  @js.native
  def setContext(name: String, context: StringDictionary[js.Any]): Unit = js.native
  
  @JSImport("@sentry/browser/dist/exports", "setExtra")
  @js.native
  def setExtra(key: String, extra: Extra): Unit = js.native
  
  @JSImport("@sentry/browser/dist/exports", "setExtras")
  @js.native
  def setExtras(extras: Extras): Unit = js.native
  
  @JSImport("@sentry/browser/dist/exports", "setTag")
  @js.native
  def setTag(key: String, value: String): Unit = js.native
  
  @JSImport("@sentry/browser/dist/exports", "setTags")
  @js.native
  def setTags(tags: StringDictionary[String]): Unit = js.native
  
  @JSImport("@sentry/browser/dist/exports", "setUser")
  @js.native
  def setUser(): Unit = js.native
  @JSImport("@sentry/browser/dist/exports", "setUser")
  @js.native
  def setUser(user: User): Unit = js.native
  
  @JSImport("@sentry/browser/dist/exports", "showReportDialog")
  @js.native
  def showReportDialog(): Unit = js.native
  @JSImport("@sentry/browser/dist/exports", "showReportDialog")
  @js.native
  def showReportDialog(options: ReportDialogOptions): Unit = js.native
  
  @JSImport("@sentry/browser/dist/exports", "startTransaction")
  @js.native
  def startTransaction(context: TransactionContext): Transaction = js.native
  @JSImport("@sentry/browser/dist/exports", "startTransaction")
  @js.native
  def startTransaction(context: TransactionContext, customSamplingContext: CustomSamplingContext): Transaction = js.native
  
  @JSImport("@sentry/browser/dist/exports", "withScope")
  @js.native
  def withScope(callback: js.Function1[/* scope */ typingsSlinky.sentryHub.mod.Scope, Unit]): Unit = js.native
  
  @JSImport("@sentry/browser/dist/exports", "wrap")
  @js.native
  def wrap(fn: js.Function1[/* args */ js.Any, _]): js.Any = js.native
}

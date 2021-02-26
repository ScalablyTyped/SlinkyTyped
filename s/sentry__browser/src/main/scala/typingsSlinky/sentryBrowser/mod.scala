package typingsSlinky.sentryBrowser

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sentryBrowser.anon.Key
import typingsSlinky.sentryBrowser.anon.PartialBreadcrumbsOptions
import typingsSlinky.sentryBrowser.anon.PartialTryCatchOptions
import typingsSlinky.sentryBrowser.anon.TypeofBreadcrumbs
import typingsSlinky.sentryBrowser.anon.TypeofCoreIntegrations
import typingsSlinky.sentryBrowser.anon.TypeofCoreIntegrationsInstantiable
import typingsSlinky.sentryBrowser.anon.TypeofGlobalHandlers
import typingsSlinky.sentryBrowser.anon.TypeofLinkedErrors
import typingsSlinky.sentryBrowser.anon.TypeofTryCatch
import typingsSlinky.sentryBrowser.anon.TypeofUserAgent
import typingsSlinky.sentryBrowser.backendMod.BrowserOptions
import typingsSlinky.sentryBrowser.globalhandlersMod.GlobalHandlersIntegrations
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
import typingsSlinky.sentryTypes.transportMod.TransportOptions
import typingsSlinky.sentryTypes.userMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sentry/browser", "BrowserClient")
  @js.native
  /**
    * Creates a new Browser SDK instance.
    *
    * @param options Configuration options for this SDK.
    */
  class BrowserClient ()
    extends typingsSlinky.sentryBrowser.exportsMod.BrowserClient {
    def this(options: BrowserOptions) = this()
  }
  
  @JSImport("@sentry/browser", "Hub")
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
    extends typingsSlinky.sentryBrowser.exportsMod.Hub {
    def this(client: Client[Options]) = this()
    def this(client: js.UndefOr[scala.Nothing], scope: typingsSlinky.sentryHub.scopeMod.Scope) = this()
    def this(client: Client[Options], scope: typingsSlinky.sentryHub.scopeMod.Scope) = this()
    def this(client: js.UndefOr[scala.Nothing], scope: js.UndefOr[scala.Nothing], _version: Double) = this()
    def this(client: js.UndefOr[scala.Nothing], scope: typingsSlinky.sentryHub.scopeMod.Scope, _version: Double) = this()
    def this(client: Client[Options], scope: js.UndefOr[scala.Nothing], _version: Double) = this()
    def this(client: Client[Options], scope: typingsSlinky.sentryHub.scopeMod.Scope, _version: Double) = this()
  }
  
  object Integrations {
    
    @JSImport("@sentry/browser", "Integrations")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/browser", "Integrations.Breadcrumbs")
    @js.native
    /**
      * @inheritDoc
      */
    class Breadcrumbs ()
      extends typingsSlinky.sentryBrowser.integrationsMod.Breadcrumbs {
      def this(options: PartialBreadcrumbsOptions) = this()
    }
    @JSImport("@sentry/browser", "Integrations.Breadcrumbs")
    @js.native
    def Breadcrumbs: TypeofBreadcrumbs = js.native
    @scala.inline
    def Breadcrumbs_=(x: TypeofBreadcrumbs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Breadcrumbs")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/browser", "Integrations.FunctionToString")
    @js.native
    class FunctionToString ()
      extends typingsSlinky.sentryCore.mod.Integrations.FunctionToString
    @JSImport("@sentry/browser", "Integrations.FunctionToString")
    @js.native
    def FunctionToString: TypeofCoreIntegrations = js.native
    @scala.inline
    def FunctionToString_=(x: TypeofCoreIntegrations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FunctionToString")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/browser", "Integrations.GlobalHandlers")
    @js.native
    /** JSDoc */
    class GlobalHandlers ()
      extends typingsSlinky.sentryBrowser.integrationsMod.GlobalHandlers {
      def this(options: GlobalHandlersIntegrations) = this()
    }
    @JSImport("@sentry/browser", "Integrations.GlobalHandlers")
    @js.native
    def GlobalHandlers: TypeofGlobalHandlers = js.native
    @scala.inline
    def GlobalHandlers_=(x: TypeofGlobalHandlers): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GlobalHandlers")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/browser", "Integrations.InboundFilters")
    @js.native
    class InboundFilters ()
      extends typingsSlinky.sentryCore.mod.Integrations.InboundFilters
    @JSImport("@sentry/browser", "Integrations.InboundFilters")
    @js.native
    def InboundFilters: TypeofCoreIntegrationsInstantiable = js.native
    @scala.inline
    def InboundFilters_=(x: TypeofCoreIntegrationsInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InboundFilters")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/browser", "Integrations.LinkedErrors")
    @js.native
    /**
      * @inheritDoc
      */
    class LinkedErrors ()
      extends typingsSlinky.sentryBrowser.integrationsMod.LinkedErrors {
      def this(options: Key) = this()
    }
    @JSImport("@sentry/browser", "Integrations.LinkedErrors")
    @js.native
    def LinkedErrors: TypeofLinkedErrors = js.native
    @scala.inline
    def LinkedErrors_=(x: TypeofLinkedErrors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LinkedErrors")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/browser", "Integrations.TryCatch")
    @js.native
    /**
      * @inheritDoc
      */
    class TryCatch ()
      extends typingsSlinky.sentryBrowser.integrationsMod.TryCatch {
      def this(options: PartialTryCatchOptions) = this()
    }
    @JSImport("@sentry/browser", "Integrations.TryCatch")
    @js.native
    def TryCatch: TypeofTryCatch = js.native
    @scala.inline
    def TryCatch_=(x: TypeofTryCatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TryCatch")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@sentry/browser", "Integrations.UserAgent")
    @js.native
    class UserAgent ()
      extends typingsSlinky.sentryBrowser.integrationsMod.UserAgent
    @JSImport("@sentry/browser", "Integrations.UserAgent")
    @js.native
    def UserAgent: TypeofUserAgent = js.native
    @scala.inline
    def UserAgent_=(x: TypeofUserAgent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UserAgent")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/browser", "SDK_NAME")
  @js.native
  val SDK_NAME: /* "sentry.javascript.browser" */ String = js.native
  
  @JSImport("@sentry/browser", "SDK_VERSION")
  @js.native
  val SDK_VERSION: /* "5.27.4" */ String = js.native
  
  @JSImport("@sentry/browser", "Scope")
  @js.native
  class Scope ()
    extends typingsSlinky.sentryBrowser.exportsMod.Scope
  /* static members */
  object Scope {
    
    @JSImport("@sentry/browser", "Scope.clone")
    @js.native
    def clone(scope: typingsSlinky.sentryHub.scopeMod.Scope): typingsSlinky.sentryHub.scopeMod.Scope = js.native
  }
  
  @JSImport("@sentry/browser", "Severity")
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
  
  @JSImport("@sentry/browser", "Status")
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
  
  object Transports {
    
    @JSImport("@sentry/browser", "Transports.BaseTransport")
    @js.native
    abstract class BaseTransport protected ()
      extends typingsSlinky.sentryBrowser.transportsMod.BaseTransport {
      def this(options: TransportOptions) = this()
    }
    
    @JSImport("@sentry/browser", "Transports.FetchTransport")
    @js.native
    class FetchTransport protected ()
      extends typingsSlinky.sentryBrowser.transportsMod.FetchTransport {
      def this(options: TransportOptions) = this()
    }
    
    @JSImport("@sentry/browser", "Transports.XHRTransport")
    @js.native
    class XHRTransport protected ()
      extends typingsSlinky.sentryBrowser.transportsMod.XHRTransport {
      def this(options: TransportOptions) = this()
    }
  }
  
  @JSImport("@sentry/browser", "addBreadcrumb")
  @js.native
  def addBreadcrumb(breadcrumb: Breadcrumb): Unit = js.native
  
  @JSImport("@sentry/browser", "addGlobalEventProcessor")
  @js.native
  def addGlobalEventProcessor(callback: EventProcessor): Unit = js.native
  
  @JSImport("@sentry/browser", "captureEvent")
  @js.native
  def captureEvent(event: Event): String = js.native
  
  @JSImport("@sentry/browser", "captureException")
  @js.native
  def captureException(exception: js.Any): String = js.native
  @JSImport("@sentry/browser", "captureException")
  @js.native
  def captureException(exception: js.Any, captureContext: CaptureContext): String = js.native
  
  @JSImport("@sentry/browser", "captureMessage")
  @js.native
  def captureMessage(message: String): String = js.native
  @JSImport("@sentry/browser", "captureMessage")
  @js.native
  def captureMessage(message: String, captureContext: CaptureContext): String = js.native
  @JSImport("@sentry/browser", "captureMessage")
  @js.native
  def captureMessage(message: String, captureContext: Severity): String = js.native
  
  @JSImport("@sentry/browser", "close")
  @js.native
  def close(): js.Thenable[Boolean] = js.native
  @JSImport("@sentry/browser", "close")
  @js.native
  def close(timeout: Double): js.Thenable[Boolean] = js.native
  
  @JSImport("@sentry/browser", "configureScope")
  @js.native
  def configureScope(callback: js.Function1[/* scope */ typingsSlinky.sentryHub.mod.Scope, Unit]): Unit = js.native
  
  @JSImport("@sentry/browser", "defaultIntegrations")
  @js.native
  val defaultIntegrations: js.Array[
    FunctionToString | InboundFilters | GlobalHandlers | TryCatch | Breadcrumbs | LinkedErrors | UserAgent
  ] = js.native
  
  @JSImport("@sentry/browser", "eventFromException")
  @js.native
  def eventFromException(options: Options, exception: js.Any): js.Thenable[Event] = js.native
  @JSImport("@sentry/browser", "eventFromException")
  @js.native
  def eventFromException(options: Options, exception: js.Any, hint: EventHint): js.Thenable[Event] = js.native
  
  @JSImport("@sentry/browser", "eventFromMessage")
  @js.native
  def eventFromMessage(options: Options, message: String): js.Thenable[Event] = js.native
  @JSImport("@sentry/browser", "eventFromMessage")
  @js.native
  def eventFromMessage(options: Options, message: String, level: js.UndefOr[scala.Nothing], hint: EventHint): js.Thenable[Event] = js.native
  @JSImport("@sentry/browser", "eventFromMessage")
  @js.native
  def eventFromMessage(options: Options, message: String, level: Severity): js.Thenable[Event] = js.native
  @JSImport("@sentry/browser", "eventFromMessage")
  @js.native
  def eventFromMessage(options: Options, message: String, level: Severity, hint: EventHint): js.Thenable[Event] = js.native
  
  @JSImport("@sentry/browser", "flush")
  @js.native
  def flush(): js.Thenable[Boolean] = js.native
  @JSImport("@sentry/browser", "flush")
  @js.native
  def flush(timeout: Double): js.Thenable[Boolean] = js.native
  
  @JSImport("@sentry/browser", "forceLoad")
  @js.native
  def forceLoad(): Unit = js.native
  
  @JSImport("@sentry/browser", "getCurrentHub")
  @js.native
  def getCurrentHub(): typingsSlinky.sentryHub.hubMod.Hub = js.native
  
  @JSImport("@sentry/browser", "getHubFromCarrier")
  @js.native
  def getHubFromCarrier(carrier: Carrier): typingsSlinky.sentryHub.hubMod.Hub = js.native
  
  @JSImport("@sentry/browser", "init")
  @js.native
  def init(): Unit = js.native
  @JSImport("@sentry/browser", "init")
  @js.native
  def init(options: BrowserOptions): Unit = js.native
  
  @JSImport("@sentry/browser", "injectReportDialog")
  @js.native
  def injectReportDialog(): Unit = js.native
  @JSImport("@sentry/browser", "injectReportDialog")
  @js.native
  def injectReportDialog(options: ReportDialogOptions): Unit = js.native
  
  @JSImport("@sentry/browser", "lastEventId")
  @js.native
  def lastEventId(): js.UndefOr[String] = js.native
  
  @JSImport("@sentry/browser", "makeMain")
  @js.native
  def makeMain(hub: typingsSlinky.sentryHub.hubMod.Hub): typingsSlinky.sentryHub.hubMod.Hub = js.native
  
  @JSImport("@sentry/browser", "onLoad")
  @js.native
  def onLoad(callback: js.Function0[Unit]): Unit = js.native
  
  @JSImport("@sentry/browser", "setContext")
  @js.native
  def setContext(name: String): Unit = js.native
  @JSImport("@sentry/browser", "setContext")
  @js.native
  def setContext(name: String, context: StringDictionary[js.Any]): Unit = js.native
  
  @JSImport("@sentry/browser", "setExtra")
  @js.native
  def setExtra(key: String, extra: Extra): Unit = js.native
  
  @JSImport("@sentry/browser", "setExtras")
  @js.native
  def setExtras(extras: Extras): Unit = js.native
  
  @JSImport("@sentry/browser", "setTag")
  @js.native
  def setTag(key: String, value: String): Unit = js.native
  
  @JSImport("@sentry/browser", "setTags")
  @js.native
  def setTags(tags: StringDictionary[String]): Unit = js.native
  
  @JSImport("@sentry/browser", "setUser")
  @js.native
  def setUser(): Unit = js.native
  @JSImport("@sentry/browser", "setUser")
  @js.native
  def setUser(user: User): Unit = js.native
  
  @JSImport("@sentry/browser", "showReportDialog")
  @js.native
  def showReportDialog(): Unit = js.native
  @JSImport("@sentry/browser", "showReportDialog")
  @js.native
  def showReportDialog(options: ReportDialogOptions): Unit = js.native
  
  @JSImport("@sentry/browser", "startTransaction")
  @js.native
  def startTransaction(context: TransactionContext): Transaction = js.native
  @JSImport("@sentry/browser", "startTransaction")
  @js.native
  def startTransaction(context: TransactionContext, customSamplingContext: CustomSamplingContext): Transaction = js.native
  
  @JSImport("@sentry/browser", "withScope")
  @js.native
  def withScope(callback: js.Function1[/* scope */ typingsSlinky.sentryHub.mod.Scope, Unit]): Unit = js.native
  
  @JSImport("@sentry/browser", "wrap")
  @js.native
  def wrap(fn: js.Function1[/* args */ js.Any, _]): js.Any = js.native
}

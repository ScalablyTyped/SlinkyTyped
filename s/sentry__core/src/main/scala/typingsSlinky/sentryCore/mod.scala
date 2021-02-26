package typingsSlinky.sentryCore

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sentryCore.anon.PartialInboundFiltersOpti
import typingsSlinky.sentryCore.basebackendMod.Backend
import typingsSlinky.sentryCore.basebackendMod.BackendClass
import typingsSlinky.sentryCore.sdkMod.ClientClass
import typingsSlinky.sentryHub.interfacesMod.Carrier
import typingsSlinky.sentryTypes.breadcrumbMod.Breadcrumb
import typingsSlinky.sentryTypes.clientMod.Client
import typingsSlinky.sentryTypes.dsnMod.DsnLike
import typingsSlinky.sentryTypes.eventMod.Event
import typingsSlinky.sentryTypes.eventprocessorMod.EventProcessor
import typingsSlinky.sentryTypes.extraMod.Extra
import typingsSlinky.sentryTypes.extraMod.Extras
import typingsSlinky.sentryTypes.optionsMod.Options
import typingsSlinky.sentryTypes.requestMod.SentryRequest
import typingsSlinky.sentryTypes.scopeMod.CaptureContext
import typingsSlinky.sentryTypes.sessionMod.Session
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
  
  @JSImport("@sentry/core", "API")
  @js.native
  class API protected ()
    extends typingsSlinky.sentryCore.apiMod.API {
    /** Create a new instance of API */
    def this(dsn: DsnLike) = this()
  }
  
  @JSImport("@sentry/core", "BaseBackend")
  @js.native
  abstract class BaseBackend[O /* <: Options */] protected ()
    extends typingsSlinky.sentryCore.basebackendMod.BaseBackend[O] {
    /** Creates a new backend instance. */
    def this(options: O) = this()
  }
  
  @JSImport("@sentry/core", "BaseClient")
  @js.native
  abstract class BaseClient[B /* <: Backend */, O /* <: Options */] protected ()
    extends typingsSlinky.sentryCore.baseclientMod.BaseClient[B, O] {
    /**
      * Initializes this client instance.
      *
      * @param backendClass A constructor function to create the backend.
      * @param options Options for the client.
      */
    protected def this(backendClass: BackendClass[B, O], options: O) = this()
  }
  
  @JSImport("@sentry/core", "Hub")
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
    extends typingsSlinky.sentryHub.mod.Hub {
    def this(client: Client[Options]) = this()
    def this(client: js.UndefOr[scala.Nothing], scope: typingsSlinky.sentryHub.scopeMod.Scope) = this()
    def this(client: Client[Options], scope: typingsSlinky.sentryHub.scopeMod.Scope) = this()
    def this(client: js.UndefOr[scala.Nothing], scope: js.UndefOr[scala.Nothing], _version: Double) = this()
    def this(client: js.UndefOr[scala.Nothing], scope: typingsSlinky.sentryHub.scopeMod.Scope, _version: Double) = this()
    def this(client: Client[Options], scope: js.UndefOr[scala.Nothing], _version: Double) = this()
    def this(client: Client[Options], scope: typingsSlinky.sentryHub.scopeMod.Scope, _version: Double) = this()
  }
  
  object Integrations {
    
    @JSImport("@sentry/core", "Integrations.FunctionToString")
    @js.native
    class FunctionToString ()
      extends typingsSlinky.sentryCore.integrationsMod.FunctionToString
    /* static members */
    object FunctionToString {
      
      @JSImport("@sentry/core", "Integrations.FunctionToString")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * @inheritDoc
        */
      @JSImport("@sentry/core", "Integrations.FunctionToString.id")
      @js.native
      def id: String = js.native
      @scala.inline
      def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("@sentry/core", "Integrations.InboundFilters")
    @js.native
    class InboundFilters ()
      extends typingsSlinky.sentryCore.integrationsMod.InboundFilters {
      def this(_options: PartialInboundFiltersOpti) = this()
    }
    /* static members */
    object InboundFilters {
      
      @JSImport("@sentry/core", "Integrations.InboundFilters")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * @inheritDoc
        */
      @JSImport("@sentry/core", "Integrations.InboundFilters.id")
      @js.native
      def id: String = js.native
      @scala.inline
      def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@sentry/core", "NoopTransport")
  @js.native
  class NoopTransport ()
    extends typingsSlinky.sentryCore.noopMod.NoopTransport
  
  @JSImport("@sentry/core", "Scope")
  @js.native
  class Scope ()
    extends typingsSlinky.sentryHub.mod.Scope
  /* static members */
  object Scope {
    
    @JSImport("@sentry/core", "Scope.clone")
    @js.native
    def clone(scope: typingsSlinky.sentryHub.scopeMod.Scope): typingsSlinky.sentryHub.scopeMod.Scope = js.native
  }
  
  @JSImport("@sentry/core", "addBreadcrumb")
  @js.native
  def addBreadcrumb(breadcrumb: Breadcrumb): Unit = js.native
  
  @JSImport("@sentry/core", "addGlobalEventProcessor")
  @js.native
  def addGlobalEventProcessor(callback: EventProcessor): Unit = js.native
  
  @JSImport("@sentry/core", "captureEvent")
  @js.native
  def captureEvent(event: Event): String = js.native
  
  @JSImport("@sentry/core", "captureException")
  @js.native
  def captureException(exception: js.Any): String = js.native
  @JSImport("@sentry/core", "captureException")
  @js.native
  def captureException(exception: js.Any, captureContext: CaptureContext): String = js.native
  
  @JSImport("@sentry/core", "captureMessage")
  @js.native
  def captureMessage(message: String): String = js.native
  @JSImport("@sentry/core", "captureMessage")
  @js.native
  def captureMessage(message: String, captureContext: CaptureContext): String = js.native
  @JSImport("@sentry/core", "captureMessage")
  @js.native
  def captureMessage(message: String, captureContext: Severity): String = js.native
  
  @JSImport("@sentry/core", "configureScope")
  @js.native
  def configureScope(callback: js.Function1[/* scope */ typingsSlinky.sentryHub.mod.Scope, Unit]): Unit = js.native
  
  @JSImport("@sentry/core", "eventToSentryRequest")
  @js.native
  def eventToSentryRequest(event: Event, api: typingsSlinky.sentryCore.apiMod.API): SentryRequest = js.native
  
  @JSImport("@sentry/core", "getCurrentHub")
  @js.native
  def getCurrentHub(): typingsSlinky.sentryHub.hubMod.Hub = js.native
  
  @JSImport("@sentry/core", "getHubFromCarrier")
  @js.native
  def getHubFromCarrier(carrier: Carrier): typingsSlinky.sentryHub.hubMod.Hub = js.native
  
  @JSImport("@sentry/core", "initAndBind")
  @js.native
  def initAndBind[F /* <: Client[Options] */, O /* <: Options */](clientClass: ClientClass[F, O], options: O): Unit = js.native
  
  @JSImport("@sentry/core", "makeMain")
  @js.native
  def makeMain(hub: typingsSlinky.sentryHub.hubMod.Hub): typingsSlinky.sentryHub.hubMod.Hub = js.native
  
  @JSImport("@sentry/core", "sessionToSentryRequest")
  @js.native
  def sessionToSentryRequest(session: Session, api: typingsSlinky.sentryCore.apiMod.API): SentryRequest = js.native
  
  @JSImport("@sentry/core", "setContext")
  @js.native
  def setContext(name: String): Unit = js.native
  @JSImport("@sentry/core", "setContext")
  @js.native
  def setContext(name: String, context: StringDictionary[js.Any]): Unit = js.native
  
  @JSImport("@sentry/core", "setExtra")
  @js.native
  def setExtra(key: String, extra: Extra): Unit = js.native
  
  @JSImport("@sentry/core", "setExtras")
  @js.native
  def setExtras(extras: Extras): Unit = js.native
  
  @JSImport("@sentry/core", "setTag")
  @js.native
  def setTag(key: String, value: String): Unit = js.native
  
  @JSImport("@sentry/core", "setTags")
  @js.native
  def setTags(tags: StringDictionary[String]): Unit = js.native
  
  @JSImport("@sentry/core", "setUser")
  @js.native
  def setUser(): Unit = js.native
  @JSImport("@sentry/core", "setUser")
  @js.native
  def setUser(user: User): Unit = js.native
  
  @JSImport("@sentry/core", "startTransaction")
  @js.native
  def startTransaction(context: TransactionContext): Transaction = js.native
  @JSImport("@sentry/core", "startTransaction")
  @js.native
  def startTransaction(context: TransactionContext, customSamplingContext: CustomSamplingContext): Transaction = js.native
  
  @JSImport("@sentry/core", "withScope")
  @js.native
  def withScope(callback: js.Function1[/* scope */ typingsSlinky.sentryHub.mod.Scope, Unit]): Unit = js.native
}

package typingsSlinky.sipDotJs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sipDotJs.libApiEmitterMod.Emitter
import typingsSlinky.sipDotJs.libApiInviterDashOptionsMod.InviterOptions
import typingsSlinky.sipDotJs.libApiInviterMod.Inviter
import typingsSlinky.sipDotJs.libApiPublisherMod.Publisher
import typingsSlinky.sipDotJs.libApiRegistererMod.Registerer
import typingsSlinky.sipDotJs.libApiSessionMod.Session
import typingsSlinky.sipDotJs.libApiSubscriptionMod.Subscription
import typingsSlinky.sipDotJs.libApiTransportMod.Transport
import typingsSlinky.sipDotJs.libApiUserDashAgentDashDelegateMod.UserAgentDelegate
import typingsSlinky.sipDotJs.libApiUserDashAgentDashOptionsMod.UserAgentOptions
import typingsSlinky.sipDotJs.libApiUserDashAgentDashStateMod.UserAgentState
import typingsSlinky.sipDotJs.libCoreMod.IncomingRequestMessage
import typingsSlinky.sipDotJs.libCoreMod.Logger
import typingsSlinky.sipDotJs.libCoreMod.LoggerFactory
import typingsSlinky.sipDotJs.libCoreMod.URI
import typingsSlinky.sipDotJs.libCoreMod.UserAgentCore
import typingsSlinky.sipDotJs.libCoreUserDashAgentDashCoreUserDashAgentDashCoreDashConfigurationMod.Contact
import typingsSlinky.std.Partial
import typingsSlinky.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/user-agent", JSImport.Namespace)
@js.native
object libApiUserDashAgentMod extends js.Object {
  @js.native
  /**
    * Constructs a new instance of the `UserAgent` class.
    * @param options - Options bucket. See {@link UserAgentOptions} for details.
    */
  class UserAgent () extends js.Object {
    def this(options: Partial[UserAgentOptions]) = this()
    var _contact: js.Any = js.native
    var _state: js.Any = js.native
    var _stateEventEmitter: js.Any = js.native
    var _stateInitial: js.Any = js.native
    var _transport: js.Any = js.native
    var _userAgentCore: js.Any = js.native
    /**
      * Attempt reconnection up to `maxReconnectionAttempts` times.
      * @param reconnectionAttempt - Current attempt number.
      */
    var attemptReconnection: js.Any = js.native
    /**
      * User agent configuration.
      */
    val configuration: Required[UserAgentOptions] = js.native
    /**
      * User agent contact.
      */
    val contact: Contact = js.native
    /** @internal */
    var data: js.Any = js.native
    /** Delegate. */
    var delegate: js.UndefOr[UserAgentDelegate] = js.native
    /**
      * Initialize contact.
      */
    var initContact: js.Any = js.native
    /**
      * Initialize user agent core.
      */
    var initCore: js.Any = js.native
    var initTransportCallbacks: js.Any = js.native
    /** Logger. */
    var logger: js.Any = js.native
    /** LoggerFactory. */
    var loggerFactory: js.Any = js.native
    var onTransportConnect: js.Any = js.native
    var onTransportDisconnect: js.Any = js.native
    var onTransportMessage: js.Any = js.native
    /** Options. */
    var options: js.Any = js.native
    /** @internal */
    var publishers: StringDictionary[Publisher] = js.native
    /** @internal */
    var registerers: StringDictionary[Registerer] = js.native
    /** @internal */
    var sessions: StringDictionary[Session] = js.native
    /**
      * User agent state.
      */
    val state: UserAgentState = js.native
    /**
      * User agent state change emitter.
      */
    val stateChange: Emitter[UserAgentState] = js.native
    /** @internal */
    var subscriptions: StringDictionary[Subscription] = js.native
    /**
      * Transition state.
      */
    var transitionState: js.Any = js.native
    /**
      * User agent transport.
      */
    val transport: Transport = js.native
    /** Unload listener. */
    var unloadListener: js.Any = js.native
    /**
      * User agent core.
      */
    val userAgentCore: UserAgentCore = js.native
    /** @internal */
    def findSession(request: IncomingRequestMessage): js.UndefOr[Session] = js.native
    /** @internal */
    def getLogger(category: String): Logger = js.native
    def getLogger(category: String, label: String): Logger = js.native
    /** @internal */
    def getLoggerFactory(): LoggerFactory = js.native
    /** @internal */
    def getSupportedResponseOptions(): js.Array[String] = js.native
    /**
      * True if transport is connected.
      */
    def isConnected(): Boolean = js.native
    /**
      * Used to avoid circular references.
      * @internal
      */
    def makeInviter(targetURI: URI): Inviter = js.native
    def makeInviter(targetURI: URI, options: InviterOptions): Inviter = js.native
    /**
      * Reconnect the transport.
      */
    def reconnect(): js.Promise[Unit] = js.native
    /**
      * Start the user agent.
      *
      * @remarks
      * Resolves if transport connects, otherwise rejects.
      *
      * @example
      * ```ts
      * userAgent.start()
      *   .then(() => {
      *     // userAgent.isConnected() === true
      *   })
      *   .catch((error: Error) => {
      *     // userAgent.isConnected() === false
      *   });
      * ```
      */
    def start(): js.Promise[Unit] = js.native
    /**
      * Stop the user agent.
      *
      * @remarks
      * Resolves when the user agent has completed a graceful shutdown.
      *
      * Registerers unregister. Sessions terminate. Subscribers unsubscribe. Publishers unpublish.
      */
    def stop(): js.Promise[Unit] = js.native
  }
  
  /* static members */
  @js.native
  object UserAgent extends js.Object {
    /** Default user agent options. */
    val defaultOptions: js.Any = js.native
    /**
      * Create a URI instance from a string.
      * @param uri - The string to parse.
      *
      * @example
      * ```ts
      * const uri = UserAgent.makeURI("sip:edgar@example.com");
      * ```
      */
    def makeURI(uri: String): js.UndefOr[URI] = js.native
    /**
      * Strip properties with undefined values from options.
      * This is a work around while waiting for missing vs undefined to be addressed (or not)...
      * https://github.com/Microsoft/TypeScript/issues/13195
      * @param options - Options to reduce
      */
    /* protected */ def stripUndefinedProperties(options: Partial[UserAgentOptions]): Partial[UserAgentOptions] = js.native
  }
  
}


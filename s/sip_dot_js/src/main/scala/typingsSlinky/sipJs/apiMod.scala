package typingsSlinky.sipJs

import typingsSlinky.sipJs.anon.PartialUserAgentOptions
import typingsSlinky.sipJs.coreMod.URI
import typingsSlinky.sipJs.inviteMod.IncomingInviteRequest
import typingsSlinky.sipJs.inviterOptionsMod.InviterOptions
import typingsSlinky.sipJs.messagerOptionsMod.MessagerOptions
import typingsSlinky.sipJs.methodsByeMod.IncomingByeRequest
import typingsSlinky.sipJs.methodsInfoMod.IncomingInfoRequest
import typingsSlinky.sipJs.methodsMessageMod.IncomingMessageRequest
import typingsSlinky.sipJs.notifyMod.IncomingNotifyRequest
import typingsSlinky.sipJs.publisherOptionsMod.PublisherOptions
import typingsSlinky.sipJs.referMod.IncomingReferRequest
import typingsSlinky.sipJs.registererOptionsMod.RegistererOptions
import typingsSlinky.sipJs.sessionOptionsMod.SessionOptions
import typingsSlinky.sipJs.subscriberOptionsMod.SubscriberOptions
import typingsSlinky.sipJs.subscriptionOptionsMod.SubscriptionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiMod {
  
  @JSImport("sip.js/lib/api", "Bye")
  @js.native
  class Bye protected ()
    extends typingsSlinky.sipJs.byeMod.Bye {
    /** @internal */
    def this(incomingByeRequest: IncomingByeRequest) = this()
  }
  
  @JSImport("sip.js/lib/api", "ContentTypeUnsupportedError")
  @js.native
  class ContentTypeUnsupportedError ()
    extends typingsSlinky.sipJs.exceptionsMod.ContentTypeUnsupportedError {
    def this(message: String) = this()
  }
  
  @JSImport("sip.js/lib/api", "EmitterImpl")
  @js.native
  class EmitterImpl[T] ()
    extends typingsSlinky.sipJs.emitterMod.EmitterImpl[T]
  
  @JSImport("sip.js/lib/api", "Info")
  @js.native
  class Info protected ()
    extends typingsSlinky.sipJs.infoMod.Info {
    /** @internal */
    def this(incomingInfoRequest: IncomingInfoRequest) = this()
  }
  
  @JSImport("sip.js/lib/api", "Invitation")
  @js.native
  class Invitation protected ()
    extends typingsSlinky.sipJs.invitationMod.Invitation {
    /** @internal */
    def this(
      userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent,
      incomingInviteRequest: IncomingInviteRequest
    ) = this()
  }
  
  @JSImport("sip.js/lib/api", "Inviter")
  @js.native
  class Inviter protected ()
    extends typingsSlinky.sipJs.inviterMod.Inviter {
    /**
      * Constructs a new instance of the `Inviter` class.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @param targetURI - Request URI identifying the target of the message.
      * @param options - Options bucket. See {@link InviterOptions} for details.
      */
    def this(userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent, targetURI: URI) = this()
    def this(userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent, targetURI: URI, options: InviterOptions) = this()
  }
  
  @JSImport("sip.js/lib/api", "Message")
  @js.native
  class Message protected ()
    extends typingsSlinky.sipJs.messageMod.Message {
    /** @internal */
    def this(incomingMessageRequest: IncomingMessageRequest) = this()
  }
  
  @JSImport("sip.js/lib/api", "Messager")
  @js.native
  class Messager protected ()
    extends typingsSlinky.sipJs.messagerMod.Messager {
    /**
      * Constructs a new instance of the `Messager` class.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @param targetURI - Request URI identifying the target of the message.
      * @param content - Content for the body of the message.
      * @param contentType - Content type of the body of the message.
      * @param options - Options bucket. See {@link MessagerOptions} for details.
      */
    def this(userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent, targetURI: URI, content: String) = this()
    def this(
      userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent,
      targetURI: URI,
      content: String,
      contentType: String
    ) = this()
    def this(
      userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent,
      targetURI: URI,
      content: String,
      contentType: js.UndefOr[scala.Nothing],
      options: MessagerOptions
    ) = this()
    def this(
      userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent,
      targetURI: URI,
      content: String,
      contentType: String,
      options: MessagerOptions
    ) = this()
  }
  
  @JSImport("sip.js/lib/api", "Notification")
  @js.native
  class Notification protected ()
    extends typingsSlinky.sipJs.notificationMod.Notification {
    /** @internal */
    def this(incomingNotifyRequest: IncomingNotifyRequest) = this()
  }
  
  @JSImport("sip.js/lib/api", "Publisher")
  @js.native
  class Publisher protected ()
    extends typingsSlinky.sipJs.publisherMod.Publisher {
    /**
      * Constructs a new instance of the `Publisher` class.
      *
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @param targetURI - Request URI identifying the target of the message.
      * @param eventType - The event type identifying the published document.
      * @param options - Options bucket. See {@link PublisherOptions} for details.
      */
    def this(userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent, targetURI: URI, eventType: String) = this()
    def this(
      userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent,
      targetURI: URI,
      eventType: String,
      options: PublisherOptions
    ) = this()
  }
  
  @JSImport("sip.js/lib/api", "PublisherState")
  @js.native
  object PublisherState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.sipJs.publisherStateMod.PublisherState with String] = js.native
    
    /* "Initial" */ val Initial: typingsSlinky.sipJs.publisherStateMod.PublisherState.Initial with String = js.native
    
    /* "Published" */ val Published: typingsSlinky.sipJs.publisherStateMod.PublisherState.Published with String = js.native
    
    /* "Terminated" */ val Terminated: typingsSlinky.sipJs.publisherStateMod.PublisherState.Terminated with String = js.native
    
    /* "Unpublished" */ val Unpublished: typingsSlinky.sipJs.publisherStateMod.PublisherState.Unpublished with String = js.native
  }
  
  @JSImport("sip.js/lib/api", "Referral")
  @js.native
  class Referral protected ()
    extends typingsSlinky.sipJs.referralMod.Referral {
    /** @internal */
    def this(incomingReferRequest: IncomingReferRequest, session: typingsSlinky.sipJs.sessionMod.Session) = this()
  }
  
  @JSImport("sip.js/lib/api", "Registerer")
  @js.native
  class Registerer protected ()
    extends typingsSlinky.sipJs.registererMod.Registerer {
    /**
      * Constructs a new instance of the `Registerer` class.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @param options - Options bucket. See {@link RegistererOptions} for details.
      */
    def this(userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent) = this()
    def this(userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent, options: RegistererOptions) = this()
  }
  /* static members */
  object Registerer {
    
    @JSImport("sip.js/lib/api", "Registerer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sip.js/lib/api", "Registerer.defaultExpires")
    @js.native
    val defaultExpires: js.Any = js.native
    
    /** Default registerer options. */
    @JSImport("sip.js/lib/api", "Registerer.defaultOptions")
    @js.native
    def defaultOptions: js.Any = js.native
    @scala.inline
    def defaultOptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("sip.js/lib/api", "Registerer.newUUID")
    @js.native
    def newUUID: js.Any = js.native
    @scala.inline
    def newUUID_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newUUID")(x.asInstanceOf[js.Any])
    
    /**
      * Strip properties with undefined values from options.
      * This is a work around while waiting for missing vs undefined to be addressed (or not)...
      * https://github.com/Microsoft/TypeScript/issues/13195
      * @param options - Options to reduce
      */
    @JSImport("sip.js/lib/api", "Registerer.stripUndefinedProperties")
    @js.native
    def stripUndefinedProperties: js.Any = js.native
    @scala.inline
    def stripUndefinedProperties_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stripUndefinedProperties")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sip.js/lib/api", "RegistererState")
  @js.native
  object RegistererState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.sipJs.registererStateMod.RegistererState with String] = js.native
    
    /* "Initial" */ val Initial: typingsSlinky.sipJs.registererStateMod.RegistererState.Initial with String = js.native
    
    /* "Registered" */ val Registered: typingsSlinky.sipJs.registererStateMod.RegistererState.Registered with String = js.native
    
    /* "Terminated" */ val Terminated: typingsSlinky.sipJs.registererStateMod.RegistererState.Terminated with String = js.native
    
    /* "Unregistered" */ val Unregistered: typingsSlinky.sipJs.registererStateMod.RegistererState.Unregistered with String = js.native
  }
  
  @JSImport("sip.js/lib/api", "RequestPendingError")
  @js.native
  /** @internal */
  class RequestPendingError ()
    extends typingsSlinky.sipJs.exceptionsMod.RequestPendingError {
    def this(message: String) = this()
  }
  
  @JSImport("sip.js/lib/api", "SIPExtension")
  @js.native
  object SIPExtension extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.sipJs.userAgentOptionsMod.SIPExtension with String] = js.native
    
    /* "Required" */ val Required: typingsSlinky.sipJs.userAgentOptionsMod.SIPExtension.Required with String = js.native
    
    /* "Supported" */ val Supported: typingsSlinky.sipJs.userAgentOptionsMod.SIPExtension.Supported with String = js.native
    
    /* "Unsupported" */ val Unsupported: typingsSlinky.sipJs.userAgentOptionsMod.SIPExtension.Unsupported with String = js.native
  }
  
  @JSImport("sip.js/lib/api", "Session")
  @js.native
  abstract class Session protected ()
    extends typingsSlinky.sipJs.sessionMod.Session {
    /**
      * Constructor.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @internal
      */
    protected def this(userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent) = this()
    protected def this(userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent, options: SessionOptions) = this()
  }
  
  @JSImport("sip.js/lib/api", "SessionDescriptionHandlerError")
  @js.native
  class SessionDescriptionHandlerError ()
    extends typingsSlinky.sipJs.exceptionsMod.SessionDescriptionHandlerError {
    def this(message: String) = this()
  }
  
  @JSImport("sip.js/lib/api", "SessionState")
  @js.native
  object SessionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.sipJs.sessionStateMod.SessionState with String] = js.native
    
    /* "Established" */ val Established: typingsSlinky.sipJs.sessionStateMod.SessionState.Established with String = js.native
    
    /* "Establishing" */ val Establishing: typingsSlinky.sipJs.sessionStateMod.SessionState.Establishing with String = js.native
    
    /* "Initial" */ val Initial: typingsSlinky.sipJs.sessionStateMod.SessionState.Initial with String = js.native
    
    /* "Terminated" */ val Terminated: typingsSlinky.sipJs.sessionStateMod.SessionState.Terminated with String = js.native
    
    /* "Terminating" */ val Terminating: typingsSlinky.sipJs.sessionStateMod.SessionState.Terminating with String = js.native
  }
  
  @JSImport("sip.js/lib/api", "SessionTerminatedError")
  @js.native
  class SessionTerminatedError ()
    extends typingsSlinky.sipJs.exceptionsMod.SessionTerminatedError
  
  @JSImport("sip.js/lib/api", "StateTransitionError")
  @js.native
  class StateTransitionError ()
    extends typingsSlinky.sipJs.exceptionsMod.StateTransitionError {
    def this(message: String) = this()
  }
  
  @JSImport("sip.js/lib/api", "Subscriber")
  @js.native
  class Subscriber protected ()
    extends typingsSlinky.sipJs.subscriberMod.Subscriber {
    /**
      * Constructor.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @param targetURI - The request URI identifying the subscribed event.
      * @param eventType - The event type identifying the subscribed event.
      * @param options - Options bucket. See {@link SubscriberOptions} for details.
      */
    def this(userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent, targetURI: URI, eventType: String) = this()
    def this(
      userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent,
      targetURI: URI,
      eventType: String,
      options: SubscriberOptions
    ) = this()
  }
  
  @JSImport("sip.js/lib/api", "Subscription")
  @js.native
  abstract class Subscription protected ()
    extends typingsSlinky.sipJs.subscriptionMod.Subscription {
    /**
      * Constructor.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @internal
      */
    protected def this(userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent) = this()
    protected def this(userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent, options: SubscriptionOptions) = this()
  }
  
  @JSImport("sip.js/lib/api", "SubscriptionState")
  @js.native
  object SubscriptionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.sipJs.subscriptionStateMod.SubscriptionState with String] = js.native
    
    /* "Initial" */ val Initial: typingsSlinky.sipJs.subscriptionStateMod.SubscriptionState.Initial with String = js.native
    
    /* "NotifyWait" */ val NotifyWait: typingsSlinky.sipJs.subscriptionStateMod.SubscriptionState.NotifyWait with String = js.native
    
    /* "Subscribed" */ val Subscribed: typingsSlinky.sipJs.subscriptionStateMod.SubscriptionState.Subscribed with String = js.native
    
    /* "Terminated" */ val Terminated: typingsSlinky.sipJs.subscriptionStateMod.SubscriptionState.Terminated with String = js.native
  }
  
  @JSImport("sip.js/lib/api", "TransportState")
  @js.native
  object TransportState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.sipJs.transportStateMod.TransportState with String] = js.native
    
    /* "Connected" */ val Connected: typingsSlinky.sipJs.transportStateMod.TransportState.Connected with String = js.native
    
    /* "Connecting" */ val Connecting: typingsSlinky.sipJs.transportStateMod.TransportState.Connecting with String = js.native
    
    /* "Disconnected" */ val Disconnected: typingsSlinky.sipJs.transportStateMod.TransportState.Disconnected with String = js.native
    
    /* "Disconnecting" */ val Disconnecting: typingsSlinky.sipJs.transportStateMod.TransportState.Disconnecting with String = js.native
  }
  
  @JSImport("sip.js/lib/api", "UserAgent")
  @js.native
  /**
    * Constructs a new instance of the `UserAgent` class.
    * @param options - Options bucket. See {@link UserAgentOptions} for details.
    */
  class UserAgent ()
    extends typingsSlinky.sipJs.userAgentMod.UserAgent {
    def this(options: PartialUserAgentOptions) = this()
  }
  /* static members */
  object UserAgent {
    
    @JSImport("sip.js/lib/api", "UserAgent")
    @js.native
    val ^ : js.Any = js.native
    
    /** Default user agent options. */
    @JSImport("sip.js/lib/api", "UserAgent.defaultOptions")
    @js.native
    def defaultOptions: js.Any = js.native
    @scala.inline
    def defaultOptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    /**
      * Create a URI instance from a string.
      * @param uri - The string to parse.
      *
      * @example
      * ```ts
      * const uri = UserAgent.makeURI("sip:edgar@example.com");
      * ```
      */
    @JSImport("sip.js/lib/api", "UserAgent.makeURI")
    @js.native
    def makeURI(uri: String): js.UndefOr[URI] = js.native
    
    /**
      * Strip properties with undefined values from options.
      * This is a work around while waiting for missing vs undefined to be addressed (or not)...
      * https://github.com/Microsoft/TypeScript/issues/13195
      * @param options - Options to reduce
      */
    @JSImport("sip.js/lib/api", "UserAgent.stripUndefinedProperties")
    @js.native
    def stripUndefinedProperties: js.Any = js.native
    @scala.inline
    def stripUndefinedProperties_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stripUndefinedProperties")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sip.js/lib/api", "UserAgentState")
  @js.native
  object UserAgentState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.sipJs.userAgentStateMod.UserAgentState with String] = js.native
    
    /* "Started" */ val Started: typingsSlinky.sipJs.userAgentStateMod.UserAgentState.Started with String = js.native
    
    /* "Stopped" */ val Stopped: typingsSlinky.sipJs.userAgentStateMod.UserAgentState.Stopped with String = js.native
  }
}

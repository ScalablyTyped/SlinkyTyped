package typingsSlinky.sipJs

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.sipJs.bodyMod.Body
import typingsSlinky.sipJs.inviteMod.OutgoingInviteRequest
import typingsSlinky.sipJs.inviteMod.OutgoingInviteRequestDelegate
import typingsSlinky.sipJs.messagesMod.URI
import typingsSlinky.sipJs.methodsByeMod.OutgoingByeRequest
import typingsSlinky.sipJs.methodsInfoMod.OutgoingInfoRequest
import typingsSlinky.sipJs.methodsMessageMod.OutgoingMessageRequest
import typingsSlinky.sipJs.notifyMod.OutgoingNotifyRequest
import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipJs.outgoingRequestMod.RequestOptions
import typingsSlinky.sipJs.prackMod.OutgoingPrackRequest
import typingsSlinky.sipJs.referMod.OutgoingReferRequest
import typingsSlinky.sipJs.sessionSessionDelegateMod.SessionDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/session/session", JSImport.Namespace)
@js.native
object sessionSessionMod extends js.Object {
  
  @js.native
  trait Session extends js.Object {
    
    /** The current answer if signalingState is stable. Otherwise undefined. */
    val answer: js.UndefOr[Body] = js.native
    
    /**
      * Send a BYE request.
      * Terminating a session.
      * https://tools.ietf.org/html/rfc3261#section-15
      * @param delegate - Request delegate.
      * @param options - Options bucket.
      */
    def bye(): OutgoingByeRequest = js.native
    def bye(delegate: js.UndefOr[scala.Nothing], options: RequestOptions): OutgoingByeRequest = js.native
    def bye(delegate: OutgoingRequestDelegate): OutgoingByeRequest = js.native
    def bye(delegate: OutgoingRequestDelegate, options: RequestOptions): OutgoingByeRequest = js.native
    
    /** Call Id. */
    val callId: String = js.native
    
    /** Session delegate. */
    var delegate: js.UndefOr[SessionDelegate] = js.native
    
    /**
      * Destroy session.
      */
    def dispose(): Unit = js.native
    
    /** The session id. Equal to callId + localTag + remoteTag. */
    val id: String = js.native
    
    /**
      * Send an INFO request.
      * Exchange information during a session.
      * https://tools.ietf.org/html/rfc6086#section-4.2.1
      * @param delegate - Request delegate.
      * @param options - Options bucket.
      */
    def info(): OutgoingInfoRequest = js.native
    def info(delegate: js.UndefOr[scala.Nothing], options: RequestOptions): OutgoingInfoRequest = js.native
    def info(delegate: OutgoingRequestDelegate): OutgoingInfoRequest = js.native
    def info(delegate: OutgoingRequestDelegate, options: RequestOptions): OutgoingInfoRequest = js.native
    
    /**
      * Send re-INVITE request.
      * Modifying a session.
      * https://tools.ietf.org/html/rfc3261#section-14.1
      * @param delegate - Request delegate.
      * @param options - Options bucket.
      */
    def invite(): OutgoingInviteRequest = js.native
    def invite(delegate: js.UndefOr[scala.Nothing], options: RequestOptions): OutgoingInviteRequest = js.native
    def invite(delegate: OutgoingInviteRequestDelegate): OutgoingInviteRequest = js.native
    def invite(delegate: OutgoingInviteRequestDelegate, options: RequestOptions): OutgoingInviteRequest = js.native
    
    /** Local Tag. */
    val localTag: String = js.native
    
    /** Local URI. */
    val localURI: URI = js.native
    
    /**
      * Send MESSAGE request.
      * Deliver a message during a session.
      * https://tools.ietf.org/html/rfc3428#section-4
      * @param delegate - Request delegate.
      * @param options - Options bucket.
      */
    def message(): OutgoingMessageRequest = js.native
    def message(delegate: js.UndefOr[scala.Nothing], options: RequestOptions): OutgoingMessageRequest = js.native
    def message(delegate: OutgoingRequestDelegate): OutgoingMessageRequest = js.native
    def message(delegate: OutgoingRequestDelegate, options: RequestOptions): OutgoingMessageRequest = js.native
    
    def notify(delegate: js.UndefOr[scala.Nothing], options: RequestOptions): OutgoingNotifyRequest = js.native
    def notify(delegate: OutgoingRequestDelegate): OutgoingNotifyRequest = js.native
    def notify(delegate: OutgoingRequestDelegate, options: RequestOptions): OutgoingNotifyRequest = js.native
    
    /** The current offer if signalingState is not initial or closed. Otherwise undefined. */
    val offer: js.UndefOr[Body] = js.native
    
    /**
      * Send PRACK request.
      * Acknowledge a reliable provisional response.
      * https://tools.ietf.org/html/rfc3262#section-4
      * @param delegate - Request delegate.
      * @param options - Options bucket.
      */
    def prack(): OutgoingPrackRequest = js.native
    def prack(delegate: js.UndefOr[scala.Nothing], options: RequestOptions): OutgoingPrackRequest = js.native
    def prack(delegate: OutgoingRequestDelegate): OutgoingPrackRequest = js.native
    def prack(delegate: OutgoingRequestDelegate, options: RequestOptions): OutgoingPrackRequest = js.native
    
    /**
      * Send REFER request.
      * Transfer a session.
      * https://tools.ietf.org/html/rfc3515#section-2.4.1
      * @param delegate - Request delegate.
      * @param options - Options bucket.
      */
    def refer(): OutgoingReferRequest = js.native
    def refer(delegate: js.UndefOr[scala.Nothing], options: RequestOptions): OutgoingReferRequest = js.native
    def refer(delegate: OutgoingRequestDelegate): OutgoingReferRequest = js.native
    def refer(delegate: OutgoingRequestDelegate, options: RequestOptions): OutgoingReferRequest = js.native
    
    /** Remote Tag. */
    val remoteTag: String = js.native
    
    /** Remote Target. */
    val remoteTarget: URI = js.native
    
    /** Remote URI. */
    val remoteURI: URI = js.native
    
    /** Session state. */
    val sessionState: SessionState = js.native
    
    /** Current state of the offer/answer exchange. */
    val signalingState: SignalingState = js.native
  }
  
  @js.native
  sealed trait SessionState extends js.Object
  @js.native
  object SessionState extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SessionState with String] = js.native
    
    @js.native
    sealed trait AckWait extends SessionState
    /* "AckWait" */ @js.native
    object AckWait extends TopLevel[AckWait with String]
    
    @js.native
    sealed trait Confirmed extends SessionState
    /* "Confirmed" */ @js.native
    object Confirmed extends TopLevel[Confirmed with String]
    
    @js.native
    sealed trait Early extends SessionState
    /* "Early" */ @js.native
    object Early extends TopLevel[Early with String]
    
    @js.native
    sealed trait Initial extends SessionState
    /* "Initial" */ @js.native
    object Initial extends TopLevel[Initial with String]
    
    @js.native
    sealed trait Terminated extends SessionState
    /* "Terminated" */ @js.native
    object Terminated extends TopLevel[Terminated with String]
  }
  
  @js.native
  sealed trait SignalingState extends js.Object
  @js.native
  object SignalingState extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SignalingState with String] = js.native
    
    @js.native
    sealed trait Closed extends SignalingState
    /* "Closed" */ @js.native
    object Closed extends TopLevel[Closed with String]
    
    @js.native
    sealed trait HaveLocalOffer extends SignalingState
    /* "HaveLocalOffer" */ @js.native
    object HaveLocalOffer extends TopLevel[HaveLocalOffer with String]
    
    @js.native
    sealed trait HaveRemoteOffer extends SignalingState
    /* "HaveRemoteOffer" */ @js.native
    object HaveRemoteOffer extends TopLevel[HaveRemoteOffer with String]
    
    @js.native
    sealed trait Initial extends SignalingState
    /* "Initial" */ @js.native
    object Initial extends TopLevel[Initial with String]
    
    @js.native
    sealed trait Stable extends SignalingState
    /* "Stable" */ @js.native
    object Stable extends TopLevel[Stable with String]
  }
}

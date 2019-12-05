package typingsSlinky.sipDotJs

import typingsSlinky.sipDotJs.libApiEmitterMod.Emitter
import typingsSlinky.sipDotJs.libApiInviterDashOptionsMod.InviterOptions
import typingsSlinky.sipDotJs.libApiInviterMod.Inviter
import typingsSlinky.sipDotJs.libApiReferrerMod.Referrer
import typingsSlinky.sipDotJs.libApiSessionDashDelegateMod.SessionDelegate
import typingsSlinky.sipDotJs.libApiSessionDashDescriptionDashHandlerMod.BodyAndContentType
import typingsSlinky.sipDotJs.libApiSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler
import typingsSlinky.sipDotJs.libApiSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifier
import typingsSlinky.sipDotJs.libApiSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions
import typingsSlinky.sipDotJs.libApiSessionDashInviteDashOptionsMod.SessionInviteOptions
import typingsSlinky.sipDotJs.libApiSessionDashOptionsMod.SessionOptions
import typingsSlinky.sipDotJs.libApiSessionDashStateMod.SessionState
import typingsSlinky.sipDotJs.libApiSessionMod.Session
import typingsSlinky.sipDotJs.libApiUserDashAgentMod.UserAgent
import typingsSlinky.sipDotJs.libCoreMessagesBodyMod.Body
import typingsSlinky.sipDotJs.libCoreMessagesMethodsAckMod.IncomingAckRequest
import typingsSlinky.sipDotJs.libCoreMessagesMethodsByeMod.IncomingByeRequest
import typingsSlinky.sipDotJs.libCoreMessagesMethodsByeMod.OutgoingByeRequest
import typingsSlinky.sipDotJs.libCoreMessagesMethodsInfoMod.IncomingInfoRequest
import typingsSlinky.sipDotJs.libCoreMessagesMethodsInviteMod.AckableIncomingResponseWithSession
import typingsSlinky.sipDotJs.libCoreMessagesMethodsInviteMod.IncomingInviteRequest
import typingsSlinky.sipDotJs.libCoreMessagesMethodsInviteMod.OutgoingInviteRequest
import typingsSlinky.sipDotJs.libCoreMessagesMethodsNotifyMod.IncomingNotifyRequest
import typingsSlinky.sipDotJs.libCoreMessagesMethodsPrackMod.IncomingPrackRequest
import typingsSlinky.sipDotJs.libCoreMessagesMethodsReferMod.IncomingReferRequest
import typingsSlinky.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipDotJs.libCoreMessagesOutgoingDashRequestMod.RequestOptions
import typingsSlinky.sipDotJs.libCoreMod.Logger
import typingsSlinky.sipDotJs.libCoreMod.NameAddrHeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/session", JSImport.Namespace)
@js.native
object libApiSessionMod extends js.Object {
  @js.native
  abstract class Session protected () extends js.Object {
    /**
      * Constructor.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @internal
      */
    protected def this(userAgent: UserAgent) = this()
    protected def this(userAgent: UserAgent, options: SessionOptions) = this()
    /** Dialogs session description handler. */
    var _sessionDescriptionHandler: js.Any = js.native
    /** Session state. */
    var _state: js.Any = js.native
    /** Session state emitter. */
    var _stateEventEmitter: js.Any = js.native
    /** @internal */
    var assertedIdentity: js.UndefOr[NameAddrHeader] = js.native
    /** @internal */
    var body: js.UndefOr[BodyAndContentType | String] = js.native
    /** @internal */
    var contact: js.UndefOr[String] = js.native
    /** @internal */
    var contentType: js.UndefOr[String] = js.native
    /**
      * Property reserved for use by instance owner.
      * @defaultValue `undefined`
      */
    var data: js.UndefOr[js.Any] = js.native
    /**
      * The session delegate.
      * @defaultValue `undefined`
      */
    var delegate: js.UndefOr[SessionDelegate] = js.native
    /**
      * The confirmed session dialog.
      */
    var dialog: js.UndefOr[typingsSlinky.sipDotJs.libCoreSessionSessionMod.Session] = js.native
    var getReasonHeaderValue: js.Any = js.native
    /**
      * Unique identifier for this session.
      * @internal
      */
    var id: js.UndefOr[String] = js.native
    /** @internal */
    var localIdentity: NameAddrHeader = js.native
    /**
      * Logger.
      * @internal
      */
    var logger: Logger = js.native
    /** True if there is a re-INVITE request outstanding. */
    var pendingReinvite: js.Any = js.native
    /** @internal */
    var referral: js.UndefOr[Inviter] = js.native
    /**
      * Inviter options to use when following a REFER.
      * FIXME: This is getting in the Inviter constructor, but not by Invitation (thus undefined).
      * @internal
      */
    var referralInviterOptions: js.UndefOr[InviterOptions] = js.native
    /** @internal */
    var referrer: js.UndefOr[Referrer] = js.native
    /** @internal */
    var remoteIdentity: NameAddrHeader = js.native
    /** @internal */
    var renderbody: js.UndefOr[String] = js.native
    /** @internal */
    var rendertype: js.UndefOr[String] = js.native
    /** @internal */
    var replacee: js.UndefOr[Session] = js.native
    /**
      * Session description handler.
      * @remarks
      * If `this` is an instance of `Invitation`,
      * `sessionDescriptionHandler` will be defined when the session state changes to "established".
      * If `this` is an instance of `Inviter` and an offer was sent in the INVITE,
      * `sessionDescriptionHandler` will be defined when the session state changes to "establishing".
      * If `this` is an instance of `Inviter` and an offer was not sent in the INVITE,
      * `sessionDescriptionHandler` will be defined when the session state changes to "established".
      * Otherwise `undefined`.
      */
    val sessionDescriptionHandler: js.UndefOr[SessionDescriptionHandler] = js.native
    /** @internal */
    var sessionDescriptionHandlerModifiers: js.UndefOr[js.Array[SessionDescriptionHandlerModifier]] = js.native
    /** @internal */
    var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.native
    /**
      * Session state.
      */
    val state: SessionState = js.native
    /**
      * Session state change emitter.
      */
    val stateChange: Emitter[SessionState] = js.native
    /** @internal */
    var userAgent: UserAgent = js.native
    /**
      * Send BYE.
      * @param delegate - Request delegate.
      * @param options - Request options bucket.
      * @internal
      */
    def _bye(): js.Promise[OutgoingByeRequest] = js.native
    def _bye(delegate: OutgoingRequestDelegate): js.Promise[OutgoingByeRequest] = js.native
    def _bye(delegate: OutgoingRequestDelegate, options: RequestOptions): js.Promise[OutgoingByeRequest] = js.native
    /**
      * Send INFO.
      * @param delegate - Request delegate.
      * @param options - Request options bucket.
      * @internal
      */
    def _info(): js.Promise[OutgoingByeRequest] = js.native
    def _info(delegate: OutgoingRequestDelegate): js.Promise[OutgoingByeRequest] = js.native
    def _info(delegate: OutgoingRequestDelegate, options: RequestOptions): js.Promise[OutgoingByeRequest] = js.native
    /**
      * Send ACK and then BYE. There are unrecoverable errors which can occur
      * while handling dialog forming and in-dialog INVITE responses and when
      * they occur we ACK the response and send a BYE.
      * Note that the BYE is sent in the dialog associated with the response
      * which is not necessarily `this.dialog`. And, accordingly, the
      * session state is not transitioned to terminated and session is not closed.
      * @param inviteResponse - The response causing the error.
      * @param statusCode - Status code for he reason phrase.
      * @param reasonPhrase - Reason phrase for the BYE.
      * @internal
      */
    /* protected */ def ackAndBye(response: AckableIncomingResponseWithSession): Unit = js.native
    /* protected */ def ackAndBye(response: AckableIncomingResponseWithSession, statusCode: Double): Unit = js.native
    /* protected */ def ackAndBye(response: AckableIncomingResponseWithSession, statusCode: Double, reasonPhrase: String): Unit = js.native
    /**
      * Destructor.
      */
    def dispose(): js.Promise[Unit] = js.native
    /**
      * Generate an offer or answer for a response to an INVITE request.
      * If a remote offer was provided in the request, set the remote
      * description and get a local answer. If a remote offer was not
      * provided, generates a local offer.
      * @internal
      */
    /* protected */ def generateResponseOfferAnswer(request: IncomingInviteRequest, options: Anon_SessionDescriptionHandlerModifiers): js.Promise[js.UndefOr[Body]] = js.native
    /**
      * Generate an offer or answer for a response to an INVITE request
      * when a dialog (early or otherwise) has already been established.
      * This method may NOT be called if a dialog has yet to be established.
      * @internal
      */
    /* protected */ def generateResponseOfferAnswerInDialog(options: Anon_SessionDescriptionHandlerModifiers): js.Promise[js.UndefOr[Body]] = js.native
    /**
      * Get local offer.
      * @internal
      */
    /* protected */ def getOffer(options: Anon_SessionDescriptionHandlerModifiers): js.Promise[Body] = js.native
    /**
      * Renegotiate the session. Sends a re-INVITE.
      * @param options - Options bucket.
      */
    def invite(): js.Promise[OutgoingInviteRequest] = js.native
    def invite(options: SessionInviteOptions): js.Promise[OutgoingInviteRequest] = js.native
    /**
      * Handle in dialog ACK request.
      * @internal
      */
    /* protected */ def onAckRequest(request: IncomingAckRequest): Unit = js.native
    /**
      * Handle in dialog BYE request.
      * @internal
      */
    /* protected */ def onByeRequest(request: IncomingByeRequest): Unit = js.native
    /**
      * Handle in dialog INFO request.
      * @internal
      */
    /* protected */ def onInfoRequest(request: IncomingInfoRequest): Unit = js.native
    /**
      * Handle in dialog INVITE request.
      * @internal
      */
    /* protected */ def onInviteRequest(request: IncomingInviteRequest): Unit = js.native
    /**
      * Handle in dialog NOTIFY request.
      * @internal
      */
    /* protected */ def onNotifyRequest(request: IncomingNotifyRequest): Unit = js.native
    /**
      * Handle in dialog PRACK request.
      * @internal
      */
    /* protected */ def onPrackRequest(request: IncomingPrackRequest): Unit = js.native
    /**
      * Handle in dialog REFER request.
      * @internal
      */
    /* protected */ def onReferRequest(request: IncomingReferRequest): Unit = js.native
    /**
      * Send REFER.
      * @param referrer - Referrer.
      * @param delegate - Request delegate.
      * @param options - Request options bucket.
      * @internal
      */
    def refer(referrer: Referrer): js.Promise[OutgoingByeRequest] = js.native
    def refer(referrer: Referrer, delegate: OutgoingRequestDelegate): js.Promise[OutgoingByeRequest] = js.native
    def refer(referrer: Referrer, delegate: OutgoingRequestDelegate, options: RequestOptions): js.Promise[OutgoingByeRequest] = js.native
    /**
      * Rollback local/remote offer.
      * @internal
      */
    /* protected */ def rollbackOffer(): js.Promise[Unit] = js.native
    /**
      * Session description handler factory.
      */
    def sessionDescriptionHandlerFactory(session: Session): SessionDescriptionHandler = js.native
    def sessionDescriptionHandlerFactory(session: Session, options: js.Object): SessionDescriptionHandler = js.native
    /**
      * Set remote answer.
      * @internal
      */
    /* protected */ def setAnswer(answer: Body, options: Anon_SessionDescriptionHandlerModifiers): js.Promise[Unit] = js.native
    /**
      * Set remote offer and get local answer.
      * @internal
      */
    /* protected */ def setOfferAndGetAnswer(offer: Body, options: Anon_SessionDescriptionHandlerModifiers): js.Promise[Body] = js.native
    /**
      * SDH for confirmed dialog.
      * @internal
      */
    /* protected */ def setSessionDescriptionHandler(sdh: SessionDescriptionHandler): Unit = js.native
    /**
      * SDH for confirmed dialog.
      * @internal
      */
    /* protected */ def setupSessionDescriptionHandler(): SessionDescriptionHandler = js.native
    /**
      * Transition session state.
      * @internal
      */
    /* protected */ def stateTransition(newState: SessionState): Unit = js.native
  }
  
}


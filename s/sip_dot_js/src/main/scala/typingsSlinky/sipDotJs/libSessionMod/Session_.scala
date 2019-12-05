package typingsSlinky.sipDotJs.libSessionMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.events.eventsMod.EventEmitter
import typingsSlinky.sipDotJs.libConstantsMod.C.causes
import typingsSlinky.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequest
import typingsSlinky.sipDotJs.libCoreMessagesMethodsAckMod.IncomingAckRequest
import typingsSlinky.sipDotJs.libCoreMod.IncomingRequestMessage
import typingsSlinky.sipDotJs.libCoreMod.IncomingResponseMessage
import typingsSlinky.sipDotJs.libCoreMod.Logger
import typingsSlinky.sipDotJs.libCoreMod.NameAddrHeader
import typingsSlinky.sipDotJs.libCoreMod.OutgoingRequestMessage
import typingsSlinky.sipDotJs.libEnumsMod.SessionStatus
import typingsSlinky.sipDotJs.libEnumsMod.TypeStrings
import typingsSlinky.sipDotJs.libReferContextMod.ReferClientContext
import typingsSlinky.sipDotJs.libReferContextMod.ReferServerContext
import typingsSlinky.sipDotJs.libSessionDTMFMod.DTMF
import typingsSlinky.sipDotJs.libSessionDashDescriptionDashHandlerDashFactoryMod.SessionDescriptionHandlerFactory
import typingsSlinky.sipDotJs.libSessionDashDescriptionDashHandlerDashFactoryMod.SessionDescriptionHandlerFactoryOptions
import typingsSlinky.sipDotJs.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler
import typingsSlinky.sipDotJs.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifier
import typingsSlinky.sipDotJs.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
import typingsSlinky.sipDotJs.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions
import typingsSlinky.sipDotJs.libSessionMod.Session.DtmfOptions
import typingsSlinky.sipDotJs.libUAMod.UA
import typingsSlinky.sipDotJs.sipDotJsStrings.`SessionDescriptionHandler-created`
import typingsSlinky.sipDotJs.sipDotJsStrings.accepted
import typingsSlinky.sipDotJs.sipDotJsStrings.ack_
import typingsSlinky.sipDotJs.sipDotJsStrings.bye_
import typingsSlinky.sipDotJs.sipDotJsStrings.cancel_
import typingsSlinky.sipDotJs.sipDotJsStrings.confirmed
import typingsSlinky.sipDotJs.sipDotJsStrings.connecting
import typingsSlinky.sipDotJs.sipDotJsStrings.dialog
import typingsSlinky.sipDotJs.sipDotJsStrings.directionChanged
import typingsSlinky.sipDotJs.sipDotJsStrings.dtmf
import typingsSlinky.sipDotJs.sipDotJsStrings.failed
import typingsSlinky.sipDotJs.sipDotJsStrings.notify_
import typingsSlinky.sipDotJs.sipDotJsStrings.progress
import typingsSlinky.sipDotJs.sipDotJsStrings.referAccepted
import typingsSlinky.sipDotJs.sipDotJsStrings.referInviteSent
import typingsSlinky.sipDotJs.sipDotJsStrings.referProgress
import typingsSlinky.sipDotJs.sipDotJsStrings.referRejected
import typingsSlinky.sipDotJs.sipDotJsStrings.referRequestAccepted
import typingsSlinky.sipDotJs.sipDotJsStrings.referRequestProgress
import typingsSlinky.sipDotJs.sipDotJsStrings.referRequestRejected
import typingsSlinky.sipDotJs.sipDotJsStrings.referRequested
import typingsSlinky.sipDotJs.sipDotJsStrings.reinvite
import typingsSlinky.sipDotJs.sipDotJsStrings.reinviteAccepted
import typingsSlinky.sipDotJs.sipDotJsStrings.reinviteFailed
import typingsSlinky.sipDotJs.sipDotJsStrings.rejected
import typingsSlinky.sipDotJs.sipDotJsStrings.renegotiationError
import typingsSlinky.sipDotJs.sipDotJsStrings.replaced
import typingsSlinky.sipDotJs.sipDotJsStrings.terminated
import typingsSlinky.sipDotJs.sipDotJsStrings.trackAdded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Session", "Session")
@js.native
abstract class Session_ protected () extends EventEmitter {
  protected def this(sessionDescriptionHandlerFactory: SessionDescriptionHandlerFactory) = this()
  var assertedIdentity: js.UndefOr[NameAddrHeader] = js.native
  var body: js.Any = js.native
  var contact: js.UndefOr[String] = js.native
  var contentType: String = js.native
  var data: js.Any = js.native
  var earlySdp: js.UndefOr[String] = js.native
  var endTime: js.UndefOr[js.Date] = js.native
  var fromTag: js.UndefOr[String] = js.native
  var hasAnswer: Boolean = js.native
  var hasOffer: Boolean = js.native
  var id: String = js.native
  var localHold: Boolean = js.native
  var localIdentity: NameAddrHeader = js.native
  var logger: Logger = js.native
  var method: String = js.native
  var modifiers: js.UndefOr[js.Array[SessionDescriptionHandlerModifier]] = js.native
  var onInfo: js.UndefOr[js.Function1[/* request */ IncomingRequestMessage, Unit]] = js.native
  var passedOptions: js.Any = js.native
  var pendingReinvite: js.Any = js.native
  var referContext: js.Any = js.native
  var rel100: String = js.native
  var remoteIdentity: NameAddrHeader = js.native
  var renderbody: js.UndefOr[String] = js.native
  var rendertype: js.UndefOr[String] = js.native
  var replacee: js.UndefOr[InviteClientContext | InviteServerContext] = js.native
  var session: js.UndefOr[typingsSlinky.sipDotJs.libCoreSessionSessionMod.Session] = js.native
  var sessionDescriptionHandler: js.UndefOr[SessionDescriptionHandler] = js.native
  @JSName("sessionDescriptionHandlerFactory")
  var sessionDescriptionHandlerFactory_Original: SessionDescriptionHandlerFactory = js.native
  var sessionDescriptionHandlerOptions: js.Any = js.native
  var startTime: js.UndefOr[js.Date] = js.native
  var status: SessionStatus = js.native
  var timers: StringDictionary[js.Any] = js.native
  var tones: js.Any = js.native
  var `type`: TypeStrings = js.native
  var ua: UA = js.native
  /* protected */ def accepted(): this.type = js.native
  /* protected */ def accepted(response: String): this.type = js.native
  /* protected */ def accepted(response: String, cause: String): this.type = js.native
  /* protected */ def accepted(response: IncomingResponseMessage): this.type = js.native
  /* protected */ def accepted(response: IncomingResponseMessage, cause: String): this.type = js.native
  def bye(): this.type = js.native
  def bye(options: js.Any): this.type = js.native
  /* protected */ def canceled(): this.type = js.native
  def close(): this.type = js.native
  /* protected */ def connecting(request: IncomingRequestMessage): this.type = js.native
  def dtmf(tones: String): this.type = js.native
  def dtmf(tones: String, options: DtmfOptions): this.type = js.native
  def dtmf(tones: Double): this.type = js.native
  def dtmf(tones: Double, options: DtmfOptions): this.type = js.native
  /* protected */ def errorListener(args: js.Any*): Unit = js.native
  /* protected */ def failed(response: js.UndefOr[scala.Nothing], cause: String): this.type = js.native
  /* protected */ def failed(response: IncomingRequestMessage, cause: String): this.type = js.native
  /* protected */ def failed(response: IncomingResponseMessage, cause: String): this.type = js.native
  def hold(): Unit = js.native
  def hold(options: SessionDescriptionHandlerOptions): Unit = js.native
  def hold(options: SessionDescriptionHandlerOptions, modifiers: SessionDescriptionHandlerModifiers): Unit = js.native
  def on(
    event: referInviteSent | referProgress | referAccepted | referRejected | referRequestProgress | referRequestAccepted | referRequestRejected | reinvite | reinviteAccepted | reinviteFailed | replaced,
    listener: js.Function1[/* session */ this.type, Unit]
  ): this.type = js.native
  /* protected */ def onAck(incomingRequest: IncomingAckRequest): Unit = js.native
  def onDialogError(response: IncomingResponseMessage): Unit = js.native
  def onRequestTimeout(): Unit = js.native
  def onTransportError(): Unit = js.native
  @JSName("on")
  def on_SessionDescriptionHandlercreated(
    event: `SessionDescriptionHandler-created`,
    listener: js.Function1[/* sessionDescriptionHandler */ SessionDescriptionHandler, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_accepted(event: accepted, listener: js.Function2[/* response */ js.Any, /* cause */ causes, Unit]): this.type = js.native
  @JSName("on")
  def on_ack(event: ack_, listener: js.Function1[/* request */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_bye(event: bye_, listener: js.Function1[/* request */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_cancel(event: cancel_, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_confirmed(event: confirmed, listener: js.Function1[/* request */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_connecting(event: connecting, listener: js.Function1[/* request */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_dialog(event: dialog, listener: js.Function1[/* dialog */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_directionChanged(event: directionChanged, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_dtmf(
    event: dtmf,
    listener: js.Function2[/* request */ IncomingRequestMessage | OutgoingRequestMessage, /* dtmf */ DTMF, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_failed(
    event: failed,
    listener: js.Function2[/* response */ js.UndefOr[js.Any], /* cause */ js.UndefOr[causes], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_notify(event: notify_, listener: js.Function1[/* request */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_progress(
    event: progress,
    listener: js.Function2[
      /* response */ IncomingResponseMessage | String, 
      /* reasonPhrase */ js.UndefOr[js.Any], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_referRequested(event: referRequested, listener: js.Function1[/* context */ ReferServerContext, Unit]): this.type = js.native
  @JSName("on")
  def on_rejected(
    event: rejected,
    listener: js.Function2[/* response */ js.UndefOr[js.Any], /* cause */ js.UndefOr[causes], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_renegotiationError(event: renegotiationError, listener: js.Function1[/* error */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_terminated(
    event: terminated,
    listener: js.Function2[/* message */ js.UndefOr[js.Any], /* cause */ js.UndefOr[causes], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_trackAdded(event: trackAdded, listener: js.Function0[Unit]): this.type = js.native
  /* protected */ def receiveReinvite(incomingRequest: IncomingRequest): Unit = js.native
  /* protected */ def receiveRequest(incomingRequest: IncomingRequest): Unit = js.native
  def refer(target: String): ReferClientContext = js.native
  def refer(target: String, options: js.Any): ReferClientContext = js.native
  def refer(target: InviteClientContext): ReferClientContext = js.native
  def refer(target: InviteClientContext, options: js.Any): ReferClientContext = js.native
  def refer(target: InviteServerContext): ReferClientContext = js.native
  def refer(target: InviteServerContext, options: js.Any): ReferClientContext = js.native
  def reinvite(): Unit = js.native
  def reinvite(options: js.Any): Unit = js.native
  def reinvite(options: js.Any, modifiers: SessionDescriptionHandlerModifiers): Unit = js.native
  /* protected */ def rejected(response: IncomingRequestMessage, cause: String): this.type = js.native
  /* protected */ def rejected(response: IncomingResponseMessage, cause: String): this.type = js.native
  /* protected */ def sendReinvite(): Unit = js.native
  /* protected */ def sendReinvite(options: js.Any): Unit = js.native
  /**
    * Sends in dialog request.
    * @param method Request method.
    * @param options Options bucket.
    */
  def sendRequest(method: String): this.type = js.native
  def sendRequest(method: String, options: js.Any): this.type = js.native
  /* protected */ def sessionDescriptionHandlerFactory(session: InviteClientContext): SessionDescriptionHandler = js.native
  /* protected */ def sessionDescriptionHandlerFactory(session: InviteClientContext, options: SessionDescriptionHandlerFactoryOptions): SessionDescriptionHandler = js.native
  /* protected */ def sessionDescriptionHandlerFactory(session: InviteServerContext): SessionDescriptionHandler = js.native
  /* protected */ def sessionDescriptionHandlerFactory(session: InviteServerContext, options: SessionDescriptionHandlerFactoryOptions): SessionDescriptionHandler = js.native
  def terminate(): this.type = js.native
  def terminate(options: js.Any): this.type = js.native
  /* protected */ def terminated(): this.type = js.native
  /* protected */ def terminated(message: IncomingRequestMessage): this.type = js.native
  /* protected */ def terminated(message: IncomingRequestMessage, cause: String): this.type = js.native
  /* protected */ def terminated(message: IncomingResponseMessage): this.type = js.native
  /* protected */ def terminated(message: IncomingResponseMessage, cause: String): this.type = js.native
  def unhold(): Unit = js.native
  def unhold(options: SessionDescriptionHandlerOptions): Unit = js.native
  def unhold(options: SessionDescriptionHandlerOptions, modifiers: SessionDescriptionHandlerModifiers): Unit = js.native
}


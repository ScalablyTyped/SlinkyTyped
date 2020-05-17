package typingsSlinky.std

import typingsSlinky.std.stdStrings.connectionstatechange
import typingsSlinky.std.stdStrings.datachannel
import typingsSlinky.std.stdStrings.icecandidate
import typingsSlinky.std.stdStrings.icecandidateerror
import typingsSlinky.std.stdStrings.iceconnectionstatechange
import typingsSlinky.std.stdStrings.icegatheringstatechange
import typingsSlinky.std.stdStrings.negotiationneeded
import typingsSlinky.std.stdStrings.signalingstatechange
import typingsSlinky.std.stdStrings.statsended
import typingsSlinky.std.stdStrings.track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A WebRTC connection between the local computer and a remote peer. It provides methods to connect to a remote peer, maintain and monitor the connection, and close the connection once it's no longer needed. */
@js.native
trait RTCPeerConnection extends EventTarget {
  val canTrickleIceCandidates: scala.Boolean | Null = js.native
  val connectionState: RTCPeerConnectionState = js.native
  val currentLocalDescription: org.scalajs.dom.experimental.webrtc.RTCSessionDescription | Null = js.native
  val currentRemoteDescription: org.scalajs.dom.experimental.webrtc.RTCSessionDescription | Null = js.native
  val iceConnectionState: org.scalajs.dom.experimental.webrtc.RTCIceConnectionState = js.native
  val iceGatheringState: org.scalajs.dom.experimental.webrtc.RTCIceGatheringState = js.native
  val idpErrorInfo: java.lang.String | Null = js.native
  val idpLoginUrl: java.lang.String | Null = js.native
  val localDescription: org.scalajs.dom.experimental.webrtc.RTCSessionDescription | Null = js.native
  var onconnectionstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var ondatachannel: (js.ThisFunction1[
    /* this */ this.type, 
    /* ev */ org.scalajs.dom.experimental.webrtc.RTCDataChannelEvent, 
    _
  ]) | Null = js.native
  var onicecandidate: (js.ThisFunction1[
    /* this */ this.type, 
    /* ev */ org.scalajs.dom.experimental.webrtc.RTCPeerConnectionIceEvent, 
    _
  ]) | Null = js.native
  var onicecandidateerror: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, _]) | Null = js.native
  var oniceconnectionstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onicegatheringstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onnegotiationneeded: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onsignalingstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onstatsended: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCStatsEvent, _]) | Null = js.native
  var ontrack: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, _]) | Null = js.native
  val peerIdentity: js.Promise[org.scalajs.dom.experimental.webrtc.RTCIdentityAssertion] = js.native
  val pendingLocalDescription: org.scalajs.dom.experimental.webrtc.RTCSessionDescription | Null = js.native
  val pendingRemoteDescription: org.scalajs.dom.experimental.webrtc.RTCSessionDescription | Null = js.native
  val remoteDescription: org.scalajs.dom.experimental.webrtc.RTCSessionDescription | Null = js.native
  val sctp: RTCSctpTransport | Null = js.native
  val signalingState: org.scalajs.dom.experimental.webrtc.RTCSignalingState = js.native
  @JSName("addEventListener")
  def addEventListener_connectionstatechange(
    `type`: connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionstatechange(
    `type`: connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionstatechange(
    `type`: connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.webrtc.RTCDataChannelEvent, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.webrtc.RTCDataChannelEvent, 
      _
    ],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.webrtc.RTCDataChannelEvent, 
      _
    ],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.webrtc.RTCPeerConnectionIceEvent, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.webrtc.RTCPeerConnectionIceEvent, 
      _
    ],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.webrtc.RTCPeerConnectionIceEvent, 
      _
    ],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidateerror(
    `type`: icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidateerror(
    `type`: icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidateerror(
    `type`: icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statsended(`type`: statsended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCStatsEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statsended(
    `type`: statsended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCStatsEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statsended(
    `type`: statsended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCStatsEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_track(`type`: track, listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_track(
    `type`: track,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_track(
    `type`: track,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def addIceCandidate(candidate: org.scalajs.dom.experimental.webrtc.RTCIceCandidate): js.Promise[Unit] = js.native
  def addIceCandidate(candidate: org.scalajs.dom.experimental.webrtc.RTCIceCandidateInit): js.Promise[Unit] = js.native
  def addTrack(
    track: org.scalajs.dom.experimental.mediastream.MediaStreamTrack,
    streams: org.scalajs.dom.experimental.mediastream.MediaStream*
  ): RTCRtpSender = js.native
  def addTransceiver(trackOrKind: java.lang.String): RTCRtpTransceiver = js.native
  def addTransceiver(trackOrKind: java.lang.String, init: RTCRtpTransceiverInit): RTCRtpTransceiver = js.native
  def addTransceiver(trackOrKind: org.scalajs.dom.experimental.mediastream.MediaStreamTrack): RTCRtpTransceiver = js.native
  def addTransceiver(
    trackOrKind: org.scalajs.dom.experimental.mediastream.MediaStreamTrack,
    init: RTCRtpTransceiverInit
  ): RTCRtpTransceiver = js.native
  def close(): Unit = js.native
  def createAnswer(): js.Promise[org.scalajs.dom.experimental.webrtc.RTCSessionDescriptionInit] = js.native
  def createAnswer(options: org.scalajs.dom.experimental.webrtc.RTCOfferOptions): js.Promise[org.scalajs.dom.experimental.webrtc.RTCSessionDescriptionInit] = js.native
  def createDataChannel(label: java.lang.String): org.scalajs.dom.experimental.webrtc.RTCDataChannel = js.native
  def createDataChannel(label: java.lang.String, dataChannelDict: org.scalajs.dom.experimental.webrtc.RTCDataChannelInit): org.scalajs.dom.experimental.webrtc.RTCDataChannel = js.native
  def createOffer(): js.Promise[org.scalajs.dom.experimental.webrtc.RTCSessionDescriptionInit] = js.native
  def createOffer(options: org.scalajs.dom.experimental.webrtc.RTCOfferOptions): js.Promise[org.scalajs.dom.experimental.webrtc.RTCSessionDescriptionInit] = js.native
  def getConfiguration(): org.scalajs.dom.experimental.webrtc.RTCConfiguration = js.native
  def getIdentityAssertion(): js.Promise[java.lang.String] = js.native
  def getReceivers(): js.Array[RTCRtpReceiver] = js.native
  def getSenders(): js.Array[RTCRtpSender] = js.native
  def getStats(): js.Promise[org.scalajs.dom.experimental.webrtc.RTCStatsReport] = js.native
  def getStats(selector: org.scalajs.dom.experimental.mediastream.MediaStreamTrack): js.Promise[org.scalajs.dom.experimental.webrtc.RTCStatsReport] = js.native
  def getTransceivers(): js.Array[RTCRtpTransceiver] = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionstatechange(
    `type`: connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionstatechange(
    `type`: connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionstatechange(
    `type`: connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.webrtc.RTCDataChannelEvent, 
      _
    ]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.webrtc.RTCDataChannelEvent, 
      _
    ],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.webrtc.RTCDataChannelEvent, 
      _
    ],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.webrtc.RTCPeerConnectionIceEvent, 
      _
    ]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.webrtc.RTCPeerConnectionIceEvent, 
      _
    ],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.webrtc.RTCPeerConnectionIceEvent, 
      _
    ],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidateerror(
    `type`: icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidateerror(
    `type`: icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidateerror(
    `type`: icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceErrorEvent, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statsended(`type`: statsended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCStatsEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statsended(
    `type`: statsended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCStatsEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statsended(
    `type`: statsended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCStatsEvent, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_track(`type`: track, listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_track(
    `type`: track,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_track(
    `type`: track,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  def removeTrack(sender: RTCRtpSender): Unit = js.native
  def setConfiguration(configuration: org.scalajs.dom.experimental.webrtc.RTCConfiguration): Unit = js.native
  def setIdentityProvider(provider: java.lang.String): Unit = js.native
  def setIdentityProvider(provider: java.lang.String, options: RTCIdentityProviderOptions): Unit = js.native
  def setLocalDescription(description: org.scalajs.dom.experimental.webrtc.RTCSessionDescriptionInit): js.Promise[Unit] = js.native
  def setRemoteDescription(description: org.scalajs.dom.experimental.webrtc.RTCSessionDescriptionInit): js.Promise[Unit] = js.native
}


package typingsSlinky.std

import typingsSlinky.std.stdStrings.gatheringstatechange
import typingsSlinky.std.stdStrings.selectedcandidatepairchange
import typingsSlinky.std.stdStrings.statechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to information about the ICE transport layer over which the data is being sent and received. */
@js.native
trait RTCIceTransport extends EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_gatheringstatechange(
    `type`: gatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gatheringstatechange(
    `type`: gatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gatheringstatechange(
    `type`: gatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedcandidatepairchange(
    `type`: selectedcandidatepairchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedcandidatepairchange(
    `type`: selectedcandidatepairchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedcandidatepairchange(
    `type`: selectedcandidatepairchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  val component: RTCIceComponent = js.native
  
  val gatheringState: RTCIceGathererState = js.native
  
  def getLocalCandidates(): js.Array[org.scalajs.dom.experimental.webrtc.RTCIceCandidate] = js.native
  
  def getLocalParameters(): RTCIceParameters | Null = js.native
  
  def getRemoteCandidates(): js.Array[org.scalajs.dom.experimental.webrtc.RTCIceCandidate] = js.native
  
  def getRemoteParameters(): RTCIceParameters | Null = js.native
  
  def getSelectedCandidatePair(): RTCIceCandidatePair | Null = js.native
  
  var ongatheringstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  
  var onselectedcandidatepairchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  
  var onstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_gatheringstatechange(
    `type`: gatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gatheringstatechange(
    `type`: gatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gatheringstatechange(
    `type`: gatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectedcandidatepairchange(
    `type`: selectedcandidatepairchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectedcandidatepairchange(
    `type`: selectedcandidatepairchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectedcandidatepairchange(
    `type`: selectedcandidatepairchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  
  val role: RTCIceRole = js.native
  
  val state: RTCIceTransportState = js.native
}

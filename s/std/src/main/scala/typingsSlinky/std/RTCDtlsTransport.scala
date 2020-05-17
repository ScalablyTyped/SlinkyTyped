package typingsSlinky.std

import typingsSlinky.std.stdStrings.error
import typingsSlinky.std.stdStrings.statechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCDtlsTransport
  extends EventTarget
     with RTCTransport {
  val iceTransport: RTCIceTransport = js.native
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCErrorEvent, _]) | Null = js.native
  var onstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  val state: RTCDtlsTransportState = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCErrorEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCErrorEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCErrorEvent, _],
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
  def getRemoteCertificates(): js.Array[js.typedarray.ArrayBuffer] = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCErrorEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCErrorEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCErrorEvent, _],
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
}


package typingsSlinky.webrtc

import org.scalajs.dom.experimental.webrtc.RTCDataChannelState
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.MessageEvent
import typingsSlinky.std.EventTarget
import typingsSlinky.std.RTCErrorEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCDataChannel extends EventTarget {
  
  var binaryType: String = js.native
  
  val bufferedAmount: Double = js.native
  
  var bufferedAmountLowThreshold: Double = js.native
  
  def close(): Unit = js.native
  
  val id: Double | Null = js.native
  
  val label: String = js.native
  
  val maxPacketLifeTime: Double | Null = js.native
  
  val maxRetransmits: Double | Null = js.native
  
  val negotiated: Boolean = js.native
  
  var onbufferedamountlow: DataChannelEventHandler[Event] = js.native
  
  var onclose: DataChannelEventHandler[Event] = js.native
  
  var onerror: DataChannelEventHandler[RTCErrorEvent] = js.native
  
  var onmessage: DataChannelEventHandler[MessageEvent] = js.native
  
  var onopen: DataChannelEventHandler[Event] = js.native
  
  val ordered: Boolean = js.native
  
  val protocol: String = js.native
  
  val readyState: RTCDataChannelState = js.native
  
  def send(data: String): Unit = js.native
  def send(data: js.typedarray.ArrayBuffer): Unit = js.native
  def send(data: js.typedarray.ArrayBufferView): Unit = js.native
  def send(data: Blob): Unit = js.native
}

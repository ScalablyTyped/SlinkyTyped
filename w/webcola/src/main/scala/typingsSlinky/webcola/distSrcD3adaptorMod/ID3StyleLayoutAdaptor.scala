package typingsSlinky.webcola.distSrcD3adaptorMod

import typingsSlinky.webcola.distSrcLayoutMod.Event
import typingsSlinky.webcola.distSrcLayoutMod.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ID3StyleLayoutAdaptor extends js.Object {
  def drag(): js.Any = js.native
  def kick(): Unit = js.native
  def on(eventType: String, listener: js.Function0[Unit]): ID3StyleLayoutAdaptor = js.native
  def on(eventType: EventType, listener: js.Function0[Unit]): ID3StyleLayoutAdaptor = js.native
  def trigger(e: Event): Unit = js.native
}


package typingsSlinky.winrtUwp.Windows.Devices.Perception

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.framearrived
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reads infrared frames from a infrared frame source. */
@js.native
trait PerceptionInfraredFrameReader extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_framearrived(
    `type`: framearrived,
    listener: TypedEventHandler[PerceptionInfraredFrameReader, PerceptionInfraredFrameArrivedEventArgs]
  ): Unit = js.native
  
  /** Releases system resources that are exposed by a Windows Runtime object */
  def close(): Unit = js.native
  
  /** Gets a boolean value indicating whether or not this reader is paused. */
  var isPaused: Boolean = js.native
  
  /** Subscribes to the FrameArrived event. This event is fired whenever a new frame arrives from the infrared frame source. */
  def onframearrived(ev: PerceptionInfraredFrameArrivedEventArgs with WinRTEvent[PerceptionInfraredFrameReader]): Unit = js.native
  /** Subscribes to the FrameArrived event. This event is fired whenever a new frame arrives from the infrared frame source. */
  @JSName("onframearrived")
  var onframearrived_Original: TypedEventHandler[PerceptionInfraredFrameReader, PerceptionInfraredFrameArrivedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_framearrived(
    `type`: framearrived,
    listener: TypedEventHandler[PerceptionInfraredFrameReader, PerceptionInfraredFrameArrivedEventArgs]
  ): Unit = js.native
  
  /** Gets the infrared frame source this reader gets frames from. */
  var source: PerceptionInfraredFrameSource = js.native
  
  /**
    * Attempts to read the most recent frame that is available to this infrared frame reader.
    * @return If the attempt was successful, this method returns the most recent frame that is available to this infrared frame reader. If the attempt was not successful, this method returns null.
    */
  def tryReadLatestFrame(): PerceptionInfraredFrame = js.native
}

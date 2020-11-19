package typingsSlinky.winrtUwp.Windows.Devices.Perception

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.framearrived
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reads color frames from a color frame source. */
@js.native
trait PerceptionColorFrameReader extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_framearrived(
    `type`: framearrived,
    listener: TypedEventHandler[PerceptionColorFrameReader, PerceptionColorFrameArrivedEventArgs]
  ): Unit = js.native
  
  /** Releases system resources that are exposed by a Windows Runtime object. */
  def close(): Unit = js.native
  
  /** Gets or sets a boolean value indicating whether or not this reader is paused. */
  var isPaused: Boolean = js.native
  
  /** Subscribes to the FrameArrived event. This event is fired whenever a new frame arrives from the color frame source. */
  def onframearrived(ev: PerceptionColorFrameArrivedEventArgs with WinRTEvent[PerceptionColorFrameReader]): Unit = js.native
  /** Subscribes to the FrameArrived event. This event is fired whenever a new frame arrives from the color frame source. */
  @JSName("onframearrived")
  var onframearrived_Original: TypedEventHandler[PerceptionColorFrameReader, PerceptionColorFrameArrivedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_framearrived(
    `type`: framearrived,
    listener: TypedEventHandler[PerceptionColorFrameReader, PerceptionColorFrameArrivedEventArgs]
  ): Unit = js.native
  
  /** Gets the color frame source this reader gets frames from. */
  var source: PerceptionColorFrameSource = js.native
  
  /**
    * Attempts to read the most recent frame that is available to this color frame reader.
    * @return If the attempt was successful, this method returns the most recent frame that is available to this color frame reader. If the attempt was not successful, this method returns null.
    */
  def tryReadLatestFrame(): PerceptionColorFrame = js.native
}

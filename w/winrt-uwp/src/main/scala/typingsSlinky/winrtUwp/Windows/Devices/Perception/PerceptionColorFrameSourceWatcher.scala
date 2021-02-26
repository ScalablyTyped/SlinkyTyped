package typingsSlinky.winrtUwp.Windows.Devices.Perception

import typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceWatcherStatus
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.enumerationcompleted
import typingsSlinky.winrtUwp.winrtUwpStrings.sourceadded
import typingsSlinky.winrtUwp.winrtUwpStrings.sourceremoved
import typingsSlinky.winrtUwp.winrtUwpStrings.stopped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Monitors changes to the list of color frame sources, and provides notifications when the list changes. */
@js.native
trait PerceptionColorFrameSourceWatcher extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enumerationcompleted(`type`: enumerationcompleted, listener: TypedEventHandler[PerceptionColorFrameSourceWatcher, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceadded(
    `type`: sourceadded,
    listener: TypedEventHandler[PerceptionColorFrameSourceWatcher, PerceptionColorFrameSourceAddedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceremoved(
    `type`: sourceremoved,
    listener: TypedEventHandler[PerceptionColorFrameSourceWatcher, PerceptionColorFrameSourceRemovedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stopped(`type`: stopped, listener: TypedEventHandler[PerceptionColorFrameSourceWatcher, _]): Unit = js.native
  
  /** Subscribes to the EnumerationCompleted event. This event is fired after the initial enumeration of known color frame sources is complete. */
  def onenumerationcompleted(ev: js.Any with WinRTEvent[PerceptionColorFrameSourceWatcher]): Unit = js.native
  /** Subscribes to the EnumerationCompleted event. This event is fired after the initial enumeration of known color frame sources is complete. */
  @JSName("onenumerationcompleted")
  var onenumerationcompleted_Original: TypedEventHandler[PerceptionColorFrameSourceWatcher, _] = js.native
  
  /** Subscribes to the SourceAdded event. */
  def onsourceadded(ev: PerceptionColorFrameSourceAddedEventArgs with WinRTEvent[PerceptionColorFrameSourceWatcher]): Unit = js.native
  /** Subscribes to the SourceAdded event. */
  @JSName("onsourceadded")
  var onsourceadded_Original: TypedEventHandler[PerceptionColorFrameSourceWatcher, PerceptionColorFrameSourceAddedEventArgs] = js.native
  
  /** Subscribes to the SourceRemoved event. This event is fired once for every color frame source that is removed. */
  def onsourceremoved(ev: PerceptionColorFrameSourceRemovedEventArgs with WinRTEvent[PerceptionColorFrameSourceWatcher]): Unit = js.native
  /** Subscribes to the SourceRemoved event. This event is fired once for every color frame source that is removed. */
  @JSName("onsourceremoved")
  var onsourceremoved_Original: TypedEventHandler[PerceptionColorFrameSourceWatcher, PerceptionColorFrameSourceRemovedEventArgs] = js.native
  
  /** Subscribes to the Stopped event. This event is fired when the IPerceptionColorFrameSourceWatcher has stopped listening for changes to the list of color frame sources. */
  def onstopped(ev: js.Any with WinRTEvent[PerceptionColorFrameSourceWatcher]): Unit = js.native
  /** Subscribes to the Stopped event. This event is fired when the IPerceptionColorFrameSourceWatcher has stopped listening for changes to the list of color frame sources. */
  @JSName("onstopped")
  var onstopped_Original: TypedEventHandler[PerceptionColorFrameSourceWatcher, _] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enumerationcompleted(`type`: enumerationcompleted, listener: TypedEventHandler[PerceptionColorFrameSourceWatcher, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceadded(
    `type`: sourceadded,
    listener: TypedEventHandler[PerceptionColorFrameSourceWatcher, PerceptionColorFrameSourceAddedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceremoved(
    `type`: sourceremoved,
    listener: TypedEventHandler[PerceptionColorFrameSourceWatcher, PerceptionColorFrameSourceRemovedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stopped(`type`: stopped, listener: TypedEventHandler[PerceptionColorFrameSourceWatcher, _]): Unit = js.native
  
  /** When this method is called, the color frame source watcher enumerates any existing color frame sources it has not already enumerated by firing a SourceAdded event for each one. An EnumerationCompleted event is fired when this enumeration is complete. The color frame source then starts watching for new color frame sources. */
  def start(): Unit = js.native
  
  /** Gets the operational status of the color frame source watcher. */
  var status: DeviceWatcherStatus = js.native
  
  /** When this method is called, the color frame source watcher stops looking for changes to the color frame source list. This operation is not immediate; the Stopped event will be triggered when the Stop operation is complete. */
  def stop(): Unit = js.native
}

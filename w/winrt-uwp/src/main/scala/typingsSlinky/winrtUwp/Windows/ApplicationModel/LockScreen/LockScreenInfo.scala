package typingsSlinky.winrtUwp.Windows.ApplicationModel.LockScreen

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.alarmiconchanged
import typingsSlinky.winrtUwp.winrtUwpStrings.badgeschanged
import typingsSlinky.winrtUwp.winrtUwpStrings.detailtextchanged
import typingsSlinky.winrtUwp.winrtUwpStrings.lockscreenimagechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the same data that the default lock screen has access to, such as wallpaper, badges, and so on. */
@js.native
trait LockScreenInfo extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_alarmiconchanged(`type`: alarmiconchanged, listener: TypedEventHandler[LockScreenInfo, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_badgeschanged(`type`: badgeschanged, listener: TypedEventHandler[LockScreenInfo, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_detailtextchanged(`type`: detailtextchanged, listener: TypedEventHandler[LockScreenInfo, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lockscreenimagechanged(`type`: lockscreenimagechanged, listener: TypedEventHandler[LockScreenInfo, _]): Unit = js.native
  
  /** Gets the alarm icon to display. */
  var alarmIcon: IRandomAccessStream = js.native
  
  /** Gets the badges to display. */
  var badges: IVectorView[LockScreenBadge] = js.native
  
  /** Gets the detail text to display. */
  var detailText: IVectorView[String] = js.native
  
  /** Gets the image to display on the lock screen. */
  var lockScreenImage: IRandomAccessStream = js.native
  
  /** Indicates the alarm icon has changed. */
  def onalarmiconchanged(ev: js.Any with WinRTEvent[LockScreenInfo]): Unit = js.native
  /** Indicates the alarm icon has changed. */
  @JSName("onalarmiconchanged")
  var onalarmiconchanged_Original: TypedEventHandler[LockScreenInfo, _] = js.native
  
  /** Indicates the badges have changed. */
  def onbadgeschanged(ev: js.Any with WinRTEvent[LockScreenInfo]): Unit = js.native
  /** Indicates the badges have changed. */
  @JSName("onbadgeschanged")
  var onbadgeschanged_Original: TypedEventHandler[LockScreenInfo, _] = js.native
  
  /** Indicates the detail text has changed. */
  def ondetailtextchanged(ev: js.Any with WinRTEvent[LockScreenInfo]): Unit = js.native
  /** Indicates the detail text has changed. */
  @JSName("ondetailtextchanged")
  var ondetailtextchanged_Original: TypedEventHandler[LockScreenInfo, _] = js.native
  
  /** Indicates the lock screen image has changed. */
  def onlockscreenimagechanged(ev: js.Any with WinRTEvent[LockScreenInfo]): Unit = js.native
  /** Indicates the lock screen image has changed. */
  @JSName("onlockscreenimagechanged")
  var onlockscreenimagechanged_Original: TypedEventHandler[LockScreenInfo, _] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_alarmiconchanged(`type`: alarmiconchanged, listener: TypedEventHandler[LockScreenInfo, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_badgeschanged(`type`: badgeschanged, listener: TypedEventHandler[LockScreenInfo, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_detailtextchanged(`type`: detailtextchanged, listener: TypedEventHandler[LockScreenInfo, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lockscreenimagechanged(`type`: lockscreenimagechanged, listener: TypedEventHandler[LockScreenInfo, _]): Unit = js.native
}

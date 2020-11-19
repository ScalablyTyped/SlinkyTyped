package typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.Rect
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.dismissed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a dismissal event and image location information for the app's splash screen. */
@js.native
trait SplashScreen extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dismissed(`type`: dismissed, listener: TypedEventHandler[SplashScreen, _]): Unit = js.native
  
  /** The coordinates of the app's splash screen image relative to the window. */
  var imageLocation: Rect = js.native
  
  /** Fires when the app's splash screen is dismissed. */
  def ondismissed(ev: js.Any with WinRTEvent[SplashScreen]): Unit = js.native
  /** Fires when the app's splash screen is dismissed. */
  @JSName("ondismissed")
  var ondismissed_Original: TypedEventHandler[SplashScreen, _] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dismissed(`type`: dismissed, listener: TypedEventHandler[SplashScreen, _]): Unit = js.native
}

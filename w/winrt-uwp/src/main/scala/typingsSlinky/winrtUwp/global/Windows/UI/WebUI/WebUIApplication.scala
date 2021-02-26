package typingsSlinky.winrtUwp.global.Windows.UI.WebUI

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.UI.WebUI.ActivatedEventHandler
import typingsSlinky.winrtUwp.Windows.UI.WebUI.NavigatedEventHandler
import typingsSlinky.winrtUwp.Windows.UI.WebUI.ResumingEventHandler
import typingsSlinky.winrtUwp.Windows.UI.WebUI.SuspendingEventHandler
import typingsSlinky.winrtUwp.winrtUwpStrings.activated
import typingsSlinky.winrtUwp.winrtUwpStrings.navigated
import typingsSlinky.winrtUwp.winrtUwpStrings.resuming
import typingsSlinky.winrtUwp.winrtUwpStrings.suspending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables an app to receive notifications related to the lifetime of the app. */
@JSGlobal("Windows.UI.WebUI.WebUIApplication")
@js.native
abstract class WebUIApplication ()
  extends typingsSlinky.winrtUwp.Windows.UI.WebUI.WebUIApplication
object WebUIApplication {
  
  @JSGlobal("Windows.UI.WebUI.WebUIApplication")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Windows.UI.WebUI.WebUIApplication.addEventListener")
  @js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.UI.WebUI.WebUIApplication.addEventListener")
  @js.native
  def addEventListener_activated(`type`: activated, listener: ActivatedEventHandler): Unit = js.native
  /* static member */
  @JSGlobal("Windows.UI.WebUI.WebUIApplication.addEventListener")
  @js.native
  def addEventListener_navigated(`type`: navigated, listener: NavigatedEventHandler): Unit = js.native
  /* static member */
  @JSGlobal("Windows.UI.WebUI.WebUIApplication.addEventListener")
  @js.native
  def addEventListener_resuming(`type`: resuming, listener: ResumingEventHandler): Unit = js.native
  /* static member */
  @JSGlobal("Windows.UI.WebUI.WebUIApplication.addEventListener")
  @js.native
  def addEventListener_suspending(`type`: suspending, listener: SuspendingEventHandler): Unit = js.native
  
  /** Occurs when the app is activated. */
  /* static member */
  @JSGlobal("Windows.UI.WebUI.WebUIApplication.onactivated")
  @js.native
  def onactivated: ActivatedEventHandler = js.native
  @scala.inline
  def onactivated_=(x: ActivatedEventHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onactivated")(x.asInstanceOf[js.Any])
  
  /** Occurs when the app is navigating. */
  /* static member */
  @JSGlobal("Windows.UI.WebUI.WebUIApplication.onnavigated")
  @js.native
  def onnavigated: NavigatedEventHandler = js.native
  @scala.inline
  def onnavigated_=(x: NavigatedEventHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onnavigated")(x.asInstanceOf[js.Any])
  
  /** Occurs when the app is resuming. */
  /* static member */
  @JSGlobal("Windows.UI.WebUI.WebUIApplication.onresuming")
  @js.native
  def onresuming: ResumingEventHandler = js.native
  @scala.inline
  def onresuming_=(x: ResumingEventHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onresuming")(x.asInstanceOf[js.Any])
  
  /** Occurs when the app is suspending. */
  /* static member */
  @JSGlobal("Windows.UI.WebUI.WebUIApplication.onsuspending")
  @js.native
  def onsuspending: SuspendingEventHandler = js.native
  @scala.inline
  def onsuspending_=(x: SuspendingEventHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onsuspending")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Windows.UI.WebUI.WebUIApplication.removeEventListener")
  @js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  /* static member */
  @JSGlobal("Windows.UI.WebUI.WebUIApplication.removeEventListener")
  @js.native
  def removeEventListener_activated(`type`: activated, listener: ActivatedEventHandler): Unit = js.native
  /* static member */
  @JSGlobal("Windows.UI.WebUI.WebUIApplication.removeEventListener")
  @js.native
  def removeEventListener_navigated(`type`: navigated, listener: NavigatedEventHandler): Unit = js.native
  /* static member */
  @JSGlobal("Windows.UI.WebUI.WebUIApplication.removeEventListener")
  @js.native
  def removeEventListener_resuming(`type`: resuming, listener: ResumingEventHandler): Unit = js.native
  /* static member */
  @JSGlobal("Windows.UI.WebUI.WebUIApplication.removeEventListener")
  @js.native
  def removeEventListener_suspending(`type`: suspending, listener: SuspendingEventHandler): Unit = js.native
}

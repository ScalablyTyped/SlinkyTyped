package typingsSlinky.winjs.global.WinJS.UI

import org.scalajs.dom.raw.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Displays a button which is used for opening and closing a SplitView's pane.
  **/
@JSGlobal("WinJS.UI.SplitViewPaneToggle")
@js.native
/**
  * Creates a new SplitViewPaneToggle.
  * @constructor
  * @param element The DOM element hosts the new SplitViewPaneToggle.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class SplitViewPaneToggle ()
  extends typingsSlinky.winjs.WinJS.UI.SplitViewPaneToggle {
  def this(element: HTMLButtonElement) = this()
  def this(element: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(element: HTMLButtonElement, options: js.Any) = this()
}
/* static members */
@JSGlobal("WinJS.UI.SplitViewPaneToggle")
@js.native
object SplitViewPaneToggle extends js.Object {
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

package typingsSlinky.winjs.mod.UI

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.winjs.anon.Bottom
import typingsSlinky.winjs.anon.Compact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion Interfaces
//#region Objects
/**
  * Displays ICommands in overlayed application pane that opens and closes at the top or bottom of the main view.
  **/
@JSImport("winjs", "UI.AppBar")
@js.native
//#region Constructors
/**
  * Creates a new AppBar object.
  * @constructor
  * @param element The DOM element that will host the control.
  * @param options The set of properties and values to apply to the new AppBar.
  **/
class AppBar ()
  extends typingsSlinky.winjs.WinJS.UI.AppBar {
  def this(element: HTMLElement) = this()
  def this(element: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
/* static members */
@JSImport("winjs", "UI.AppBar")
@js.native
object AppBar extends js.Object {
  
  /**
    * Display options for the AppBar when closed.
    **/
  var ClosedDisplayMode: Compact = js.native
  
  /**
    * Display options for AppBar placement in relation to the main view.
    */
  var Placement: Bottom = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

package typingsSlinky.winjs.global.WinJS.UI

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a group of NavBarCommand objects in a NavBar.
  **/
@JSGlobal("WinJS.UI.NavBarContainer")
@js.native
//#region Constructors
/**
  * Creates a new NavBarContainer.
  * @constructor
  * @param element The DOM element hosts the new NavBarContainer.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class NavBarContainer ()
  extends typingsSlinky.winjs.WinJS.UI.NavBarContainer {
  def this(element: HTMLElement) = this()
  def this(element: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
object NavBarContainer {
  
  @JSGlobal("WinJS.UI.NavBarContainer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSGlobal("WinJS.UI.NavBarContainer.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  @scala.inline
  def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}

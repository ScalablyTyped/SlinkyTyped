package typingsSlinky.winjs.mod.UI

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Scales a single child element to fill the available space without resizing it. This control reacts to changes in the size of the container as well as changes in size of the child element. For example, a media query may result in a change in aspect ratio.
  **/
@JSImport("winjs", "UI.ViewBox")
@js.native
//#region Constructors
/**
  * Initializes a new instance of the ViewBox control.
  * @constructor
  * @param element The DOM element that functions as the scaling box. This element fills 100% of the width and height allotted to it.
  * @param options The set of options to be applied initially to the ViewBox control. There are currently no options on this control, and any options included in this parameter are ignored.
  **/
class ViewBox ()
  extends typingsSlinky.winjs.WinJS.UI.ViewBox {
  def this(element: HTMLElement) = this()
  def this(element: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
object ViewBox {
  
  @JSImport("winjs", "UI.ViewBox")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSImport("winjs", "UI.ViewBox.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  @scala.inline
  def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}

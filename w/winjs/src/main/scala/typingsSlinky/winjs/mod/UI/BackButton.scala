package typingsSlinky.winjs.mod.UI

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides backwards navigation in the form of a button.
  **/
@JSImport("winjs", "UI.BackButton")
@js.native
//#region Constructors
/**
  * Creates a new BackButton.
  * @constructor
  * @param element The DOM element hosts the new BackButton.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class BackButton ()
  extends typingsSlinky.winjs.WinJS.UI.BackButton {
  def this(element: HTMLElement) = this()
  def this(element: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
/* static members */
@JSImport("winjs", "UI.BackButton")
@js.native
object BackButton extends js.Object {
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

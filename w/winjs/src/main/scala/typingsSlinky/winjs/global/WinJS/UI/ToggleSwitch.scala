package typingsSlinky.winjs.global.WinJS.UI

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A control that lets the user switch an option between two states: on (checked is set to true) and off (checked is set to false).
  **/
@JSGlobal("WinJS.UI.ToggleSwitch")
@js.native
//#region Constructors
/**
  * Creates a new ToggleSwitch.
  * @constructor
  * @param element The DOM that hosts the control.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the change event, add a property named "onchange" to the options object and set its value to the event handler.
  **/
class ToggleSwitch ()
  extends typingsSlinky.winjs.WinJS.UI.ToggleSwitch {
  def this(element: HTMLElement) = this()
  def this(element: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
object ToggleSwitch {
  
  @JSGlobal("WinJS.UI.ToggleSwitch")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSGlobal("WinJS.UI.ToggleSwitch.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  @scala.inline
  def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}

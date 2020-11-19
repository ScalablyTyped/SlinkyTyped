package typingsSlinky.winjs.global.WinJS.UI

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generates HTML from a set of data. Use this control to generate lists of items.
  **/
@JSGlobal("WinJS.UI.Repeater")
@js.native
//#region Constructors
/**
  * Creates a new Repeater control.
  * @constructor
  * @param elemnt The DOM element that will host the new control. The Repeater will create an element if this value is null.
  * @param options An object that contains one or more property/value pairs to apply to the new Repeater. Each property of the options object corresponds to one of the object's properties or events. Event names must begin with "on".
  **/
class Repeater ()
  extends typingsSlinky.winjs.WinJS.UI.Repeater {
  def this(element: HTMLElement) = this()
  def this(element: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
/* static members */
@JSGlobal("WinJS.UI.Repeater")
@js.native
object Repeater extends js.Object {
  
  /**
    * This object supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  var isDeclarativeControlContainer: js.Any = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

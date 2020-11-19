package typingsSlinky.winjs.global.WinJS.UI

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rich input box that provides suggestions as the user types.
  **/
@JSGlobal("WinJS.UI.AutoSuggestBox")
@js.native
//#region Constructors
/**
  * Creates a new AutoSuggestBox.
  * @constructor
  * @param element The DOM element hosts the new AutoSuggestBox.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class AutoSuggestBox ()
  extends typingsSlinky.winjs.WinJS.UI.AutoSuggestBox {
  def this(element: HTMLElement) = this()
  def this(element: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
/* static members */
@JSGlobal("WinJS.UI.AutoSuggestBox")
@js.native
object AutoSuggestBox extends js.Object {
  
  //#endregion Properties
  /**
    * Creates the image argument for SearchSuggestionCollection.appendResultSuggestion.
    * @param url The url of the image.
    **/
  def createResultSuggestionImage(url: String): js.Any = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

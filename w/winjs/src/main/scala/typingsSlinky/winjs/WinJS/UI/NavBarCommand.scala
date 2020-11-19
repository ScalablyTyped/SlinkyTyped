package typingsSlinky.winjs.WinJS.UI

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a navigation command in a NavBarContainer.
  **/
@js.native
trait NavBarCommand extends js.Object {
  
  //#endregion Events
  //#region Methods
  /**
    * Registers an event handler for the specified event.
    * @param eventName The name of the event to handle. Note that you drop the "on" when specifying the event name. For example, instead of specifying "onclick", you specify "click".
    * @param eventHandler The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(eventName: String, eventHandler: js.Function): Unit = js.native
  def addEventListener(eventName: String, eventHandler: js.Function, useCapture: Boolean): Unit = js.native
  
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(`type`: String, eventProperties: js.Any): Boolean = js.native
  
  /**
    * Releases resources held by this NavBarCommand. Call this method when the NavBarCommand is no longer needed. After calling this method, the NavBarCommand becomes unusable.
    **/
  def dispose(): Unit = js.native
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets the HTML element that hosts this NavBarCommand.
    **/
  var element: HTMLElement = js.native
  
  /**
    * Gets or sets the command's icon.
    **/
  var icon: String = js.native
  
  /**
    * Gets or sets the label of the command.
    **/
  var label: String = js.native
  
  /**
    * Get or sets the location to navigate to when this command is invoked.
    **/
  var location: js.Any = js.native
  
  //#endregion Constructors
  //#region Events
  /**
    * This API supports the Windows Library for JavaScript infrastructure and is not intended to be used directly from your code.
    * Use NavBarContainer.oninvoked instead.
    **/
  var oninvoked: js.Any = js.native
  
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param eventName The name of the event that the event handler is registered for.
    * @param eventCallback The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(eventName: String, eventCallback: js.Function): Unit = js.native
  def removeEventListener(eventName: String, eventCallback: js.Function, useCapture: Boolean): Unit = js.native
  
  /**
    * Gets or sets a value that specifies whether to show the split tab stop.
    **/
  var splitButton: Boolean = js.native
  
  /**
    * Gets a value that indicates whether the splitButton is open.
    **/
  var splitOpened: Boolean = js.native
  
  /**
    * Gets or sets a user-defined object that represents the state associated with the command's location.
    **/
  var state: js.Any = js.native
  
  /**
    * Gets or sets the tooltip of the command.
    **/
  var tooltip: String = js.native
}

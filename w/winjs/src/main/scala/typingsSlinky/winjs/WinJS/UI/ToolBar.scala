package typingsSlinky.winjs.WinJS.UI

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.winjs.WinJS.Binding.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Displays ICommands within the flow of the app. Use the ToolBar around other statically positioned app content.
  **/
@js.native
trait ToolBar extends js.Object {
  
  /**
    * Registers an event handler for the specified event.
    * @param type The event type to register. It must be beforeopen, beforeclose, afteropen, or afterclose.
    * @param listener The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(eventName: String, eventHandler: js.Function): Unit = js.native
  def addEventListener(eventName: String, eventHandler: js.Function, useCapture: Boolean): Unit = js.native
  
  /**
    * Closes the ToolBar
    **/
  def close(): Unit = js.native
  
  /**
    * Gets or sets the closedDisplayMode for the ToolBar. Values are "compact" and "full".
    **/
  var closedDisplayMode: String = js.native
  
  /**
    * Gets or sets the Binding List of ICommand for the ToolBar.
    **/
  var data: List[ICommand] = js.native
  
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(eventName: String, eventProperties: js.Any): Boolean = js.native
  
  /**
    * Disposes the ToolBar
    **/
  def dispose(): Unit = js.native
  
  /**
    * Gets the DOM element that hosts the ToolBar.
    **/
  var element: HTMLElement = js.native
  
  /**
    * Forces the ToolBar to update its layout.
    * Use this function when the window did not change size, but the ToolBar itself did.
    **/
  def forceLayout(): Unit = js.native
  
  /**
    * Returns the Command object identified by id.
    * @param id The element idenitifier (ID) of the command to be returned.
    * @returns The command identified by id. If multiple commands have the same ID, returns the first command found.
    **/
  def getCommandById(id: String): ICommand = js.native
  
  /**
    * Occurs immediately after the control is closed.
    * @param eventInfo An object that contains information about the event.
    **/
  def onafterclose(eventInfo: CustomEvent): Unit = js.native
  
  /**
    * Occurs immediately after the control is opened.
    * @param eventInfo An object that contains information about the event.
    **/
  def onafteropen(eventInfo: CustomEvent): Unit = js.native
  
  /**
    * Occurs immediately before the control is closed. Is cancelable.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforeclose(eventInfo: CustomEvent): Unit = js.native
  
  /**
    * Occurs immediately before the control is opened. Is cancelable.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforeopen(eventInfo: CustomEvent): Unit = js.native
  
  /**
    * Opens the ToolBar
    **/
  def open(): Unit = js.native
  
  /**
    * Gets or sets whether the ToolBar is currently opened.
    **/
  var opened: Boolean = js.native
  
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param type The event type to unregister. It must be beforeopen, beforeclose, afteropen, or afterclose.
    * @param listener The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(eventName: String, eventHandler: js.Function): Unit = js.native
  def removeEventListener(eventName: String, eventHandler: js.Function, useCapture: Boolean): Unit = js.native
  
  /**
    * Shows the specified commands of the ToolBar while hiding all other commands.
    * @param commands The commands to show. The array elements may be ICommand objects, or the string identifiers (IDs) of commands.
    **/
  def showOnlyCommands(commands: js.Array[String | ICommand]): Unit = js.native
}

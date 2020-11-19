package typingsSlinky.winjs.WinJS.UI

import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A type of IListDataSource that provides read-access to an object that implements the IStorageQueryResultBase interface. A StorageDataSource enables you to query and bind to items in the data source.
  **/
@js.native
trait StorageDataSource[T] extends js.Object {
  
  /**
    * Registers an event handler for the specified event.
    * @param type The name of the event for which to add a listener.
    * @param eventHandler The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(`type`: String, eventHandler: js.Function): Unit = js.native
  def addEventListener(`type`: String, eventHandler: js.Function, useCapture: Boolean): Unit = js.native
  
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param details The set of additional properties to be attached to the event object.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(`type`: String, details: js.Any): Boolean = js.native
  
  //#endregion Constructors
  //#region Methods
  /**
    * Draws the thumbnail for the specified item to the specified img element.
    * @param item The item to retrieve the thumbnail for.
    * @param image The img element that will display the thumbnail.
    * @returns A Promise that completes when the full-quality thumbnail is visible.
    **/
  def loadThumbnail(item: IItem[T], image: HTMLImageElement): Promise[Unit] = js.native
  
  /**
    * Removes a listener for the specified event.
    * @param type The name of the event for which to remove a listener.
    * @param eventHandler The event handler function to associate with the event.
    * @param useCapture Optional. The same value that was passed to addEventListener for this listener. It may be omitted if it was omitted when calling addEventListener.
    **/
  def removeEventListener(`type`: String, eventHandler: js.Function): Unit = js.native
  def removeEventListener(`type`: String, eventHandler: js.Function, useCapture: js.Any): Unit = js.native
}

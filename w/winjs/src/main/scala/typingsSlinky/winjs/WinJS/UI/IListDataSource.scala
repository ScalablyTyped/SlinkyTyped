package typingsSlinky.winjs.WinJS.UI

import org.scalajs.dom.raw.CustomEvent
import typingsSlinky.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to a data source and enables you to bind, change, add, remove, and move items in that data source.
  **/
@js.native
trait IListDataSource[T] extends js.Object {
  
  //#endregion Events
  //#region Methods
  /**
    * Notifies the IListDataSource that a sequence of edits is about to begin. The IListDataSource will defer notifications until endEdits is called.
    **/
  def beginEdits(): Unit = js.native
  
  /**
    * Overwrites the data of the specified item.
    * @param key The key for the item to replace.
    * @param newData The new data for the item.
    * @returns A Promise that contains the IItem that was updated or an EditError if an error was encountered.
    **/
  def change(key: String, newData: T): Promise[IItem[T]] = js.native
  
  /**
    * Creates an IListBinding that can retrieve items from the IListDataSource, enumerate the contents of the IListDataSource object's data, and optionally register for change notifications.
    * @param notificationHandler Enables the IListBinding to register for change notifications for individual items obtained from the IListDataSource. If you omit this parameter, change notifications won't be available.
    * @returns The new IListBinding.
    **/
  def createListBinding(): IListBinding[T] = js.native
  def createListBinding(notificationHandler: IListNotificationHandler[T]): IListBinding[T] = js.native
  
  /**
    * Notifies the IListDataSource that the batch of edits that began with the last beginEdits call has completed. The IListDataSource will submit notifications for any changes that occurred between the beginEdits and endEdits calls as a batch and resume normal change notifications.
    **/
  def endEdits(): Unit = js.native
  
  /**
    * Retrieves the number of items in the data source.
    * @returns A Promise that provides a Number that is the number of items in the data source.
    **/
  def getCount(): Promise[Double] = js.native
  
  /**
    * Inserts a new item after another item.
    * @param key The key that can be used to retrieve the new item, if known.
    * @param data The data for the item to add.
    * @param previousKey The key for an item in the data source. The new item will be added after this item.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def insertAfter(key: String, data: T, previousKey: String): Promise[IItem[T]] = js.native
  
  /**
    * Adds an item to the end of the data source.
    * @param key The key that can be used to retrieve the new item, if known.
    * @param data The data for the item to add.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def insertAtEnd(key: String, data: T): Promise[IItem[T]] = js.native
  
  /**
    * Adds an item to the beginning of the data source.
    * @param key The key that can be used to retrieve the new item, if known.
    * @param data The data for the item to add.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def insertAtStart(key: String, data: T): Promise[IItem[T]] = js.native
  
  /**
    * Inserts an item before another item.
    * @param key The key that can be used to retrieve the new item, if known.
    * @param data The data for the item to add.
    * @param nextKey The key of an item in the data source. The new item will be inserted before this item.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def insertBefore(key: String, data: T, nextKey: String): Promise[IItem[T]] = js.native
  
  /**
    * Indicates that all previous data obtained from the IListDataAdapter is invalid and should be refreshed.
    * @returns A Promise that completes when the data has been completely refreshed and all notifications have been sent.
    **/
  def invalidateAll(): Promise[_] = js.native
  
  /**
    * Retrieves the item that has the specified description.
    * @param description Domain-specific information, to be interpreted by the IListDataAdapter, that describes the item to retrieve.
    * @returns A Promise that provides an IItem that contains the requested item or a FetchError if an error was encountered. If the item wasn't found, the promise completes with a value of null.
    **/
  def itemFromDescription(description: js.Any): Promise[IItem[T]] = js.native
  
  /**
    * Retrieves the item at the specified index.
    * @param index A value that is greater than or equal to zero that is the index of the item to retrieve.
    * @returns A Promise that provides an IItem that contains the requested item or a FetchError if an error was encountered. If the item wasn't found, the promise completes with a value of null.
    **/
  def itemFromIndex(index: Double): Promise[IItem[T]] = js.native
  
  /**
    * Retrieves the item with the specified key.
    * @param key The key of the item to retrieve. It must be a non-empty string.
    * @param description Domain-specific information that IListDataAdapter can use to improve the retrieval time.
    * @returns A Promise that provides an IItem that contains the requested item or a FetchError if an error was encountered. If the item was not found, the promise completes with a null value.
    **/
  def itemFromKey(key: String): Promise[IItem[T]] = js.native
  def itemFromKey(key: String, description: js.Any): Promise[IItem[T]] = js.native
  
  /**
    * Moves an item to just after another item.
    * @param key The key that identifies the item to move.
    * @param previousKey The key of another item in the data source. The item specified by the key parameter will be moved after this item.
    * @returns A Promise that contains the IItem that was moved or an EditError if an error was encountered.
    **/
  def moveAfter(key: String, previousKey: String): Promise[IItem[T]] = js.native
  
  /**
    * Moves an item before another item.
    * @param key The key that identifies the item to move.
    * @param nextKey The key of another item in the data source. The item specified by the key parameter will be moved before this item.
    * @returns A Promise that contains the IItem that was moved or an EditError if an error was encountered.
    **/
  def moveBefore(key: String, nextKey: String): Promise[IItem[T]] = js.native
  
  /**
    * Moves an item to the end of the data source.
    * @param key The key that identifies the item to move.
    * @returns A Promise that contains the IItem that was moved or an EditError if an error was encountered.
    **/
  def moveToEnd(key: String): Promise[IItem[T]] = js.native
  
  /**
    * Moves the specified item to the beginning of the data source.
    * @param key The key that identifies the item to move.
    * @returns A Promise that contains the IItem that was moved or an EditError if an error was encountered.
    **/
  def moveToStart(key: String): Promise[IItem[T]] = js.native
  
  /**
    * Removes the specified item from the data source.
    * @param key The key that identifies the item to remove.
    * @returns A Promise that contains nothing if the operation was successful or an EditError if an error was encountered.
    **/
  def remove(key: String): Promise[IItem[T]] = js.native
  
  //#region Events
  /**
    * Occurs when the status of the IListDataSource changes.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: status.
    **/
  def statuschanged(eventInfo: CustomEvent): Unit = js.native
}

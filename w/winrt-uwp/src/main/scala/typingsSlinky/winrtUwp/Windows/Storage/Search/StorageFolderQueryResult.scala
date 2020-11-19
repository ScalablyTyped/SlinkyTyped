package typingsSlinky.winrtUwp.Windows.Storage.Search

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.Storage.StorageFolder
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.contentschanged
import typingsSlinky.winrtUwp.winrtUwpStrings.optionschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the results of a query that lists the folder (or file groups) in the folder being queried (which is represented by a storageFolder ). You can use a storageFolderQueryResult to enumerate folders or file groups in that folder. */
@js.native
trait StorageFolderQueryResult extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contentschanged(`type`: contentschanged, listener: TypedEventHandler[IStorageQueryResultBase, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionschanged(`type`: optionschanged, listener: TypedEventHandler[IStorageQueryResultBase, _]): Unit = js.native
  
  /**
    * Modifies query results based on new QueryOptions .
    * @param newQueryOptions The new query options.
    */
  def applyNewQueryOptions(newQueryOptions: QueryOptions): Unit = js.native
  
  /**
    * Retrieves the index of the folder from the query results that most closely matches the specified property value. The property that is matched is determined by the first SortEntry of the QueryOptions.SortOrder list.
    * @param value The property value to match when searching the query results. The property to that is used to match this value is the property in the first SortEntry of the QueryOptions.SortOrder list.
    * @return When this method completes successfully it returns the index of the matched folder in the query results.
    */
  def findStartIndexAsync(value: js.Any): IPromiseWithIAsyncOperation[Double] = js.native
  
  /** Gets the folder originally used to create the StorageFolderQueryResult object. This folder represents the scope of the query. */
  var folder: StorageFolder = js.native
  
  /**
    * Retrieves the query options used to determine query results.
    * @return The query options.
    */
  def getCurrentQueryOptions(): QueryOptions = js.native
  
  /**
    * Retrieves a list of all the folders (or file groups) in the result set.
    * @return When this method completes successfully, it returns a list (type IVectorView ) of folders or file groups that are represented by storageFolder objects. Each of these folder or file group can also be enumerated to retrieve its contents.
    */
  def getFoldersAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Retrieves folders (or file groups) in a specified range.
    * @param startIndex The zero-based index of the first folder to retrieve. This parameter defaults to 0.
    * @param maxNumberOfItems The maximum number of folders or file groups to retrieve. Use -1 to retrieve all folders. If the range contains fewer folders than the max number, all folders in the range are returned.
    * @return When this method completes successfully, it returns a list (type IVectorView ) of folders or file groups that are represented by storageFolder objects.
    */
  def getFoldersAsync(startIndex: Double, maxNumberOfItems: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /**
    * Retrieves the number of folders (or file groups) in the set of query results.
    * @return When this method completes successfully, it returns the number of folders or file groups in the location that match the query.
    */
  def getItemCountAsync(): IPromiseWithIAsyncOperation[Double] = js.native
  
  /** Fires when a file is added to, deleted from, or modified in the folder being queried. This event only fires after GetFilesAsync has been called at least once. */
  def oncontentschanged(ev: js.Any with WinRTEvent[IStorageQueryResultBase]): Unit = js.native
  /** Fires when a file is added to, deleted from, or modified in the folder being queried. This event only fires after GetFilesAsync has been called at least once. */
  @JSName("oncontentschanged")
  var oncontentschanged_Original: TypedEventHandler[IStorageQueryResultBase, _] = js.native
  
  /** Fires when the query options change. */
  def onoptionschanged(ev: js.Any with WinRTEvent[IStorageQueryResultBase]): Unit = js.native
  /** Fires when the query options change. */
  @JSName("onoptionschanged")
  var onoptionschanged_Original: TypedEventHandler[IStorageQueryResultBase, _] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contentschanged(`type`: contentschanged, listener: TypedEventHandler[IStorageQueryResultBase, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_optionschanged(`type`: optionschanged, listener: TypedEventHandler[IStorageQueryResultBase, _]): Unit = js.native
}

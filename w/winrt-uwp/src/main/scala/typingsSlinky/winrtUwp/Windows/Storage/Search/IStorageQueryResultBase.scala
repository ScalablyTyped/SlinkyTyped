package typingsSlinky.winrtUwp.Windows.Storage.Search

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods to access to and manage query results. */
@js.native
trait IStorageQueryResultBase extends StObject {
  
  /**
    * Applies new query options to the results retrieved by the StorageFileQueryResult , StorageFolderQueryResult , or StorageItemQueryResult object.
    * @param newQueryOptions The new query options.
    */
  def applyNewQueryOptions(newQueryOptions: QueryOptions): Unit = js.native
  
  /**
    * Retrieves the index of the file from the query results that most closely matches the specified property value. The property that is matched is determined by the first SortEntry of the QueryOptions.SortOrder list.
    * @param value The property value to match when searching the query results.
    * @return When this method completes successfully it returns the index of the matched item in the query results.
    */
  def findStartIndexAsync(value: js.Any): IPromiseWithIAsyncOperation[Double] = js.native
  
  /** Gets the folder originally used to create a StorageFileQueryResult , StorageFolderQueryResult , or StorageItemQueryResult object. This folder represents the scope of the query. */
  var folder: StorageFolder = js.native
  
  /**
    * Retrieves the query options used to create a StorageFileQueryResult , StorageFolderQueryResult , or StorageItemQueryResult object.
    * @return The query options.
    */
  def getCurrentQueryOptions(): QueryOptions = js.native
  
  /**
    * Retrieves the number of items that match the query that created a StorageFileQueryResult , StorageFolderQueryResult , or StorageItemQueryResult object.
    * @return When this method completes successfully, it returns the number of items that match the query.
    */
  def getItemCountAsync(): IPromiseWithIAsyncOperation[Double] = js.native
}
object IStorageQueryResultBase {
  
  @scala.inline
  def apply(
    applyNewQueryOptions: QueryOptions => Unit,
    findStartIndexAsync: js.Any => IPromiseWithIAsyncOperation[Double],
    folder: StorageFolder,
    getCurrentQueryOptions: () => QueryOptions,
    getItemCountAsync: () => IPromiseWithIAsyncOperation[Double]
  ): IStorageQueryResultBase = {
    val __obj = js.Dynamic.literal(applyNewQueryOptions = js.Any.fromFunction1(applyNewQueryOptions), findStartIndexAsync = js.Any.fromFunction1(findStartIndexAsync), folder = folder.asInstanceOf[js.Any], getCurrentQueryOptions = js.Any.fromFunction0(getCurrentQueryOptions), getItemCountAsync = js.Any.fromFunction0(getItemCountAsync))
    __obj.asInstanceOf[IStorageQueryResultBase]
  }
  
  @scala.inline
  implicit class IStorageQueryResultBaseMutableBuilder[Self <: IStorageQueryResultBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyNewQueryOptions(value: QueryOptions => Unit): Self = StObject.set(x, "applyNewQueryOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindStartIndexAsync(value: js.Any => IPromiseWithIAsyncOperation[Double]): Self = StObject.set(x, "findStartIndexAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFolder(value: StorageFolder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCurrentQueryOptions(value: () => QueryOptions): Self = StObject.set(x, "getCurrentQueryOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItemCountAsync(value: () => IPromiseWithIAsyncOperation[Double]): Self = StObject.set(x, "getItemCountAsync", js.Any.fromFunction0(value))
  }
}

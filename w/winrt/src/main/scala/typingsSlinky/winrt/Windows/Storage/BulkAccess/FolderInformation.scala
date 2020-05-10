package typingsSlinky.winrt.Windows.Storage.BulkAccess

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.IStorageFolder
import typingsSlinky.winrt.Windows.Storage.IStorageItem
import typingsSlinky.winrt.Windows.Storage.IStorageItemProperties
import typingsSlinky.winrt.Windows.Storage.Search.IStorageFolderQueryOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.BulkAccess.FolderInformation")
@js.native
class FolderInformation ()
  extends IStorageFolder
     with IStorageItemInformation
     with IStorageItemProperties
     with IStorageFolderQueryOperations {
  /* InferMemberOverrides */
  override def getItemsAsync(startIndex: Double, maxItemsToRetrieve: Double): IAsyncOperation[IVectorView[IStorageItem]] = js.native
}


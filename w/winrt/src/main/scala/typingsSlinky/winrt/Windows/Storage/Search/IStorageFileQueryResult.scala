package typingsSlinky.winrt.Windows.Storage.Search

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStorageFileQueryResult extends IStorageQueryResultBase {
  
  def getFilesAsync(): IAsyncOperation[IVectorView[StorageFile]] = js.native
  def getFilesAsync(startIndex: Double, maxNumberOfItems: Double): IAsyncOperation[IVectorView[StorageFile]] = js.native
}

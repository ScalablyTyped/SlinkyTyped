package typingsSlinky.winrt.Windows.Storage.Search

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.IStorageItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStorageItemQueryResult extends IStorageQueryResultBase {
  
  def getItemsAsync(): IAsyncOperation[IVectorView[IStorageItem]] = js.native
  def getItemsAsync(startIndex: Double, maxNumberOfItems: Double): IAsyncOperation[IVectorView[IStorageItem]] = js.native
}

package typingsSlinky.winrt.Windows.Storage.AccessCache

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.IStorageItem
import typingsSlinky.winrt.Windows.Storage.StorageFile
import typingsSlinky.winrt.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStorageItemAccessList extends js.Object {
  
  def add(file: IStorageItem): String = js.native
  def add(file: IStorageItem, metadata: String): String = js.native
  
  def addOrReplace(token: String, file: IStorageItem): Unit = js.native
  def addOrReplace(token: String, file: IStorageItem, metadata: String): Unit = js.native
  
  def checkAccess(file: IStorageItem): Boolean = js.native
  
  def clear(): Unit = js.native
  
  def containsItem(token: String): Boolean = js.native
  
  var entries: AccessListEntryView = js.native
  
  def getFileAsync(token: String): IAsyncOperation[StorageFile] = js.native
  def getFileAsync(token: String, options: AccessCacheOptions): IAsyncOperation[StorageFile] = js.native
  
  def getFolderAsync(token: String): IAsyncOperation[StorageFolder] = js.native
  def getFolderAsync(token: String, options: AccessCacheOptions): IAsyncOperation[StorageFolder] = js.native
  
  def getItemAsync(token: String): IAsyncOperation[IStorageItem] = js.native
  def getItemAsync(token: String, options: AccessCacheOptions): IAsyncOperation[IStorageItem] = js.native
  
  var maximumItemsAllowed: Double = js.native
  
  def remove(token: String): Unit = js.native
}

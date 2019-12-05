package typingsSlinky.winrt.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.FileProperties.StorageItemContentProperties
import typingsSlinky.winrt.Windows.Storage.FileProperties.StorageItemThumbnail
import typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailMode
import typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageItemProperties extends js.Object {
  var displayName: String = js.native
  var displayType: String = js.native
  var folderRelativeId: String = js.native
  var properties: StorageItemContentProperties = js.native
  def getThumbnailAsync(mode: ThumbnailMode): IAsyncOperation[StorageItemThumbnail] = js.native
  def getThumbnailAsync(mode: ThumbnailMode, requestedSize: Double): IAsyncOperation[StorageItemThumbnail] = js.native
  def getThumbnailAsync(mode: ThumbnailMode, requestedSize: Double, options: ThumbnailOptions): IAsyncOperation[StorageItemThumbnail] = js.native
}


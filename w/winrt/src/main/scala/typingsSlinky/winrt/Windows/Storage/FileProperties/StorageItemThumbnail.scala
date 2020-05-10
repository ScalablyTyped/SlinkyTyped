package typingsSlinky.winrt.Windows.Storage.FileProperties

import typingsSlinky.winrt.Windows.Storage.Streams.IContentTypeProvider
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.FileProperties.StorageItemThumbnail")
@js.native
class StorageItemThumbnail ()
  extends IRandomAccessStream
     with IContentTypeProvider
     with IThumbnailProperties {
  def dispose(): Unit = js.native
}


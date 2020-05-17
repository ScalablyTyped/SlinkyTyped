package typingsSlinky.winrt.global.Windows.Storage

import typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailMode
import typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailOptions
import typingsSlinky.winrt.Windows.Storage.Search.IStorageQueryResultBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.BulkAccess")
@js.native
object BulkAccess extends js.Object {
  @js.native
  class FileInformation ()
    extends typingsSlinky.winrt.Windows.Storage.BulkAccess.FileInformation
  
  @js.native
  class FileInformationFactory protected ()
    extends typingsSlinky.winrt.Windows.Storage.BulkAccess.FileInformationFactory {
    def this(queryResult: IStorageQueryResultBase, mode: ThumbnailMode) = this()
    def this(queryResult: IStorageQueryResultBase, mode: ThumbnailMode, requestedThumbnailSize: Double) = this()
    def this(
      queryResult: IStorageQueryResultBase,
      mode: ThumbnailMode,
      requestedThumbnailSize: Double,
      thumbnailOptions: ThumbnailOptions
    ) = this()
    def this(
      queryResult: IStorageQueryResultBase,
      mode: ThumbnailMode,
      requestedThumbnailSize: Double,
      thumbnailOptions: ThumbnailOptions,
      delayLoad: Boolean
    ) = this()
  }
  
  @js.native
  class FolderInformation ()
    extends typingsSlinky.winrt.Windows.Storage.BulkAccess.FolderInformation
  
}


package typingsSlinky.winrt.global.Windows.Storage

import typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailMode
import typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailOptions
import typingsSlinky.winrt.Windows.Storage.Search.IStorageQueryResultBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BulkAccess {
  
  @JSGlobal("Windows.Storage.BulkAccess.FileInformation")
  @js.native
  class FileInformation ()
    extends typingsSlinky.winrt.Windows.Storage.BulkAccess.FileInformation
  
  @JSGlobal("Windows.Storage.BulkAccess.FileInformationFactory")
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
  
  @JSGlobal("Windows.Storage.BulkAccess.FolderInformation")
  @js.native
  class FolderInformation ()
    extends typingsSlinky.winrt.Windows.Storage.BulkAccess.FolderInformation
}

package typingsSlinky.winrtUwp.global.Windows.Storage

import typingsSlinky.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode
import typingsSlinky.winrtUwp.Windows.Storage.FileProperties.ThumbnailOptions
import typingsSlinky.winrtUwp.Windows.Storage.Search.IStorageQueryResultBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes for searching, accessing, managing, and retrieving information about files and folders in the storage system. */
@JSGlobal("Windows.Storage.BulkAccess")
@js.native
object BulkAccess extends js.Object {
  
  /** Provides synchronous access to the properties exposed off StorageFile and lets an app perform asynchronous file operations such as copy, delete, move, and rename. */
  @js.native
  abstract class FileInformation ()
    extends typingsSlinky.winrtUwp.Windows.Storage.BulkAccess.FileInformation
  
  /** Used to load information about files and folders from the results of a query and to bind these file system items to JavaScript ListView or XAML ListView and GridView controls. After information is loaded, an app can then access that information quickly using synchronous operations. */
  @js.native
  class FileInformationFactory protected ()
    extends typingsSlinky.winrtUwp.Windows.Storage.BulkAccess.FileInformationFactory {
    /**
      * Creates a new FileInformationFactory object that retrieves information about the StorageFile and StorageFolder objects in the specified query result.
      * @param queryResult The result of a query of files and folders on the system.
      * @param mode A value that indicates the type of thumbnail view to retrieve for the StorageFile and StorageFolder .
      */
    def this(queryResult: IStorageQueryResultBase, mode: ThumbnailMode) = this()
    /**
      * Creates a new FileInformationFactory object that retrieves information about the StorageFile and StorageFolder objects in the specified query result and that specifies the requested size for thumbnails that are retrieved for the objects.
      * @param queryResult The result of a query of files and folders on the system.
      * @param mode A value that indicates the type of thumbnail view to retrieve for the StorageFile and StorageFolder .
      * @param requestedThumbnailSize The requested minimum size, in pixels, of the StorageFile and StorageFolder thumbnails.
      */
    def this(queryResult: IStorageQueryResultBase, mode: ThumbnailMode, requestedThumbnailSize: Double) = this()
    /**
      * Creates a new FileInformationFactory object that retrieves information about the StorageFile and StorageFolder objects in the specified query result, and that specifies the requested size and options for thumbnails that are retrieved for the objects.
      * @param queryResult The result of a query of files and folders on the system.
      * @param mode A value that indicates the type of thumbnail view to retrieve for the StorageFile and StorageFolder .
      * @param requestedThumbnailSize The requested minimum size, in pixels, of the StorageFile and StorageFolder thumbnails.
      * @param thumbnailOptions The thumbnail retrieval options.
      */
    def this(
      queryResult: IStorageQueryResultBase,
      mode: ThumbnailMode,
      requestedThumbnailSize: Double,
      thumbnailOptions: ThumbnailOptions
    ) = this()
    /**
      * Creates a new FileInformationFactory object that retrieves information about the StorageFile and StorageFolder objects in the specified query result, specifies the requested size and options for thumbnails that are retrieved for the objects, and indicates whether to delay loading information.
      * @param queryResult The result of a query of files and folders on the system.
      * @param mode A value that indicates the type of thumbnail view to retrieve for the StorageFile and StorageFolder .
      * @param requestedThumbnailSize The requested minimum size, in pixels, of the StorageFile and StorageFolder thumbnails.
      * @param thumbnailOptions The thumbnail retrieval options.
      * @param delayLoad True to delay loading information; otherwise false. By default, this option is false and delay loading is not used.
      */
    def this(
      queryResult: IStorageQueryResultBase,
      mode: ThumbnailMode,
      requestedThumbnailSize: Double,
      thumbnailOptions: ThumbnailOptions,
      delayLoad: Boolean
    ) = this()
  }
  
  /** Provides synchronous access to the properties exposed off StorageFolder and lets an app perform asynchronous management operations such as copy, delete, move, and rename. */
  @js.native
  abstract class FolderInformation ()
    extends typingsSlinky.winrtUwp.Windows.Storage.BulkAccess.FolderInformation
}

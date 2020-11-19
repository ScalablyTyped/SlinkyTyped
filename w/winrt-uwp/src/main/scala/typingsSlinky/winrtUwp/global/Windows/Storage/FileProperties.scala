package typingsSlinky.winrtUwp.global.Windows.Storage

import typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geolocator
import typingsSlinky.winrtUwp.Windows.Devices.Geolocation.Geopoint
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the properties of a file. */
@JSGlobal("Windows.Storage.FileProperties")
@js.native
object FileProperties extends js.Object {
  
  /** Provides access to the basic properties, like the size of the item or the date the item was last modified, of the item (like a file or folder). */
  @js.native
  abstract class BasicProperties ()
    extends typingsSlinky.winrtUwp.Windows.Storage.FileProperties.BasicProperties
  
  /** Provides access to the document-related properties of an item (like a file or folder). */
  @js.native
  abstract class DocumentProperties ()
    extends typingsSlinky.winrtUwp.Windows.Storage.FileProperties.DocumentProperties
  
  /** Provides methods for setting and retrieving geographic metadata for a file. */
  @js.native
  abstract class GeotagHelper ()
    extends typingsSlinky.winrtUwp.Windows.Storage.FileProperties.GeotagHelper
  /* static members */
  @js.native
  object GeotagHelper extends js.Object {
    
    /**
      * Asynchronously retrieves a Geopoint representing the geographic metadata of a file, if present.
      * @param file The file from which the geographic metadata is retrieved.
      * @return An asynchronous operation that returns a Geopoint on successful completion.
      */
    def getGeotagAsync(file: IStorageFile): IPromiseWithIAsyncOperation[Geopoint] = js.native
    
    /**
      * Asynchronously sets the geographic metadata of a file from the provided Geopoint .
      * @param file The file into which the geographic metadata is set.
      * @param geopoint The Geopoint representing the geographic metadata to be set.
      * @return An asynchronous action.
      */
    def setGeotagAsync(file: IStorageFile, geopoint: Geopoint): IPromiseWithIAsyncAction = js.native
    
    /**
      * Asynchronously sets the geographic metadata of a file to the device's current location using the provided Geolocator object.
      * @param file The file into which the geographic metadata is set.
      * @param geolocator The Geolocator object that will be used to determine the device's current location.
      * @return An asychronous action.
      */
    def setGeotagFromGeolocatorAsync(file: IStorageFile, geolocator: Geolocator): IPromiseWithIAsyncAction = js.native
  }
  
  /** Provides access to the image-related properties of an item (like a file or folder). */
  @js.native
  abstract class ImageProperties ()
    extends typingsSlinky.winrtUwp.Windows.Storage.FileProperties.ImageProperties
  
  /** Provides access to the music-related properties of an item (like a file or folder). */
  @js.native
  abstract class MusicProperties ()
    extends typingsSlinky.winrtUwp.Windows.Storage.FileProperties.MusicProperties
  
  /** Indicates the Exchangeable Image File (EXIF) orientation flag of the photo. This flag describes how to rotate the photo to display it correctly. */
  @js.native
  object PhotoOrientation extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation with Double
      ] = js.native
    
    /* 2 */ val flipHorizontal: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.flipHorizontal with Double = js.native
    
    /* 4 */ val flipVertical: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.flipVertical with Double = js.native
    
    /* 1 */ val normal: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.normal with Double = js.native
    
    /* 3 */ val rotate180: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.rotate180 with Double = js.native
    
    /* 6 */ val rotate270: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.rotate270 with Double = js.native
    
    /* 8 */ val rotate90: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.rotate90 with Double = js.native
    
    /* 5 */ val transpose: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.transpose with Double = js.native
    
    /* 7 */ val transverse: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.transverse with Double = js.native
    
    /* 0 */ val unspecified: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.PhotoOrientation.unspecified with Double = js.native
  }
  
  /** Indicates a system-defined group of file properties. */
  @js.native
  object PropertyPrefetchOptions extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions with Double
      ] = js.native
    
    /* 5 */ val basicProperties: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions.basicProperties with Double = js.native
    
    /* 4 */ val documentProperties: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions.documentProperties with Double = js.native
    
    /* 3 */ val imageProperties: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions.imageProperties with Double = js.native
    
    /* 1 */ val musicProperties: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions.musicProperties with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions.none with Double = js.native
    
    /* 2 */ val videoProperties: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions.videoProperties with Double = js.native
  }
  
  /** Provides access to the content-related properties of an item (like a file or folder). */
  @js.native
  abstract class StorageItemContentProperties ()
    extends typingsSlinky.winrtUwp.Windows.Storage.FileProperties.StorageItemContentProperties
  
  /** Represents the thumbnail image associated with a system resource (like a file or folder). */
  @js.native
  abstract class StorageItemThumbnail ()
    extends typingsSlinky.winrtUwp.Windows.Storage.FileProperties.StorageItemThumbnail
  
  /** Describes the purpose of the thumbnail to determine how to adjust the thumbnail image to retrieve. */
  @js.native
  object ThumbnailMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode with Double] = js.native
    
    /* 3 */ val documentsView: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode.documentsView with Double = js.native
    
    /* 4 */ val listView: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode.listView with Double = js.native
    
    /* 2 */ val musicView: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode.musicView with Double = js.native
    
    /* 0 */ val picturesView: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode.picturesView with Double = js.native
    
    /* 5 */ val singleItem: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode.singleItem with Double = js.native
    
    /* 1 */ val videosView: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode.videosView with Double = js.native
  }
  
  /** Describes the behavior used to retrieve and adjust thumbnails, including the size and quality of the image and how quickly the thumbnail image is retrieved. */
  @js.native
  object ThumbnailOptions extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Storage.FileProperties.ThumbnailOptions with Double
      ] = js.native
    
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.ThumbnailOptions.none with Double = js.native
    
    /* 2 */ val resizeThumbnail: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.ThumbnailOptions.resizeThumbnail with Double = js.native
    
    /* 1 */ val returnOnlyIfCached: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.ThumbnailOptions.returnOnlyIfCached with Double = js.native
    
    /* 3 */ val useCurrentScale: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.ThumbnailOptions.useCurrentScale with Double = js.native
  }
  
  /** Indicates whether the thumbnail is an icon or an image. */
  @js.native
  object ThumbnailType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Storage.FileProperties.ThumbnailType with Double] = js.native
    
    /* 1 */ val icon: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.ThumbnailType.icon with Double = js.native
    
    /* 0 */ val image: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.ThumbnailType.image with Double = js.native
  }
  
  /** Indicates how to rotate the video to display it correctly. */
  @js.native
  object VideoOrientation extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Storage.FileProperties.VideoOrientation with Double
      ] = js.native
    
    /* 0 */ val normal: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.VideoOrientation.normal with Double = js.native
    
    /* 2 */ val rotate180: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.VideoOrientation.rotate180 with Double = js.native
    
    /* 3 */ val rotate270: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.VideoOrientation.rotate270 with Double = js.native
    
    /* 1 */ val rotate90: typingsSlinky.winrtUwp.Windows.Storage.FileProperties.VideoOrientation.rotate90 with Double = js.native
  }
  
  /** Provides access to the video-related properties of an item (like a file or folder). */
  @js.native
  abstract class VideoProperties ()
    extends typingsSlinky.winrtUwp.Windows.Storage.FileProperties.VideoProperties
}

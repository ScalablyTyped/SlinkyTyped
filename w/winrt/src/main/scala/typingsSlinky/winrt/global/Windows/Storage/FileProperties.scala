package typingsSlinky.winrt.global.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailType
import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import typingsSlinky.winrt.Windows.Storage.Streams.IInputStream
import typingsSlinky.winrt.Windows.Storage.Streams.IOutputStream
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import typingsSlinky.winrt.Windows.Storage.Streams.InputStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.FileProperties")
@js.native
object FileProperties extends js.Object {
  @js.native
  class BasicProperties ()
    extends typingsSlinky.winrt.Windows.Storage.FileProperties.BasicProperties {
    /* CompleteClass */
    override var dateModified: js.Date = js.native
    /* CompleteClass */
    override var itemDate: js.Date = js.native
    /* CompleteClass */
    override var size: Double = js.native
  }
  
  @js.native
  class DocumentProperties ()
    extends typingsSlinky.winrt.Windows.Storage.FileProperties.DocumentProperties
  
  @js.native
  class ImageProperties ()
    extends typingsSlinky.winrt.Windows.Storage.FileProperties.ImageProperties
  
  @js.native
  class MusicProperties ()
    extends typingsSlinky.winrt.Windows.Storage.FileProperties.MusicProperties
  
  @js.native
  class StorageItemContentProperties ()
    extends typingsSlinky.winrt.Windows.Storage.FileProperties.StorageItemContentProperties
  
  @js.native
  class StorageItemThumbnail ()
    extends typingsSlinky.winrt.Windows.Storage.FileProperties.StorageItemThumbnail {
    /* CompleteClass */
    override var canRead: Boolean = js.native
    /* CompleteClass */
    override var canWrite: Boolean = js.native
    /* CompleteClass */
    override var contentType: String = js.native
    /* CompleteClass */
    override var originalHeight: Double = js.native
    /* CompleteClass */
    override var originalWidth: Double = js.native
    /* CompleteClass */
    override var position: Double = js.native
    /* CompleteClass */
    override var returnedSmallerCachedSize: Boolean = js.native
    /* CompleteClass */
    override var size: Double = js.native
    /* CompleteClass */
    override var `type`: ThumbnailType = js.native
    /* CompleteClass */
    override def cloneStream(): IRandomAccessStream = js.native
    /* CompleteClass */
    override def close(): Unit = js.native
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /* CompleteClass */
    override def flushAsync(): IAsyncOperation[Boolean] = js.native
    /* CompleteClass */
    override def getInputStreamAt(position: Double): IInputStream = js.native
    /* CompleteClass */
    override def getOutputStreamAt(position: Double): IOutputStream = js.native
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double] = js.native
    /* CompleteClass */
    override def seek(position: Double): Unit = js.native
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  @js.native
  class VideoProperties ()
    extends typingsSlinky.winrt.Windows.Storage.FileProperties.VideoProperties
  
  @js.native
  object PhotoOrientation extends js.Object {
    /* 2 */ val flipHorizontal: typingsSlinky.winrt.Windows.Storage.FileProperties.PhotoOrientation.flipHorizontal with Double = js.native
    /* 4 */ val flipVertical: typingsSlinky.winrt.Windows.Storage.FileProperties.PhotoOrientation.flipVertical with Double = js.native
    /* 1 */ val normal: typingsSlinky.winrt.Windows.Storage.FileProperties.PhotoOrientation.normal with Double = js.native
    /* 3 */ val rotate180: typingsSlinky.winrt.Windows.Storage.FileProperties.PhotoOrientation.rotate180 with Double = js.native
    /* 6 */ val rotate270: typingsSlinky.winrt.Windows.Storage.FileProperties.PhotoOrientation.rotate270 with Double = js.native
    /* 8 */ val rotate90: typingsSlinky.winrt.Windows.Storage.FileProperties.PhotoOrientation.rotate90 with Double = js.native
    /* 5 */ val transpose: typingsSlinky.winrt.Windows.Storage.FileProperties.PhotoOrientation.transpose with Double = js.native
    /* 7 */ val transverse: typingsSlinky.winrt.Windows.Storage.FileProperties.PhotoOrientation.transverse with Double = js.native
    /* 0 */ val unspecified: typingsSlinky.winrt.Windows.Storage.FileProperties.PhotoOrientation.unspecified with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.FileProperties.PhotoOrientation with Double] = js.native
  }
  
  @js.native
  object PropertyPrefetchOptions extends js.Object {
    /* 5 */ val basicProperties: typingsSlinky.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.basicProperties with Double = js.native
    /* 4 */ val documentProperties: typingsSlinky.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.documentProperties with Double = js.native
    /* 3 */ val imageProperties: typingsSlinky.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.imageProperties with Double = js.native
    /* 1 */ val musicProperties: typingsSlinky.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.musicProperties with Double = js.native
    /* 0 */ val none: typingsSlinky.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.none with Double = js.native
    /* 2 */ val videoProperties: typingsSlinky.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.videoProperties with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions with Double
      ] = js.native
  }
  
  @js.native
  object ThumbnailMode extends js.Object {
    /* 3 */ val documentsView: typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailMode.documentsView with Double = js.native
    /* 4 */ val listView: typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailMode.listView with Double = js.native
    /* 2 */ val musicView: typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailMode.musicView with Double = js.native
    /* 0 */ val picturesView: typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailMode.picturesView with Double = js.native
    /* 5 */ val singleItem: typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailMode.singleItem with Double = js.native
    /* 1 */ val videosView: typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailMode.videosView with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailMode with Double] = js.native
  }
  
  @js.native
  object ThumbnailOptions extends js.Object {
    /* 0 */ val none: typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailOptions.none with Double = js.native
    /* 2 */ val resizeThumbnail: typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailOptions.resizeThumbnail with Double = js.native
    /* 1 */ val returnOnlyIfCached: typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailOptions.returnOnlyIfCached with Double = js.native
    /* 3 */ val useCurrentScale: typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailOptions.useCurrentScale with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailOptions with Double] = js.native
  }
  
  @js.native
  object ThumbnailType extends js.Object {
    /* 1 */ val icon: typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailType.icon with Double = js.native
    /* 0 */ val image: typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailType.image with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailType with Double] = js.native
  }
  
  @js.native
  object VideoOrientation extends js.Object {
    /* 0 */ val normal: typingsSlinky.winrt.Windows.Storage.FileProperties.VideoOrientation.normal with Double = js.native
    /* 2 */ val rotate180: typingsSlinky.winrt.Windows.Storage.FileProperties.VideoOrientation.rotate180 with Double = js.native
    /* 3 */ val rotate270: typingsSlinky.winrt.Windows.Storage.FileProperties.VideoOrientation.rotate270 with Double = js.native
    /* 1 */ val rotate90: typingsSlinky.winrt.Windows.Storage.FileProperties.VideoOrientation.rotate90 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.FileProperties.VideoOrientation with Double] = js.native
  }
  
}


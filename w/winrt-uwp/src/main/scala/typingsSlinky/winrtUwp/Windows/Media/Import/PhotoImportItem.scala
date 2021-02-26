package typingsSlinky.winrtUwp.Windows.Media.Import

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an media item that has been imported from a source. */
@js.native
trait PhotoImportItem extends StObject {
  
  /** Gets the content type of the imported item. */
  var contentType: PhotoImportContentType = js.native
  
  /** Gets the creation date of the imported item. */
  var date: js.Date = js.native
  
  /** Gets a list of the names of files associated with this item that were deleted. */
  var deletedFileNames: IVectorView[String] = js.native
  
  /** Gets a list of the names of files associated with this item that were imported. */
  var importedFileNames: IVectorView[String] = js.native
  
  /** Gets a value indicating whether the item is currently selected for import. */
  var isSelected: Boolean = js.native
  
  /** Gets the key used to identify the item. */
  var itemKey: Double = js.native
  
  /** Gets the name of the item. */
  var name: String = js.native
  
  /** Gets the sibling file associated with the item, if one exists. */
  var sibling: PhotoImportSidecar = js.native
  
  /** Gets the list of sidecar files associated with the item, if any exists. */
  var sidecars: IVectorView[PhotoImportSidecar] = js.native
  
  /** Gets the size of the item, in bytes. */
  var sizeInBytes: Double = js.native
  
  /** Gets a random access stream containing the thumbnail image associated with the item. */
  var thumbnail: IRandomAccessStreamReference = js.native
  
  /** Gets the list of video segments associated with the item. */
  var videoSegments: IVectorView[PhotoImportVideoSegment] = js.native
}
object PhotoImportItem {
  
  @scala.inline
  def apply(
    contentType: PhotoImportContentType,
    date: js.Date,
    deletedFileNames: IVectorView[String],
    importedFileNames: IVectorView[String],
    isSelected: Boolean,
    itemKey: Double,
    name: String,
    sibling: PhotoImportSidecar,
    sidecars: IVectorView[PhotoImportSidecar],
    sizeInBytes: Double,
    thumbnail: IRandomAccessStreamReference,
    videoSegments: IVectorView[PhotoImportVideoSegment]
  ): PhotoImportItem = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], deletedFileNames = deletedFileNames.asInstanceOf[js.Any], importedFileNames = importedFileNames.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], itemKey = itemKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sibling = sibling.asInstanceOf[js.Any], sidecars = sidecars.asInstanceOf[js.Any], sizeInBytes = sizeInBytes.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], videoSegments = videoSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportItem]
  }
  
  @scala.inline
  implicit class PhotoImportItemMutableBuilder[Self <: PhotoImportItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: PhotoImportContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedFileNames(value: IVectorView[String]): Self = StObject.set(x, "deletedFileNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportedFileNames(value: IVectorView[String]): Self = StObject.set(x, "importedFileNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemKey(value: Double): Self = StObject.set(x, "itemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSibling(value: PhotoImportSidecar): Self = StObject.set(x, "sibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidecars(value: IVectorView[PhotoImportSidecar]): Self = StObject.set(x, "sidecars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeInBytes(value: Double): Self = StObject.set(x, "sizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: IRandomAccessStreamReference): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoSegments(value: IVectorView[PhotoImportVideoSegment]): Self = StObject.set(x, "videoSegments", value.asInstanceOf[js.Any])
  }
}

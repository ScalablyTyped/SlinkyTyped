package typingsSlinky.winrtUwp.Windows.Media.Import

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an media item that has been imported from a source. */
@js.native
trait PhotoImportItem extends js.Object {
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
  implicit class PhotoImportItemOps[Self <: PhotoImportItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentType(value: PhotoImportContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletedFileNames(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedFileNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportedFileNames(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importedFileNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSibling(value: PhotoImportSidecar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSidecars(value: IVectorView[PhotoImportSidecar]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidecars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnail(value: IRandomAccessStreamReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoSegments(value: IVectorView[PhotoImportVideoSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoSegments")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


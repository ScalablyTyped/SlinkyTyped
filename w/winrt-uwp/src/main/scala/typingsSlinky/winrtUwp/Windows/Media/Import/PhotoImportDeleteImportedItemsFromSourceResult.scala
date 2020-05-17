package typingsSlinky.winrtUwp.Windows.Media.Import

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a operation that deletes imported media items from the source. */
@js.native
trait PhotoImportDeleteImportedItemsFromSourceResult extends js.Object {
  /** Gets a list of items that were deleted from the source. */
  var deletedItems: IVectorView[PhotoImportItem] = js.native
  /** Gets a value indicating whether the delete operation has succeeded. */
  var hasSucceeded: Boolean = js.native
  /** Gets the number of photos deleted in the operation. */
  var photosCount: Double = js.native
  /** Gets the size of the deleted photos, in bytes. */
  var photosSizeInBytes: Double = js.native
  /** Gets the photo import session associated with the delete operation. */
  var session: PhotoImportSession = js.native
  /** Gets the number of sibling files deleted in the operation. */
  var siblingsCount: Double = js.native
  /** Gets the size of the deleted sibling files, in bytes. */
  var siblingsSizeInBytes: Double = js.native
  /** Gets the number of sidecar files deleted in the operation. */
  var sidecarsCount: Double = js.native
  /** Gets the size of the deleted sidecar files, in bytes. */
  var sidecarsSizeInBytes: Double = js.native
  /** Gets the total number of items deleted in the operation. */
  var totalCount: Double = js.native
  /** Gets the total size of the all deleted items, in bytes. */
  var totalSizeInBytes: Double = js.native
  /** Gets the number of videos deleted in the operation. */
  var videosCount: Double = js.native
  /** Gets the size of the deleted videos, in bytes. */
  var videosSizeInBytes: Double = js.native
}

object PhotoImportDeleteImportedItemsFromSourceResult {
  @scala.inline
  def apply(
    deletedItems: IVectorView[PhotoImportItem],
    hasSucceeded: Boolean,
    photosCount: Double,
    photosSizeInBytes: Double,
    session: PhotoImportSession,
    siblingsCount: Double,
    siblingsSizeInBytes: Double,
    sidecarsCount: Double,
    sidecarsSizeInBytes: Double,
    totalCount: Double,
    totalSizeInBytes: Double,
    videosCount: Double,
    videosSizeInBytes: Double
  ): PhotoImportDeleteImportedItemsFromSourceResult = {
    val __obj = js.Dynamic.literal(deletedItems = deletedItems.asInstanceOf[js.Any], hasSucceeded = hasSucceeded.asInstanceOf[js.Any], photosCount = photosCount.asInstanceOf[js.Any], photosSizeInBytes = photosSizeInBytes.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], siblingsCount = siblingsCount.asInstanceOf[js.Any], siblingsSizeInBytes = siblingsSizeInBytes.asInstanceOf[js.Any], sidecarsCount = sidecarsCount.asInstanceOf[js.Any], sidecarsSizeInBytes = sidecarsSizeInBytes.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any], totalSizeInBytes = totalSizeInBytes.asInstanceOf[js.Any], videosCount = videosCount.asInstanceOf[js.Any], videosSizeInBytes = videosSizeInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportDeleteImportedItemsFromSourceResult]
  }
  @scala.inline
  implicit class PhotoImportDeleteImportedItemsFromSourceResultOps[Self <: PhotoImportDeleteImportedItemsFromSourceResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletedItems(value: IVectorView[PhotoImportItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasSucceeded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSucceeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhotosCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photosCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhotosSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photosSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: PhotoImportSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSiblingsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siblingsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSiblingsSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siblingsSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSidecarsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidecarsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSidecarsSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidecarsSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideosCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videosCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideosSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videosSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.winrtUwp.Windows.Media.Import

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a operation that imports media items from the source. */
@js.native
trait PhotoImportImportItemsResult extends js.Object {
  /** Gets a value indicating whether the import operation has succeeded. */
  var hasSucceeded: Boolean = js.native
  /** Gets a list of items that were imported from the source. */
  var importedItems: IVectorView[PhotoImportItem] = js.native
  /** Gets the number of photos imported in the operation. */
  var photosCount: Double = js.native
  /** Gets the size of the imported photos, in bytes. */
  var photosSizeInBytes: Double = js.native
  /** Gets the photo import session associated with the import operation. */
  var session: PhotoImportSession = js.native
  /** Gets the number of sibling files imported in the operation. */
  var siblingsCount: Double = js.native
  /** Gets the size of the imported sidecar files, in bytes. */
  var siblingsSizeInBytes: Double = js.native
  /** Gets the number of sidecar files imported in the operation. */
  var sidecarsCount: Double = js.native
  /** Gets the size of the imported sidecar files, in bytes. */
  var sidecarsSizeInBytes: Double = js.native
  /** Gets the total number of items imported in the operation. */
  var totalCount: Double = js.native
  /** Gets the total size of the all imported items, in bytes. */
  var totalSizeInBytes: Double = js.native
  /** Gets the number of videos imported in the operation. */
  var videosCount: Double = js.native
  /** Gets the size of the imported videos, in bytes. */
  var videosSizeInBytes: Double = js.native
  /**
    * Asynchronously deletes the items that were imported from the source.
    * @return An asynchronous operation that returns a PhotoImportDeleteImportedItemsFromSourceResult on successful completion.
    */
  def deleteImportedItemsFromSourceAsync(): IPromiseWithIAsyncOperationWithProgress[PhotoImportDeleteImportedItemsFromSourceResult, Double] = js.native
}

object PhotoImportImportItemsResult {
  @scala.inline
  def apply(
    deleteImportedItemsFromSourceAsync: () => IPromiseWithIAsyncOperationWithProgress[PhotoImportDeleteImportedItemsFromSourceResult, Double],
    hasSucceeded: Boolean,
    importedItems: IVectorView[PhotoImportItem],
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
  ): PhotoImportImportItemsResult = {
    val __obj = js.Dynamic.literal(deleteImportedItemsFromSourceAsync = js.Any.fromFunction0(deleteImportedItemsFromSourceAsync), hasSucceeded = hasSucceeded.asInstanceOf[js.Any], importedItems = importedItems.asInstanceOf[js.Any], photosCount = photosCount.asInstanceOf[js.Any], photosSizeInBytes = photosSizeInBytes.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], siblingsCount = siblingsCount.asInstanceOf[js.Any], siblingsSizeInBytes = siblingsSizeInBytes.asInstanceOf[js.Any], sidecarsCount = sidecarsCount.asInstanceOf[js.Any], sidecarsSizeInBytes = sidecarsSizeInBytes.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any], totalSizeInBytes = totalSizeInBytes.asInstanceOf[js.Any], videosCount = videosCount.asInstanceOf[js.Any], videosSizeInBytes = videosSizeInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportImportItemsResult]
  }
  @scala.inline
  implicit class PhotoImportImportItemsResultOps[Self <: PhotoImportImportItemsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteImportedItemsFromSourceAsync(
      value: () => IPromiseWithIAsyncOperationWithProgress[PhotoImportDeleteImportedItemsFromSourceResult, Double]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteImportedItemsFromSourceAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasSucceeded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSucceeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportedItems(value: IVectorView[PhotoImportItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importedItems")(value.asInstanceOf[js.Any])
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


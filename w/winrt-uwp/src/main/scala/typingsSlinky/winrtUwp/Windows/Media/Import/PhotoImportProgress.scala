package typingsSlinky.winrtUwp.Windows.Media.Import

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The progress data for an asynchronous photo import operation. */
@js.native
trait PhotoImportProgress extends js.Object {
  /** The number of bytes that have been imported. */
  var bytesImported: Double = js.native
  /** The current import progress, expressed as a floating point value from 0 to 1. */
  var importProgress: Double = js.native
  /** The number of items that have been imported. */
  var itemsImported: Double = js.native
  /** The total number of bytes to be imported. */
  var totalBytesToImport: Double = js.native
  /** The total number of items to be imported. */
  var totalItemsToImport: Double = js.native
}

object PhotoImportProgress {
  @scala.inline
  def apply(
    bytesImported: Double,
    importProgress: Double,
    itemsImported: Double,
    totalBytesToImport: Double,
    totalItemsToImport: Double
  ): PhotoImportProgress = {
    val __obj = js.Dynamic.literal(bytesImported = bytesImported.asInstanceOf[js.Any], importProgress = importProgress.asInstanceOf[js.Any], itemsImported = itemsImported.asInstanceOf[js.Any], totalBytesToImport = totalBytesToImport.asInstanceOf[js.Any], totalItemsToImport = totalItemsToImport.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportProgress]
  }
  @scala.inline
  implicit class PhotoImportProgressOps[Self <: PhotoImportProgress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesImported(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesImported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemsImported(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsImported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalBytesToImport(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesToImport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalItemsToImport(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItemsToImport")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


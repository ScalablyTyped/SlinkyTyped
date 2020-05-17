package typingsSlinky.winrtUwp.Windows.Media.Import

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an imported video segment. */
@js.native
trait PhotoImportVideoSegment extends js.Object {
  /** Gets the date of the imported video segment. */
  var date: js.Date = js.native
  /** Gets the name of the imported video segment. */
  var name: String = js.native
  /** Gets the sibling file associated with the imported video segment. */
  var sibling: PhotoImportSidecar = js.native
  /** Gets the sidecar file associated with the imported video segment. */
  var sidecars: IVectorView[PhotoImportSidecar] = js.native
  /** Gets the size of the imported video segment, in bytes. */
  var sizeInBytes: Double = js.native
}

object PhotoImportVideoSegment {
  @scala.inline
  def apply(
    date: js.Date,
    name: String,
    sibling: PhotoImportSidecar,
    sidecars: IVectorView[PhotoImportSidecar],
    sizeInBytes: Double
  ): PhotoImportVideoSegment = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sibling = sibling.asInstanceOf[js.Any], sidecars = sidecars.asInstanceOf[js.Any], sizeInBytes = sizeInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportVideoSegment]
  }
  @scala.inline
  implicit class PhotoImportVideoSegmentOps[Self <: PhotoImportVideoSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
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
  }
  
}


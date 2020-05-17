package typingsSlinky.winrtUwp.Windows.Media.Import

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a sidecar file or a sibling file to a PhotoImportItem . */
@js.native
trait PhotoImportSidecar extends js.Object {
  /** Gets the date of the sidecar or sibling file. */
  var date: js.Date = js.native
  /** Gets the name of the sidecar or sibling file. */
  var name: String = js.native
  /** Gets the size of the sidecar or sibling file, in bytes. */
  var sizeInBytes: Double = js.native
}

object PhotoImportSidecar {
  @scala.inline
  def apply(date: js.Date, name: String, sizeInBytes: Double): PhotoImportSidecar = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sizeInBytes = sizeInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportSidecar]
  }
  @scala.inline
  implicit class PhotoImportSidecarOps[Self <: PhotoImportSidecar] (val x: Self) extends AnyVal {
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
    def withSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


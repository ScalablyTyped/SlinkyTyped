package typingsSlinky.xrm.Xrm.Device

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for Xrm.Device.pickFile options
  */
@js.native
trait PickFileOptions extends js.Object {
  /**
    * Image file types to select.
    */
  var accept: PickFileTypes = js.native
  /**
    * Indicates whether to allow selecting multiple files.
    */
  var allowMultipleFiles: Boolean = js.native
  /**
    * Maximum size of the files(s) to be selected.
    */
  var maximumAllowedFileSize: Double = js.native
}

object PickFileOptions {
  @scala.inline
  def apply(accept: PickFileTypes, allowMultipleFiles: Boolean, maximumAllowedFileSize: Double): PickFileOptions = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], allowMultipleFiles = allowMultipleFiles.asInstanceOf[js.Any], maximumAllowedFileSize = maximumAllowedFileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickFileOptions]
  }
  @scala.inline
  implicit class PickFileOptionsOps[Self <: PickFileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: PickFileTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowMultipleFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultipleFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximumAllowedFileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumAllowedFileSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


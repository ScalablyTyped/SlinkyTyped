package typingsSlinky.zipWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait fileOptions extends js.Object {
  /**
    * Whether to compress the out[ut zip file.
    * When true, the file data will be deflated (compression method 8).
    * When false, the file data will be stored (compression method 0).
    */
  var compress: js.UndefOr[Boolean] = js.native
  /**
    * Force ZIP64 format. ZIP64 format is enabled by default where necessary.
    * See https://github.com/thejoshwolfe/yazl#regarding-zip64-support
    */
  var forceZip64Format: js.UndefOr[Boolean] = js.native
  /**
    * UNIX permission bits and file type.
    */
  var mode: js.UndefOr[Double] = js.native
  /**
    * Overwrite the last modified time.
    * Defaults to the current date and time.
    */
  var mtime: js.UndefOr[js.Date] = js.native
}

object fileOptions {
  @scala.inline
  def apply(): fileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[fileOptions]
  }
  @scala.inline
  implicit class fileOptionsOps[Self <: fileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(js.undefined)
        ret
    }
    @scala.inline
    def withForceZip64Format(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceZip64Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceZip64Format: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceZip64Format")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withMtime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMtime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtime")(js.undefined)
        ret
    }
  }
  
}


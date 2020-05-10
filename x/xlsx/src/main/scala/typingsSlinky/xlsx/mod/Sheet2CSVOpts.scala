package typingsSlinky.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sheet2CSVOpts extends DateNFOption {
  /** Field Separator ("delimiter") */
  var FS: js.UndefOr[String] = js.native
  /** Record Separator ("row separator") */
  var RS: js.UndefOr[String] = js.native
  /** Include blank lines in the CSV output */
  var blankrows: js.UndefOr[Boolean] = js.native
  /** Skip hidden rows and columns in the CSV output */
  var skipHidden: js.UndefOr[Boolean] = js.native
  /** Remove trailing field separators in each record */
  var strip: js.UndefOr[Boolean] = js.native
}

object Sheet2CSVOpts {
  @scala.inline
  def apply(): Sheet2CSVOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sheet2CSVOpts]
  }
  @scala.inline
  implicit class Sheet2CSVOptsOps[Self <: Sheet2CSVOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FS")(js.undefined)
        ret
    }
    @scala.inline
    def withRS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RS")(js.undefined)
        ret
    }
    @scala.inline
    def withBlankrows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blankrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlankrows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blankrows")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withStrip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strip")(js.undefined)
        ret
    }
  }
  
}


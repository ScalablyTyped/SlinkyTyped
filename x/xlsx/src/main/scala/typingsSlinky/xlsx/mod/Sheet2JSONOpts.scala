package typingsSlinky.xlsx.mod

import typingsSlinky.xlsx.xlsxStrings.A
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sheet2JSONOpts extends DateNFOption {
  /** Include or omit blank lines in the output */
  var blankrows: js.UndefOr[Boolean] = js.native
  /** Default value for null/undefined values */
  var defval: js.UndefOr[js.Any] = js.native
  /** Output format */
  var header: js.UndefOr[A | Double | js.Array[String]] = js.native
  /** Override worksheet range */
  var range: js.UndefOr[js.Any] = js.native
  /** if true, return raw data; if false, return formatted text */
  var raw: js.UndefOr[Boolean] = js.native
}

object Sheet2JSONOpts {
  @scala.inline
  def apply(): Sheet2JSONOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sheet2JSONOpts]
  }
  @scala.inline
  implicit class Sheet2JSONOptsOps[Self <: Sheet2JSONOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDefval(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defval")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: A | Double | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
  }
  
}


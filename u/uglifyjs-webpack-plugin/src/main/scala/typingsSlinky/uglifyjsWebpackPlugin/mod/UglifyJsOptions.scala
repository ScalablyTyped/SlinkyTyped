package typingsSlinky.uglifyjsWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UglifyJsOptions extends js.Object {
  var compress: js.UndefOr[Boolean | js.Object] = js.native
  var ecma: js.UndefOr[Double] = js.native
  var ie8: js.UndefOr[Boolean] = js.native
  var keep_classnames: js.UndefOr[Boolean] = js.native
  var keep_fnames: js.UndefOr[Boolean] = js.native
  var mangle: js.UndefOr[Boolean | js.Object] = js.native
  var nameCache: js.UndefOr[js.Object] = js.native
  var output: js.UndefOr[js.Object] = js.native
  var parse: js.UndefOr[js.Object] = js.native
  var safari10: js.UndefOr[Boolean] = js.native
  var toplevel: js.UndefOr[Boolean] = js.native
  var warnings: js.UndefOr[Boolean] = js.native
}

object UglifyJsOptions {
  @scala.inline
  def apply(): UglifyJsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UglifyJsOptions]
  }
  @scala.inline
  implicit class UglifyJsOptionsOps[Self <: UglifyJsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompress(value: Boolean | js.Object): Self = {
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
    def withEcma(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcma: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecma")(js.undefined)
        ret
    }
    @scala.inline
    def withIe8(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIe8: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie8")(js.undefined)
        ret
    }
    @scala.inline
    def withKeep_classnames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_classnames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeep_classnames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_classnames")(js.undefined)
        ret
    }
    @scala.inline
    def withKeep_fnames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_fnames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeep_fnames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_fnames")(js.undefined)
        ret
    }
    @scala.inline
    def withMangle(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mangle")(js.undefined)
        ret
    }
    @scala.inline
    def withNameCache(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameCache")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withParse(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.undefined)
        ret
    }
    @scala.inline
    def withSafari10(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safari10")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafari10: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safari10")(js.undefined)
        ret
    }
    @scala.inline
    def withToplevel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toplevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToplevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toplevel")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.summernote.mod.global.Summernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodemirrorOptions extends js.Object {
  var htmlNode: js.UndefOr[Boolean] = js.native
  var lineNumbers: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[String] = js.native
  var theme: js.UndefOr[String] = js.native
}

object CodemirrorOptions {
  @scala.inline
  def apply(): CodemirrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodemirrorOptions]
  }
  @scala.inline
  implicit class CodemirrorOptionsOps[Self <: CodemirrorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtmlNode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlNode")(js.undefined)
        ret
    }
    @scala.inline
    def withLineNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
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
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}


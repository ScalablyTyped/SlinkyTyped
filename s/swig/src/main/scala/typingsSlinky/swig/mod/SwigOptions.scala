package typingsSlinky.swig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwigOptions extends js.Object {
  var autoescape: js.UndefOr[Boolean] = js.native
  var cache: js.UndefOr[js.Any] = js.native
  var cmtControls: js.UndefOr[js.Array[String]] = js.native
  var loader: js.UndefOr[TemplateLoader] = js.native
  var locals: js.UndefOr[js.Any] = js.native
  var tagControls: js.UndefOr[js.Array[String]] = js.native
  var varControls: js.UndefOr[js.Array[String]] = js.native
}

object SwigOptions {
  @scala.inline
  def apply(): SwigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwigOptions]
  }
  @scala.inline
  implicit class SwigOptionsOps[Self <: SwigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoescape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoescape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoescape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoescape")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCmtControls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmtControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCmtControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmtControls")(js.undefined)
        ret
    }
    @scala.inline
    def withLoader(value: TemplateLoader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(js.undefined)
        ret
    }
    @scala.inline
    def withLocals(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locals")(js.undefined)
        ret
    }
    @scala.inline
    def withTagControls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagControls")(js.undefined)
        ret
    }
    @scala.inline
    def withVarControls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVarControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varControls")(js.undefined)
        ret
    }
  }
  
}


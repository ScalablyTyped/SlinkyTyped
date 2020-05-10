package typingsSlinky.swigEmailTemplates.mod

import typingsSlinky.jquery.JQueryStatic
import typingsSlinky.swig.mod.SwigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwigEmailTemplatesOptions extends SwigOptions {
  var juice: js.UndefOr[js.Any] = js.native
  var rewrite: js.UndefOr[js.Function1[/* $ */ JQueryStatic, Unit]] = js.native
  var rewriteUrl: js.UndefOr[js.Function1[/* href */ String, String]] = js.native
  var root: js.UndefOr[String] = js.native
}

object SwigEmailTemplatesOptions {
  @scala.inline
  def apply(): SwigEmailTemplatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwigEmailTemplatesOptions]
  }
  @scala.inline
  implicit class SwigEmailTemplatesOptionsOps[Self <: SwigEmailTemplatesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJuice(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("juice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJuice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("juice")(js.undefined)
        ret
    }
    @scala.inline
    def withRewrite(value: /* $ */ JQueryStatic => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewrite")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRewrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewrite")(js.undefined)
        ret
    }
    @scala.inline
    def withRewriteUrl(value: /* href */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewriteUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRewriteUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewriteUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
  }
  
}


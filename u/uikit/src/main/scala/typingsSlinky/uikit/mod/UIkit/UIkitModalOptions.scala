package typingsSlinky.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIkitModalOptions extends js.Object {
  var `bg-close`: js.UndefOr[Boolean] = js.native
  var `cls-page`: js.UndefOr[String] = js.native
  var `cls-panel`: js.UndefOr[String] = js.native
  var container: js.UndefOr[String | Boolean] = js.native
  var `esc-close`: js.UndefOr[Boolean] = js.native
  var `sel-close`: js.UndefOr[String] = js.native
  var stack: js.UndefOr[Boolean] = js.native
}

object UIkitModalOptions {
  @scala.inline
  def apply(): UIkitModalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitModalOptions]
  }
  @scala.inline
  implicit class UIkitModalOptionsOps[Self <: UIkitModalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withBg-close`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bg-close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBg-close`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bg-close")(js.undefined)
        ret
    }
    @scala.inline
    def `withCls-page`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls-page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCls-page`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls-page")(js.undefined)
        ret
    }
    @scala.inline
    def `withCls-panel`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls-panel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCls-panel`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls-panel")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def `withEsc-close`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("esc-close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutEsc-close`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("esc-close")(js.undefined)
        ret
    }
    @scala.inline
    def `withSel-close`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sel-close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSel-close`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sel-close")(js.undefined)
        ret
    }
    @scala.inline
    def withStack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(js.undefined)
        ret
    }
  }
  
}


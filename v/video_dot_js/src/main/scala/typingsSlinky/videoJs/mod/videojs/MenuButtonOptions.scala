package typingsSlinky.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuButtonOptions extends ComponentOptions {
  var iniChildren: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
}

object MenuButtonOptions {
  @scala.inline
  def apply(): MenuButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuButtonOptions]
  }
  @scala.inline
  implicit class MenuButtonOptionsOps[Self <: MenuButtonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIniChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iniChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIniChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iniChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}


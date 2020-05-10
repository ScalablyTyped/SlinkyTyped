package typingsSlinky.wixStyleReact.baseComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WixComponentProps extends js.Object {
  var dataHook: js.UndefOr[String] = js.native
  var styles: js.UndefOr[String] = js.native
}

object WixComponentProps {
  @scala.inline
  def apply(): WixComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WixComponentProps]
  }
  @scala.inline
  implicit class WixComponentPropsOps[Self <: WixComponentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataHook(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataHook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
  }
  
}


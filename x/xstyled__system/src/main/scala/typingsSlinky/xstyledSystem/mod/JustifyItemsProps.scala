package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.JustifyItemsProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JustifyItemsProps extends js.Object {
  val justifyItems: js.UndefOr[ResponsiveValue[JustifyItemsProperty]] = js.native
}

object JustifyItemsProps {
  @scala.inline
  def apply(): JustifyItemsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JustifyItemsProps]
  }
  @scala.inline
  implicit class JustifyItemsPropsOps[Self <: JustifyItemsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJustifyItems(value: ResponsiveValue[JustifyItemsProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifyItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJustifyItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifyItems")(js.undefined)
        ret
    }
  }
  
}


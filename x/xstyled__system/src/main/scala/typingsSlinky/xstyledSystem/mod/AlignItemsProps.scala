package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.AlignItemsProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlignItemsProps extends js.Object {
  val alignItems: js.UndefOr[ResponsiveValue[AlignItemsProperty]] = js.native
}

object AlignItemsProps {
  @scala.inline
  def apply(): AlignItemsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignItemsProps]
  }
  @scala.inline
  implicit class AlignItemsPropsOps[Self <: AlignItemsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignItems(value: ResponsiveValue[AlignItemsProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignItems")(js.undefined)
        ret
    }
  }
  
}


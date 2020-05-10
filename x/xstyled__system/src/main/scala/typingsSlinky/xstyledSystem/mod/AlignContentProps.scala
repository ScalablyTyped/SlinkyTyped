package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.AlignContentProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlignContentProps extends js.Object {
  val alignContent: js.UndefOr[ResponsiveValue[AlignContentProperty]] = js.native
}

object AlignContentProps {
  @scala.inline
  def apply(): AlignContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignContentProps]
  }
  @scala.inline
  implicit class AlignContentPropsOps[Self <: AlignContentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignContent(value: ResponsiveValue[AlignContentProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignContent")(js.undefined)
        ret
    }
  }
  
}


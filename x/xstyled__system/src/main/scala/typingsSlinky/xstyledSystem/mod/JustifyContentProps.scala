package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.JustifyContentProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JustifyContentProps extends js.Object {
  val justifyContent: js.UndefOr[ResponsiveValue[JustifyContentProperty]] = js.native
}

object JustifyContentProps {
  @scala.inline
  def apply(): JustifyContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JustifyContentProps]
  }
  @scala.inline
  implicit class JustifyContentPropsOps[Self <: JustifyContentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJustifyContent(value: ResponsiveValue[JustifyContentProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifyContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJustifyContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifyContent")(js.undefined)
        ret
    }
  }
  
}


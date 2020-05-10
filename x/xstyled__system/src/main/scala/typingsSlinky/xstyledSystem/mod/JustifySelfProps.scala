package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.JustifySelfProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JustifySelfProps extends js.Object {
  val justifySelf: js.UndefOr[ResponsiveValue[JustifySelfProperty]] = js.native
}

object JustifySelfProps {
  @scala.inline
  def apply(): JustifySelfProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JustifySelfProps]
  }
  @scala.inline
  implicit class JustifySelfPropsOps[Self <: JustifySelfProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJustifySelf(value: ResponsiveValue[JustifySelfProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifySelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJustifySelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifySelf")(js.undefined)
        ret
    }
  }
  
}


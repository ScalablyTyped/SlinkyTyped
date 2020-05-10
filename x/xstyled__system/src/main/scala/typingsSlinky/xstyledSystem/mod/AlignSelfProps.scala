package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.AlignSelfProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlignSelfProps extends js.Object {
  val alignSelf: js.UndefOr[ResponsiveValue[AlignSelfProperty]] = js.native
}

object AlignSelfProps {
  @scala.inline
  def apply(): AlignSelfProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignSelfProps]
  }
  @scala.inline
  implicit class AlignSelfPropsOps[Self <: AlignSelfProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignSelf(value: ResponsiveValue[AlignSelfProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignSelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignSelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignSelf")(js.undefined)
        ret
    }
  }
  
}


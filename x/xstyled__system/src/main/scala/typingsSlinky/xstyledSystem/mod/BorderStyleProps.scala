package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.BorderStyleProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderStyleProps extends js.Object {
  val borderStyle: js.UndefOr[ResponsiveValue[BorderStyleProperty | Double]] = js.native
}

object BorderStyleProps {
  @scala.inline
  def apply(): BorderStyleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderStyleProps]
  }
  @scala.inline
  implicit class BorderStylePropsOps[Self <: BorderStyleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderStyle(value: ResponsiveValue[BorderStyleProperty | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStyle")(js.undefined)
        ret
    }
  }
  
}


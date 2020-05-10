package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.BorderColorProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderLeftColorProps extends js.Object {
  val borderLeftColor: js.UndefOr[ResponsiveValue[BorderColorProperty]] = js.native
}

object BorderLeftColorProps {
  @scala.inline
  def apply(): BorderLeftColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderLeftColorProps]
  }
  @scala.inline
  implicit class BorderLeftColorPropsOps[Self <: BorderLeftColorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderLeftColor(value: ResponsiveValue[BorderColorProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeftColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderLeftColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeftColor")(js.undefined)
        ret
    }
  }
  
}


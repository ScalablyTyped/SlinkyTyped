package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.BoxShadowProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxShadowProps extends js.Object {
  val boxShadow: js.UndefOr[ResponsiveValue[BoxShadowProperty | Double]] = js.native
}

object BoxShadowProps {
  @scala.inline
  def apply(): BoxShadowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxShadowProps]
  }
  @scala.inline
  implicit class BoxShadowPropsOps[Self <: BoxShadowProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoxShadow(value: ResponsiveValue[BoxShadowProperty | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxShadow")(js.undefined)
        ret
    }
  }
  
}


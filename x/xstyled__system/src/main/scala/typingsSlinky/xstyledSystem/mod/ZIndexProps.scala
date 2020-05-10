package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.ZIndexProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZIndexProps extends js.Object {
  val zIndex: js.UndefOr[ResponsiveValue[ZIndexProperty | AliasKey]] = js.native
}

object ZIndexProps {
  @scala.inline
  def apply(): ZIndexProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZIndexProps]
  }
  @scala.inline
  implicit class ZIndexPropsOps[Self <: ZIndexProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withZIndex(value: ResponsiveValue[ZIndexProperty | AliasKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}


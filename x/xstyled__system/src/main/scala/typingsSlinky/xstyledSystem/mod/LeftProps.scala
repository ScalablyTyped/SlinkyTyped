package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.LeftProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeftProps[TLength] extends js.Object {
  val left: js.UndefOr[ResponsiveValue[LeftProperty[TLength]]] = js.native
}

object LeftProps {
  @scala.inline
  def apply[TLength](): LeftProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeftProps[TLength]]
  }
  @scala.inline
  implicit class LeftPropsOps[Self[tlength] <: LeftProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withLeft(value: ResponsiveValue[LeftProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
  }
  
}


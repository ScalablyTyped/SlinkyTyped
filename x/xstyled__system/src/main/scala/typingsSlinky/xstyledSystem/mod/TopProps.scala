package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.TopProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopProps[TLength] extends js.Object {
  val top: js.UndefOr[ResponsiveValue[TopProperty[TLength]]] = js.native
}

object TopProps {
  @scala.inline
  def apply[TLength](): TopProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopProps[TLength]]
  }
  @scala.inline
  implicit class TopPropsOps[Self[tlength] <: TopProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withTop(value: ResponsiveValue[TopProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
  }
  
}


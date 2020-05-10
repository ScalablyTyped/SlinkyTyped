package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.BorderRadiusProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderRadiusProps[TLength] extends js.Object {
  val borderRadius: js.UndefOr[ResponsiveValue[BorderRadiusProperty[TLength]]] = js.native
}

object BorderRadiusProps {
  @scala.inline
  def apply[TLength](): BorderRadiusProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderRadiusProps[TLength]]
  }
  @scala.inline
  implicit class BorderRadiusPropsOps[Self[tlength] <: BorderRadiusProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withBorderRadius(value: ResponsiveValue[BorderRadiusProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRadius: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(js.undefined)
        ret
    }
  }
  
}


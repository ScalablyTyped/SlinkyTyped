package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.BorderBottomProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderBottomProps[TLength] extends js.Object {
  val borderBottom: js.UndefOr[ResponsiveValue[BorderBottomProperty[TLength]]] = js.native
}

object BorderBottomProps {
  @scala.inline
  def apply[TLength](): BorderBottomProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderBottomProps[TLength]]
  }
  @scala.inline
  implicit class BorderBottomPropsOps[Self[tlength] <: BorderBottomProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withBorderBottom(value: ResponsiveValue[BorderBottomProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBottom: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottom")(js.undefined)
        ret
    }
  }
  
}


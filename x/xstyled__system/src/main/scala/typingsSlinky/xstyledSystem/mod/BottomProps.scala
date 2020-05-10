package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.BottomProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BottomProps[TLength] extends js.Object {
  val bottom: js.UndefOr[ResponsiveValue[BottomProperty[TLength]]] = js.native
}

object BottomProps {
  @scala.inline
  def apply[TLength](): BottomProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BottomProps[TLength]]
  }
  @scala.inline
  implicit class BottomPropsOps[Self[tlength] <: BottomProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withBottom(value: ResponsiveValue[BottomProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
  }
  
}


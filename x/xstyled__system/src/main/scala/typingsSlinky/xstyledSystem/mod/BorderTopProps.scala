package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.BorderTopProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderTopProps[TLength] extends js.Object {
  val borderTop: js.UndefOr[ResponsiveValue[BorderTopProperty[TLength]]] = js.native
}

object BorderTopProps {
  @scala.inline
  def apply[TLength](): BorderTopProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderTopProps[TLength]]
  }
  @scala.inline
  implicit class BorderTopPropsOps[Self[tlength] <: BorderTopProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withBorderTop(value: ResponsiveValue[BorderTopProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderTop: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTop")(js.undefined)
        ret
    }
  }
  
}


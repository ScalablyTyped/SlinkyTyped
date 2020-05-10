package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.BorderWidthProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderWidthProps[TLength] extends js.Object {
  val borderWidth: js.UndefOr[ResponsiveValue[BorderWidthProperty[TLength]]] = js.native
}

object BorderWidthProps {
  @scala.inline
  def apply[TLength](): BorderWidthProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderWidthProps[TLength]]
  }
  @scala.inline
  implicit class BorderWidthPropsOps[Self[tlength] <: BorderWidthProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withBorderWidth(value: ResponsiveValue[BorderWidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWidth: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.undefined)
        ret
    }
  }
  
}


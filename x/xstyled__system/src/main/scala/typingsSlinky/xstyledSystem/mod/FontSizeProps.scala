package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.FontSizeProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontSizeProps[TLength] extends js.Object {
  val fontSize: js.UndefOr[ResponsiveValue[FontSizeProperty[TLength]]] = js.native
}

object FontSizeProps {
  @scala.inline
  def apply[TLength](): FontSizeProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontSizeProps[TLength]]
  }
  @scala.inline
  implicit class FontSizePropsOps[Self[tlength] <: FontSizeProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withFontSize(value: ResponsiveValue[FontSizeProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.HeightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeProps[TLength] extends js.Object {
  val size: js.UndefOr[ResponsiveValue[HeightProperty[TLength]]] = js.native
}

object SizeProps {
  @scala.inline
  def apply[TLength](): SizeProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeProps[TLength]]
  }
  @scala.inline
  implicit class SizePropsOps[Self[tlength] <: SizeProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withSize(value: ResponsiveValue[HeightProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}


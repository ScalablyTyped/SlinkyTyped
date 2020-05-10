package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.MarginBottomProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarginBottomProps[TLength] extends js.Object {
  val marginBottom: js.UndefOr[ResponsiveValue[MarginBottomProperty[TLength]]] = js.native
  val mb: js.UndefOr[ResponsiveValue[MarginBottomProperty[TLength]]] = js.native
}

object MarginBottomProps {
  @scala.inline
  def apply[TLength](): MarginBottomProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginBottomProps[TLength]]
  }
  @scala.inline
  implicit class MarginBottomPropsOps[Self[tlength] <: MarginBottomProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withMarginBottom(value: ResponsiveValue[MarginBottomProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginBottom: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withMb(value: ResponsiveValue[MarginBottomProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMb: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mb")(js.undefined)
        ret
    }
  }
  
}


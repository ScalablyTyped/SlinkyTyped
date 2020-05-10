package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.PaddingBottomProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaddingBottomProps[TLength] extends js.Object {
  val paddingBottom: js.UndefOr[ResponsiveValue[PaddingBottomProperty[TLength]]] = js.native
  val pb: js.UndefOr[ResponsiveValue[PaddingBottomProperty[TLength]]] = js.native
}

object PaddingBottomProps {
  @scala.inline
  def apply[TLength](): PaddingBottomProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingBottomProps[TLength]]
  }
  @scala.inline
  implicit class PaddingBottomPropsOps[Self[tlength] <: PaddingBottomProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withPaddingBottom(value: ResponsiveValue[PaddingBottomProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingBottom: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withPb(value: ResponsiveValue[PaddingBottomProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPb: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pb")(js.undefined)
        ret
    }
  }
  
}


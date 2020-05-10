package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMapCheckZoomRangeOptions extends js.Object {
  var checkZoomRange: js.UndefOr[Boolean] = js.native
}

object IMapCheckZoomRangeOptions {
  @scala.inline
  def apply(): IMapCheckZoomRangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapCheckZoomRangeOptions]
  }
  @scala.inline
  implicit class IMapCheckZoomRangeOptionsOps[Self <: IMapCheckZoomRangeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckZoomRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkZoomRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckZoomRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkZoomRange")(js.undefined)
        ret
    }
  }
  
}


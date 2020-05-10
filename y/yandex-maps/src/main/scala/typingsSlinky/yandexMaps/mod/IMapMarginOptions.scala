package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMapMarginOptions extends js.Object {
  var useMapMargin: js.UndefOr[Boolean] = js.native
}

object IMapMarginOptions {
  @scala.inline
  def apply(): IMapMarginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapMarginOptions]
  }
  @scala.inline
  implicit class IMapMarginOptionsOps[Self <: IMapMarginOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseMapMargin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMapMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMapMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMapMargin")(js.undefined)
        ret
    }
  }
  
}


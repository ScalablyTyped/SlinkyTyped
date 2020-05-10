package typingsSlinky.yandexMaps.mod.behavior

import typingsSlinky.yandexMaps.mod.IMapMarginOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDblClickZoomOptions extends IMapMarginOptions {
  var centering: js.UndefOr[Boolean] = js.native
  var duration: js.UndefOr[Double] = js.native
}

object IDblClickZoomOptions {
  @scala.inline
  def apply(): IDblClickZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDblClickZoomOptions]
  }
  @scala.inline
  implicit class IDblClickZoomOptionsOps[Self <: IDblClickZoomOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCentering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCentering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centering")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
  }
  
}


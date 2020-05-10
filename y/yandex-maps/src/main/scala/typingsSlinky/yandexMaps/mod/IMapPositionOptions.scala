package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMapPositionOptions extends IMapZoomOptions {
  var timingFunction: js.UndefOr[String] = js.native
}

object IMapPositionOptions {
  @scala.inline
  def apply(): IMapPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapPositionOptions]
  }
  @scala.inline
  implicit class IMapPositionOptionsOps[Self <: IMapPositionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimingFunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimingFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingFunction")(js.undefined)
        ret
    }
  }
  
}


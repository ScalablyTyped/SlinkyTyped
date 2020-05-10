package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapContextGetRegionResult extends js.Object {
  /**
    * 东北角的经纬度
    */
  var northeast: js.UndefOr[LocationObject] = js.native
  /**
    * 西南角的经纬度
    */
  var southwest: js.UndefOr[LocationObject] = js.native
}

object MapContextGetRegionResult {
  @scala.inline
  def apply(): MapContextGetRegionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapContextGetRegionResult]
  }
  @scala.inline
  implicit class MapContextGetRegionResultOps[Self <: MapContextGetRegionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNortheast(value: LocationObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("northeast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNortheast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("northeast")(js.undefined)
        ret
    }
    @scala.inline
    def withSouthwest(value: LocationObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("southwest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSouthwest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("southwest")(js.undefined)
        ret
    }
  }
  
}


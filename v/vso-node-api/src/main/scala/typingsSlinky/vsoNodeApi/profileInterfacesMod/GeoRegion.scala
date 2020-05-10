package typingsSlinky.vsoNodeApi.profileInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoRegion extends js.Object {
  var regionCode: String = js.native
}

object GeoRegion {
  @scala.inline
  def apply(regionCode: String): GeoRegion = {
    val __obj = js.Dynamic.literal(regionCode = regionCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoRegion]
  }
  @scala.inline
  implicit class GeoRegionOps[Self <: GeoRegion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegionCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.viewportMercatorProject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLatitude extends js.Object {
  var latitude: Double = js.native
}

object AnonLatitude {
  @scala.inline
  def apply(latitude: Double): AnonLatitude = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLatitude]
  }
  @scala.inline
  implicit class AnonLatitudeOps[Self <: AnonLatitude] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


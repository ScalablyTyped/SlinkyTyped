package typingsSlinky.teslajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait optionsType extends js.Object {
  var authToken: String = js.native
  var carIndex: js.UndefOr[Double] = js.native
  var vehicleID: String = js.native
}

object optionsType {
  @scala.inline
  def apply(authToken: String, vehicleID: String): optionsType = {
    val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], vehicleID = vehicleID.asInstanceOf[js.Any])
    __obj.asInstanceOf[optionsType]
  }
  @scala.inline
  implicit class optionsTypeOps[Self <: optionsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVehicleID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCarIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carIndex")(js.undefined)
        ret
    }
  }
  
}


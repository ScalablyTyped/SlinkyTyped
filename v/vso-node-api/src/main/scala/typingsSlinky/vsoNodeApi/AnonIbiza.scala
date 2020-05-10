package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIbiza extends js.Object {
  var ibiza: Double = js.native
  var portalExtensionApi: Double = js.native
  var restApi: Double = js.native
  var undefined: Double = js.native
  var userInterface: Double = js.native
}

object AnonIbiza {
  @scala.inline
  def apply(
    ibiza: Double,
    portalExtensionApi: Double,
    restApi: Double,
    undefined: Double,
    userInterface: Double
  ): AnonIbiza = {
    val __obj = js.Dynamic.literal(ibiza = ibiza.asInstanceOf[js.Any], portalExtensionApi = portalExtensionApi.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any], userInterface = userInterface.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIbiza]
  }
  @scala.inline
  implicit class AnonIbizaOps[Self <: AnonIbiza] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIbiza(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ibiza")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortalExtensionApi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalExtensionApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestApi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndefined(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserInterface(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInterface")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ibiza extends js.Object {
  var ibiza: scala.Double = js.native
  var portalExtensionApi: scala.Double = js.native
  var restApi: scala.Double = js.native
  var undefined: scala.Double = js.native
  var userInterface: scala.Double = js.native
}

object Ibiza {
  @scala.inline
  def apply(
    ibiza: scala.Double,
    portalExtensionApi: scala.Double,
    restApi: scala.Double,
    undefined: scala.Double,
    userInterface: scala.Double
  ): Ibiza = {
    val __obj = js.Dynamic.literal(ibiza = ibiza.asInstanceOf[js.Any], portalExtensionApi = portalExtensionApi.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any], userInterface = userInterface.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ibiza]
  }
  @scala.inline
  implicit class IbizaOps[Self <: Ibiza] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIbiza(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ibiza")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortalExtensionApi(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalExtensionApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestApi(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndefined(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserInterface(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInterface")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.sdpTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApp extends js.Object {
  var app: String = js.native
  var maxMessageSize: Double = js.native
  var sctpmapNumber: Double | String = js.native
}

object AnonApp {
  @scala.inline
  def apply(app: String, maxMessageSize: Double, sctpmapNumber: Double | String): AnonApp = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], maxMessageSize = maxMessageSize.asInstanceOf[js.Any], sctpmapNumber = sctpmapNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApp]
  }
  @scala.inline
  implicit class AnonAppOps[Self <: AnonApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxMessageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMessageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSctpmapNumber(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sctpmapNumber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


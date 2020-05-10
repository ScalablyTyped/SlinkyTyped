package typingsSlinky.wxJsSdkDt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNetworkType extends js.Object {
  var networkType: String = js.native
}

object AnonNetworkType {
  @scala.inline
  def apply(networkType: String): AnonNetworkType = {
    val __obj = js.Dynamic.literal(networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNetworkType]
  }
  @scala.inline
  implicit class AnonNetworkTypeOps[Self <: AnonNetworkType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


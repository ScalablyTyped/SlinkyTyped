package typingsSlinky.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  var DEFAULT_DEPLOYMENT_ID: String = js.native
}

object Service {
  @scala.inline
  def apply(DEFAULT_DEPLOYMENT_ID: String): Service = {
    val __obj = js.Dynamic.literal(DEFAULT_DEPLOYMENT_ID = DEFAULT_DEPLOYMENT_ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
  @scala.inline
  implicit class ServiceOps[Self <: Service] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDEFAULT_DEPLOYMENT_ID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_DEPLOYMENT_ID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


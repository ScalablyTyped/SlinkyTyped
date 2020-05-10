package typingsSlinky.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartClientOptions extends Options {
  var deployment: js.UndefOr[SmartClientDeployment] = js.native
}

object SmartClientOptions {
  @scala.inline
  def apply(sandboxId: String): SmartClientOptions = {
    val __obj = js.Dynamic.literal(sandboxId = sandboxId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartClientOptions]
  }
  @scala.inline
  implicit class SmartClientOptionsOps[Self <: SmartClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeployment(value: SmartClientDeployment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeployment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployment")(js.undefined)
        ret
    }
  }
  
}


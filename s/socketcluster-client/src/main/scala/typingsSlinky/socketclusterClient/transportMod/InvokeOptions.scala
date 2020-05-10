package typingsSlinky.socketclusterClient.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvokeOptions extends js.Object {
  var ackTimeout: js.UndefOr[Double] = js.native
  var force: js.UndefOr[Boolean] = js.native
  var noTimeout: js.UndefOr[Boolean] = js.native
}

object InvokeOptions {
  @scala.inline
  def apply(): InvokeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvokeOptions]
  }
  @scala.inline
  implicit class InvokeOptionsOps[Self <: InvokeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAckTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAckTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
        ret
    }
    @scala.inline
    def withNoTimeout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noTimeout")(js.undefined)
        ret
    }
  }
  
}


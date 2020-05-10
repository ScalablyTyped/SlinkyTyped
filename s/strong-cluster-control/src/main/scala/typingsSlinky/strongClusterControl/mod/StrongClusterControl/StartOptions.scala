package typingsSlinky.strongClusterControl.mod.StrongClusterControl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartOptions extends js.Object {
  var env: js.UndefOr[js.Object] = js.native
  var shutdownTimeout: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Double] = js.native
  var terminateTimeout: js.UndefOr[Double] = js.native
  var throttleDelay: js.UndefOr[Double] = js.native
}

object StartOptions {
  @scala.inline
  def apply(): StartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartOptions]
  }
  @scala.inline
  implicit class StartOptionsOps[Self <: StartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnv(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withShutdownTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdownTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShutdownTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdownTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminateTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminateTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminateTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminateTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottleDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttleDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottleDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttleDelay")(js.undefined)
        ret
    }
  }
  
}


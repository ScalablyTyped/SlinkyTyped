package typingsSlinky.workerFarm.mod

import typingsSlinky.node.childProcessMod.ForkOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FarmOptions extends js.Object {
  var autoStart: js.UndefOr[Boolean] = js.native
  var maxCallTime: js.UndefOr[Double] = js.native
  var maxCallsPerWorker: js.UndefOr[Double] = js.native
  var maxConcurrentCalls: js.UndefOr[Double] = js.native
  var maxConcurrentCallsPerWorker: js.UndefOr[Double] = js.native
  var maxConcurrentWorkers: js.UndefOr[Double] = js.native
  var maxRetries: js.UndefOr[Double] = js.native
  var workerOptions: js.UndefOr[ForkOptions] = js.native
}

object FarmOptions {
  @scala.inline
  def apply(): FarmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FarmOptions]
  }
  @scala.inline
  implicit class FarmOptionsOps[Self <: FarmOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStart")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxCallTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCallTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCallTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCallTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxCallsPerWorker(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCallsPerWorker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCallsPerWorker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCallsPerWorker")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConcurrentCalls(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrentCalls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConcurrentCalls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrentCalls")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConcurrentCallsPerWorker(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrentCallsPerWorker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConcurrentCallsPerWorker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrentCallsPerWorker")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConcurrentWorkers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrentWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConcurrentWorkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrentWorkers")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerOptions(value: ForkOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerOptions")(js.undefined)
        ret
    }
  }
  
}


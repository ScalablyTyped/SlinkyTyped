package typingsSlinky.webgme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearOldDataAtStartUp extends js.Object {
  /**
    * If true, all data stored for jobs 
    * (jobInfos, outputs, workerInfos, etc.) 
    * is cleared when the server starts.
    *   config.executor.clearOldDataAtStartUp = false;
    */
  var clearOldDataAtStartUp: Boolean = js.native
  /**
    * Time in milliseconds that output is stored after a job has finished.
    *   config.executor.clearOutputTimeout = 60000;
    */
  var clearOutputTimeout: Double = js.native
  /**
    *  If true will enable the executor.
    *   config.executor.enable = false;
    */
  var enable: Boolean = js.native
  /**
    * Path to configuration file for label jobs for the workers.
    *   config.executor.labelJobs = './labelJobs.json';
    */
  var labelJobs: String = js.native
  /**
    * If defined this is the secret shared between the server and attached workers.
    *   config.executor.nonce = null;
    */
  var nonce: Null | String = js.native
  /**
    * Time interval in milliseconds that attached 
    * workers will request jobs from the server.
    *   config.executor.workerRefreshInterval = 5000;
    */
  var workerRefreshInterval: Double = js.native
}

object ClearOldDataAtStartUp {
  @scala.inline
  def apply(
    clearOldDataAtStartUp: Boolean,
    clearOutputTimeout: Double,
    enable: Boolean,
    labelJobs: String,
    workerRefreshInterval: Double
  ): ClearOldDataAtStartUp = {
    val __obj = js.Dynamic.literal(clearOldDataAtStartUp = clearOldDataAtStartUp.asInstanceOf[js.Any], clearOutputTimeout = clearOutputTimeout.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], labelJobs = labelJobs.asInstanceOf[js.Any], workerRefreshInterval = workerRefreshInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearOldDataAtStartUp]
  }
  @scala.inline
  implicit class ClearOldDataAtStartUpOps[Self <: ClearOldDataAtStartUp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearOldDataAtStartUp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOldDataAtStartUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearOutputTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOutputTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelJobs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelJobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkerRefreshInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerRefreshInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(null)
        ret
    }
  }
  
}


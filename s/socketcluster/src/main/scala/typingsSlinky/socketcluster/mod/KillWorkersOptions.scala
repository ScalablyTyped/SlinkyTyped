package typingsSlinky.socketcluster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KillWorkersOptions extends js.Object {
  // Shut down the workers immediately without waiting for termination timeout.
  var immediate: js.UndefOr[Boolean] = js.native
  // Shut down the cluster master (load balancer) as well as all the workers.
  var killClusterMaster: js.UndefOr[Boolean] = js.native
}

object KillWorkersOptions {
  @scala.inline
  def apply(): KillWorkersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KillWorkersOptions]
  }
  @scala.inline
  implicit class KillWorkersOptionsOps[Self <: KillWorkersOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImmediate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmediate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediate")(js.undefined)
        ret
    }
    @scala.inline
    def withKillClusterMaster(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killClusterMaster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKillClusterMaster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killClusterMaster")(js.undefined)
        ret
    }
  }
  
}


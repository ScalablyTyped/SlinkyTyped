package typingsSlinky.web3ProviderEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Web3ProviderEngineOptions extends js.Object {
  var blockTracker: js.UndefOr[js.Any] = js.native
  var blockTrackerProvider: js.UndefOr[js.Any] = js.native
  var pollingInterval: js.UndefOr[Double] = js.native
}

object Web3ProviderEngineOptions {
  @scala.inline
  def apply(): Web3ProviderEngineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Web3ProviderEngineOptions]
  }
  @scala.inline
  implicit class Web3ProviderEngineOptionsOps[Self <: Web3ProviderEngineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockTracker(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockTracker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockTracker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockTracker")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockTrackerProvider(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockTrackerProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockTrackerProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockTrackerProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withPollingInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollingInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPollingInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollingInterval")(js.undefined)
        ret
    }
  }
  
}


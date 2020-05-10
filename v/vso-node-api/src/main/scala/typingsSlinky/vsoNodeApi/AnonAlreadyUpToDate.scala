package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlreadyUpToDate extends js.Object {
  var alreadyUpToDate: Double = js.native
  var inlineUpdateReceived: Double = js.native
  var installed: Double = js.native
  var preinstalled: Double = js.native
  var receivedInstallOrUpdate: Double = js.native
  var receivedUninstall: Double = js.native
  var requestedUpdate: Double = js.native
  var uninstalled: Double = js.native
  var updated: Double = js.native
}

object AnonAlreadyUpToDate {
  @scala.inline
  def apply(
    alreadyUpToDate: Double,
    inlineUpdateReceived: Double,
    installed: Double,
    preinstalled: Double,
    receivedInstallOrUpdate: Double,
    receivedUninstall: Double,
    requestedUpdate: Double,
    uninstalled: Double,
    updated: Double
  ): AnonAlreadyUpToDate = {
    val __obj = js.Dynamic.literal(alreadyUpToDate = alreadyUpToDate.asInstanceOf[js.Any], inlineUpdateReceived = inlineUpdateReceived.asInstanceOf[js.Any], installed = installed.asInstanceOf[js.Any], preinstalled = preinstalled.asInstanceOf[js.Any], receivedInstallOrUpdate = receivedInstallOrUpdate.asInstanceOf[js.Any], receivedUninstall = receivedUninstall.asInstanceOf[js.Any], requestedUpdate = requestedUpdate.asInstanceOf[js.Any], uninstalled = uninstalled.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlreadyUpToDate]
  }
  @scala.inline
  implicit class AnonAlreadyUpToDateOps[Self <: AnonAlreadyUpToDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlreadyUpToDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alreadyUpToDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInlineUpdateReceived(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineUpdateReceived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstalled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreinstalled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preinstalled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceivedInstallOrUpdate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivedInstallOrUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceivedUninstall(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivedUninstall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestedUpdate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUninstalled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstalled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


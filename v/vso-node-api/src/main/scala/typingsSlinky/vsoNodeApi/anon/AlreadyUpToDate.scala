package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlreadyUpToDate extends js.Object {
  var alreadyUpToDate: scala.Double = js.native
  var inlineUpdateReceived: scala.Double = js.native
  var installed: scala.Double = js.native
  var preinstalled: scala.Double = js.native
  var receivedInstallOrUpdate: scala.Double = js.native
  var receivedUninstall: scala.Double = js.native
  var requestedUpdate: scala.Double = js.native
  var uninstalled: scala.Double = js.native
  var updated: scala.Double = js.native
}

object AlreadyUpToDate {
  @scala.inline
  def apply(
    alreadyUpToDate: scala.Double,
    inlineUpdateReceived: scala.Double,
    installed: scala.Double,
    preinstalled: scala.Double,
    receivedInstallOrUpdate: scala.Double,
    receivedUninstall: scala.Double,
    requestedUpdate: scala.Double,
    uninstalled: scala.Double,
    updated: scala.Double
  ): AlreadyUpToDate = {
    val __obj = js.Dynamic.literal(alreadyUpToDate = alreadyUpToDate.asInstanceOf[js.Any], inlineUpdateReceived = inlineUpdateReceived.asInstanceOf[js.Any], installed = installed.asInstanceOf[js.Any], preinstalled = preinstalled.asInstanceOf[js.Any], receivedInstallOrUpdate = receivedInstallOrUpdate.asInstanceOf[js.Any], receivedUninstall = receivedUninstall.asInstanceOf[js.Any], requestedUpdate = requestedUpdate.asInstanceOf[js.Any], uninstalled = uninstalled.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlreadyUpToDate]
  }
  @scala.inline
  implicit class AlreadyUpToDateOps[Self <: AlreadyUpToDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlreadyUpToDate(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alreadyUpToDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInlineUpdateReceived(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineUpdateReceived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstalled(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreinstalled(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preinstalled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceivedInstallOrUpdate(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivedInstallOrUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceivedUninstall(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivedUninstall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestedUpdate(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUninstalled(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstalled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


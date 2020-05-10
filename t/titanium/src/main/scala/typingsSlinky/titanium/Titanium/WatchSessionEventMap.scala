package typingsSlinky.titanium.Titanium

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchSessionEventMap extends ProxyEventMap {
  var activationCompleted: WatchSessionActivationCompletedEvent = js.native
  var deactivate: WatchSessionDeactivateEvent = js.native
  var finishfiletransfer: WatchSessionFinishfiletransferEvent = js.native
  var finishuserinfotransfer: WatchSessionFinishuserinfotransferEvent = js.native
  var inactive: WatchSessionInactiveEvent = js.native
  var reachabilitychanged: WatchSessionReachabilitychangedEvent = js.native
  var receiveapplicationcontext: WatchSessionReceiveapplicationcontextEvent = js.native
  var receivefile: WatchSessionReceivefileEvent = js.native
  var receivemessage: WatchSessionReceivemessageEvent = js.native
  var receiveuserinfo: WatchSessionReceiveuserinfoEvent = js.native
  var watchstatechanged: WatchSessionWatchstatechangedEvent = js.native
}

object WatchSessionEventMap {
  @scala.inline
  def apply(
    activationCompleted: WatchSessionActivationCompletedEvent,
    deactivate: WatchSessionDeactivateEvent,
    finishfiletransfer: WatchSessionFinishfiletransferEvent,
    finishuserinfotransfer: WatchSessionFinishuserinfotransferEvent,
    inactive: WatchSessionInactiveEvent,
    reachabilitychanged: WatchSessionReachabilitychangedEvent,
    receiveapplicationcontext: WatchSessionReceiveapplicationcontextEvent,
    receivefile: WatchSessionReceivefileEvent,
    receivemessage: WatchSessionReceivemessageEvent,
    receiveuserinfo: WatchSessionReceiveuserinfoEvent,
    watchstatechanged: WatchSessionWatchstatechangedEvent
  ): WatchSessionEventMap = {
    val __obj = js.Dynamic.literal(activationCompleted = activationCompleted.asInstanceOf[js.Any], deactivate = deactivate.asInstanceOf[js.Any], finishfiletransfer = finishfiletransfer.asInstanceOf[js.Any], finishuserinfotransfer = finishuserinfotransfer.asInstanceOf[js.Any], inactive = inactive.asInstanceOf[js.Any], reachabilitychanged = reachabilitychanged.asInstanceOf[js.Any], receiveapplicationcontext = receiveapplicationcontext.asInstanceOf[js.Any], receivefile = receivefile.asInstanceOf[js.Any], receivemessage = receivemessage.asInstanceOf[js.Any], receiveuserinfo = receiveuserinfo.asInstanceOf[js.Any], watchstatechanged = watchstatechanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSessionEventMap]
  }
  @scala.inline
  implicit class WatchSessionEventMapOps[Self <: WatchSessionEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivationCompleted(value: WatchSessionActivationCompletedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activationCompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeactivate(value: WatchSessionDeactivateEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinishfiletransfer(value: WatchSessionFinishfiletransferEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishfiletransfer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinishuserinfotransfer(value: WatchSessionFinishuserinfotransferEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishuserinfotransfer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInactive(value: WatchSessionInactiveEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReachabilitychanged(value: WatchSessionReachabilitychangedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reachabilitychanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceiveapplicationcontext(value: WatchSessionReceiveapplicationcontextEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiveapplicationcontext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceivefile(value: WatchSessionReceivefileEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivefile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceivemessage(value: WatchSessionReceivemessageEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivemessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceiveuserinfo(value: WatchSessionReceiveuserinfoEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiveuserinfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatchstatechanged(value: WatchSessionWatchstatechangedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchstatechanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


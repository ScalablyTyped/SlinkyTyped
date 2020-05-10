package typingsSlinky.workboxWindow.workboxEventMapMod

import typingsSlinky.workboxWindow.workboxEventMod.WorkboxEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkboxEventMap extends js.Object {
  var activated: WorkboxUpdatableEvent = js.native
  var controlling: WorkboxEvent = js.native
  var externalactivated: WorkboxExtendableEvent = js.native
  var externalinstalled: WorkboxExtendableEvent = js.native
  var externalwaiting: WorkboxExtendableEvent = js.native
  var installed: WorkboxUpdatableEvent = js.native
  var message: WorkboxMessageEvent = js.native
  var redundant: WorkboxEvent = js.native
  var waiting: WorkboxWaitingEvent = js.native
}

object WorkboxEventMap {
  @scala.inline
  def apply(
    activated: WorkboxUpdatableEvent,
    controlling: WorkboxEvent,
    externalactivated: WorkboxExtendableEvent,
    externalinstalled: WorkboxExtendableEvent,
    externalwaiting: WorkboxExtendableEvent,
    installed: WorkboxUpdatableEvent,
    message: WorkboxMessageEvent,
    redundant: WorkboxEvent,
    waiting: WorkboxWaitingEvent
  ): WorkboxEventMap = {
    val __obj = js.Dynamic.literal(activated = activated.asInstanceOf[js.Any], controlling = controlling.asInstanceOf[js.Any], externalactivated = externalactivated.asInstanceOf[js.Any], externalinstalled = externalinstalled.asInstanceOf[js.Any], externalwaiting = externalwaiting.asInstanceOf[js.Any], installed = installed.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], redundant = redundant.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkboxEventMap]
  }
  @scala.inline
  implicit class WorkboxEventMapOps[Self <: WorkboxEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivated(value: WorkboxUpdatableEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControlling(value: WorkboxEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalactivated(value: WorkboxExtendableEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalactivated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalinstalled(value: WorkboxExtendableEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalinstalled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalwaiting(value: WorkboxExtendableEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalwaiting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstalled(value: WorkboxUpdatableEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: WorkboxMessageEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedundant(value: WorkboxEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redundant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaiting(value: WorkboxWaitingEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waiting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


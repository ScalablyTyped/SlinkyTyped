package typingsSlinky.slackMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance_ extends js.Object {
  var events: Events[_] = js.native
  var incomingWebhooks: IncomingWebhooks[_] = js.native
  var interactiveButtons: InteractiveButtons[_] = js.native
  var outgoingWebhooks: OutgoingWebhooks[_] = js.native
  var rtm: Rtm[_] = js.native
  var slashCommands: SlashCommands[_] = js.native
  var web: Web[_] = js.native
  def reset(): Unit = js.native
}

object Instance_ {
  @scala.inline
  def apply(
    events: Events[_],
    incomingWebhooks: IncomingWebhooks[_],
    interactiveButtons: InteractiveButtons[_],
    outgoingWebhooks: OutgoingWebhooks[_],
    reset: () => Unit,
    rtm: Rtm[_],
    slashCommands: SlashCommands[_],
    web: Web[_]
  ): Instance_ = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], incomingWebhooks = incomingWebhooks.asInstanceOf[js.Any], interactiveButtons = interactiveButtons.asInstanceOf[js.Any], outgoingWebhooks = outgoingWebhooks.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), rtm = rtm.asInstanceOf[js.Any], slashCommands = slashCommands.asInstanceOf[js.Any], web = web.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance_]
  }
  @scala.inline
  implicit class Instance_Ops[Self <: Instance_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: Events[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncomingWebhooks(value: IncomingWebhooks[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incomingWebhooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInteractiveButtons(value: InteractiveButtons[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactiveButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutgoingWebhooks(value: OutgoingWebhooks[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingWebhooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRtm(value: Rtm[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlashCommands(value: SlashCommands[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slashCommands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeb(value: Web[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.twitterForWeb

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for an object representing the event is passed to your JavaScript callback.
  */
@js.native
trait TwitterIntentEvent extends js.Object {
  /**
    * Key/value pairs relevant to the Web Intent just actioned.
    */
  var data: TwitterIntentEventData = js.native
  /**
    * Extended detail indicating where in a widget a user clicked. For example, button, count, or screen name portions of Tweet button or Follow button integrations, or tweet actions within embedded Tweets.
    */
  var region: String = js.native
  /**
    * The DOM node where the widget is instantiated. Most like an iframe, but may also be the original embed code element if the widget failed to initialize, or another sandboxed element. Use this value to differentiate between different intents or buttons on the same page.
    */
  var target: HTMLElement = js.native
  /**
    * The type of the event.
    */
  var `type`: String = js.native
}

object TwitterIntentEvent {
  @scala.inline
  def apply(data: TwitterIntentEventData, region: String, target: HTMLElement, `type`: String): TwitterIntentEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterIntentEvent]
  }
  @scala.inline
  implicit class TwitterIntentEventOps[Self <: TwitterIntentEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: TwitterIntentEventData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


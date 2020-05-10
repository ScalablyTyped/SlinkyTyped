package typingsSlinky.twitterForWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for Twitter for Websites.
  */
@js.native
trait Twitter extends TwitterLike {
  /**
    * Twitter events.
    */
  var events: TwitterEvents = js.native
  /**
    * Twitter widgets.
    */
  var widgets: TwitterWidgets = js.native
}

object Twitter {
  @scala.inline
  def apply(
    events: TwitterEvents,
    ready: js.Function1[/* twttr */ Twitter, Unit] => Unit,
    widgets: TwitterWidgets
  ): Twitter = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], ready = js.Any.fromFunction1(ready), widgets = widgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Twitter]
  }
  @scala.inline
  implicit class TwitterOps[Self <: Twitter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: TwitterEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidgets(value: TwitterWidgets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


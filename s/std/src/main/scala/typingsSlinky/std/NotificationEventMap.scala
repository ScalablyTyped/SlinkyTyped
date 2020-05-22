package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationEventMap extends js.Object {
  var click: org.scalajs.dom.raw.Event
  var close: org.scalajs.dom.raw.Event
  var error: org.scalajs.dom.raw.Event
  var show: org.scalajs.dom.raw.Event
}

object NotificationEventMap {
  @scala.inline
  def apply(
    click: org.scalajs.dom.raw.Event,
    close: org.scalajs.dom.raw.Event,
    error: org.scalajs.dom.raw.Event,
    show: org.scalajs.dom.raw.Event
  ): NotificationEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventMap]
  }
}


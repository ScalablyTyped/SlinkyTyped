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
  @scala.inline
  implicit class NotificationEventMapOps[Self <: NotificationEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClick(value: org.scalajs.dom.raw.Event): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setClose(value: org.scalajs.dom.raw.Event): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: org.scalajs.dom.raw.Event): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setShow(value: org.scalajs.dom.raw.Event): Self = this.set("show", value.asInstanceOf[js.Any])
  }
  
}


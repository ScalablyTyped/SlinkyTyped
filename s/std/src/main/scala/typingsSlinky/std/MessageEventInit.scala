package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageEventInit extends EventInit {
  var data: js.UndefOr[js.Any] = js.undefined
  var lastEventId: js.UndefOr[java.lang.String] = js.undefined
  var origin: js.UndefOr[java.lang.String] = js.undefined
  var ports: js.UndefOr[js.Array[org.scalajs.dom.raw.MessagePort]] = js.undefined
  var source: js.UndefOr[MessageEventSource | Null] = js.undefined
}

object MessageEventInit {
  @scala.inline
  def apply(): MessageEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageEventInit]
  }
  @scala.inline
  implicit class MessageEventInitOps[Self <: MessageEventInit] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setLastEventId(value: java.lang.String): Self = this.set("lastEventId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastEventId: Self = this.set("lastEventId", js.undefined)
    @scala.inline
    def setOrigin(value: java.lang.String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setPorts(value: js.Array[org.scalajs.dom.raw.MessagePort]): Self = this.set("ports", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePorts: Self = this.set("ports", js.undefined)
    @scala.inline
    def setSourceServiceWorker(value: org.scalajs.dom.experimental.serviceworkers.ServiceWorker): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceMessagePort(value: org.scalajs.dom.raw.MessagePort): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceWindow(value: org.scalajs.dom.raw.Window): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: MessageEventSource): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setSourceNull: Self = this.set("source", null)
  }
  
}


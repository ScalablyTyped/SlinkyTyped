package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDBDatabaseEventMap extends js.Object {
  var abort: org.scalajs.dom.raw.Event
  var close: org.scalajs.dom.raw.Event
  var error: org.scalajs.dom.raw.Event
  var versionchange: org.scalajs.dom.raw.IDBVersionChangeEvent
}

object IDBDatabaseEventMap {
  @scala.inline
  def apply(
    abort: org.scalajs.dom.raw.Event,
    close: org.scalajs.dom.raw.Event,
    error: org.scalajs.dom.raw.Event,
    versionchange: org.scalajs.dom.raw.IDBVersionChangeEvent
  ): IDBDatabaseEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], versionchange = versionchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBDatabaseEventMap]
  }
  @scala.inline
  implicit class IDBDatabaseEventMapOps[Self <: IDBDatabaseEventMap] (val x: Self) extends AnyVal {
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
    def setAbort(value: org.scalajs.dom.raw.Event): Self = this.set("abort", value.asInstanceOf[js.Any])
    @scala.inline
    def setClose(value: org.scalajs.dom.raw.Event): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: org.scalajs.dom.raw.Event): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionchange(value: org.scalajs.dom.raw.IDBVersionChangeEvent): Self = this.set("versionchange", value.asInstanceOf[js.Any])
  }
  
}


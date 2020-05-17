package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBDatabaseEventMap extends js.Object {
  var abort: org.scalajs.dom.raw.Event = js.native
  var close: org.scalajs.dom.raw.Event = js.native
  var error: org.scalajs.dom.raw.Event = js.native
  var versionchange: org.scalajs.dom.raw.IDBVersionChangeEvent = js.native
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
    def withAbort(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionchange(value: org.scalajs.dom.raw.IDBVersionChangeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionchange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


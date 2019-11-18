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
}


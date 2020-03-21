package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDBDatabaseEventMap extends js.Object {
  var abort: Event_
  var close: Event_
  var error: Event_
  var versionchange: org.scalajs.dom.raw.IDBVersionChangeEvent
}

object IDBDatabaseEventMap {
  @scala.inline
  def apply(
    abort: Event_,
    close: Event_,
    error: Event_,
    versionchange: org.scalajs.dom.raw.IDBVersionChangeEvent
  ): IDBDatabaseEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], versionchange = versionchange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDBDatabaseEventMap]
  }
}


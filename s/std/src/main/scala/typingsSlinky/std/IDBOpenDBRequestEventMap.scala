package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDBOpenDBRequestEventMap extends IDBRequestEventMap {
  var blocked: org.scalajs.dom.raw.Event
  var upgradeneeded: org.scalajs.dom.raw.IDBVersionChangeEvent
}

object IDBOpenDBRequestEventMap {
  @scala.inline
  def apply(
    blocked: org.scalajs.dom.raw.Event,
    error: org.scalajs.dom.raw.Event,
    success: org.scalajs.dom.raw.Event,
    upgradeneeded: org.scalajs.dom.raw.IDBVersionChangeEvent
  ): IDBOpenDBRequestEventMap = {
    val __obj = js.Dynamic.literal(blocked = blocked.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], upgradeneeded = upgradeneeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBOpenDBRequestEventMap]
  }
}


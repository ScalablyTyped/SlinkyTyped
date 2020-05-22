package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDBTransactionEventMap extends js.Object {
  var abort: org.scalajs.dom.raw.Event
  var complete: org.scalajs.dom.raw.Event
  var error: org.scalajs.dom.raw.Event
}

object IDBTransactionEventMap {
  @scala.inline
  def apply(
    abort: org.scalajs.dom.raw.Event,
    complete: org.scalajs.dom.raw.Event,
    error: org.scalajs.dom.raw.Event
  ): IDBTransactionEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBTransactionEventMap]
  }
}


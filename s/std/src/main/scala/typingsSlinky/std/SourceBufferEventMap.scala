package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceBufferEventMap extends js.Object {
  var abort: org.scalajs.dom.raw.Event
  var error: org.scalajs.dom.raw.Event
  var update: org.scalajs.dom.raw.Event
  var updateend: org.scalajs.dom.raw.Event
  var updatestart: org.scalajs.dom.raw.Event
}

object SourceBufferEventMap {
  @scala.inline
  def apply(
    abort: org.scalajs.dom.raw.Event,
    error: org.scalajs.dom.raw.Event,
    update: org.scalajs.dom.raw.Event,
    updateend: org.scalajs.dom.raw.Event,
    updatestart: org.scalajs.dom.raw.Event
  ): SourceBufferEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateend = updateend.asInstanceOf[js.Any], updatestart = updatestart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceBufferEventMap]
  }
}


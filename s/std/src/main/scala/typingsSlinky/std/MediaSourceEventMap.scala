package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaSourceEventMap extends js.Object {
  var sourceclose: org.scalajs.dom.raw.Event
  var sourceended: org.scalajs.dom.raw.Event
  var sourceopen: org.scalajs.dom.raw.Event
}

object MediaSourceEventMap {
  @scala.inline
  def apply(
    sourceclose: org.scalajs.dom.raw.Event,
    sourceended: org.scalajs.dom.raw.Event,
    sourceopen: org.scalajs.dom.raw.Event
  ): MediaSourceEventMap = {
    val __obj = js.Dynamic.literal(sourceclose = sourceclose.asInstanceOf[js.Any], sourceended = sourceended.asInstanceOf[js.Any], sourceopen = sourceopen.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSourceEventMap]
  }
}


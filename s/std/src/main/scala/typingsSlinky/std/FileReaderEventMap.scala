package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileReaderEventMap extends js.Object {
  var abort: org.scalajs.dom.raw.ProgressEvent
  var error: org.scalajs.dom.raw.ProgressEvent
  var load: org.scalajs.dom.raw.ProgressEvent
  var loadend: org.scalajs.dom.raw.ProgressEvent
  var loadstart: org.scalajs.dom.raw.ProgressEvent
  var progress: org.scalajs.dom.raw.ProgressEvent
}

object FileReaderEventMap {
  @scala.inline
  def apply(
    abort: org.scalajs.dom.raw.ProgressEvent,
    error: org.scalajs.dom.raw.ProgressEvent,
    load: org.scalajs.dom.raw.ProgressEvent,
    loadend: org.scalajs.dom.raw.ProgressEvent,
    loadstart: org.scalajs.dom.raw.ProgressEvent,
    progress: org.scalajs.dom.raw.ProgressEvent
  ): FileReaderEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileReaderEventMap]
  }
}


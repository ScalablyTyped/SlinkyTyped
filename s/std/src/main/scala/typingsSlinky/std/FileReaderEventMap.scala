package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileReaderEventMap extends js.Object {
  var abort: org.scalajs.dom.raw.ProgressEvent = js.native
  var error: org.scalajs.dom.raw.ProgressEvent = js.native
  var load: org.scalajs.dom.raw.ProgressEvent = js.native
  var loadend: org.scalajs.dom.raw.ProgressEvent = js.native
  var loadstart: org.scalajs.dom.raw.ProgressEvent = js.native
  var progress: org.scalajs.dom.raw.ProgressEvent = js.native
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
  @scala.inline
  implicit class FileReaderEventMapOps[Self <: FileReaderEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: org.scalajs.dom.raw.ProgressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: org.scalajs.dom.raw.ProgressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoad(value: org.scalajs.dom.raw.ProgressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadend(value: org.scalajs.dom.raw.ProgressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadstart(value: org.scalajs.dom.raw.ProgressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: org.scalajs.dom.raw.ProgressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


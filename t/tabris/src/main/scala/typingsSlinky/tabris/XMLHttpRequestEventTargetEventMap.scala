package typingsSlinky.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLHttpRequestEventTargetEventMap extends js.Object {
  var abort: Event = js.native
  var error: ErrorEvent = js.native
  var load: Event = js.native
  var loadend: ProgressEvent = js.native
  var loadstart: Event = js.native
  var progress: ProgressEvent = js.native
  var timeout: ProgressEvent = js.native
}

object XMLHttpRequestEventTargetEventMap {
  @scala.inline
  def apply(
    abort: Event,
    error: ErrorEvent,
    load: Event,
    loadend: ProgressEvent,
    loadstart: Event,
    progress: ProgressEvent,
    timeout: ProgressEvent
  ): XMLHttpRequestEventTargetEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLHttpRequestEventTargetEventMap]
  }
  @scala.inline
  implicit class XMLHttpRequestEventTargetEventMapOps[Self <: XMLHttpRequestEventTargetEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: ErrorEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoad(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadend(value: ProgressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadstart(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: ProgressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: ProgressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


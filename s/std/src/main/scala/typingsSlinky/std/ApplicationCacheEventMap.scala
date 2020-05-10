package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationCacheEventMap extends js.Object {
  var cached: Event_ = js.native
  var checking: Event_ = js.native
  var downloading: Event_ = js.native
  var error: Event_ = js.native
  var noupdate: Event_ = js.native
  var obsolete: Event_ = js.native
  var progress: org.scalajs.dom.raw.ProgressEvent = js.native
  var updateready: Event_ = js.native
}

object ApplicationCacheEventMap {
  @scala.inline
  def apply(
    cached: Event_,
    checking: Event_,
    downloading: Event_,
    error: Event_,
    noupdate: Event_,
    obsolete: Event_,
    progress: org.scalajs.dom.raw.ProgressEvent,
    updateready: Event_
  ): ApplicationCacheEventMap = {
    val __obj = js.Dynamic.literal(cached = cached.asInstanceOf[js.Any], checking = checking.asInstanceOf[js.Any], downloading = downloading.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], noupdate = noupdate.asInstanceOf[js.Any], obsolete = obsolete.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], updateready = updateready.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationCacheEventMap]
  }
  @scala.inline
  implicit class ApplicationCacheEventMapOps[Self <: ApplicationCacheEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCached(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChecking(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloading(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoupdate(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noupdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObsolete(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obsolete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: org.scalajs.dom.raw.ProgressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateready(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateready")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


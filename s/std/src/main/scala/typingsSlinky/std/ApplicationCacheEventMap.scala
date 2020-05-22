package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationCacheEventMap extends js.Object {
  var cached: org.scalajs.dom.raw.Event
  var checking: org.scalajs.dom.raw.Event
  var downloading: org.scalajs.dom.raw.Event
  var error: org.scalajs.dom.raw.Event
  var noupdate: org.scalajs.dom.raw.Event
  var obsolete: org.scalajs.dom.raw.Event
  var progress: org.scalajs.dom.raw.ProgressEvent
  var updateready: org.scalajs.dom.raw.Event
}

object ApplicationCacheEventMap {
  @scala.inline
  def apply(
    cached: org.scalajs.dom.raw.Event,
    checking: org.scalajs.dom.raw.Event,
    downloading: org.scalajs.dom.raw.Event,
    error: org.scalajs.dom.raw.Event,
    noupdate: org.scalajs.dom.raw.Event,
    obsolete: org.scalajs.dom.raw.Event,
    progress: org.scalajs.dom.raw.ProgressEvent,
    updateready: org.scalajs.dom.raw.Event
  ): ApplicationCacheEventMap = {
    val __obj = js.Dynamic.literal(cached = cached.asInstanceOf[js.Any], checking = checking.asInstanceOf[js.Any], downloading = downloading.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], noupdate = noupdate.asInstanceOf[js.Any], obsolete = obsolete.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], updateready = updateready.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationCacheEventMap]
  }
}


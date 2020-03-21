package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OfflineAudioContextEventMap extends BaseAudioContextEventMap {
  var complete: org.scalajs.dom.raw.OfflineAudioCompletionEvent
}

object OfflineAudioContextEventMap {
  @scala.inline
  def apply(complete: org.scalajs.dom.raw.OfflineAudioCompletionEvent, statechange: Event_): OfflineAudioContextEventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OfflineAudioContextEventMap]
  }
}


package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaStreamEventMap extends js.Object {
  
  var addtrack: org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent = js.native
  
  var removetrack: org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent = js.native
}
object MediaStreamEventMap {
  
  @scala.inline
  def apply(
    addtrack: org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent,
    removetrack: org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent
  ): MediaStreamEventMap = {
    val __obj = js.Dynamic.literal(addtrack = addtrack.asInstanceOf[js.Any], removetrack = removetrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamEventMap]
  }
  
  @scala.inline
  implicit class MediaStreamEventMapOps[Self <: MediaStreamEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddtrack(value: org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent): Self = this.set("addtrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovetrack(value: org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent): Self = this.set("removetrack", value.asInstanceOf[js.Any])
  }
}

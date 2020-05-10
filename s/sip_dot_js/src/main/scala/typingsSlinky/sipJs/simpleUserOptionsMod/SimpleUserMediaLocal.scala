package typingsSlinky.sipJs.simpleUserOptionsMod

import org.scalajs.dom.raw.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleUserMediaLocal extends js.Object {
  /** The local video media stream is attached to this element. */
  var video: js.UndefOr[HTMLVideoElement] = js.native
}

object SimpleUserMediaLocal {
  @scala.inline
  def apply(): SimpleUserMediaLocal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleUserMediaLocal]
  }
  @scala.inline
  implicit class SimpleUserMediaLocalOps[Self <: SimpleUserMediaLocal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVideo(value: HTMLVideoElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(js.undefined)
        ret
    }
  }
  
}


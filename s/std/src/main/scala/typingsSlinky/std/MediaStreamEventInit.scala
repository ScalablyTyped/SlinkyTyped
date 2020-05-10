package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStreamEventInit extends EventInit {
  var stream: js.UndefOr[org.scalajs.dom.experimental.mediastream.MediaStream] = js.native
}

object MediaStreamEventInit {
  @scala.inline
  def apply(): MediaStreamEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaStreamEventInit]
  }
  @scala.inline
  implicit class MediaStreamEventInitOps[Self <: MediaStreamEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStream(value: org.scalajs.dom.experimental.mediastream.MediaStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(js.undefined)
        ret
    }
  }
  
}


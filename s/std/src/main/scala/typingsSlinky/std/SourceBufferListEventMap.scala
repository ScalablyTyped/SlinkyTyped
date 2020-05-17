package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceBufferListEventMap extends js.Object {
  var addsourcebuffer: org.scalajs.dom.raw.Event = js.native
  var removesourcebuffer: org.scalajs.dom.raw.Event = js.native
}

object SourceBufferListEventMap {
  @scala.inline
  def apply(addsourcebuffer: org.scalajs.dom.raw.Event, removesourcebuffer: org.scalajs.dom.raw.Event): SourceBufferListEventMap = {
    val __obj = js.Dynamic.literal(addsourcebuffer = addsourcebuffer.asInstanceOf[js.Any], removesourcebuffer = removesourcebuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceBufferListEventMap]
  }
  @scala.inline
  implicit class SourceBufferListEventMapOps[Self <: SourceBufferListEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddsourcebuffer(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addsourcebuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemovesourcebuffer(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removesourcebuffer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


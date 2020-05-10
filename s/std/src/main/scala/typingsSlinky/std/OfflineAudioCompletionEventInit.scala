package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfflineAudioCompletionEventInit extends EventInit {
  var renderedBuffer: org.scalajs.dom.raw.AudioBuffer = js.native
}

object OfflineAudioCompletionEventInit {
  @scala.inline
  def apply(renderedBuffer: org.scalajs.dom.raw.AudioBuffer): OfflineAudioCompletionEventInit = {
    val __obj = js.Dynamic.literal(renderedBuffer = renderedBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineAudioCompletionEventInit]
  }
  @scala.inline
  implicit class OfflineAudioCompletionEventInitOps[Self <: OfflineAudioCompletionEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderedBuffer(value: org.scalajs.dom.raw.AudioBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedBuffer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.wegameApi.anon

import typingsSlinky.wegameApi.wx.types.AudioSourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioSources extends js.Object {
  /**
    * 音频输入源，每一项对应一种音频输入源
    */
  var audioSources: js.Array[AudioSourceType] = js.native
}

object AudioSources {
  @scala.inline
  def apply(audioSources: js.Array[AudioSourceType]): AudioSources = {
    val __obj = js.Dynamic.literal(audioSources = audioSources.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioSources]
  }
  @scala.inline
  implicit class AudioSourcesOps[Self <: AudioSources] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioSources(value: js.Array[AudioSourceType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioSources")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


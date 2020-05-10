package typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** AudioResources. */
@js.native
trait AudioResources extends js.Object {
  /** An array of `AudioResource` objects that provides information about the audio resources of the custom acoustic model. The array is empty if the custom model has no audio resources. */
  var audio: js.Array[AudioResource] = js.native
  /** The total minutes of accumulated audio summed over all of the valid audio resources for the custom acoustic model. You can use this value to determine whether the custom model has too little or too much audio to begin training. */
  var total_minutes_of_audio: Double = js.native
}

object AudioResources {
  @scala.inline
  def apply(audio: js.Array[AudioResource], total_minutes_of_audio: Double): AudioResources = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], total_minutes_of_audio = total_minutes_of_audio.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioResources]
  }
  @scala.inline
  implicit class AudioResourcesOps[Self <: AudioResources] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudio(value: js.Array[AudioResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_minutes_of_audio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_minutes_of_audio")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


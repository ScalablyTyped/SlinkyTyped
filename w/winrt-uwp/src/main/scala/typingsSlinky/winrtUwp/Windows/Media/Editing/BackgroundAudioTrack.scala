package typingsSlinky.winrtUwp.Windows.Media.Editing

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMap
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Media.Effects.IAudioEffectDefinition
import typingsSlinky.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single audio track for accompanying a video clip. */
@js.native
trait BackgroundAudioTrack extends js.Object {
  /** Gets the list of audio effect definitions for processing the background audio track. */
  var audioEffectDefinitions: IVector[IAudioEffectDefinition] = js.native
  /** Specifies how long to wait before starting background audio playback. */
  var delay: Double = js.native
  /** Original playback time of the background audio track, without the effects of the TrimTimeFromStart and TrimTimeFromEnd properties. */
  var originalDuration: Double = js.native
  /** The amount of time to trim from the end of the background audio track. */
  var trimTimeFromEnd: Double = js.native
  /** The amount of time to trim from the beginning of the background audio track. */
  var trimTimeFromStart: Double = js.native
  /** Duration of the background audio track with TrimTimeFromStart and TrimTimeFromEnd applied to playback. */
  var trimmedDuration: Double = js.native
  /** An associative collection for storing custom properties associated with the background audio track. */
  var userData: IMap[String, String] = js.native
  /** Gets or sets the volume of the background audio track. */
  var volume: Double = js.native
  /**
    * Gets the AudioEncodingProperties for the background audio track.
    * @return The AudioEncodingProperties for the background audio track.
    */
  def getAudioEncodingProperties(): AudioEncodingProperties = js.native
}

object BackgroundAudioTrack {
  @scala.inline
  def apply(
    audioEffectDefinitions: IVector[IAudioEffectDefinition],
    delay: Double,
    getAudioEncodingProperties: () => AudioEncodingProperties,
    originalDuration: Double,
    trimTimeFromEnd: Double,
    trimTimeFromStart: Double,
    trimmedDuration: Double,
    userData: IMap[String, String],
    volume: Double
  ): BackgroundAudioTrack = {
    val __obj = js.Dynamic.literal(audioEffectDefinitions = audioEffectDefinitions.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], getAudioEncodingProperties = js.Any.fromFunction0(getAudioEncodingProperties), originalDuration = originalDuration.asInstanceOf[js.Any], trimTimeFromEnd = trimTimeFromEnd.asInstanceOf[js.Any], trimTimeFromStart = trimTimeFromStart.asInstanceOf[js.Any], trimmedDuration = trimmedDuration.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundAudioTrack]
  }
  @scala.inline
  implicit class BackgroundAudioTrackOps[Self <: BackgroundAudioTrack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioEffectDefinitions(value: IVector[IAudioEffectDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioEffectDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAudioEncodingProperties(value: () => AudioEncodingProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAudioEncodingProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOriginalDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrimTimeFromEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimTimeFromEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrimTimeFromStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimTimeFromStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrimmedDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimmedDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserData(value: IMap[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.winrtUwp.Windows.Media.Audio

import typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typingsSlinky.winrtUwp.Windows.Media.AudioProcessing
import typingsSlinky.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import typingsSlinky.winrtUwp.Windows.Media.Render.AudioRenderCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents initialization settings for an audio graph. Set the properties of this object to your desired values and then call AudioGraph::CreateAsync to create a new audio graph instance with the specified settings. */
@js.native
trait AudioGraphSettings extends js.Object {
  /** Gets or sets a value that indicates the audio render category setting for the audio graph. */
  var audioRenderCategory: AudioRenderCategory = js.native
  /** Gets or sets a value that indicates the desired audio processing mode setting for the audio graph. */
  var desiredRenderDeviceAudioProcessing: AudioProcessing = js.native
  /** Gets or sets the desired number of samples per quantum defined for the audio graph. */
  var desiredSamplesPerQuantum: Double = js.native
  /** Gets or sets the audio encoding properties setting for the audio graph. */
  var encodingProperties: AudioEncodingProperties = js.native
  /** Gets or sets an object that represents the primary render device for the audio graph. */
  var primaryRenderDevice: DeviceInformation = js.native
  /** Gets or sets the quantum size selection mode for the audio graph. */
  var quantumSizeSelectionMode: QuantumSizeSelectionMode = js.native
}

object AudioGraphSettings {
  @scala.inline
  def apply(
    audioRenderCategory: AudioRenderCategory,
    desiredRenderDeviceAudioProcessing: AudioProcessing,
    desiredSamplesPerQuantum: Double,
    encodingProperties: AudioEncodingProperties,
    primaryRenderDevice: DeviceInformation,
    quantumSizeSelectionMode: QuantumSizeSelectionMode
  ): AudioGraphSettings = {
    val __obj = js.Dynamic.literal(audioRenderCategory = audioRenderCategory.asInstanceOf[js.Any], desiredRenderDeviceAudioProcessing = desiredRenderDeviceAudioProcessing.asInstanceOf[js.Any], desiredSamplesPerQuantum = desiredSamplesPerQuantum.asInstanceOf[js.Any], encodingProperties = encodingProperties.asInstanceOf[js.Any], primaryRenderDevice = primaryRenderDevice.asInstanceOf[js.Any], quantumSizeSelectionMode = quantumSizeSelectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioGraphSettings]
  }
  @scala.inline
  implicit class AudioGraphSettingsOps[Self <: AudioGraphSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioRenderCategory(value: AudioRenderCategory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioRenderCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesiredRenderDeviceAudioProcessing(value: AudioProcessing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredRenderDeviceAudioProcessing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesiredSamplesPerQuantum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredSamplesPerQuantum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncodingProperties(value: AudioEncodingProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodingProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryRenderDevice(value: DeviceInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryRenderDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuantumSizeSelectionMode(value: QuantumSizeSelectionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantumSizeSelectionMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


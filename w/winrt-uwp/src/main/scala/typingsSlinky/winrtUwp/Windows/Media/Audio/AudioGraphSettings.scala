package typingsSlinky.winrtUwp.Windows.Media.Audio

import typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typingsSlinky.winrtUwp.Windows.Media.AudioProcessing
import typingsSlinky.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import typingsSlinky.winrtUwp.Windows.Media.Render.AudioRenderCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents initialization settings for an audio graph. Set the properties of this object to your desired values and then call AudioGraph::CreateAsync to create a new audio graph instance with the specified settings. */
@js.native
trait AudioGraphSettings extends StObject {
  
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
  implicit class AudioGraphSettingsMutableBuilder[Self <: AudioGraphSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioRenderCategory(value: AudioRenderCategory): Self = StObject.set(x, "audioRenderCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredRenderDeviceAudioProcessing(value: AudioProcessing): Self = StObject.set(x, "desiredRenderDeviceAudioProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredSamplesPerQuantum(value: Double): Self = StObject.set(x, "desiredSamplesPerQuantum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingProperties(value: AudioEncodingProperties): Self = StObject.set(x, "encodingProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryRenderDevice(value: DeviceInformation): Self = StObject.set(x, "primaryRenderDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantumSizeSelectionMode(value: QuantumSizeSelectionMode): Self = StObject.set(x, "quantumSizeSelectionMode", value.asInstanceOf[js.Any])
  }
}

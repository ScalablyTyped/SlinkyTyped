package typingsSlinky.winrtUwp.Windows.Media.Audio

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a reverberation effect definition supported by the audio graph. */
@js.native
trait ReverbEffectDefinition extends StObject {
  
  /** Gets the activatable class ID for the reverberation effect definition object. */
  var activatableClassId: String = js.native
  
  /** Gets or sets the decay time supported by the reverberation effect definition. */
  var decayTime: Double = js.native
  
  /** Gets or sets the density included in the reverberation effect definition. */
  var density: Double = js.native
  
  /** Gets or sets a value indicating if the reverberation effect disables late fields. */
  var disableLateField: Boolean = js.native
  
  /** Gets or sets the early diffusion value for the reverberation effect definition. */
  var earlyDiffusion: Double = js.native
  
  /** Gets or sets the high equalization cutoff included in the reverberation effect definition. */
  var highEQCutoff: Double = js.native
  
  /** Gets or sets the high equalization gain included in the reverberation effect definition. */
  var highEQGain: Double = js.native
  
  /** Gets or sets the late diffusion included in the reverberation effect definition. */
  var lateDiffusion: Double = js.native
  
  /** Gets or sets the low equalization cutoff included in the reverberation effect definition. */
  var lowEQCutoff: Double = js.native
  
  /** Gets or sets the low equalization gain included in the reverberation effect definition. */
  var lowEQGain: Double = js.native
  
  /** Gets or sets the position left included in the reverberation effect definition. */
  var positionLeft: Double = js.native
  
  /** Gets or sets the matrix position left included in the reverberation effect definition. */
  var positionMatrixLeft: Double = js.native
  
  /** Gets or sets the matrix position right included in the reverberation effect definition. */
  var positionMatrixRight: Double = js.native
  
  /** Gets or sets the position right included in the reverberation effect definition. */
  var positionRight: Double = js.native
  
  /** Gets the properties supported by the reverberation effect definition. */
  var properties: IPropertySet = js.native
  
  /** Gets or sets the rear delay included in the reverberation effect definition. */
  var rearDelay: Double = js.native
  
  /** Gets or sets the reflections delay included in the reverberation effect definition. */
  var reflectionsDelay: Double = js.native
  
  /** Gets or sets the reflections gain included in the reverberation effect definition. */
  var reflectionsGain: Double = js.native
  
  /** Gets or sets the reverberation delay included in the reverberation effect definition. */
  var reverbDelay: Double = js.native
  
  /** Gets or sets the reverberation gain included in the reverberation effect definition. */
  var reverbGain: Double = js.native
  
  /** Gets or sets the room filter frequency included in the reverberation effect definition. */
  var roomFilterFreq: Double = js.native
  
  /** Gets or sets the room filter high frequency included in the reverberation effect definition. */
  var roomFilterHF: Double = js.native
  
  /** Gets or sets the main room filter included in the reverberation effect definition. */
  var roomFilterMain: Double = js.native
  
  /** Gets or sets the room size included in the reverberation effect definition. */
  var roomSize: Double = js.native
  
  /** Gets or sets the wet-dry audio voice mix for the reverberation effect definition. */
  var wetDryMix: Double = js.native
}
object ReverbEffectDefinition {
  
  @scala.inline
  def apply(
    activatableClassId: String,
    decayTime: Double,
    density: Double,
    disableLateField: Boolean,
    earlyDiffusion: Double,
    highEQCutoff: Double,
    highEQGain: Double,
    lateDiffusion: Double,
    lowEQCutoff: Double,
    lowEQGain: Double,
    positionLeft: Double,
    positionMatrixLeft: Double,
    positionMatrixRight: Double,
    positionRight: Double,
    properties: IPropertySet,
    rearDelay: Double,
    reflectionsDelay: Double,
    reflectionsGain: Double,
    reverbDelay: Double,
    reverbGain: Double,
    roomFilterFreq: Double,
    roomFilterHF: Double,
    roomFilterMain: Double,
    roomSize: Double,
    wetDryMix: Double
  ): ReverbEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], decayTime = decayTime.asInstanceOf[js.Any], density = density.asInstanceOf[js.Any], disableLateField = disableLateField.asInstanceOf[js.Any], earlyDiffusion = earlyDiffusion.asInstanceOf[js.Any], highEQCutoff = highEQCutoff.asInstanceOf[js.Any], highEQGain = highEQGain.asInstanceOf[js.Any], lateDiffusion = lateDiffusion.asInstanceOf[js.Any], lowEQCutoff = lowEQCutoff.asInstanceOf[js.Any], lowEQGain = lowEQGain.asInstanceOf[js.Any], positionLeft = positionLeft.asInstanceOf[js.Any], positionMatrixLeft = positionMatrixLeft.asInstanceOf[js.Any], positionMatrixRight = positionMatrixRight.asInstanceOf[js.Any], positionRight = positionRight.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rearDelay = rearDelay.asInstanceOf[js.Any], reflectionsDelay = reflectionsDelay.asInstanceOf[js.Any], reflectionsGain = reflectionsGain.asInstanceOf[js.Any], reverbDelay = reverbDelay.asInstanceOf[js.Any], reverbGain = reverbGain.asInstanceOf[js.Any], roomFilterFreq = roomFilterFreq.asInstanceOf[js.Any], roomFilterHF = roomFilterHF.asInstanceOf[js.Any], roomFilterMain = roomFilterMain.asInstanceOf[js.Any], roomSize = roomSize.asInstanceOf[js.Any], wetDryMix = wetDryMix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverbEffectDefinition]
  }
  
  @scala.inline
  implicit class ReverbEffectDefinitionMutableBuilder[Self <: ReverbEffectDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivatableClassId(value: String): Self = StObject.set(x, "activatableClassId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecayTime(value: Double): Self = StObject.set(x, "decayTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableLateField(value: Boolean): Self = StObject.set(x, "disableLateField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEarlyDiffusion(value: Double): Self = StObject.set(x, "earlyDiffusion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighEQCutoff(value: Double): Self = StObject.set(x, "highEQCutoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighEQGain(value: Double): Self = StObject.set(x, "highEQGain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLateDiffusion(value: Double): Self = StObject.set(x, "lateDiffusion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowEQCutoff(value: Double): Self = StObject.set(x, "lowEQCutoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowEQGain(value: Double): Self = StObject.set(x, "lowEQGain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionLeft(value: Double): Self = StObject.set(x, "positionLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionMatrixLeft(value: Double): Self = StObject.set(x, "positionMatrixLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionMatrixRight(value: Double): Self = StObject.set(x, "positionMatrixRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionRight(value: Double): Self = StObject.set(x, "positionRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: IPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRearDelay(value: Double): Self = StObject.set(x, "rearDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReflectionsDelay(value: Double): Self = StObject.set(x, "reflectionsDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReflectionsGain(value: Double): Self = StObject.set(x, "reflectionsGain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverbDelay(value: Double): Self = StObject.set(x, "reverbDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverbGain(value: Double): Self = StObject.set(x, "reverbGain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomFilterFreq(value: Double): Self = StObject.set(x, "roomFilterFreq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomFilterHF(value: Double): Self = StObject.set(x, "roomFilterHF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomFilterMain(value: Double): Self = StObject.set(x, "roomFilterMain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomSize(value: Double): Self = StObject.set(x, "roomSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWetDryMix(value: Double): Self = StObject.set(x, "wetDryMix", value.asInstanceOf[js.Any])
  }
}

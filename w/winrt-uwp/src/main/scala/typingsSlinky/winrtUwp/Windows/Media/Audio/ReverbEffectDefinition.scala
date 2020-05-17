package typingsSlinky.winrtUwp.Windows.Media.Audio

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a reverberation effect definition supported by the audio graph. */
@js.native
trait ReverbEffectDefinition extends js.Object {
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
  implicit class ReverbEffectDefinitionOps[Self <: ReverbEffectDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivatableClassId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activatableClassId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecayTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decayTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("density")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableLateField(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableLateField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEarlyDiffusion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earlyDiffusion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighEQCutoff(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highEQCutoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighEQGain(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highEQGain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLateDiffusion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lateDiffusion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLowEQCutoff(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowEQCutoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLowEQGain(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowEQGain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionMatrixLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionMatrixLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionMatrixRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionMatrixRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: IPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRearDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rearDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReflectionsDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reflectionsDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReflectionsGain(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reflectionsGain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReverbDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverbDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReverbGain(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverbGain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoomFilterFreq(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomFilterFreq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoomFilterHF(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomFilterHF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoomFilterMain(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomFilterMain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoomSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWetDryMix(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wetDryMix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


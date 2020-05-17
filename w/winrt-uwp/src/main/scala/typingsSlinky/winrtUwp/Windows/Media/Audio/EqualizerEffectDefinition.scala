package typingsSlinky.winrtUwp.Windows.Media.Audio

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an equalizer effect definition supported by the audio graph. */
@js.native
trait EqualizerEffectDefinition extends js.Object {
  /** Gets the activatable class ID for the equalizer effect definition object. */
  var activatableClassId: String = js.native
  /** Gets the bands included in the equalizer effect definition. */
  var bands: IVectorView[EqualizerBand] = js.native
  /** Gets the properties supported by the equalizer effect definition. */
  var properties: IPropertySet = js.native
}

object EqualizerEffectDefinition {
  @scala.inline
  def apply(activatableClassId: String, bands: IVectorView[EqualizerBand], properties: IPropertySet): EqualizerEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], bands = bands.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[EqualizerEffectDefinition]
  }
  @scala.inline
  implicit class EqualizerEffectDefinitionOps[Self <: EqualizerEffectDefinition] (val x: Self) extends AnyVal {
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
    def withBands(value: IVectorView[EqualizerBand]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: IPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


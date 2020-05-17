package typingsSlinky.winrtUwp.Windows.Media.Audio

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a limiter effect definition supported by the audio graph. */
@js.native
trait LimiterEffectDefinition extends js.Object {
  /** Gets the activatable class ID for the limiter effect definition object. */
  var activatableClassId: String = js.native
  /** Gets or sets the loudness included in the limiter effect definition. */
  var loudness: Double = js.native
  /** Gets the properties supported by the limiter effect definition. */
  var properties: IPropertySet = js.native
  /** Gets or sets the release included in the limiter effect definition. */
  var release: Double = js.native
}

object LimiterEffectDefinition {
  @scala.inline
  def apply(activatableClassId: String, loudness: Double, properties: IPropertySet, release: Double): LimiterEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], loudness = loudness.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimiterEffectDefinition]
  }
  @scala.inline
  implicit class LimiterEffectDefinitionOps[Self <: LimiterEffectDefinition] (val x: Self) extends AnyVal {
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
    def withLoudness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loudness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: IPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelease(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


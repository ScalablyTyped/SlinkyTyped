package typingsSlinky.winrtUwp.Windows.Media.Core

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the definition of a video stabilization effect. */
@js.native
trait VideoStabilizationEffectDefinition extends js.Object {
  /** Gets a string containing the activatable class ID of the video stabilization effect definition. */
  var activatableClassId: String = js.native
  /** Gets the set of properties for configuring the VideoStabilizationEffectDefinition object. */
  var properties: IPropertySet = js.native
}

object VideoStabilizationEffectDefinition {
  @scala.inline
  def apply(activatableClassId: String, properties: IPropertySet): VideoStabilizationEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoStabilizationEffectDefinition]
  }
  @scala.inline
  implicit class VideoStabilizationEffectDefinitionOps[Self <: VideoStabilizationEffectDefinition] (val x: Self) extends AnyVal {
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
    def withProperties(value: IPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


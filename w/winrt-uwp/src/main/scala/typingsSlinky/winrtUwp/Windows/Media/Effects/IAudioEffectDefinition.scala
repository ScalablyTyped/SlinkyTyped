package typingsSlinky.winrtUwp.Windows.Media.Effects

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Exposes the methods and properties of an AudioEffectDefinition object. Implement this interface when you create a custom audio effect definition. */
@js.native
trait IAudioEffectDefinition extends js.Object {
  
  /** The activatable class ID of the audio effect definition. */
  var activatableClassId: String = js.native
  
  /** The set of properties for configuring an AudioEffectDefinition object. */
  var properties: IPropertySet = js.native
}
object IAudioEffectDefinition {
  
  @scala.inline
  def apply(activatableClassId: String, properties: IPropertySet): IAudioEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAudioEffectDefinition]
  }
  
  @scala.inline
  implicit class IAudioEffectDefinitionOps[Self <: IAudioEffectDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActivatableClassId(value: String): Self = this.set("activatableClassId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: IPropertySet): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
}

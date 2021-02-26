package typingsSlinky.winrtUwp.Windows.Media.Effects

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a video effect definition. */
@js.native
trait VideoEffectDefinition extends StObject {
  
  /** Gets the activatable class ID of the video effect definition. */
  var activatableClassId: String = js.native
  
  /** Gets the set of properties for configuring the VideoEffectDefinition object. */
  var properties: IPropertySet = js.native
}
object VideoEffectDefinition {
  
  @scala.inline
  def apply(activatableClassId: String, properties: IPropertySet): VideoEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoEffectDefinition]
  }
  
  @scala.inline
  implicit class VideoEffectDefinitionMutableBuilder[Self <: VideoEffectDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivatableClassId(value: String): Self = StObject.set(x, "activatableClassId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: IPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}

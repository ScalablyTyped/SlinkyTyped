package typingsSlinky.winrtUwp.Windows.Media.Audio

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an echo effect definition supported by the audio graph. */
@js.native
trait EchoEffectDefinition extends StObject {
  
  /** Gets the activatable class ID for the echo effect definition object. */
  var activatableClassId: String = js.native
  
  /** Gets or sets the delay supported by the echo effect definition. */
  var delay: Double = js.native
  
  /** Gets or sets the feedback included in the echo effect definition. */
  var feedback: Double = js.native
  
  /** Gets or sets the properties supported by the echo effect definition. */
  var properties: IPropertySet = js.native
  
  /** Gets or sets the wet-dry audio voice mix for the echo effect definition. */
  var wetDryMix: Double = js.native
}
object EchoEffectDefinition {
  
  @scala.inline
  def apply(
    activatableClassId: String,
    delay: Double,
    feedback: Double,
    properties: IPropertySet,
    wetDryMix: Double
  ): EchoEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], feedback = feedback.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], wetDryMix = wetDryMix.asInstanceOf[js.Any])
    __obj.asInstanceOf[EchoEffectDefinition]
  }
  
  @scala.inline
  implicit class EchoEffectDefinitionMutableBuilder[Self <: EchoEffectDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivatableClassId(value: String): Self = StObject.set(x, "activatableClassId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedback(value: Double): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: IPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWetDryMix(value: Double): Self = StObject.set(x, "wetDryMix", value.asInstanceOf[js.Any])
  }
}

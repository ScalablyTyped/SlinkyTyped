package typingsSlinky.winrtUwp.Windows.Media.Core

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the definition of a face detection video effect. */
@js.native
trait FaceDetectionEffectDefinition extends StObject {
  
  /** Gets a string containing the activatable class ID of the face detection effect definition. */
  var activatableClassId: String = js.native
  
  /** Gets or sets a value that prioritizes the speed of face detection and the quality of detection results. */
  var detectionMode: FaceDetectionMode = js.native
  
  /** Gets the set of properties for configuring the FaceDetectionEffectDefinition object. */
  var properties: IPropertySet = js.native
  
  /** Gets or sets a value indicating whether synchronous face detection is enabled. */
  var synchronousDetectionEnabled: Boolean = js.native
}
object FaceDetectionEffectDefinition {
  
  @scala.inline
  def apply(
    activatableClassId: String,
    detectionMode: FaceDetectionMode,
    properties: IPropertySet,
    synchronousDetectionEnabled: Boolean
  ): FaceDetectionEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], detectionMode = detectionMode.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], synchronousDetectionEnabled = synchronousDetectionEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceDetectionEffectDefinition]
  }
  
  @scala.inline
  implicit class FaceDetectionEffectDefinitionMutableBuilder[Self <: FaceDetectionEffectDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivatableClassId(value: String): Self = StObject.set(x, "activatableClassId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectionMode(value: FaceDetectionMode): Self = StObject.set(x, "detectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: IPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynchronousDetectionEnabled(value: Boolean): Self = StObject.set(x, "synchronousDetectionEnabled", value.asInstanceOf[js.Any])
  }
}

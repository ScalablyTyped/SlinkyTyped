package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This WebVR API interface describes the capabilities of a VRDisplay — its features can be used to perform VR device capability tests, for example can it return position information. */
@js.native
trait VRDisplayCapabilities extends StObject {
  
  val canPresent: scala.Boolean = js.native
  
  val hasExternalDisplay: scala.Boolean = js.native
  
  val hasOrientation: scala.Boolean = js.native
  
  val hasPosition: scala.Boolean = js.native
  
  val maxLayers: Double = js.native
}
object VRDisplayCapabilities {
  
  @scala.inline
  def apply(
    canPresent: scala.Boolean,
    hasExternalDisplay: scala.Boolean,
    hasOrientation: scala.Boolean,
    hasPosition: scala.Boolean,
    maxLayers: Double
  ): VRDisplayCapabilities = {
    val __obj = js.Dynamic.literal(canPresent = canPresent.asInstanceOf[js.Any], hasExternalDisplay = hasExternalDisplay.asInstanceOf[js.Any], hasOrientation = hasOrientation.asInstanceOf[js.Any], hasPosition = hasPosition.asInstanceOf[js.Any], maxLayers = maxLayers.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRDisplayCapabilities]
  }
  
  @scala.inline
  implicit class VRDisplayCapabilitiesMutableBuilder[Self <: VRDisplayCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanPresent(value: scala.Boolean): Self = StObject.set(x, "canPresent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasExternalDisplay(value: scala.Boolean): Self = StObject.set(x, "hasExternalDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasOrientation(value: scala.Boolean): Self = StObject.set(x, "hasOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPosition(value: scala.Boolean): Self = StObject.set(x, "hasPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLayers(value: Double): Self = StObject.set(x, "maxLayers", value.asInstanceOf[js.Any])
  }
}

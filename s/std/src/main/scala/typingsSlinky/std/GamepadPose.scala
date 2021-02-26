package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Gamepad API interface represents the pose of a WebVR controller at a given timestamp (which includes orientation, position, velocity, and acceleration information.) */
@js.native
trait GamepadPose extends StObject {
  
  val angularAcceleration: js.typedarray.Float32Array | Null = js.native
  
  val angularVelocity: js.typedarray.Float32Array | Null = js.native
  
  val hasOrientation: scala.Boolean = js.native
  
  val hasPosition: scala.Boolean = js.native
  
  val linearAcceleration: js.typedarray.Float32Array | Null = js.native
  
  val linearVelocity: js.typedarray.Float32Array | Null = js.native
  
  val orientation: js.typedarray.Float32Array | Null = js.native
  
  val position: js.typedarray.Float32Array | Null = js.native
}
object GamepadPose {
  
  @scala.inline
  def apply(hasOrientation: scala.Boolean, hasPosition: scala.Boolean): GamepadPose = {
    val __obj = js.Dynamic.literal(hasOrientation = hasOrientation.asInstanceOf[js.Any], hasPosition = hasPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadPose]
  }
  
  @scala.inline
  implicit class GamepadPoseMutableBuilder[Self <: GamepadPose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngularAcceleration(value: js.typedarray.Float32Array): Self = StObject.set(x, "angularAcceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngularAccelerationNull: Self = StObject.set(x, "angularAcceleration", null)
    
    @scala.inline
    def setAngularVelocity(value: js.typedarray.Float32Array): Self = StObject.set(x, "angularVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngularVelocityNull: Self = StObject.set(x, "angularVelocity", null)
    
    @scala.inline
    def setHasOrientation(value: scala.Boolean): Self = StObject.set(x, "hasOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPosition(value: scala.Boolean): Self = StObject.set(x, "hasPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearAcceleration(value: js.typedarray.Float32Array): Self = StObject.set(x, "linearAcceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearAccelerationNull: Self = StObject.set(x, "linearAcceleration", null)
    
    @scala.inline
    def setLinearVelocity(value: js.typedarray.Float32Array): Self = StObject.set(x, "linearVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearVelocityNull: Self = StObject.set(x, "linearVelocity", null)
    
    @scala.inline
    def setOrientation(value: js.typedarray.Float32Array): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationNull: Self = StObject.set(x, "orientation", null)
    
    @scala.inline
    def setPosition(value: js.typedarray.Float32Array): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionNull: Self = StObject.set(x, "position", null)
  }
}

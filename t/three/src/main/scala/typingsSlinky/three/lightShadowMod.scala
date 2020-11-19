package typingsSlinky.three

import typingsSlinky.three.cameraMod.Camera
import typingsSlinky.three.lightMod.Light
import typingsSlinky.three.matrix4Mod.Matrix4
import typingsSlinky.three.vector2Mod.Vector2
import typingsSlinky.three.vector4Mod.Vector4
import typingsSlinky.three.webGLRenderListsMod.RenderTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/lights/LightShadow", JSImport.Namespace)
@js.native
object lightShadowMod extends js.Object {
  
  @js.native
  class LightShadow protected () extends js.Object {
    def this(camera: Camera) = this()
    
    var autoUpdate: Boolean = js.native
    
    var bias: Double = js.native
    
    var camera: Camera = js.native
    
    def clone(recursive: Boolean): this.type = js.native
    
    def copy(source: LightShadow): this.type = js.native
    
    def getFrameExtents(): Vector2 = js.native
    
    def getFrustum(): Double = js.native
    
    def getViewport(viewportIndex: Double): Vector4 = js.native
    
    var map: RenderTarget = js.native
    
    var mapPass: RenderTarget = js.native
    
    var mapSize: Vector2 = js.native
    
    var matrix: Matrix4 = js.native
    
    var needsUpdate: Boolean = js.native
    
    var normalBias: Double = js.native
    
    var radius: Double = js.native
    
    def toJSON(): js.Any = js.native
    
    def updateMatrices(light: Light): Unit = js.native
    def updateMatrices(light: Light, viewportIndex: Double): Unit = js.native
  }
}

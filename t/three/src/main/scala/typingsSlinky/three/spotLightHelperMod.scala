package typingsSlinky.three

import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.lightMod.Light
import typingsSlinky.three.lineSegmentsMod.LineSegments
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.object3DMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spotLightHelperMod {
  
  @JSImport("three/src/helpers/SpotLightHelper", "SpotLightHelper")
  @js.native
  class SpotLightHelper protected () extends Object3D {
    def this(light: Light) = this()
    def this(light: Light, color: String) = this()
    def this(light: Light, color: Double) = this()
    def this(light: Light, color: Color) = this()
    
    var color: js.UndefOr[Color | String | Double] = js.native
    
    var cone: LineSegments[Geometry | BufferGeometry, Material | js.Array[Material]] = js.native
    
    def dispose(): Unit = js.native
    
    var light: Light = js.native
    
    def update(): Unit = js.native
  }
}

package typingsSlinky.three

import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.lineMod.Line
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.meshMod.Mesh
import typingsSlinky.three.object3DMod.Object3D
import typingsSlinky.three.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrowHelperMod {
  
  @JSImport("three/src/helpers/ArrowHelper", "ArrowHelper")
  @js.native
  class ArrowHelper protected () extends Object3D {
    /**
    	 * @param [dir=new THREE.Vector3( 0, 0, 1 )]
    	 * @param [origin=new THREE.Vector3( 0, 0, 0 )]
    	 * @param [length=1]
    	 * @param [color=0xffff00]
    	 * @param headLength
    	 * @param headWidth
    	 */
    def this(
      dir: Vector3,
      origin: js.UndefOr[Vector3],
      length: js.UndefOr[Double],
      color: js.UndefOr[Color | String | Double],
      headLength: js.UndefOr[Double],
      headWidth: js.UndefOr[Double]
    ) = this()
    
    var cone: Mesh[Geometry | BufferGeometry, Material | js.Array[Material]] = js.native
    
    var line: Line[Geometry | BufferGeometry, Material | js.Array[Material]] = js.native
    
    def setColor(color: String): Unit = js.native
    def setColor(color: Double): Unit = js.native
    def setColor(color: Color): Unit = js.native
    
    def setDirection(dir: Vector3): Unit = js.native
    
    def setLength(length: Double): Unit = js.native
    def setLength(length: Double, headLength: js.UndefOr[scala.Nothing], headWidth: Double): Unit = js.native
    def setLength(length: Double, headLength: Double): Unit = js.native
    def setLength(length: Double, headLength: Double, headWidth: Double): Unit = js.native
  }
}

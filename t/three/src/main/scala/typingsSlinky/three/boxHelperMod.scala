package typingsSlinky.three

import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.lineSegmentsMod.LineSegments
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.object3DMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxHelperMod {
  
  @JSImport("three/src/helpers/BoxHelper", "BoxHelper")
  @js.native
  class BoxHelper protected ()
    extends LineSegments[Geometry | BufferGeometry, Material | js.Array[Material]] {
    /**
    	 * @param object
    	 * @param [color=0xffff00]
    	 */
    def this(`object`: Object3D) = this()
    def this(`object`: Object3D, color: String) = this()
    def this(`object`: Object3D, color: Double) = this()
    def this(`object`: Object3D, color: Color) = this()
    
    def setFromObject(`object`: Object3D): this.type = js.native
    
    def update(): Unit = js.native
    def update(`object`: Object3D): Unit = js.native
  }
}

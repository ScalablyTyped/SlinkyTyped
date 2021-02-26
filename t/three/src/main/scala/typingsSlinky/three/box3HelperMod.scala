package typingsSlinky.three

import typingsSlinky.three.box3Mod.Box3
import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.lineSegmentsMod.LineSegments
import typingsSlinky.three.materialMod.Material
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object box3HelperMod {
  
  @JSImport("three/src/helpers/Box3Helper", "Box3Helper")
  @js.native
  class Box3Helper protected ()
    extends LineSegments[Geometry | BufferGeometry, Material | js.Array[Material]] {
    /**
    	 * @param box
    	 * @param [color=0xffff00]
    	 */
    def this(box: Box3) = this()
    def this(box: Box3, color: Color) = this()
    
    var box: Box3 = js.native
  }
}

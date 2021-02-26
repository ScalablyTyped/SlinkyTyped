package typingsSlinky.three

import typingsSlinky.three.boneMod.Bone
import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.lineSegmentsMod.LineSegments
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.object3DMod.Object3D
import typingsSlinky.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonHelperMod {
  
  @JSImport("three/src/helpers/SkeletonHelper", "SkeletonHelper")
  @js.native
  class SkeletonHelper protected ()
    extends LineSegments[Geometry | BufferGeometry, Material | js.Array[Material]] {
    def this(`object`: Object3D) = this()
    
    var bones: js.Array[Bone] = js.native
    
    def getBoneList(`object`: Object3D): js.Array[Bone] = js.native
    
    val isSkeletonHelper: `true` = js.native
    
    var root: Object3D = js.native
    
    def update(): Unit = js.native
  }
}

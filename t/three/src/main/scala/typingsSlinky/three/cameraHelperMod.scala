package typingsSlinky.three

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.cameraMod.Camera
import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.lineSegmentsMod.LineSegments
import typingsSlinky.three.materialMod.Material
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cameraHelperMod {
  
  @JSImport("three/src/helpers/CameraHelper", "CameraHelper")
  @js.native
  class CameraHelper protected ()
    extends LineSegments[Geometry | BufferGeometry, Material | js.Array[Material]] {
    def this(camera: Camera) = this()
    
    var camera: Camera = js.native
    
    var pointMap: StringDictionary[js.Array[Double]] = js.native
    
    def update(): Unit = js.native
  }
}

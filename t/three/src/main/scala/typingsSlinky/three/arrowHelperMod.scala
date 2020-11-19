package typingsSlinky.three

import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.lineMod.Line
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.meshMod.Mesh
import typingsSlinky.three.object3DMod.Object3D
import typingsSlinky.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/helpers/ArrowHelper", JSImport.Namespace)
@js.native
object arrowHelperMod extends js.Object {
  
  @js.native
  class ArrowHelper protected () extends Object3D {
    def this(dir: Vector3) = this()
    def this(dir: Vector3, origin: Vector3) = this()
    def this(dir: Vector3, origin: js.UndefOr[scala.Nothing], length: Double) = this()
    def this(dir: Vector3, origin: Vector3, length: Double) = this()
    def this(dir: Vector3, origin: js.UndefOr[scala.Nothing], length: js.UndefOr[scala.Nothing], color: Double) = this()
    def this(dir: Vector3, origin: js.UndefOr[scala.Nothing], length: Double, color: Double) = this()
    def this(dir: Vector3, origin: Vector3, length: js.UndefOr[scala.Nothing], color: Double) = this()
    def this(dir: Vector3, origin: Vector3, length: Double, color: Double) = this()
    def this(
      dir: Vector3,
      origin: js.UndefOr[scala.Nothing],
      length: js.UndefOr[scala.Nothing],
      color: js.UndefOr[scala.Nothing],
      headLength: Double
    ) = this()
    def this(
      dir: Vector3,
      origin: js.UndefOr[scala.Nothing],
      length: js.UndefOr[scala.Nothing],
      color: Double,
      headLength: Double
    ) = this()
    def this(
      dir: Vector3,
      origin: js.UndefOr[scala.Nothing],
      length: Double,
      color: js.UndefOr[scala.Nothing],
      headLength: Double
    ) = this()
    def this(dir: Vector3, origin: js.UndefOr[scala.Nothing], length: Double, color: Double, headLength: Double) = this()
    def this(
      dir: Vector3,
      origin: Vector3,
      length: js.UndefOr[scala.Nothing],
      color: js.UndefOr[scala.Nothing],
      headLength: Double
    ) = this()
    def this(
      dir: Vector3,
      origin: Vector3,
      length: js.UndefOr[scala.Nothing],
      color: Double,
      headLength: Double
    ) = this()
    def this(
      dir: Vector3,
      origin: Vector3,
      length: Double,
      color: js.UndefOr[scala.Nothing],
      headLength: Double
    ) = this()
    def this(dir: Vector3, origin: Vector3, length: Double, color: Double, headLength: Double) = this()
    def this(
      dir: Vector3,
      origin: js.UndefOr[scala.Nothing],
      length: js.UndefOr[scala.Nothing],
      color: js.UndefOr[scala.Nothing],
      headLength: js.UndefOr[scala.Nothing],
      headWidth: Double
    ) = this()
    def this(
      dir: Vector3,
      origin: js.UndefOr[scala.Nothing],
      length: js.UndefOr[scala.Nothing],
      color: js.UndefOr[scala.Nothing],
      headLength: Double,
      headWidth: Double
    ) = this()
    def this(
      dir: Vector3,
      origin: js.UndefOr[scala.Nothing],
      length: js.UndefOr[scala.Nothing],
      color: Double,
      headLength: js.UndefOr[scala.Nothing],
      headWidth: Double
    ) = this()
    def this(
      dir: Vector3,
      origin: js.UndefOr[scala.Nothing],
      length: js.UndefOr[scala.Nothing],
      color: Double,
      headLength: Double,
      headWidth: Double
    ) = this()
    def this(
      dir: Vector3,
      origin: js.UndefOr[scala.Nothing],
      length: Double,
      color: js.UndefOr[scala.Nothing],
      headLength: js.UndefOr[scala.Nothing],
      headWidth: Double
    ) = this()
    def this(
      dir: Vector3,
      origin: js.UndefOr[scala.Nothing],
      length: Double,
      color: js.UndefOr[scala.Nothing],
      headLength: Double,
      headWidth: Double
    ) = this()
    def this(
      dir: Vector3,
      origin: js.UndefOr[scala.Nothing],
      length: Double,
      color: Double,
      headLength: js.UndefOr[scala.Nothing],
      headWidth: Double
    ) = this()
    def this(
      dir: Vector3,
      origin: js.UndefOr[scala.Nothing],
      length: Double,
      color: Double,
      headLength: Double,
      headWidth: Double
    ) = this()
    def this(
      dir: Vector3,
      origin: Vector3,
      length: js.UndefOr[scala.Nothing],
      color: js.UndefOr[scala.Nothing],
      headLength: js.UndefOr[scala.Nothing],
      headWidth: Double
    ) = this()
    def this(
      dir: Vector3,
      origin: Vector3,
      length: js.UndefOr[scala.Nothing],
      color: js.UndefOr[scala.Nothing],
      headLength: Double,
      headWidth: Double
    ) = this()
    def this(
      dir: Vector3,
      origin: Vector3,
      length: js.UndefOr[scala.Nothing],
      color: Double,
      headLength: js.UndefOr[scala.Nothing],
      headWidth: Double
    ) = this()
    def this(
      dir: Vector3,
      origin: Vector3,
      length: js.UndefOr[scala.Nothing],
      color: Double,
      headLength: Double,
      headWidth: Double
    ) = this()
    def this(
      dir: Vector3,
      origin: Vector3,
      length: Double,
      color: js.UndefOr[scala.Nothing],
      headLength: js.UndefOr[scala.Nothing],
      headWidth: Double
    ) = this()
    def this(
      dir: Vector3,
      origin: Vector3,
      length: Double,
      color: js.UndefOr[scala.Nothing],
      headLength: Double,
      headWidth: Double
    ) = this()
    def this(
      dir: Vector3,
      origin: Vector3,
      length: Double,
      color: Double,
      headLength: js.UndefOr[scala.Nothing],
      headWidth: Double
    ) = this()
    def this(
      dir: Vector3,
      origin: Vector3,
      length: Double,
      color: Double,
      headLength: Double,
      headWidth: Double
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

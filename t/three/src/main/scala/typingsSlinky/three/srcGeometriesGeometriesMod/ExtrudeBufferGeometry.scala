package typingsSlinky.three.srcGeometriesGeometriesMod

import typingsSlinky.three.srcExtrasCoreShapeMod.Shape
import typingsSlinky.three.srcGeometriesExtrudeGeometryMod.ExtrudeGeometryOptions
import typingsSlinky.three.srcGeometriesExtrudeGeometryMod.UVGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/Geometries", "ExtrudeBufferGeometry")
@js.native
class ExtrudeBufferGeometry protected ()
  extends typingsSlinky.three.srcGeometriesExtrudeGeometryMod.ExtrudeBufferGeometry {
  def this(shapes: js.Array[Shape]) = this()
  def this(shapes: Shape) = this()
  def this(shapes: js.Array[Shape], options: ExtrudeGeometryOptions) = this()
  def this(shapes: Shape, options: ExtrudeGeometryOptions) = this()
}

/* static members */
@JSImport("three/src/geometries/Geometries", "ExtrudeBufferGeometry")
@js.native
object ExtrudeBufferGeometry extends js.Object {
  var WorldUVGenerator: UVGenerator = js.native
}


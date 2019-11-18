package typingsSlinky.three.srcGeometriesGeometriesMod

import typingsSlinky.three.srcExtrasCoreShapeMod.Shape
import typingsSlinky.three.srcGeometriesExtrudeGeometryMod.ExtrudeGeometryOptions
import typingsSlinky.three.srcGeometriesExtrudeGeometryMod.UVGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/Geometries", "ExtrudeGeometry")
@js.native
class ExtrudeGeometry protected ()
  extends typingsSlinky.three.srcGeometriesExtrudeGeometryMod.ExtrudeGeometry {
  def this(shapes: js.Array[Shape]) = this()
  def this(shapes: Shape) = this()
  def this(shapes: js.Array[Shape], options: ExtrudeGeometryOptions) = this()
  def this(shapes: Shape, options: ExtrudeGeometryOptions) = this()
}

/* static members */
@JSImport("three/src/geometries/Geometries", "ExtrudeGeometry")
@js.native
object ExtrudeGeometry extends js.Object {
  var WorldUVGenerator: UVGenerator = js.native
}


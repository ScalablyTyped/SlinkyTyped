package typingsSlinky.three.threeMod

import typingsSlinky.three.srcGeometriesExtrudeGeometryMod.ExtrudeGeometryOptions
import typingsSlinky.three.srcGeometriesExtrudeGeometryMod.UVGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "ExtrudeGeometry")
@js.native
class ExtrudeGeometry protected ()
  extends typingsSlinky.three.srcGeometriesGeometriesMod.ExtrudeGeometry {
  def this(shapes: js.Array[typingsSlinky.three.srcExtrasCoreShapeMod.Shape]) = this()
  def this(shapes: typingsSlinky.three.srcExtrasCoreShapeMod.Shape) = this()
  def this(shapes: js.Array[typingsSlinky.three.srcExtrasCoreShapeMod.Shape], options: ExtrudeGeometryOptions) = this()
  def this(shapes: typingsSlinky.three.srcExtrasCoreShapeMod.Shape, options: ExtrudeGeometryOptions) = this()
}

/* static members */
@JSImport("three", "ExtrudeGeometry")
@js.native
object ExtrudeGeometry extends js.Object {
  var WorldUVGenerator: UVGenerator = js.native
}


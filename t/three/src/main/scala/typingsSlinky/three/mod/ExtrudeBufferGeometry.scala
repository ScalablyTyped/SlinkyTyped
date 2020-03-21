package typingsSlinky.three.mod

import typingsSlinky.three.extrudeGeometryMod.ExtrudeGeometryOptions
import typingsSlinky.three.extrudeGeometryMod.UVGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "ExtrudeBufferGeometry")
@js.native
class ExtrudeBufferGeometry protected ()
  extends typingsSlinky.three.geometriesMod.ExtrudeBufferGeometry {
  def this(shapes: js.Array[typingsSlinky.three.shapeMod.Shape]) = this()
  def this(shapes: typingsSlinky.three.shapeMod.Shape) = this()
  def this(shapes: js.Array[typingsSlinky.three.shapeMod.Shape], options: ExtrudeGeometryOptions) = this()
  def this(shapes: typingsSlinky.three.shapeMod.Shape, options: ExtrudeGeometryOptions) = this()
}

/* static members */
@JSImport("three", "ExtrudeBufferGeometry")
@js.native
object ExtrudeBufferGeometry extends js.Object {
  var WorldUVGenerator: UVGenerator = js.native
}


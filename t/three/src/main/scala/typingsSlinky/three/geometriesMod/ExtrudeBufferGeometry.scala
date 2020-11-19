package typingsSlinky.three.geometriesMod

import typingsSlinky.three.extrudeGeometryMod.ExtrudeGeometryOptions
import typingsSlinky.three.extrudeGeometryMod.UVGenerator
import typingsSlinky.three.shapeMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/geometries/Geometries", "ExtrudeBufferGeometry")
@js.native
class ExtrudeBufferGeometry protected ()
  extends typingsSlinky.three.extrudeGeometryMod.ExtrudeBufferGeometry {
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

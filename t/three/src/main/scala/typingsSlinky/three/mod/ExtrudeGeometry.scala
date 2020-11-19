package typingsSlinky.three.mod

import typingsSlinky.three.extrudeGeometryMod.ExtrudeGeometryOptions
import typingsSlinky.three.extrudeGeometryMod.UVGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "ExtrudeGeometry")
@js.native
class ExtrudeGeometry protected ()
  extends typingsSlinky.three.geometriesMod.ExtrudeGeometry {
  def this(shapes: js.Array[typingsSlinky.three.shapeMod.Shape]) = this()
  def this(shapes: typingsSlinky.three.shapeMod.Shape) = this()
  def this(shapes: js.Array[typingsSlinky.three.shapeMod.Shape], options: ExtrudeGeometryOptions) = this()
  def this(shapes: typingsSlinky.three.shapeMod.Shape, options: ExtrudeGeometryOptions) = this()
}
/* static members */
@JSImport("three", "ExtrudeGeometry")
@js.native
object ExtrudeGeometry extends js.Object {
  
  var WorldUVGenerator: UVGenerator = js.native
}

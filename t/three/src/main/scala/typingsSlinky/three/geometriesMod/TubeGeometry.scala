package typingsSlinky.three.geometriesMod

import typingsSlinky.three.curveMod.Curve
import typingsSlinky.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/Geometries", "TubeGeometry")
@js.native
class TubeGeometry protected ()
  extends typingsSlinky.three.tubeGeometryMod.TubeGeometry {
  def this(path: Curve[Vector3]) = this()
  def this(path: Curve[Vector3], tubularSegments: Double) = this()
  def this(path: Curve[Vector3], tubularSegments: Double, radius: Double) = this()
  def this(path: Curve[Vector3], tubularSegments: Double, radius: Double, radiusSegments: Double) = this()
  def this(
    path: Curve[Vector3],
    tubularSegments: Double,
    radius: Double,
    radiusSegments: Double,
    closed: Boolean
  ) = this()
}


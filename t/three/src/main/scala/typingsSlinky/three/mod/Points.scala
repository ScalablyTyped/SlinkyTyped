package typingsSlinky.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Points")
@js.native
/**
	 * @param geometry An instance of Geometry or BufferGeometry.
	 * @param material An instance of Material (optional).
	 */
class Points ()
  extends typingsSlinky.three.pointsMod.Points {
  def this(geometry: typingsSlinky.three.bufferGeometryMod.BufferGeometry) = this()
  def this(geometry: typingsSlinky.three.geometryMod.Geometry) = this()
  def this(
    geometry: typingsSlinky.three.bufferGeometryMod.BufferGeometry,
    material: js.Array[typingsSlinky.three.materialMod.Material]
  ) = this()
  def this(
    geometry: typingsSlinky.three.bufferGeometryMod.BufferGeometry,
    material: typingsSlinky.three.materialMod.Material
  ) = this()
  def this(
    geometry: typingsSlinky.three.geometryMod.Geometry,
    material: js.Array[typingsSlinky.three.materialMod.Material]
  ) = this()
  def this(
    geometry: typingsSlinky.three.geometryMod.Geometry,
    material: typingsSlinky.three.materialMod.Material
  ) = this()
}


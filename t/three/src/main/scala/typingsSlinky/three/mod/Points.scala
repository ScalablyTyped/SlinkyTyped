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
class Points[TGeometry /* <: typingsSlinky.three.geometryMod.Geometry | typingsSlinky.three.bufferGeometryMod.BufferGeometry */, TMaterial /* <: typingsSlinky.three.materialMod.Material | js.Array[typingsSlinky.three.materialMod.Material] */] ()
  extends typingsSlinky.three.pointsMod.Points[TGeometry, TMaterial] {
  def this(geometry: TGeometry) = this()
  def this(geometry: TGeometry, material: TMaterial) = this()
  def this(geometry: js.UndefOr[scala.Nothing], material: TMaterial) = this()
}


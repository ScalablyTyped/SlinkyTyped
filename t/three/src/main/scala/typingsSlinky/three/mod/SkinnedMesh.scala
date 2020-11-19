package typingsSlinky.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "SkinnedMesh")
@js.native
class SkinnedMesh[TGeometry /* <: typingsSlinky.three.geometryMod.Geometry | typingsSlinky.three.bufferGeometryMod.BufferGeometry */, TMaterial /* <: typingsSlinky.three.materialMod.Material | js.Array[typingsSlinky.three.materialMod.Material] */] ()
  extends typingsSlinky.three.skinnedMeshMod.SkinnedMesh[TGeometry, TMaterial] {
  def this(geometry: TGeometry) = this()
  def this(geometry: TGeometry, material: TMaterial) = this()
  def this(geometry: js.UndefOr[scala.Nothing], material: TMaterial) = this()
  def this(geometry: TGeometry, material: TMaterial, useVertexTexture: Boolean) = this()
  def this(geometry: TGeometry, material: js.UndefOr[scala.Nothing], useVertexTexture: Boolean) = this()
  def this(geometry: js.UndefOr[scala.Nothing], material: TMaterial, useVertexTexture: Boolean) = this()
  def this(
    geometry: js.UndefOr[scala.Nothing],
    material: js.UndefOr[scala.Nothing],
    useVertexTexture: Boolean
  ) = this()
}

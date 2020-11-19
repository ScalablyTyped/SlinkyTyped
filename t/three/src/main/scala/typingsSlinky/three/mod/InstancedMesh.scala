package typingsSlinky.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "InstancedMesh")
@js.native
class InstancedMesh[TGeometry /* <: typingsSlinky.three.geometryMod.Geometry | typingsSlinky.three.bufferGeometryMod.BufferGeometry */, TMaterial /* <: typingsSlinky.three.materialMod.Material | js.Array[typingsSlinky.three.materialMod.Material] */] protected ()
  extends typingsSlinky.three.instancedMeshMod.InstancedMesh[TGeometry, TMaterial] {
  def this(geometry: TGeometry, material: TMaterial, count: Double) = this()
}

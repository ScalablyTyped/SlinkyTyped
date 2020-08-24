package typingsSlinky.three

import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.matrix4Mod.Matrix4
import typingsSlinky.three.meshMod.Mesh
import typingsSlinky.three.skeletonMod.Skeleton
import typingsSlinky.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/SkinnedMesh", JSImport.Namespace)
@js.native
object skinnedMeshMod extends js.Object {
  @js.native
  class SkinnedMesh[TGeometry /* <: Geometry | BufferGeometry */, TMaterial /* <: Material | js.Array[Material] */] ()
    extends Mesh[Geometry | BufferGeometry, Material | js.Array[Material]] {
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
    var bindMatrix: Matrix4 = js.native
    var bindMatrixInverse: Matrix4 = js.native
    var bindMode: String = js.native
    val isSkinnedMesh: `true` = js.native
    var skeleton: Skeleton = js.native
    def bind(skeleton: Skeleton): Unit = js.native
    def bind(skeleton: Skeleton, bindMatrix: Matrix4): Unit = js.native
    def normalizeSkinWeights(): Unit = js.native
    def pose(): Unit = js.native
  }
  
}


package typingsSlinky.three.webGLRenderListsMod

import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.groupMod.Group
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.object3DMod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLRenderLists", "WebGLRenderList")
@js.native
class WebGLRenderList () extends js.Object {
  var opaque: js.Array[RenderItem] = js.native
  var transparent: js.Array[RenderItem] = js.native
  def init(): Unit = js.native
  def push(`object`: Object3D, geometry: Null, material: Material, groupOrder: Double, z: Double): Unit = js.native
  def push(
    `object`: Object3D,
    geometry: Null,
    material: Material,
    groupOrder: Double,
    z: Double,
    group: Group
  ): Unit = js.native
  def push(`object`: Object3D, geometry: BufferGeometry, material: Material, groupOrder: Double, z: Double): Unit = js.native
  def push(
    `object`: Object3D,
    geometry: BufferGeometry,
    material: Material,
    groupOrder: Double,
    z: Double,
    group: Group
  ): Unit = js.native
  def sort(): Unit = js.native
  def unshift(`object`: Object3D, geometry: Null, material: Material, groupOrder: Double, z: Double): Unit = js.native
  def unshift(
    `object`: Object3D,
    geometry: Null,
    material: Material,
    groupOrder: Double,
    z: Double,
    group: Group
  ): Unit = js.native
  def unshift(`object`: Object3D, geometry: BufferGeometry, material: Material, groupOrder: Double, z: Double): Unit = js.native
  def unshift(
    `object`: Object3D,
    geometry: BufferGeometry,
    material: Material,
    groupOrder: Double,
    z: Double,
    group: Group
  ): Unit = js.native
}


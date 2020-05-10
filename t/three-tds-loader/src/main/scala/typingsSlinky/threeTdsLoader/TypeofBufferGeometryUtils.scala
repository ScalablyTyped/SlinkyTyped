package typingsSlinky.threeTdsLoader

import typingsSlinky.three.bufferAttributeMod.BufferAttribute
import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofBufferGeometryUtils extends js.Object {
  def computeTangents(geometry: BufferGeometry): Null = js.native
  def mergeBufferAttributes(attributes: js.Array[BufferAttribute]): BufferAttribute = js.native
  def mergeBufferGeometries(geometries: js.Array[BufferGeometry]): BufferGeometry = js.native
}

object TypeofBufferGeometryUtils {
  @scala.inline
  def apply(
    computeTangents: BufferGeometry => Null,
    mergeBufferAttributes: js.Array[BufferAttribute] => BufferAttribute,
    mergeBufferGeometries: js.Array[BufferGeometry] => BufferGeometry
  ): TypeofBufferGeometryUtils = {
    val __obj = js.Dynamic.literal(computeTangents = js.Any.fromFunction1(computeTangents), mergeBufferAttributes = js.Any.fromFunction1(mergeBufferAttributes), mergeBufferGeometries = js.Any.fromFunction1(mergeBufferGeometries))
    __obj.asInstanceOf[TypeofBufferGeometryUtils]
  }
  @scala.inline
  implicit class TypeofBufferGeometryUtilsOps[Self <: TypeofBufferGeometryUtils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputeTangents(value: BufferGeometry => Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeTangents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMergeBufferAttributes(value: js.Array[BufferAttribute] => BufferAttribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeBufferAttributes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMergeBufferGeometries(value: js.Array[BufferGeometry] => BufferGeometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeBufferGeometries")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


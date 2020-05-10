package typingsSlinky.tensorflowTfjsCore.gpgpuMathMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import typingsSlinky.tensorflowTfjsCore.texUtilMod.TextureData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TensorData extends js.Object {
  var isUniform: Boolean = js.native
  var shape: js.Array[Double] = js.native
  var texData: TextureData = js.native
  var uniformValues: js.UndefOr[TypedArray] = js.native
}

object TensorData {
  @scala.inline
  def apply(isUniform: Boolean, shape: js.Array[Double], texData: TextureData): TensorData = {
    val __obj = js.Dynamic.literal(isUniform = isUniform.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], texData = texData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TensorData]
  }
  @scala.inline
  implicit class TensorDataOps[Self <: TensorData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsUniform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUniform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShape(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTexData(value: TextureData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniformValuesInt32Array(value: js.typedarray.Int32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniformValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniformValuesFloat32Array(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniformValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniformValuesUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniformValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniformValues(value: TypedArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniformValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniformValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniformValues")(js.undefined)
        ret
    }
  }
  
}


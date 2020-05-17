package typingsSlinky.tensorflowTfjsCore.texUtilMod

import org.scalajs.dom.raw.WebGLTexture
import typingsSlinky.tensorflowTfjsCore.anon.FlatOffset
import typingsSlinky.tensorflowTfjsCore.anon.ImagReal
import typingsSlinky.tensorflowTfjsCore.distTypesMod.BackendValues
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextureData extends js.Object {
  var complexTensors: js.UndefOr[ImagReal] = js.native
  var dtype: DataType = js.native
  var isPacked: js.UndefOr[Boolean] = js.native
  var shape: js.Array[Double] = js.native
  var slice: js.UndefOr[FlatOffset] = js.native
  /** [rows, columns] shape of the texture. */
  var texShape: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var texture: js.UndefOr[WebGLTexture] = js.native
  var usage: js.UndefOr[TextureUsage] = js.native
  var values: js.UndefOr[BackendValues] = js.native
}

object TextureData {
  @scala.inline
  def apply(dtype: DataType, shape: js.Array[Double]): TextureData = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureData]
  }
  @scala.inline
  implicit class TextureDataOps[Self <: TextureData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDtype(value: DataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShape(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComplexTensors(value: ImagReal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complexTensors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplexTensors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complexTensors")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPacked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPacked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPacked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPacked")(js.undefined)
        ret
    }
    @scala.inline
    def withSlice(value: FlatOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slice")(js.undefined)
        ret
    }
    @scala.inline
    def withTexShape(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTexShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texShape")(js.undefined)
        ret
    }
    @scala.inline
    def withTexture(value: WebGLTexture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTexture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texture")(js.undefined)
        ret
    }
    @scala.inline
    def withUsage(value: TextureUsage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(js.undefined)
        ret
    }
    @scala.inline
    def withValuesInt32Array(value: js.typedarray.Int32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValuesFloat32Array(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValuesUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: BackendValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}


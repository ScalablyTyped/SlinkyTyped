package typingsSlinky.tensorflowTfjsCore.gpgpuMathMod

import typingsSlinky.tensorflowTfjsCore.texUtilMod.PackingScheme
import typingsSlinky.tensorflowTfjsCore.texUtilMod.TextureUsage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GPGPUProgram extends js.Object {
  /**
    * The type of scheme to use when packing texels for the output values.
    * See `PackingScheme` for details. Defaults to `PackingScheme.SHARED_BATCH`.
    */
  var outPackingScheme: js.UndefOr[PackingScheme] = js.native
  /**
    * Affects what type of texture we allocate for the output. Defaults to
    * `TextureUsage.RENDER`.
    */
  var outTexUsage: js.UndefOr[TextureUsage] = js.native
  var outputShape: js.Array[Double] = js.native
  /** If true, this program expects packed input textures. Defaults to false. */
  var packedInputs: js.UndefOr[Boolean] = js.native
  /** If true, this program produces a packed texture. Defaults to false. */
  var packedOutput: js.UndefOr[Boolean] = js.native
  var userCode: String = js.native
  var variableNames: js.Array[String] = js.native
}

object GPGPUProgram {
  @scala.inline
  def apply(outputShape: js.Array[Double], userCode: String, variableNames: js.Array[String]): GPGPUProgram = {
    val __obj = js.Dynamic.literal(outputShape = outputShape.asInstanceOf[js.Any], userCode = userCode.asInstanceOf[js.Any], variableNames = variableNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPGPUProgram]
  }
  @scala.inline
  implicit class GPGPUProgramOps[Self <: GPGPUProgram] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputShape(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariableNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutPackingScheme(value: PackingScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outPackingScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutPackingScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outPackingScheme")(js.undefined)
        ret
    }
    @scala.inline
    def withOutTexUsage(value: TextureUsage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outTexUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutTexUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outTexUsage")(js.undefined)
        ret
    }
    @scala.inline
    def withPackedInputs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packedInputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackedInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packedInputs")(js.undefined)
        ret
    }
    @scala.inline
    def withPackedOutput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packedOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackedOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packedOutput")(js.undefined)
        ret
    }
  }
  
}


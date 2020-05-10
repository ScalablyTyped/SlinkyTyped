package typingsSlinky.tensorflowTfjsCore.glslVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GLSL extends js.Object {
  var attribute: String = js.native
  var defineOutput: String = js.native
  var defineRound: String = js.native
  var defineSpecialInf: String = js.native
  var defineSpecialNaN: String = js.native
  var output: String = js.native
  var texture2D: String = js.native
  var varyingFs: String = js.native
  var varyingVs: String = js.native
  var version: String = js.native
}

object GLSL {
  @scala.inline
  def apply(
    attribute: String,
    defineOutput: String,
    defineRound: String,
    defineSpecialInf: String,
    defineSpecialNaN: String,
    output: String,
    texture2D: String,
    varyingFs: String,
    varyingVs: String,
    version: String
  ): GLSL = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], defineOutput = defineOutput.asInstanceOf[js.Any], defineRound = defineRound.asInstanceOf[js.Any], defineSpecialInf = defineSpecialInf.asInstanceOf[js.Any], defineSpecialNaN = defineSpecialNaN.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], texture2D = texture2D.asInstanceOf[js.Any], varyingFs = varyingFs.asInstanceOf[js.Any], varyingVs = varyingVs.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GLSL]
  }
  @scala.inline
  implicit class GLSLOps[Self <: GLSL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefineOutput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defineOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefineRound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defineRound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefineSpecialInf(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defineSpecialInf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefineSpecialNaN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defineSpecialNaN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTexture2D(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texture2D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVaryingFs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varyingFs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVaryingVs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varyingVs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


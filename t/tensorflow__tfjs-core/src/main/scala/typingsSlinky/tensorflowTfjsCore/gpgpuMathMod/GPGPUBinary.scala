package typingsSlinky.tensorflowTfjsCore.gpgpuMathMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLUniformLocation
import typingsSlinky.tensorflowTfjsCore.shaderCompilerMod.ShapeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GPGPUBinary extends js.Object {
  var inShapeInfos: js.Array[ShapeInfo] = js.native
  var infLoc: WebGLUniformLocation = js.native
  var nanLoc: WebGLUniformLocation = js.native
  var outShapeInfo: ShapeInfo = js.native
  var program: GPGPUProgram = js.native
  var source: String = js.native
  var uniformLocations: StringDictionary[WebGLUniformLocation] = js.native
  var webGLProgram: WebGLProgram = js.native
}

object GPGPUBinary {
  @scala.inline
  def apply(
    inShapeInfos: js.Array[ShapeInfo],
    infLoc: WebGLUniformLocation,
    nanLoc: WebGLUniformLocation,
    outShapeInfo: ShapeInfo,
    program: GPGPUProgram,
    source: String,
    uniformLocations: StringDictionary[WebGLUniformLocation],
    webGLProgram: WebGLProgram
  ): GPGPUBinary = {
    val __obj = js.Dynamic.literal(inShapeInfos = inShapeInfos.asInstanceOf[js.Any], infLoc = infLoc.asInstanceOf[js.Any], nanLoc = nanLoc.asInstanceOf[js.Any], outShapeInfo = outShapeInfo.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], uniformLocations = uniformLocations.asInstanceOf[js.Any], webGLProgram = webGLProgram.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPGPUBinary]
  }
  @scala.inline
  implicit class GPGPUBinaryOps[Self <: GPGPUBinary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInShapeInfos(value: js.Array[ShapeInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inShapeInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfLoc(value: WebGLUniformLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infLoc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNanLoc(value: WebGLUniformLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nanLoc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutShapeInfo(value: ShapeInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outShapeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgram(value: GPGPUProgram): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniformLocations(value: StringDictionary[WebGLUniformLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniformLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebGLProgram(value: WebGLProgram): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webGLProgram")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


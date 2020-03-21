package typingsSlinky.tensorflowTfjsCore.gpgpuMathMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLUniformLocation
import typingsSlinky.tensorflowTfjsCore.shaderCompilerMod.ShapeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GPGPUBinary extends js.Object {
  var inShapeInfos: js.Array[ShapeInfo]
  var infLoc: WebGLUniformLocation
  var nanLoc: WebGLUniformLocation
  var outShapeInfo: ShapeInfo
  var program: GPGPUProgram
  var source: String
  var uniformLocations: StringDictionary[WebGLUniformLocation]
  var webGLProgram: WebGLProgram
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
}


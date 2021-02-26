package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.all
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.any
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.max
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.min
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.prod
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.sum
import typingsSlinky.tensorflowTfjsCore.reduceUtilMod.ReduceInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduceGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/reduce_gpu", "ReduceProgram")
  @js.native
  class ReduceProgram protected () extends GPGPUProgram {
    def this(reduceInfo: ReduceInfo, reduceType: all) = this()
    def this(reduceInfo: ReduceInfo, reduceType: any) = this()
    def this(reduceInfo: ReduceInfo, reduceType: max) = this()
    def this(reduceInfo: ReduceInfo, reduceType: min) = this()
    def this(reduceInfo: ReduceInfo, reduceType: prod) = this()
    def this(reduceInfo: ReduceInfo, reduceType: sum) = this()
  }
}

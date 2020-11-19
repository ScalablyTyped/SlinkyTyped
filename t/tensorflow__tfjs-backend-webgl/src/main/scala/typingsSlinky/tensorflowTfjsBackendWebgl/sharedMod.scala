package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/kernel_utils/shared", JSImport.Namespace)
@js.native
object sharedMod extends js.Object {
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(transposeImplCPU) */ val maxImplCPU: js.Function4[
    /* aVals */ TypedArray, 
    /* reduceSize */ Double, 
    /* outShape */ js.Array[Double], 
    /* dtype */ DataType, 
    TypedArray
  ] = js.native
}

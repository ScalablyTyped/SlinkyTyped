package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.avg
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.max
import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv3DInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object poolGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/pool_gpu", "Pool2DProgram")
  @js.native
  class Pool2DProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv2DInfo, poolType: avg, computePositions: Boolean) = this()
    def this(convInfo: Conv2DInfo, poolType: max, computePositions: Boolean) = this()
    def this(convInfo: Conv2DInfo, poolType: avg, computePositions: Boolean, flattenPositions: Boolean) = this()
    def this(convInfo: Conv2DInfo, poolType: max, computePositions: Boolean, flattenPositions: Boolean) = this()
    def this(
      convInfo: Conv2DInfo,
      poolType: avg,
      computePositions: Boolean,
      flattenPositions: js.UndefOr[scala.Nothing],
      includeBatchInIndex: Boolean
    ) = this()
    def this(
      convInfo: Conv2DInfo,
      poolType: avg,
      computePositions: Boolean,
      flattenPositions: Boolean,
      includeBatchInIndex: Boolean
    ) = this()
    def this(
      convInfo: Conv2DInfo,
      poolType: max,
      computePositions: Boolean,
      flattenPositions: js.UndefOr[scala.Nothing],
      includeBatchInIndex: Boolean
    ) = this()
    def this(
      convInfo: Conv2DInfo,
      poolType: max,
      computePositions: Boolean,
      flattenPositions: Boolean,
      includeBatchInIndex: Boolean
    ) = this()
  }
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/pool_gpu", "Pool3DProgram")
  @js.native
  class Pool3DProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv3DInfo, poolType: avg, computePositions: Boolean) = this()
    def this(convInfo: Conv3DInfo, poolType: max, computePositions: Boolean) = this()
    def this(convInfo: Conv3DInfo, poolType: avg, computePositions: Boolean, flattenPositions: Boolean) = this()
    def this(convInfo: Conv3DInfo, poolType: max, computePositions: Boolean, flattenPositions: Boolean) = this()
    def this(
      convInfo: Conv3DInfo,
      poolType: avg,
      computePositions: Boolean,
      flattenPositions: js.UndefOr[scala.Nothing],
      includeBatchInIndex: Boolean
    ) = this()
    def this(
      convInfo: Conv3DInfo,
      poolType: avg,
      computePositions: Boolean,
      flattenPositions: Boolean,
      includeBatchInIndex: Boolean
    ) = this()
    def this(
      convInfo: Conv3DInfo,
      poolType: max,
      computePositions: Boolean,
      flattenPositions: js.UndefOr[scala.Nothing],
      includeBatchInIndex: Boolean
    ) = this()
    def this(
      convInfo: Conv3DInfo,
      poolType: max,
      computePositions: Boolean,
      flattenPositions: Boolean,
      includeBatchInIndex: Boolean
    ) = this()
  }
}

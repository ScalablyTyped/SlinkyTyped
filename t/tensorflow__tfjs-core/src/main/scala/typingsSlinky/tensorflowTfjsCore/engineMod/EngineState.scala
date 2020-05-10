package typingsSlinky.tensorflowTfjsCore.engineMod

import typingsSlinky.std.WeakMap
import typingsSlinky.tensorflowTfjsCore.AnonBackend
import typingsSlinky.tensorflowTfjsCore.tapeMod.TapeNode
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedVariableMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EngineState extends js.Object {
  var activeProfile: ProfileInfo = js.native
  var activeScope: ScopeState = js.native
  var activeTape: js.Array[TapeNode] = js.native
  var gradientDepth: Double = js.native
  var kernelDepth: Double = js.native
  var nextScopeId: Double = js.native
  var nextTapeNodeId: Double = js.native
  var numBytes: Double = js.native
  var numDataBuffers: Double = js.native
  /**
    * Keeps track of the number of data moves during a kernel execution. We
    * maintain a stack since kernels can call other kernels, recursively.
    */
  var numDataMovesStack: js.Array[Double] = js.native
  var numStringTensors: Double = js.native
  var numTensors: Double = js.native
  var profiling: Boolean = js.native
  var registeredVariables: NamedVariableMap = js.native
  var scopeStack: js.Array[ScopeState] = js.native
  var tensorInfo: WeakMap[js.Object, AnonBackend] = js.native
  def dispose(): Unit = js.native
}

object EngineState {
  @scala.inline
  def apply(
    activeProfile: ProfileInfo,
    activeScope: ScopeState,
    activeTape: js.Array[TapeNode],
    dispose: () => Unit,
    gradientDepth: Double,
    kernelDepth: Double,
    nextScopeId: Double,
    nextTapeNodeId: Double,
    numBytes: Double,
    numDataBuffers: Double,
    numDataMovesStack: js.Array[Double],
    numStringTensors: Double,
    numTensors: Double,
    profiling: Boolean,
    registeredVariables: NamedVariableMap,
    scopeStack: js.Array[ScopeState],
    tensorInfo: WeakMap[js.Object, AnonBackend]
  ): EngineState = {
    val __obj = js.Dynamic.literal(activeProfile = activeProfile.asInstanceOf[js.Any], activeScope = activeScope.asInstanceOf[js.Any], activeTape = activeTape.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), gradientDepth = gradientDepth.asInstanceOf[js.Any], kernelDepth = kernelDepth.asInstanceOf[js.Any], nextScopeId = nextScopeId.asInstanceOf[js.Any], nextTapeNodeId = nextTapeNodeId.asInstanceOf[js.Any], numBytes = numBytes.asInstanceOf[js.Any], numDataBuffers = numDataBuffers.asInstanceOf[js.Any], numDataMovesStack = numDataMovesStack.asInstanceOf[js.Any], numStringTensors = numStringTensors.asInstanceOf[js.Any], numTensors = numTensors.asInstanceOf[js.Any], profiling = profiling.asInstanceOf[js.Any], registeredVariables = registeredVariables.asInstanceOf[js.Any], scopeStack = scopeStack.asInstanceOf[js.Any], tensorInfo = tensorInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineState]
  }
  @scala.inline
  implicit class EngineStateOps[Self <: EngineState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveProfile(value: ProfileInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveScope(value: ScopeState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveTape(value: js.Array[TapeNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGradientDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKernelDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextScopeId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextScopeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextTapeNodeId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextTapeNodeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumDataBuffers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numDataBuffers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumDataMovesStack(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numDataMovesStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumStringTensors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numStringTensors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumTensors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numTensors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfiling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profiling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegisteredVariables(value: NamedVariableMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeStack(value: js.Array[ScopeState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTensorInfo(value: WeakMap[js.Object, AnonBackend]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tensorInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.tensorflowTfjsCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.WeakMap
import typingsSlinky.tensorflowTfjsCore.anon.Backend
import typingsSlinky.tensorflowTfjsCore.anon.Error
import typingsSlinky.tensorflowTfjsCore.anon.Factory
import typingsSlinky.tensorflowTfjsCore.anon.GradFunc
import typingsSlinky.tensorflowTfjsCore.anon.GradsValue
import typingsSlinky.tensorflowTfjsCore.backendMod.BackendTimingInfo
import typingsSlinky.tensorflowTfjsCore.backendMod.DataMover
import typingsSlinky.tensorflowTfjsCore.backendMod.KernelBackend
import typingsSlinky.tensorflowTfjsCore.distTensorMod.DataId
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTensorMod.TensorTracker
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataValues
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.environmentMod.Environment
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.NamedAttrMap
import typingsSlinky.tensorflowTfjsCore.tapeMod.TapeNode
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.GradSaveFunc
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedVariableMap
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/engine", "ENGINE")
  @js.native
  val ENGINE_ : Engine = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/engine", "Engine")
  @js.native
  class Engine protected ()
    extends TensorTracker
       with DataMover {
    def this(ENV: Environment) = this()
    
    var ENV: Environment = js.native
    
    var addTapeNode: js.Any = js.native
    
    val backend: KernelBackend = js.native
    
    var backendInstance: js.Any = js.native
    
    var backendName: String = js.native
    
    def backendNames(): js.Array[String] = js.native
    
    var checkKernelForMemLeak: js.Any = js.native
    
    /**
      * This method is called instead of the public-facing tensor.clone() when
      * saving a tensor for backwards pass. It makes sure to add the clone
      * operation to the tape regardless of being called inside a kernel
      * execution.
      *
      * This method will go away once all kernels are modularized since we won't
      * need to turn off the tape inside runKernel().
      */
    @JSName("clone")
    var clone_FEngine: js.Any = js.native
    
    def customGrad[T /* <: Tensor[Rank] */](f: CustomGradientFunc[T]): js.Function1[/* repeated */ Tensor[Rank] | GradSaveFunc, T] = js.native
    
    var disposeRegisteredKernels: js.Any = js.native
    
    def disposeVariables(): Unit = js.native
    
    /**
      * End a scope. Use this with startScope() to achieve the same functionality
      * as scope() without the need for a function closure.
      */
    def endScope(): Unit = js.native
    def endScope(result: TensorContainer): Unit = js.native
    
    var endTape: js.Any = js.native
    
    def findBackend(backendName: String): KernelBackend = js.native
    
    def findBackendFactory(backendName: String): js.Function0[KernelBackend | js.Promise[KernelBackend]] = js.native
    
    var getSortedBackends: js.Any = js.native
    
    /**
      * Returns a list of tensors to save for a given gradient calculation.
      *
      * Returns undefined if their is no registered gradient for this kernel in the
      * gradient registry.
      *
      * @param kernelName name of kernel to look up gradient for.
      * @param inputs a map of input tensors.
      * @param outputs an array of output tensors from forward mode of kernel.
      */
    var getTensorsForGradient: js.Any = js.native
    
    /**
      * Returns gradients of `f` with respect to each of the `xs`. The gradients
      * returned are of the same length as `xs`, but some might be null if `f`
      * was not a function of that `x`. It also takes optional dy to multiply the
      * gradient, which defaults to `1`.
      */
    def gradients[T /* <: Tensor[Rank] */](f: js.Function0[T], xs: js.Array[Tensor[Rank]]): GradsValue[T] = js.native
    def gradients[T /* <: Tensor[Rank] */](f: js.Function0[T], xs: js.Array[Tensor[Rank]], dy: T): GradsValue[T] = js.native
    def gradients[T /* <: Tensor[Rank] */](f: js.Function0[T], xs: js.Array[Tensor[Rank]], dy: T, allowNoGradients: Boolean): GradsValue[T] = js.native
    def gradients[T /* <: Tensor[Rank] */](
      f: js.Function0[T],
      xs: js.Array[Tensor[Rank]],
      dy: js.UndefOr[scala.Nothing],
      allowNoGradients: Boolean
    ): GradsValue[T] = js.native
    
    def incRef(a: Tensor[Rank], backend: KernelBackend): Unit = js.native
    
    /**
      * Initializes a backend by looking up the backend name in the factory
      * registry and calling the factory method. Returns a boolean representing
      * whether the initialization of the backend suceeded. Throws an error if
      * there is no backend in the factory registry.
      */
    var initializeBackend: js.Any = js.native
    
    var initializeBackendsAndReturnBest: js.Any = js.native
    
    def isTapeOn(): Boolean = js.native
    
    def keep[T /* <: Tensor[Rank] */](result: T): T = js.native
    
    def makeTensor(values: DataValues, shape: js.Array[Double], dtype: DataType, backend: KernelBackend): Tensor[Rank] = js.native
    
    /**
      * Internal method used by backends. Makes a new tensor
      * that is a wrapper around an existing data id. It doesn't create
      * a new data id, only increments the ref count used in memory tracking.
      */
    def makeTensorFromDataId(dataId: DataId, shape: js.Array[Double], dtype: DataType): Tensor[Rank] = js.native
    def makeTensorFromDataId(dataId: DataId, shape: js.Array[Double], dtype: DataType, backend: KernelBackend): Tensor[Rank] = js.native
    
    def memory(): MemoryInfo = js.native
    
    var nextTensorId: js.Any = js.native
    
    var nextVariableId: js.Any = js.native
    
    var pendingBackendInit: js.Any = js.native
    
    var pendingBackendInitId: js.Any = js.native
    
    def profile(query: js.Function0[TensorContainer | js.Promise[TensorContainer]]): js.Promise[ProfileInfo] = js.native
    
    var profiler: js.Any = js.native
    
    def ready(): js.Promise[Unit] = js.native
    
    def registerBackend(backendName: String, factory: js.Function0[KernelBackend | js.Promise[KernelBackend]]): Boolean = js.native
    def registerBackend(
      backendName: String,
      factory: js.Function0[KernelBackend | js.Promise[KernelBackend]],
      priority: Double
    ): Boolean = js.native
    
    val registeredVariables: NamedVariableMap = js.native
    
    var registry: StringDictionary[KernelBackend] = js.native
    
    var registryFactory: StringDictionary[Factory] = js.native
    
    def removeBackend(backendName: String): Unit = js.native
    
    /**
      * Resets the engine state. Removes all backends but does not remove
      * registered backend factories.
      */
    def reset(): Unit = js.native
    
    /**
      * Execute a kernel with the given name and return the output tensor.
      *
      * @param kernelName The name of the kernel to execute.
      * @param inputs A map of input names to tensors.
      * @param attrs A map of attribute names to their values. An attribute is a
      *     primitive (non-tensor) input to the kernel.
      * @param inputsToSave A list of tensors, inputs to save for the backprop
      *     computation.
      * @param outputsToSave A list of booleans, specifying which output to save
      *     for the backprop computation. These are booleans since the output
      * tensors are not visible to the user.
      */
    def runKernel(kernelName: String, inputs: NamedTensorMap, attrs: NamedAttrMap): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    def runKernel(
      kernelName: String,
      inputs: NamedTensorMap,
      attrs: NamedAttrMap,
      inputsToSave: js.UndefOr[scala.Nothing],
      outputsToSave: js.Array[Boolean]
    ): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    def runKernel(
      kernelName: String,
      inputs: NamedTensorMap,
      attrs: NamedAttrMap,
      inputsToSave: js.Array[Tensor[Rank]]
    ): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    def runKernel(
      kernelName: String,
      inputs: NamedTensorMap,
      attrs: NamedAttrMap,
      inputsToSave: js.Array[Tensor[Rank]],
      outputsToSave: js.Array[Boolean]
    ): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    
    /**
      * @deprecated Use `runKernel` for newly added kernels. Keep using this method
      *     only for kernels that are not yet fully modularized.
      */
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](forwardFunc: ForwardFunc[T], inputs: I): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.UndefOr[scala.Nothing],
      kernelName: js.UndefOr[scala.Nothing],
      attrs: js.UndefOr[scala.Nothing],
      inputsToSave: js.UndefOr[scala.Nothing],
      outputsToSave: js.Array[Boolean]
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.UndefOr[scala.Nothing],
      kernelName: js.UndefOr[scala.Nothing],
      attrs: js.UndefOr[scala.Nothing],
      inputsToSave: js.Array[Tensor[Rank]]
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.UndefOr[scala.Nothing],
      kernelName: js.UndefOr[scala.Nothing],
      attrs: js.UndefOr[scala.Nothing],
      inputsToSave: js.Array[Tensor[Rank]],
      outputsToSave: js.Array[Boolean]
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.UndefOr[scala.Nothing],
      kernelName: js.UndefOr[scala.Nothing],
      attrs: NamedAttrMap
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.UndefOr[scala.Nothing],
      kernelName: js.UndefOr[scala.Nothing],
      attrs: NamedAttrMap,
      inputsToSave: js.UndefOr[scala.Nothing],
      outputsToSave: js.Array[Boolean]
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.UndefOr[scala.Nothing],
      kernelName: js.UndefOr[scala.Nothing],
      attrs: NamedAttrMap,
      inputsToSave: js.Array[Tensor[Rank]]
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.UndefOr[scala.Nothing],
      kernelName: js.UndefOr[scala.Nothing],
      attrs: NamedAttrMap,
      inputsToSave: js.Array[Tensor[Rank]],
      outputsToSave: js.Array[Boolean]
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.UndefOr[scala.Nothing],
      kernelName: String
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.UndefOr[scala.Nothing],
      kernelName: String,
      attrs: js.UndefOr[scala.Nothing],
      inputsToSave: js.UndefOr[scala.Nothing],
      outputsToSave: js.Array[Boolean]
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.UndefOr[scala.Nothing],
      kernelName: String,
      attrs: js.UndefOr[scala.Nothing],
      inputsToSave: js.Array[Tensor[Rank]]
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.UndefOr[scala.Nothing],
      kernelName: String,
      attrs: js.UndefOr[scala.Nothing],
      inputsToSave: js.Array[Tensor[Rank]],
      outputsToSave: js.Array[Boolean]
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.UndefOr[scala.Nothing],
      kernelName: String,
      attrs: NamedAttrMap
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.UndefOr[scala.Nothing],
      kernelName: String,
      attrs: NamedAttrMap,
      inputsToSave: js.UndefOr[scala.Nothing],
      outputsToSave: js.Array[Boolean]
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.UndefOr[scala.Nothing],
      kernelName: String,
      attrs: NamedAttrMap,
      inputsToSave: js.Array[Tensor[Rank]]
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.UndefOr[scala.Nothing],
      kernelName: String,
      attrs: NamedAttrMap,
      inputsToSave: js.Array[Tensor[Rank]],
      outputsToSave: js.Array[Boolean]
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.Function2[
          /* dy */ T, 
          /* saved */ js.Array[Tensor[Rank]], 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof I ]: (): I[P]}
      */ typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.Engine with TopLevel[I]
        ]
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.Function2[
          /* dy */ T, 
          /* saved */ js.Array[Tensor[Rank]], 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof I ]: (): I[P]}
      */ typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.Engine with TopLevel[I]
        ],
      kernelName: js.UndefOr[scala.Nothing],
      attrs: js.UndefOr[scala.Nothing],
      inputsToSave: js.UndefOr[scala.Nothing],
      outputsToSave: js.Array[Boolean]
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.Function2[
          /* dy */ T, 
          /* saved */ js.Array[Tensor[Rank]], 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof I ]: (): I[P]}
      */ typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.Engine with TopLevel[I]
        ],
      kernelName: js.UndefOr[scala.Nothing],
      attrs: js.UndefOr[scala.Nothing],
      inputsToSave: js.Array[Tensor[Rank]]
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.Function2[
          /* dy */ T, 
          /* saved */ js.Array[Tensor[Rank]], 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof I ]: (): I[P]}
      */ typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.Engine with TopLevel[I]
        ],
      kernelName: js.UndefOr[scala.Nothing],
      attrs: js.UndefOr[scala.Nothing],
      inputsToSave: js.Array[Tensor[Rank]],
      outputsToSave: js.Array[Boolean]
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.Function2[
          /* dy */ T, 
          /* saved */ js.Array[Tensor[Rank]], 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof I ]: (): I[P]}
      */ typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.Engine with TopLevel[I]
        ],
      kernelName: js.UndefOr[scala.Nothing],
      attrs: NamedAttrMap
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.Function2[
          /* dy */ T, 
          /* saved */ js.Array[Tensor[Rank]], 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof I ]: (): I[P]}
      */ typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.Engine with TopLevel[I]
        ],
      kernelName: js.UndefOr[scala.Nothing],
      attrs: NamedAttrMap,
      inputsToSave: js.UndefOr[scala.Nothing],
      outputsToSave: js.Array[Boolean]
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.Function2[
          /* dy */ T, 
          /* saved */ js.Array[Tensor[Rank]], 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof I ]: (): I[P]}
      */ typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.Engine with TopLevel[I]
        ],
      kernelName: js.UndefOr[scala.Nothing],
      attrs: NamedAttrMap,
      inputsToSave: js.Array[Tensor[Rank]]
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.Function2[
          /* dy */ T, 
          /* saved */ js.Array[Tensor[Rank]], 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof I ]: (): I[P]}
      */ typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.Engine with TopLevel[I]
        ],
      kernelName: js.UndefOr[scala.Nothing],
      attrs: NamedAttrMap,
      inputsToSave: js.Array[Tensor[Rank]],
      outputsToSave: js.Array[Boolean]
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.Function2[
          /* dy */ T, 
          /* saved */ js.Array[Tensor[Rank]], 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof I ]: (): I[P]}
      */ typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.Engine with TopLevel[I]
        ],
      kernelName: String
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.Function2[
          /* dy */ T, 
          /* saved */ js.Array[Tensor[Rank]], 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof I ]: (): I[P]}
      */ typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.Engine with TopLevel[I]
        ],
      kernelName: String,
      attrs: js.UndefOr[scala.Nothing],
      inputsToSave: js.UndefOr[scala.Nothing],
      outputsToSave: js.Array[Boolean]
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.Function2[
          /* dy */ T, 
          /* saved */ js.Array[Tensor[Rank]], 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof I ]: (): I[P]}
      */ typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.Engine with TopLevel[I]
        ],
      kernelName: String,
      attrs: js.UndefOr[scala.Nothing],
      inputsToSave: js.Array[Tensor[Rank]]
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.Function2[
          /* dy */ T, 
          /* saved */ js.Array[Tensor[Rank]], 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof I ]: (): I[P]}
      */ typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.Engine with TopLevel[I]
        ],
      kernelName: String,
      attrs: js.UndefOr[scala.Nothing],
      inputsToSave: js.Array[Tensor[Rank]],
      outputsToSave: js.Array[Boolean]
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.Function2[
          /* dy */ T, 
          /* saved */ js.Array[Tensor[Rank]], 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof I ]: (): I[P]}
      */ typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.Engine with TopLevel[I]
        ],
      kernelName: String,
      attrs: NamedAttrMap
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.Function2[
          /* dy */ T, 
          /* saved */ js.Array[Tensor[Rank]], 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof I ]: (): I[P]}
      */ typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.Engine with TopLevel[I]
        ],
      kernelName: String,
      attrs: NamedAttrMap,
      inputsToSave: js.UndefOr[scala.Nothing],
      outputsToSave: js.Array[Boolean]
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.Function2[
          /* dy */ T, 
          /* saved */ js.Array[Tensor[Rank]], 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof I ]: (): I[P]}
      */ typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.Engine with TopLevel[I]
        ],
      kernelName: String,
      attrs: NamedAttrMap,
      inputsToSave: js.Array[Tensor[Rank]]
    ): T = js.native
    def runKernelFunc[T /* <: Tensor[Rank] | js.Array[Tensor[Rank]] */, I /* <: NamedTensorMap */](
      forwardFunc: ForwardFunc[T],
      inputs: I,
      backwardsFunc: js.Function2[
          /* dy */ T, 
          /* saved */ js.Array[Tensor[Rank]], 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof I ]: (): I[P]}
      */ typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.Engine with TopLevel[I]
        ],
      kernelName: String,
      attrs: NamedAttrMap,
      inputsToSave: js.Array[Tensor[Rank]],
      outputsToSave: js.Array[Boolean]
    ): T = js.native
    
    /**
      * Saves tensors used in forward mode for use in backward mode.
      *
      * @param tensors the list of tensors to save.
      */
    var saveTensorsForBackwardMode: js.Any = js.native
    
    var scopedRun: js.Any = js.native
    
    def setBackend(backendName: String): js.Promise[Boolean] = js.native
    
    var setupRegisteredKernels: js.Any = js.native
    
    var shouldCheckForMemLeaks: js.Any = js.native
    
    /**
      * Start a scope. Use this with endScope() to achieve the same functionality
      * as scope() without the need for a function closure.
      */
    def startScope(): Unit = js.native
    def startScope(name: String): Unit = js.native
    
    var startTape: js.Any = js.native
    
    var state: EngineState = js.native
    
    def tidy[T /* <: TensorContainer */](nameOrFn: String): T = js.native
    def tidy[T /* <: TensorContainer */](nameOrFn: String, fn: ScopeFn[T]): T = js.native
    def tidy[T /* <: TensorContainer */](nameOrFn: ScopeFn[T]): T = js.native
    def tidy[T /* <: TensorContainer */](nameOrFn: ScopeFn[T], fn: ScopeFn[T]): T = js.native
    
    def time(query: js.Function0[Unit]): js.Promise[TimingInfo] = js.native
    
    /**
      * Tracks a Tensor in the current scope to be automatically cleaned up
      * when the current scope ends, and returns the value.
      *
      * @param result The Tensor to track in the current scope.
      */
    var track: js.Any = js.native
  }
  /* static members */
  object Engine {
    
    @JSImport("@tensorflow/tfjs-core/dist/engine", "Engine")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/engine", "Engine.nextTensorId")
    @js.native
    def nextTensorId: js.Any = js.native
    @scala.inline
    def nextTensorId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextTensorId")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-core/dist/engine", "Engine.nextVariableId")
    @js.native
    def nextVariableId: js.Any = js.native
    @scala.inline
    def nextVariableId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextVariableId")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/engine", "add")
  @js.native
  def add(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/engine", "getOrMakeEngine")
  @js.native
  def getOrMakeEngine(): Engine = js.native
  
  type CustomGradientFunc[T /* <: Tensor[Rank] */] = js.Function1[/* repeated */ Tensor[Rank] | GradSaveFunc, GradFunc[T]]
  
  @js.native
  trait EngineState extends StObject {
    
    var activeProfile: ProfileInfo = js.native
    
    var activeScope: ScopeState = js.native
    
    var activeTape: js.Array[TapeNode] = js.native
    
    def dispose(): Unit = js.native
    
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
    
    var tensorInfo: WeakMap[js.Object, Backend] = js.native
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
      tensorInfo: WeakMap[js.Object, Backend]
    ): EngineState = {
      val __obj = js.Dynamic.literal(activeProfile = activeProfile.asInstanceOf[js.Any], activeScope = activeScope.asInstanceOf[js.Any], activeTape = activeTape.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), gradientDepth = gradientDepth.asInstanceOf[js.Any], kernelDepth = kernelDepth.asInstanceOf[js.Any], nextScopeId = nextScopeId.asInstanceOf[js.Any], nextTapeNodeId = nextTapeNodeId.asInstanceOf[js.Any], numBytes = numBytes.asInstanceOf[js.Any], numDataBuffers = numDataBuffers.asInstanceOf[js.Any], numDataMovesStack = numDataMovesStack.asInstanceOf[js.Any], numStringTensors = numStringTensors.asInstanceOf[js.Any], numTensors = numTensors.asInstanceOf[js.Any], profiling = profiling.asInstanceOf[js.Any], registeredVariables = registeredVariables.asInstanceOf[js.Any], scopeStack = scopeStack.asInstanceOf[js.Any], tensorInfo = tensorInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[EngineState]
    }
    
    @scala.inline
    implicit class EngineStateMutableBuilder[Self <: EngineState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveProfile(value: ProfileInfo): Self = StObject.set(x, "activeProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveScope(value: ScopeState): Self = StObject.set(x, "activeScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveTape(value: js.Array[TapeNode]): Self = StObject.set(x, "activeTape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveTapeVarargs(value: TapeNode*): Self = StObject.set(x, "activeTape", js.Array(value :_*))
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGradientDepth(value: Double): Self = StObject.set(x, "gradientDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelDepth(value: Double): Self = StObject.set(x, "kernelDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextScopeId(value: Double): Self = StObject.set(x, "nextScopeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTapeNodeId(value: Double): Self = StObject.set(x, "nextTapeNodeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumBytes(value: Double): Self = StObject.set(x, "numBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumDataBuffers(value: Double): Self = StObject.set(x, "numDataBuffers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumDataMovesStack(value: js.Array[Double]): Self = StObject.set(x, "numDataMovesStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumDataMovesStackVarargs(value: Double*): Self = StObject.set(x, "numDataMovesStack", js.Array(value :_*))
      
      @scala.inline
      def setNumStringTensors(value: Double): Self = StObject.set(x, "numStringTensors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumTensors(value: Double): Self = StObject.set(x, "numTensors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfiling(value: Boolean): Self = StObject.set(x, "profiling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegisteredVariables(value: NamedVariableMap): Self = StObject.set(x, "registeredVariables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeStack(value: js.Array[ScopeState]): Self = StObject.set(x, "scopeStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeStackVarargs(value: ScopeState*): Self = StObject.set(x, "scopeStack", js.Array(value :_*))
      
      @scala.inline
      def setTensorInfo(value: WeakMap[js.Object, Backend]): Self = StObject.set(x, "tensorInfo", value.asInstanceOf[js.Any])
    }
  }
  
  type ForwardFunc[T] = js.Function2[/* backend */ KernelBackend, /* save */ js.UndefOr[GradSaveFunc], T]
  
  @js.native
  trait KernelInfo extends StObject {
    
    var bytesAdded: Double = js.native
    
    var extraInfo: String | js.Promise[String] = js.native
    
    var inputShapes: js.Array[js.Array[Double]] = js.native
    
    var kernelTimeMs: Double | Error | (js.Promise[Double | Error]) = js.native
    
    var name: String = js.native
    
    var outputShapes: js.Array[js.Array[Double]] = js.native
    
    var tensorsAdded: Double = js.native
    
    var totalBytesSnapshot: Double = js.native
    
    var totalTensorsSnapshot: Double = js.native
  }
  object KernelInfo {
    
    @scala.inline
    def apply(
      bytesAdded: Double,
      extraInfo: String | js.Promise[String],
      inputShapes: js.Array[js.Array[Double]],
      kernelTimeMs: Double | Error | (js.Promise[Double | Error]),
      name: String,
      outputShapes: js.Array[js.Array[Double]],
      tensorsAdded: Double,
      totalBytesSnapshot: Double,
      totalTensorsSnapshot: Double
    ): KernelInfo = {
      val __obj = js.Dynamic.literal(bytesAdded = bytesAdded.asInstanceOf[js.Any], extraInfo = extraInfo.asInstanceOf[js.Any], inputShapes = inputShapes.asInstanceOf[js.Any], kernelTimeMs = kernelTimeMs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputShapes = outputShapes.asInstanceOf[js.Any], tensorsAdded = tensorsAdded.asInstanceOf[js.Any], totalBytesSnapshot = totalBytesSnapshot.asInstanceOf[js.Any], totalTensorsSnapshot = totalTensorsSnapshot.asInstanceOf[js.Any])
      __obj.asInstanceOf[KernelInfo]
    }
    
    @scala.inline
    implicit class KernelInfoMutableBuilder[Self <: KernelInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytesAdded(value: Double): Self = StObject.set(x, "bytesAdded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraInfo(value: String | js.Promise[String]): Self = StObject.set(x, "extraInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputShapes(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "inputShapes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputShapesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "inputShapes", js.Array(value :_*))
      
      @scala.inline
      def setKernelTimeMs(value: Double | Error | (js.Promise[Double | Error])): Self = StObject.set(x, "kernelTimeMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputShapes(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "outputShapes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputShapesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "outputShapes", js.Array(value :_*))
      
      @scala.inline
      def setTensorsAdded(value: Double): Self = StObject.set(x, "tensorsAdded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalBytesSnapshot(value: Double): Self = StObject.set(x, "totalBytesSnapshot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalTensorsSnapshot(value: Double): Self = StObject.set(x, "totalTensorsSnapshot", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MemoryInfo extends StObject {
    
    var numBytes: Double = js.native
    
    var numDataBuffers: Double = js.native
    
    var numTensors: Double = js.native
    
    var reasons: js.Array[String] = js.native
    
    var unreliable: js.UndefOr[Boolean] = js.native
  }
  object MemoryInfo {
    
    @scala.inline
    def apply(numBytes: Double, numDataBuffers: Double, numTensors: Double, reasons: js.Array[String]): MemoryInfo = {
      val __obj = js.Dynamic.literal(numBytes = numBytes.asInstanceOf[js.Any], numDataBuffers = numDataBuffers.asInstanceOf[js.Any], numTensors = numTensors.asInstanceOf[js.Any], reasons = reasons.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemoryInfo]
    }
    
    @scala.inline
    implicit class MemoryInfoMutableBuilder[Self <: MemoryInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNumBytes(value: Double): Self = StObject.set(x, "numBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumDataBuffers(value: Double): Self = StObject.set(x, "numDataBuffers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumTensors(value: Double): Self = StObject.set(x, "numTensors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasons(value: js.Array[String]): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonsVarargs(value: String*): Self = StObject.set(x, "reasons", js.Array(value :_*))
      
      @scala.inline
      def setUnreliable(value: Boolean): Self = StObject.set(x, "unreliable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnreliableUndefined: Self = StObject.set(x, "unreliable", js.undefined)
    }
  }
  
  @js.native
  trait ProfileInfo extends StObject {
    
    var kernels: js.Array[KernelInfo] = js.native
    
    var newBytes: Double = js.native
    
    var newTensors: Double = js.native
    
    var peakBytes: Double = js.native
    
    var result: TensorContainer = js.native
  }
  object ProfileInfo {
    
    @scala.inline
    def apply(
      kernels: js.Array[KernelInfo],
      newBytes: Double,
      newTensors: Double,
      peakBytes: Double,
      result: TensorContainer
    ): ProfileInfo = {
      val __obj = js.Dynamic.literal(kernels = kernels.asInstanceOf[js.Any], newBytes = newBytes.asInstanceOf[js.Any], newTensors = newTensors.asInstanceOf[js.Any], peakBytes = peakBytes.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProfileInfo]
    }
    
    @scala.inline
    implicit class ProfileInfoMutableBuilder[Self <: ProfileInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKernels(value: js.Array[KernelInfo]): Self = StObject.set(x, "kernels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelsVarargs(value: KernelInfo*): Self = StObject.set(x, "kernels", js.Array(value :_*))
      
      @scala.inline
      def setNewBytes(value: Double): Self = StObject.set(x, "newBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewTensors(value: Double): Self = StObject.set(x, "newTensors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeakBytes(value: Double): Self = StObject.set(x, "peakBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: TensorContainer): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultFloat32Array(value: js.typedarray.Float32Array): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultInt32Array(value: js.typedarray.Int32Array): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  type ScopeFn[T /* <: TensorContainer */] = js.Function0[T]
  
  @js.native
  trait ScopeState extends StObject {
    
    var id: Double = js.native
    
    var name: String = js.native
    
    var track: js.Array[Tensor[Rank]] = js.native
  }
  object ScopeState {
    
    @scala.inline
    def apply(id: Double, name: String, track: js.Array[Tensor[Rank]]): ScopeState = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScopeState]
    }
    
    @scala.inline
    implicit class ScopeStateMutableBuilder[Self <: ScopeState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack(value: js.Array[Tensor[Rank]]): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackVarargs(value: Tensor[Rank]*): Self = StObject.set(x, "track", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TimingInfo extends BackendTimingInfo {
    
    var wallMs: Double = js.native
  }
  object TimingInfo {
    
    @scala.inline
    def apply(kernelMs: Double | Error, wallMs: Double): TimingInfo = {
      val __obj = js.Dynamic.literal(kernelMs = kernelMs.asInstanceOf[js.Any], wallMs = wallMs.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimingInfo]
    }
    
    @scala.inline
    implicit class TimingInfoMutableBuilder[Self <: TimingInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWallMs(value: Double): Self = StObject.set(x, "wallMs", value.asInstanceOf[js.Any])
    }
  }
}

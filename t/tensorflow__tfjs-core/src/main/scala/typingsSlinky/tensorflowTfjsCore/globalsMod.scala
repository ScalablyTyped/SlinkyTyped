package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.backendMod.KernelBackend
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.engineMod.Engine
import typingsSlinky.tensorflowTfjsCore.engineMod.MemoryInfo
import typingsSlinky.tensorflowTfjsCore.engineMod.ProfileInfo
import typingsSlinky.tensorflowTfjsCore.engineMod.ScopeFn
import typingsSlinky.tensorflowTfjsCore.engineMod.TimingInfo
import typingsSlinky.tensorflowTfjsCore.platformMod.Platform
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/globals", JSImport.Namespace)
@js.native
object globalsMod extends js.Object {
  
  def backend(): KernelBackend = js.native
  
  def deprecationWarn(msg: String): Unit = js.native
  
  def disableDeprecationWarnings(): Unit = js.native
  
  def dispose(container: TensorContainer): Unit = js.native
  
  def disposeVariables(): Unit = js.native
  
  def enableDebugMode(): Unit = js.native
  
  def enableProdMode(): Unit = js.native
  
  def engine(): Engine = js.native
  
  def findBackend(name: String): KernelBackend = js.native
  
  def findBackendFactory(name: String): js.Function0[KernelBackend | js.Promise[KernelBackend]] = js.native
  
  def getBackend(): String = js.native
  
  def keep[T /* <: Tensor[Rank] */](result: T): T = js.native
  
  def memory(): MemoryInfo = js.native
  
  def profile(f: js.Function0[TensorContainer | js.Promise[TensorContainer]]): js.Promise[ProfileInfo] = js.native
  
  def ready(): js.Promise[Unit] = js.native
  
  def registerBackend(name: String, factory: js.Function0[KernelBackend | js.Promise[KernelBackend]]): Boolean = js.native
  def registerBackend(name: String, factory: js.Function0[KernelBackend | js.Promise[KernelBackend]], priority: Double): Boolean = js.native
  
  def removeBackend(name: String): Unit = js.native
  
  def setBackend(backendName: String): js.Promise[Boolean] = js.native
  
  def setPlatform(platformName: String, platform: Platform): Unit = js.native
  
  def tidy[T /* <: TensorContainer */](nameOrFn: String): T = js.native
  def tidy[T /* <: TensorContainer */](nameOrFn: String, fn: ScopeFn[T]): T = js.native
  def tidy[T /* <: TensorContainer */](nameOrFn: ScopeFn[T]): T = js.native
  def tidy[T /* <: TensorContainer */](nameOrFn: ScopeFn[T], fn: ScopeFn[T]): T = js.native
  
  def time(f: js.Function0[Unit]): js.Promise[TimingInfo] = js.native
}

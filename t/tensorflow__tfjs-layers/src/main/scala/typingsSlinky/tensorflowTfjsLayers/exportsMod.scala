package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsCore.typesMod.IOHandler
import typingsSlinky.tensorflowTfjsCore.typesMod.LoadOptions
import typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.BaseCallbackConstructor
import typingsSlinky.tensorflowTfjsLayers.containerMod.ContainerArgs
import typingsSlinky.tensorflowTfjsLayers.inputLayerMod.InputConfig
import typingsSlinky.tensorflowTfjsLayers.modelsMod.Sequential
import typingsSlinky.tensorflowTfjsLayers.modelsMod.SequentialArgs
import typingsSlinky.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import typingsSlinky.tensorflowTfjsLayers.trainingMod.LayersModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/exports", JSImport.Namespace)
@js.native
object exportsMod extends js.Object {
  
  def input(config: InputConfig): SymbolicTensor = js.native
  
  def loadLayersModel(pathOrIOHandler: String): js.Promise[LayersModel] = js.native
  def loadLayersModel(pathOrIOHandler: String, options: LoadOptions): js.Promise[LayersModel] = js.native
  def loadLayersModel(pathOrIOHandler: IOHandler): js.Promise[LayersModel] = js.native
  def loadLayersModel(pathOrIOHandler: IOHandler, options: LoadOptions): js.Promise[LayersModel] = js.native
  
  def model(args: ContainerArgs): LayersModel = js.native
  
  def registerCallbackConstructor(verbosityLevel: Double, callbackConstructor: BaseCallbackConstructor): Unit = js.native
  
  def sequential(): Sequential = js.native
  def sequential(config: SequentialArgs): Sequential = js.native
}

package typingsSlinky.atTensorflowTfjsDashLayers

import typingsSlinky.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler
import typingsSlinky.atTensorflowTfjsDashCore.distIoTypesMod.LoadOptions
import typingsSlinky.atTensorflowTfjsDashLayers.distBaseUnderscoreCallbacksMod.BaseCallbackConstructor
import typingsSlinky.atTensorflowTfjsDashLayers.distEngineContainerMod.ContainerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distEngineInputUnderscoreLayerMod.InputConfig
import typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.SymbolicTensor
import typingsSlinky.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel
import typingsSlinky.atTensorflowTfjsDashLayers.distModelsMod.Sequential
import typingsSlinky.atTensorflowTfjsDashLayers.distModelsMod.SequentialArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/exports", JSImport.Namespace)
@js.native
object distExportsMod extends js.Object {
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


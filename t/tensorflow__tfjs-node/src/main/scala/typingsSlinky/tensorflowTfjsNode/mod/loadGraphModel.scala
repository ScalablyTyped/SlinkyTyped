package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsCore.typesMod.IOHandler
import typingsSlinky.tensorflowTfjsCore.typesMod.LoadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "loadGraphModel")
@js.native
object loadGraphModel extends js.Object {
  def apply(modelUrl: String): js.Promise[typingsSlinky.tensorflowTfjsConverter.graphModelMod.GraphModel] = js.native
  def apply(modelUrl: String, options: LoadOptions): js.Promise[typingsSlinky.tensorflowTfjsConverter.graphModelMod.GraphModel] = js.native
  def apply(modelUrl: IOHandler): js.Promise[typingsSlinky.tensorflowTfjsConverter.graphModelMod.GraphModel] = js.native
  def apply(modelUrl: IOHandler, options: LoadOptions): js.Promise[typingsSlinky.tensorflowTfjsConverter.graphModelMod.GraphModel] = js.native
}


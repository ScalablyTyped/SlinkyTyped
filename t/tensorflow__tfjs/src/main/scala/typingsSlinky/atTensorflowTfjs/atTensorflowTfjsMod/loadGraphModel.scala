package typingsSlinky.atTensorflowTfjs.atTensorflowTfjsMod

import typingsSlinky.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler
import typingsSlinky.atTensorflowTfjsDashCore.distIoTypesMod.LoadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "loadGraphModel")
@js.native
object loadGraphModel extends js.Object {
  def apply(modelUrl: String): js.Promise[
    typingsSlinky.atTensorflowTfjsDashConverter.distSrcExecutorGraphUnderscoreModelMod.GraphModel
  ] = js.native
  def apply(modelUrl: String, options: LoadOptions): js.Promise[
    typingsSlinky.atTensorflowTfjsDashConverter.distSrcExecutorGraphUnderscoreModelMod.GraphModel
  ] = js.native
  def apply(modelUrl: IOHandler): js.Promise[
    typingsSlinky.atTensorflowTfjsDashConverter.distSrcExecutorGraphUnderscoreModelMod.GraphModel
  ] = js.native
  def apply(modelUrl: IOHandler, options: LoadOptions): js.Promise[
    typingsSlinky.atTensorflowTfjsDashConverter.distSrcExecutorGraphUnderscoreModelMod.GraphModel
  ] = js.native
}


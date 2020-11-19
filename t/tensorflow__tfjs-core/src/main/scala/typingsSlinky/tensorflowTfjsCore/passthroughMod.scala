package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.typesMod.IOHandler
import typingsSlinky.tensorflowTfjsCore.typesMod.ModelArtifacts
import typingsSlinky.tensorflowTfjsCore.typesMod.SaveResult
import typingsSlinky.tensorflowTfjsCore.typesMod.TrainingConfig
import typingsSlinky.tensorflowTfjsCore.typesMod.WeightsManifestEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/io/passthrough", JSImport.Namespace)
@js.native
object passthroughMod extends js.Object {
  
  def fromMemory(modelArtifacts: js.Object): IOHandler = js.native
  def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.UndefOr[scala.Nothing],
    weightData: js.UndefOr[scala.Nothing],
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.UndefOr[scala.Nothing],
    weightData: js.typedarray.ArrayBuffer
  ): IOHandler = js.native
  def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.UndefOr[scala.Nothing],
    weightData: js.typedarray.ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  def fromMemory(modelArtifacts: js.Object, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = js.native
  def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.UndefOr[scala.Nothing],
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.typedarray.ArrayBuffer
  ): IOHandler = js.native
  def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.typedarray.ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  def fromMemory(modelArtifacts: ModelArtifacts): IOHandler = js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.UndefOr[scala.Nothing],
    weightData: js.UndefOr[scala.Nothing],
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.UndefOr[scala.Nothing],
    weightData: js.typedarray.ArrayBuffer
  ): IOHandler = js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.UndefOr[scala.Nothing],
    weightData: js.typedarray.ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  def fromMemory(modelArtifacts: ModelArtifacts, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.UndefOr[scala.Nothing],
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.typedarray.ArrayBuffer
  ): IOHandler = js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.typedarray.ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  
  def withSaveHandler(saveHandler: js.Function1[/* artifacts */ ModelArtifacts, js.Promise[SaveResult]]): IOHandler = js.native
}

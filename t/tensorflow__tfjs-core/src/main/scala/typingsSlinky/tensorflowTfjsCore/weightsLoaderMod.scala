package typingsSlinky.tensorflowTfjsCore

import org.scalajs.dom.experimental.RequestInit
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typingsSlinky.tensorflowTfjsCore.typesMod.LoadOptions
import typingsSlinky.tensorflowTfjsCore.typesMod.WeightsManifestConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/weights_loader", JSImport.Namespace)
@js.native
object weightsLoaderMod extends js.Object {
  def loadWeights(manifest: WeightsManifestConfig): js.Promise[NamedTensorMap] = js.native
  def loadWeights(manifest: WeightsManifestConfig, filePathPrefix: String): js.Promise[NamedTensorMap] = js.native
  def loadWeights(manifest: WeightsManifestConfig, filePathPrefix: String, weightNames: js.Array[String]): js.Promise[NamedTensorMap] = js.native
  def loadWeights(
    manifest: WeightsManifestConfig,
    filePathPrefix: String,
    weightNames: js.Array[String],
    requestInit: RequestInit
  ): js.Promise[NamedTensorMap] = js.native
  def loadWeightsAsArrayBuffer(fetchURLs: js.Array[String]): js.Promise[js.Array[scala.scalajs.js.typedarray.ArrayBuffer]] = js.native
  def loadWeightsAsArrayBuffer(fetchURLs: js.Array[String], loadOptions: LoadOptions): js.Promise[js.Array[scala.scalajs.js.typedarray.ArrayBuffer]] = js.native
  def weightsLoaderFactory(
    fetchWeightsFunction: js.Function1[
      /* fetchUrls */ js.Array[String], 
      js.Promise[js.Array[scala.scalajs.js.typedarray.ArrayBuffer]]
    ]
  ): js.Function3[
    /* manifest */ WeightsManifestConfig, 
    /* filePathPrefix */ js.UndefOr[String], 
    /* weightNames */ js.UndefOr[js.Array[String]], 
    js.Promise[NamedTensorMap]
  ] = js.native
}


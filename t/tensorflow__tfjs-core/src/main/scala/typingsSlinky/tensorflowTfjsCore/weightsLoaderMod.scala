package typingsSlinky.tensorflowTfjsCore

import org.scalajs.dom.experimental.RequestInit
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typingsSlinky.tensorflowTfjsCore.typesMod.LoadOptions
import typingsSlinky.tensorflowTfjsCore.typesMod.WeightsManifestConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object weightsLoaderMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/io/weights_loader", "loadWeights")
  @js.native
  def loadWeights(manifest: WeightsManifestConfig): js.Promise[NamedTensorMap] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/weights_loader", "loadWeights")
  @js.native
  def loadWeights(
    manifest: WeightsManifestConfig,
    filePathPrefix: js.UndefOr[scala.Nothing],
    weightNames: js.UndefOr[scala.Nothing],
    requestInit: RequestInit
  ): js.Promise[NamedTensorMap] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/weights_loader", "loadWeights")
  @js.native
  def loadWeights(
    manifest: WeightsManifestConfig,
    filePathPrefix: js.UndefOr[scala.Nothing],
    weightNames: js.Array[String]
  ): js.Promise[NamedTensorMap] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/weights_loader", "loadWeights")
  @js.native
  def loadWeights(
    manifest: WeightsManifestConfig,
    filePathPrefix: js.UndefOr[scala.Nothing],
    weightNames: js.Array[String],
    requestInit: RequestInit
  ): js.Promise[NamedTensorMap] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/weights_loader", "loadWeights")
  @js.native
  def loadWeights(manifest: WeightsManifestConfig, filePathPrefix: String): js.Promise[NamedTensorMap] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/weights_loader", "loadWeights")
  @js.native
  def loadWeights(
    manifest: WeightsManifestConfig,
    filePathPrefix: String,
    weightNames: js.UndefOr[scala.Nothing],
    requestInit: RequestInit
  ): js.Promise[NamedTensorMap] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/weights_loader", "loadWeights")
  @js.native
  def loadWeights(manifest: WeightsManifestConfig, filePathPrefix: String, weightNames: js.Array[String]): js.Promise[NamedTensorMap] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/weights_loader", "loadWeights")
  @js.native
  def loadWeights(
    manifest: WeightsManifestConfig,
    filePathPrefix: String,
    weightNames: js.Array[String],
    requestInit: RequestInit
  ): js.Promise[NamedTensorMap] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/weights_loader", "loadWeightsAsArrayBuffer")
  @js.native
  def loadWeightsAsArrayBuffer(fetchURLs: js.Array[String]): js.Promise[js.Array[js.typedarray.ArrayBuffer]] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/weights_loader", "loadWeightsAsArrayBuffer")
  @js.native
  def loadWeightsAsArrayBuffer(fetchURLs: js.Array[String], loadOptions: LoadOptions): js.Promise[js.Array[js.typedarray.ArrayBuffer]] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/weights_loader", "weightsLoaderFactory")
  @js.native
  def weightsLoaderFactory(
    fetchWeightsFunction: js.Function1[/* fetchUrls */ js.Array[String], js.Promise[js.Array[js.typedarray.ArrayBuffer]]]
  ): js.Function3[
    /* manifest */ WeightsManifestConfig, 
    /* filePathPrefix */ js.UndefOr[String], 
    /* weightNames */ js.UndefOr[js.Array[String]], 
    js.Promise[NamedTensorMap]
  ] = js.native
}

package typingsSlinky.tensorflowTfjsNode.anon

import org.scalajs.dom.experimental.RequestInit
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typingsSlinky.tensorflowTfjsCore.typesMod.WeightsManifestConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallManifestFilePathPrefixWeightNamesRequestInit extends js.Object {
  def apply(manifest: WeightsManifestConfig): js.Promise[NamedTensorMap] = js.native
  def apply(
    manifest: WeightsManifestConfig,
    filePathPrefix: js.UndefOr[scala.Nothing],
    weightNames: js.UndefOr[scala.Nothing],
    requestInit: RequestInit
  ): js.Promise[NamedTensorMap] = js.native
  def apply(
    manifest: WeightsManifestConfig,
    filePathPrefix: js.UndefOr[scala.Nothing],
    weightNames: js.Array[String]
  ): js.Promise[NamedTensorMap] = js.native
  def apply(
    manifest: WeightsManifestConfig,
    filePathPrefix: js.UndefOr[scala.Nothing],
    weightNames: js.Array[String],
    requestInit: RequestInit
  ): js.Promise[NamedTensorMap] = js.native
  def apply(manifest: WeightsManifestConfig, filePathPrefix: String): js.Promise[NamedTensorMap] = js.native
  def apply(
    manifest: WeightsManifestConfig,
    filePathPrefix: String,
    weightNames: js.UndefOr[scala.Nothing],
    requestInit: RequestInit
  ): js.Promise[NamedTensorMap] = js.native
  def apply(manifest: WeightsManifestConfig, filePathPrefix: String, weightNames: js.Array[String]): js.Promise[NamedTensorMap] = js.native
  def apply(
    manifest: WeightsManifestConfig,
    filePathPrefix: String,
    weightNames: js.Array[String],
    requestInit: RequestInit
  ): js.Promise[NamedTensorMap] = js.native
}


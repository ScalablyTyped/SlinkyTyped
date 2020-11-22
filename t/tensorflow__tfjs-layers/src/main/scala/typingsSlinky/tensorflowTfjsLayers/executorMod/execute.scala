package typingsSlinky.tensorflowTfjsLayers.executorMod

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsLayers.distTypesMod.Kwargs
import typingsSlinky.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/engine/executor", "execute")
@js.native
object execute extends js.Object {
  
  def apply(fetches: js.Array[SymbolicTensor], feedDict: FeedDict): Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]]) = js.native
  def apply(
    fetches: js.Array[SymbolicTensor],
    feedDict: FeedDict,
    kwargs: js.UndefOr[scala.Nothing],
    probe: ExecutionProbe
  ): Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]]) = js.native
  def apply(fetches: js.Array[SymbolicTensor], feedDict: FeedDict, kwargs: Kwargs): Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]]) = js.native
  def apply(fetches: js.Array[SymbolicTensor], feedDict: FeedDict, kwargs: Kwargs, probe: ExecutionProbe): Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]]) = js.native
  def apply(fetches: SymbolicTensor, feedDict: FeedDict): Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]]) = js.native
  def apply(
    fetches: SymbolicTensor,
    feedDict: FeedDict,
    kwargs: js.UndefOr[scala.Nothing],
    probe: ExecutionProbe
  ): Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]]) = js.native
  def apply(fetches: SymbolicTensor, feedDict: FeedDict, kwargs: Kwargs): Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]]) = js.native
  def apply(fetches: SymbolicTensor, feedDict: FeedDict, kwargs: Kwargs, probe: ExecutionProbe): Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]]) = js.native
}

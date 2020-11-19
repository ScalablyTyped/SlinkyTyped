package typingsSlinky.tensorflowTfjsCore.kernelRegistryMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tapeMod.NamedGradientMap
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GradConfig extends js.Object {
  
  def gradFunc(dy: js.Array[Tensor[Rank]], saved: js.Array[Tensor[Rank]], attrs: NamedAttrMap): NamedGradientMap = js.native
  def gradFunc(dy: Tensor[Rank], saved: js.Array[Tensor[Rank]], attrs: NamedAttrMap): NamedGradientMap = js.native
  @JSName("gradFunc")
  var gradFunc_Original: GradFunc = js.native
  
  var inputsToSave: js.UndefOr[js.Array[String]] = js.native
  
  var kernelName: String = js.native
  
  var outputsToSave: js.UndefOr[js.Array[Boolean]] = js.native
  
  var saveAllInputs: js.UndefOr[Boolean] = js.native
}

package typingsSlinky.tensorflowTfjs.indexWithPolyfillsMod

import typingsSlinky.tensorflowTfjsLayers.regularizersMod.L1Args
import typingsSlinky.tensorflowTfjsLayers.regularizersMod.L1L2Args
import typingsSlinky.tensorflowTfjsLayers.regularizersMod.L2Args
import typingsSlinky.tensorflowTfjsLayers.regularizersMod.Regularizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "regularizers")
@js.native
object regularizers extends js.Object {
  
  def l1(): Regularizer = js.native
  def l1(config: L1Args): Regularizer = js.native
  
  def l1l2(): Regularizer = js.native
  def l1l2(config: L1L2Args): Regularizer = js.native
  
  def l2(): Regularizer = js.native
  def l2(config: L2Args): Regularizer = js.native
}

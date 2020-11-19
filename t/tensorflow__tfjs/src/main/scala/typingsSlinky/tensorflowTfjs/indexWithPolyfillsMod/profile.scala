package typingsSlinky.tensorflowTfjs.indexWithPolyfillsMod

import typingsSlinky.tensorflowTfjsCore.engineMod.ProfileInfo
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "profile")
@js.native
object profile extends js.Object {
  
  def apply(f: js.Function0[TensorContainer]): js.Promise[ProfileInfo] = js.native
}

package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.anon.TfGlobals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/global_util", JSImport.Namespace)
@js.native
object globalUtilMod extends js.Object {
  
  def getGlobal[T](key: String, init: js.Function0[T]): T = js.native
  
  def getGlobalNamespace(): TfGlobals = js.native
}

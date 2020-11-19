package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.transitionServiceMod.TransitionService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core/lib/hooks/resolve", JSImport.Namespace)
@js.native
object resolveMod extends js.Object {
  
  val RESOLVE_HOOK_PRIORITY: /* 1000 */ Double = js.native
  
  def registerEagerResolvePath(transitionService: TransitionService): js.Function = js.native
  
  def registerLazyResolveState(transitionService: TransitionService): js.Function = js.native
  
  def registerResolveRemaining(transitionService: TransitionService): js.Function = js.native
}

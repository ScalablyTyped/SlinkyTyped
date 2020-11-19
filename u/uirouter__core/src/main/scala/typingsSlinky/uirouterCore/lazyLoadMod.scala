package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.stateInterfaceMod.LazyLoadResult
import typingsSlinky.uirouterCore.stateInterfaceMod.StateDeclaration
import typingsSlinky.uirouterCore.transitionServiceMod.TransitionService
import typingsSlinky.uirouterCore.transitionTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core/lib/hooks/lazyLoad", JSImport.Namespace)
@js.native
object lazyLoadMod extends js.Object {
  
  def lazyLoadState(transition: Transition, state: StateDeclaration): js.Promise[LazyLoadResult] = js.native
  
  def registerLazyLoadHook(transitionService: TransitionService): js.Function = js.native
}

package typingsSlinky.atUirouterCore

import typingsSlinky.atUirouterCore.libStateInterfaceMod.LazyLoadResult
import typingsSlinky.atUirouterCore.libStateInterfaceMod.StateDeclaration
import typingsSlinky.atUirouterCore.libTransitionTransitionMod.Transition
import typingsSlinky.atUirouterCore.libTransitionTransitionServiceMod.TransitionService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/hooks/lazyLoad", JSImport.Namespace)
@js.native
object libHooksLazyLoadMod extends js.Object {
  def lazyLoadState(transition: Transition, state: StateDeclaration): js.Promise[LazyLoadResult] = js.native
  def registerLazyLoadHook(transitionService: TransitionService): js.Function = js.native
}


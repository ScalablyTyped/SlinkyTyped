package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.transitionServiceMod.TransitionService
import typingsSlinky.uirouterCore.transitionTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core/lib/hooks/coreResolvables", JSImport.Namespace)
@js.native
object coreResolvablesMod extends js.Object {
  
  def registerAddCoreResolvables(transitionService: TransitionService): js.Function = js.native
  
  def treeChangesCleanup(trans: Transition): Unit = js.native
}

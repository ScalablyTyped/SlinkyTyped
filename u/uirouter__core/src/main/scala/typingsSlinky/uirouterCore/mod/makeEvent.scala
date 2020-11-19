package typingsSlinky.uirouterCore.mod

import typingsSlinky.uirouterCore.transitionInterfaceMod.IHookRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core", "makeEvent")
@js.native
object makeEvent extends js.Object {
  
  def apply(
    registry: IHookRegistry,
    transitionService: typingsSlinky.uirouterCore.transitionServiceMod.TransitionService,
    eventType: typingsSlinky.uirouterCore.transitionEventTypeMod.TransitionEventType
  ): js.Function3[
    /* matchObject */ js.Any, 
    /* callback */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    _
  ] = js.native
}

package typingsSlinky.vueRouter.routerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NavigationFailureType extends StObject
@JSImport("vue-router/types/router", "NavigationFailureType")
@js.native
object NavigationFailureType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NavigationFailureType with Double] = js.native
  
  @js.native
  sealed trait aborted extends NavigationFailureType
  /* 4 */ val aborted: typingsSlinky.vueRouter.routerMod.NavigationFailureType.aborted with Double = js.native
  
  @js.native
  sealed trait cancelled extends NavigationFailureType
  /* 8 */ val cancelled: typingsSlinky.vueRouter.routerMod.NavigationFailureType.cancelled with Double = js.native
  
  @js.native
  sealed trait duplicated extends NavigationFailureType
  /* 16 */ val duplicated: typingsSlinky.vueRouter.routerMod.NavigationFailureType.duplicated with Double = js.native
  
  @js.native
  sealed trait redirected extends NavigationFailureType
  /* 2 */ val redirected: typingsSlinky.vueRouter.routerMod.NavigationFailureType.redirected with Double = js.native
}

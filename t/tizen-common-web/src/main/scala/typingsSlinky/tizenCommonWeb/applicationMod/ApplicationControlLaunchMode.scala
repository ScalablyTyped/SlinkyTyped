package typingsSlinky.tizenCommonWeb.applicationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApplicationControlLaunchMode extends StObject
@JSImport("tizen-common-web/application", "ApplicationControlLaunchMode")
@js.native
object ApplicationControlLaunchMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ApplicationControlLaunchMode with String] = js.native
  
  @js.native
  sealed trait GROUP extends ApplicationControlLaunchMode
  /* "GROUP" */ val GROUP: typingsSlinky.tizenCommonWeb.applicationMod.ApplicationControlLaunchMode.GROUP with String = js.native
  
  @js.native
  sealed trait SINGLE extends ApplicationControlLaunchMode
  /* "SINGLE" */ val SINGLE: typingsSlinky.tizenCommonWeb.applicationMod.ApplicationControlLaunchMode.SINGLE with String = js.native
}

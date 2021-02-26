package typingsSlinky.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemInfoProfile extends StObject
@JSImport("tizen-common-web/systeminfo", "SystemInfoProfile")
@js.native
object SystemInfoProfile extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoProfile with String] = js.native
  
  @js.native
  sealed trait MOBILE extends SystemInfoProfile
  /* "MOBILE" */ val MOBILE: typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoProfile.MOBILE with String = js.native
  
  @js.native
  sealed trait MOBILE_FULL extends SystemInfoProfile
  /* "MOBILE_FULL" */ val MOBILE_FULL: typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoProfile.MOBILE_FULL with String = js.native
  
  @js.native
  sealed trait MOBILE_WEB extends SystemInfoProfile
  /* "MOBILE_WEB" */ val MOBILE_WEB: typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoProfile.MOBILE_WEB with String = js.native
  
  @js.native
  sealed trait TV extends SystemInfoProfile
  /* "TV" */ val TV: typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoProfile.TV with String = js.native
  
  @js.native
  sealed trait WEARABLE extends SystemInfoProfile
  /* "WEARABLE" */ val WEARABLE: typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoProfile.WEARABLE with String = js.native
}

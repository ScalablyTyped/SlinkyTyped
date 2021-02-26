package typingsSlinky.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemInfoNetworkIpMode extends StObject
@JSImport("tizen-common-web/systeminfo", "SystemInfoNetworkIpMode")
@js.native
object SystemInfoNetworkIpMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoNetworkIpMode with String] = js.native
  
  @js.native
  sealed trait AUTO extends SystemInfoNetworkIpMode
  /* "AUTO" */ val AUTO: typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoNetworkIpMode.AUTO with String = js.native
  
  @js.native
  sealed trait DYNAMIC extends SystemInfoNetworkIpMode
  /* "DYNAMIC" */ val DYNAMIC: typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoNetworkIpMode.DYNAMIC with String = js.native
  
  @js.native
  sealed trait FIXED extends SystemInfoNetworkIpMode
  /* "FIXED" */ val FIXED: typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoNetworkIpMode.FIXED with String = js.native
  
  @js.native
  sealed trait NONE extends SystemInfoNetworkIpMode
  /* "NONE" */ val NONE: typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoNetworkIpMode.NONE with String = js.native
  
  @js.native
  sealed trait STATIC extends SystemInfoNetworkIpMode
  /* "STATIC" */ val STATIC: typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoNetworkIpMode.STATIC with String = js.native
}

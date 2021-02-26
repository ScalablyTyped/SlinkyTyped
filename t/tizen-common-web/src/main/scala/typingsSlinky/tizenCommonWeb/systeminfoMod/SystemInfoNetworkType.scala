package typingsSlinky.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemInfoNetworkType extends StObject
@JSImport("tizen-common-web/systeminfo", "SystemInfoNetworkType")
@js.native
object SystemInfoNetworkType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoNetworkType with String] = js.native
  
  @js.native
  sealed trait `2Dot5G` extends SystemInfoNetworkType
  /* "2.5G" */ val `2Dot5G`: typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoNetworkType.`2Dot5G` with String = js.native
  
  @js.native
  sealed trait `2G` extends SystemInfoNetworkType
  /* "2G" */ val `2G`: typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoNetworkType.`2G` with String = js.native
  
  @js.native
  sealed trait `3G` extends SystemInfoNetworkType
  /* "3G" */ val `3G`: typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoNetworkType.`3G` with String = js.native
  
  @js.native
  sealed trait `4G` extends SystemInfoNetworkType
  /* "4G" */ val `4G`: typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoNetworkType.`4G` with String = js.native
  
  @js.native
  sealed trait ETHERNET extends SystemInfoNetworkType
  /* "ETHERNET" */ val ETHERNET: typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoNetworkType.ETHERNET with String = js.native
  
  @js.native
  sealed trait NET_PROXY extends SystemInfoNetworkType
  /* "NET_PROXY" */ val NET_PROXY: typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoNetworkType.NET_PROXY with String = js.native
  
  @js.native
  sealed trait NONE extends SystemInfoNetworkType
  /* "NONE" */ val NONE: typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoNetworkType.NONE with String = js.native
  
  @js.native
  sealed trait UNKNOWN extends SystemInfoNetworkType
  /* "UNKNOWN" */ val UNKNOWN: typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoNetworkType.UNKNOWN with String = js.native
  
  @js.native
  sealed trait WIFI extends SystemInfoNetworkType
  /* "WIFI" */ val WIFI: typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoNetworkType.WIFI with String = js.native
}

package typingsSlinky.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemInfoWifiEncryptionType extends StObject
@JSImport("tizen-common-web/systeminfo", "SystemInfoWifiEncryptionType")
@js.native
object SystemInfoWifiEncryptionType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoWifiEncryptionType with String] = js.native
  
  @js.native
  sealed trait AES extends SystemInfoWifiEncryptionType
  /* "AES" */ val AES: typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoWifiEncryptionType.AES with String = js.native
  
  @js.native
  sealed trait NONE extends SystemInfoWifiEncryptionType
  /* "NONE" */ val NONE: typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoWifiEncryptionType.NONE with String = js.native
  
  @js.native
  sealed trait TKIP extends SystemInfoWifiEncryptionType
  /* "TKIP" */ val TKIP: typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoWifiEncryptionType.TKIP with String = js.native
  
  @js.native
  sealed trait TKIP_AES_MIXED extends SystemInfoWifiEncryptionType
  /* "TKIP_AES_MIXED" */ val TKIP_AES_MIXED: typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoWifiEncryptionType.TKIP_AES_MIXED with String = js.native
  
  @js.native
  sealed trait WEP extends SystemInfoWifiEncryptionType
  /* "WEP" */ val WEP: typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoWifiEncryptionType.WEP with String = js.native
}

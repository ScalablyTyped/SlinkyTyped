package typingsSlinky.tizenCommonWeb.systeminfoMod

import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.AES
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.AUTO
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.DYNAMIC
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.EAP
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.FIXED
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.NONE
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.STATIC
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.TKIP
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.TKIP_AES_MIXED
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.WEP
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.WPA2_PSK
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.WPA_PSK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemInfoWifiNetwork extends SystemInfoProperty {
  
  /**
    * Represents the DNS address of this connection.
    *
    * It is written in 255.255.255.255 format.
    *
    * @since 2.4
    */
  val dns: String = js.native
  
  /**
    * Represents this connection's encryption type.
    *
    * @since 2.4
    */
  val encryptionType: SystemInfoWifiEncryptionType | NONE | WEP | TKIP | AES | TKIP_AES_MIXED = js.native
  
  /**
    * Represents the gateway of this connection.
    *
    * It is written in 255.255.255.255 format.
    *
    * @since 2.4
    */
  val gateway: String = js.native
  
  /**
    * Represents the IPv4 address of the Wi-Fi network.
    */
  val ipAddress: String = js.native
  
  /**
    * Represents this connection's IP configuration type.
    *
    * @since 2.4
    */
  val ipMode: SystemInfoNetworkIpMode | NONE | STATIC | DYNAMIC | AUTO | FIXED = js.native
  
  /**
    * Represents the IPv6 address of the Wi-Fi network.
    *
    * @since 2.0
    */
  val ipv6Address: String = js.native
  
  /**
    * Represents the MAC address of the Wi-Fi interface.
    *
    * It is written in MM:MM:MM:SS:SS:SS format.
    *
    * @since 2.3
    */
  val macAddress: String = js.native
  
  /**
    * Represents this connection's security mode.
    *
    * @since 2.4
    */
  val securityMode: SystemInfoWifiSecurityMode | NONE | WEP | WPA_PSK | WPA2_PSK | EAP = js.native
  
  /**
    * This connection's signal strength, as a normalized value between 0 (no signal detected) and 1 (the level is at its maximum value).
    */
  val signalStrength: Double = js.native
  
  /**
    * Represents the SSID of the Wi-Fi network.
    */
  val ssid: String = js.native
  
  /**
    * Represents the status (ON or OFF) of the Wi-Fi interface.
    */
  val status: String = js.native
  
  /**
    * Represents the subnet mask of this connection.
    *
    * It is written in 255.255.255.255 format.
    * @since 2.4
    */
  val subnetMask: String = js.native
}
object SystemInfoWifiNetwork {
  
  @scala.inline
  def apply(
    dns: String,
    encryptionType: SystemInfoWifiEncryptionType | NONE | WEP | TKIP | AES | TKIP_AES_MIXED,
    gateway: String,
    ipAddress: String,
    ipMode: SystemInfoNetworkIpMode | NONE | STATIC | DYNAMIC | AUTO | FIXED,
    ipv6Address: String,
    macAddress: String,
    securityMode: SystemInfoWifiSecurityMode | NONE | WEP | WPA_PSK | WPA2_PSK | EAP,
    signalStrength: Double,
    ssid: String,
    status: String,
    subnetMask: String
  ): SystemInfoWifiNetwork = {
    val __obj = js.Dynamic.literal(dns = dns.asInstanceOf[js.Any], encryptionType = encryptionType.asInstanceOf[js.Any], gateway = gateway.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], ipMode = ipMode.asInstanceOf[js.Any], ipv6Address = ipv6Address.asInstanceOf[js.Any], macAddress = macAddress.asInstanceOf[js.Any], securityMode = securityMode.asInstanceOf[js.Any], signalStrength = signalStrength.asInstanceOf[js.Any], ssid = ssid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subnetMask = subnetMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoWifiNetwork]
  }
  
  @scala.inline
  implicit class SystemInfoWifiNetworkMutableBuilder[Self <: SystemInfoWifiNetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDns(value: String): Self = StObject.set(x, "dns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionType(value: SystemInfoWifiEncryptionType | NONE | WEP | TKIP | AES | TKIP_AES_MIXED): Self = StObject.set(x, "encryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpMode(value: SystemInfoNetworkIpMode | NONE | STATIC | DYNAMIC | AUTO | FIXED): Self = StObject.set(x, "ipMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6Address(value: String): Self = StObject.set(x, "ipv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacAddress(value: String): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityMode(value: SystemInfoWifiSecurityMode | NONE | WEP | WPA_PSK | WPA2_PSK | EAP): Self = StObject.set(x, "securityMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalStrength(value: Double): Self = StObject.set(x, "signalStrength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsid(value: String): Self = StObject.set(x, "ssid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetMask(value: String): Self = StObject.set(x, "subnetMask", value.asInstanceOf[js.Any])
  }
}

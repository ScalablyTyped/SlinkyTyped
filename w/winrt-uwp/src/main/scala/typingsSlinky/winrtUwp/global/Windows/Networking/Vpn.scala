package typingsSlinky.winrtUwp.global.Windows.Networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The functionality described in this topic is not available to all Windows and Windows Phone apps. For your code to call these APIs, Microsoft must approve your use of them and provision your developer account. Otherwise the calls will fail at runtime. */
@JSGlobal("Windows.Networking.Vpn")
@js.native
object Vpn extends js.Object {
  
  /** Specifies the type of AppId understood by the VPN platform. */
  @js.native
  object VpnAppIdType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnAppIdType with Double] = js.native
    
    /* 2 */ val filePath: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnAppIdType.filePath with Double = js.native
    
    /* 1 */ val fullyQualifiedBinaryName: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnAppIdType.fullyQualifiedBinaryName with Double = js.native
    
    /* 0 */ val packageFamilyName: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnAppIdType.packageFamilyName with Double = js.native
  }
  
  /** Specifies the type of authentication methods allowed by the operating system native VPN protocols. */
  @js.native
  object VpnAuthenticationMethod extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnAuthenticationMethod with Double
      ] = js.native
    
    /* 2 */ val certificate: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnAuthenticationMethod.certificate with Double = js.native
    
    /* 1 */ val eap: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnAuthenticationMethod.eap with Double = js.native
    
    /* 0 */ val mschapv2: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnAuthenticationMethod.mschapv2 with Double = js.native
    
    /* 3 */ val presharedKey: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnAuthenticationMethod.presharedKey with Double = js.native
  }
  
  /** Specifies the type of activity events. */
  @js.native
  object VpnChannelActivityEventType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnChannelActivityEventType with Double
      ] = js.native
    
    /* 1 */ val active: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnChannelActivityEventType.active with Double = js.native
    
    /* 0 */ val idle: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnChannelActivityEventType.idle with Double = js.native
  }
  
  /** Specifies the values defining whether a requested credential is a retry case, or should be used for single sign on. */
  @js.native
  object VpnChannelRequestCredentialsOptions extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnChannelRequestCredentialsOptions with Double
      ] = js.native
    
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnChannelRequestCredentialsOptions.none with Double = js.native
    
    /* 1 */ val retrying: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnChannelRequestCredentialsOptions.retrying with Double = js.native
    
    /* 2 */ val useForSingleSignIn: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnChannelRequestCredentialsOptions.useForSingleSignIn with Double = js.native
  }
  
  /** Specifies the types of credentials that can be requested by the VPN platform. */
  @js.native
  object VpnCredentialType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnCredentialType with Double] = js.native
    
    /* 5 */ val protectedCertificate: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnCredentialType.protectedCertificate with Double = js.native
    
    /* 4 */ val smartCard: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnCredentialType.smartCard with Double = js.native
    
    /* 6 */ val unProtectedCertificate: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnCredentialType.unProtectedCertificate with Double = js.native
    
    /* 1 */ val usernameOtpPin: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnCredentialType.usernameOtpPin with Double = js.native
    
    /* 0 */ val usernamePassword: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnCredentialType.usernamePassword with Double = js.native
    
    /* 2 */ val usernamePasswordAndPin: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnCredentialType.usernamePasswordAndPin with Double = js.native
    
    /* 3 */ val usernamePasswordChange: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnCredentialType.usernamePasswordChange with Double = js.native
  }
  
  /** VpnDataPathType is not supported and may be altered or unavailable in the future. */
  @js.native
  object VpnDataPathType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnDataPathType with Double] = js.native
    
    /* 1 */ val receive: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnDataPathType.receive with Double = js.native
    
    /* 0 */ val send: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnDataPathType.send with Double = js.native
  }
  
  /** Describes whether a name is a domain name suffix or a fully qualified domain name. */
  @js.native
  object VpnDomainNameType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnDomainNameType with Double] = js.native
    
    /* 1 */ val fullyQualified: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnDomainNameType.fullyQualified with Double = js.native
    
    /* 2 */ val reserved: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnDomainNameType.reserved with Double = js.native
    
    /* 0 */ val suffix: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnDomainNameType.suffix with Double = js.native
  }
  
  /** Specifies the IP protocols (numeric values). */
  @js.native
  object VpnIPProtocol extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnIPProtocol with Double] = js.native
    
    /* 3 */ val icmp: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnIPProtocol.icmp with Double = js.native
    
    /* 5 */ val igmp: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnIPProtocol.igmp with Double = js.native
    
    /* 4 */ val ipv6Icmp: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnIPProtocol.ipv6Icmp with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnIPProtocol.none with Double = js.native
    
    /* 6 */ val pgm: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnIPProtocol.pgm with Double = js.native
    
    /* 1 */ val tcp: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnIPProtocol.tcp with Double = js.native
    
    /* 2 */ val udp: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnIPProtocol.udp with Double = js.native
  }
  
  /** Describes the known VPN management errors. */
  @js.native
  object VpnManagementErrorStatus extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnManagementErrorStatus with Double
      ] = js.native
    
    /* 5 */ val accessDenied: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnManagementErrorStatus.accessDenied with Double = js.native
    
    /* 2 */ val invalidXmlSyntax: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnManagementErrorStatus.invalidXmlSyntax with Double = js.native
    
    /* 0 */ val ok: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnManagementErrorStatus.ok with Double = js.native
    
    /* 1 */ val other: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnManagementErrorStatus.other with Double = js.native
    
    /* 4 */ val profileInvalidAppId: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnManagementErrorStatus.profileInvalidAppId with Double = js.native
    
    /* 3 */ val profileNameTooLong: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnManagementErrorStatus.profileNameTooLong with Double = js.native
  }
  
  /** Specifies the native protocol types. */
  @js.native
  object VpnNativeProtocolType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnNativeProtocolType with Double] = js.native
    
    /* 2 */ val ipsecIkev2: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnNativeProtocolType.ipsecIkev2 with Double = js.native
    
    /* 1 */ val l2tp: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnNativeProtocolType.l2tp with Double = js.native
    
    /* 0 */ val pptp: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnNativeProtocolType.pptp with Double = js.native
  }
  
  /** Describes the possible states of the VPN packet buffer. */
  @js.native
  object VpnPacketBufferStatus extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnPacketBufferStatus with Double] = js.native
    
    /* 1 */ val invalidBufferSize: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnPacketBufferStatus.invalidBufferSize with Double = js.native
    
    /* 0 */ val ok: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnPacketBufferStatus.ok with Double = js.native
  }
  
  /** Specifies the routing policy type. */
  @js.native
  object VpnRoutingPolicyType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnRoutingPolicyType with Double] = js.native
    
    /* 1 */ val forceAllTrafficOverVpn: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnRoutingPolicyType.forceAllTrafficOverVpn with Double = js.native
    
    /* 0 */ val splitRouting: typingsSlinky.winrtUwp.Windows.Networking.Vpn.VpnRoutingPolicyType.splitRouting with Double = js.native
  }
}

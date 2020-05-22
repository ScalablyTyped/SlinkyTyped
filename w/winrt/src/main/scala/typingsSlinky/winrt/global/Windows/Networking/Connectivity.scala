package typingsSlinky.winrt.global.Windows.Networking

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType
import typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkCostType
import typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkEncryptionType
import typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Connectivity")
@js.native
object Connectivity extends js.Object {
  @js.native
  class ConnectionCost ()
    extends typingsSlinky.winrt.Windows.Networking.Connectivity.ConnectionCost {
    /* CompleteClass */
    override var approachingDataLimit: Boolean = js.native
    /* CompleteClass */
    override var networkCostType: NetworkCostType = js.native
    /* CompleteClass */
    override var overDataLimit: Boolean = js.native
    /* CompleteClass */
    override var roaming: Boolean = js.native
  }
  
  @js.native
  class ConnectionProfile ()
    extends typingsSlinky.winrt.Windows.Networking.Connectivity.ConnectionProfile
  
  @js.native
  class DataPlanStatus ()
    extends typingsSlinky.winrt.Windows.Networking.Connectivity.DataPlanStatus {
    /* CompleteClass */
    override var dataLimitInMegabytes: Double = js.native
    /* CompleteClass */
    override var dataPlanUsage: typingsSlinky.winrt.Windows.Networking.Connectivity.DataPlanUsage = js.native
    /* CompleteClass */
    override var inboundBitsPerSecond: Double = js.native
    /* CompleteClass */
    override var maxTransferSizeInMegabytes: Double = js.native
    /* CompleteClass */
    override var nextBillingCycle: js.Date = js.native
    /* CompleteClass */
    override var outboundBitsPerSecond: Double = js.native
  }
  
  @js.native
  class DataPlanUsage ()
    extends typingsSlinky.winrt.Windows.Networking.Connectivity.DataPlanUsage {
    /* CompleteClass */
    override var lastSyncTime: js.Date = js.native
    /* CompleteClass */
    override var megabytesUsed: Double = js.native
  }
  
  @js.native
  class DataUsage ()
    extends typingsSlinky.winrt.Windows.Networking.Connectivity.DataUsage {
    /* CompleteClass */
    override var bytesReceived: Double = js.native
    /* CompleteClass */
    override var bytesSent: Double = js.native
  }
  
  @js.native
  class IPInformation ()
    extends typingsSlinky.winrt.Windows.Networking.Connectivity.IPInformation {
    /* CompleteClass */
    override var networkAdapter: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkAdapter = js.native
    /* CompleteClass */
    override var prefixLength: Double = js.native
  }
  
  @js.native
  class LanIdentifier ()
    extends typingsSlinky.winrt.Windows.Networking.Connectivity.LanIdentifier {
    /* CompleteClass */
    override var infrastructureId: typingsSlinky.winrt.Windows.Networking.Connectivity.LanIdentifierData = js.native
    /* CompleteClass */
    override var networkAdapterId: String = js.native
    /* CompleteClass */
    override var portId: typingsSlinky.winrt.Windows.Networking.Connectivity.LanIdentifierData = js.native
  }
  
  @js.native
  class LanIdentifierData ()
    extends typingsSlinky.winrt.Windows.Networking.Connectivity.LanIdentifierData {
    /* CompleteClass */
    override var `type`: Double = js.native
    /* CompleteClass */
    override var value: IVectorView[Double] = js.native
  }
  
  @js.native
  class NetworkAdapter ()
    extends typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkAdapter {
    /* CompleteClass */
    override var ianaInterfaceType: Double = js.native
    /* CompleteClass */
    override var inboundMaxBitsPerSecond: Double = js.native
    /* CompleteClass */
    override var networkAdapterId: String = js.native
    /* CompleteClass */
    override var networkItem: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkItem = js.native
    /* CompleteClass */
    override var outboundMaxBitsPerSecond: Double = js.native
    /* CompleteClass */
    override def getConnectedProfileAsync(): IAsyncOperation[typingsSlinky.winrt.Windows.Networking.Connectivity.ConnectionProfile] = js.native
  }
  
  @js.native
  class NetworkInformation ()
    extends typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkInformation
  
  @js.native
  class NetworkItem ()
    extends typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkItem {
    /* CompleteClass */
    override var networkId: String = js.native
    /* CompleteClass */
    override def getNetworkTypes(): NetworkTypes = js.native
  }
  
  @js.native
  class NetworkSecuritySettings ()
    extends typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkSecuritySettings {
    /* CompleteClass */
    override var networkAuthenticationType: NetworkAuthenticationType = js.native
    /* CompleteClass */
    override var networkEncryptionType: NetworkEncryptionType = js.native
  }
  
  @js.native
  class ProxyConfiguration ()
    extends typingsSlinky.winrt.Windows.Networking.Connectivity.ProxyConfiguration {
    /* CompleteClass */
    override var canConnectDirectly: Boolean = js.native
    /* CompleteClass */
    override var proxyUris: IVectorView[Uri] = js.native
  }
  
  @js.native
  object NetworkAuthenticationType extends js.Object {
    /* 9 */ val ihv: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.ihv with Double = js.native
    /* 0 */ val none: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.none with Double = js.native
    /* 2 */ val open80211: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.open80211 with Double = js.native
    /* 7 */ val rsna: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.rsna with Double = js.native
    /* 8 */ val rsnaPsk: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.rsnaPsk with Double = js.native
    /* 3 */ val sharedKey80211: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.sharedKey80211 with Double = js.native
    /* 1 */ val unknown: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.unknown with Double = js.native
    /* 4 */ val wpa: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.wpa with Double = js.native
    /* 6 */ val wpaNone: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.wpaNone with Double = js.native
    /* 5 */ val wpaPsk: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.wpaPsk with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType with Double
      ] = js.native
  }
  
  @js.native
  object NetworkConnectivityLevel extends js.Object {
    /* 2 */ val constrainedInternetAccess: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkConnectivityLevel.constrainedInternetAccess with Double = js.native
    /* 3 */ val internetAccess: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkConnectivityLevel.internetAccess with Double = js.native
    /* 1 */ val localAccess: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkConnectivityLevel.localAccess with Double = js.native
    /* 0 */ val none: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkConnectivityLevel.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkConnectivityLevel with Double
      ] = js.native
  }
  
  @js.native
  object NetworkCostType extends js.Object {
    /* 2 */ val fixed: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkCostType.fixed with Double = js.native
    /* 0 */ val unknown: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkCostType.unknown with Double = js.native
    /* 1 */ val unrestricted: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkCostType.unrestricted with Double = js.native
    /* 3 */ val variable: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkCostType.variable with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkCostType with Double] = js.native
  }
  
  @js.native
  object NetworkEncryptionType extends js.Object {
    /* 6 */ val ccmp: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.ccmp with Double = js.native
    /* 9 */ val ihv: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.ihv with Double = js.native
    /* 0 */ val none: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.none with Double = js.native
    /* 8 */ val rsnUseGroup: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.rsnUseGroup with Double = js.native
    /* 5 */ val tkip: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.tkip with Double = js.native
    /* 1 */ val unknown: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.unknown with Double = js.native
    /* 2 */ val wep: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.wep with Double = js.native
    /* 4 */ val wep104: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.wep104 with Double = js.native
    /* 3 */ val wep40: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.wep40 with Double = js.native
    /* 7 */ val wpaUseGroup: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.wpaUseGroup with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkEncryptionType with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object NetworkInformation extends js.Object {
    var onnetworkstatuschanged: js.Any = js.native
    def getConnectionProfiles(): IVectorView[typingsSlinky.winrt.Windows.Networking.Connectivity.ConnectionProfile] = js.native
    def getHostNames(): IVectorView[typingsSlinky.winrt.Windows.Networking.HostName] = js.native
    def getInternetConnectionProfile(): typingsSlinky.winrt.Windows.Networking.Connectivity.ConnectionProfile = js.native
    def getLanIdentifiers(): IVectorView[typingsSlinky.winrt.Windows.Networking.Connectivity.LanIdentifier] = js.native
    def getProxyConfigurationAsync(uri: Uri): IAsyncOperation[typingsSlinky.winrt.Windows.Networking.Connectivity.ProxyConfiguration] = js.native
    def getSortedEndpointPairs(
      destinationList: IIterable[typingsSlinky.winrt.Windows.Networking.EndpointPair],
      sortOptions: typingsSlinky.winrt.Windows.Networking.HostNameSortOptions
    ): IVectorView[typingsSlinky.winrt.Windows.Networking.EndpointPair] = js.native
  }
  
  @js.native
  object NetworkTypes extends js.Object {
    /* 1 */ val internet: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkTypes.internet with Double = js.native
    /* 0 */ val none: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkTypes.none with Double = js.native
    /* 2 */ val privateNetwork: typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkTypes.privateNetwork with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkTypes with Double] = js.native
  }
  
  @js.native
  object RoamingStates extends js.Object {
    /* 0 */ val none: typingsSlinky.winrt.Windows.Networking.Connectivity.RoamingStates.none with Double = js.native
    /* 1 */ val notRoaming: typingsSlinky.winrt.Windows.Networking.Connectivity.RoamingStates.notRoaming with Double = js.native
    /* 2 */ val roaming: typingsSlinky.winrt.Windows.Networking.Connectivity.RoamingStates.roaming with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Networking.Connectivity.RoamingStates with Double] = js.native
  }
  
}


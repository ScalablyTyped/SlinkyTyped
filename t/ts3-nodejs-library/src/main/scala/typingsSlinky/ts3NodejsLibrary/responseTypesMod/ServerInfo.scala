package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerInfo extends ResponseEntry {
  
  var connectionBandwidthReceivedLastMinuteTotal: Double = js.native
  
  var connectionBandwidthReceivedLastSecondTotal: Double = js.native
  
  var connectionBandwidthSentLastMinuteTotal: Double = js.native
  
  var connectionBandwidthSentLastSecondTotal: Double = js.native
  
  var connectionBytesReceivedControl: Double = js.native
  
  var connectionBytesReceivedKeepalive: Double = js.native
  
  var connectionBytesReceivedSpeech: Double = js.native
  
  var connectionBytesReceivedTotal: Double = js.native
  
  var connectionBytesSentControl: Double = js.native
  
  var connectionBytesSentKeepalive: Double = js.native
  
  var connectionBytesSentSpeech: Double = js.native
  
  var connectionBytesSentTotal: Double = js.native
  
  var connectionFiletransferBandwidthReceived: Double = js.native
  
  var connectionFiletransferBandwidthSent: Double = js.native
  
  var connectionFiletransferBytesReceivedTotal: Double = js.native
  
  var connectionFiletransferBytesSentTotal: Double = js.native
  
  var connectionPacketsReceivedControl: Double = js.native
  
  var connectionPacketsReceivedKeepalive: Double = js.native
  
  var connectionPacketsReceivedSpeech: Double = js.native
  
  var connectionPacketsReceivedTotal: Double = js.native
  
  var connectionPacketsSentControl: Double = js.native
  
  var connectionPacketsSentKeepalive: Double = js.native
  
  var connectionPacketsSentSpeech: Double = js.native
  
  var connectionPacketsSentTotal: Double = js.native
  
  var virtualserverAntifloodPointsNeededCommandBlock: Double = js.native
  
  var virtualserverAntifloodPointsNeededIpBlock: Double = js.native
  
  var virtualserverAntifloodPointsNeededPluginBlock: Double = js.native
  
  var virtualserverAntifloodPointsTickReduce: Double = js.native
  
  var virtualserverChannelTempDeleteDelayDefault: Double = js.native
  
  var virtualserverChannelsonline: Double = js.native
  
  var virtualserverClientsonline: Double = js.native
  
  var virtualserverCodecEncryptionMode: Double = js.native
  
  var virtualserverComplainAutobanCount: Double = js.native
  
  var virtualserverComplainAutobanTime: Double = js.native
  
  var virtualserverComplainRemoveTime: Double = js.native
  
  var virtualserverCreated: Double = js.native
  
  var virtualserverDefaultChannelAdminGroup: String = js.native
  
  var virtualserverDefaultChannelGroup: String = js.native
  
  var virtualserverDefaultServerGroup: String = js.native
  
  var virtualserverDownloadQuota: Double = js.native
  
  var virtualserverFilebase: String = js.native
  
  var virtualserverFlagPassword: Boolean = js.native
  
  var virtualserverHostbannerGfxInterval: Double = js.native
  
  var virtualserverHostbannerGfxUrl: String = js.native
  
  var virtualserverHostbannerMode: Double = js.native
  
  var virtualserverHostbannerUrl: String = js.native
  
  var virtualserverHostbuttonGfxUrl: String = js.native
  
  var virtualserverHostbuttonTooltip: String = js.native
  
  var virtualserverHostbuttonUrl: String = js.native
  
  var virtualserverHostmessage: String = js.native
  
  var virtualserverHostmessageMode: Double = js.native
  
  var virtualserverIconId: String = js.native
  
  var virtualserverLogChannel: Double = js.native
  
  var virtualserverLogClient: Double = js.native
  
  var virtualserverLogFiletransfer: Double = js.native
  
  var virtualserverLogPermissions: Double = js.native
  
  var virtualserverLogQuery: Double = js.native
  
  var virtualserverLogServer: Double = js.native
  
  var virtualserverMaxDownloadTotalBandwidth: Double = js.native
  
  var virtualserverMaxUploadTotalBandwidth: Double = js.native
  
  var virtualserverMaxclients: Double = js.native
  
  var virtualserverMinAndroidVersion: Double = js.native
  
  var virtualserverMinClientVersion: Double = js.native
  
  var virtualserverMinClientsInChannelBeforeForcedSilence: Double = js.native
  
  var virtualserverMinIosVersion: Double = js.native
  
  var virtualserverName: String = js.native
  
  var virtualserverNamePhonetic: String = js.native
  
  var virtualserverNeededIdentitySecurityLevel: Double = js.native
  
  var virtualserverNickname: String = js.native
  
  var virtualserverPassword: String = js.native
  
  var virtualserverPrioritySpeakerDimmModificator: Double = js.native
  
  var virtualserverQueryclientsonline: Double = js.native
  
  var virtualserverReservedSlots: Double = js.native
  
  var virtualserverStatus: String = js.native
  
  var virtualserverTotalBytesDownloaded: Double = js.native
  
  var virtualserverTotalBytesUploaded: Double = js.native
  
  var virtualserverTotalPacketlossTotal: Double = js.native
  
  var virtualserverTotalPing: Double = js.native
  
  var virtualserverUniqueIdentifier: String = js.native
  
  var virtualserverUploadQuota: Double = js.native
  
  var virtualserverWeblistEnabled: Double = js.native
  
  var virtualserverWelcomemessage: String = js.native
}
object ServerInfo {
  
  @scala.inline
  def apply(
    connectionBandwidthReceivedLastMinuteTotal: Double,
    connectionBandwidthReceivedLastSecondTotal: Double,
    connectionBandwidthSentLastMinuteTotal: Double,
    connectionBandwidthSentLastSecondTotal: Double,
    connectionBytesReceivedControl: Double,
    connectionBytesReceivedKeepalive: Double,
    connectionBytesReceivedSpeech: Double,
    connectionBytesReceivedTotal: Double,
    connectionBytesSentControl: Double,
    connectionBytesSentKeepalive: Double,
    connectionBytesSentSpeech: Double,
    connectionBytesSentTotal: Double,
    connectionFiletransferBandwidthReceived: Double,
    connectionFiletransferBandwidthSent: Double,
    connectionFiletransferBytesReceivedTotal: Double,
    connectionFiletransferBytesSentTotal: Double,
    connectionPacketsReceivedControl: Double,
    connectionPacketsReceivedKeepalive: Double,
    connectionPacketsReceivedSpeech: Double,
    connectionPacketsReceivedTotal: Double,
    connectionPacketsSentControl: Double,
    connectionPacketsSentKeepalive: Double,
    connectionPacketsSentSpeech: Double,
    connectionPacketsSentTotal: Double,
    virtualserverAntifloodPointsNeededCommandBlock: Double,
    virtualserverAntifloodPointsNeededIpBlock: Double,
    virtualserverAntifloodPointsNeededPluginBlock: Double,
    virtualserverAntifloodPointsTickReduce: Double,
    virtualserverChannelTempDeleteDelayDefault: Double,
    virtualserverChannelsonline: Double,
    virtualserverClientsonline: Double,
    virtualserverCodecEncryptionMode: Double,
    virtualserverComplainAutobanCount: Double,
    virtualserverComplainAutobanTime: Double,
    virtualserverComplainRemoveTime: Double,
    virtualserverCreated: Double,
    virtualserverDefaultChannelAdminGroup: String,
    virtualserverDefaultChannelGroup: String,
    virtualserverDefaultServerGroup: String,
    virtualserverDownloadQuota: Double,
    virtualserverFilebase: String,
    virtualserverFlagPassword: Boolean,
    virtualserverHostbannerGfxInterval: Double,
    virtualserverHostbannerGfxUrl: String,
    virtualserverHostbannerMode: Double,
    virtualserverHostbannerUrl: String,
    virtualserverHostbuttonGfxUrl: String,
    virtualserverHostbuttonTooltip: String,
    virtualserverHostbuttonUrl: String,
    virtualserverHostmessage: String,
    virtualserverHostmessageMode: Double,
    virtualserverIconId: String,
    virtualserverLogChannel: Double,
    virtualserverLogClient: Double,
    virtualserverLogFiletransfer: Double,
    virtualserverLogPermissions: Double,
    virtualserverLogQuery: Double,
    virtualserverLogServer: Double,
    virtualserverMaxDownloadTotalBandwidth: Double,
    virtualserverMaxUploadTotalBandwidth: Double,
    virtualserverMaxclients: Double,
    virtualserverMinAndroidVersion: Double,
    virtualserverMinClientVersion: Double,
    virtualserverMinClientsInChannelBeforeForcedSilence: Double,
    virtualserverMinIosVersion: Double,
    virtualserverName: String,
    virtualserverNamePhonetic: String,
    virtualserverNeededIdentitySecurityLevel: Double,
    virtualserverNickname: String,
    virtualserverPassword: String,
    virtualserverPrioritySpeakerDimmModificator: Double,
    virtualserverQueryclientsonline: Double,
    virtualserverReservedSlots: Double,
    virtualserverStatus: String,
    virtualserverTotalBytesDownloaded: Double,
    virtualserverTotalBytesUploaded: Double,
    virtualserverTotalPacketlossTotal: Double,
    virtualserverTotalPing: Double,
    virtualserverUniqueIdentifier: String,
    virtualserverUploadQuota: Double,
    virtualserverWeblistEnabled: Double,
    virtualserverWelcomemessage: String
  ): ServerInfo = {
    val __obj = js.Dynamic.literal(connectionBandwidthReceivedLastMinuteTotal = connectionBandwidthReceivedLastMinuteTotal.asInstanceOf[js.Any], connectionBandwidthReceivedLastSecondTotal = connectionBandwidthReceivedLastSecondTotal.asInstanceOf[js.Any], connectionBandwidthSentLastMinuteTotal = connectionBandwidthSentLastMinuteTotal.asInstanceOf[js.Any], connectionBandwidthSentLastSecondTotal = connectionBandwidthSentLastSecondTotal.asInstanceOf[js.Any], connectionBytesReceivedControl = connectionBytesReceivedControl.asInstanceOf[js.Any], connectionBytesReceivedKeepalive = connectionBytesReceivedKeepalive.asInstanceOf[js.Any], connectionBytesReceivedSpeech = connectionBytesReceivedSpeech.asInstanceOf[js.Any], connectionBytesReceivedTotal = connectionBytesReceivedTotal.asInstanceOf[js.Any], connectionBytesSentControl = connectionBytesSentControl.asInstanceOf[js.Any], connectionBytesSentKeepalive = connectionBytesSentKeepalive.asInstanceOf[js.Any], connectionBytesSentSpeech = connectionBytesSentSpeech.asInstanceOf[js.Any], connectionBytesSentTotal = connectionBytesSentTotal.asInstanceOf[js.Any], connectionFiletransferBandwidthReceived = connectionFiletransferBandwidthReceived.asInstanceOf[js.Any], connectionFiletransferBandwidthSent = connectionFiletransferBandwidthSent.asInstanceOf[js.Any], connectionFiletransferBytesReceivedTotal = connectionFiletransferBytesReceivedTotal.asInstanceOf[js.Any], connectionFiletransferBytesSentTotal = connectionFiletransferBytesSentTotal.asInstanceOf[js.Any], connectionPacketsReceivedControl = connectionPacketsReceivedControl.asInstanceOf[js.Any], connectionPacketsReceivedKeepalive = connectionPacketsReceivedKeepalive.asInstanceOf[js.Any], connectionPacketsReceivedSpeech = connectionPacketsReceivedSpeech.asInstanceOf[js.Any], connectionPacketsReceivedTotal = connectionPacketsReceivedTotal.asInstanceOf[js.Any], connectionPacketsSentControl = connectionPacketsSentControl.asInstanceOf[js.Any], connectionPacketsSentKeepalive = connectionPacketsSentKeepalive.asInstanceOf[js.Any], connectionPacketsSentSpeech = connectionPacketsSentSpeech.asInstanceOf[js.Any], connectionPacketsSentTotal = connectionPacketsSentTotal.asInstanceOf[js.Any], virtualserverAntifloodPointsNeededCommandBlock = virtualserverAntifloodPointsNeededCommandBlock.asInstanceOf[js.Any], virtualserverAntifloodPointsNeededIpBlock = virtualserverAntifloodPointsNeededIpBlock.asInstanceOf[js.Any], virtualserverAntifloodPointsNeededPluginBlock = virtualserverAntifloodPointsNeededPluginBlock.asInstanceOf[js.Any], virtualserverAntifloodPointsTickReduce = virtualserverAntifloodPointsTickReduce.asInstanceOf[js.Any], virtualserverChannelTempDeleteDelayDefault = virtualserverChannelTempDeleteDelayDefault.asInstanceOf[js.Any], virtualserverChannelsonline = virtualserverChannelsonline.asInstanceOf[js.Any], virtualserverClientsonline = virtualserverClientsonline.asInstanceOf[js.Any], virtualserverCodecEncryptionMode = virtualserverCodecEncryptionMode.asInstanceOf[js.Any], virtualserverComplainAutobanCount = virtualserverComplainAutobanCount.asInstanceOf[js.Any], virtualserverComplainAutobanTime = virtualserverComplainAutobanTime.asInstanceOf[js.Any], virtualserverComplainRemoveTime = virtualserverComplainRemoveTime.asInstanceOf[js.Any], virtualserverCreated = virtualserverCreated.asInstanceOf[js.Any], virtualserverDefaultChannelAdminGroup = virtualserverDefaultChannelAdminGroup.asInstanceOf[js.Any], virtualserverDefaultChannelGroup = virtualserverDefaultChannelGroup.asInstanceOf[js.Any], virtualserverDefaultServerGroup = virtualserverDefaultServerGroup.asInstanceOf[js.Any], virtualserverDownloadQuota = virtualserverDownloadQuota.asInstanceOf[js.Any], virtualserverFilebase = virtualserverFilebase.asInstanceOf[js.Any], virtualserverFlagPassword = virtualserverFlagPassword.asInstanceOf[js.Any], virtualserverHostbannerGfxInterval = virtualserverHostbannerGfxInterval.asInstanceOf[js.Any], virtualserverHostbannerGfxUrl = virtualserverHostbannerGfxUrl.asInstanceOf[js.Any], virtualserverHostbannerMode = virtualserverHostbannerMode.asInstanceOf[js.Any], virtualserverHostbannerUrl = virtualserverHostbannerUrl.asInstanceOf[js.Any], virtualserverHostbuttonGfxUrl = virtualserverHostbuttonGfxUrl.asInstanceOf[js.Any], virtualserverHostbuttonTooltip = virtualserverHostbuttonTooltip.asInstanceOf[js.Any], virtualserverHostbuttonUrl = virtualserverHostbuttonUrl.asInstanceOf[js.Any], virtualserverHostmessage = virtualserverHostmessage.asInstanceOf[js.Any], virtualserverHostmessageMode = virtualserverHostmessageMode.asInstanceOf[js.Any], virtualserverIconId = virtualserverIconId.asInstanceOf[js.Any], virtualserverLogChannel = virtualserverLogChannel.asInstanceOf[js.Any], virtualserverLogClient = virtualserverLogClient.asInstanceOf[js.Any], virtualserverLogFiletransfer = virtualserverLogFiletransfer.asInstanceOf[js.Any], virtualserverLogPermissions = virtualserverLogPermissions.asInstanceOf[js.Any], virtualserverLogQuery = virtualserverLogQuery.asInstanceOf[js.Any], virtualserverLogServer = virtualserverLogServer.asInstanceOf[js.Any], virtualserverMaxDownloadTotalBandwidth = virtualserverMaxDownloadTotalBandwidth.asInstanceOf[js.Any], virtualserverMaxUploadTotalBandwidth = virtualserverMaxUploadTotalBandwidth.asInstanceOf[js.Any], virtualserverMaxclients = virtualserverMaxclients.asInstanceOf[js.Any], virtualserverMinAndroidVersion = virtualserverMinAndroidVersion.asInstanceOf[js.Any], virtualserverMinClientVersion = virtualserverMinClientVersion.asInstanceOf[js.Any], virtualserverMinClientsInChannelBeforeForcedSilence = virtualserverMinClientsInChannelBeforeForcedSilence.asInstanceOf[js.Any], virtualserverMinIosVersion = virtualserverMinIosVersion.asInstanceOf[js.Any], virtualserverName = virtualserverName.asInstanceOf[js.Any], virtualserverNamePhonetic = virtualserverNamePhonetic.asInstanceOf[js.Any], virtualserverNeededIdentitySecurityLevel = virtualserverNeededIdentitySecurityLevel.asInstanceOf[js.Any], virtualserverNickname = virtualserverNickname.asInstanceOf[js.Any], virtualserverPassword = virtualserverPassword.asInstanceOf[js.Any], virtualserverPrioritySpeakerDimmModificator = virtualserverPrioritySpeakerDimmModificator.asInstanceOf[js.Any], virtualserverQueryclientsonline = virtualserverQueryclientsonline.asInstanceOf[js.Any], virtualserverReservedSlots = virtualserverReservedSlots.asInstanceOf[js.Any], virtualserverStatus = virtualserverStatus.asInstanceOf[js.Any], virtualserverTotalBytesDownloaded = virtualserverTotalBytesDownloaded.asInstanceOf[js.Any], virtualserverTotalBytesUploaded = virtualserverTotalBytesUploaded.asInstanceOf[js.Any], virtualserverTotalPacketlossTotal = virtualserverTotalPacketlossTotal.asInstanceOf[js.Any], virtualserverTotalPing = virtualserverTotalPing.asInstanceOf[js.Any], virtualserverUniqueIdentifier = virtualserverUniqueIdentifier.asInstanceOf[js.Any], virtualserverUploadQuota = virtualserverUploadQuota.asInstanceOf[js.Any], virtualserverWeblistEnabled = virtualserverWeblistEnabled.asInstanceOf[js.Any], virtualserverWelcomemessage = virtualserverWelcomemessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerInfo]
  }
  
  @scala.inline
  implicit class ServerInfoMutableBuilder[Self <: ServerInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionBandwidthReceivedLastMinuteTotal(value: Double): Self = StObject.set(x, "connectionBandwidthReceivedLastMinuteTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBandwidthReceivedLastSecondTotal(value: Double): Self = StObject.set(x, "connectionBandwidthReceivedLastSecondTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBandwidthSentLastMinuteTotal(value: Double): Self = StObject.set(x, "connectionBandwidthSentLastMinuteTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBandwidthSentLastSecondTotal(value: Double): Self = StObject.set(x, "connectionBandwidthSentLastSecondTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBytesReceivedControl(value: Double): Self = StObject.set(x, "connectionBytesReceivedControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBytesReceivedKeepalive(value: Double): Self = StObject.set(x, "connectionBytesReceivedKeepalive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBytesReceivedSpeech(value: Double): Self = StObject.set(x, "connectionBytesReceivedSpeech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBytesReceivedTotal(value: Double): Self = StObject.set(x, "connectionBytesReceivedTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBytesSentControl(value: Double): Self = StObject.set(x, "connectionBytesSentControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBytesSentKeepalive(value: Double): Self = StObject.set(x, "connectionBytesSentKeepalive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBytesSentSpeech(value: Double): Self = StObject.set(x, "connectionBytesSentSpeech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBytesSentTotal(value: Double): Self = StObject.set(x, "connectionBytesSentTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionFiletransferBandwidthReceived(value: Double): Self = StObject.set(x, "connectionFiletransferBandwidthReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionFiletransferBandwidthSent(value: Double): Self = StObject.set(x, "connectionFiletransferBandwidthSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionFiletransferBytesReceivedTotal(value: Double): Self = StObject.set(x, "connectionFiletransferBytesReceivedTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionFiletransferBytesSentTotal(value: Double): Self = StObject.set(x, "connectionFiletransferBytesSentTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPacketsReceivedControl(value: Double): Self = StObject.set(x, "connectionPacketsReceivedControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPacketsReceivedKeepalive(value: Double): Self = StObject.set(x, "connectionPacketsReceivedKeepalive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPacketsReceivedSpeech(value: Double): Self = StObject.set(x, "connectionPacketsReceivedSpeech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPacketsReceivedTotal(value: Double): Self = StObject.set(x, "connectionPacketsReceivedTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPacketsSentControl(value: Double): Self = StObject.set(x, "connectionPacketsSentControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPacketsSentKeepalive(value: Double): Self = StObject.set(x, "connectionPacketsSentKeepalive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPacketsSentSpeech(value: Double): Self = StObject.set(x, "connectionPacketsSentSpeech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPacketsSentTotal(value: Double): Self = StObject.set(x, "connectionPacketsSentTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverAntifloodPointsNeededCommandBlock(value: Double): Self = StObject.set(x, "virtualserverAntifloodPointsNeededCommandBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverAntifloodPointsNeededIpBlock(value: Double): Self = StObject.set(x, "virtualserverAntifloodPointsNeededIpBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverAntifloodPointsNeededPluginBlock(value: Double): Self = StObject.set(x, "virtualserverAntifloodPointsNeededPluginBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverAntifloodPointsTickReduce(value: Double): Self = StObject.set(x, "virtualserverAntifloodPointsTickReduce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverChannelTempDeleteDelayDefault(value: Double): Self = StObject.set(x, "virtualserverChannelTempDeleteDelayDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverChannelsonline(value: Double): Self = StObject.set(x, "virtualserverChannelsonline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverClientsonline(value: Double): Self = StObject.set(x, "virtualserverClientsonline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverCodecEncryptionMode(value: Double): Self = StObject.set(x, "virtualserverCodecEncryptionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverComplainAutobanCount(value: Double): Self = StObject.set(x, "virtualserverComplainAutobanCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverComplainAutobanTime(value: Double): Self = StObject.set(x, "virtualserverComplainAutobanTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverComplainRemoveTime(value: Double): Self = StObject.set(x, "virtualserverComplainRemoveTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverCreated(value: Double): Self = StObject.set(x, "virtualserverCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverDefaultChannelAdminGroup(value: String): Self = StObject.set(x, "virtualserverDefaultChannelAdminGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverDefaultChannelGroup(value: String): Self = StObject.set(x, "virtualserverDefaultChannelGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverDefaultServerGroup(value: String): Self = StObject.set(x, "virtualserverDefaultServerGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverDownloadQuota(value: Double): Self = StObject.set(x, "virtualserverDownloadQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverFilebase(value: String): Self = StObject.set(x, "virtualserverFilebase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverFlagPassword(value: Boolean): Self = StObject.set(x, "virtualserverFlagPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverHostbannerGfxInterval(value: Double): Self = StObject.set(x, "virtualserverHostbannerGfxInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverHostbannerGfxUrl(value: String): Self = StObject.set(x, "virtualserverHostbannerGfxUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverHostbannerMode(value: Double): Self = StObject.set(x, "virtualserverHostbannerMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverHostbannerUrl(value: String): Self = StObject.set(x, "virtualserverHostbannerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverHostbuttonGfxUrl(value: String): Self = StObject.set(x, "virtualserverHostbuttonGfxUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverHostbuttonTooltip(value: String): Self = StObject.set(x, "virtualserverHostbuttonTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverHostbuttonUrl(value: String): Self = StObject.set(x, "virtualserverHostbuttonUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverHostmessage(value: String): Self = StObject.set(x, "virtualserverHostmessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverHostmessageMode(value: Double): Self = StObject.set(x, "virtualserverHostmessageMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverIconId(value: String): Self = StObject.set(x, "virtualserverIconId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverLogChannel(value: Double): Self = StObject.set(x, "virtualserverLogChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverLogClient(value: Double): Self = StObject.set(x, "virtualserverLogClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverLogFiletransfer(value: Double): Self = StObject.set(x, "virtualserverLogFiletransfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverLogPermissions(value: Double): Self = StObject.set(x, "virtualserverLogPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverLogQuery(value: Double): Self = StObject.set(x, "virtualserverLogQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverLogServer(value: Double): Self = StObject.set(x, "virtualserverLogServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverMaxDownloadTotalBandwidth(value: Double): Self = StObject.set(x, "virtualserverMaxDownloadTotalBandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverMaxUploadTotalBandwidth(value: Double): Self = StObject.set(x, "virtualserverMaxUploadTotalBandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverMaxclients(value: Double): Self = StObject.set(x, "virtualserverMaxclients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverMinAndroidVersion(value: Double): Self = StObject.set(x, "virtualserverMinAndroidVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverMinClientVersion(value: Double): Self = StObject.set(x, "virtualserverMinClientVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverMinClientsInChannelBeforeForcedSilence(value: Double): Self = StObject.set(x, "virtualserverMinClientsInChannelBeforeForcedSilence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverMinIosVersion(value: Double): Self = StObject.set(x, "virtualserverMinIosVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverName(value: String): Self = StObject.set(x, "virtualserverName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverNamePhonetic(value: String): Self = StObject.set(x, "virtualserverNamePhonetic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverNeededIdentitySecurityLevel(value: Double): Self = StObject.set(x, "virtualserverNeededIdentitySecurityLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverNickname(value: String): Self = StObject.set(x, "virtualserverNickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverPassword(value: String): Self = StObject.set(x, "virtualserverPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverPrioritySpeakerDimmModificator(value: Double): Self = StObject.set(x, "virtualserverPrioritySpeakerDimmModificator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverQueryclientsonline(value: Double): Self = StObject.set(x, "virtualserverQueryclientsonline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverReservedSlots(value: Double): Self = StObject.set(x, "virtualserverReservedSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverStatus(value: String): Self = StObject.set(x, "virtualserverStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverTotalBytesDownloaded(value: Double): Self = StObject.set(x, "virtualserverTotalBytesDownloaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverTotalBytesUploaded(value: Double): Self = StObject.set(x, "virtualserverTotalBytesUploaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverTotalPacketlossTotal(value: Double): Self = StObject.set(x, "virtualserverTotalPacketlossTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverTotalPing(value: Double): Self = StObject.set(x, "virtualserverTotalPing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverUniqueIdentifier(value: String): Self = StObject.set(x, "virtualserverUniqueIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverUploadQuota(value: Double): Self = StObject.set(x, "virtualserverUploadQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverWeblistEnabled(value: Double): Self = StObject.set(x, "virtualserverWeblistEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverWelcomemessage(value: String): Self = StObject.set(x, "virtualserverWelcomemessage", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import typingsSlinky.ts3NodejsLibrary.enumMod.ClientType
import typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientInfo extends ResponseEntry {
  
  var cid: String = js.native
  
  var clientAway: Boolean = js.native
  
  var clientAwayMessage: js.UndefOr[String] = js.native
  
  var clientBadges: String = js.native
  
  var clientBase64HashClientUID: String = js.native
  
  var clientChannelGroupId: String = js.native
  
  var clientChannelGroupInheritedChannelId: String = js.native
  
  var clientCountry: String = js.native
  
  var clientCreated: Double = js.native
  
  var clientDatabaseId: Double = js.native
  
  var clientDefaultChannel: String = js.native
  
  var clientDefaultToken: String = js.native
  
  var clientDescription: String = js.native
  
  var clientFlagAvatar: String = js.native
  
  var clientIconId: String = js.native
  
  var clientIdleTime: Double = js.native
  
  var clientInputHardware: Double = js.native
  
  var clientInputMuted: Double = js.native
  
  var clientIntegrations: String = js.native
  
  var clientIsChannelCommander: Boolean = js.native
  
  var clientIsPrioritySpeaker: Boolean = js.native
  
  var clientIsRecording: Boolean = js.native
  
  var clientIsTalker: Boolean = js.native
  
  var clientLastconnected: Double = js.native
  
  var clientLoginName: String = js.native
  
  var clientMetaData: String = js.native
  
  var clientMonthBytesDownloaded: Double = js.native
  
  var clientMonthBytesUploaded: Double = js.native
  
  var clientMyteamspeakAvatar: String = js.native
  
  var clientMyteamspeakId: String = js.native
  
  var clientNeededServerqueryViewPower: Double = js.native
  
  var clientNickname: String = js.native
  
  var clientNicknamePhonetic: String = js.native
  
  var clientOutputHardware: Double = js.native
  
  var clientOutputMuted: Double = js.native
  
  var clientOutputonlyMuted: Double = js.native
  
  var clientPlatform: String = js.native
  
  var clientSecurityHash: String = js.native
  
  var clientServergroups: js.Array[String] = js.native
  
  var clientSignedBadges: String = js.native
  
  var clientTalkPower: Double = js.native
  
  var clientTalkRequest: Boolean = js.native
  
  var clientTalkRequestMsg: String = js.native
  
  var clientTotalBytesDownloaded: Double = js.native
  
  var clientTotalBytesUploaded: Double = js.native
  
  var clientTotalconnections: Double = js.native
  
  var clientType: ClientType = js.native
  
  var clientUniqueIdentifier: String = js.native
  
  var clientVersion: String = js.native
  
  var clientVersionSign: String = js.native
  
  var connectionBandwidthReceivedLastMinuteTotal: Double = js.native
  
  var connectionBandwidthReceivedLastSecondTotal: Double = js.native
  
  var connectionBandwidthSentLastMinuteTotal: Double = js.native
  
  var connectionBandwidthSentLastSecondTotal: Double = js.native
  
  var connectionBytesReceivedTotal: Double = js.native
  
  var connectionBytesSentTotal: Double = js.native
  
  var connectionClientIp: String = js.native
  
  var connectionConnectedTime: Double = js.native
  
  var connectionFiletransferBandwidthReceived: Double = js.native
  
  var connectionFiletransferBandwidthSent: Double = js.native
  
  var connectionPacketsReceivedTotal: Double = js.native
  
  var connectionPacketsSentTotal: Double = js.native
}
object ClientInfo {
  
  @scala.inline
  def apply(
    cid: String,
    clientAway: Boolean,
    clientBadges: String,
    clientBase64HashClientUID: String,
    clientChannelGroupId: String,
    clientChannelGroupInheritedChannelId: String,
    clientCountry: String,
    clientCreated: Double,
    clientDatabaseId: Double,
    clientDefaultChannel: String,
    clientDefaultToken: String,
    clientDescription: String,
    clientFlagAvatar: String,
    clientIconId: String,
    clientIdleTime: Double,
    clientInputHardware: Double,
    clientInputMuted: Double,
    clientIntegrations: String,
    clientIsChannelCommander: Boolean,
    clientIsPrioritySpeaker: Boolean,
    clientIsRecording: Boolean,
    clientIsTalker: Boolean,
    clientLastconnected: Double,
    clientLoginName: String,
    clientMetaData: String,
    clientMonthBytesDownloaded: Double,
    clientMonthBytesUploaded: Double,
    clientMyteamspeakAvatar: String,
    clientMyteamspeakId: String,
    clientNeededServerqueryViewPower: Double,
    clientNickname: String,
    clientNicknamePhonetic: String,
    clientOutputHardware: Double,
    clientOutputMuted: Double,
    clientOutputonlyMuted: Double,
    clientPlatform: String,
    clientSecurityHash: String,
    clientServergroups: js.Array[String],
    clientSignedBadges: String,
    clientTalkPower: Double,
    clientTalkRequest: Boolean,
    clientTalkRequestMsg: String,
    clientTotalBytesDownloaded: Double,
    clientTotalBytesUploaded: Double,
    clientTotalconnections: Double,
    clientType: ClientType,
    clientUniqueIdentifier: String,
    clientVersion: String,
    clientVersionSign: String,
    connectionBandwidthReceivedLastMinuteTotal: Double,
    connectionBandwidthReceivedLastSecondTotal: Double,
    connectionBandwidthSentLastMinuteTotal: Double,
    connectionBandwidthSentLastSecondTotal: Double,
    connectionBytesReceivedTotal: Double,
    connectionBytesSentTotal: Double,
    connectionClientIp: String,
    connectionConnectedTime: Double,
    connectionFiletransferBandwidthReceived: Double,
    connectionFiletransferBandwidthSent: Double,
    connectionPacketsReceivedTotal: Double,
    connectionPacketsSentTotal: Double
  ): ClientInfo = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], clientAway = clientAway.asInstanceOf[js.Any], clientBadges = clientBadges.asInstanceOf[js.Any], clientBase64HashClientUID = clientBase64HashClientUID.asInstanceOf[js.Any], clientChannelGroupId = clientChannelGroupId.asInstanceOf[js.Any], clientChannelGroupInheritedChannelId = clientChannelGroupInheritedChannelId.asInstanceOf[js.Any], clientCountry = clientCountry.asInstanceOf[js.Any], clientCreated = clientCreated.asInstanceOf[js.Any], clientDatabaseId = clientDatabaseId.asInstanceOf[js.Any], clientDefaultChannel = clientDefaultChannel.asInstanceOf[js.Any], clientDefaultToken = clientDefaultToken.asInstanceOf[js.Any], clientDescription = clientDescription.asInstanceOf[js.Any], clientFlagAvatar = clientFlagAvatar.asInstanceOf[js.Any], clientIconId = clientIconId.asInstanceOf[js.Any], clientIdleTime = clientIdleTime.asInstanceOf[js.Any], clientInputHardware = clientInputHardware.asInstanceOf[js.Any], clientInputMuted = clientInputMuted.asInstanceOf[js.Any], clientIntegrations = clientIntegrations.asInstanceOf[js.Any], clientIsChannelCommander = clientIsChannelCommander.asInstanceOf[js.Any], clientIsPrioritySpeaker = clientIsPrioritySpeaker.asInstanceOf[js.Any], clientIsRecording = clientIsRecording.asInstanceOf[js.Any], clientIsTalker = clientIsTalker.asInstanceOf[js.Any], clientLastconnected = clientLastconnected.asInstanceOf[js.Any], clientLoginName = clientLoginName.asInstanceOf[js.Any], clientMetaData = clientMetaData.asInstanceOf[js.Any], clientMonthBytesDownloaded = clientMonthBytesDownloaded.asInstanceOf[js.Any], clientMonthBytesUploaded = clientMonthBytesUploaded.asInstanceOf[js.Any], clientMyteamspeakAvatar = clientMyteamspeakAvatar.asInstanceOf[js.Any], clientMyteamspeakId = clientMyteamspeakId.asInstanceOf[js.Any], clientNeededServerqueryViewPower = clientNeededServerqueryViewPower.asInstanceOf[js.Any], clientNickname = clientNickname.asInstanceOf[js.Any], clientNicknamePhonetic = clientNicknamePhonetic.asInstanceOf[js.Any], clientOutputHardware = clientOutputHardware.asInstanceOf[js.Any], clientOutputMuted = clientOutputMuted.asInstanceOf[js.Any], clientOutputonlyMuted = clientOutputonlyMuted.asInstanceOf[js.Any], clientPlatform = clientPlatform.asInstanceOf[js.Any], clientSecurityHash = clientSecurityHash.asInstanceOf[js.Any], clientServergroups = clientServergroups.asInstanceOf[js.Any], clientSignedBadges = clientSignedBadges.asInstanceOf[js.Any], clientTalkPower = clientTalkPower.asInstanceOf[js.Any], clientTalkRequest = clientTalkRequest.asInstanceOf[js.Any], clientTalkRequestMsg = clientTalkRequestMsg.asInstanceOf[js.Any], clientTotalBytesDownloaded = clientTotalBytesDownloaded.asInstanceOf[js.Any], clientTotalBytesUploaded = clientTotalBytesUploaded.asInstanceOf[js.Any], clientTotalconnections = clientTotalconnections.asInstanceOf[js.Any], clientType = clientType.asInstanceOf[js.Any], clientUniqueIdentifier = clientUniqueIdentifier.asInstanceOf[js.Any], clientVersion = clientVersion.asInstanceOf[js.Any], clientVersionSign = clientVersionSign.asInstanceOf[js.Any], connectionBandwidthReceivedLastMinuteTotal = connectionBandwidthReceivedLastMinuteTotal.asInstanceOf[js.Any], connectionBandwidthReceivedLastSecondTotal = connectionBandwidthReceivedLastSecondTotal.asInstanceOf[js.Any], connectionBandwidthSentLastMinuteTotal = connectionBandwidthSentLastMinuteTotal.asInstanceOf[js.Any], connectionBandwidthSentLastSecondTotal = connectionBandwidthSentLastSecondTotal.asInstanceOf[js.Any], connectionBytesReceivedTotal = connectionBytesReceivedTotal.asInstanceOf[js.Any], connectionBytesSentTotal = connectionBytesSentTotal.asInstanceOf[js.Any], connectionClientIp = connectionClientIp.asInstanceOf[js.Any], connectionConnectedTime = connectionConnectedTime.asInstanceOf[js.Any], connectionFiletransferBandwidthReceived = connectionFiletransferBandwidthReceived.asInstanceOf[js.Any], connectionFiletransferBandwidthSent = connectionFiletransferBandwidthSent.asInstanceOf[js.Any], connectionPacketsReceivedTotal = connectionPacketsReceivedTotal.asInstanceOf[js.Any], connectionPacketsSentTotal = connectionPacketsSentTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientInfo]
  }
  
  @scala.inline
  implicit class ClientInfoMutableBuilder[Self <: ClientInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientAway(value: Boolean): Self = StObject.set(x, "clientAway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientAwayMessage(value: String): Self = StObject.set(x, "clientAwayMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientAwayMessageUndefined: Self = StObject.set(x, "clientAwayMessage", js.undefined)
    
    @scala.inline
    def setClientBadges(value: String): Self = StObject.set(x, "clientBadges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientBase64HashClientUID(value: String): Self = StObject.set(x, "clientBase64HashClientUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientChannelGroupId(value: String): Self = StObject.set(x, "clientChannelGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientChannelGroupInheritedChannelId(value: String): Self = StObject.set(x, "clientChannelGroupInheritedChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCountry(value: String): Self = StObject.set(x, "clientCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCreated(value: Double): Self = StObject.set(x, "clientCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientDatabaseId(value: Double): Self = StObject.set(x, "clientDatabaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientDefaultChannel(value: String): Self = StObject.set(x, "clientDefaultChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientDefaultToken(value: String): Self = StObject.set(x, "clientDefaultToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientDescription(value: String): Self = StObject.set(x, "clientDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientFlagAvatar(value: String): Self = StObject.set(x, "clientFlagAvatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIconId(value: String): Self = StObject.set(x, "clientIconId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdleTime(value: Double): Self = StObject.set(x, "clientIdleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientInputHardware(value: Double): Self = StObject.set(x, "clientInputHardware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientInputMuted(value: Double): Self = StObject.set(x, "clientInputMuted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIntegrations(value: String): Self = StObject.set(x, "clientIntegrations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIsChannelCommander(value: Boolean): Self = StObject.set(x, "clientIsChannelCommander", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIsPrioritySpeaker(value: Boolean): Self = StObject.set(x, "clientIsPrioritySpeaker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIsRecording(value: Boolean): Self = StObject.set(x, "clientIsRecording", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIsTalker(value: Boolean): Self = StObject.set(x, "clientIsTalker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientLastconnected(value: Double): Self = StObject.set(x, "clientLastconnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientLoginName(value: String): Self = StObject.set(x, "clientLoginName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMetaData(value: String): Self = StObject.set(x, "clientMetaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMonthBytesDownloaded(value: Double): Self = StObject.set(x, "clientMonthBytesDownloaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMonthBytesUploaded(value: Double): Self = StObject.set(x, "clientMonthBytesUploaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMyteamspeakAvatar(value: String): Self = StObject.set(x, "clientMyteamspeakAvatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMyteamspeakId(value: String): Self = StObject.set(x, "clientMyteamspeakId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientNeededServerqueryViewPower(value: Double): Self = StObject.set(x, "clientNeededServerqueryViewPower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientNickname(value: String): Self = StObject.set(x, "clientNickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientNicknamePhonetic(value: String): Self = StObject.set(x, "clientNicknamePhonetic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientOutputHardware(value: Double): Self = StObject.set(x, "clientOutputHardware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientOutputMuted(value: Double): Self = StObject.set(x, "clientOutputMuted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientOutputonlyMuted(value: Double): Self = StObject.set(x, "clientOutputonlyMuted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientPlatform(value: String): Self = StObject.set(x, "clientPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecurityHash(value: String): Self = StObject.set(x, "clientSecurityHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientServergroups(value: js.Array[String]): Self = StObject.set(x, "clientServergroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientServergroupsVarargs(value: String*): Self = StObject.set(x, "clientServergroups", js.Array(value :_*))
    
    @scala.inline
    def setClientSignedBadges(value: String): Self = StObject.set(x, "clientSignedBadges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTalkPower(value: Double): Self = StObject.set(x, "clientTalkPower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTalkRequest(value: Boolean): Self = StObject.set(x, "clientTalkRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTalkRequestMsg(value: String): Self = StObject.set(x, "clientTalkRequestMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTotalBytesDownloaded(value: Double): Self = StObject.set(x, "clientTotalBytesDownloaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTotalBytesUploaded(value: Double): Self = StObject.set(x, "clientTotalBytesUploaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTotalconnections(value: Double): Self = StObject.set(x, "clientTotalconnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientType(value: ClientType): Self = StObject.set(x, "clientType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUniqueIdentifier(value: String): Self = StObject.set(x, "clientUniqueIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientVersion(value: String): Self = StObject.set(x, "clientVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientVersionSign(value: String): Self = StObject.set(x, "clientVersionSign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBandwidthReceivedLastMinuteTotal(value: Double): Self = StObject.set(x, "connectionBandwidthReceivedLastMinuteTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBandwidthReceivedLastSecondTotal(value: Double): Self = StObject.set(x, "connectionBandwidthReceivedLastSecondTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBandwidthSentLastMinuteTotal(value: Double): Self = StObject.set(x, "connectionBandwidthSentLastMinuteTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBandwidthSentLastSecondTotal(value: Double): Self = StObject.set(x, "connectionBandwidthSentLastSecondTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBytesReceivedTotal(value: Double): Self = StObject.set(x, "connectionBytesReceivedTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBytesSentTotal(value: Double): Self = StObject.set(x, "connectionBytesSentTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionClientIp(value: String): Self = StObject.set(x, "connectionClientIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionConnectedTime(value: Double): Self = StObject.set(x, "connectionConnectedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionFiletransferBandwidthReceived(value: Double): Self = StObject.set(x, "connectionFiletransferBandwidthReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionFiletransferBandwidthSent(value: Double): Self = StObject.set(x, "connectionFiletransferBandwidthSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPacketsReceivedTotal(value: Double): Self = StObject.set(x, "connectionPacketsReceivedTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPacketsSentTotal(value: Double): Self = StObject.set(x, "connectionPacketsSentTotal", value.asInstanceOf[js.Any])
  }
}

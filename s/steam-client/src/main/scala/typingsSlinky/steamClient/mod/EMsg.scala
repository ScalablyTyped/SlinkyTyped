package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EMsg extends StObject
@JSImport("steam-client", "EMsg")
@js.native
object EMsg extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EMsg with Double] = js.native
  
  // obsolete
  @js.native
  sealed trait AIGetAppGCFlags extends EMsg
  /* 423 */ val AIGetAppGCFlags: typingsSlinky.steamClient.mod.EMsg.AIGetAppGCFlags with Double = js.native
  
  @js.native
  sealed trait AIGetAppGCFlagsResponse extends EMsg
  /* 424 */ val AIGetAppGCFlagsResponse: typingsSlinky.steamClient.mod.EMsg.AIGetAppGCFlagsResponse with Double = js.native
  
  @js.native
  sealed trait AIGetAppInfo extends EMsg
  /* 427 */ val AIGetAppInfo: typingsSlinky.steamClient.mod.EMsg.AIGetAppInfo with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AIGetAppInfoResponse extends EMsg
  /* 428 */ val AIGetAppInfoResponse: typingsSlinky.steamClient.mod.EMsg.AIGetAppInfoResponse with Double = js.native
  
  @js.native
  sealed trait AIGetAppList extends EMsg
  /* 425 */ val AIGetAppList: typingsSlinky.steamClient.mod.EMsg.AIGetAppList with Double = js.native
  
  @js.native
  sealed trait AIGetAppListResponse extends EMsg
  /* 426 */ val AIGetAppListResponse: typingsSlinky.steamClient.mod.EMsg.AIGetAppListResponse with Double = js.native
  
  @js.native
  sealed trait AISAppInfoTableChanged extends EMsg
  /* 407 */ val AISAppInfoTableChanged: typingsSlinky.steamClient.mod.EMsg.AISAppInfoTableChanged with Double = js.native
  
  @js.native
  sealed trait AISCreateMarketingMessage extends EMsg
  /* 409 */ val AISCreateMarketingMessage: typingsSlinky.steamClient.mod.EMsg.AISCreateMarketingMessage with Double = js.native
  
  @js.native
  sealed trait AISCreateMarketingMessageResponse extends EMsg
  /* 410 */ val AISCreateMarketingMessageResponse: typingsSlinky.steamClient.mod.EMsg.AISCreateMarketingMessageResponse with Double = js.native
  
  @js.native
  sealed trait AISDeleteMarketingMessage extends EMsg
  /* 416 */ val AISDeleteMarketingMessage: typingsSlinky.steamClient.mod.EMsg.AISDeleteMarketingMessage with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AISGetCouponDefinition extends EMsg
  /* 429 */ val AISGetCouponDefinition: typingsSlinky.steamClient.mod.EMsg.AISGetCouponDefinition with Double = js.native
  
  @js.native
  sealed trait AISGetCouponDefinitionResponse extends EMsg
  /* 430 */ val AISGetCouponDefinitionResponse: typingsSlinky.steamClient.mod.EMsg.AISGetCouponDefinitionResponse with Double = js.native
  
  @js.native
  sealed trait AISGetMarketingMessage extends EMsg
  /* 411 */ val AISGetMarketingMessage: typingsSlinky.steamClient.mod.EMsg.AISGetMarketingMessage with Double = js.native
  
  @js.native
  sealed trait AISGetMarketingMessageResponse extends EMsg
  /* 412 */ val AISGetMarketingMessageResponse: typingsSlinky.steamClient.mod.EMsg.AISGetMarketingMessageResponse with Double = js.native
  
  @js.native
  sealed trait AISGetMarketingTreatments extends EMsg
  /* 419 */ val AISGetMarketingTreatments: typingsSlinky.steamClient.mod.EMsg.AISGetMarketingTreatments with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AISGetMarketingTreatmentsResponse extends EMsg
  /* 420 */ val AISGetMarketingTreatmentsResponse: typingsSlinky.steamClient.mod.EMsg.AISGetMarketingTreatmentsResponse with Double = js.native
  
  @js.native
  sealed trait AISGetPackageChangeNumber extends EMsg
  /* 405 */ val AISGetPackageChangeNumber: typingsSlinky.steamClient.mod.EMsg.AISGetPackageChangeNumber with Double = js.native
  
  @js.native
  sealed trait AISGetPackageChangeNumberResponse extends EMsg
  /* 406 */ val AISGetPackageChangeNumberResponse: typingsSlinky.steamClient.mod.EMsg.AISGetPackageChangeNumberResponse with Double = js.native
  
  @js.native
  sealed trait AISRefreshContentDescription extends EMsg
  /* 401 */ val AISRefreshContentDescription: typingsSlinky.steamClient.mod.EMsg.AISRefreshContentDescription with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AISRequestContentDescription extends EMsg
  /* 402 */ val AISRequestContentDescription: typingsSlinky.steamClient.mod.EMsg.AISRequestContentDescription with Double = js.native
  
  @js.native
  sealed trait AISRequestMarketingMessageUpdate extends EMsg
  /* 415 */ val AISRequestMarketingMessageUpdate: typingsSlinky.steamClient.mod.EMsg.AISRequestMarketingMessageUpdate with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AISRequestMarketingTreatmentUpdate extends EMsg
  /* 421 */ val AISRequestMarketingTreatmentUpdate: typingsSlinky.steamClient.mod.EMsg.AISRequestMarketingTreatmentUpdate with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AISTestAddPackage extends EMsg
  /* 422 */ val AISTestAddPackage: typingsSlinky.steamClient.mod.EMsg.AISTestAddPackage with Double = js.native
  
  @js.native
  sealed trait AISTestEnableGC extends EMsg
  /* 433 */ val AISTestEnableGC: typingsSlinky.steamClient.mod.EMsg.AISTestEnableGC with Double = js.native
  
  @js.native
  sealed trait AISUpdateAppInfo extends EMsg
  /* 403 */ val AISUpdateAppInfo: typingsSlinky.steamClient.mod.EMsg.AISUpdateAppInfo with Double = js.native
  
  @js.native
  sealed trait AISUpdateMarketingMessage extends EMsg
  /* 413 */ val AISUpdateMarketingMessage: typingsSlinky.steamClient.mod.EMsg.AISUpdateMarketingMessage with Double = js.native
  
  @js.native
  sealed trait AISUpdateMarketingMessageResponse extends EMsg
  /* 414 */ val AISUpdateMarketingMessageResponse: typingsSlinky.steamClient.mod.EMsg.AISUpdateMarketingMessageResponse with Double = js.native
  
  // obsolete "renamed to AISUpdatePackageCosts"
  @js.native
  sealed trait AISUpdatePackageCosts extends EMsg
  /* 404 */ val AISUpdatePackageCosts: typingsSlinky.steamClient.mod.EMsg.AISUpdatePackageCosts with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AISUpdatePackageCostsResponse extends EMsg
  /* 408 */ val AISUpdatePackageCostsResponse: typingsSlinky.steamClient.mod.EMsg.AISUpdatePackageCostsResponse with Double = js.native
  
  @js.native
  sealed trait AISUpdatePackageInfo extends EMsg
  /* 404 */ val AISUpdatePackageInfo: typingsSlinky.steamClient.mod.EMsg.AISUpdatePackageInfo with Double = js.native
  
  @js.native
  sealed trait AISUpdateSlaveContentDescription extends EMsg
  /* 431 */ val AISUpdateSlaveContentDescription: typingsSlinky.steamClient.mod.EMsg.AISUpdateSlaveContentDescription with Double = js.native
  
  @js.native
  sealed trait AISUpdateSlaveContentDescriptionResponse extends EMsg
  /* 432 */ val AISUpdateSlaveContentDescriptionResponse: typingsSlinky.steamClient.mod.EMsg.AISUpdateSlaveContentDescriptionResponse with Double = js.native
  
  @js.native
  sealed trait AMAccountPS3Unlink extends EMsg
  /* 4310 */ val AMAccountPS3Unlink: typingsSlinky.steamClient.mod.EMsg.AMAccountPS3Unlink with Double = js.native
  
  @js.native
  sealed trait AMAccountPS3UnlinkResponse extends EMsg
  /* 4311 */ val AMAccountPS3UnlinkResponse: typingsSlinky.steamClient.mod.EMsg.AMAccountPS3UnlinkResponse with Double = js.native
  
  @js.native
  sealed trait AMAcctAllowedToPurchase extends EMsg
  /* 4346 */ val AMAcctAllowedToPurchase: typingsSlinky.steamClient.mod.EMsg.AMAcctAllowedToPurchase with Double = js.native
  
  @js.native
  sealed trait AMAcctAllowedToPurchaseResponse extends EMsg
  /* 4347 */ val AMAcctAllowedToPurchaseResponse: typingsSlinky.steamClient.mod.EMsg.AMAcctAllowedToPurchaseResponse with Double = js.native
  
  @js.native
  sealed trait AMAcknowledgeClanInvite extends EMsg
  /* 565 */ val AMAcknowledgeClanInvite: typingsSlinky.steamClient.mod.EMsg.AMAcknowledgeClanInvite with Double = js.native
  
  @js.native
  sealed trait AMAddClanNews extends EMsg
  /* 4141 */ val AMAddClanNews: typingsSlinky.steamClient.mod.EMsg.AMAddClanNews with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMAddComment extends EMsg
  /* 4202 */ val AMAddComment: typingsSlinky.steamClient.mod.EMsg.AMAddComment with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMAddCommentResponse extends EMsg
  /* 4203 */ val AMAddCommentResponse: typingsSlinky.steamClient.mod.EMsg.AMAddCommentResponse with Double = js.native
  
  @js.native
  sealed trait AMAddFounderToClan extends EMsg
  /* 4061 */ val AMAddFounderToClan: typingsSlinky.steamClient.mod.EMsg.AMAddFounderToClan with Double = js.native
  
  @js.native
  sealed trait AMAddFreeLicense extends EMsg
  /* 4224 */ val AMAddFreeLicense: typingsSlinky.steamClient.mod.EMsg.AMAddFreeLicense with Double = js.native
  
  @js.native
  sealed trait AMAddFreeLicenseResponse extends EMsg
  /* 4285 */ val AMAddFreeLicenseResponse: typingsSlinky.steamClient.mod.EMsg.AMAddFreeLicenseResponse with Double = js.native
  
  @js.native
  sealed trait AMAddFriend extends EMsg
  /* 4081 */ val AMAddFriend: typingsSlinky.steamClient.mod.EMsg.AMAddFriend with Double = js.native
  
  @js.native
  sealed trait AMAddFriendResponse extends EMsg
  /* 4082 */ val AMAddFriendResponse: typingsSlinky.steamClient.mod.EMsg.AMAddFriendResponse with Double = js.native
  
  @js.native
  sealed trait AMAddLicense extends EMsg
  /* 505 */ val AMAddLicense: typingsSlinky.steamClient.mod.EMsg.AMAddLicense with Double = js.native
  
  @js.native
  sealed trait AMAddMinutesToLicense extends EMsg
  /* 510 */ val AMAddMinutesToLicense: typingsSlinky.steamClient.mod.EMsg.AMAddMinutesToLicense with Double = js.native
  
  @js.native
  sealed trait AMAddPublisherUser extends EMsg
  /* 4280 */ val AMAddPublisherUser: typingsSlinky.steamClient.mod.EMsg.AMAddPublisherUser with Double = js.native
  
  @js.native
  sealed trait AMAddUsersToMarketingTreatment extends EMsg
  /* 4234 */ val AMAddUsersToMarketingTreatment: typingsSlinky.steamClient.mod.EMsg.AMAddUsersToMarketingTreatment with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMAllowUserContentQuery extends EMsg
  /* 558 */ val AMAllowUserContentQuery: typingsSlinky.steamClient.mod.EMsg.AMAllowUserContentQuery with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMAllowUserContentResponse extends EMsg
  /* 559 */ val AMAllowUserContentResponse: typingsSlinky.steamClient.mod.EMsg.AMAllowUserContentResponse with Double = js.native
  
  @js.native
  sealed trait AMAllowUserFilesRequest extends EMsg
  /* 4156 */ val AMAllowUserFilesRequest: typingsSlinky.steamClient.mod.EMsg.AMAllowUserFilesRequest with Double = js.native
  
  @js.native
  sealed trait AMAllowUserFilesResponse extends EMsg
  /* 4157 */ val AMAllowUserFilesResponse: typingsSlinky.steamClient.mod.EMsg.AMAllowUserFilesResponse with Double = js.native
  
  @js.native
  sealed trait AMAuthenticateUser extends EMsg
  /* 592 */ val AMAuthenticateUser: typingsSlinky.steamClient.mod.EMsg.AMAuthenticateUser with Double = js.native
  
  @js.native
  sealed trait AMAuthenticateUserResponse extends EMsg
  /* 593 */ val AMAuthenticateUserResponse: typingsSlinky.steamClient.mod.EMsg.AMAuthenticateUserResponse with Double = js.native
  
  @js.native
  sealed trait AMAuthenticatedPlayerList extends EMsg
  /* 4315 */ val AMAuthenticatedPlayerList: typingsSlinky.steamClient.mod.EMsg.AMAuthenticatedPlayerList with Double = js.native
  
  @js.native
  sealed trait AMBanFromChat extends EMsg
  /* 4145 */ val AMBanFromChat: typingsSlinky.steamClient.mod.EMsg.AMBanFromChat with Double = js.native
  
  @js.native
  sealed trait AMBeginProcessingLicenses extends EMsg
  /* 507 */ val AMBeginProcessingLicenses: typingsSlinky.steamClient.mod.EMsg.AMBeginProcessingLicenses with Double = js.native
  
  @js.native
  sealed trait AMBitPayPayment extends EMsg
  /* 4410 */ val AMBitPayPayment: typingsSlinky.steamClient.mod.EMsg.AMBitPayPayment with Double = js.native
  
  @js.native
  sealed trait AMBitPayPaymentResponse extends EMsg
  /* 4411 */ val AMBitPayPaymentResponse: typingsSlinky.steamClient.mod.EMsg.AMBitPayPaymentResponse with Double = js.native
  
  @js.native
  sealed trait AMBoaCompraPayment extends EMsg
  /* 4380 */ val AMBoaCompraPayment: typingsSlinky.steamClient.mod.EMsg.AMBoaCompraPayment with Double = js.native
  
  @js.native
  sealed trait AMBoaCompraPaymentResponse extends EMsg
  /* 4381 */ val AMBoaCompraPaymentResponse: typingsSlinky.steamClient.mod.EMsg.AMBoaCompraPaymentResponse with Double = js.native
  
  @js.native
  sealed trait AMCancelEasyCollect extends EMsg
  /* 4086 */ val AMCancelEasyCollect: typingsSlinky.steamClient.mod.EMsg.AMCancelEasyCollect with Double = js.native
  
  @js.native
  sealed trait AMCancelEasyCollectResponse extends EMsg
  /* 4087 */ val AMCancelEasyCollectResponse: typingsSlinky.steamClient.mod.EMsg.AMCancelEasyCollectResponse with Double = js.native
  
  @js.native
  sealed trait AMCancelLicense extends EMsg
  /* 511 */ val AMCancelLicense: typingsSlinky.steamClient.mod.EMsg.AMCancelLicense with Double = js.native
  
  @js.native
  sealed trait AMCancelPurchase extends EMsg
  /* 522 */ val AMCancelPurchase: typingsSlinky.steamClient.mod.EMsg.AMCancelPurchase with Double = js.native
  
  @js.native
  sealed trait AMChallengeNotification extends EMsg
  /* 4105 */ val AMChallengeNotification: typingsSlinky.steamClient.mod.EMsg.AMChallengeNotification with Double = js.native
  
  @js.native
  sealed trait AMChallengeVerdict extends EMsg
  /* 4104 */ val AMChallengeVerdict: typingsSlinky.steamClient.mod.EMsg.AMChallengeVerdict with Double = js.native
  
  @js.native
  sealed trait AMChangeClanOwner extends EMsg
  /* 4085 */ val AMChangeClanOwner: typingsSlinky.steamClient.mod.EMsg.AMChangeClanOwner with Double = js.native
  
  @js.native
  sealed trait AMChatActionResult extends EMsg
  /* 579 */ val AMChatActionResult: typingsSlinky.steamClient.mod.EMsg.AMChatActionResult with Double = js.native
  
  @js.native
  sealed trait AMChatCleanup extends EMsg
  /* 533 */ val AMChatCleanup: typingsSlinky.steamClient.mod.EMsg.AMChatCleanup with Double = js.native
  
  @js.native
  sealed trait AMChatEnter extends EMsg
  /* 577 */ val AMChatEnter: typingsSlinky.steamClient.mod.EMsg.AMChatEnter with Double = js.native
  
  @js.native
  sealed trait AMChatInvite extends EMsg
  /* 572 */ val AMChatInvite: typingsSlinky.steamClient.mod.EMsg.AMChatInvite with Double = js.native
  
  @js.native
  sealed trait AMChatMulti extends EMsg
  /* 570 */ val AMChatMulti: typingsSlinky.steamClient.mod.EMsg.AMChatMulti with Double = js.native
  
  @js.native
  sealed trait AMCheckClanInviteRateLimiting extends EMsg
  /* 4118 */ val AMCheckClanInviteRateLimiting: typingsSlinky.steamClient.mod.EMsg.AMCheckClanInviteRateLimiting with Double = js.native
  
  @js.native
  sealed trait AMCheckClanMembership extends EMsg
  /* 4075 */ val AMCheckClanMembership: typingsSlinky.steamClient.mod.EMsg.AMCheckClanMembership with Double = js.native
  
  @js.native
  sealed trait AMCheckClanMembershipResponse extends EMsg
  /* 4161 */ val AMCheckClanMembershipResponse: typingsSlinky.steamClient.mod.EMsg.AMCheckClanMembershipResponse with Double = js.native
  
  @js.native
  sealed trait AMClaimUnownedUserGift extends EMsg
  /* 4352 */ val AMClaimUnownedUserGift: typingsSlinky.steamClient.mod.EMsg.AMClaimUnownedUserGift with Double = js.native
  
  @js.native
  sealed trait AMClaimUnownedUserGiftResponse extends EMsg
  /* 4353 */ val AMClaimUnownedUserGiftResponse: typingsSlinky.steamClient.mod.EMsg.AMClaimUnownedUserGiftResponse with Double = js.native
  
  @js.native
  sealed trait AMClanCleanup extends EMsg
  /* 534 */ val AMClanCleanup: typingsSlinky.steamClient.mod.EMsg.AMClanCleanup with Double = js.native
  
  @js.native
  sealed trait AMClanCleanupList extends EMsg
  /* 538 */ val AMClanCleanupList: typingsSlinky.steamClient.mod.EMsg.AMClanCleanupList with Double = js.native
  
  @js.native
  sealed trait AMClanDataUpdated extends EMsg
  /* 567 */ val AMClanDataUpdated: typingsSlinky.steamClient.mod.EMsg.AMClanDataUpdated with Double = js.native
  
  @js.native
  sealed trait AMClanPermissions extends EMsg
  /* 4011 */ val AMClanPermissions: typingsSlinky.steamClient.mod.EMsg.AMClanPermissions with Double = js.native
  
  @js.native
  sealed trait AMClanPermissionsResponse extends EMsg
  /* 4012 */ val AMClanPermissionsResponse: typingsSlinky.steamClient.mod.EMsg.AMClanPermissionsResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMClansInCommon extends EMsg
  /* 4090 */ val AMClansInCommon: typingsSlinky.steamClient.mod.EMsg.AMClansInCommon with Double = js.native
  
  @js.native
  sealed trait AMClansInCommonCount extends EMsg
  /* 4103 */ val AMClansInCommonCount: typingsSlinky.steamClient.mod.EMsg.AMClansInCommonCount with Double = js.native
  
  @js.native
  sealed trait AMClansInCommonCountResponse extends EMsg
  /* 4097 */ val AMClansInCommonCountResponse: typingsSlinky.steamClient.mod.EMsg.AMClansInCommonCountResponse with Double = js.native
  
  @js.native
  sealed trait AMClansInCommonResponse extends EMsg
  /* 4091 */ val AMClansInCommonResponse: typingsSlinky.steamClient.mod.EMsg.AMClansInCommonResponse with Double = js.native
  
  @js.native
  sealed trait AMClearDispute extends EMsg
  /* 4264 */ val AMClearDispute: typingsSlinky.steamClient.mod.EMsg.AMClearDispute with Double = js.native
  
  @js.native
  sealed trait AMClearDisputeResponse extends EMsg
  /* 4265 */ val AMClearDisputeResponse: typingsSlinky.steamClient.mod.EMsg.AMClearDisputeResponse with Double = js.native
  
  @js.native
  sealed trait AMClearPersonaMetadataBlob extends EMsg
  /* 4306 */ val AMClearPersonaMetadataBlob: typingsSlinky.steamClient.mod.EMsg.AMClearPersonaMetadataBlob with Double = js.native
  
  @js.native
  sealed trait AMClientAcceptFriendInvite extends EMsg
  /* 576 */ val AMClientAcceptFriendInvite: typingsSlinky.steamClient.mod.EMsg.AMClientAcceptFriendInvite with Double = js.native
  
  @js.native
  sealed trait AMClientAddFriendToGroup extends EMsg
  /* 5566 */ val AMClientAddFriendToGroup: typingsSlinky.steamClient.mod.EMsg.AMClientAddFriendToGroup with Double = js.native
  
  @js.native
  sealed trait AMClientAddFriendToGroupResponse extends EMsg
  /* 5567 */ val AMClientAddFriendToGroupResponse: typingsSlinky.steamClient.mod.EMsg.AMClientAddFriendToGroupResponse with Double = js.native
  
  @js.native
  sealed trait AMClientChatActionRelay extends EMsg
  /* 598 */ val AMClientChatActionRelay: typingsSlinky.steamClient.mod.EMsg.AMClientChatActionRelay with Double = js.native
  
  @js.native
  sealed trait AMClientChatInviteRelay extends EMsg
  /* 571 */ val AMClientChatInviteRelay: typingsSlinky.steamClient.mod.EMsg.AMClientChatInviteRelay with Double = js.native
  
  @js.native
  sealed trait AMClientChatMemberInfoRelay extends EMsg
  /* 574 */ val AMClientChatMemberInfoRelay: typingsSlinky.steamClient.mod.EMsg.AMClientChatMemberInfoRelay with Double = js.native
  
  @js.native
  sealed trait AMClientChatMsgRelay extends EMsg
  /* 569 */ val AMClientChatMsgRelay: typingsSlinky.steamClient.mod.EMsg.AMClientChatMsgRelay with Double = js.native
  
  @js.native
  sealed trait AMClientCreateFriendsGroup extends EMsg
  /* 5560 */ val AMClientCreateFriendsGroup: typingsSlinky.steamClient.mod.EMsg.AMClientCreateFriendsGroup with Double = js.native
  
  @js.native
  sealed trait AMClientCreateFriendsGroupResponse extends EMsg
  /* 5561 */ val AMClientCreateFriendsGroupResponse: typingsSlinky.steamClient.mod.EMsg.AMClientCreateFriendsGroupResponse with Double = js.native
  
  @js.native
  sealed trait AMClientDeleteFriendsGroup extends EMsg
  /* 5562 */ val AMClientDeleteFriendsGroup: typingsSlinky.steamClient.mod.EMsg.AMClientDeleteFriendsGroup with Double = js.native
  
  @js.native
  sealed trait AMClientDeleteFriendsGroupResponse extends EMsg
  /* 5563 */ val AMClientDeleteFriendsGroupResponse: typingsSlinky.steamClient.mod.EMsg.AMClientDeleteFriendsGroupResponse with Double = js.native
  
  @js.native
  sealed trait AMClientJoinChatRelay extends EMsg
  /* 573 */ val AMClientJoinChatRelay: typingsSlinky.steamClient.mod.EMsg.AMClientJoinChatRelay with Double = js.native
  
  @js.native
  sealed trait AMClientNotPlaying extends EMsg
  /* 553 */ val AMClientNotPlaying: typingsSlinky.steamClient.mod.EMsg.AMClientNotPlaying with Double = js.native
  
  @js.native
  sealed trait AMClientPublishRemovalFromSource extends EMsg
  /* 578 */ val AMClientPublishRemovalFromSource: typingsSlinky.steamClient.mod.EMsg.AMClientPublishRemovalFromSource with Double = js.native
  
  @js.native
  sealed trait AMClientRemoveFriendFromGroup extends EMsg
  /* 5568 */ val AMClientRemoveFriendFromGroup: typingsSlinky.steamClient.mod.EMsg.AMClientRemoveFriendFromGroup with Double = js.native
  
  @js.native
  sealed trait AMClientRemoveFriendFromGroupResponse extends EMsg
  /* 5569 */ val AMClientRemoveFriendFromGroupResponse: typingsSlinky.steamClient.mod.EMsg.AMClientRemoveFriendFromGroupResponse with Double = js.native
  
  @js.native
  sealed trait AMClientRenameFriendsGroup extends EMsg
  /* 5564 */ val AMClientRenameFriendsGroup: typingsSlinky.steamClient.mod.EMsg.AMClientRenameFriendsGroup with Double = js.native
  
  @js.native
  sealed trait AMClientRenameFriendsGroupResponse extends EMsg
  /* 5565 */ val AMClientRenameFriendsGroupResponse: typingsSlinky.steamClient.mod.EMsg.AMClientRenameFriendsGroupResponse with Double = js.native
  
  @js.native
  sealed trait AMClientSetPlayerNickname extends EMsg
  /* 5588 */ val AMClientSetPlayerNickname: typingsSlinky.steamClient.mod.EMsg.AMClientSetPlayerNickname with Double = js.native
  
  @js.native
  sealed trait AMClientSetPlayerNicknameResponse extends EMsg
  /* 5589 */ val AMClientSetPlayerNicknameResponse: typingsSlinky.steamClient.mod.EMsg.AMClientSetPlayerNicknameResponse with Double = js.native
  
  @js.native
  sealed trait AMCompleteExternalPurchase extends EMsg
  /* 4383 */ val AMCompleteExternalPurchase: typingsSlinky.steamClient.mod.EMsg.AMCompleteExternalPurchase with Double = js.native
  
  @js.native
  sealed trait AMCompleteExternalPurchaseResponse extends EMsg
  /* 4384 */ val AMCompleteExternalPurchaseResponse: typingsSlinky.steamClient.mod.EMsg.AMCompleteExternalPurchaseResponse with Double = js.native
  
  @js.native
  sealed trait AMCompletePurchase extends EMsg
  /* 521 */ val AMCompletePurchase: typingsSlinky.steamClient.mod.EMsg.AMCompletePurchase with Double = js.native
  
  @js.native
  sealed trait AMConvertClan extends EMsg
  /* 4093 */ val AMConvertClan: typingsSlinky.steamClient.mod.EMsg.AMConvertClan with Double = js.native
  
  @js.native
  sealed trait AMConvertWallet extends EMsg
  /* 4251 */ val AMConvertWallet: typingsSlinky.steamClient.mod.EMsg.AMConvertWallet with Double = js.native
  
  @js.native
  sealed trait AMConvertWalletResponse extends EMsg
  /* 4252 */ val AMConvertWalletResponse: typingsSlinky.steamClient.mod.EMsg.AMConvertWalletResponse with Double = js.native
  
  @js.native
  sealed trait AMCreateAccountRecord extends EMsg
  /* 4109 */ val AMCreateAccountRecord: typingsSlinky.steamClient.mod.EMsg.AMCreateAccountRecord with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMCreateAccountRecordInSteam3 extends EMsg
  /* 4183 */ val AMCreateAccountRecordInSteam3: typingsSlinky.steamClient.mod.EMsg.AMCreateAccountRecordInSteam3 with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMCreateAccountResponse extends EMsg
  /* 129 */ val AMCreateAccountResponse: typingsSlinky.steamClient.mod.EMsg.AMCreateAccountResponse with Double = js.native
  
  @js.native
  sealed trait AMCreateChargeback extends EMsg
  /* 4260 */ val AMCreateChargeback: typingsSlinky.steamClient.mod.EMsg.AMCreateChargeback with Double = js.native
  
  @js.native
  sealed trait AMCreateChargebackResponse extends EMsg
  /* 4261 */ val AMCreateChargebackResponse: typingsSlinky.steamClient.mod.EMsg.AMCreateChargebackResponse with Double = js.native
  
  @js.native
  sealed trait AMCreateChat extends EMsg
  /* 4001 */ val AMCreateChat: typingsSlinky.steamClient.mod.EMsg.AMCreateChat with Double = js.native
  
  @js.native
  sealed trait AMCreateChatResponse extends EMsg
  /* 4002 */ val AMCreateChatResponse: typingsSlinky.steamClient.mod.EMsg.AMCreateChatResponse with Double = js.native
  
  @js.native
  sealed trait AMCreateClan extends EMsg
  /* 586 */ val AMCreateClan: typingsSlinky.steamClient.mod.EMsg.AMCreateClan with Double = js.native
  
  @js.native
  sealed trait AMCreateClanAnnouncement extends EMsg
  /* 4027 */ val AMCreateClanAnnouncement: typingsSlinky.steamClient.mod.EMsg.AMCreateClanAnnouncement with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMCreateClanAnnouncementResponse extends EMsg
  /* 4028 */ val AMCreateClanAnnouncementResponse: typingsSlinky.steamClient.mod.EMsg.AMCreateClanAnnouncementResponse with Double = js.native
  
  @js.native
  sealed trait AMCreateClanEvent extends EMsg
  /* 4013 */ val AMCreateClanEvent: typingsSlinky.steamClient.mod.EMsg.AMCreateClanEvent with Double = js.native
  
  @js.native
  sealed trait AMCreateClanEventResponse extends EMsg
  /* 4014 */ val AMCreateClanEventResponse: typingsSlinky.steamClient.mod.EMsg.AMCreateClanEventResponse with Double = js.native
  
  @js.native
  sealed trait AMCreateClanResponse extends EMsg
  /* 587 */ val AMCreateClanResponse: typingsSlinky.steamClient.mod.EMsg.AMCreateClanResponse with Double = js.native
  
  @js.native
  sealed trait AMCreateDispute extends EMsg
  /* 4262 */ val AMCreateDispute: typingsSlinky.steamClient.mod.EMsg.AMCreateDispute with Double = js.native
  
  @js.native
  sealed trait AMCreateDisputeResponse extends EMsg
  /* 4263 */ val AMCreateDisputeResponse: typingsSlinky.steamClient.mod.EMsg.AMCreateDisputeResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMCreateRefund extends EMsg
  /* 4258 */ val AMCreateRefund: typingsSlinky.steamClient.mod.EMsg.AMCreateRefund with Double = js.native
  
  @js.native
  sealed trait AMCreateRefundResponse extends EMsg
  /* 4259 */ val AMCreateRefundResponse: typingsSlinky.steamClient.mod.EMsg.AMCreateRefundResponse with Double = js.native
  
  @js.native
  sealed trait AMDegicaPayment extends EMsg
  /* 4396 */ val AMDegicaPayment: typingsSlinky.steamClient.mod.EMsg.AMDegicaPayment with Double = js.native
  
  @js.native
  sealed trait AMDegicaPaymentResponse extends EMsg
  /* 4397 */ val AMDegicaPaymentResponse: typingsSlinky.steamClient.mod.EMsg.AMDegicaPaymentResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMDeleteClanAnnouncement extends EMsg
  /* 4035 */ val AMDeleteClanAnnouncement: typingsSlinky.steamClient.mod.EMsg.AMDeleteClanAnnouncement with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMDeleteClanAnnouncementResponse extends EMsg
  /* 4036 */ val AMDeleteClanAnnouncementResponse: typingsSlinky.steamClient.mod.EMsg.AMDeleteClanAnnouncementResponse with Double = js.native
  
  @js.native
  sealed trait AMDeleteClanEvent extends EMsg
  /* 4019 */ val AMDeleteClanEvent: typingsSlinky.steamClient.mod.EMsg.AMDeleteClanEvent with Double = js.native
  
  @js.native
  sealed trait AMDeleteClanEventResponse extends EMsg
  /* 4020 */ val AMDeleteClanEventResponse: typingsSlinky.steamClient.mod.EMsg.AMDeleteClanEventResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMDeleteComment extends EMsg
  /* 4204 */ val AMDeleteComment: typingsSlinky.steamClient.mod.EMsg.AMDeleteComment with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMDeleteCommentResponse extends EMsg
  /* 4205 */ val AMDeleteCommentResponse: typingsSlinky.steamClient.mod.EMsg.AMDeleteCommentResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMDeleteStoredCard extends EMsg
  /* 4241 */ val AMDeleteStoredCard: typingsSlinky.steamClient.mod.EMsg.AMDeleteStoredCard with Double = js.native
  
  @js.native
  sealed trait AMDeleteStoredPaymentInfo extends EMsg
  /* 4246 */ val AMDeleteStoredPaymentInfo: typingsSlinky.steamClient.mod.EMsg.AMDeleteStoredPaymentInfo with Double = js.native
  
  @js.native
  sealed trait AMDeleteStoredPaypalAgreement extends EMsg
  /* 4330 */ val AMDeleteStoredPaypalAgreement: typingsSlinky.steamClient.mod.EMsg.AMDeleteStoredPaypalAgreement with Double = js.native
  
  @js.native
  sealed trait AMDumpClan extends EMsg
  /* 4084 */ val AMDumpClan: typingsSlinky.steamClient.mod.EMsg.AMDumpClan with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMDumpUser extends EMsg
  /* 4059 */ val AMDumpUser: typingsSlinky.steamClient.mod.EMsg.AMDumpUser with Double = js.native
  
  @js.native
  sealed trait AMEClubPayment extends EMsg
  /* 4398 */ val AMEClubPayment: typingsSlinky.steamClient.mod.EMsg.AMEClubPayment with Double = js.native
  
  @js.native
  sealed trait AMEClubPaymentResponse extends EMsg
  /* 4399 */ val AMEClubPaymentResponse: typingsSlinky.steamClient.mod.EMsg.AMEClubPaymentResponse with Double = js.native
  
  @js.native
  sealed trait AMEditBanReason extends EMsg
  /* 4160 */ val AMEditBanReason: typingsSlinky.steamClient.mod.EMsg.AMEditBanReason with Double = js.native
  
  @js.native
  sealed trait AMExpireCaptchaByGID extends EMsg
  /* 4382 */ val AMExpireCaptchaByGID: typingsSlinky.steamClient.mod.EMsg.AMExpireCaptchaByGID with Double = js.native
  
  @js.native
  sealed trait AMExtendLicense extends EMsg
  /* 509 */ val AMExtendLicense: typingsSlinky.steamClient.mod.EMsg.AMExtendLicense with Double = js.native
  
  @js.native
  sealed trait AMFinalizePurchase extends EMsg
  /* 4367 */ val AMFinalizePurchase: typingsSlinky.steamClient.mod.EMsg.AMFinalizePurchase with Double = js.native
  
  @js.native
  sealed trait AMFinalizePurchaseResponse extends EMsg
  /* 4368 */ val AMFinalizePurchaseResponse: typingsSlinky.steamClient.mod.EMsg.AMFinalizePurchaseResponse with Double = js.native
  
  @js.native
  sealed trait AMFindAccounts extends EMsg
  /* 580 */ val AMFindAccounts: typingsSlinky.steamClient.mod.EMsg.AMFindAccounts with Double = js.native
  
  @js.native
  sealed trait AMFindAccountsResponse extends EMsg
  /* 581 */ val AMFindAccountsResponse: typingsSlinky.steamClient.mod.EMsg.AMFindAccountsResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMFindClanUser extends EMsg
  /* 4143 */ val AMFindClanUser: typingsSlinky.steamClient.mod.EMsg.AMFindClanUser with Double = js.native
  
  @js.native
  sealed trait AMFindClanUserResponse extends EMsg
  /* 4144 */ val AMFindClanUserResponse: typingsSlinky.steamClient.mod.EMsg.AMFindClanUserResponse with Double = js.native
  
  @js.native
  sealed trait AMFindGSByIP extends EMsg
  /* 4106 */ val AMFindGSByIP: typingsSlinky.steamClient.mod.EMsg.AMFindGSByIP with Double = js.native
  
  @js.native
  sealed trait AMFindHungTransactions extends EMsg
  /* 518 */ val AMFindHungTransactions: typingsSlinky.steamClient.mod.EMsg.AMFindHungTransactions with Double = js.native
  
  @js.native
  sealed trait AMFixPendingPurchase extends EMsg
  /* 525 */ val AMFixPendingPurchase: typingsSlinky.steamClient.mod.EMsg.AMFixPendingPurchase with Double = js.native
  
  @js.native
  sealed trait AMFixPendingPurchaseResponse extends EMsg
  /* 526 */ val AMFixPendingPurchaseResponse: typingsSlinky.steamClient.mod.EMsg.AMFixPendingPurchaseResponse with Double = js.native
  
  @js.native
  sealed trait AMFixPendingRefund extends EMsg
  /* 535 */ val AMFixPendingRefund: typingsSlinky.steamClient.mod.EMsg.AMFixPendingRefund with Double = js.native
  
  @js.native
  sealed trait AMFoundGSByIP extends EMsg
  /* 4107 */ val AMFoundGSByIP: typingsSlinky.steamClient.mod.EMsg.AMFoundGSByIP with Double = js.native
  
  @js.native
  sealed trait AMFriendsInCommon extends EMsg
  /* 4100 */ val AMFriendsInCommon: typingsSlinky.steamClient.mod.EMsg.AMFriendsInCommon with Double = js.native
  
  @js.native
  sealed trait AMFriendsInCommonCountResponse extends EMsg
  /* 4102 */ val AMFriendsInCommonCountResponse: typingsSlinky.steamClient.mod.EMsg.AMFriendsInCommonCountResponse with Double = js.native
  
  @js.native
  sealed trait AMFriendsInCommonResponse extends EMsg
  /* 4101 */ val AMFriendsInCommonResponse: typingsSlinky.steamClient.mod.EMsg.AMFriendsInCommonResponse with Double = js.native
  
  @js.native
  sealed trait AMFriendsList extends EMsg
  /* 4098 */ val AMFriendsList: typingsSlinky.steamClient.mod.EMsg.AMFriendsList with Double = js.native
  
  @js.native
  sealed trait AMFriendsListResponse extends EMsg
  /* 4099 */ val AMFriendsListResponse: typingsSlinky.steamClient.mod.EMsg.AMFriendsListResponse with Double = js.native
  
  @js.native
  sealed trait AMGMSGameServerRemove extends EMsg
  /* 6406 */ val AMGMSGameServerRemove: typingsSlinky.steamClient.mod.EMsg.AMGMSGameServerRemove with Double = js.native
  
  @js.native
  sealed trait AMGMSGameServerUpdate extends EMsg
  /* 6405 */ val AMGMSGameServerUpdate: typingsSlinky.steamClient.mod.EMsg.AMGMSGameServerUpdate with Double = js.native
  
  @js.native
  sealed trait AMGSSearch extends EMsg
  /* 4213 */ val AMGSSearch: typingsSlinky.steamClient.mod.EMsg.AMGSSearch with Double = js.native
  
  @js.native
  sealed trait AMGameServerAccountChangePassword extends EMsg
  /* 4340 */ val AMGameServerAccountChangePassword: typingsSlinky.steamClient.mod.EMsg.AMGameServerAccountChangePassword with Double = js.native
  
  @js.native
  sealed trait AMGameServerAccountDeleteAccount extends EMsg
  /* 4341 */ val AMGameServerAccountDeleteAccount: typingsSlinky.steamClient.mod.EMsg.AMGameServerAccountDeleteAccount with Double = js.native
  
  @js.native
  sealed trait AMGameServerPlayerCompatibilityCheck extends EMsg
  /* 4335 */ val AMGameServerPlayerCompatibilityCheck: typingsSlinky.steamClient.mod.EMsg.AMGameServerPlayerCompatibilityCheck with Double = js.native
  
  @js.native
  sealed trait AMGameServerPlayerCompatibilityCheckResponse extends EMsg
  /* 4336 */ val AMGameServerPlayerCompatibilityCheckResponse: typingsSlinky.steamClient.mod.EMsg.AMGameServerPlayerCompatibilityCheckResponse with Double = js.native
  
  @js.native
  sealed trait AMGameServerRemove extends EMsg
  /* 4332 */ val AMGameServerRemove: typingsSlinky.steamClient.mod.EMsg.AMGameServerRemove with Double = js.native
  
  @js.native
  sealed trait AMGameServerUpdate extends EMsg
  /* 4331 */ val AMGameServerUpdate: typingsSlinky.steamClient.mod.EMsg.AMGameServerUpdate with Double = js.native
  
  @js.native
  sealed trait AMGetAccountBanInfo extends EMsg
  /* 4323 */ val AMGetAccountBanInfo: typingsSlinky.steamClient.mod.EMsg.AMGetAccountBanInfo with Double = js.native
  
  @js.native
  sealed trait AMGetAccountBanInfoResponse extends EMsg
  /* 4324 */ val AMGetAccountBanInfoResponse: typingsSlinky.steamClient.mod.EMsg.AMGetAccountBanInfoResponse with Double = js.native
  
  @js.native
  sealed trait AMGetAccountCommunityBanInfo extends EMsg
  /* 4338 */ val AMGetAccountCommunityBanInfo: typingsSlinky.steamClient.mod.EMsg.AMGetAccountCommunityBanInfo with Double = js.native
  
  @js.native
  sealed trait AMGetAccountCommunityBanInfoResponse extends EMsg
  /* 4339 */ val AMGetAccountCommunityBanInfoResponse: typingsSlinky.steamClient.mod.EMsg.AMGetAccountCommunityBanInfoResponse with Double = js.native
  
  @js.native
  sealed trait AMGetAccountDetails extends EMsg
  /* 4287 */ val AMGetAccountDetails: typingsSlinky.steamClient.mod.EMsg.AMGetAccountDetails with Double = js.native
  
  @js.native
  sealed trait AMGetAccountDetails2 extends EMsg
  /* 4112 */ val AMGetAccountDetails2: typingsSlinky.steamClient.mod.EMsg.AMGetAccountDetails2 with Double = js.native
  
  @js.native
  sealed trait AMGetAccountDetailsResponse extends EMsg
  /* 4288 */ val AMGetAccountDetailsResponse: typingsSlinky.steamClient.mod.EMsg.AMGetAccountDetailsResponse with Double = js.native
  
  @js.native
  sealed trait AMGetAccountDetailsResponse2 extends EMsg
  /* 4113 */ val AMGetAccountDetailsResponse2: typingsSlinky.steamClient.mod.EMsg.AMGetAccountDetailsResponse2 with Double = js.native
  
  @js.native
  sealed trait AMGetAccountEmailAddress extends EMsg
  /* 4006 */ val AMGetAccountEmailAddress: typingsSlinky.steamClient.mod.EMsg.AMGetAccountEmailAddress with Double = js.native
  
  @js.native
  sealed trait AMGetAccountEmailAddressResponse extends EMsg
  /* 4007 */ val AMGetAccountEmailAddressResponse: typingsSlinky.steamClient.mod.EMsg.AMGetAccountEmailAddressResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetAccountFlagsForWGSpoofing extends EMsg
  /* 4294 */ val AMGetAccountFlagsForWGSpoofing: typingsSlinky.steamClient.mod.EMsg.AMGetAccountFlagsForWGSpoofing with Double = js.native
  
  @js.native
  sealed trait AMGetAccountFlagsForWGSpoofingResponse extends EMsg
  /* 4295 */ val AMGetAccountFlagsForWGSpoofingResponse: typingsSlinky.steamClient.mod.EMsg.AMGetAccountFlagsForWGSpoofingResponse with Double = js.native
  
  @js.native
  sealed trait AMGetAccountFriendsCount extends EMsg
  /* 594 */ val AMGetAccountFriendsCount: typingsSlinky.steamClient.mod.EMsg.AMGetAccountFriendsCount with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetAccountFriendsCountResponse extends EMsg
  /* 595 */ val AMGetAccountFriendsCountResponse: typingsSlinky.steamClient.mod.EMsg.AMGetAccountFriendsCountResponse with Double = js.native
  
  @js.native
  sealed trait AMGetAccountLinks extends EMsg
  /* 4069 */ val AMGetAccountLinks: typingsSlinky.steamClient.mod.EMsg.AMGetAccountLinks with Double = js.native
  
  @js.native
  sealed trait AMGetAccountLinksResponse extends EMsg
  /* 4070 */ val AMGetAccountLinksResponse: typingsSlinky.steamClient.mod.EMsg.AMGetAccountLinksResponse with Double = js.native
  
  @js.native
  sealed trait AMGetAccountPSNInfo extends EMsg
  /* 4313 */ val AMGetAccountPSNInfo: typingsSlinky.steamClient.mod.EMsg.AMGetAccountPSNInfo with Double = js.native
  
  @js.native
  sealed trait AMGetAccountPSNInfoResponse extends EMsg
  /* 4314 */ val AMGetAccountPSNInfoResponse: typingsSlinky.steamClient.mod.EMsg.AMGetAccountPSNInfoResponse with Double = js.native
  
  @js.native
  sealed trait AMGetAccountResetDetailsRequest extends EMsg
  /* 4408 */ val AMGetAccountResetDetailsRequest: typingsSlinky.steamClient.mod.EMsg.AMGetAccountResetDetailsRequest with Double = js.native
  
  @js.native
  sealed trait AMGetAccountResetDetailsResponse extends EMsg
  /* 4409 */ val AMGetAccountResetDetailsResponse: typingsSlinky.steamClient.mod.EMsg.AMGetAccountResetDetailsResponse with Double = js.native
  
  @js.native
  sealed trait AMGetAccountStatus extends EMsg
  /* 4158 */ val AMGetAccountStatus: typingsSlinky.steamClient.mod.EMsg.AMGetAccountStatus with Double = js.native
  
  @js.native
  sealed trait AMGetAccountStatusResponse extends EMsg
  /* 4159 */ val AMGetAccountStatusResponse: typingsSlinky.steamClient.mod.EMsg.AMGetAccountStatusResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetBillingAddress extends EMsg
  /* 4188 */ val AMGetBillingAddress: typingsSlinky.steamClient.mod.EMsg.AMGetBillingAddress with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetBillingAddressResponse extends EMsg
  /* 4189 */ val AMGetBillingAddressResponse: typingsSlinky.steamClient.mod.EMsg.AMGetBillingAddressResponse with Double = js.native
  
  @js.native
  sealed trait AMGetCaptchaDataByGID extends EMsg
  /* 4134 */ val AMGetCaptchaDataByGID: typingsSlinky.steamClient.mod.EMsg.AMGetCaptchaDataByGID with Double = js.native
  
  @js.native
  sealed trait AMGetCaptchaDataByGIDResponse extends EMsg
  /* 4135 */ val AMGetCaptchaDataByGIDResponse: typingsSlinky.steamClient.mod.EMsg.AMGetCaptchaDataByGIDResponse with Double = js.native
  
  @js.native
  sealed trait AMGetCaptchaDataForIP extends EMsg
  /* 4129 */ val AMGetCaptchaDataForIP: typingsSlinky.steamClient.mod.EMsg.AMGetCaptchaDataForIP with Double = js.native
  
  @js.native
  sealed trait AMGetCaptchaDataForIPResponse extends EMsg
  /* 4130 */ val AMGetCaptchaDataForIPResponse: typingsSlinky.steamClient.mod.EMsg.AMGetCaptchaDataForIPResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetCardList extends EMsg
  /* 4239 */ val AMGetCardList: typingsSlinky.steamClient.mod.EMsg.AMGetCardList with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetCardListResponse extends EMsg
  /* 4240 */ val AMGetCardListResponse: typingsSlinky.steamClient.mod.EMsg.AMGetCardListResponse with Double = js.native
  
  @js.native
  sealed trait AMGetChatBanList extends EMsg
  /* 4065 */ val AMGetChatBanList: typingsSlinky.steamClient.mod.EMsg.AMGetChatBanList with Double = js.native
  
  @js.native
  sealed trait AMGetChatBanListResponse extends EMsg
  /* 4066 */ val AMGetChatBanListResponse: typingsSlinky.steamClient.mod.EMsg.AMGetChatBanListResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetClanAnnouncements extends EMsg
  /* 4033 */ val AMGetClanAnnouncements: typingsSlinky.steamClient.mod.EMsg.AMGetClanAnnouncements with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetClanAnnouncementsCount extends EMsg
  /* 4031 */ val AMGetClanAnnouncementsCount: typingsSlinky.steamClient.mod.EMsg.AMGetClanAnnouncementsCount with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetClanAnnouncementsCountResponse extends EMsg
  /* 4032 */ val AMGetClanAnnouncementsCountResponse: typingsSlinky.steamClient.mod.EMsg.AMGetClanAnnouncementsCountResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetClanAnnouncementsResponse extends EMsg
  /* 4034 */ val AMGetClanAnnouncementsResponse: typingsSlinky.steamClient.mod.EMsg.AMGetClanAnnouncementsResponse with Double = js.native
  
  @js.native
  sealed trait AMGetClanDetails extends EMsg
  /* 588 */ val AMGetClanDetails: typingsSlinky.steamClient.mod.EMsg.AMGetClanDetails with Double = js.native
  
  @js.native
  sealed trait AMGetClanDetailsForForumCreation extends EMsg
  /* 4373 */ val AMGetClanDetailsForForumCreation: typingsSlinky.steamClient.mod.EMsg.AMGetClanDetailsForForumCreation with Double = js.native
  
  @js.native
  sealed trait AMGetClanDetailsForForumCreationResponse extends EMsg
  /* 4374 */ val AMGetClanDetailsForForumCreationResponse: typingsSlinky.steamClient.mod.EMsg.AMGetClanDetailsForForumCreationResponse with Double = js.native
  
  @js.native
  sealed trait AMGetClanDetailsResponse extends EMsg
  /* 589 */ val AMGetClanDetailsResponse: typingsSlinky.steamClient.mod.EMsg.AMGetClanDetailsResponse with Double = js.native
  
  @js.native
  sealed trait AMGetClanEvents extends EMsg
  /* 4017 */ val AMGetClanEvents: typingsSlinky.steamClient.mod.EMsg.AMGetClanEvents with Double = js.native
  
  @js.native
  sealed trait AMGetClanEventsResponse extends EMsg
  /* 4018 */ val AMGetClanEventsResponse: typingsSlinky.steamClient.mod.EMsg.AMGetClanEventsResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetClanHistory extends EMsg
  /* 4039 */ val AMGetClanHistory: typingsSlinky.steamClient.mod.EMsg.AMGetClanHistory with Double = js.native
  
  @js.native
  sealed trait AMGetClanHistoryResponse extends EMsg
  /* 4040 */ val AMGetClanHistoryResponse: typingsSlinky.steamClient.mod.EMsg.AMGetClanHistoryResponse with Double = js.native
  
  @js.native
  sealed trait AMGetClanMembers extends EMsg
  /* 4076 */ val AMGetClanMembers: typingsSlinky.steamClient.mod.EMsg.AMGetClanMembers with Double = js.native
  
  @js.native
  sealed trait AMGetClanMembersResponse extends EMsg
  /* 4077 */ val AMGetClanMembersResponse: typingsSlinky.steamClient.mod.EMsg.AMGetClanMembersResponse with Double = js.native
  
  @js.native
  sealed trait AMGetClanMembershipList extends EMsg
  /* 4088 */ val AMGetClanMembershipList: typingsSlinky.steamClient.mod.EMsg.AMGetClanMembershipList with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetClanMembershipListResponse extends EMsg
  /* 4089 */ val AMGetClanMembershipListResponse: typingsSlinky.steamClient.mod.EMsg.AMGetClanMembershipListResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetClanOfficers extends EMsg
  /* 4298 */ val AMGetClanOfficers: typingsSlinky.steamClient.mod.EMsg.AMGetClanOfficers with Double = js.native
  
  @js.native
  sealed trait AMGetClanOfficersResponse extends EMsg
  /* 4299 */ val AMGetClanOfficersResponse: typingsSlinky.steamClient.mod.EMsg.AMGetClanOfficersResponse with Double = js.native
  
  @js.native
  sealed trait AMGetClanPOTW extends EMsg
  /* 4054 */ val AMGetClanPOTW: typingsSlinky.steamClient.mod.EMsg.AMGetClanPOTW with Double = js.native
  
  @js.native
  sealed trait AMGetClanPOTWResponse extends EMsg
  /* 4055 */ val AMGetClanPOTWResponse: typingsSlinky.steamClient.mod.EMsg.AMGetClanPOTWResponse with Double = js.native
  
  @js.native
  sealed trait AMGetClanPermissionBits extends EMsg
  /* 4041 */ val AMGetClanPermissionBits: typingsSlinky.steamClient.mod.EMsg.AMGetClanPermissionBits with Double = js.native
  
  @js.native
  sealed trait AMGetClanPermissionBitsResponse extends EMsg
  /* 4042 */ val AMGetClanPermissionBitsResponse: typingsSlinky.steamClient.mod.EMsg.AMGetClanPermissionBitsResponse with Double = js.native
  
  @js.native
  sealed trait AMGetClanPermissionSettings extends EMsg
  /* 4023 */ val AMGetClanPermissionSettings: typingsSlinky.steamClient.mod.EMsg.AMGetClanPermissionSettings with Double = js.native
  
  @js.native
  sealed trait AMGetClanPermissionSettingsResponse extends EMsg
  /* 4024 */ val AMGetClanPermissionSettingsResponse: typingsSlinky.steamClient.mod.EMsg.AMGetClanPermissionSettingsResponse with Double = js.native
  
  @js.native
  sealed trait AMGetClanRank extends EMsg
  /* 4050 */ val AMGetClanRank: typingsSlinky.steamClient.mod.EMsg.AMGetClanRank with Double = js.native
  
  @js.native
  sealed trait AMGetClanRankResponse extends EMsg
  /* 4051 */ val AMGetClanRankResponse: typingsSlinky.steamClient.mod.EMsg.AMGetClanRankResponse with Double = js.native
  
  @js.native
  sealed trait AMGetComments extends EMsg
  /* 4200 */ val AMGetComments: typingsSlinky.steamClient.mod.EMsg.AMGetComments with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetCommentsResponse extends EMsg
  /* 4201 */ val AMGetCommentsResponse: typingsSlinky.steamClient.mod.EMsg.AMGetCommentsResponse with Double = js.native
  
  @js.native
  sealed trait AMGetCommunityPrivacyState extends EMsg
  /* 4116 */ val AMGetCommunityPrivacyState: typingsSlinky.steamClient.mod.EMsg.AMGetCommunityPrivacyState with Double = js.native
  
  @js.native
  sealed trait AMGetCommunityPrivacyStateResponse extends EMsg
  /* 4117 */ val AMGetCommunityPrivacyStateResponse: typingsSlinky.steamClient.mod.EMsg.AMGetCommunityPrivacyStateResponse with Double = js.native
  
  @js.native
  sealed trait AMGetFinalPrice extends EMsg
  /* 514 */ val AMGetFinalPrice: typingsSlinky.steamClient.mod.EMsg.AMGetFinalPrice with Double = js.native
  
  @js.native
  sealed trait AMGetFinalPriceResponse extends EMsg
  /* 515 */ val AMGetFinalPriceResponse: typingsSlinky.steamClient.mod.EMsg.AMGetFinalPriceResponse with Double = js.native
  
  @js.native
  sealed trait AMGetFriendRelationship extends EMsg
  /* 4124 */ val AMGetFriendRelationship: typingsSlinky.steamClient.mod.EMsg.AMGetFriendRelationship with Double = js.native
  
  @js.native
  sealed trait AMGetFriendRelationshipResponse extends EMsg
  /* 4125 */ val AMGetFriendRelationshipResponse: typingsSlinky.steamClient.mod.EMsg.AMGetFriendRelationshipResponse with Double = js.native
  
  @js.native
  sealed trait AMGetFriendsLobbies extends EMsg
  /* 4165 */ val AMGetFriendsLobbies: typingsSlinky.steamClient.mod.EMsg.AMGetFriendsLobbies with Double = js.native
  
  @js.native
  sealed trait AMGetFriendsLobbiesResponse extends EMsg
  /* 4166 */ val AMGetFriendsLobbiesResponse: typingsSlinky.steamClient.mod.EMsg.AMGetFriendsLobbiesResponse with Double = js.native
  
  @js.native
  sealed trait AMGetFriendsWishlistInfo extends EMsg
  /* 4296 */ val AMGetFriendsWishlistInfo: typingsSlinky.steamClient.mod.EMsg.AMGetFriendsWishlistInfo with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetFriendsWishlistInfoResponse extends EMsg
  /* 4297 */ val AMGetFriendsWishlistInfoResponse: typingsSlinky.steamClient.mod.EMsg.AMGetFriendsWishlistInfoResponse with Double = js.native
  
  @js.native
  sealed trait AMGetGSPlayerList extends EMsg
  /* 4271 */ val AMGetGSPlayerList: typingsSlinky.steamClient.mod.EMsg.AMGetGSPlayerList with Double = js.native
  
  @js.native
  sealed trait AMGetGSPlayerListResponse extends EMsg
  /* 4272 */ val AMGetGSPlayerListResponse: typingsSlinky.steamClient.mod.EMsg.AMGetGSPlayerListResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetGameMembers extends EMsg
  /* 4276 */ val AMGetGameMembers: typingsSlinky.steamClient.mod.EMsg.AMGetGameMembers with Double = js.native
  
  @js.native
  sealed trait AMGetGameMembersResponse extends EMsg
  /* 4277 */ val AMGetGameMembersResponse: typingsSlinky.steamClient.mod.EMsg.AMGetGameMembersResponse with Double = js.native
  
  @js.native
  sealed trait AMGetGiftTargetListRelay extends EMsg
  /* 4094 */ val AMGetGiftTargetListRelay: typingsSlinky.steamClient.mod.EMsg.AMGetGiftTargetListRelay with Double = js.native
  
  @js.native
  sealed trait AMGetIgnored extends EMsg
  /* 4120 */ val AMGetIgnored: typingsSlinky.steamClient.mod.EMsg.AMGetIgnored with Double = js.native
  
  @js.native
  sealed trait AMGetIgnoredResponse extends EMsg
  /* 4121 */ val AMGetIgnoredResponse: typingsSlinky.steamClient.mod.EMsg.AMGetIgnoredResponse with Double = js.native
  
  @js.native
  sealed trait AMGetLegacyGameKey extends EMsg
  /* 516 */ val AMGetLegacyGameKey: typingsSlinky.steamClient.mod.EMsg.AMGetLegacyGameKey with Double = js.native
  
  @js.native
  sealed trait AMGetLegacyGameKeyResponse extends EMsg
  /* 517 */ val AMGetLegacyGameKeyResponse: typingsSlinky.steamClient.mod.EMsg.AMGetLegacyGameKeyResponse with Double = js.native
  
  @js.native
  sealed trait AMGetLicenses extends EMsg
  /* 539 */ val AMGetLicenses: typingsSlinky.steamClient.mod.EMsg.AMGetLicenses with Double = js.native
  
  @js.native
  sealed trait AMGetLicensesResponse extends EMsg
  /* 540 */ val AMGetLicensesResponse: typingsSlinky.steamClient.mod.EMsg.AMGetLicensesResponse with Double = js.native
  
  @js.native
  sealed trait AMGetLobbyList extends EMsg
  /* 4136 */ val AMGetLobbyList: typingsSlinky.steamClient.mod.EMsg.AMGetLobbyList with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetLobbyListResponse extends EMsg
  /* 4137 */ val AMGetLobbyListResponse: typingsSlinky.steamClient.mod.EMsg.AMGetLobbyListResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetLobbyMetadata extends EMsg
  /* 4138 */ val AMGetLobbyMetadata: typingsSlinky.steamClient.mod.EMsg.AMGetLobbyMetadata with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetLobbyMetadataResponse extends EMsg
  /* 4139 */ val AMGetLobbyMetadataResponse: typingsSlinky.steamClient.mod.EMsg.AMGetLobbyMetadataResponse with Double = js.native
  
  @js.native
  sealed trait AMGetNameHistory extends EMsg
  /* 4301 */ val AMGetNameHistory: typingsSlinky.steamClient.mod.EMsg.AMGetNameHistory with Double = js.native
  
  @js.native
  sealed trait AMGetNameHistoryResponse extends EMsg
  /* 4302 */ val AMGetNameHistoryResponse: typingsSlinky.steamClient.mod.EMsg.AMGetNameHistoryResponse with Double = js.native
  
  @js.native
  sealed trait AMGetPaypalAgreements extends EMsg
  /* 4333 */ val AMGetPaypalAgreements: typingsSlinky.steamClient.mod.EMsg.AMGetPaypalAgreements with Double = js.native
  
  @js.native
  sealed trait AMGetPaypalAgreementsResponse extends EMsg
  /* 4334 */ val AMGetPaypalAgreementsResponse: typingsSlinky.steamClient.mod.EMsg.AMGetPaypalAgreementsResponse with Double = js.native
  
  @js.native
  sealed trait AMGetPendingNotificationCount extends EMsg
  /* 4375 */ val AMGetPendingNotificationCount: typingsSlinky.steamClient.mod.EMsg.AMGetPendingNotificationCount with Double = js.native
  
  @js.native
  sealed trait AMGetPendingNotificationCountResponse extends EMsg
  /* 4376 */ val AMGetPendingNotificationCountResponse: typingsSlinky.steamClient.mod.EMsg.AMGetPendingNotificationCountResponse with Double = js.native
  
  @js.native
  sealed trait AMGetPlayerBanDetails extends EMsg
  /* 4365 */ val AMGetPlayerBanDetails: typingsSlinky.steamClient.mod.EMsg.AMGetPlayerBanDetails with Double = js.native
  
  @js.native
  sealed trait AMGetPlayerBanDetailsResponse extends EMsg
  /* 4366 */ val AMGetPlayerBanDetailsResponse: typingsSlinky.steamClient.mod.EMsg.AMGetPlayerBanDetailsResponse with Double = js.native
  
  @js.native
  sealed trait AMGetPlayerLinkDetails extends EMsg
  /* 4289 */ val AMGetPlayerLinkDetails: typingsSlinky.steamClient.mod.EMsg.AMGetPlayerLinkDetails with Double = js.native
  
  @js.native
  sealed trait AMGetPlayerLinkDetailsResponse extends EMsg
  /* 4290 */ val AMGetPlayerLinkDetailsResponse: typingsSlinky.steamClient.mod.EMsg.AMGetPlayerLinkDetailsResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetPreviousCBAccount extends EMsg
  /* 4184 */ val AMGetPreviousCBAccount: typingsSlinky.steamClient.mod.EMsg.AMGetPreviousCBAccount with Double = js.native
  
  @js.native
  sealed trait AMGetPreviousCBAccountResponse extends EMsg
  /* 4185 */ val AMGetPreviousCBAccountResponse: typingsSlinky.steamClient.mod.EMsg.AMGetPreviousCBAccountResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetPurchaseStatus extends EMsg
  /* 4206 */ val AMGetPurchaseStatus: typingsSlinky.steamClient.mod.EMsg.AMGetPurchaseStatus with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetSingleClanAnnouncement extends EMsg
  /* 4037 */ val AMGetSingleClanAnnouncement: typingsSlinky.steamClient.mod.EMsg.AMGetSingleClanAnnouncement with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetSingleClanAnnouncementResponse extends EMsg
  /* 4038 */ val AMGetSingleClanAnnouncementResponse: typingsSlinky.steamClient.mod.EMsg.AMGetSingleClanAnnouncementResponse with Double = js.native
  
  @js.native
  sealed trait AMGetSingleClanEvent extends EMsg
  /* 4048 */ val AMGetSingleClanEvent: typingsSlinky.steamClient.mod.EMsg.AMGetSingleClanEvent with Double = js.native
  
  @js.native
  sealed trait AMGetSingleClanEventResponse extends EMsg
  /* 4049 */ val AMGetSingleClanEventResponse: typingsSlinky.steamClient.mod.EMsg.AMGetSingleClanEventResponse with Double = js.native
  
  @js.native
  sealed trait AMGetSteamIDForMicroTxn extends EMsg
  /* 4278 */ val AMGetSteamIDForMicroTxn: typingsSlinky.steamClient.mod.EMsg.AMGetSteamIDForMicroTxn with Double = js.native
  
  @js.native
  sealed trait AMGetSteamIDForMicroTxnResponse extends EMsg
  /* 4279 */ val AMGetSteamIDForMicroTxnResponse: typingsSlinky.steamClient.mod.EMsg.AMGetSteamIDForMicroTxnResponse with Double = js.native
  
  @js.native
  sealed trait AMGetStoredPaymentSummary extends EMsg
  /* 4247 */ val AMGetStoredPaymentSummary: typingsSlinky.steamClient.mod.EMsg.AMGetStoredPaymentSummary with Double = js.native
  
  @js.native
  sealed trait AMGetStoredPaymentSummaryResponse extends EMsg
  /* 4248 */ val AMGetStoredPaymentSummaryResponse: typingsSlinky.steamClient.mod.EMsg.AMGetStoredPaymentSummaryResponse with Double = js.native
  
  @js.native
  sealed trait AMGetUserAchievementStatus extends EMsg
  /* 4119 */ val AMGetUserAchievementStatus: typingsSlinky.steamClient.mod.EMsg.AMGetUserAchievementStatus with Double = js.native
  
  @js.native
  sealed trait AMGetUserClansNews extends EMsg
  /* 4175 */ val AMGetUserClansNews: typingsSlinky.steamClient.mod.EMsg.AMGetUserClansNews with Double = js.native
  
  @js.native
  sealed trait AMGetUserClansNewsResponse extends EMsg
  /* 4174 */ val AMGetUserClansNewsResponse: typingsSlinky.steamClient.mod.EMsg.AMGetUserClansNewsResponse with Double = js.native
  
  @js.native
  sealed trait AMGetUserCurrentGameInfo extends EMsg
  /* 4269 */ val AMGetUserCurrentGameInfo: typingsSlinky.steamClient.mod.EMsg.AMGetUserCurrentGameInfo with Double = js.native
  
  @js.native
  sealed trait AMGetUserCurrentGameInfoResponse extends EMsg
  /* 4270 */ val AMGetUserCurrentGameInfoResponse: typingsSlinky.steamClient.mod.EMsg.AMGetUserCurrentGameInfoResponse with Double = js.native
  
  @js.native
  sealed trait AMGetUserFriendNewsResponse extends EMsg
  /* 4172 */ val AMGetUserFriendNewsResponse: typingsSlinky.steamClient.mod.EMsg.AMGetUserFriendNewsResponse with Double = js.native
  
  @js.native
  sealed trait AMGetUserFriendsMinutesPlayed extends EMsg
  /* 4225 */ val AMGetUserFriendsMinutesPlayed: typingsSlinky.steamClient.mod.EMsg.AMGetUserFriendsMinutesPlayed with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetUserFriendsMinutesPlayedResponse extends EMsg
  /* 4226 */ val AMGetUserFriendsMinutesPlayedResponse: typingsSlinky.steamClient.mod.EMsg.AMGetUserFriendsMinutesPlayedResponse with Double = js.native
  
  @js.native
  sealed trait AMGetUserGameStats extends EMsg
  /* 4073 */ val AMGetUserGameStats: typingsSlinky.steamClient.mod.EMsg.AMGetUserGameStats with Double = js.native
  
  @js.native
  sealed trait AMGetUserGameStatsResponse extends EMsg
  /* 4074 */ val AMGetUserGameStatsResponse: typingsSlinky.steamClient.mod.EMsg.AMGetUserGameStatsResponse with Double = js.native
  
  @js.native
  sealed trait AMGetUserGameplayInfo extends EMsg
  /* 4237 */ val AMGetUserGameplayInfo: typingsSlinky.steamClient.mod.EMsg.AMGetUserGameplayInfo with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetUserGameplayInfoResponse extends EMsg
  /* 4238 */ val AMGetUserGameplayInfoResponse: typingsSlinky.steamClient.mod.EMsg.AMGetUserGameplayInfoResponse with Double = js.native
  
  @js.native
  sealed trait AMGetUserGifts extends EMsg
  /* 4316 */ val AMGetUserGifts: typingsSlinky.steamClient.mod.EMsg.AMGetUserGifts with Double = js.native
  
  @js.native
  sealed trait AMGetUserGiftsResponse extends EMsg
  /* 4317 */ val AMGetUserGiftsResponse: typingsSlinky.steamClient.mod.EMsg.AMGetUserGiftsResponse with Double = js.native
  
  @js.native
  sealed trait AMGetUserGroupStatus extends EMsg
  /* 921 */ val AMGetUserGroupStatus: typingsSlinky.steamClient.mod.EMsg.AMGetUserGroupStatus with Double = js.native
  
  @js.native
  sealed trait AMGetUserGroupStatusResponse extends EMsg
  /* 922 */ val AMGetUserGroupStatusResponse: typingsSlinky.steamClient.mod.EMsg.AMGetUserGroupStatusResponse with Double = js.native
  
  @js.native
  sealed trait AMGetUserHistory extends EMsg
  /* 4154 */ val AMGetUserHistory: typingsSlinky.steamClient.mod.EMsg.AMGetUserHistory with Double = js.native
  
  @js.native
  sealed trait AMGetUserHistoryResponse extends EMsg
  /* 4146 */ val AMGetUserHistoryResponse: typingsSlinky.steamClient.mod.EMsg.AMGetUserHistoryResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetUserLicenseHistory extends EMsg
  /* 4190 */ val AMGetUserLicenseHistory: typingsSlinky.steamClient.mod.EMsg.AMGetUserLicenseHistory with Double = js.native
  
  @js.native
  sealed trait AMGetUserLicenseHistoryResponse extends EMsg
  /* 4191 */ val AMGetUserLicenseHistoryResponse: typingsSlinky.steamClient.mod.EMsg.AMGetUserLicenseHistoryResponse with Double = js.native
  
  @js.native
  sealed trait AMGetUserLicenseList extends EMsg
  /* 4282 */ val AMGetUserLicenseList: typingsSlinky.steamClient.mod.EMsg.AMGetUserLicenseList with Double = js.native
  
  @js.native
  sealed trait AMGetUserLicenseListResponse extends EMsg
  /* 4283 */ val AMGetUserLicenseListResponse: typingsSlinky.steamClient.mod.EMsg.AMGetUserLicenseListResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetUserMinutesPlayed extends EMsg
  /* 4227 */ val AMGetUserMinutesPlayed: typingsSlinky.steamClient.mod.EMsg.AMGetUserMinutesPlayed with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetUserMinutesPlayedResponse extends EMsg
  /* 4228 */ val AMGetUserMinutesPlayedResponse: typingsSlinky.steamClient.mod.EMsg.AMGetUserMinutesPlayedResponse with Double = js.native
  
  @js.native
  sealed trait AMGetUserNews extends EMsg
  /* 4150 */ val AMGetUserNews: typingsSlinky.steamClient.mod.EMsg.AMGetUserNews with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetUserNewsResponse extends EMsg
  /* 4151 */ val AMGetUserNewsResponse: typingsSlinky.steamClient.mod.EMsg.AMGetUserNewsResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetUserNewsSubscriptions extends EMsg
  /* 4147 */ val AMGetUserNewsSubscriptions: typingsSlinky.steamClient.mod.EMsg.AMGetUserNewsSubscriptions with Double = js.native
  
  @js.native
  sealed trait AMGetUserNewsSubscriptionsResponse extends EMsg
  /* 4148 */ val AMGetUserNewsSubscriptionsResponse: typingsSlinky.steamClient.mod.EMsg.AMGetUserNewsSubscriptionsResponse with Double = js.native
  
  @js.native
  sealed trait AMGetUserStats extends EMsg
  /* 4211 */ val AMGetUserStats: typingsSlinky.steamClient.mod.EMsg.AMGetUserStats with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetUserVacBanList extends EMsg
  /* 4292 */ val AMGetUserVacBanList: typingsSlinky.steamClient.mod.EMsg.AMGetUserVacBanList with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMGetUserVacBanListResponse extends EMsg
  /* 4293 */ val AMGetUserVacBanListResponse: typingsSlinky.steamClient.mod.EMsg.AMGetUserVacBanListResponse with Double = js.native
  
  @js.native
  sealed trait AMGetWalletConversionRate extends EMsg
  /* 4249 */ val AMGetWalletConversionRate: typingsSlinky.steamClient.mod.EMsg.AMGetWalletConversionRate with Double = js.native
  
  @js.native
  sealed trait AMGetWalletConversionRateResponse extends EMsg
  /* 4250 */ val AMGetWalletConversionRateResponse: typingsSlinky.steamClient.mod.EMsg.AMGetWalletConversionRateResponse with Double = js.native
  
  @js.native
  sealed trait AMGetWalletDetails extends EMsg
  /* 4244 */ val AMGetWalletDetails: typingsSlinky.steamClient.mod.EMsg.AMGetWalletDetails with Double = js.native
  
  @js.native
  sealed trait AMGetWalletDetailsResponse extends EMsg
  /* 4245 */ val AMGetWalletDetailsResponse: typingsSlinky.steamClient.mod.EMsg.AMGetWalletDetailsResponse with Double = js.native
  
  @js.native
  sealed trait AMGiftRevoked extends EMsg
  /* 4108 */ val AMGiftRevoked: typingsSlinky.steamClient.mod.EMsg.AMGiftRevoked with Double = js.native
  
  @js.native
  sealed trait AMGrantCoupon extends EMsg
  /* 4356 */ val AMGrantCoupon: typingsSlinky.steamClient.mod.EMsg.AMGrantCoupon with Double = js.native
  
  @js.native
  sealed trait AMGrantCouponResponse extends EMsg
  /* 4357 */ val AMGrantCouponResponse: typingsSlinky.steamClient.mod.EMsg.AMGrantCouponResponse with Double = js.native
  
  @js.native
  sealed trait AMGrantGuestPasses extends EMsg
  /* 566 */ val AMGrantGuestPasses: typingsSlinky.steamClient.mod.EMsg.AMGrantGuestPasses with Double = js.native
  
  @js.native
  sealed trait AMGrantGuestPasses2 extends EMsg
  /* 4361 */ val AMGrantGuestPasses2: typingsSlinky.steamClient.mod.EMsg.AMGrantGuestPasses2 with Double = js.native
  
  @js.native
  sealed trait AMGrantGuestPasses2Response extends EMsg
  /* 4362 */ val AMGrantGuestPasses2Response: typingsSlinky.steamClient.mod.EMsg.AMGrantGuestPasses2Response with Double = js.native
  
  @js.native
  sealed trait AMHandlePendingTransaction extends EMsg
  /* 4328 */ val AMHandlePendingTransaction: typingsSlinky.steamClient.mod.EMsg.AMHandlePendingTransaction with Double = js.native
  
  @js.native
  sealed trait AMHandlePendingTransactionResponse extends EMsg
  /* 4360 */ val AMHandlePendingTransactionResponse: typingsSlinky.steamClient.mod.EMsg.AMHandlePendingTransactionResponse with Double = js.native
  
  @js.native
  sealed trait AMInitPurchase extends EMsg
  /* 512 */ val AMInitPurchase: typingsSlinky.steamClient.mod.EMsg.AMInitPurchase with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMInitPurchaseResponse extends EMsg
  /* 560 */ val AMInitPurchaseResponse: typingsSlinky.steamClient.mod.EMsg.AMInitPurchaseResponse with Double = js.native
  
  @js.native
  sealed trait AMInviteUserToClan extends EMsg
  /* 564 */ val AMInviteUserToClan: typingsSlinky.steamClient.mod.EMsg.AMInviteUserToClan with Double = js.native
  
  @js.native
  sealed trait AMIsAccountInCaptchaGracePeriod extends EMsg
  /* 4308 */ val AMIsAccountInCaptchaGracePeriod: typingsSlinky.steamClient.mod.EMsg.AMIsAccountInCaptchaGracePeriod with Double = js.native
  
  @js.native
  sealed trait AMIsAccountInCaptchaGracePeriodResponse extends EMsg
  /* 4309 */ val AMIsAccountInCaptchaGracePeriodResponse: typingsSlinky.steamClient.mod.EMsg.AMIsAccountInCaptchaGracePeriodResponse with Double = js.native
  
  @js.native
  sealed trait AMIsPackageRestrictedInUserCountry extends EMsg
  /* 4358 */ val AMIsPackageRestrictedInUserCountry: typingsSlinky.steamClient.mod.EMsg.AMIsPackageRestrictedInUserCountry with Double = js.native
  
  @js.native
  sealed trait AMIsPackageRestrictedInUserCountryResponse extends EMsg
  /* 4359 */ val AMIsPackageRestrictedInUserCountryResponse: typingsSlinky.steamClient.mod.EMsg.AMIsPackageRestrictedInUserCountryResponse with Double = js.native
  
  @js.native
  sealed trait AMIsUserBanned extends EMsg
  /* 527 */ val AMIsUserBanned: typingsSlinky.steamClient.mod.EMsg.AMIsUserBanned with Double = js.native
  
  @js.native
  sealed trait AMIsValidAccountID extends EMsg
  /* 4092 */ val AMIsValidAccountID: typingsSlinky.steamClient.mod.EMsg.AMIsValidAccountID with Double = js.native
  
  @js.native
  sealed trait AMJoinPublicClan extends EMsg
  /* 4078 */ val AMJoinPublicClan: typingsSlinky.steamClient.mod.EMsg.AMJoinPublicClan with Double = js.native
  
  @js.native
  sealed trait AMKickUserFromClan extends EMsg
  /* 4060 */ val AMKickUserFromClan: typingsSlinky.steamClient.mod.EMsg.AMKickUserFromClan with Double = js.native
  
  @js.native
  sealed trait AMLeaveClan extends EMsg
  /* 4010 */ val AMLeaveClan: typingsSlinky.steamClient.mod.EMsg.AMLeaveClan with Double = js.native
  
  @js.native
  sealed trait AMLoadActivationCodes extends EMsg
  /* 529 */ val AMLoadActivationCodes: typingsSlinky.steamClient.mod.EMsg.AMLoadActivationCodes with Double = js.native
  
  @js.native
  sealed trait AMLoadActivationCodesResponse extends EMsg
  /* 530 */ val AMLoadActivationCodesResponse: typingsSlinky.steamClient.mod.EMsg.AMLoadActivationCodesResponse with Double = js.native
  
  @js.native
  sealed trait AMLoadOEMTickets extends EMsg
  /* 524 */ val AMLoadOEMTickets: typingsSlinky.steamClient.mod.EMsg.AMLoadOEMTickets with Double = js.native
  
  @js.native
  sealed trait AMLockProfile extends EMsg
  /* 562 */ val AMLockProfile: typingsSlinky.steamClient.mod.EMsg.AMLockProfile with Double = js.native
  
  @js.native
  sealed trait AMLookupKey extends EMsg
  /* 532 */ val AMLookupKey: typingsSlinky.steamClient.mod.EMsg.AMLookupKey with Double = js.native
  
  @js.native
  sealed trait AMLookupKeyResponse extends EMsg
  /* 531 */ val AMLookupKeyResponse: typingsSlinky.steamClient.mod.EMsg.AMLookupKeyResponse with Double = js.native
  
  @js.native
  sealed trait AMMOLPayment extends EMsg
  /* 4391 */ val AMMOLPayment: typingsSlinky.steamClient.mod.EMsg.AMMOLPayment with Double = js.native
  
  @js.native
  sealed trait AMMOLPaymentResponse extends EMsg
  /* 4392 */ val AMMOLPaymentResponse: typingsSlinky.steamClient.mod.EMsg.AMMOLPaymentResponse with Double = js.native
  
  @js.native
  sealed trait AMMarketingTreatmentUpdate extends EMsg
  /* 4257 */ val AMMarketingTreatmentUpdate: typingsSlinky.steamClient.mod.EMsg.AMMarketingTreatmentUpdate with Double = js.native
  
  @js.native
  sealed trait AMMoPayPayment extends EMsg
  /* 4378 */ val AMMoPayPayment: typingsSlinky.steamClient.mod.EMsg.AMMoPayPayment with Double = js.native
  
  @js.native
  sealed trait AMMoPayPaymentResponse extends EMsg
  /* 4379 */ val AMMoPayPaymentResponse: typingsSlinky.steamClient.mod.EMsg.AMMoPayPaymentResponse with Double = js.native
  
  @js.native
  sealed trait AMNameChange extends EMsg
  /* 4300 */ val AMNameChange: typingsSlinky.steamClient.mod.EMsg.AMNameChange with Double = js.native
  
  @js.native
  sealed trait AMNewChallenge extends EMsg
  /* 523 */ val AMNewChallenge: typingsSlinky.steamClient.mod.EMsg.AMNewChallenge with Double = js.native
  
  @js.native
  sealed trait AMNotifyChatOfClanChange extends EMsg
  /* 4079 */ val AMNotifyChatOfClanChange: typingsSlinky.steamClient.mod.EMsg.AMNotifyChatOfClanChange with Double = js.native
  
  @js.native
  sealed trait AMNotifySessionDeviceAuthorized extends EMsg
  /* 6508 */ val AMNotifySessionDeviceAuthorized: typingsSlinky.steamClient.mod.EMsg.AMNotifySessionDeviceAuthorized with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMP2PIntroducerMessage extends EMsg
  /* 596 */ val AMP2PIntroducerMessage: typingsSlinky.steamClient.mod.EMsg.AMP2PIntroducerMessage with Double = js.native
  
  @js.native
  sealed trait AMPasswordHashUpgrade extends EMsg
  /* 4377 */ val AMPasswordHashUpgrade: typingsSlinky.steamClient.mod.EMsg.AMPasswordHashUpgrade with Double = js.native
  
  @js.native
  sealed trait AMPayPalPaymentsHubPayment extends EMsg
  /* 4400 */ val AMPayPalPaymentsHubPayment: typingsSlinky.steamClient.mod.EMsg.AMPayPalPaymentsHubPayment with Double = js.native
  
  @js.native
  sealed trait AMPayPalPaymentsHubPaymentResponse extends EMsg
  /* 4401 */ val AMPayPalPaymentsHubPaymentResponse: typingsSlinky.steamClient.mod.EMsg.AMPayPalPaymentsHubPaymentResponse with Double = js.native
  
  @js.native
  sealed trait AMPayelpPayment extends EMsg
  /* 4387 */ val AMPayelpPayment: typingsSlinky.steamClient.mod.EMsg.AMPayelpPayment with Double = js.native
  
  @js.native
  sealed trait AMPayelpPaymentResponse extends EMsg
  /* 4388 */ val AMPayelpPaymentResponse: typingsSlinky.steamClient.mod.EMsg.AMPayelpPaymentResponse with Double = js.native
  
  @js.native
  sealed trait AMPersonaChangeResponse extends EMsg
  /* 4372 */ val AMPersonaChangeResponse: typingsSlinky.steamClient.mod.EMsg.AMPersonaChangeResponse with Double = js.native
  
  @js.native
  sealed trait AMPlayerGetClanBasicDetails extends EMsg
  /* 4389 */ val AMPlayerGetClanBasicDetails: typingsSlinky.steamClient.mod.EMsg.AMPlayerGetClanBasicDetails with Double = js.native
  
  @js.native
  sealed trait AMPlayerGetClanBasicDetailsResponse extends EMsg
  /* 4390 */ val AMPlayerGetClanBasicDetailsResponse: typingsSlinky.steamClient.mod.EMsg.AMPlayerGetClanBasicDetailsResponse with Double = js.native
  
  @js.native
  sealed trait AMPlayerHostedOnGameServer extends EMsg
  /* 4322 */ val AMPlayerHostedOnGameServer: typingsSlinky.steamClient.mod.EMsg.AMPlayerHostedOnGameServer with Double = js.native
  
  @js.native
  sealed trait AMPlayerNicknameList extends EMsg
  /* 4266 */ val AMPlayerNicknameList: typingsSlinky.steamClient.mod.EMsg.AMPlayerNicknameList with Double = js.native
  
  @js.native
  sealed trait AMPlayerNicknameListResponse extends EMsg
  /* 4267 */ val AMPlayerNicknameListResponse: typingsSlinky.steamClient.mod.EMsg.AMPlayerNicknameListResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMPrimePersonaStateCache extends EMsg
  /* 557 */ val AMPrimePersonaStateCache: typingsSlinky.steamClient.mod.EMsg.AMPrimePersonaStateCache with Double = js.native
  
  @js.native
  sealed trait AMProbeClanMembershipList extends EMsg
  /* 4162 */ val AMProbeClanMembershipList: typingsSlinky.steamClient.mod.EMsg.AMProbeClanMembershipList with Double = js.native
  
  @js.native
  sealed trait AMProbeClanMembershipListResponse extends EMsg
  /* 4163 */ val AMProbeClanMembershipListResponse: typingsSlinky.steamClient.mod.EMsg.AMProbeClanMembershipListResponse with Double = js.native
  
  @js.native
  sealed trait AMPublishChatMemberInfo extends EMsg
  /* 575 */ val AMPublishChatMemberInfo: typingsSlinky.steamClient.mod.EMsg.AMPublishChatMemberInfo with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMPublishChatMetadata extends EMsg
  /* 4004 */ val AMPublishChatMetadata: typingsSlinky.steamClient.mod.EMsg.AMPublishChatMetadata with Double = js.native
  
  @js.native
  sealed trait AMPublishChatRoomInfo extends EMsg
  /* 4025 */ val AMPublishChatRoomInfo: typingsSlinky.steamClient.mod.EMsg.AMPublishChatRoomInfo with Double = js.native
  
  @js.native
  sealed trait AMPurchaseResponse extends EMsg
  /* 513 */ val AMPurchaseResponse: typingsSlinky.steamClient.mod.EMsg.AMPurchaseResponse with Double = js.native
  
  @js.native
  sealed trait AMRecordBanEnforcement extends EMsg
  /* 4325 */ val AMRecordBanEnforcement: typingsSlinky.steamClient.mod.EMsg.AMRecordBanEnforcement with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMRefreshGuestPasses extends EMsg
  /* 563 */ val AMRefreshGuestPasses: typingsSlinky.steamClient.mod.EMsg.AMRefreshGuestPasses with Double = js.native
  
  @js.native
  sealed trait AMRefreshSessions extends EMsg
  /* 2210 */ val AMRefreshSessions: typingsSlinky.steamClient.mod.EMsg.AMRefreshSessions with Double = js.native
  
  @js.native
  sealed trait AMRegisterKey extends EMsg
  /* 528 */ val AMRegisterKey: typingsSlinky.steamClient.mod.EMsg.AMRegisterKey with Double = js.native
  
  @js.native
  sealed trait AMRelayGetFriendsWhoPlayGame extends EMsg
  /* 4253 */ val AMRelayGetFriendsWhoPlayGame: typingsSlinky.steamClient.mod.EMsg.AMRelayGetFriendsWhoPlayGame with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMRelayGetFriendsWhoPlayGameResponse extends EMsg
  /* 4254 */ val AMRelayGetFriendsWhoPlayGameResponse: typingsSlinky.steamClient.mod.EMsg.AMRelayGetFriendsWhoPlayGameResponse with Double = js.native
  
  @js.native
  sealed trait AMRelayPublishStatus extends EMsg
  /* 555 */ val AMRelayPublishStatus: typingsSlinky.steamClient.mod.EMsg.AMRelayPublishStatus with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMRelayToGC extends EMsg
  /* 2201 */ val AMRelayToGC: typingsSlinky.steamClient.mod.EMsg.AMRelayToGC with Double = js.native
  
  @js.native
  sealed trait AMReloadAccount extends EMsg
  /* 568 */ val AMReloadAccount: typingsSlinky.steamClient.mod.EMsg.AMReloadAccount with Double = js.native
  
  @js.native
  sealed trait AMReloadGameGroupPolicy extends EMsg
  /* 4284 */ val AMReloadGameGroupPolicy: typingsSlinky.steamClient.mod.EMsg.AMReloadGameGroupPolicy with Double = js.native
  
  @js.native
  sealed trait AMRemoveFriend extends EMsg
  /* 4083 */ val AMRemoveFriend: typingsSlinky.steamClient.mod.EMsg.AMRemoveFriend with Double = js.native
  
  @js.native
  sealed trait AMRemovePublisherUser extends EMsg
  /* 4281 */ val AMRemovePublisherUser: typingsSlinky.steamClient.mod.EMsg.AMRemovePublisherUser with Double = js.native
  
  @js.native
  sealed trait AMRenewAgreement extends EMsg
  /* 4342 */ val AMRenewAgreement: typingsSlinky.steamClient.mod.EMsg.AMRenewAgreement with Double = js.native
  
  @js.native
  sealed trait AMRenewLicense extends EMsg
  /* 4337 */ val AMRenewLicense: typingsSlinky.steamClient.mod.EMsg.AMRenewLicense with Double = js.native
  
  @js.native
  sealed trait AMRequestAccountData extends EMsg
  /* 582 */ val AMRequestAccountData: typingsSlinky.steamClient.mod.EMsg.AMRequestAccountData with Double = js.native
  
  @js.native
  sealed trait AMRequestAccountDataResponse extends EMsg
  /* 583 */ val AMRequestAccountDataResponse: typingsSlinky.steamClient.mod.EMsg.AMRequestAccountDataResponse with Double = js.native
  
  @js.native
  sealed trait AMRequestChatMetadata extends EMsg
  /* 4058 */ val AMRequestChatMetadata: typingsSlinky.steamClient.mod.EMsg.AMRequestChatMetadata with Double = js.native
  
  // obsolete "renamed to AMRequestClanData"
  @js.native
  sealed trait AMRequestClanData extends EMsg
  /* 4008 */ val AMRequestClanData: typingsSlinky.steamClient.mod.EMsg.AMRequestClanData with Double = js.native
  
  @js.native
  sealed trait AMRequestClanDetails extends EMsg
  /* 4329 */ val AMRequestClanDetails: typingsSlinky.steamClient.mod.EMsg.AMRequestClanDetails with Double = js.native
  
  @js.native
  sealed trait AMRequestFriendData extends EMsg
  /* 4008 */ val AMRequestFriendData: typingsSlinky.steamClient.mod.EMsg.AMRequestFriendData with Double = js.native
  
  @js.native
  sealed trait AMResetCommunityContent extends EMsg
  /* 556 */ val AMResetCommunityContent: typingsSlinky.steamClient.mod.EMsg.AMResetCommunityContent with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMResetUserVerificationGSByIP extends EMsg
  /* 4197 */ val AMResetUserVerificationGSByIP: typingsSlinky.steamClient.mod.EMsg.AMResetUserVerificationGSByIP with Double = js.native
  
  @js.native
  sealed trait AMResolveNegativeWalletCredits extends EMsg
  /* 4385 */ val AMResolveNegativeWalletCredits: typingsSlinky.steamClient.mod.EMsg.AMResolveNegativeWalletCredits with Double = js.native
  
  @js.native
  sealed trait AMResolveNegativeWalletCreditsResponse extends EMsg
  /* 4386 */ val AMResolveNegativeWalletCreditsResponse: typingsSlinky.steamClient.mod.EMsg.AMResolveNegativeWalletCreditsResponse with Double = js.native
  
  @js.native
  sealed trait AMResubmitPurchase extends EMsg
  /* 4080 */ val AMResubmitPurchase: typingsSlinky.steamClient.mod.EMsg.AMResubmitPurchase with Double = js.native
  
  @js.native
  sealed trait AMReverseChargeback extends EMsg
  /* 536 */ val AMReverseChargeback: typingsSlinky.steamClient.mod.EMsg.AMReverseChargeback with Double = js.native
  
  @js.native
  sealed trait AMReverseChargebackResponse extends EMsg
  /* 537 */ val AMReverseChargebackResponse: typingsSlinky.steamClient.mod.EMsg.AMReverseChargebackResponse with Double = js.native
  
  @js.native
  sealed trait AMRevokeLegacyGameKeys extends EMsg
  /* 4242 */ val AMRevokeLegacyGameKeys: typingsSlinky.steamClient.mod.EMsg.AMRevokeLegacyGameKeys with Double = js.native
  
  @js.native
  sealed trait AMRevokePurchaseResponse extends EMsg
  /* 561 */ val AMRevokePurchaseResponse: typingsSlinky.steamClient.mod.EMsg.AMRevokePurchaseResponse with Double = js.native
  
  @js.native
  sealed trait AMRollbackGiftTransfer extends EMsg
  /* 4326 */ val AMRollbackGiftTransfer: typingsSlinky.steamClient.mod.EMsg.AMRollbackGiftTransfer with Double = js.native
  
  @js.native
  sealed trait AMRollbackGiftTransferResponse extends EMsg
  /* 4327 */ val AMRollbackGiftTransferResponse: typingsSlinky.steamClient.mod.EMsg.AMRollbackGiftTransferResponse with Double = js.native
  
  @js.native
  sealed trait AMRouteFriendMsg extends EMsg
  /* 4219 */ val AMRouteFriendMsg: typingsSlinky.steamClient.mod.EMsg.AMRouteFriendMsg with Double = js.native
  
  @js.native
  sealed trait AMRouteToClients extends EMsg
  /* 4009 */ val AMRouteToClients: typingsSlinky.steamClient.mod.EMsg.AMRouteToClients with Double = js.native
  
  @js.native
  sealed trait AMSendAccountInfoUpdate extends EMsg
  /* 4412 */ val AMSendAccountInfoUpdate: typingsSlinky.steamClient.mod.EMsg.AMSendAccountInfoUpdate with Double = js.native
  
  @js.native
  sealed trait AMSendEmail extends EMsg
  /* 4343 */ val AMSendEmail: typingsSlinky.steamClient.mod.EMsg.AMSendEmail with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMSendQueuedEmails extends EMsg
  /* 4152 */ val AMSendQueuedEmails: typingsSlinky.steamClient.mod.EMsg.AMSendQueuedEmails with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMSendSystemIMToUser extends EMsg
  /* 508 */ val AMSendSystemIMToUser: typingsSlinky.steamClient.mod.EMsg.AMSendSystemIMToUser with Double = js.native
  
  @js.native
  sealed trait AMServiceModulesCache extends EMsg
  /* 4126 */ val AMServiceModulesCache: typingsSlinky.steamClient.mod.EMsg.AMServiceModulesCache with Double = js.native
  
  @js.native
  sealed trait AMServiceModulesCall extends EMsg
  /* 4127 */ val AMServiceModulesCall: typingsSlinky.steamClient.mod.EMsg.AMServiceModulesCall with Double = js.native
  
  @js.native
  sealed trait AMServiceModulesCallResponse extends EMsg
  /* 4128 */ val AMServiceModulesCallResponse: typingsSlinky.steamClient.mod.EMsg.AMServiceModulesCallResponse with Double = js.native
  
  @js.native
  sealed trait AMSessionInfoRequest extends EMsg
  /* 4045 */ val AMSessionInfoRequest: typingsSlinky.steamClient.mod.EMsg.AMSessionInfoRequest with Double = js.native
  
  @js.native
  sealed trait AMSessionInfoResponse extends EMsg
  /* 4046 */ val AMSessionInfoResponse: typingsSlinky.steamClient.mod.EMsg.AMSessionInfoResponse with Double = js.native
  
  @js.native
  sealed trait AMSessionQuery extends EMsg
  /* 4363 */ val AMSessionQuery: typingsSlinky.steamClient.mod.EMsg.AMSessionQuery with Double = js.native
  
  @js.native
  sealed trait AMSessionQueryResponse extends EMsg
  /* 4364 */ val AMSessionQueryResponse: typingsSlinky.steamClient.mod.EMsg.AMSessionQueryResponse with Double = js.native
  
  @js.native
  sealed trait AMSetAccountDetails extends EMsg
  /* 4064 */ val AMSetAccountDetails: typingsSlinky.steamClient.mod.EMsg.AMSetAccountDetails with Double = js.native
  
  @js.native
  sealed trait AMSetAccountFlags extends EMsg
  /* 584 */ val AMSetAccountFlags: typingsSlinky.steamClient.mod.EMsg.AMSetAccountFlags with Double = js.native
  
  @js.native
  sealed trait AMSetAccountLinks extends EMsg
  /* 4071 */ val AMSetAccountLinks: typingsSlinky.steamClient.mod.EMsg.AMSetAccountLinks with Double = js.native
  
  @js.native
  sealed trait AMSetAccountLinksResponse extends EMsg
  /* 4072 */ val AMSetAccountLinksResponse: typingsSlinky.steamClient.mod.EMsg.AMSetAccountLinksResponse with Double = js.native
  
  @js.native
  sealed trait AMSetAccountTrustedRequest extends EMsg
  /* 519 */ val AMSetAccountTrustedRequest: typingsSlinky.steamClient.mod.EMsg.AMSetAccountTrustedRequest with Double = js.native
  
  @js.native
  sealed trait AMSetAvatar extends EMsg
  /* 591 */ val AMSetAvatar: typingsSlinky.steamClient.mod.EMsg.AMSetAvatar with Double = js.native
  
  @js.native
  sealed trait AMSetClanDetails extends EMsg
  /* 4068 */ val AMSetClanDetails: typingsSlinky.steamClient.mod.EMsg.AMSetClanDetails with Double = js.native
  
  @js.native
  sealed trait AMSetClanName extends EMsg
  /* 4354 */ val AMSetClanName: typingsSlinky.steamClient.mod.EMsg.AMSetClanName with Double = js.native
  
  @js.native
  sealed trait AMSetClanNameResponse extends EMsg
  /* 4355 */ val AMSetClanNameResponse: typingsSlinky.steamClient.mod.EMsg.AMSetClanNameResponse with Double = js.native
  
  @js.native
  sealed trait AMSetClanPOTW extends EMsg
  /* 4056 */ val AMSetClanPOTW: typingsSlinky.steamClient.mod.EMsg.AMSetClanPOTW with Double = js.native
  
  @js.native
  sealed trait AMSetClanPOTWResponse extends EMsg
  /* 4057 */ val AMSetClanPOTWResponse: typingsSlinky.steamClient.mod.EMsg.AMSetClanPOTWResponse with Double = js.native
  
  @js.native
  sealed trait AMSetClanPermissionBits extends EMsg
  /* 4043 */ val AMSetClanPermissionBits: typingsSlinky.steamClient.mod.EMsg.AMSetClanPermissionBits with Double = js.native
  
  @js.native
  sealed trait AMSetClanPermissionBitsResponse extends EMsg
  /* 4044 */ val AMSetClanPermissionBitsResponse: typingsSlinky.steamClient.mod.EMsg.AMSetClanPermissionBitsResponse with Double = js.native
  
  @js.native
  sealed trait AMSetClanPermissionSettings extends EMsg
  /* 4021 */ val AMSetClanPermissionSettings: typingsSlinky.steamClient.mod.EMsg.AMSetClanPermissionSettings with Double = js.native
  
  @js.native
  sealed trait AMSetClanPermissionSettingsResponse extends EMsg
  /* 4022 */ val AMSetClanPermissionSettingsResponse: typingsSlinky.steamClient.mod.EMsg.AMSetClanPermissionSettingsResponse with Double = js.native
  
  @js.native
  sealed trait AMSetClanRank extends EMsg
  /* 4052 */ val AMSetClanRank: typingsSlinky.steamClient.mod.EMsg.AMSetClanRank with Double = js.native
  
  @js.native
  sealed trait AMSetClanRankResponse extends EMsg
  /* 4053 */ val AMSetClanRankResponse: typingsSlinky.steamClient.mod.EMsg.AMSetClanRankResponse with Double = js.native
  
  @js.native
  sealed trait AMSetCommunityProfileSettings extends EMsg
  /* 4114 */ val AMSetCommunityProfileSettings: typingsSlinky.steamClient.mod.EMsg.AMSetCommunityProfileSettings with Double = js.native
  
  @js.native
  sealed trait AMSetCommunityProfileSettingsResponse extends EMsg
  /* 4115 */ val AMSetCommunityProfileSettingsResponse: typingsSlinky.steamClient.mod.EMsg.AMSetCommunityProfileSettingsResponse with Double = js.native
  
  @js.native
  sealed trait AMSetCommunityState extends EMsg
  /* 4063 */ val AMSetCommunityState: typingsSlinky.steamClient.mod.EMsg.AMSetCommunityState with Double = js.native
  
  @js.native
  sealed trait AMSetDRMTestConfig extends EMsg
  /* 4268 */ val AMSetDRMTestConfig: typingsSlinky.steamClient.mod.EMsg.AMSetDRMTestConfig with Double = js.native
  
  @js.native
  sealed trait AMSetFriendRelationshipNone extends EMsg
  /* 4123 */ val AMSetFriendRelationshipNone: typingsSlinky.steamClient.mod.EMsg.AMSetFriendRelationshipNone with Double = js.native
  
  @js.native
  sealed trait AMSetIgnored extends EMsg
  /* 4096 */ val AMSetIgnored: typingsSlinky.steamClient.mod.EMsg.AMSetIgnored with Double = js.native
  
  @js.native
  sealed trait AMSetIgnoredResponse extends EMsg
  /* 4122 */ val AMSetIgnoredResponse: typingsSlinky.steamClient.mod.EMsg.AMSetIgnoredResponse with Double = js.native
  
  @js.native
  sealed trait AMSetLicenseFlags extends EMsg
  /* 4153 */ val AMSetLicenseFlags: typingsSlinky.steamClient.mod.EMsg.AMSetLicenseFlags with Double = js.native
  
  @js.native
  sealed trait AMSetPersonaName extends EMsg
  /* 590 */ val AMSetPersonaName: typingsSlinky.steamClient.mod.EMsg.AMSetPersonaName with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMSetPreApproval extends EMsg
  /* 4255 */ val AMSetPreApproval: typingsSlinky.steamClient.mod.EMsg.AMSetPreApproval with Double = js.native
  
  @js.native
  sealed trait AMSetPreApprovalResponse extends EMsg
  /* 4256 */ val AMSetPreApprovalResponse: typingsSlinky.steamClient.mod.EMsg.AMSetPreApprovalResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMSetProfileURL extends EMsg
  /* 4005 */ val AMSetProfileURL: typingsSlinky.steamClient.mod.EMsg.AMSetProfileURL with Double = js.native
  
  @js.native
  sealed trait AMSetUserGiftUnowned extends EMsg
  /* 4350 */ val AMSetUserGiftUnowned: typingsSlinky.steamClient.mod.EMsg.AMSetUserGiftUnowned with Double = js.native
  
  @js.native
  sealed trait AMSetUserGiftUnownedResponse extends EMsg
  /* 4351 */ val AMSetUserGiftUnownedResponse: typingsSlinky.steamClient.mod.EMsg.AMSetUserGiftUnownedResponse with Double = js.native
  
  @js.native
  sealed trait AMSetUserNewsSubscriptions extends EMsg
  /* 4149 */ val AMSetUserNewsSubscriptions: typingsSlinky.steamClient.mod.EMsg.AMSetUserNewsSubscriptions with Double = js.native
  
  @js.native
  sealed trait AMSmart2PayPayment extends EMsg
  /* 4404 */ val AMSmart2PayPayment: typingsSlinky.steamClient.mod.EMsg.AMSmart2PayPayment with Double = js.native
  
  @js.native
  sealed trait AMSmart2PayPaymentResponse extends EMsg
  /* 4405 */ val AMSmart2PayPaymentResponse: typingsSlinky.steamClient.mod.EMsg.AMSmart2PayPaymentResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMStoreCancelPurchase extends EMsg
  /* 4181 */ val AMStoreCancelPurchase: typingsSlinky.steamClient.mod.EMsg.AMStoreCancelPurchase with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMStoreCompletePurchase extends EMsg
  /* 4180 */ val AMStoreCompletePurchase: typingsSlinky.steamClient.mod.EMsg.AMStoreCompletePurchase with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMStoreGetFinalPrice extends EMsg
  /* 4178 */ val AMStoreGetFinalPrice: typingsSlinky.steamClient.mod.EMsg.AMStoreGetFinalPrice with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMStoreGetFinalPriceResponse extends EMsg
  /* 4179 */ val AMStoreGetFinalPriceResponse: typingsSlinky.steamClient.mod.EMsg.AMStoreGetFinalPriceResponse with Double = js.native
  
  @js.native
  sealed trait AMStoreInitPurchase extends EMsg
  /* 4176 */ val AMStoreInitPurchase: typingsSlinky.steamClient.mod.EMsg.AMStoreInitPurchase with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMStoreInitPurchaseResponse extends EMsg
  /* 4177 */ val AMStoreInitPurchaseResponse: typingsSlinky.steamClient.mod.EMsg.AMStoreInitPurchaseResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMStorePurchaseResponse extends EMsg
  /* 4182 */ val AMStorePurchaseResponse: typingsSlinky.steamClient.mod.EMsg.AMStorePurchaseResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMStoreUserStats extends EMsg
  /* 4236 */ val AMStoreUserStats: typingsSlinky.steamClient.mod.EMsg.AMStoreUserStats with Double = js.native
  
  @js.native
  sealed trait AMStoreUserStatsResponse extends EMsg
  /* 4312 */ val AMStoreUserStatsResponse: typingsSlinky.steamClient.mod.EMsg.AMStoreUserStatsResponse with Double = js.native
  
  @js.native
  sealed trait AMSubscribeToPersonaFeed extends EMsg
  /* 4291 */ val AMSubscribeToPersonaFeed: typingsSlinky.steamClient.mod.EMsg.AMSubscribeToPersonaFeed with Double = js.native
  
  @js.native
  sealed trait AMSupportChangeEmail extends EMsg
  /* 4195 */ val AMSupportChangeEmail: typingsSlinky.steamClient.mod.EMsg.AMSupportChangeEmail with Double = js.native
  
  @js.native
  sealed trait AMSupportChangePassword extends EMsg
  /* 4194 */ val AMSupportChangePassword: typingsSlinky.steamClient.mod.EMsg.AMSupportChangePassword with Double = js.native
  
  @js.native
  sealed trait AMSupportChangeSecretQA extends EMsg
  /* 4196 */ val AMSupportChangeSecretQA: typingsSlinky.steamClient.mod.EMsg.AMSupportChangeSecretQA with Double = js.native
  
  @js.native
  sealed trait AMSupportEnableOrDisable extends EMsg
  /* 4199 */ val AMSupportEnableOrDisable: typingsSlinky.steamClient.mod.EMsg.AMSupportEnableOrDisable with Double = js.native
  
  @js.native
  sealed trait AMSupportIsAccountEnabled extends EMsg
  /* 4209 */ val AMSupportIsAccountEnabled: typingsSlinky.steamClient.mod.EMsg.AMSupportIsAccountEnabled with Double = js.native
  
  @js.native
  sealed trait AMSupportIsAccountEnabledResponse extends EMsg
  /* 4210 */ val AMSupportIsAccountEnabledResponse: typingsSlinky.steamClient.mod.EMsg.AMSupportIsAccountEnabledResponse with Double = js.native
  
  @js.native
  sealed trait AMSupportKickSession extends EMsg
  /* 4212 */ val AMSupportKickSession: typingsSlinky.steamClient.mod.EMsg.AMSupportKickSession with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMSupportRemoveAccountSecurity extends EMsg
  /* 4307 */ val AMSupportRemoveAccountSecurity: typingsSlinky.steamClient.mod.EMsg.AMSupportRemoveAccountSecurity with Double = js.native
  
  @js.native
  sealed trait AMSwapKioskDeposit extends EMsg
  /* 4348 */ val AMSwapKioskDeposit: typingsSlinky.steamClient.mod.EMsg.AMSwapKioskDeposit with Double = js.native
  
  @js.native
  sealed trait AMSwapKioskDepositResponse extends EMsg
  /* 4349 */ val AMSwapKioskDepositResponse: typingsSlinky.steamClient.mod.EMsg.AMSwapKioskDepositResponse with Double = js.native
  
  @js.native
  sealed trait AMTicketAuthRequestOrResponse extends EMsg
  /* 4220 */ val AMTicketAuthRequestOrResponse: typingsSlinky.steamClient.mod.EMsg.AMTicketAuthRequestOrResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMToMDSGetDepotDecryptionKey extends EMsg
  /* 5812 */ val AMToMDSGetDepotDecryptionKey: typingsSlinky.steamClient.mod.EMsg.AMToMDSGetDepotDecryptionKey with Double = js.native
  
  @js.native
  sealed trait AMTrackFailedAuthByIP extends EMsg
  /* 4133 */ val AMTrackFailedAuthByIP: typingsSlinky.steamClient.mod.EMsg.AMTrackFailedAuthByIP with Double = js.native
  
  @js.native
  sealed trait AMTransferLockedGifts extends EMsg
  /* 4320 */ val AMTransferLockedGifts: typingsSlinky.steamClient.mod.EMsg.AMTransferLockedGifts with Double = js.native
  
  @js.native
  sealed trait AMTransferLockedGiftsResponse extends EMsg
  /* 4321 */ val AMTransferLockedGiftsResponse: typingsSlinky.steamClient.mod.EMsg.AMTransferLockedGiftsResponse with Double = js.native
  
  @js.native
  sealed trait AMTwoFactorRecoverAuthenticatorRequest extends EMsg
  /* 4402 */ val AMTwoFactorRecoverAuthenticatorRequest: typingsSlinky.steamClient.mod.EMsg.AMTwoFactorRecoverAuthenticatorRequest with Double = js.native
  
  @js.native
  sealed trait AMTwoFactorRecoverAuthenticatorResponse extends EMsg
  /* 4403 */ val AMTwoFactorRecoverAuthenticatorResponse: typingsSlinky.steamClient.mod.EMsg.AMTwoFactorRecoverAuthenticatorResponse with Double = js.native
  
  @js.native
  sealed trait AMUnBanFromChat extends EMsg
  /* 4067 */ val AMUnBanFromChat: typingsSlinky.steamClient.mod.EMsg.AMUnBanFromChat with Double = js.native
  
  @js.native
  sealed trait AMUpdateBillingAddress extends EMsg
  /* 4186 */ val AMUpdateBillingAddress: typingsSlinky.steamClient.mod.EMsg.AMUpdateBillingAddress with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMUpdateBillingAddressResponse extends EMsg
  /* 4187 */ val AMUpdateBillingAddressResponse: typingsSlinky.steamClient.mod.EMsg.AMUpdateBillingAddressResponse with Double = js.native
  
  @js.native
  sealed trait AMUpdateChatMetadata extends EMsg
  /* 4003 */ val AMUpdateChatMetadata: typingsSlinky.steamClient.mod.EMsg.AMUpdateChatMetadata with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMUpdateClanAnnouncement extends EMsg
  /* 4029 */ val AMUpdateClanAnnouncement: typingsSlinky.steamClient.mod.EMsg.AMUpdateClanAnnouncement with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMUpdateClanAnnouncementResponse extends EMsg
  /* 4030 */ val AMUpdateClanAnnouncementResponse: typingsSlinky.steamClient.mod.EMsg.AMUpdateClanAnnouncementResponse with Double = js.native
  
  @js.native
  sealed trait AMUpdateClanEvent extends EMsg
  /* 4015 */ val AMUpdateClanEvent: typingsSlinky.steamClient.mod.EMsg.AMUpdateClanEvent with Double = js.native
  
  @js.native
  sealed trait AMUpdateClanEventResponse extends EMsg
  /* 4016 */ val AMUpdateClanEventResponse: typingsSlinky.steamClient.mod.EMsg.AMUpdateClanEventResponse with Double = js.native
  
  @js.native
  sealed trait AMUpdateGSPlayStats extends EMsg
  /* 4198 */ val AMUpdateGSPlayStats: typingsSlinky.steamClient.mod.EMsg.AMUpdateGSPlayStats with Double = js.native
  
  @js.native
  sealed trait AMUpdatePersonaStateCache extends EMsg
  /* 4275 */ val AMUpdatePersonaStateCache: typingsSlinky.steamClient.mod.EMsg.AMUpdatePersonaStateCache with Double = js.native
  
  @js.native
  sealed trait AMUpdateProviderStatus extends EMsg
  /* 4305 */ val AMUpdateProviderStatus: typingsSlinky.steamClient.mod.EMsg.AMUpdateProviderStatus with Double = js.native
  
  @js.native
  sealed trait AMUpdateUserBanRequest extends EMsg
  /* 504 */ val AMUpdateUserBanRequest: typingsSlinky.steamClient.mod.EMsg.AMUpdateUserBanRequest with Double = js.native
  
  @js.native
  sealed trait AMUserClanList extends EMsg
  /* 4110 */ val AMUserClanList: typingsSlinky.steamClient.mod.EMsg.AMUserClanList with Double = js.native
  
  @js.native
  sealed trait AMUserClanListResponse extends EMsg
  /* 4111 */ val AMUserClanListResponse: typingsSlinky.steamClient.mod.EMsg.AMUserClanListResponse with Double = js.native
  
  @js.native
  sealed trait AMVACStatusUpdate extends EMsg
  /* 4286 */ val AMVACStatusUpdate: typingsSlinky.steamClient.mod.EMsg.AMVACStatusUpdate with Double = js.native
  
  @js.native
  sealed trait AMValidateCaptchaDataForIP extends EMsg
  /* 4131 */ val AMValidateCaptchaDataForIP: typingsSlinky.steamClient.mod.EMsg.AMValidateCaptchaDataForIP with Double = js.native
  
  @js.native
  sealed trait AMValidateCaptchaDataForIPResponse extends EMsg
  /* 4132 */ val AMValidateCaptchaDataForIPResponse: typingsSlinky.steamClient.mod.EMsg.AMValidateCaptchaDataForIPResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMValidateEmailLink extends EMsg
  /* 4231 */ val AMValidateEmailLink: typingsSlinky.steamClient.mod.EMsg.AMValidateEmailLink with Double = js.native
  
  @js.native
  sealed trait AMValidateEmailLinkResponse extends EMsg
  /* 4232 */ val AMValidateEmailLinkResponse: typingsSlinky.steamClient.mod.EMsg.AMValidateEmailLinkResponse with Double = js.native
  
  @js.native
  sealed trait AMValidatePasswordResetCodeAndSendSmsRequest extends EMsg
  /* 4406 */ val AMValidatePasswordResetCodeAndSendSmsRequest: typingsSlinky.steamClient.mod.EMsg.AMValidatePasswordResetCodeAndSendSmsRequest with Double = js.native
  
  @js.native
  sealed trait AMValidatePasswordResetCodeAndSendSmsResponse extends EMsg
  /* 4407 */ val AMValidatePasswordResetCodeAndSendSmsResponse: typingsSlinky.steamClient.mod.EMsg.AMValidatePasswordResetCodeAndSendSmsResponse with Double = js.native
  
  @js.native
  sealed trait AMValidateWGToken extends EMsg
  /* 4047 */ val AMValidateWGToken: typingsSlinky.steamClient.mod.EMsg.AMValidateWGToken with Double = js.native
  
  @js.native
  sealed trait AMValidateWGTokenResponse extends EMsg
  /* 4062 */ val AMValidateWGTokenResponse: typingsSlinky.steamClient.mod.EMsg.AMValidateWGTokenResponse with Double = js.native
  
  @js.native
  sealed trait AMVerfiyUser extends EMsg
  /* 552 */ val AMVerfiyUser: typingsSlinky.steamClient.mod.EMsg.AMVerfiyUser with Double = js.native
  
  @js.native
  sealed trait AMVerifyDepotManagementRights extends EMsg
  /* 4222 */ val AMVerifyDepotManagementRights: typingsSlinky.steamClient.mod.EMsg.AMVerifyDepotManagementRights with Double = js.native
  
  @js.native
  sealed trait AMVerifyDepotManagementRightsResponse extends EMsg
  /* 4223 */ val AMVerifyDepotManagementRightsResponse: typingsSlinky.steamClient.mod.EMsg.AMVerifyDepotManagementRightsResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMWipeFriendsList extends EMsg
  /* 4095 */ val AMWipeFriendsList: typingsSlinky.steamClient.mod.EMsg.AMWipeFriendsList with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMWriteNews extends EMsg
  /* 4142 */ val AMWriteNews: typingsSlinky.steamClient.mod.EMsg.AMWriteNews with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AMXsollaPayment extends EMsg
  /* 4344 */ val AMXsollaPayment: typingsSlinky.steamClient.mod.EMsg.AMXsollaPayment with Double = js.native
  
  @js.native
  sealed trait AMXsollaPaymentResponse extends EMsg
  /* 4345 */ val AMXsollaPaymentResponse: typingsSlinky.steamClient.mod.EMsg.AMXsollaPaymentResponse with Double = js.native
  
  @js.native
  sealed trait ATSCSPerfTestResponse extends EMsg
  /* 1519 */ val ATSCSPerfTestResponse: typingsSlinky.steamClient.mod.EMsg.ATSCSPerfTestResponse with Double = js.native
  
  @js.native
  sealed trait ATSCSPerfTestTask extends EMsg
  /* 1518 */ val ATSCSPerfTestTask: typingsSlinky.steamClient.mod.EMsg.ATSCSPerfTestTask with Double = js.native
  
  @js.native
  sealed trait ATSCallTest extends EMsg
  /* 1508 */ val ATSCallTest: typingsSlinky.steamClient.mod.EMsg.ATSCallTest with Double = js.native
  
  @js.native
  sealed trait ATSCallTestReply extends EMsg
  /* 1509 */ val ATSCallTestReply: typingsSlinky.steamClient.mod.EMsg.ATSCallTestReply with Double = js.native
  
  @js.native
  sealed trait ATSCycleTCM extends EMsg
  /* 1506 */ val ATSCycleTCM: typingsSlinky.steamClient.mod.EMsg.ATSCycleTCM with Double = js.native
  
  @js.native
  sealed trait ATSExternalStressActionResult extends EMsg
  /* 1516 */ val ATSExternalStressActionResult: typingsSlinky.steamClient.mod.EMsg.ATSExternalStressActionResult with Double = js.native
  
  @js.native
  sealed trait ATSExternalStressJobQueued extends EMsg
  /* 1512 */ val ATSExternalStressJobQueued: typingsSlinky.steamClient.mod.EMsg.ATSExternalStressJobQueued with Double = js.native
  
  @js.native
  sealed trait ATSExternalStressJobRunning extends EMsg
  /* 1513 */ val ATSExternalStressJobRunning: typingsSlinky.steamClient.mod.EMsg.ATSExternalStressJobRunning with Double = js.native
  
  @js.native
  sealed trait ATSExternalStressJobStart extends EMsg
  /* 1511 */ val ATSExternalStressJobStart: typingsSlinky.steamClient.mod.EMsg.ATSExternalStressJobStart with Double = js.native
  
  @js.native
  sealed trait ATSExternalStressJobStopAll extends EMsg
  /* 1515 */ val ATSExternalStressJobStopAll: typingsSlinky.steamClient.mod.EMsg.ATSExternalStressJobStopAll with Double = js.native
  
  @js.native
  sealed trait ATSExternalStressJobStopped extends EMsg
  /* 1514 */ val ATSExternalStressJobStopped: typingsSlinky.steamClient.mod.EMsg.ATSExternalStressJobStopped with Double = js.native
  
  @js.native
  sealed trait ATSInitDRMSStressTest extends EMsg
  /* 1507 */ val ATSInitDRMSStressTest: typingsSlinky.steamClient.mod.EMsg.ATSInitDRMSStressTest with Double = js.native
  
  @js.native
  sealed trait ATSRunFailServerTest extends EMsg
  /* 1503 */ val ATSRunFailServerTest: typingsSlinky.steamClient.mod.EMsg.ATSRunFailServerTest with Double = js.native
  
  @js.native
  sealed trait ATSStartExternalStress extends EMsg
  /* 1510 */ val ATSStartExternalStress: typingsSlinky.steamClient.mod.EMsg.ATSStartExternalStress with Double = js.native
  
  @js.native
  sealed trait ATSStartStressTest extends EMsg
  /* 1501 */ val ATSStartStressTest: typingsSlinky.steamClient.mod.EMsg.ATSStartStressTest with Double = js.native
  
  @js.native
  sealed trait ATSStarted extends EMsg
  /* 1517 */ val ATSStarted: typingsSlinky.steamClient.mod.EMsg.ATSStarted with Double = js.native
  
  @js.native
  sealed trait ATSStopStressTest extends EMsg
  /* 1502 */ val ATSStopStressTest: typingsSlinky.steamClient.mod.EMsg.ATSStopStressTest with Double = js.native
  
  @js.native
  sealed trait ATSUFSPerfTestResponse extends EMsg
  /* 1505 */ val ATSUFSPerfTestResponse: typingsSlinky.steamClient.mod.EMsg.ATSUFSPerfTestResponse with Double = js.native
  
  @js.native
  sealed trait ATSUFSPerfTestTask extends EMsg
  /* 1504 */ val ATSUFSPerfTestTask: typingsSlinky.steamClient.mod.EMsg.ATSUFSPerfTestTask with Double = js.native
  
  @js.native
  sealed trait AdminCmd extends EMsg
  /* 1000 */ val AdminCmd: typingsSlinky.steamClient.mod.EMsg.AdminCmd with Double = js.native
  
  @js.native
  sealed trait AdminCmdResponse extends EMsg
  /* 1004 */ val AdminCmdResponse: typingsSlinky.steamClient.mod.EMsg.AdminCmdResponse with Double = js.native
  
  @js.native
  sealed trait AdminConsoleTitle extends EMsg
  /* 1020 */ val AdminConsoleTitle: typingsSlinky.steamClient.mod.EMsg.AdminConsoleTitle with Double = js.native
  
  @js.native
  sealed trait AdminGCCommand extends EMsg
  /* 1024 */ val AdminGCCommand: typingsSlinky.steamClient.mod.EMsg.AdminGCCommand with Double = js.native
  
  @js.native
  sealed trait AdminGCGetCommandList extends EMsg
  /* 1025 */ val AdminGCGetCommandList: typingsSlinky.steamClient.mod.EMsg.AdminGCGetCommandList with Double = js.native
  
  @js.native
  sealed trait AdminGCGetCommandListResponse extends EMsg
  /* 1026 */ val AdminGCGetCommandListResponse: typingsSlinky.steamClient.mod.EMsg.AdminGCGetCommandListResponse with Double = js.native
  
  @js.native
  sealed trait AdminGCSpew extends EMsg
  /* 1023 */ val AdminGCSpew: typingsSlinky.steamClient.mod.EMsg.AdminGCSpew with Double = js.native
  
  @js.native
  sealed trait AdminLogEvent extends EMsg
  /* 1006 */ val AdminLogEvent: typingsSlinky.steamClient.mod.EMsg.AdminLogEvent with Double = js.native
  
  @js.native
  sealed trait AdminLogListenRequest extends EMsg
  /* 1005 */ val AdminLogListenRequest: typingsSlinky.steamClient.mod.EMsg.AdminLogListenRequest with Double = js.native
  
  @js.native
  sealed trait AdminMsgSpew extends EMsg
  /* 1028 */ val AdminMsgSpew: typingsSlinky.steamClient.mod.EMsg.AdminMsgSpew with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AdminPwLogon extends EMsg
  /* 1017 */ val AdminPwLogon: typingsSlinky.steamClient.mod.EMsg.AdminPwLogon with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AdminPwLogonResponse extends EMsg
  /* 1018 */ val AdminPwLogonResponse: typingsSlinky.steamClient.mod.EMsg.AdminPwLogonResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait AdminSpew extends EMsg
  /* 1019 */ val AdminSpew: typingsSlinky.steamClient.mod.EMsg.AdminSpew with Double = js.native
  
  @js.native
  sealed trait Alert extends EMsg
  /* 115 */ val Alert: typingsSlinky.steamClient.mod.EMsg.Alert with Double = js.native
  
  @js.native
  sealed trait AllowUserToPlayQuery extends EMsg
  /* 550 */ val AllowUserToPlayQuery: typingsSlinky.steamClient.mod.EMsg.AllowUserToPlayQuery with Double = js.native
  
  @js.native
  sealed trait AllowUserToPlayResponse extends EMsg
  /* 551 */ val AllowUserToPlayResponse: typingsSlinky.steamClient.mod.EMsg.AllowUserToPlayResponse with Double = js.native
  
  @js.native
  sealed trait AssignSysID extends EMsg
  /* 200 */ val AssignSysID: typingsSlinky.steamClient.mod.EMsg.AssignSysID with Double = js.native
  
  @js.native
  sealed trait BRPCheckActivationCodes extends EMsg
  /* 3619 */ val BRPCheckActivationCodes: typingsSlinky.steamClient.mod.EMsg.BRPCheckActivationCodes with Double = js.native
  
  @js.native
  sealed trait BRPCheckActivationCodesResponse extends EMsg
  /* 3620 */ val BRPCheckActivationCodesResponse: typingsSlinky.steamClient.mod.EMsg.BRPCheckActivationCodesResponse with Double = js.native
  
  @js.native
  sealed trait BRPCheckFinanceCloseOutDate extends EMsg
  /* 3610 */ val BRPCheckFinanceCloseOutDate: typingsSlinky.steamClient.mod.EMsg.BRPCheckFinanceCloseOutDate with Double = js.native
  
  @js.native
  sealed trait BRPCheckSettlementReports extends EMsg
  /* 3626 */ val BRPCheckSettlementReports: typingsSlinky.steamClient.mod.EMsg.BRPCheckSettlementReports with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BRPCommitGC extends EMsg
  /* 3607 */ val BRPCommitGC: typingsSlinky.steamClient.mod.EMsg.BRPCommitGC with Double = js.native
  
  @js.native
  sealed trait BRPCommitGCResponse extends EMsg
  /* 3608 */ val BRPCommitGCResponse: typingsSlinky.steamClient.mod.EMsg.BRPCommitGCResponse with Double = js.native
  
  @js.native
  sealed trait BRPCommitWP extends EMsg
  /* 3621 */ val BRPCommitWP: typingsSlinky.steamClient.mod.EMsg.BRPCommitWP with Double = js.native
  
  @js.native
  sealed trait BRPCommitWPResponse extends EMsg
  /* 3622 */ val BRPCommitWPResponse: typingsSlinky.steamClient.mod.EMsg.BRPCommitWPResponse with Double = js.native
  
  @js.native
  sealed trait BRPConvertToCurrentKeys extends EMsg
  /* 3615 */ val BRPConvertToCurrentKeys: typingsSlinky.steamClient.mod.EMsg.BRPConvertToCurrentKeys with Double = js.native
  
  @js.native
  sealed trait BRPConvertToCurrentKeysResponse extends EMsg
  /* 3616 */ val BRPConvertToCurrentKeysResponse: typingsSlinky.steamClient.mod.EMsg.BRPConvertToCurrentKeysResponse with Double = js.native
  
  @js.native
  sealed trait BRPFindHungTransactions extends EMsg
  /* 3609 */ val BRPFindHungTransactions: typingsSlinky.steamClient.mod.EMsg.BRPFindHungTransactions with Double = js.native
  
  @js.native
  sealed trait BRPPostTaxToAvalara extends EMsg
  /* 3628 */ val BRPPostTaxToAvalara: typingsSlinky.steamClient.mod.EMsg.BRPPostTaxToAvalara with Double = js.native
  
  @js.native
  sealed trait BRPPostTransactionTax extends EMsg
  /* 3629 */ val BRPPostTransactionTax: typingsSlinky.steamClient.mod.EMsg.BRPPostTransactionTax with Double = js.native
  
  @js.native
  sealed trait BRPPostTransactionTaxResponse extends EMsg
  /* 3630 */ val BRPPostTransactionTaxResponse: typingsSlinky.steamClient.mod.EMsg.BRPPostTransactionTaxResponse with Double = js.native
  
  @js.native
  sealed trait BRPProcessGCReports extends EMsg
  /* 3603 */ val BRPProcessGCReports: typingsSlinky.steamClient.mod.EMsg.BRPProcessGCReports with Double = js.native
  
  @js.native
  sealed trait BRPProcessIMReports extends EMsg
  /* 3631 */ val BRPProcessIMReports: typingsSlinky.steamClient.mod.EMsg.BRPProcessIMReports with Double = js.native
  
  @js.native
  sealed trait BRPProcessLicenses extends EMsg
  /* 3611 */ val BRPProcessLicenses: typingsSlinky.steamClient.mod.EMsg.BRPProcessLicenses with Double = js.native
  
  @js.native
  sealed trait BRPProcessLicensesResponse extends EMsg
  /* 3612 */ val BRPProcessLicensesResponse: typingsSlinky.steamClient.mod.EMsg.BRPProcessLicensesResponse with Double = js.native
  
  @js.native
  sealed trait BRPProcessPPReports extends EMsg
  /* 3604 */ val BRPProcessPPReports: typingsSlinky.steamClient.mod.EMsg.BRPProcessPPReports with Double = js.native
  
  @js.native
  sealed trait BRPProcessPartnerPayments extends EMsg
  /* 3625 */ val BRPProcessPartnerPayments: typingsSlinky.steamClient.mod.EMsg.BRPProcessPartnerPayments with Double = js.native
  
  @js.native
  sealed trait BRPProcessPaymentRules extends EMsg
  /* 3624 */ val BRPProcessPaymentRules: typingsSlinky.steamClient.mod.EMsg.BRPProcessPaymentRules with Double = js.native
  
  @js.native
  sealed trait BRPProcessUSBankReports extends EMsg
  /* 3602 */ val BRPProcessUSBankReports: typingsSlinky.steamClient.mod.EMsg.BRPProcessUSBankReports with Double = js.native
  
  @js.native
  sealed trait BRPProcessWPReports extends EMsg
  /* 3623 */ val BRPProcessWPReports: typingsSlinky.steamClient.mod.EMsg.BRPProcessWPReports with Double = js.native
  
  @js.native
  sealed trait BRPPruneCardUsageStats extends EMsg
  /* 3617 */ val BRPPruneCardUsageStats: typingsSlinky.steamClient.mod.EMsg.BRPPruneCardUsageStats with Double = js.native
  
  @js.native
  sealed trait BRPPruneCardUsageStatsResponse extends EMsg
  /* 3618 */ val BRPPruneCardUsageStatsResponse: typingsSlinky.steamClient.mod.EMsg.BRPPruneCardUsageStatsResponse with Double = js.native
  
  @js.native
  sealed trait BRPRemoveExpiredPaymentData extends EMsg
  /* 3613 */ val BRPRemoveExpiredPaymentData: typingsSlinky.steamClient.mod.EMsg.BRPRemoveExpiredPaymentData with Double = js.native
  
  @js.native
  sealed trait BRPRemoveExpiredPaymentDataResponse extends EMsg
  /* 3614 */ val BRPRemoveExpiredPaymentDataResponse: typingsSlinky.steamClient.mod.EMsg.BRPRemoveExpiredPaymentDataResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BRPSettleCB extends EMsg
  /* 3606 */ val BRPSettleCB: typingsSlinky.steamClient.mod.EMsg.BRPSettleCB with Double = js.native
  
  @js.native
  sealed trait BRPSettleNOVA extends EMsg
  /* 3605 */ val BRPSettleNOVA: typingsSlinky.steamClient.mod.EMsg.BRPSettleNOVA with Double = js.native
  
  @js.native
  sealed trait BRPStartShippingJobs extends EMsg
  /* 3601 */ val BRPStartShippingJobs: typingsSlinky.steamClient.mod.EMsg.BRPStartShippingJobs with Double = js.native
  
  @js.native
  sealed trait BSBannedRequest extends EMsg
  /* 1407 */ val BSBannedRequest: typingsSlinky.steamClient.mod.EMsg.BSBannedRequest with Double = js.native
  
  @js.native
  sealed trait BSBoaCompraConfirmProductDelivery extends EMsg
  /* 1494 */ val BSBoaCompraConfirmProductDelivery: typingsSlinky.steamClient.mod.EMsg.BSBoaCompraConfirmProductDelivery with Double = js.native
  
  @js.native
  sealed trait BSBoaCompraConfirmProductDeliveryResponse extends EMsg
  /* 1495 */ val BSBoaCompraConfirmProductDeliveryResponse: typingsSlinky.steamClient.mod.EMsg.BSBoaCompraConfirmProductDeliveryResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSChaseRFRRequest extends EMsg
  /* 1416 */ val BSChaseRFRRequest: typingsSlinky.steamClient.mod.EMsg.BSChaseRFRRequest with Double = js.native
  
  @js.native
  sealed trait BSCheckJobRunning extends EMsg
  /* 1456 */ val BSCheckJobRunning: typingsSlinky.steamClient.mod.EMsg.BSCheckJobRunning with Double = js.native
  
  @js.native
  sealed trait BSCheckJobRunningResponse extends EMsg
  /* 1457 */ val BSCheckJobRunningResponse: typingsSlinky.steamClient.mod.EMsg.BSCheckJobRunningResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSCommitGCTxn extends EMsg
  /* 1425 */ val BSCommitGCTxn: typingsSlinky.steamClient.mod.EMsg.BSCommitGCTxn with Double = js.native
  
  @js.native
  sealed trait BSCommitWPTxn extends EMsg
  /* 1498 */ val BSCommitWPTxn: typingsSlinky.steamClient.mod.EMsg.BSCommitWPTxn with Double = js.native
  
  @js.native
  sealed trait BSCompletePurchase extends EMsg
  /* 1474 */ val BSCompletePurchase: typingsSlinky.steamClient.mod.EMsg.BSCompletePurchase with Double = js.native
  
  @js.native
  sealed trait BSCompletePurchaseResponse extends EMsg
  /* 1475 */ val BSCompletePurchaseResponse: typingsSlinky.steamClient.mod.EMsg.BSCompletePurchaseResponse with Double = js.native
  
  @js.native
  sealed trait BSConvertToCurrentKeys extends EMsg
  /* 1470 */ val BSConvertToCurrentKeys: typingsSlinky.steamClient.mod.EMsg.BSConvertToCurrentKeys with Double = js.native
  
  @js.native
  sealed trait BSConvertToCurrentKeysResponse extends EMsg
  /* 1471 */ val BSConvertToCurrentKeysResponse: typingsSlinky.steamClient.mod.EMsg.BSConvertToCurrentKeysResponse with Double = js.native
  
  @js.native
  sealed trait BSGenerateBoaCompraMD5 extends EMsg
  /* 1496 */ val BSGenerateBoaCompraMD5: typingsSlinky.steamClient.mod.EMsg.BSGenerateBoaCompraMD5 with Double = js.native
  
  @js.native
  sealed trait BSGenerateBoaCompraMD5Response extends EMsg
  /* 1497 */ val BSGenerateBoaCompraMD5Response: typingsSlinky.steamClient.mod.EMsg.BSGenerateBoaCompraMD5Response with Double = js.native
  
  @js.native
  sealed trait BSGenerateMoPayMD5 extends EMsg
  /* 1492 */ val BSGenerateMoPayMD5: typingsSlinky.steamClient.mod.EMsg.BSGenerateMoPayMD5 with Double = js.native
  
  @js.native
  sealed trait BSGenerateMoPayMD5Response extends EMsg
  /* 1493 */ val BSGenerateMoPayMD5Response: typingsSlinky.steamClient.mod.EMsg.BSGenerateMoPayMD5Response with Double = js.native
  
  @js.native
  sealed trait BSGetBillingAddress extends EMsg
  /* 1462 */ val BSGetBillingAddress: typingsSlinky.steamClient.mod.EMsg.BSGetBillingAddress with Double = js.native
  
  @js.native
  sealed trait BSGetBillingAddressResponse extends EMsg
  /* 1463 */ val BSGetBillingAddressResponse: typingsSlinky.steamClient.mod.EMsg.BSGetBillingAddressResponse with Double = js.native
  
  @js.native
  sealed trait BSGetCreditCardInfo extends EMsg
  /* 1464 */ val BSGetCreditCardInfo: typingsSlinky.steamClient.mod.EMsg.BSGetCreditCardInfo with Double = js.native
  
  @js.native
  sealed trait BSGetCreditCardInfoResponse extends EMsg
  /* 1465 */ val BSGetCreditCardInfoResponse: typingsSlinky.steamClient.mod.EMsg.BSGetCreditCardInfoResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSGetEvents extends EMsg
  /* 1415 */ val BSGetEvents: typingsSlinky.steamClient.mod.EMsg.BSGetEvents with Double = js.native
  
  @js.native
  sealed trait BSGetPayPalUserInfo extends EMsg
  /* 1410 */ val BSGetPayPalUserInfo: typingsSlinky.steamClient.mod.EMsg.BSGetPayPalUserInfo with Double = js.native
  
  @js.native
  sealed trait BSGetPayPalUserInfoResponse extends EMsg
  /* 1411 */ val BSGetPayPalUserInfoResponse: typingsSlinky.steamClient.mod.EMsg.BSGetPayPalUserInfoResponse with Double = js.native
  
  @js.native
  sealed trait BSGetProPackOrderStatus extends EMsg
  /* 1454 */ val BSGetProPackOrderStatus: typingsSlinky.steamClient.mod.EMsg.BSGetProPackOrderStatus with Double = js.native
  
  @js.native
  sealed trait BSGetProPackOrderStatusResponse extends EMsg
  /* 1455 */ val BSGetProPackOrderStatusResponse: typingsSlinky.steamClient.mod.EMsg.BSGetProPackOrderStatusResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSInitGCBankXferTxn extends EMsg
  /* 1421 */ val BSInitGCBankXferTxn: typingsSlinky.steamClient.mod.EMsg.BSInitGCBankXferTxn with Double = js.native
  
  @js.native
  sealed trait BSInitGCBankXferTxnResponse extends EMsg
  /* 1422 */ val BSInitGCBankXferTxnResponse: typingsSlinky.steamClient.mod.EMsg.BSInitGCBankXferTxnResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSInitPayPalTxn extends EMsg
  /* 1408 */ val BSInitPayPalTxn: typingsSlinky.steamClient.mod.EMsg.BSInitPayPalTxn with Double = js.native
  
  @js.native
  sealed trait BSInitPayPalTxnResponse extends EMsg
  /* 1409 */ val BSInitPayPalTxnResponse: typingsSlinky.steamClient.mod.EMsg.BSInitPayPalTxnResponse with Double = js.native
  
  @js.native
  sealed trait BSInitPurchase extends EMsg
  /* 1472 */ val BSInitPurchase: typingsSlinky.steamClient.mod.EMsg.BSInitPurchase with Double = js.native
  
  @js.native
  sealed trait BSInitPurchaseResponse extends EMsg
  /* 1473 */ val BSInitPurchaseResponse: typingsSlinky.steamClient.mod.EMsg.BSInitPurchaseResponse with Double = js.native
  
  @js.native
  sealed trait BSMoPayConfirmProductDelivery extends EMsg
  /* 1490 */ val BSMoPayConfirmProductDelivery: typingsSlinky.steamClient.mod.EMsg.BSMoPayConfirmProductDelivery with Double = js.native
  
  @js.native
  sealed trait BSMoPayConfirmProductDeliveryResponse extends EMsg
  /* 1491 */ val BSMoPayConfirmProductDeliveryResponse: typingsSlinky.steamClient.mod.EMsg.BSMoPayConfirmProductDeliveryResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSPaymentInstrBan extends EMsg
  /* 1417 */ val BSPaymentInstrBan: typingsSlinky.steamClient.mod.EMsg.BSPaymentInstrBan with Double = js.native
  
  @js.native
  sealed trait BSPaymentInstrBanResponse extends EMsg
  /* 1418 */ val BSPaymentInstrBanResponse: typingsSlinky.steamClient.mod.EMsg.BSPaymentInstrBanResponse with Double = js.native
  
  @js.native
  sealed trait BSProcessGCReports extends EMsg
  /* 1419 */ val BSProcessGCReports: typingsSlinky.steamClient.mod.EMsg.BSProcessGCReports with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSProcessPPReports extends EMsg
  /* 1420 */ val BSProcessPPReports: typingsSlinky.steamClient.mod.EMsg.BSProcessPPReports with Double = js.native
  
  @js.native
  sealed trait BSProcessUSBankReports extends EMsg
  /* 1436 */ val BSProcessUSBankReports: typingsSlinky.steamClient.mod.EMsg.BSProcessUSBankReports with Double = js.native
  
  @js.native
  sealed trait BSPruneCardUsageStats extends EMsg
  /* 1476 */ val BSPruneCardUsageStats: typingsSlinky.steamClient.mod.EMsg.BSPruneCardUsageStats with Double = js.native
  
  @js.native
  sealed trait BSPruneCardUsageStatsResponse extends EMsg
  /* 1477 */ val BSPruneCardUsageStatsResponse: typingsSlinky.steamClient.mod.EMsg.BSPruneCardUsageStatsResponse with Double = js.native
  
  @js.native
  sealed trait BSPurchaseResponse extends EMsg
  /* 1402 */ val BSPurchaseResponse: typingsSlinky.steamClient.mod.EMsg.BSPurchaseResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSPurchaseRunFraudChecks extends EMsg
  /* 1437 */ val BSPurchaseRunFraudChecks: typingsSlinky.steamClient.mod.EMsg.BSPurchaseRunFraudChecks with Double = js.native
  
  @js.native
  sealed trait BSPurchaseRunFraudChecksResponse extends EMsg
  /* 1438 */ val BSPurchaseRunFraudChecksResponse: typingsSlinky.steamClient.mod.EMsg.BSPurchaseRunFraudChecksResponse with Double = js.native
  
  @js.native
  sealed trait BSPurchaseStart extends EMsg
  /* 1401 */ val BSPurchaseStart: typingsSlinky.steamClient.mod.EMsg.BSPurchaseStart with Double = js.native
  
  @js.native
  sealed trait BSQiwiWalletInvoice extends EMsg
  /* 1448 */ val BSQiwiWalletInvoice: typingsSlinky.steamClient.mod.EMsg.BSQiwiWalletInvoice with Double = js.native
  
  @js.native
  sealed trait BSQiwiWalletInvoiceResponse extends EMsg
  /* 1449 */ val BSQiwiWalletInvoiceResponse: typingsSlinky.steamClient.mod.EMsg.BSQiwiWalletInvoiceResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSQueryBankInformation extends EMsg
  /* 1440 */ val BSQueryBankInformation: typingsSlinky.steamClient.mod.EMsg.BSQueryBankInformation with Double = js.native
  
  @js.native
  sealed trait BSQueryBankInformationResponse extends EMsg
  /* 1441 */ val BSQueryBankInformationResponse: typingsSlinky.steamClient.mod.EMsg.BSQueryBankInformationResponse with Double = js.native
  
  @js.native
  sealed trait BSQueryCBOrderStatus extends EMsg
  /* 1428 */ val BSQueryCBOrderStatus: typingsSlinky.steamClient.mod.EMsg.BSQueryCBOrderStatus with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSQueryCBOrderStatusResponse extends EMsg
  /* 1429 */ val BSQueryCBOrderStatusResponse: typingsSlinky.steamClient.mod.EMsg.BSQueryCBOrderStatusResponse with Double = js.native
  
  @js.native
  sealed trait BSQueryFindCreditCard extends EMsg
  /* 1484 */ val BSQueryFindCreditCard: typingsSlinky.steamClient.mod.EMsg.BSQueryFindCreditCard with Double = js.native
  
  @js.native
  sealed trait BSQueryFindCreditCardResponse extends EMsg
  /* 1485 */ val BSQueryFindCreditCardResponse: typingsSlinky.steamClient.mod.EMsg.BSQueryFindCreditCardResponse with Double = js.native
  
  @js.native
  sealed trait BSQueryGCBankXferTxn extends EMsg
  /* 1423 */ val BSQueryGCBankXferTxn: typingsSlinky.steamClient.mod.EMsg.BSQueryGCBankXferTxn with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSQueryGCBankXferTxnResponse extends EMsg
  /* 1424 */ val BSQueryGCBankXferTxnResponse: typingsSlinky.steamClient.mod.EMsg.BSQueryGCBankXferTxnResponse with Double = js.native
  
  @js.native
  sealed trait BSQueryPaymentInstResponse extends EMsg
  /* 1432 */ val BSQueryPaymentInstResponse: typingsSlinky.steamClient.mod.EMsg.BSQueryPaymentInstResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSQueryPaymentInstUsage extends EMsg
  /* 1431 */ val BSQueryPaymentInstUsage: typingsSlinky.steamClient.mod.EMsg.BSQueryPaymentInstUsage with Double = js.native
  
  @js.native
  sealed trait BSQueryTransactionStatus extends EMsg
  /* 1426 */ val BSQueryTransactionStatus: typingsSlinky.steamClient.mod.EMsg.BSQueryTransactionStatus with Double = js.native
  
  @js.native
  sealed trait BSQueryTransactionStatusResponse extends EMsg
  /* 1427 */ val BSQueryTransactionStatusResponse: typingsSlinky.steamClient.mod.EMsg.BSQueryTransactionStatusResponse with Double = js.native
  
  @js.native
  sealed trait BSQueryTxnExtendedInfo extends EMsg
  /* 1433 */ val BSQueryTxnExtendedInfo: typingsSlinky.steamClient.mod.EMsg.BSQueryTxnExtendedInfo with Double = js.native
  
  @js.native
  sealed trait BSQueryTxnExtendedInfoResponse extends EMsg
  /* 1434 */ val BSQueryTxnExtendedInfoResponse: typingsSlinky.steamClient.mod.EMsg.BSQueryTxnExtendedInfoResponse with Double = js.native
  
  @js.native
  sealed trait BSRefundTxn extends EMsg
  /* 1413 */ val BSRefundTxn: typingsSlinky.steamClient.mod.EMsg.BSRefundTxn with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSRefundTxnResponse extends EMsg
  /* 1414 */ val BSRefundTxnResponse: typingsSlinky.steamClient.mod.EMsg.BSRefundTxnResponse with Double = js.native
  
  @js.native
  sealed trait BSRemoveExpiredPaymentData extends EMsg
  /* 1468 */ val BSRemoveExpiredPaymentData: typingsSlinky.steamClient.mod.EMsg.BSRemoveExpiredPaymentData with Double = js.native
  
  @js.native
  sealed trait BSRemoveExpiredPaymentDataResponse extends EMsg
  /* 1469 */ val BSRemoveExpiredPaymentDataResponse: typingsSlinky.steamClient.mod.EMsg.BSRemoveExpiredPaymentDataResponse with Double = js.native
  
  @js.native
  sealed trait BSResetPackagePurchaseRateLimit extends EMsg
  /* 1458 */ val BSResetPackagePurchaseRateLimit: typingsSlinky.steamClient.mod.EMsg.BSResetPackagePurchaseRateLimit with Double = js.native
  
  @js.native
  sealed trait BSResetPackagePurchaseRateLimitResponse extends EMsg
  /* 1459 */ val BSResetPackagePurchaseRateLimitResponse: typingsSlinky.steamClient.mod.EMsg.BSResetPackagePurchaseRateLimitResponse with Double = js.native
  
  @js.native
  sealed trait BSReverseRedeemPOSAKey extends EMsg
  /* 1482 */ val BSReverseRedeemPOSAKey: typingsSlinky.steamClient.mod.EMsg.BSReverseRedeemPOSAKey with Double = js.native
  
  @js.native
  sealed trait BSReverseRedeemPOSAKeyResponse extends EMsg
  /* 1483 */ val BSReverseRedeemPOSAKeyResponse: typingsSlinky.steamClient.mod.EMsg.BSReverseRedeemPOSAKeyResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSRunRedFlagReport extends EMsg
  /* 1430 */ val BSRunRedFlagReport: typingsSlinky.steamClient.mod.EMsg.BSRunRedFlagReport with Double = js.native
  
  @js.native
  sealed trait BSSendShippingRequest extends EMsg
  /* 1452 */ val BSSendShippingRequest: typingsSlinky.steamClient.mod.EMsg.BSSendShippingRequest with Double = js.native
  
  @js.native
  sealed trait BSSendShippingRequestResponse extends EMsg
  /* 1453 */ val BSSendShippingRequestResponse: typingsSlinky.steamClient.mod.EMsg.BSSendShippingRequestResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSSettleComplete extends EMsg
  /* 1406 */ val BSSettleComplete: typingsSlinky.steamClient.mod.EMsg.BSSettleComplete with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BSSettleNOVA extends EMsg
  /* 1404 */ val BSSettleNOVA: typingsSlinky.steamClient.mod.EMsg.BSSettleNOVA with Double = js.native
  
  @js.native
  sealed trait BSStartShippingJobs extends EMsg
  /* 1439 */ val BSStartShippingJobs: typingsSlinky.steamClient.mod.EMsg.BSStartShippingJobs with Double = js.native
  
  @js.native
  sealed trait BSStatusInquiryPOSAKey extends EMsg
  /* 1486 */ val BSStatusInquiryPOSAKey: typingsSlinky.steamClient.mod.EMsg.BSStatusInquiryPOSAKey with Double = js.native
  
  @js.native
  sealed trait BSStatusInquiryPOSAKeyResponse extends EMsg
  /* 1487 */ val BSStatusInquiryPOSAKeyResponse: typingsSlinky.steamClient.mod.EMsg.BSStatusInquiryPOSAKeyResponse with Double = js.native
  
  @js.native
  sealed trait BSStoreBankInformation extends EMsg
  /* 1478 */ val BSStoreBankInformation: typingsSlinky.steamClient.mod.EMsg.BSStoreBankInformation with Double = js.native
  
  @js.native
  sealed trait BSStoreBankInformationResponse extends EMsg
  /* 1479 */ val BSStoreBankInformationResponse: typingsSlinky.steamClient.mod.EMsg.BSStoreBankInformationResponse with Double = js.native
  
  @js.native
  sealed trait BSUpdateConversionRates extends EMsg
  /* 1435 */ val BSUpdateConversionRates: typingsSlinky.steamClient.mod.EMsg.BSUpdateConversionRates with Double = js.native
  
  @js.native
  sealed trait BSUpdateInventoryFromProPack extends EMsg
  /* 1450 */ val BSUpdateInventoryFromProPack: typingsSlinky.steamClient.mod.EMsg.BSUpdateInventoryFromProPack with Double = js.native
  
  @js.native
  sealed trait BSUpdateInventoryFromProPackResponse extends EMsg
  /* 1451 */ val BSUpdateInventoryFromProPackResponse: typingsSlinky.steamClient.mod.EMsg.BSUpdateInventoryFromProPackResponse with Double = js.native
  
  @js.native
  sealed trait BSUpdatePaymentData extends EMsg
  /* 1460 */ val BSUpdatePaymentData: typingsSlinky.steamClient.mod.EMsg.BSUpdatePaymentData with Double = js.native
  
  @js.native
  sealed trait BSUpdatePaymentDataResponse extends EMsg
  /* 1461 */ val BSUpdatePaymentDataResponse: typingsSlinky.steamClient.mod.EMsg.BSUpdatePaymentDataResponse with Double = js.native
  
  @js.native
  sealed trait BSValidateMoPaySignature extends EMsg
  /* 1488 */ val BSValidateMoPaySignature: typingsSlinky.steamClient.mod.EMsg.BSValidateMoPaySignature with Double = js.native
  
  @js.native
  sealed trait BSValidateMoPaySignatureResponse extends EMsg
  /* 1489 */ val BSValidateMoPaySignatureResponse: typingsSlinky.steamClient.mod.EMsg.BSValidateMoPaySignatureResponse with Double = js.native
  
  @js.native
  sealed trait BSValidateXsollaSignature extends EMsg
  /* 1445 */ val BSValidateXsollaSignature: typingsSlinky.steamClient.mod.EMsg.BSValidateXsollaSignature with Double = js.native
  
  @js.native
  sealed trait BSValidateXsollaSignatureResponse extends EMsg
  /* 1446 */ val BSValidateXsollaSignatureResponse: typingsSlinky.steamClient.mod.EMsg.BSValidateXsollaSignatureResponse with Double = js.native
  
  @js.native
  sealed trait BSVerifyPOSAKey extends EMsg
  /* 1480 */ val BSVerifyPOSAKey: typingsSlinky.steamClient.mod.EMsg.BSVerifyPOSAKey with Double = js.native
  
  @js.native
  sealed trait BSVerifyPOSAKeyResponse extends EMsg
  /* 1481 */ val BSVerifyPOSAKeyResponse: typingsSlinky.steamClient.mod.EMsg.BSVerifyPOSAKeyResponse with Double = js.native
  
  @js.native
  sealed trait BackpackAddToCurrency extends EMsg
  /* 8401 */ val BackpackAddToCurrency: typingsSlinky.steamClient.mod.EMsg.BackpackAddToCurrency with Double = js.native
  
  @js.native
  sealed trait BackpackAddToCurrencyResponse extends EMsg
  /* 8402 */ val BackpackAddToCurrencyResponse: typingsSlinky.steamClient.mod.EMsg.BackpackAddToCurrencyResponse with Double = js.native
  
  @js.native
  sealed trait BackpackBase extends EMsg
  /* 8400 */ val BackpackBase: typingsSlinky.steamClient.mod.EMsg.BackpackBase with Double = js.native
  
  @js.native
  sealed trait BadLoginIPList extends EMsg
  /* 7805 */ val BadLoginIPList: typingsSlinky.steamClient.mod.EMsg.BadLoginIPList with Double = js.native
  
  @js.native
  sealed trait BaseAIS extends EMsg
  /* 400 */ val BaseAIS: typingsSlinky.steamClient.mod.EMsg.BaseAIS with Double = js.native
  
  @js.native
  sealed trait BaseAM extends EMsg
  /* 500 */ val BaseAM: typingsSlinky.steamClient.mod.EMsg.BaseAM with Double = js.native
  
  @js.native
  sealed trait BaseAMRange2 extends EMsg
  /* 4000 */ val BaseAMRange2: typingsSlinky.steamClient.mod.EMsg.BaseAMRange2 with Double = js.native
  
  @js.native
  sealed trait BaseATS extends EMsg
  /* 1500 */ val BaseATS: typingsSlinky.steamClient.mod.EMsg.BaseATS with Double = js.native
  
  @js.native
  sealed trait BaseAdmin extends EMsg
  /* 1000 */ val BaseAdmin: typingsSlinky.steamClient.mod.EMsg.BaseAdmin with Double = js.native
  
  @js.native
  sealed trait BaseBRP extends EMsg
  /* 3600 */ val BaseBRP: typingsSlinky.steamClient.mod.EMsg.BaseBRP with Double = js.native
  
  @js.native
  sealed trait BaseBS extends EMsg
  /* 1400 */ val BaseBS: typingsSlinky.steamClient.mod.EMsg.BaseBS with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BaseCCSRange extends EMsg
  /* 3150 */ val BaseCCSRange: typingsSlinky.steamClient.mod.EMsg.BaseCCSRange with Double = js.native
  
  @js.native
  sealed trait BaseCM extends EMsg
  /* 1700 */ val BaseCM: typingsSlinky.steamClient.mod.EMsg.BaseCM with Double = js.native
  
  @js.native
  sealed trait BaseCS extends EMsg
  /* 650 */ val BaseCS: typingsSlinky.steamClient.mod.EMsg.BaseCS with Double = js.native
  
  @js.native
  sealed trait BaseChannelAuth extends EMsg
  /* 1300 */ val BaseChannelAuth: typingsSlinky.steamClient.mod.EMsg.BaseChannelAuth with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BaseClient extends EMsg
  /* 700 */ val BaseClient: typingsSlinky.steamClient.mod.EMsg.BaseClient with Double = js.native
  
  @js.native
  sealed trait BaseClient2 extends EMsg
  /* 5400 */ val BaseClient2: typingsSlinky.steamClient.mod.EMsg.BaseClient2 with Double = js.native
  
  @js.native
  sealed trait BaseClient3 extends EMsg
  /* 9800 */ val BaseClient3: typingsSlinky.steamClient.mod.EMsg.BaseClient3 with Double = js.native
  
  @js.native
  sealed trait BaseDFS extends EMsg
  /* 5600 */ val BaseDFS: typingsSlinky.steamClient.mod.EMsg.BaseDFS with Double = js.native
  
  @js.native
  sealed trait BaseDP extends EMsg
  /* 1600 */ val BaseDP: typingsSlinky.steamClient.mod.EMsg.BaseDP with Double = js.native
  
  @js.native
  sealed trait BaseDRMS extends EMsg
  /* 625 */ val BaseDRMS: typingsSlinky.steamClient.mod.EMsg.BaseDRMS with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BaseDSS extends EMsg
  /* 1800 */ val BaseDSS: typingsSlinky.steamClient.mod.EMsg.BaseDSS with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BaseEPM extends EMsg
  /* 1900 */ val BaseEPM: typingsSlinky.steamClient.mod.EMsg.BaseEPM with Double = js.native
  
  @js.native
  sealed trait BaseFBS extends EMsg
  /* 1100 */ val BaseFBS: typingsSlinky.steamClient.mod.EMsg.BaseFBS with Double = js.native
  
  @js.native
  sealed trait BaseFTSRange extends EMsg
  /* 3100 */ val BaseFTSRange: typingsSlinky.steamClient.mod.EMsg.BaseFTSRange with Double = js.native
  
  @js.native
  sealed trait BaseFileXfer extends EMsg
  /* 1200 */ val BaseFileXfer: typingsSlinky.steamClient.mod.EMsg.BaseFileXfer with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BaseGC extends EMsg
  /* 2200 */ val BaseGC: typingsSlinky.steamClient.mod.EMsg.BaseGC with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BaseGM extends EMsg
  /* 300 */ val BaseGM: typingsSlinky.steamClient.mod.EMsg.BaseGM with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BaseGameServer extends EMsg
  /* 900 */ val BaseGameServer: typingsSlinky.steamClient.mod.EMsg.BaseGameServer with Double = js.native
  
  @js.native
  sealed trait BaseGeneral extends EMsg
  /* 100 */ val BaseGeneral: typingsSlinky.steamClient.mod.EMsg.BaseGeneral with Double = js.native
  
  @js.native
  sealed trait BaseLBSRange extends EMsg
  /* 3200 */ val BaseLBSRange: typingsSlinky.steamClient.mod.EMsg.BaseLBSRange with Double = js.native
  
  @js.native
  sealed trait BaseMDS extends EMsg
  /* 5800 */ val BaseMDS: typingsSlinky.steamClient.mod.EMsg.BaseMDS with Double = js.native
  
  @js.native
  sealed trait BaseOGS extends EMsg
  /* 3400 */ val BaseOGS: typingsSlinky.steamClient.mod.EMsg.BaseOGS with Double = js.native
  
  @js.native
  sealed trait BaseP2P extends EMsg
  /* 2500 */ val BaseP2P: typingsSlinky.steamClient.mod.EMsg.BaseP2P with Double = js.native
  
  @js.native
  sealed trait BasePSRange extends EMsg
  /* 5000 */ val BasePSRange: typingsSlinky.steamClient.mod.EMsg.BasePSRange with Double = js.native
  
  @js.native
  sealed trait BaseSM extends EMsg
  /* 2900 */ val BaseSM: typingsSlinky.steamClient.mod.EMsg.BaseSM with Double = js.native
  
  @js.native
  sealed trait BaseShell extends EMsg
  /* 200 */ val BaseShell: typingsSlinky.steamClient.mod.EMsg.BaseShell with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BaseTest extends EMsg
  /* 3000 */ val BaseTest: typingsSlinky.steamClient.mod.EMsg.BaseTest with Double = js.native
  
  @js.native
  sealed trait BaseUFSRange extends EMsg
  /* 5200 */ val BaseUFSRange: typingsSlinky.steamClient.mod.EMsg.BaseUFSRange with Double = js.native
  
  @js.native
  sealed trait BaseVS extends EMsg
  /* 600 */ val BaseVS: typingsSlinky.steamClient.mod.EMsg.BaseVS with Double = js.native
  
  // obsolete
  @js.native
  sealed trait BoxMonitorBase extends EMsg
  /* 8700 */ val BoxMonitorBase: typingsSlinky.steamClient.mod.EMsg.BoxMonitorBase with Double = js.native
  
  @js.native
  sealed trait BoxMonitorReportRequest extends EMsg
  /* 8700 */ val BoxMonitorReportRequest: typingsSlinky.steamClient.mod.EMsg.BoxMonitorReportRequest with Double = js.native
  
  @js.native
  sealed trait BoxMonitorReportResponse extends EMsg
  /* 8701 */ val BoxMonitorReportResponse: typingsSlinky.steamClient.mod.EMsg.BoxMonitorReportResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait CCSAddComment extends EMsg
  /* 3153 */ val CCSAddComment: typingsSlinky.steamClient.mod.EMsg.CCSAddComment with Double = js.native
  
  // obsolete
  @js.native
  sealed trait CCSAddCommentResponse extends EMsg
  /* 3154 */ val CCSAddCommentResponse: typingsSlinky.steamClient.mod.EMsg.CCSAddCommentResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait CCSDeleteAllCommentsByAuthor extends EMsg
  /* 3161 */ val CCSDeleteAllCommentsByAuthor: typingsSlinky.steamClient.mod.EMsg.CCSDeleteAllCommentsByAuthor with Double = js.native
  
  @js.native
  sealed trait CCSDeleteAllCommentsByAuthorResponse extends EMsg
  /* 3162 */ val CCSDeleteAllCommentsByAuthorResponse: typingsSlinky.steamClient.mod.EMsg.CCSDeleteAllCommentsByAuthorResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait CCSDeleteComment extends EMsg
  /* 3155 */ val CCSDeleteComment: typingsSlinky.steamClient.mod.EMsg.CCSDeleteComment with Double = js.native
  
  // obsolete
  @js.native
  sealed trait CCSDeleteCommentResponse extends EMsg
  /* 3156 */ val CCSDeleteCommentResponse: typingsSlinky.steamClient.mod.EMsg.CCSDeleteCommentResponse with Double = js.native
  
  @js.native
  sealed trait CCSGetComments extends EMsg
  /* 3151 */ val CCSGetComments: typingsSlinky.steamClient.mod.EMsg.CCSGetComments with Double = js.native
  
  // obsolete
  @js.native
  sealed trait CCSGetCommentsForNews extends EMsg
  /* 3159 */ val CCSGetCommentsForNews: typingsSlinky.steamClient.mod.EMsg.CCSGetCommentsForNews with Double = js.native
  
  // obsolete
  @js.native
  sealed trait CCSGetCommentsForNewsResponse extends EMsg
  /* 3160 */ val CCSGetCommentsForNewsResponse: typingsSlinky.steamClient.mod.EMsg.CCSGetCommentsForNewsResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait CCSGetCommentsResponse extends EMsg
  /* 3152 */ val CCSGetCommentsResponse: typingsSlinky.steamClient.mod.EMsg.CCSGetCommentsResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait CCSNotifyCommentCount extends EMsg
  /* 3158 */ val CCSNotifyCommentCount: typingsSlinky.steamClient.mod.EMsg.CCSNotifyCommentCount with Double = js.native
  
  // obsolete
  @js.native
  sealed trait CCSPreloadComments extends EMsg
  /* 3157 */ val CCSPreloadComments: typingsSlinky.steamClient.mod.EMsg.CCSPreloadComments with Double = js.native
  
  @js.native
  sealed trait CEGPropStatusDRMSRequest extends EMsg
  /* 7602 */ val CEGPropStatusDRMSRequest: typingsSlinky.steamClient.mod.EMsg.CEGPropStatusDRMSRequest with Double = js.native
  
  @js.native
  sealed trait CEGPropStatusDRMSResponse extends EMsg
  /* 7603 */ val CEGPropStatusDRMSResponse: typingsSlinky.steamClient.mod.EMsg.CEGPropStatusDRMSResponse with Double = js.native
  
  @js.native
  sealed trait CEGVersionSetEnableDisableRequest extends EMsg
  /* 7600 */ val CEGVersionSetEnableDisableRequest: typingsSlinky.steamClient.mod.EMsg.CEGVersionSetEnableDisableRequest with Double = js.native
  
  @js.native
  sealed trait CEGVersionSetEnableDisableResponse extends EMsg
  /* 7601 */ val CEGVersionSetEnableDisableResponse: typingsSlinky.steamClient.mod.EMsg.CEGVersionSetEnableDisableResponse with Double = js.native
  
  @js.native
  sealed trait CEGWhackFailureReportRequest extends EMsg
  /* 7604 */ val CEGWhackFailureReportRequest: typingsSlinky.steamClient.mod.EMsg.CEGWhackFailureReportRequest with Double = js.native
  
  @js.native
  sealed trait CEGWhackFailureReportResponse extends EMsg
  /* 7605 */ val CEGWhackFailureReportResponse: typingsSlinky.steamClient.mod.EMsg.CEGWhackFailureReportResponse with Double = js.native
  
  @js.native
  sealed trait CMAppInfoResponseDeprecated extends EMsg
  /* 1703 */ val CMAppInfoResponseDeprecated: typingsSlinky.steamClient.mod.EMsg.CMAppInfoResponseDeprecated with Double = js.native
  
  @js.native
  sealed trait CMSetAllowState extends EMsg
  /* 1701 */ val CMSetAllowState: typingsSlinky.steamClient.mod.EMsg.CMSetAllowState with Double = js.native
  
  @js.native
  sealed trait CMSpewAllowState extends EMsg
  /* 1702 */ val CMSpewAllowState: typingsSlinky.steamClient.mod.EMsg.CMSpewAllowState with Double = js.native
  
  @js.native
  sealed trait CREBase extends EMsg
  /* 8500 */ val CREBase: typingsSlinky.steamClient.mod.EMsg.CREBase with Double = js.native
  
  @js.native
  sealed trait CREEnumeratePublishedFiles extends EMsg
  /* 8511 */ val CREEnumeratePublishedFiles: typingsSlinky.steamClient.mod.EMsg.CREEnumeratePublishedFiles with Double = js.native
  
  @js.native
  sealed trait CREEnumeratePublishedFilesResponse extends EMsg
  /* 8512 */ val CREEnumeratePublishedFilesResponse: typingsSlinky.steamClient.mod.EMsg.CREEnumeratePublishedFilesResponse with Double = js.native
  
  @js.native
  sealed trait CREGetUserPublishedItemVoteDetails extends EMsg
  /* 8509 */ val CREGetUserPublishedItemVoteDetails: typingsSlinky.steamClient.mod.EMsg.CREGetUserPublishedItemVoteDetails with Double = js.native
  
  @js.native
  sealed trait CREGetUserPublishedItemVoteDetailsResponse extends EMsg
  /* 8510 */ val CREGetUserPublishedItemVoteDetailsResponse: typingsSlinky.steamClient.mod.EMsg.CREGetUserPublishedItemVoteDetailsResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait CREItemVoteSummary extends EMsg
  /* 8503 */ val CREItemVoteSummary: typingsSlinky.steamClient.mod.EMsg.CREItemVoteSummary with Double = js.native
  
  @js.native
  sealed trait CREItemVoteSummaryResponse extends EMsg
  /* 8504 */ val CREItemVoteSummaryResponse: typingsSlinky.steamClient.mod.EMsg.CREItemVoteSummaryResponse with Double = js.native
  
  @js.native
  sealed trait CREPublishedFileVoteAdded extends EMsg
  /* 8513 */ val CREPublishedFileVoteAdded: typingsSlinky.steamClient.mod.EMsg.CREPublishedFileVoteAdded with Double = js.native
  
  @js.native
  sealed trait CRERankByTrend extends EMsg
  /* 8501 */ val CRERankByTrend: typingsSlinky.steamClient.mod.EMsg.CRERankByTrend with Double = js.native
  
  // obsolete
  @js.native
  sealed trait CRERankByTrendResponse extends EMsg
  /* 8502 */ val CRERankByTrendResponse: typingsSlinky.steamClient.mod.EMsg.CRERankByTrendResponse with Double = js.native
  
  @js.native
  sealed trait CRERankByVote extends EMsg
  /* 8505 */ val CRERankByVote: typingsSlinky.steamClient.mod.EMsg.CRERankByVote with Double = js.native
  
  // obsolete
  @js.native
  sealed trait CRERankByVoteResponse extends EMsg
  /* 8506 */ val CRERankByVoteResponse: typingsSlinky.steamClient.mod.EMsg.CRERankByVoteResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait CREUpdateUserPublishedItemVote extends EMsg
  /* 8507 */ val CREUpdateUserPublishedItemVote: typingsSlinky.steamClient.mod.EMsg.CREUpdateUserPublishedItemVote with Double = js.native
  
  @js.native
  sealed trait CREUpdateUserPublishedItemVoteResponse extends EMsg
  /* 8508 */ val CREUpdateUserPublishedItemVoteResponse: typingsSlinky.steamClient.mod.EMsg.CREUpdateUserPublishedItemVoteResponse with Double = js.native
  
  @js.native
  sealed trait CSBase extends EMsg
  /* 6200 */ val CSBase: typingsSlinky.steamClient.mod.EMsg.CSBase with Double = js.native
  
  @js.native
  sealed trait CSPing extends EMsg
  /* 6201 */ val CSPing: typingsSlinky.steamClient.mod.EMsg.CSPing with Double = js.native
  
  @js.native
  sealed trait CSPingResponse extends EMsg
  /* 6202 */ val CSPingResponse: typingsSlinky.steamClient.mod.EMsg.CSPingResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait CSUserContentApprove extends EMsg
  /* 787 */ val CSUserContentApprove: typingsSlinky.steamClient.mod.EMsg.CSUserContentApprove with Double = js.native
  
  // obsolete
  @js.native
  sealed trait CSUserContentDeny extends EMsg
  /* 788 */ val CSUserContentDeny: typingsSlinky.steamClient.mod.EMsg.CSUserContentDeny with Double = js.native
  
  @js.native
  sealed trait CSUserContentRequest extends EMsg
  /* 652 */ val CSUserContentRequest: typingsSlinky.steamClient.mod.EMsg.CSUserContentRequest with Double = js.native
  
  @js.native
  sealed trait ChannelAuthChallenge extends EMsg
  /* 1300 */ val ChannelAuthChallenge: typingsSlinky.steamClient.mod.EMsg.ChannelAuthChallenge with Double = js.native
  
  @js.native
  sealed trait ChannelAuthResponse extends EMsg
  /* 1301 */ val ChannelAuthResponse: typingsSlinky.steamClient.mod.EMsg.ChannelAuthResponse with Double = js.native
  
  @js.native
  sealed trait ChannelAuthResult extends EMsg
  /* 1302 */ val ChannelAuthResult: typingsSlinky.steamClient.mod.EMsg.ChannelAuthResult with Double = js.native
  
  @js.native
  sealed trait ChannelEncryptRequest extends EMsg
  /* 1303 */ val ChannelEncryptRequest: typingsSlinky.steamClient.mod.EMsg.ChannelEncryptRequest with Double = js.native
  
  @js.native
  sealed trait ChannelEncryptResponse extends EMsg
  /* 1304 */ val ChannelEncryptResponse: typingsSlinky.steamClient.mod.EMsg.ChannelEncryptResponse with Double = js.native
  
  @js.native
  sealed trait ChannelEncryptResult extends EMsg
  /* 1305 */ val ChannelEncryptResult: typingsSlinky.steamClient.mod.EMsg.ChannelEncryptResult with Double = js.native
  
  @js.native
  sealed trait ClientAMGetClanOfficers extends EMsg
  /* 5531 */ val ClientAMGetClanOfficers: typingsSlinky.steamClient.mod.EMsg.ClientAMGetClanOfficers with Double = js.native
  
  @js.native
  sealed trait ClientAMGetClanOfficersResponse extends EMsg
  /* 5532 */ val ClientAMGetClanOfficersResponse: typingsSlinky.steamClient.mod.EMsg.ClientAMGetClanOfficersResponse with Double = js.native
  
  @js.native
  sealed trait ClientAMGetPersonaNameHistory extends EMsg
  /* 5570 */ val ClientAMGetPersonaNameHistory: typingsSlinky.steamClient.mod.EMsg.ClientAMGetPersonaNameHistory with Double = js.native
  
  @js.native
  sealed trait ClientAMGetPersonaNameHistoryResponse extends EMsg
  /* 5571 */ val ClientAMGetPersonaNameHistoryResponse: typingsSlinky.steamClient.mod.EMsg.ClientAMGetPersonaNameHistoryResponse with Double = js.native
  
  @js.native
  sealed trait ClientAccountInfo extends EMsg
  /* 768 */ val ClientAccountInfo: typingsSlinky.steamClient.mod.EMsg.ClientAccountInfo with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientAckGuestPass extends EMsg
  /* 740 */ val ClientAckGuestPass: typingsSlinky.steamClient.mod.EMsg.ClientAckGuestPass with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientAckGuestPassResponse extends EMsg
  /* 796 */ val ClientAckGuestPassResponse: typingsSlinky.steamClient.mod.EMsg.ClientAckGuestPassResponse with Double = js.native
  
  @js.native
  sealed trait ClientAckMessageByGID extends EMsg
  /* 735 */ val ClientAckMessageByGID: typingsSlinky.steamClient.mod.EMsg.ClientAckMessageByGID with Double = js.native
  
  @js.native
  sealed trait ClientAckPurchaseReceipt extends EMsg
  /* 737 */ val ClientAckPurchaseReceipt: typingsSlinky.steamClient.mod.EMsg.ClientAckPurchaseReceipt with Double = js.native
  
  @js.native
  sealed trait ClientAckVACBan extends EMsg
  /* 709 */ val ClientAckVACBan: typingsSlinky.steamClient.mod.EMsg.ClientAckVACBan with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientAckVACBan2 extends EMsg
  /* 732 */ val ClientAckVACBan2: typingsSlinky.steamClient.mod.EMsg.ClientAckVACBan2 with Double = js.native
  
  @js.native
  sealed trait ClientAcknowledgeClanInvite extends EMsg
  /* 745 */ val ClientAcknowledgeClanInvite: typingsSlinky.steamClient.mod.EMsg.ClientAcknowledgeClanInvite with Double = js.native
  
  @js.native
  sealed trait ClientActivateOEMLicense extends EMsg
  /* 5468 */ val ClientActivateOEMLicense: typingsSlinky.steamClient.mod.EMsg.ClientActivateOEMLicense with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientAddFriend extends EMsg
  /* 791 */ val ClientAddFriend: typingsSlinky.steamClient.mod.EMsg.ClientAddFriend with Double = js.native
  
  @js.native
  sealed trait ClientAddFriendResponse extends EMsg
  /* 792 */ val ClientAddFriendResponse: typingsSlinky.steamClient.mod.EMsg.ClientAddFriendResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientAnonLogOn_Deprecated extends EMsg
  /* 702 */ val ClientAnonLogOn_Deprecated: typingsSlinky.steamClient.mod.EMsg.ClientAnonLogOn_Deprecated with Double = js.native
  
  @js.native
  sealed trait ClientAnonUserLogOn_Deprecated extends EMsg
  /* 5409 */ val ClientAnonUserLogOn_Deprecated: typingsSlinky.steamClient.mod.EMsg.ClientAnonUserLogOn_Deprecated with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientAppInfoChanges extends EMsg
  /* 867 */ val ClientAppInfoChanges: typingsSlinky.steamClient.mod.EMsg.ClientAppInfoChanges with Double = js.native
  
  @js.native
  sealed trait ClientAppInfoRequest extends EMsg
  /* 840 */ val ClientAppInfoRequest: typingsSlinky.steamClient.mod.EMsg.ClientAppInfoRequest with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientAppInfoResponse extends EMsg
  /* 841 */ val ClientAppInfoResponse: typingsSlinky.steamClient.mod.EMsg.ClientAppInfoResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientAppInfoUpdate extends EMsg
  /* 866 */ val ClientAppInfoUpdate: typingsSlinky.steamClient.mod.EMsg.ClientAppInfoUpdate with Double = js.native
  
  @js.native
  sealed trait ClientAppMinutesPlayedData extends EMsg
  /* 5507 */ val ClientAppMinutesPlayedData: typingsSlinky.steamClient.mod.EMsg.ClientAppMinutesPlayedData with Double = js.native
  
  @js.native
  sealed trait ClientAppUsageEvent extends EMsg
  /* 747 */ val ClientAppUsageEvent: typingsSlinky.steamClient.mod.EMsg.ClientAppUsageEvent with Double = js.native
  
  @js.native
  sealed trait ClientAuthList extends EMsg
  /* 5432 */ val ClientAuthList: typingsSlinky.steamClient.mod.EMsg.ClientAuthList with Double = js.native
  
  @js.native
  sealed trait ClientAuthListAck extends EMsg
  /* 5575 */ val ClientAuthListAck: typingsSlinky.steamClient.mod.EMsg.ClientAuthListAck with Double = js.native
  
  @js.native
  sealed trait ClientAuthList_Deprecated extends EMsg
  /* 5428 */ val ClientAuthList_Deprecated: typingsSlinky.steamClient.mod.EMsg.ClientAuthList_Deprecated with Double = js.native
  
  @js.native
  sealed trait ClientAuthorizeLocalDevice extends EMsg
  /* 6502 */ val ClientAuthorizeLocalDevice: typingsSlinky.steamClient.mod.EMsg.ClientAuthorizeLocalDevice with Double = js.native
  
  @js.native
  sealed trait ClientAuthorizeLocalDeviceNotification extends EMsg
  /* 6509 */ val ClientAuthorizeLocalDeviceNotification: typingsSlinky.steamClient.mod.EMsg.ClientAuthorizeLocalDeviceNotification with Double = js.native
  
  @js.native
  sealed trait ClientAuthorizeLocalDeviceRequest extends EMsg
  /* 6501 */ val ClientAuthorizeLocalDeviceRequest: typingsSlinky.steamClient.mod.EMsg.ClientAuthorizeLocalDeviceRequest with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientAuthorizeLocalDeviceResponse extends EMsg
  /* 6502 */ val ClientAuthorizeLocalDeviceResponse: typingsSlinky.steamClient.mod.EMsg.ClientAuthorizeLocalDeviceResponse with Double = js.native
  
  @js.native
  sealed trait ClientBroadcastBase extends EMsg
  /* 9700 */ val ClientBroadcastBase: typingsSlinky.steamClient.mod.EMsg.ClientBroadcastBase with Double = js.native
  
  @js.native
  sealed trait ClientBroadcastDisconnect extends EMsg
  /* 9702 */ val ClientBroadcastDisconnect: typingsSlinky.steamClient.mod.EMsg.ClientBroadcastDisconnect with Double = js.native
  
  @js.native
  sealed trait ClientBroadcastFrames extends EMsg
  /* 9701 */ val ClientBroadcastFrames: typingsSlinky.steamClient.mod.EMsg.ClientBroadcastFrames with Double = js.native
  
  @js.native
  sealed trait ClientBroadcastInit extends EMsg
  /* 9700 */ val ClientBroadcastInit: typingsSlinky.steamClient.mod.EMsg.ClientBroadcastInit with Double = js.native
  
  @js.native
  sealed trait ClientBroadcastScreenshot extends EMsg
  /* 9703 */ val ClientBroadcastScreenshot: typingsSlinky.steamClient.mod.EMsg.ClientBroadcastScreenshot with Double = js.native
  
  @js.native
  sealed trait ClientBroadcastUploadConfig extends EMsg
  /* 9704 */ val ClientBroadcastUploadConfig: typingsSlinky.steamClient.mod.EMsg.ClientBroadcastUploadConfig with Double = js.native
  
  @js.native
  sealed trait ClientCMList extends EMsg
  /* 783 */ val ClientCMList: typingsSlinky.steamClient.mod.EMsg.ClientCMList with Double = js.native
  
  @js.native
  sealed trait ClientCancelLicense extends EMsg
  /* 729 */ val ClientCancelLicense: typingsSlinky.steamClient.mod.EMsg.ClientCancelLicense with Double = js.native
  
  @js.native
  sealed trait ClientCancelLicenseResponse extends EMsg
  /* 781 */ val ClientCancelLicenseResponse: typingsSlinky.steamClient.mod.EMsg.ClientCancelLicenseResponse with Double = js.native
  
  @js.native
  sealed trait ClientChangeStatus extends EMsg
  /* 716 */ val ClientChangeStatus: typingsSlinky.steamClient.mod.EMsg.ClientChangeStatus with Double = js.native
  
  @js.native
  sealed trait ClientChangeSteamGuardOptions extends EMsg
  /* 5579 */ val ClientChangeSteamGuardOptions: typingsSlinky.steamClient.mod.EMsg.ClientChangeSteamGuardOptions with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientChangeSteamGuardOptionsResponse extends EMsg
  /* 5580 */ val ClientChangeSteamGuardOptionsResponse: typingsSlinky.steamClient.mod.EMsg.ClientChangeSteamGuardOptionsResponse with Double = js.native
  
  @js.native
  sealed trait ClientChatAction extends EMsg
  /* 597 */ val ClientChatAction: typingsSlinky.steamClient.mod.EMsg.ClientChatAction with Double = js.native
  
  @js.native
  sealed trait ClientChatActionResult extends EMsg
  /* 814 */ val ClientChatActionResult: typingsSlinky.steamClient.mod.EMsg.ClientChatActionResult with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientChatDeclined extends EMsg
  /* 5426 */ val ClientChatDeclined: typingsSlinky.steamClient.mod.EMsg.ClientChatDeclined with Double = js.native
  
  @js.native
  sealed trait ClientChatEnter extends EMsg
  /* 807 */ val ClientChatEnter: typingsSlinky.steamClient.mod.EMsg.ClientChatEnter with Double = js.native
  
  @js.native
  sealed trait ClientChatInvite extends EMsg
  /* 800 */ val ClientChatInvite: typingsSlinky.steamClient.mod.EMsg.ClientChatInvite with Double = js.native
  
  @js.native
  sealed trait ClientChatMemberInfo extends EMsg
  /* 802 */ val ClientChatMemberInfo: typingsSlinky.steamClient.mod.EMsg.ClientChatMemberInfo with Double = js.native
  
  @js.native
  sealed trait ClientChatMsg extends EMsg
  /* 799 */ val ClientChatMsg: typingsSlinky.steamClient.mod.EMsg.ClientChatMsg with Double = js.native
  
  @js.native
  sealed trait ClientChatRoomInfo extends EMsg
  /* 4026 */ val ClientChatRoomInfo: typingsSlinky.steamClient.mod.EMsg.ClientChatRoomInfo with Double = js.native
  
  @js.native
  sealed trait ClientCheckAppBetaPassword extends EMsg
  /* 5450 */ val ClientCheckAppBetaPassword: typingsSlinky.steamClient.mod.EMsg.ClientCheckAppBetaPassword with Double = js.native
  
  @js.native
  sealed trait ClientCheckAppBetaPasswordResponse extends EMsg
  /* 5451 */ val ClientCheckAppBetaPasswordResponse: typingsSlinky.steamClient.mod.EMsg.ClientCheckAppBetaPasswordResponse with Double = js.native
  
  @js.native
  sealed trait ClientCheckFileSignature extends EMsg
  /* 5533 */ val ClientCheckFileSignature: typingsSlinky.steamClient.mod.EMsg.ClientCheckFileSignature with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientCheckFileSignatureResponse extends EMsg
  /* 5534 */ val ClientCheckFileSignatureResponse: typingsSlinky.steamClient.mod.EMsg.ClientCheckFileSignatureResponse with Double = js.native
  
  @js.native
  sealed trait ClientCheckPassword extends EMsg
  /* 845 */ val ClientCheckPassword: typingsSlinky.steamClient.mod.EMsg.ClientCheckPassword with Double = js.native
  
  @js.native
  sealed trait ClientCheckPasswordResponse extends EMsg
  /* 848 */ val ClientCheckPasswordResponse: typingsSlinky.steamClient.mod.EMsg.ClientCheckPasswordResponse with Double = js.native
  
  @js.native
  sealed trait ClientClanState extends EMsg
  /* 822 */ val ClientClanState: typingsSlinky.steamClient.mod.EMsg.ClientClanState with Double = js.native
  
  @js.native
  sealed trait ClientCommentNotifications extends EMsg
  /* 5582 */ val ClientCommentNotifications: typingsSlinky.steamClient.mod.EMsg.ClientCommentNotifications with Double = js.native
  
  @js.native
  sealed trait ClientConcurrentSessionsBase extends EMsg
  /* 9600 */ val ClientConcurrentSessionsBase: typingsSlinky.steamClient.mod.EMsg.ClientConcurrentSessionsBase with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientConnectionStats extends EMsg
  /* 710 */ val ClientConnectionStats: typingsSlinky.steamClient.mod.EMsg.ClientConnectionStats with Double = js.native
  
  @js.native
  sealed trait ClientContentServerLogOn_Deprecated extends EMsg
  /* 731 */ val ClientContentServerLogOn_Deprecated: typingsSlinky.steamClient.mod.EMsg.ClientContentServerLogOn_Deprecated with Double = js.native
  
  @js.native
  sealed trait ClientCreateAccount2 extends EMsg
  /* 5406 */ val ClientCreateAccount2: typingsSlinky.steamClient.mod.EMsg.ClientCreateAccount2 with Double = js.native
  
  @js.native
  sealed trait ClientCreateAccount3 extends EMsg
  /* 5462 */ val ClientCreateAccount3: typingsSlinky.steamClient.mod.EMsg.ClientCreateAccount3 with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientCreateAccountProto extends EMsg
  /* 5590 */ val ClientCreateAccountProto: typingsSlinky.steamClient.mod.EMsg.ClientCreateAccountProto with Double = js.native
  
  @js.native
  sealed trait ClientCreateAccountProtoResponse extends EMsg
  /* 5591 */ val ClientCreateAccountProtoResponse: typingsSlinky.steamClient.mod.EMsg.ClientCreateAccountProtoResponse with Double = js.native
  
  @js.native
  sealed trait ClientCreateAccountResponse extends EMsg
  /* 5403 */ val ClientCreateAccountResponse: typingsSlinky.steamClient.mod.EMsg.ClientCreateAccountResponse with Double = js.native
  
  @js.native
  sealed trait ClientCreateAcctResponse extends EMsg
  /* 761 */ val ClientCreateAcctResponse: typingsSlinky.steamClient.mod.EMsg.ClientCreateAcctResponse with Double = js.native
  
  @js.native
  sealed trait ClientCreateChat extends EMsg
  /* 809 */ val ClientCreateChat: typingsSlinky.steamClient.mod.EMsg.ClientCreateChat with Double = js.native
  
  @js.native
  sealed trait ClientCreateChatResponse extends EMsg
  /* 810 */ val ClientCreateChatResponse: typingsSlinky.steamClient.mod.EMsg.ClientCreateChatResponse with Double = js.native
  
  @js.native
  sealed trait ClientCurrentUIMode extends EMsg
  /* 5597 */ val ClientCurrentUIMode: typingsSlinky.steamClient.mod.EMsg.ClientCurrentUIMode with Double = js.native
  
  @js.native
  sealed trait ClientDFSAuthenticateRequest extends EMsg
  /* 5605 */ val ClientDFSAuthenticateRequest: typingsSlinky.steamClient.mod.EMsg.ClientDFSAuthenticateRequest with Double = js.native
  
  @js.native
  sealed trait ClientDFSAuthenticateResponse extends EMsg
  /* 5606 */ val ClientDFSAuthenticateResponse: typingsSlinky.steamClient.mod.EMsg.ClientDFSAuthenticateResponse with Double = js.native
  
  @js.native
  sealed trait ClientDFSDownloadStatus extends EMsg
  /* 5617 */ val ClientDFSDownloadStatus: typingsSlinky.steamClient.mod.EMsg.ClientDFSDownloadStatus with Double = js.native
  
  @js.native
  sealed trait ClientDFSEndSession extends EMsg
  /* 5607 */ val ClientDFSEndSession: typingsSlinky.steamClient.mod.EMsg.ClientDFSEndSession with Double = js.native
  
  @js.native
  sealed trait ClientDPCheckSpecialSurvey extends EMsg
  /* 1620 */ val ClientDPCheckSpecialSurvey: typingsSlinky.steamClient.mod.EMsg.ClientDPCheckSpecialSurvey with Double = js.native
  
  @js.native
  sealed trait ClientDPCheckSpecialSurveyResponse extends EMsg
  /* 1621 */ val ClientDPCheckSpecialSurveyResponse: typingsSlinky.steamClient.mod.EMsg.ClientDPCheckSpecialSurveyResponse with Double = js.native
  
  @js.native
  sealed trait ClientDPContentStatsReport extends EMsg
  /* 1630 */ val ClientDPContentStatsReport: typingsSlinky.steamClient.mod.EMsg.ClientDPContentStatsReport with Double = js.native
  
  @js.native
  sealed trait ClientDPSendSpecialSurveyResponse extends EMsg
  /* 1622 */ val ClientDPSendSpecialSurveyResponse: typingsSlinky.steamClient.mod.EMsg.ClientDPSendSpecialSurveyResponse with Double = js.native
  
  @js.native
  sealed trait ClientDPSendSpecialSurveyResponseReply extends EMsg
  /* 1623 */ val ClientDPSendSpecialSurveyResponseReply: typingsSlinky.steamClient.mod.EMsg.ClientDPSendSpecialSurveyResponseReply with Double = js.native
  
  @js.native
  sealed trait ClientDPSteam2AppStarted extends EMsg
  /* 1627 */ val ClientDPSteam2AppStarted: typingsSlinky.steamClient.mod.EMsg.ClientDPSteam2AppStarted with Double = js.native
  
  @js.native
  sealed trait ClientDPUpdateAppJobReport extends EMsg
  /* 1625 */ val ClientDPUpdateAppJobReport: typingsSlinky.steamClient.mod.EMsg.ClientDPUpdateAppJobReport with Double = js.native
  
  @js.native
  sealed trait ClientDRMBlobRequest extends EMsg
  /* 896 */ val ClientDRMBlobRequest: typingsSlinky.steamClient.mod.EMsg.ClientDRMBlobRequest with Double = js.native
  
  @js.native
  sealed trait ClientDRMBlobResponse extends EMsg
  /* 897 */ val ClientDRMBlobResponse: typingsSlinky.steamClient.mod.EMsg.ClientDRMBlobResponse with Double = js.native
  
  @js.native
  sealed trait ClientDRMDownloadRequest extends EMsg
  /* 5485 */ val ClientDRMDownloadRequest: typingsSlinky.steamClient.mod.EMsg.ClientDRMDownloadRequest with Double = js.native
  
  @js.native
  sealed trait ClientDRMDownloadRequestWithCrashData extends EMsg
  /* 5574 */ val ClientDRMDownloadRequestWithCrashData: typingsSlinky.steamClient.mod.EMsg.ClientDRMDownloadRequestWithCrashData with Double = js.native
  
  @js.native
  sealed trait ClientDRMDownloadResponse extends EMsg
  /* 5486 */ val ClientDRMDownloadResponse: typingsSlinky.steamClient.mod.EMsg.ClientDRMDownloadResponse with Double = js.native
  
  @js.native
  sealed trait ClientDRMFinalResult extends EMsg
  /* 5487 */ val ClientDRMFinalResult: typingsSlinky.steamClient.mod.EMsg.ClientDRMFinalResult with Double = js.native
  
  @js.native
  sealed trait ClientDRMProblemReport extends EMsg
  /* 851 */ val ClientDRMProblemReport: typingsSlinky.steamClient.mod.EMsg.ClientDRMProblemReport with Double = js.native
  
  @js.native
  sealed trait ClientDRMTest extends EMsg
  /* 5495 */ val ClientDRMTest: typingsSlinky.steamClient.mod.EMsg.ClientDRMTest with Double = js.native
  
  @js.native
  sealed trait ClientDRMTestResult extends EMsg
  /* 5496 */ val ClientDRMTestResult: typingsSlinky.steamClient.mod.EMsg.ClientDRMTestResult with Double = js.native
  
  @js.native
  sealed trait ClientDeauthorizeDevice extends EMsg
  /* 6504 */ val ClientDeauthorizeDevice: typingsSlinky.steamClient.mod.EMsg.ClientDeauthorizeDevice with Double = js.native
  
  @js.native
  sealed trait ClientDeauthorizeDeviceRequest extends EMsg
  /* 6503 */ val ClientDeauthorizeDeviceRequest: typingsSlinky.steamClient.mod.EMsg.ClientDeauthorizeDeviceRequest with Double = js.native
  
  @js.native
  sealed trait ClientDeregisterWithServer extends EMsg
  /* 5511 */ val ClientDeregisterWithServer: typingsSlinky.steamClient.mod.EMsg.ClientDeregisterWithServer with Double = js.native
  
  @js.native
  sealed trait ClientDisableTestLicense extends EMsg
  /* 5445 */ val ClientDisableTestLicense: typingsSlinky.steamClient.mod.EMsg.ClientDisableTestLicense with Double = js.native
  
  @js.native
  sealed trait ClientDisableTestLicenseResponse extends EMsg
  /* 5446 */ val ClientDisableTestLicenseResponse: typingsSlinky.steamClient.mod.EMsg.ClientDisableTestLicenseResponse with Double = js.native
  
  @js.native
  sealed trait ClientDownloadRateStatistics extends EMsg
  /* 5548 */ val ClientDownloadRateStatistics: typingsSlinky.steamClient.mod.EMsg.ClientDownloadRateStatistics with Double = js.native
  
  @js.native
  sealed trait ClientEmailAddrInfo extends EMsg
  /* 5456 */ val ClientEmailAddrInfo: typingsSlinky.steamClient.mod.EMsg.ClientEmailAddrInfo with Double = js.native
  
  @js.native
  sealed trait ClientEmailChange3 extends EMsg
  /* 5458 */ val ClientEmailChange3: typingsSlinky.steamClient.mod.EMsg.ClientEmailChange3 with Double = js.native
  
  @js.native
  sealed trait ClientEmailChange4 extends EMsg
  /* 5544 */ val ClientEmailChange4: typingsSlinky.steamClient.mod.EMsg.ClientEmailChange4 with Double = js.native
  
  @js.native
  sealed trait ClientEmailChangeResponse extends EMsg
  /* 891 */ val ClientEmailChangeResponse: typingsSlinky.steamClient.mod.EMsg.ClientEmailChangeResponse with Double = js.native
  
  @js.native
  sealed trait ClientEmailChangeResponse4 extends EMsg
  /* 5545 */ val ClientEmailChangeResponse4: typingsSlinky.steamClient.mod.EMsg.ClientEmailChangeResponse4 with Double = js.native
  
  @js.native
  sealed trait ClientEmoticonList extends EMsg
  /* 9331 */ val ClientEmoticonList: typingsSlinky.steamClient.mod.EMsg.ClientEmoticonList with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientEnableTestLicense extends EMsg
  /* 5443 */ val ClientEnableTestLicense: typingsSlinky.steamClient.mod.EMsg.ClientEnableTestLicense with Double = js.native
  
  @js.native
  sealed trait ClientEnableTestLicenseResponse extends EMsg
  /* 5444 */ val ClientEnableTestLicenseResponse: typingsSlinky.steamClient.mod.EMsg.ClientEnableTestLicenseResponse with Double = js.native
  
  @js.native
  sealed trait ClientEncryptPct extends EMsg
  /* 784 */ val ClientEncryptPct: typingsSlinky.steamClient.mod.EMsg.ClientEncryptPct with Double = js.native
  
  @js.native
  sealed trait ClientFSEnumerateFollowingList extends EMsg
  /* 7519 */ val ClientFSEnumerateFollowingList: typingsSlinky.steamClient.mod.EMsg.ClientFSEnumerateFollowingList with Double = js.native
  
  @js.native
  sealed trait ClientFSEnumerateFollowingListResponse extends EMsg
  /* 7520 */ val ClientFSEnumerateFollowingListResponse: typingsSlinky.steamClient.mod.EMsg.ClientFSEnumerateFollowingListResponse with Double = js.native
  
  @js.native
  sealed trait ClientFSGetFollowerCount extends EMsg
  /* 7515 */ val ClientFSGetFollowerCount: typingsSlinky.steamClient.mod.EMsg.ClientFSGetFollowerCount with Double = js.native
  
  @js.native
  sealed trait ClientFSGetFollowerCountResponse extends EMsg
  /* 7516 */ val ClientFSGetFollowerCountResponse: typingsSlinky.steamClient.mod.EMsg.ClientFSGetFollowerCountResponse with Double = js.native
  
  @js.native
  sealed trait ClientFSGetFriendMessageHistory extends EMsg
  /* 7525 */ val ClientFSGetFriendMessageHistory: typingsSlinky.steamClient.mod.EMsg.ClientFSGetFriendMessageHistory with Double = js.native
  
  @js.native
  sealed trait ClientFSGetFriendMessageHistoryForOfflineMessages extends EMsg
  /* 7527 */ val ClientFSGetFriendMessageHistoryForOfflineMessages: typingsSlinky.steamClient.mod.EMsg.ClientFSGetFriendMessageHistoryForOfflineMessages with Double = js.native
  
  @js.native
  sealed trait ClientFSGetFriendMessageHistoryResponse extends EMsg
  /* 7526 */ val ClientFSGetFriendMessageHistoryResponse: typingsSlinky.steamClient.mod.EMsg.ClientFSGetFriendMessageHistoryResponse with Double = js.native
  
  @js.native
  sealed trait ClientFSGetFriendsSteamLevels extends EMsg
  /* 7528 */ val ClientFSGetFriendsSteamLevels: typingsSlinky.steamClient.mod.EMsg.ClientFSGetFriendsSteamLevels with Double = js.native
  
  @js.native
  sealed trait ClientFSGetFriendsSteamLevelsResponse extends EMsg
  /* 7529 */ val ClientFSGetFriendsSteamLevelsResponse: typingsSlinky.steamClient.mod.EMsg.ClientFSGetFriendsSteamLevelsResponse with Double = js.native
  
  @js.native
  sealed trait ClientFSGetIsFollowing extends EMsg
  /* 7517 */ val ClientFSGetIsFollowing: typingsSlinky.steamClient.mod.EMsg.ClientFSGetIsFollowing with Double = js.native
  
  @js.native
  sealed trait ClientFSGetIsFollowingResponse extends EMsg
  /* 7518 */ val ClientFSGetIsFollowingResponse: typingsSlinky.steamClient.mod.EMsg.ClientFSGetIsFollowingResponse with Double = js.native
  
  @js.native
  sealed trait ClientFSOfflineMessageNotification extends EMsg
  /* 7523 */ val ClientFSOfflineMessageNotification: typingsSlinky.steamClient.mod.EMsg.ClientFSOfflineMessageNotification with Double = js.native
  
  @js.native
  sealed trait ClientFSRequestOfflineMessageCount extends EMsg
  /* 7524 */ val ClientFSRequestOfflineMessageCount: typingsSlinky.steamClient.mod.EMsg.ClientFSRequestOfflineMessageCount with Double = js.native
  
  @js.native
  sealed trait ClientFavoritesList extends EMsg
  /* 786 */ val ClientFavoritesList: typingsSlinky.steamClient.mod.EMsg.ClientFavoritesList with Double = js.native
  
  @js.native
  sealed trait ClientFileToDownload extends EMsg
  /* 5412 */ val ClientFileToDownload: typingsSlinky.steamClient.mod.EMsg.ClientFileToDownload with Double = js.native
  
  @js.native
  sealed trait ClientFileToDownloadResponse extends EMsg
  /* 5413 */ val ClientFileToDownloadResponse: typingsSlinky.steamClient.mod.EMsg.ClientFileToDownloadResponse with Double = js.native
  
  @js.native
  sealed trait ClientFriendMsg extends EMsg
  /* 718 */ val ClientFriendMsg: typingsSlinky.steamClient.mod.EMsg.ClientFriendMsg with Double = js.native
  
  @js.native
  sealed trait ClientFriendMsgEchoToSender extends EMsg
  /* 5578 */ val ClientFriendMsgEchoToSender: typingsSlinky.steamClient.mod.EMsg.ClientFriendMsgEchoToSender with Double = js.native
  
  @js.native
  sealed trait ClientFriendMsgIncoming extends EMsg
  /* 5427 */ val ClientFriendMsgIncoming: typingsSlinky.steamClient.mod.EMsg.ClientFriendMsgIncoming with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientFriendProfileInfo extends EMsg
  /* 5535 */ val ClientFriendProfileInfo: typingsSlinky.steamClient.mod.EMsg.ClientFriendProfileInfo with Double = js.native
  
  @js.native
  sealed trait ClientFriendProfileInfoResponse extends EMsg
  /* 5536 */ val ClientFriendProfileInfoResponse: typingsSlinky.steamClient.mod.EMsg.ClientFriendProfileInfoResponse with Double = js.native
  
  @js.native
  sealed trait ClientFriendRemovedFromSource extends EMsg
  /* 808 */ val ClientFriendRemovedFromSource: typingsSlinky.steamClient.mod.EMsg.ClientFriendRemovedFromSource with Double = js.native
  
  @js.native
  sealed trait ClientFriendUserStatusPublished extends EMsg
  /* 5596 */ val ClientFriendUserStatusPublished: typingsSlinky.steamClient.mod.EMsg.ClientFriendUserStatusPublished with Double = js.native
  
  @js.native
  sealed trait ClientFriendsGroupsList extends EMsg
  /* 5553 */ val ClientFriendsGroupsList: typingsSlinky.steamClient.mod.EMsg.ClientFriendsGroupsList with Double = js.native
  
  @js.native
  sealed trait ClientFriendsList extends EMsg
  /* 767 */ val ClientFriendsList: typingsSlinky.steamClient.mod.EMsg.ClientFriendsList with Double = js.native
  
  @js.native
  sealed trait ClientFromGC extends EMsg
  /* 5453 */ val ClientFromGC: typingsSlinky.steamClient.mod.EMsg.ClientFromGC with Double = js.native
  
  @js.native
  sealed trait ClientGCMsgFailed extends EMsg
  /* 5503 */ val ClientGCMsgFailed: typingsSlinky.steamClient.mod.EMsg.ClientGCMsgFailed with Double = js.native
  
  @js.native
  sealed trait ClientGMSServerQuery extends EMsg
  /* 6403 */ val ClientGMSServerQuery: typingsSlinky.steamClient.mod.EMsg.ClientGMSServerQuery with Double = js.native
  
  @js.native
  sealed trait ClientGameConnectDeny extends EMsg
  /* 773 */ val ClientGameConnectDeny: typingsSlinky.steamClient.mod.EMsg.ClientGameConnectDeny with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientGameConnectTokens extends EMsg
  /* 779 */ val ClientGameConnectTokens: typingsSlinky.steamClient.mod.EMsg.ClientGameConnectTokens with Double = js.native
  
  @js.native
  sealed trait ClientGameConnect_obsolete extends EMsg
  /* 719 */ val ClientGameConnect_obsolete: typingsSlinky.steamClient.mod.EMsg.ClientGameConnect_obsolete with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientGameEnded_obsolete extends EMsg
  /* 721 */ val ClientGameEnded_obsolete: typingsSlinky.steamClient.mod.EMsg.ClientGameEnded_obsolete with Double = js.native
  
  @js.native
  sealed trait ClientGamesPlayed extends EMsg
  /* 742 */ val ClientGamesPlayed: typingsSlinky.steamClient.mod.EMsg.ClientGamesPlayed with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientGamesPlayed2_obsolete extends EMsg
  /* 720 */ val ClientGamesPlayed2_obsolete: typingsSlinky.steamClient.mod.EMsg.ClientGamesPlayed2_obsolete with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientGamesPlayed3_obsolete extends EMsg
  /* 738 */ val ClientGamesPlayed3_obsolete: typingsSlinky.steamClient.mod.EMsg.ClientGamesPlayed3_obsolete with Double = js.native
  
  @js.native
  sealed trait ClientGamesPlayedNoDataBlob extends EMsg
  /* 715 */ val ClientGamesPlayedNoDataBlob: typingsSlinky.steamClient.mod.EMsg.ClientGamesPlayedNoDataBlob with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientGamesPlayedWithDataBlob extends EMsg
  /* 5410 */ val ClientGamesPlayedWithDataBlob: typingsSlinky.steamClient.mod.EMsg.ClientGamesPlayedWithDataBlob with Double = js.native
  
  @js.native
  sealed trait ClientGamesPlayed_obsolete extends EMsg
  /* 705 */ val ClientGamesPlayed_obsolete: typingsSlinky.steamClient.mod.EMsg.ClientGamesPlayed_obsolete with Double = js.native
  
  @js.native
  sealed trait ClientGetAppBetaPasswords extends EMsg
  /* 5441 */ val ClientGetAppBetaPasswords: typingsSlinky.steamClient.mod.EMsg.ClientGetAppBetaPasswords with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientGetAppBetaPasswordsResponse extends EMsg
  /* 5442 */ val ClientGetAppBetaPasswordsResponse: typingsSlinky.steamClient.mod.EMsg.ClientGetAppBetaPasswordsResponse with Double = js.native
  
  @js.native
  sealed trait ClientGetAppOwnershipTicket extends EMsg
  /* 857 */ val ClientGetAppOwnershipTicket: typingsSlinky.steamClient.mod.EMsg.ClientGetAppOwnershipTicket with Double = js.native
  
  @js.native
  sealed trait ClientGetAppOwnershipTicketResponse extends EMsg
  /* 858 */ val ClientGetAppOwnershipTicketResponse: typingsSlinky.steamClient.mod.EMsg.ClientGetAppOwnershipTicketResponse with Double = js.native
  
  @js.native
  sealed trait ClientGetAuthorizedDevices extends EMsg
  /* 6506 */ val ClientGetAuthorizedDevices: typingsSlinky.steamClient.mod.EMsg.ClientGetAuthorizedDevices with Double = js.native
  
  @js.native
  sealed trait ClientGetAuthorizedDevicesResponse extends EMsg
  /* 6507 */ val ClientGetAuthorizedDevicesResponse: typingsSlinky.steamClient.mod.EMsg.ClientGetAuthorizedDevicesResponse with Double = js.native
  
  @js.native
  sealed trait ClientGetCDNAuthToken extends EMsg
  /* 5546 */ val ClientGetCDNAuthToken: typingsSlinky.steamClient.mod.EMsg.ClientGetCDNAuthToken with Double = js.native
  
  @js.native
  sealed trait ClientGetCDNAuthTokenResponse extends EMsg
  /* 5547 */ val ClientGetCDNAuthTokenResponse: typingsSlinky.steamClient.mod.EMsg.ClientGetCDNAuthTokenResponse with Double = js.native
  
  @js.native
  sealed trait ClientGetClanActivityCounts extends EMsg
  /* 5554 */ val ClientGetClanActivityCounts: typingsSlinky.steamClient.mod.EMsg.ClientGetClanActivityCounts with Double = js.native
  
  @js.native
  sealed trait ClientGetClanActivityCountsResponse extends EMsg
  /* 5555 */ val ClientGetClanActivityCountsResponse: typingsSlinky.steamClient.mod.EMsg.ClientGetClanActivityCountsResponse with Double = js.native
  
  @js.native
  sealed trait ClientGetClientAppList extends EMsg
  /* 5518 */ val ClientGetClientAppList: typingsSlinky.steamClient.mod.EMsg.ClientGetClientAppList with Double = js.native
  
  @js.native
  sealed trait ClientGetClientAppListResponse extends EMsg
  /* 5519 */ val ClientGetClientAppListResponse: typingsSlinky.steamClient.mod.EMsg.ClientGetClientAppListResponse with Double = js.native
  
  @js.native
  sealed trait ClientGetClientDetails extends EMsg
  /* 5515 */ val ClientGetClientDetails: typingsSlinky.steamClient.mod.EMsg.ClientGetClientDetails with Double = js.native
  
  @js.native
  sealed trait ClientGetClientDetailsResponse extends EMsg
  /* 5516 */ val ClientGetClientDetailsResponse: typingsSlinky.steamClient.mod.EMsg.ClientGetClientDetailsResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientGetDepotDecryptionKey extends EMsg
  /* 5438 */ val ClientGetDepotDecryptionKey: typingsSlinky.steamClient.mod.EMsg.ClientGetDepotDecryptionKey with Double = js.native
  
  @js.native
  sealed trait ClientGetDepotDecryptionKeyResponse extends EMsg
  /* 5439 */ val ClientGetDepotDecryptionKeyResponse: typingsSlinky.steamClient.mod.EMsg.ClientGetDepotDecryptionKeyResponse with Double = js.native
  
  @js.native
  sealed trait ClientGetEmoticonList extends EMsg
  /* 9330 */ val ClientGetEmoticonList: typingsSlinky.steamClient.mod.EMsg.ClientGetEmoticonList with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientGetFinalPrice extends EMsg
  /* 722 */ val ClientGetFinalPrice: typingsSlinky.steamClient.mod.EMsg.ClientGetFinalPrice with Double = js.native
  
  @js.native
  sealed trait ClientGetFinalPriceResponse extends EMsg
  /* 775 */ val ClientGetFinalPriceResponse: typingsSlinky.steamClient.mod.EMsg.ClientGetFinalPriceResponse with Double = js.native
  
  @js.native
  sealed trait ClientGetFriendsWhoPlayGame extends EMsg
  /* 5488 */ val ClientGetFriendsWhoPlayGame: typingsSlinky.steamClient.mod.EMsg.ClientGetFriendsWhoPlayGame with Double = js.native
  
  @js.native
  sealed trait ClientGetFriendsWhoPlayGameResponse extends EMsg
  /* 5489 */ val ClientGetFriendsWhoPlayGameResponse: typingsSlinky.steamClient.mod.EMsg.ClientGetFriendsWhoPlayGameResponse with Double = js.native
  
  @js.native
  sealed trait ClientGetGiftTargetList extends EMsg
  /* 748 */ val ClientGetGiftTargetList: typingsSlinky.steamClient.mod.EMsg.ClientGetGiftTargetList with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientGetGiftTargetListResponse extends EMsg
  /* 749 */ val ClientGetGiftTargetListResponse: typingsSlinky.steamClient.mod.EMsg.ClientGetGiftTargetListResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientGetLegacyGameKey extends EMsg
  /* 730 */ val ClientGetLegacyGameKey: typingsSlinky.steamClient.mod.EMsg.ClientGetLegacyGameKey with Double = js.native
  
  @js.native
  sealed trait ClientGetLegacyGameKeyResponse extends EMsg
  /* 785 */ val ClientGetLegacyGameKeyResponse: typingsSlinky.steamClient.mod.EMsg.ClientGetLegacyGameKeyResponse with Double = js.native
  
  @js.native
  sealed trait ClientGetLicenses extends EMsg
  /* 728 */ val ClientGetLicenses: typingsSlinky.steamClient.mod.EMsg.ClientGetLicenses with Double = js.native
  
  @js.native
  sealed trait ClientGetLobbyListResponse extends EMsg
  /* 860 */ val ClientGetLobbyListResponse: typingsSlinky.steamClient.mod.EMsg.ClientGetLobbyListResponse with Double = js.native
  
  @js.native
  sealed trait ClientGetLobbyMetadata extends EMsg
  /* 861 */ val ClientGetLobbyMetadata: typingsSlinky.steamClient.mod.EMsg.ClientGetLobbyMetadata with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientGetLobbyMetadataResponse extends EMsg
  /* 862 */ val ClientGetLobbyMetadataResponse: typingsSlinky.steamClient.mod.EMsg.ClientGetLobbyMetadataResponse with Double = js.native
  
  @js.native
  sealed trait ClientGetMicroTxnInfo extends EMsg
  /* 5508 */ val ClientGetMicroTxnInfo: typingsSlinky.steamClient.mod.EMsg.ClientGetMicroTxnInfo with Double = js.native
  
  @js.native
  sealed trait ClientGetMicroTxnInfoResponse extends EMsg
  /* 5509 */ val ClientGetMicroTxnInfoResponse: typingsSlinky.steamClient.mod.EMsg.ClientGetMicroTxnInfoResponse with Double = js.native
  
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayers extends EMsg
  /* 5436 */ val ClientGetNumberOfCurrentPlayers: typingsSlinky.steamClient.mod.EMsg.ClientGetNumberOfCurrentPlayers with Double = js.native
  
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayersDP extends EMsg
  /* 5592 */ val ClientGetNumberOfCurrentPlayersDP: typingsSlinky.steamClient.mod.EMsg.ClientGetNumberOfCurrentPlayersDP with Double = js.native
  
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayersDPResponse extends EMsg
  /* 5593 */ val ClientGetNumberOfCurrentPlayersDPResponse: typingsSlinky.steamClient.mod.EMsg.ClientGetNumberOfCurrentPlayersDPResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayersResponse extends EMsg
  /* 5437 */ val ClientGetNumberOfCurrentPlayersResponse: typingsSlinky.steamClient.mod.EMsg.ClientGetNumberOfCurrentPlayersResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientGetPurchaseReceipts extends EMsg
  /* 736 */ val ClientGetPurchaseReceipts: typingsSlinky.steamClient.mod.EMsg.ClientGetPurchaseReceipts with Double = js.native
  
  @js.native
  sealed trait ClientGetUserStats extends EMsg
  /* 818 */ val ClientGetUserStats: typingsSlinky.steamClient.mod.EMsg.ClientGetUserStats with Double = js.native
  
  @js.native
  sealed trait ClientGetUserStatsResponse extends EMsg
  /* 819 */ val ClientGetUserStatsResponse: typingsSlinky.steamClient.mod.EMsg.ClientGetUserStatsResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientHeartBeat extends EMsg
  /* 703 */ val ClientHeartBeat: typingsSlinky.steamClient.mod.EMsg.ClientHeartBeat with Double = js.native
  
  @js.native
  sealed trait ClientHideFriend extends EMsg
  /* 5552 */ val ClientHideFriend: typingsSlinky.steamClient.mod.EMsg.ClientHideFriend with Double = js.native
  
  @js.native
  sealed trait ClientInformOfCreateAccount extends EMsg
  /* 708 */ val ClientInformOfCreateAccount: typingsSlinky.steamClient.mod.EMsg.ClientInformOfCreateAccount with Double = js.native
  
  @js.native
  sealed trait ClientInformOfResetForgottenPassword extends EMsg
  /* 5407 */ val ClientInformOfResetForgottenPassword: typingsSlinky.steamClient.mod.EMsg.ClientInformOfResetForgottenPassword with Double = js.native
  
  @js.native
  sealed trait ClientInformOfResetForgottenPasswordResponse extends EMsg
  /* 5408 */ val ClientInformOfResetForgottenPasswordResponse: typingsSlinky.steamClient.mod.EMsg.ClientInformOfResetForgottenPasswordResponse with Double = js.native
  
  @js.native
  sealed trait ClientInitPurchase extends EMsg
  /* 711 */ val ClientInitPurchase: typingsSlinky.steamClient.mod.EMsg.ClientInitPurchase with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientInitPurchaseResponse extends EMsg
  /* 789 */ val ClientInitPurchaseResponse: typingsSlinky.steamClient.mod.EMsg.ClientInitPurchaseResponse with Double = js.native
  
  @js.native
  sealed trait ClientInstallClientApp extends EMsg
  /* 5520 */ val ClientInstallClientApp: typingsSlinky.steamClient.mod.EMsg.ClientInstallClientApp with Double = js.native
  
  @js.native
  sealed trait ClientInstallClientAppResponse extends EMsg
  /* 5521 */ val ClientInstallClientAppResponse: typingsSlinky.steamClient.mod.EMsg.ClientInstallClientAppResponse with Double = js.native
  
  @js.native
  sealed trait ClientInviteFriend extends EMsg
  /* 793 */ val ClientInviteFriend: typingsSlinky.steamClient.mod.EMsg.ClientInviteFriend with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientInviteFriendResponse extends EMsg
  /* 794 */ val ClientInviteFriendResponse: typingsSlinky.steamClient.mod.EMsg.ClientInviteFriendResponse with Double = js.native
  
  @js.native
  sealed trait ClientInviteUserToClan extends EMsg
  /* 744 */ val ClientInviteUserToClan: typingsSlinky.steamClient.mod.EMsg.ClientInviteUserToClan with Double = js.native
  
  @js.native
  sealed trait ClientIsLimitedAccount extends EMsg
  /* 5430 */ val ClientIsLimitedAccount: typingsSlinky.steamClient.mod.EMsg.ClientIsLimitedAccount with Double = js.native
  
  @js.native
  sealed trait ClientItemAnnouncements extends EMsg
  /* 5576 */ val ClientItemAnnouncements: typingsSlinky.steamClient.mod.EMsg.ClientItemAnnouncements with Double = js.native
  
  @js.native
  sealed trait ClientJoinChat extends EMsg
  /* 801 */ val ClientJoinChat: typingsSlinky.steamClient.mod.EMsg.ClientJoinChat with Double = js.native
  
  @js.native
  sealed trait ClientKickPlayingSession extends EMsg
  /* 9601 */ val ClientKickPlayingSession: typingsSlinky.steamClient.mod.EMsg.ClientKickPlayingSession with Double = js.native
  
  @js.native
  sealed trait ClientLBSFindOrCreateLB extends EMsg
  /* 5416 */ val ClientLBSFindOrCreateLB: typingsSlinky.steamClient.mod.EMsg.ClientLBSFindOrCreateLB with Double = js.native
  
  @js.native
  sealed trait ClientLBSFindOrCreateLBResponse extends EMsg
  /* 5417 */ val ClientLBSFindOrCreateLBResponse: typingsSlinky.steamClient.mod.EMsg.ClientLBSFindOrCreateLBResponse with Double = js.native
  
  @js.native
  sealed trait ClientLBSGetLBEntries extends EMsg
  /* 5418 */ val ClientLBSGetLBEntries: typingsSlinky.steamClient.mod.EMsg.ClientLBSGetLBEntries with Double = js.native
  
  @js.native
  sealed trait ClientLBSGetLBEntriesResponse extends EMsg
  /* 5419 */ val ClientLBSGetLBEntriesResponse: typingsSlinky.steamClient.mod.EMsg.ClientLBSGetLBEntriesResponse with Double = js.native
  
  @js.native
  sealed trait ClientLBSSetScore extends EMsg
  /* 5414 */ val ClientLBSSetScore: typingsSlinky.steamClient.mod.EMsg.ClientLBSSetScore with Double = js.native
  
  @js.native
  sealed trait ClientLBSSetScoreResponse extends EMsg
  /* 5415 */ val ClientLBSSetScoreResponse: typingsSlinky.steamClient.mod.EMsg.ClientLBSSetScoreResponse with Double = js.native
  
  @js.native
  sealed trait ClientLBSSetUGC extends EMsg
  /* 5529 */ val ClientLBSSetUGC: typingsSlinky.steamClient.mod.EMsg.ClientLBSSetUGC with Double = js.native
  
  @js.native
  sealed trait ClientLBSSetUGCResponse extends EMsg
  /* 5530 */ val ClientLBSSetUGCResponse: typingsSlinky.steamClient.mod.EMsg.ClientLBSSetUGCResponse with Double = js.native
  
  @js.native
  sealed trait ClientLicenseList extends EMsg
  /* 780 */ val ClientLicenseList: typingsSlinky.steamClient.mod.EMsg.ClientLicenseList with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientLogOff extends EMsg
  /* 706 */ val ClientLogOff: typingsSlinky.steamClient.mod.EMsg.ClientLogOff with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientLogOnResponse extends EMsg
  /* 751 */ val ClientLogOnResponse: typingsSlinky.steamClient.mod.EMsg.ClientLogOnResponse with Double = js.native
  
  @js.native
  sealed trait ClientLogOnWithCredentials_Deprecated extends EMsg
  /* 803 */ val ClientLogOnWithCredentials_Deprecated: typingsSlinky.steamClient.mod.EMsg.ClientLogOnWithCredentials_Deprecated with Double = js.native
  
  @js.native
  sealed trait ClientLogOnWithHash_Deprecated extends EMsg
  /* 5465 */ val ClientLogOnWithHash_Deprecated: typingsSlinky.steamClient.mod.EMsg.ClientLogOnWithHash_Deprecated with Double = js.native
  
  @js.native
  sealed trait ClientLogOn_Deprecated extends EMsg
  /* 701 */ val ClientLogOn_Deprecated: typingsSlinky.steamClient.mod.EMsg.ClientLogOn_Deprecated with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientLoggedOff extends EMsg
  /* 757 */ val ClientLoggedOff: typingsSlinky.steamClient.mod.EMsg.ClientLoggedOff with Double = js.native
  
  @js.native
  sealed trait ClientLogon extends EMsg
  /* 5514 */ val ClientLogon: typingsSlinky.steamClient.mod.EMsg.ClientLogon with Double = js.native
  
  @js.native
  sealed trait ClientLogonGameServer extends EMsg
  /* 5559 */ val ClientLogonGameServer: typingsSlinky.steamClient.mod.EMsg.ClientLogonGameServer with Double = js.native
  
  @js.native
  sealed trait ClientLookupKey extends EMsg
  /* 898 */ val ClientLookupKey: typingsSlinky.steamClient.mod.EMsg.ClientLookupKey with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientLookupKeyResponse extends EMsg
  /* 899 */ val ClientLookupKeyResponse: typingsSlinky.steamClient.mod.EMsg.ClientLookupKeyResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSGetDepotManifest extends EMsg
  /* 5818 */ val ClientMDSGetDepotManifest: typingsSlinky.steamClient.mod.EMsg.ClientMDSGetDepotManifest with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSGetDepotManifestChunk extends EMsg
  /* 5820 */ val ClientMDSGetDepotManifestChunk: typingsSlinky.steamClient.mod.EMsg.ClientMDSGetDepotManifestChunk with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSGetDepotManifestResponse extends EMsg
  /* 5819 */ val ClientMDSGetDepotManifestResponse: typingsSlinky.steamClient.mod.EMsg.ClientMDSGetDepotManifestResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSGetPrevDepotBuild extends EMsg
  /* 5842 */ val ClientMDSGetPrevDepotBuild: typingsSlinky.steamClient.mod.EMsg.ClientMDSGetPrevDepotBuild with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSGetPrevDepotBuildResponse extends EMsg
  /* 5843 */ val ClientMDSGetPrevDepotBuildResponse: typingsSlinky.steamClient.mod.EMsg.ClientMDSGetPrevDepotBuildResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSHeartbeat extends EMsg
  /* 5806 */ val ClientMDSHeartbeat: typingsSlinky.steamClient.mod.EMsg.ClientMDSHeartbeat with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSInitDepotBuildRequest extends EMsg
  /* 5809 */ val ClientMDSInitDepotBuildRequest: typingsSlinky.steamClient.mod.EMsg.ClientMDSInitDepotBuildRequest with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSInitDepotBuildResponse extends EMsg
  /* 5810 */ val ClientMDSInitDepotBuildResponse: typingsSlinky.steamClient.mod.EMsg.ClientMDSInitDepotBuildResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSInitWorkshopBuildRequest extends EMsg
  /* 5816 */ val ClientMDSInitWorkshopBuildRequest: typingsSlinky.steamClient.mod.EMsg.ClientMDSInitWorkshopBuildRequest with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSInitWorkshopBuildResponse extends EMsg
  /* 5817 */ val ClientMDSInitWorkshopBuildResponse: typingsSlinky.steamClient.mod.EMsg.ClientMDSInitWorkshopBuildResponse with Double = js.native
  
  @js.native
  sealed trait ClientMDSLoginRequest extends EMsg
  /* 5801 */ val ClientMDSLoginRequest: typingsSlinky.steamClient.mod.EMsg.ClientMDSLoginRequest with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSLoginResponse extends EMsg
  /* 5802 */ val ClientMDSLoginResponse: typingsSlinky.steamClient.mod.EMsg.ClientMDSLoginResponse with Double = js.native
  
  @js.native
  sealed trait ClientMDSRegisterAppBuild extends EMsg
  /* 5838 */ val ClientMDSRegisterAppBuild: typingsSlinky.steamClient.mod.EMsg.ClientMDSRegisterAppBuild with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSRegisterAppBuildResponse extends EMsg
  /* 5839 */ val ClientMDSRegisterAppBuildResponse: typingsSlinky.steamClient.mod.EMsg.ClientMDSRegisterAppBuildResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSSetAppBuildLive extends EMsg
  /* 5840 */ val ClientMDSSetAppBuildLive: typingsSlinky.steamClient.mod.EMsg.ClientMDSSetAppBuildLive with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSSetAppBuildLiveResponse extends EMsg
  /* 5841 */ val ClientMDSSetAppBuildLiveResponse: typingsSlinky.steamClient.mod.EMsg.ClientMDSSetAppBuildLiveResponse with Double = js.native
  
  @js.native
  sealed trait ClientMDSSignInstallScript extends EMsg
  /* 5845 */ val ClientMDSSignInstallScript: typingsSlinky.steamClient.mod.EMsg.ClientMDSSignInstallScript with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSSignInstallScriptResponse extends EMsg
  /* 5846 */ val ClientMDSSignInstallScriptResponse: typingsSlinky.steamClient.mod.EMsg.ClientMDSSignInstallScriptResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSTransmitManifestDataChunk extends EMsg
  /* 5805 */ val ClientMDSTransmitManifestDataChunk: typingsSlinky.steamClient.mod.EMsg.ClientMDSTransmitManifestDataChunk with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSUploadDepotChunks extends EMsg
  /* 5807 */ val ClientMDSUploadDepotChunks: typingsSlinky.steamClient.mod.EMsg.ClientMDSUploadDepotChunks with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSUploadDepotChunksResponse extends EMsg
  /* 5808 */ val ClientMDSUploadDepotChunksResponse: typingsSlinky.steamClient.mod.EMsg.ClientMDSUploadDepotChunksResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSUploadManifestRequest extends EMsg
  /* 5803 */ val ClientMDSUploadManifestRequest: typingsSlinky.steamClient.mod.EMsg.ClientMDSUploadManifestRequest with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSUploadManifestResponse extends EMsg
  /* 5804 */ val ClientMDSUploadManifestResponse: typingsSlinky.steamClient.mod.EMsg.ClientMDSUploadManifestResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSUploadRateTest extends EMsg
  /* 5823 */ val ClientMDSUploadRateTest: typingsSlinky.steamClient.mod.EMsg.ClientMDSUploadRateTest with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientMDSUploadRateTestResponse extends EMsg
  /* 5824 */ val ClientMDSUploadRateTestResponse: typingsSlinky.steamClient.mod.EMsg.ClientMDSUploadRateTestResponse with Double = js.native
  
  @js.native
  sealed trait ClientMMSCreateLobby extends EMsg
  /* 6601 */ val ClientMMSCreateLobby: typingsSlinky.steamClient.mod.EMsg.ClientMMSCreateLobby with Double = js.native
  
  @js.native
  sealed trait ClientMMSCreateLobbyResponse extends EMsg
  /* 6602 */ val ClientMMSCreateLobbyResponse: typingsSlinky.steamClient.mod.EMsg.ClientMMSCreateLobbyResponse with Double = js.native
  
  @js.native
  sealed trait ClientMMSFlushFrenemyListCache extends EMsg
  /* 6622 */ val ClientMMSFlushFrenemyListCache: typingsSlinky.steamClient.mod.EMsg.ClientMMSFlushFrenemyListCache with Double = js.native
  
  @js.native
  sealed trait ClientMMSFlushFrenemyListCacheResponse extends EMsg
  /* 6623 */ val ClientMMSFlushFrenemyListCacheResponse: typingsSlinky.steamClient.mod.EMsg.ClientMMSFlushFrenemyListCacheResponse with Double = js.native
  
  @js.native
  sealed trait ClientMMSGetLobbyData extends EMsg
  /* 6611 */ val ClientMMSGetLobbyData: typingsSlinky.steamClient.mod.EMsg.ClientMMSGetLobbyData with Double = js.native
  
  @js.native
  sealed trait ClientMMSGetLobbyList extends EMsg
  /* 6607 */ val ClientMMSGetLobbyList: typingsSlinky.steamClient.mod.EMsg.ClientMMSGetLobbyList with Double = js.native
  
  @js.native
  sealed trait ClientMMSGetLobbyListResponse extends EMsg
  /* 6608 */ val ClientMMSGetLobbyListResponse: typingsSlinky.steamClient.mod.EMsg.ClientMMSGetLobbyListResponse with Double = js.native
  
  @js.native
  sealed trait ClientMMSInviteToLobby extends EMsg
  /* 6621 */ val ClientMMSInviteToLobby: typingsSlinky.steamClient.mod.EMsg.ClientMMSInviteToLobby with Double = js.native
  
  @js.native
  sealed trait ClientMMSJoinLobby extends EMsg
  /* 6603 */ val ClientMMSJoinLobby: typingsSlinky.steamClient.mod.EMsg.ClientMMSJoinLobby with Double = js.native
  
  @js.native
  sealed trait ClientMMSJoinLobbyResponse extends EMsg
  /* 6604 */ val ClientMMSJoinLobbyResponse: typingsSlinky.steamClient.mod.EMsg.ClientMMSJoinLobbyResponse with Double = js.native
  
  @js.native
  sealed trait ClientMMSLeaveLobby extends EMsg
  /* 6605 */ val ClientMMSLeaveLobby: typingsSlinky.steamClient.mod.EMsg.ClientMMSLeaveLobby with Double = js.native
  
  @js.native
  sealed trait ClientMMSLeaveLobbyResponse extends EMsg
  /* 6606 */ val ClientMMSLeaveLobbyResponse: typingsSlinky.steamClient.mod.EMsg.ClientMMSLeaveLobbyResponse with Double = js.native
  
  @js.native
  sealed trait ClientMMSLobbyChatMsg extends EMsg
  /* 6614 */ val ClientMMSLobbyChatMsg: typingsSlinky.steamClient.mod.EMsg.ClientMMSLobbyChatMsg with Double = js.native
  
  @js.native
  sealed trait ClientMMSLobbyData extends EMsg
  /* 6612 */ val ClientMMSLobbyData: typingsSlinky.steamClient.mod.EMsg.ClientMMSLobbyData with Double = js.native
  
  @js.native
  sealed trait ClientMMSLobbyGameServerSet extends EMsg
  /* 6618 */ val ClientMMSLobbyGameServerSet: typingsSlinky.steamClient.mod.EMsg.ClientMMSLobbyGameServerSet with Double = js.native
  
  @js.native
  sealed trait ClientMMSSendLobbyChatMsg extends EMsg
  /* 6613 */ val ClientMMSSendLobbyChatMsg: typingsSlinky.steamClient.mod.EMsg.ClientMMSSendLobbyChatMsg with Double = js.native
  
  @js.native
  sealed trait ClientMMSSetLobbyData extends EMsg
  /* 6609 */ val ClientMMSSetLobbyData: typingsSlinky.steamClient.mod.EMsg.ClientMMSSetLobbyData with Double = js.native
  
  @js.native
  sealed trait ClientMMSSetLobbyDataResponse extends EMsg
  /* 6610 */ val ClientMMSSetLobbyDataResponse: typingsSlinky.steamClient.mod.EMsg.ClientMMSSetLobbyDataResponse with Double = js.native
  
  @js.native
  sealed trait ClientMMSSetLobbyGameServer extends EMsg
  /* 6617 */ val ClientMMSSetLobbyGameServer: typingsSlinky.steamClient.mod.EMsg.ClientMMSSetLobbyGameServer with Double = js.native
  
  @js.native
  sealed trait ClientMMSSetLobbyLinked extends EMsg
  /* 6624 */ val ClientMMSSetLobbyLinked: typingsSlinky.steamClient.mod.EMsg.ClientMMSSetLobbyLinked with Double = js.native
  
  @js.native
  sealed trait ClientMMSSetLobbyOwner extends EMsg
  /* 6615 */ val ClientMMSSetLobbyOwner: typingsSlinky.steamClient.mod.EMsg.ClientMMSSetLobbyOwner with Double = js.native
  
  @js.native
  sealed trait ClientMMSSetLobbyOwnerResponse extends EMsg
  /* 6616 */ val ClientMMSSetLobbyOwnerResponse: typingsSlinky.steamClient.mod.EMsg.ClientMMSSetLobbyOwnerResponse with Double = js.native
  
  @js.native
  sealed trait ClientMMSUserJoinedLobby extends EMsg
  /* 6619 */ val ClientMMSUserJoinedLobby: typingsSlinky.steamClient.mod.EMsg.ClientMMSUserJoinedLobby with Double = js.native
  
  @js.native
  sealed trait ClientMMSUserLeftLobby extends EMsg
  /* 6620 */ val ClientMMSUserLeftLobby: typingsSlinky.steamClient.mod.EMsg.ClientMMSUserLeftLobby with Double = js.native
  
  @js.native
  sealed trait ClientMarketingMessageUpdate extends EMsg
  /* 5420 */ val ClientMarketingMessageUpdate: typingsSlinky.steamClient.mod.EMsg.ClientMarketingMessageUpdate with Double = js.native
  
  @js.native
  sealed trait ClientMarketingMessageUpdate2 extends EMsg
  /* 5510 */ val ClientMarketingMessageUpdate2: typingsSlinky.steamClient.mod.EMsg.ClientMarketingMessageUpdate2 with Double = js.native
  
  @js.native
  sealed trait ClientMicroTxnAuthRequest extends EMsg
  /* 5504 */ val ClientMicroTxnAuthRequest: typingsSlinky.steamClient.mod.EMsg.ClientMicroTxnAuthRequest with Double = js.native
  
  @js.native
  sealed trait ClientMicroTxnAuthorize extends EMsg
  /* 5505 */ val ClientMicroTxnAuthorize: typingsSlinky.steamClient.mod.EMsg.ClientMicroTxnAuthorize with Double = js.native
  
  @js.native
  sealed trait ClientMicroTxnAuthorizeResponse extends EMsg
  /* 5506 */ val ClientMicroTxnAuthorizeResponse: typingsSlinky.steamClient.mod.EMsg.ClientMicroTxnAuthorizeResponse with Double = js.native
  
  @js.native
  sealed trait ClientNOP extends EMsg
  /* 765 */ val ClientNOP: typingsSlinky.steamClient.mod.EMsg.ClientNOP with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientNatTraversalStatEvent extends EMsg
  /* 839 */ val ClientNatTraversalStatEvent: typingsSlinky.steamClient.mod.EMsg.ClientNatTraversalStatEvent with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientNewLoginKey extends EMsg
  /* 5463 */ val ClientNewLoginKey: typingsSlinky.steamClient.mod.EMsg.ClientNewLoginKey with Double = js.native
  
  @js.native
  sealed trait ClientNewLoginKeyAccepted extends EMsg
  /* 5464 */ val ClientNewLoginKeyAccepted: typingsSlinky.steamClient.mod.EMsg.ClientNewLoginKeyAccepted with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientNewsUpdate extends EMsg
  /* 771 */ val ClientNewsUpdate: typingsSlinky.steamClient.mod.EMsg.ClientNewsUpdate with Double = js.native
  
  @js.native
  sealed trait ClientNoUDPConnectivity extends EMsg
  /* 707 */ val ClientNoUDPConnectivity: typingsSlinky.steamClient.mod.EMsg.ClientNoUDPConnectivity with Double = js.native
  
  @js.native
  sealed trait ClientNotLoggedOnDeprecated extends EMsg
  /* 756 */ val ClientNotLoggedOnDeprecated: typingsSlinky.steamClient.mod.EMsg.ClientNotLoggedOnDeprecated with Double = js.native
  
  @js.native
  sealed trait ClientOGSBeginSession extends EMsg
  /* 5490 */ val ClientOGSBeginSession: typingsSlinky.steamClient.mod.EMsg.ClientOGSBeginSession with Double = js.native
  
  @js.native
  sealed trait ClientOGSBeginSessionResponse extends EMsg
  /* 5491 */ val ClientOGSBeginSessionResponse: typingsSlinky.steamClient.mod.EMsg.ClientOGSBeginSessionResponse with Double = js.native
  
  @js.native
  sealed trait ClientOGSEndSession extends EMsg
  /* 5492 */ val ClientOGSEndSession: typingsSlinky.steamClient.mod.EMsg.ClientOGSEndSession with Double = js.native
  
  @js.native
  sealed trait ClientOGSEndSessionResponse extends EMsg
  /* 5493 */ val ClientOGSEndSessionResponse: typingsSlinky.steamClient.mod.EMsg.ClientOGSEndSessionResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientOGSGameServerPingSample extends EMsg
  /* 5581 */ val ClientOGSGameServerPingSample: typingsSlinky.steamClient.mod.EMsg.ClientOGSGameServerPingSample with Double = js.native
  
  @js.native
  sealed trait ClientOGSReportBug extends EMsg
  /* 5557 */ val ClientOGSReportBug: typingsSlinky.steamClient.mod.EMsg.ClientOGSReportBug with Double = js.native
  
  @js.native
  sealed trait ClientOGSReportString extends EMsg
  /* 5556 */ val ClientOGSReportString: typingsSlinky.steamClient.mod.EMsg.ClientOGSReportString with Double = js.native
  
  @js.native
  sealed trait ClientOGSWriteRow extends EMsg
  /* 5494 */ val ClientOGSWriteRow: typingsSlinky.steamClient.mod.EMsg.ClientOGSWriteRow with Double = js.native
  
  @js.native
  sealed trait ClientP2PConnectionFailInfo extends EMsg
  /* 5435 */ val ClientP2PConnectionFailInfo: typingsSlinky.steamClient.mod.EMsg.ClientP2PConnectionFailInfo with Double = js.native
  
  @js.native
  sealed trait ClientP2PConnectionInfo extends EMsg
  /* 5434 */ val ClientP2PConnectionInfo: typingsSlinky.steamClient.mod.EMsg.ClientP2PConnectionInfo with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientP2PIntroducerMessage extends EMsg
  /* 813 */ val ClientP2PIntroducerMessage: typingsSlinky.steamClient.mod.EMsg.ClientP2PIntroducerMessage with Double = js.native
  
  @js.native
  sealed trait ClientPICSAccessTokenRequest extends EMsg
  /* 8905 */ val ClientPICSAccessTokenRequest: typingsSlinky.steamClient.mod.EMsg.ClientPICSAccessTokenRequest with Double = js.native
  
  @js.native
  sealed trait ClientPICSAccessTokenResponse extends EMsg
  /* 8906 */ val ClientPICSAccessTokenResponse: typingsSlinky.steamClient.mod.EMsg.ClientPICSAccessTokenResponse with Double = js.native
  
  @js.native
  sealed trait ClientPICSChangesSinceRequest extends EMsg
  /* 8901 */ val ClientPICSChangesSinceRequest: typingsSlinky.steamClient.mod.EMsg.ClientPICSChangesSinceRequest with Double = js.native
  
  @js.native
  sealed trait ClientPICSChangesSinceResponse extends EMsg
  /* 8902 */ val ClientPICSChangesSinceResponse: typingsSlinky.steamClient.mod.EMsg.ClientPICSChangesSinceResponse with Double = js.native
  
  @js.native
  sealed trait ClientPICSProductInfoRequest extends EMsg
  /* 8903 */ val ClientPICSProductInfoRequest: typingsSlinky.steamClient.mod.EMsg.ClientPICSProductInfoRequest with Double = js.native
  
  @js.native
  sealed trait ClientPICSProductInfoResponse extends EMsg
  /* 8904 */ val ClientPICSProductInfoResponse: typingsSlinky.steamClient.mod.EMsg.ClientPICSProductInfoResponse with Double = js.native
  
  @js.native
  sealed trait ClientPackageInfoRequest extends EMsg
  /* 833 */ val ClientPackageInfoRequest: typingsSlinky.steamClient.mod.EMsg.ClientPackageInfoRequest with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientPackageInfoResponse extends EMsg
  /* 834 */ val ClientPackageInfoResponse: typingsSlinky.steamClient.mod.EMsg.ClientPackageInfoResponse with Double = js.native
  
  @js.native
  sealed trait ClientPackageVersions extends EMsg
  /* 148 */ val ClientPackageVersions: typingsSlinky.steamClient.mod.EMsg.ClientPackageVersions with Double = js.native
  
  @js.native
  sealed trait ClientPasswordChange3 extends EMsg
  /* 5457 */ val ClientPasswordChange3: typingsSlinky.steamClient.mod.EMsg.ClientPasswordChange3 with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientPasswordChangeResponse extends EMsg
  /* 805 */ val ClientPasswordChangeResponse: typingsSlinky.steamClient.mod.EMsg.ClientPasswordChangeResponse with Double = js.native
  
  @js.native
  sealed trait ClientPersonaChangeResponse extends EMsg
  /* 5584 */ val ClientPersonaChangeResponse: typingsSlinky.steamClient.mod.EMsg.ClientPersonaChangeResponse with Double = js.native
  
  @js.native
  sealed trait ClientPersonaState extends EMsg
  /* 766 */ val ClientPersonaState: typingsSlinky.steamClient.mod.EMsg.ClientPersonaState with Double = js.native
  
  @js.native
  sealed trait ClientPersonalQAChange3 extends EMsg
  /* 5459 */ val ClientPersonalQAChange3: typingsSlinky.steamClient.mod.EMsg.ClientPersonalQAChange3 with Double = js.native
  
  @js.native
  sealed trait ClientPing extends EMsg
  /* 764 */ val ClientPing: typingsSlinky.steamClient.mod.EMsg.ClientPing with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientPingResponse extends EMsg
  /* 712 */ val ClientPingResponse: typingsSlinky.steamClient.mod.EMsg.ClientPingResponse with Double = js.native
  
  @js.native
  sealed trait ClientPlayerNicknameList extends EMsg
  /* 5587 */ val ClientPlayerNicknameList: typingsSlinky.steamClient.mod.EMsg.ClientPlayerNicknameList with Double = js.native
  
  @js.native
  sealed trait ClientPlayingSessionState extends EMsg
  /* 9600 */ val ClientPlayingSessionState: typingsSlinky.steamClient.mod.EMsg.ClientPlayingSessionState with Double = js.native
  
  @js.native
  sealed trait ClientPurchaseResponse extends EMsg
  /* 763 */ val ClientPurchaseResponse: typingsSlinky.steamClient.mod.EMsg.ClientPurchaseResponse with Double = js.native
  
  @js.native
  sealed trait ClientPurchaseWithMachineID extends EMsg
  /* 746 */ val ClientPurchaseWithMachineID: typingsSlinky.steamClient.mod.EMsg.ClientPurchaseWithMachineID with Double = js.native
  
  @js.native
  sealed trait ClientReadMachineAuth extends EMsg
  /* 5539 */ val ClientReadMachineAuth: typingsSlinky.steamClient.mod.EMsg.ClientReadMachineAuth with Double = js.native
  
  @js.native
  sealed trait ClientReadMachineAuthResponse extends EMsg
  /* 5540 */ val ClientReadMachineAuthResponse: typingsSlinky.steamClient.mod.EMsg.ClientReadMachineAuthResponse with Double = js.native
  
  @js.native
  sealed trait ClientRedeemGuestPass extends EMsg
  /* 741 */ val ClientRedeemGuestPass: typingsSlinky.steamClient.mod.EMsg.ClientRedeemGuestPass with Double = js.native
  
  @js.native
  sealed trait ClientRedeemGuestPassResponse extends EMsg
  /* 797 */ val ClientRedeemGuestPassResponse: typingsSlinky.steamClient.mod.EMsg.ClientRedeemGuestPassResponse with Double = js.native
  
  @js.native
  sealed trait ClientRegisterAuthTicketWithCM extends EMsg
  /* 5502 */ val ClientRegisterAuthTicketWithCM: typingsSlinky.steamClient.mod.EMsg.ClientRegisterAuthTicketWithCM with Double = js.native
  
  @js.native
  sealed trait ClientRegisterKey extends EMsg
  /* 743 */ val ClientRegisterKey: typingsSlinky.steamClient.mod.EMsg.ClientRegisterKey with Double = js.native
  
  @js.native
  sealed trait ClientRegisterOEMMachine extends EMsg
  /* 5469 */ val ClientRegisterOEMMachine: typingsSlinky.steamClient.mod.EMsg.ClientRegisterOEMMachine with Double = js.native
  
  @js.native
  sealed trait ClientRegisterOEMMachineResponse extends EMsg
  /* 5470 */ val ClientRegisterOEMMachineResponse: typingsSlinky.steamClient.mod.EMsg.ClientRegisterOEMMachineResponse with Double = js.native
  
  @js.native
  sealed trait ClientRemoveFriend extends EMsg
  /* 714 */ val ClientRemoveFriend: typingsSlinky.steamClient.mod.EMsg.ClientRemoveFriend with Double = js.native
  
  @js.native
  sealed trait ClientReportOverlayDetourFailure extends EMsg
  /* 5517 */ val ClientReportOverlayDetourFailure: typingsSlinky.steamClient.mod.EMsg.ClientReportOverlayDetourFailure with Double = js.native
  
  @js.native
  sealed trait ClientRequestAccountData extends EMsg
  /* 5549 */ val ClientRequestAccountData: typingsSlinky.steamClient.mod.EMsg.ClientRequestAccountData with Double = js.native
  
  @js.native
  sealed trait ClientRequestAccountDataResponse extends EMsg
  /* 5550 */ val ClientRequestAccountDataResponse: typingsSlinky.steamClient.mod.EMsg.ClientRequestAccountDataResponse with Double = js.native
  
  @js.native
  sealed trait ClientRequestAuthList extends EMsg
  /* 5431 */ val ClientRequestAuthList: typingsSlinky.steamClient.mod.EMsg.ClientRequestAuthList with Double = js.native
  
  @js.native
  sealed trait ClientRequestChangeMail extends EMsg
  /* 5454 */ val ClientRequestChangeMail: typingsSlinky.steamClient.mod.EMsg.ClientRequestChangeMail with Double = js.native
  
  @js.native
  sealed trait ClientRequestChangeMailResponse extends EMsg
  /* 5455 */ val ClientRequestChangeMailResponse: typingsSlinky.steamClient.mod.EMsg.ClientRequestChangeMailResponse with Double = js.native
  
  @js.native
  sealed trait ClientRequestCommentNotifications extends EMsg
  /* 5583 */ val ClientRequestCommentNotifications: typingsSlinky.steamClient.mod.EMsg.ClientRequestCommentNotifications with Double = js.native
  
  @js.native
  sealed trait ClientRequestEncryptedAppTicket extends EMsg
  /* 5526 */ val ClientRequestEncryptedAppTicket: typingsSlinky.steamClient.mod.EMsg.ClientRequestEncryptedAppTicket with Double = js.native
  
  @js.native
  sealed trait ClientRequestEncryptedAppTicketResponse extends EMsg
  /* 5527 */ val ClientRequestEncryptedAppTicketResponse: typingsSlinky.steamClient.mod.EMsg.ClientRequestEncryptedAppTicketResponse with Double = js.native
  
  @js.native
  sealed trait ClientRequestForgottenPasswordEmail extends EMsg
  /* 5401 */ val ClientRequestForgottenPasswordEmail: typingsSlinky.steamClient.mod.EMsg.ClientRequestForgottenPasswordEmail with Double = js.native
  
  @js.native
  sealed trait ClientRequestForgottenPasswordEmail3 extends EMsg
  /* 5461 */ val ClientRequestForgottenPasswordEmail3: typingsSlinky.steamClient.mod.EMsg.ClientRequestForgottenPasswordEmail3 with Double = js.native
  
  @js.native
  sealed trait ClientRequestForgottenPasswordEmailResponse extends EMsg
  /* 5402 */ val ClientRequestForgottenPasswordEmailResponse: typingsSlinky.steamClient.mod.EMsg.ClientRequestForgottenPasswordEmailResponse with Double = js.native
  
  @js.native
  sealed trait ClientRequestFreeLicense extends EMsg
  /* 5572 */ val ClientRequestFreeLicense: typingsSlinky.steamClient.mod.EMsg.ClientRequestFreeLicense with Double = js.native
  
  @js.native
  sealed trait ClientRequestFreeLicenseResponse extends EMsg
  /* 5573 */ val ClientRequestFreeLicenseResponse: typingsSlinky.steamClient.mod.EMsg.ClientRequestFreeLicenseResponse with Double = js.native
  
  @js.native
  sealed trait ClientRequestFriendData extends EMsg
  /* 815 */ val ClientRequestFriendData: typingsSlinky.steamClient.mod.EMsg.ClientRequestFriendData with Double = js.native
  
  @js.native
  sealed trait ClientRequestFriendship extends EMsg
  /* 554 */ val ClientRequestFriendship: typingsSlinky.steamClient.mod.EMsg.ClientRequestFriendship with Double = js.native
  
  @js.native
  sealed trait ClientRequestItemAnnouncements extends EMsg
  /* 5577 */ val ClientRequestItemAnnouncements: typingsSlinky.steamClient.mod.EMsg.ClientRequestItemAnnouncements with Double = js.native
  
  @js.native
  sealed trait ClientRequestMachineAuth extends EMsg
  /* 5541 */ val ClientRequestMachineAuth: typingsSlinky.steamClient.mod.EMsg.ClientRequestMachineAuth with Double = js.native
  
  @js.native
  sealed trait ClientRequestMachineAuthResponse extends EMsg
  /* 5542 */ val ClientRequestMachineAuthResponse: typingsSlinky.steamClient.mod.EMsg.ClientRequestMachineAuthResponse with Double = js.native
  
  @js.native
  sealed trait ClientRequestOAuthTokenForApp extends EMsg
  /* 5590 */ val ClientRequestOAuthTokenForApp: typingsSlinky.steamClient.mod.EMsg.ClientRequestOAuthTokenForApp with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientRequestOAuthTokenForAppResponse extends EMsg
  /* 5591 */ val ClientRequestOAuthTokenForAppResponse: typingsSlinky.steamClient.mod.EMsg.ClientRequestOAuthTokenForAppResponse with Double = js.native
  
  @js.native
  sealed trait ClientRequestValidationMail extends EMsg
  /* 5448 */ val ClientRequestValidationMail: typingsSlinky.steamClient.mod.EMsg.ClientRequestValidationMail with Double = js.native
  
  @js.native
  sealed trait ClientRequestValidationMailResponse extends EMsg
  /* 5449 */ val ClientRequestValidationMailResponse: typingsSlinky.steamClient.mod.EMsg.ClientRequestValidationMailResponse with Double = js.native
  
  @js.native
  sealed trait ClientRequestWebAPIAuthenticateUserNonce extends EMsg
  /* 5585 */ val ClientRequestWebAPIAuthenticateUserNonce: typingsSlinky.steamClient.mod.EMsg.ClientRequestWebAPIAuthenticateUserNonce with Double = js.native
  
  @js.native
  sealed trait ClientRequestWebAPIAuthenticateUserNonceResponse extends EMsg
  /* 5586 */ val ClientRequestWebAPIAuthenticateUserNonceResponse: typingsSlinky.steamClient.mod.EMsg.ClientRequestWebAPIAuthenticateUserNonceResponse with Double = js.native
  
  @js.native
  sealed trait ClientRequestedClientStats extends EMsg
  /* 5480 */ val ClientRequestedClientStats: typingsSlinky.steamClient.mod.EMsg.ClientRequestedClientStats with Double = js.native
  
  @js.native
  sealed trait ClientResetForgottenPassword extends EMsg
  /* 5404 */ val ClientResetForgottenPassword: typingsSlinky.steamClient.mod.EMsg.ClientResetForgottenPassword with Double = js.native
  
  @js.native
  sealed trait ClientResetForgottenPassword3 extends EMsg
  /* 5460 */ val ClientResetForgottenPassword3: typingsSlinky.steamClient.mod.EMsg.ClientResetForgottenPassword3 with Double = js.native
  
  @js.native
  sealed trait ClientResetForgottenPassword4 extends EMsg
  /* 5551 */ val ClientResetForgottenPassword4: typingsSlinky.steamClient.mod.EMsg.ClientResetForgottenPassword4 with Double = js.native
  
  @js.native
  sealed trait ClientResetForgottenPasswordResponse extends EMsg
  /* 5405 */ val ClientResetForgottenPasswordResponse: typingsSlinky.steamClient.mod.EMsg.ClientResetForgottenPasswordResponse with Double = js.native
  
  @js.native
  sealed trait ClientResetPassword extends EMsg
  /* 846 */ val ClientResetPassword: typingsSlinky.steamClient.mod.EMsg.ClientResetPassword with Double = js.native
  
  @js.native
  sealed trait ClientResetPasswordResponse extends EMsg
  /* 849 */ val ClientResetPasswordResponse: typingsSlinky.steamClient.mod.EMsg.ClientResetPasswordResponse with Double = js.native
  
  @js.native
  sealed trait ClientRichPresenceInfo extends EMsg
  /* 7503 */ val ClientRichPresenceInfo: typingsSlinky.steamClient.mod.EMsg.ClientRichPresenceInfo with Double = js.native
  
  @js.native
  sealed trait ClientRichPresenceRequest extends EMsg
  /* 7502 */ val ClientRichPresenceRequest: typingsSlinky.steamClient.mod.EMsg.ClientRichPresenceRequest with Double = js.native
  
  @js.native
  sealed trait ClientRichPresenceUpload extends EMsg
  /* 7501 */ val ClientRichPresenceUpload: typingsSlinky.steamClient.mod.EMsg.ClientRichPresenceUpload with Double = js.native
  
  @js.native
  sealed trait ClientScreenshotsChanged extends EMsg
  /* 5543 */ val ClientScreenshotsChanged: typingsSlinky.steamClient.mod.EMsg.ClientScreenshotsChanged with Double = js.native
  
  @js.native
  sealed trait ClientSecretQAChangeResponse extends EMsg
  /* 892 */ val ClientSecretQAChangeResponse: typingsSlinky.steamClient.mod.EMsg.ClientSecretQAChangeResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientSendGuestPass extends EMsg
  /* 739 */ val ClientSendGuestPass: typingsSlinky.steamClient.mod.EMsg.ClientSendGuestPass with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientSendGuestPassResponse extends EMsg
  /* 795 */ val ClientSendGuestPassResponse: typingsSlinky.steamClient.mod.EMsg.ClientSendGuestPassResponse with Double = js.native
  
  @js.native
  sealed trait ClientSentLogs extends EMsg
  /* 5558 */ val ClientSentLogs: typingsSlinky.steamClient.mod.EMsg.ClientSentLogs with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientServerList extends EMsg
  /* 880 */ val ClientServerList: typingsSlinky.steamClient.mod.EMsg.ClientServerList with Double = js.native
  
  @js.native
  sealed trait ClientServerUnavailable extends EMsg
  /* 5500 */ val ClientServerUnavailable: typingsSlinky.steamClient.mod.EMsg.ClientServerUnavailable with Double = js.native
  
  @js.native
  sealed trait ClientServersAvailable extends EMsg
  /* 5501 */ val ClientServersAvailable: typingsSlinky.steamClient.mod.EMsg.ClientServersAvailable with Double = js.native
  
  @js.native
  sealed trait ClientServiceCall extends EMsg
  /* 831 */ val ClientServiceCall: typingsSlinky.steamClient.mod.EMsg.ClientServiceCall with Double = js.native
  
  @js.native
  sealed trait ClientServiceCallResponse extends EMsg
  /* 832 */ val ClientServiceCallResponse: typingsSlinky.steamClient.mod.EMsg.ClientServiceCallResponse with Double = js.native
  
  @js.native
  sealed trait ClientServiceMethod extends EMsg
  /* 5594 */ val ClientServiceMethod: typingsSlinky.steamClient.mod.EMsg.ClientServiceMethod with Double = js.native
  
  @js.native
  sealed trait ClientServiceMethodResponse extends EMsg
  /* 5595 */ val ClientServiceMethodResponse: typingsSlinky.steamClient.mod.EMsg.ClientServiceMethodResponse with Double = js.native
  
  @js.native
  sealed trait ClientServiceModule extends EMsg
  /* 830 */ val ClientServiceModule: typingsSlinky.steamClient.mod.EMsg.ClientServiceModule with Double = js.native
  
  @js.native
  sealed trait ClientSessionEnd extends EMsg
  /* 136 */ val ClientSessionEnd: typingsSlinky.steamClient.mod.EMsg.ClientSessionEnd with Double = js.native
  
  @js.native
  sealed trait ClientSessionStart extends EMsg
  /* 135 */ val ClientSessionStart: typingsSlinky.steamClient.mod.EMsg.ClientSessionStart with Double = js.native
  
  @js.native
  sealed trait ClientSessionToken extends EMsg
  /* 850 */ val ClientSessionToken: typingsSlinky.steamClient.mod.EMsg.ClientSessionToken with Double = js.native
  
  // obsolete "renamed to ClientSessionUpdate"
  @js.native
  sealed trait ClientSessionUpdate extends EMsg
  /* 137 */ val ClientSessionUpdate: typingsSlinky.steamClient.mod.EMsg.ClientSessionUpdate with Double = js.native
  
  @js.native
  sealed trait ClientSessionUpdateAuthTicket extends EMsg
  /* 137 */ val ClientSessionUpdateAuthTicket: typingsSlinky.steamClient.mod.EMsg.ClientSessionUpdateAuthTicket with Double = js.native
  
  @js.native
  sealed trait ClientSetClientAppUpdateState extends EMsg
  /* 5524 */ val ClientSetClientAppUpdateState: typingsSlinky.steamClient.mod.EMsg.ClientSetClientAppUpdateState with Double = js.native
  
  @js.native
  sealed trait ClientSetClientAppUpdateStateResponse extends EMsg
  /* 5525 */ val ClientSetClientAppUpdateStateResponse: typingsSlinky.steamClient.mod.EMsg.ClientSetClientAppUpdateStateResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientSetHeartbeatRate extends EMsg
  /* 755 */ val ClientSetHeartbeatRate: typingsSlinky.steamClient.mod.EMsg.ClientSetHeartbeatRate with Double = js.native
  
  @js.native
  sealed trait ClientSetIgnoreFriend extends EMsg
  /* 855 */ val ClientSetIgnoreFriend: typingsSlinky.steamClient.mod.EMsg.ClientSetIgnoreFriend with Double = js.native
  
  @js.native
  sealed trait ClientSetIgnoreFriendResponse extends EMsg
  /* 856 */ val ClientSetIgnoreFriendResponse: typingsSlinky.steamClient.mod.EMsg.ClientSetIgnoreFriendResponse with Double = js.native
  
  @js.native
  sealed trait ClientSharedLibraryBase extends EMsg
  /* 9400 */ val ClientSharedLibraryBase: typingsSlinky.steamClient.mod.EMsg.ClientSharedLibraryBase with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientSharedLibraryLockStatus extends EMsg
  /* 9405 */ val ClientSharedLibraryLockStatus: typingsSlinky.steamClient.mod.EMsg.ClientSharedLibraryLockStatus with Double = js.native
  
  @js.native
  sealed trait ClientSharedLibraryStopPlaying extends EMsg
  /* 9406 */ val ClientSharedLibraryStopPlaying: typingsSlinky.steamClient.mod.EMsg.ClientSharedLibraryStopPlaying with Double = js.native
  
  @js.native
  sealed trait ClientSharedLicensesLockStatus extends EMsg
  /* 9403 */ val ClientSharedLicensesLockStatus: typingsSlinky.steamClient.mod.EMsg.ClientSharedLicensesLockStatus with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientSharedLicensesStopPlaying extends EMsg
  /* 9404 */ val ClientSharedLicensesStopPlaying: typingsSlinky.steamClient.mod.EMsg.ClientSharedLicensesStopPlaying with Double = js.native
  
  @js.native
  sealed trait ClientStat extends EMsg
  /* 5433 */ val ClientStat: typingsSlinky.steamClient.mod.EMsg.ClientStat with Double = js.native
  
  @js.native
  sealed trait ClientStat2 extends EMsg
  /* 5482 */ val ClientStat2: typingsSlinky.steamClient.mod.EMsg.ClientStat2 with Double = js.native
  
  @js.native
  sealed trait ClientStat2Int32 extends EMsg
  /* 5481 */ val ClientStat2Int32: typingsSlinky.steamClient.mod.EMsg.ClientStat2Int32 with Double = js.native
  
  @js.native
  sealed trait ClientStatsUpdated extends EMsg
  /* 5467 */ val ClientStatsUpdated: typingsSlinky.steamClient.mod.EMsg.ClientStatsUpdated with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientSteamUsageEvent extends EMsg
  /* 842 */ val ClientSteamUsageEvent: typingsSlinky.steamClient.mod.EMsg.ClientSteamUsageEvent with Double = js.native
  
  @js.native
  sealed trait ClientStoreUserStats extends EMsg
  /* 820 */ val ClientStoreUserStats: typingsSlinky.steamClient.mod.EMsg.ClientStoreUserStats with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientStoreUserStats2 extends EMsg
  /* 5466 */ val ClientStoreUserStats2: typingsSlinky.steamClient.mod.EMsg.ClientStoreUserStats2 with Double = js.native
  
  @js.native
  sealed trait ClientStoreUserStatsResponse extends EMsg
  /* 821 */ val ClientStoreUserStatsResponse: typingsSlinky.steamClient.mod.EMsg.ClientStoreUserStatsResponse with Double = js.native
  
  @js.native
  sealed trait ClientSubscribeToPersonaFeed extends EMsg
  /* 5512 */ val ClientSubscribeToPersonaFeed: typingsSlinky.steamClient.mod.EMsg.ClientSubscribeToPersonaFeed with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientSystemIM extends EMsg
  /* 726 */ val ClientSystemIM: typingsSlinky.steamClient.mod.EMsg.ClientSystemIM with Double = js.native
  
  @js.native
  sealed trait ClientSystemIMAck extends EMsg
  /* 727 */ val ClientSystemIMAck: typingsSlinky.steamClient.mod.EMsg.ClientSystemIMAck with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientTicketAuthComplete extends EMsg
  /* 5429 */ val ClientTicketAuthComplete: typingsSlinky.steamClient.mod.EMsg.ClientTicketAuthComplete with Double = js.native
  
  @js.native
  sealed trait ClientToGC extends EMsg
  /* 5452 */ val ClientToGC: typingsSlinky.steamClient.mod.EMsg.ClientToGC with Double = js.native
  
  @js.native
  sealed trait ClientUCMAddScreenshot extends EMsg
  /* 7301 */ val ClientUCMAddScreenshot: typingsSlinky.steamClient.mod.EMsg.ClientUCMAddScreenshot with Double = js.native
  
  @js.native
  sealed trait ClientUCMAddScreenshotResponse extends EMsg
  /* 7302 */ val ClientUCMAddScreenshotResponse: typingsSlinky.steamClient.mod.EMsg.ClientUCMAddScreenshotResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientUCMDeletePublishedFile extends EMsg
  /* 7315 */ val ClientUCMDeletePublishedFile: typingsSlinky.steamClient.mod.EMsg.ClientUCMDeletePublishedFile with Double = js.native
  
  @js.native
  sealed trait ClientUCMDeletePublishedFileResponse extends EMsg
  /* 7316 */ val ClientUCMDeletePublishedFileResponse: typingsSlinky.steamClient.mod.EMsg.ClientUCMDeletePublishedFileResponse with Double = js.native
  
  @js.native
  sealed trait ClientUCMDeleteScreenshot extends EMsg
  /* 7309 */ val ClientUCMDeleteScreenshot: typingsSlinky.steamClient.mod.EMsg.ClientUCMDeleteScreenshot with Double = js.native
  
  @js.native
  sealed trait ClientUCMDeleteScreenshotResponse extends EMsg
  /* 7310 */ val ClientUCMDeleteScreenshotResponse: typingsSlinky.steamClient.mod.EMsg.ClientUCMDeleteScreenshotResponse with Double = js.native
  
  @js.native
  sealed trait ClientUCMEnumeratePublishedFilesByUserAction extends EMsg
  /* 7366 */ val ClientUCMEnumeratePublishedFilesByUserAction: typingsSlinky.steamClient.mod.EMsg.ClientUCMEnumeratePublishedFilesByUserAction with Double = js.native
  
  @js.native
  sealed trait ClientUCMEnumeratePublishedFilesByUserActionResponse extends EMsg
  /* 7367 */ val ClientUCMEnumeratePublishedFilesByUserActionResponse: typingsSlinky.steamClient.mod.EMsg.ClientUCMEnumeratePublishedFilesByUserActionResponse with Double = js.native
  
  @js.native
  sealed trait ClientUCMEnumerateUserPublishedFiles extends EMsg
  /* 7317 */ val ClientUCMEnumerateUserPublishedFiles: typingsSlinky.steamClient.mod.EMsg.ClientUCMEnumerateUserPublishedFiles with Double = js.native
  
  @js.native
  sealed trait ClientUCMEnumerateUserPublishedFilesResponse extends EMsg
  /* 7318 */ val ClientUCMEnumerateUserPublishedFilesResponse: typingsSlinky.steamClient.mod.EMsg.ClientUCMEnumerateUserPublishedFilesResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFiles extends EMsg
  /* 7321 */ val ClientUCMEnumerateUserSubscribedFiles: typingsSlinky.steamClient.mod.EMsg.ClientUCMEnumerateUserSubscribedFiles with Double = js.native
  
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFilesResponse extends EMsg
  /* 7322 */ val ClientUCMEnumerateUserSubscribedFilesResponse: typingsSlinky.steamClient.mod.EMsg.ClientUCMEnumerateUserSubscribedFilesResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFilesWithUpdates extends EMsg
  /* 7378 */ val ClientUCMEnumerateUserSubscribedFilesWithUpdates: typingsSlinky.steamClient.mod.EMsg.ClientUCMEnumerateUserSubscribedFilesWithUpdates with Double = js.native
  
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFilesWithUpdatesResponse extends EMsg
  /* 7379 */ val ClientUCMEnumerateUserSubscribedFilesWithUpdatesResponse: typingsSlinky.steamClient.mod.EMsg.ClientUCMEnumerateUserSubscribedFilesWithUpdatesResponse with Double = js.native
  
  @js.native
  sealed trait ClientUCMGetPublishedFileDetails extends EMsg
  /* 7313 */ val ClientUCMGetPublishedFileDetails: typingsSlinky.steamClient.mod.EMsg.ClientUCMGetPublishedFileDetails with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientUCMGetPublishedFileDetailsResponse extends EMsg
  /* 7314 */ val ClientUCMGetPublishedFileDetailsResponse: typingsSlinky.steamClient.mod.EMsg.ClientUCMGetPublishedFileDetailsResponse with Double = js.native
  
  @js.native
  sealed trait ClientUCMGetPublishedFilesForUser extends EMsg
  /* 7360 */ val ClientUCMGetPublishedFilesForUser: typingsSlinky.steamClient.mod.EMsg.ClientUCMGetPublishedFilesForUser with Double = js.native
  
  @js.native
  sealed trait ClientUCMGetPublishedFilesForUserResponse extends EMsg
  /* 7361 */ val ClientUCMGetPublishedFilesForUserResponse: typingsSlinky.steamClient.mod.EMsg.ClientUCMGetPublishedFilesForUserResponse with Double = js.native
  
  @js.native
  sealed trait ClientUCMPublishFile extends EMsg
  /* 7311 */ val ClientUCMPublishFile: typingsSlinky.steamClient.mod.EMsg.ClientUCMPublishFile with Double = js.native
  
  @js.native
  sealed trait ClientUCMPublishFileResponse extends EMsg
  /* 7312 */ val ClientUCMPublishFileResponse: typingsSlinky.steamClient.mod.EMsg.ClientUCMPublishFileResponse with Double = js.native
  
  @js.native
  sealed trait ClientUCMPublishedFileDeleted extends EMsg
  /* 7368 */ val ClientUCMPublishedFileDeleted: typingsSlinky.steamClient.mod.EMsg.ClientUCMPublishedFileDeleted with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientUCMPublishedFileSubscribed extends EMsg
  /* 7347 */ val ClientUCMPublishedFileSubscribed: typingsSlinky.steamClient.mod.EMsg.ClientUCMPublishedFileSubscribed with Double = js.native
  
  @js.native
  sealed trait ClientUCMPublishedFileUnsubscribed extends EMsg
  /* 7348 */ val ClientUCMPublishedFileUnsubscribed: typingsSlinky.steamClient.mod.EMsg.ClientUCMPublishedFileUnsubscribed with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientUCMSetUserPublishedFileAction extends EMsg
  /* 7364 */ val ClientUCMSetUserPublishedFileAction: typingsSlinky.steamClient.mod.EMsg.ClientUCMSetUserPublishedFileAction with Double = js.native
  
  @js.native
  sealed trait ClientUCMSetUserPublishedFileActionResponse extends EMsg
  /* 7365 */ val ClientUCMSetUserPublishedFileActionResponse: typingsSlinky.steamClient.mod.EMsg.ClientUCMSetUserPublishedFileActionResponse with Double = js.native
  
  @js.native
  sealed trait ClientUCMSubscribePublishedFile extends EMsg
  /* 7319 */ val ClientUCMSubscribePublishedFile: typingsSlinky.steamClient.mod.EMsg.ClientUCMSubscribePublishedFile with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientUCMSubscribePublishedFileResponse extends EMsg
  /* 7320 */ val ClientUCMSubscribePublishedFileResponse: typingsSlinky.steamClient.mod.EMsg.ClientUCMSubscribePublishedFileResponse with Double = js.native
  
  @js.native
  sealed trait ClientUCMUnsubscribePublishedFile extends EMsg
  /* 7323 */ val ClientUCMUnsubscribePublishedFile: typingsSlinky.steamClient.mod.EMsg.ClientUCMUnsubscribePublishedFile with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientUCMUnsubscribePublishedFileResponse extends EMsg
  /* 7324 */ val ClientUCMUnsubscribePublishedFileResponse: typingsSlinky.steamClient.mod.EMsg.ClientUCMUnsubscribePublishedFileResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientUCMUpdatePublishedFile extends EMsg
  /* 7325 */ val ClientUCMUpdatePublishedFile: typingsSlinky.steamClient.mod.EMsg.ClientUCMUpdatePublishedFile with Double = js.native
  
  @js.native
  sealed trait ClientUCMUpdatePublishedFileResponse extends EMsg
  /* 7326 */ val ClientUCMUpdatePublishedFileResponse: typingsSlinky.steamClient.mod.EMsg.ClientUCMUpdatePublishedFileResponse with Double = js.native
  
  @js.native
  sealed trait ClientUDSInviteToGame extends EMsg
  /* 7005 */ val ClientUDSInviteToGame: typingsSlinky.steamClient.mod.EMsg.ClientUDSInviteToGame with Double = js.native
  
  @js.native
  sealed trait ClientUDSP2PSessionEnded extends EMsg
  /* 7002 */ val ClientUDSP2PSessionEnded: typingsSlinky.steamClient.mod.EMsg.ClientUDSP2PSessionEnded with Double = js.native
  
  @js.native
  sealed trait ClientUDSP2PSessionStarted extends EMsg
  /* 7001 */ val ClientUDSP2PSessionStarted: typingsSlinky.steamClient.mod.EMsg.ClientUDSP2PSessionStarted with Double = js.native
  
  @js.native
  sealed trait ClientUFSDeleteFileRequest extends EMsg
  /* 5219 */ val ClientUFSDeleteFileRequest: typingsSlinky.steamClient.mod.EMsg.ClientUFSDeleteFileRequest with Double = js.native
  
  @js.native
  sealed trait ClientUFSDeleteFileResponse extends EMsg
  /* 5220 */ val ClientUFSDeleteFileResponse: typingsSlinky.steamClient.mod.EMsg.ClientUFSDeleteFileResponse with Double = js.native
  
  @js.native
  sealed trait ClientUFSDownloadChunk extends EMsg
  /* 5212 */ val ClientUFSDownloadChunk: typingsSlinky.steamClient.mod.EMsg.ClientUFSDownloadChunk with Double = js.native
  
  @js.native
  sealed trait ClientUFSDownloadRequest extends EMsg
  /* 5210 */ val ClientUFSDownloadRequest: typingsSlinky.steamClient.mod.EMsg.ClientUFSDownloadRequest with Double = js.native
  
  @js.native
  sealed trait ClientUFSDownloadResponse extends EMsg
  /* 5211 */ val ClientUFSDownloadResponse: typingsSlinky.steamClient.mod.EMsg.ClientUFSDownloadResponse with Double = js.native
  
  @js.native
  sealed trait ClientUFSGetFileListForApp extends EMsg
  /* 5206 */ val ClientUFSGetFileListForApp: typingsSlinky.steamClient.mod.EMsg.ClientUFSGetFileListForApp with Double = js.native
  
  @js.native
  sealed trait ClientUFSGetFileListForAppResponse extends EMsg
  /* 5207 */ val ClientUFSGetFileListForAppResponse: typingsSlinky.steamClient.mod.EMsg.ClientUFSGetFileListForAppResponse with Double = js.native
  
  @js.native
  sealed trait ClientUFSGetSingleFileInfo extends EMsg
  /* 5230 */ val ClientUFSGetSingleFileInfo: typingsSlinky.steamClient.mod.EMsg.ClientUFSGetSingleFileInfo with Double = js.native
  
  @js.native
  sealed trait ClientUFSGetSingleFileInfoResponse extends EMsg
  /* 5231 */ val ClientUFSGetSingleFileInfoResponse: typingsSlinky.steamClient.mod.EMsg.ClientUFSGetSingleFileInfoResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientUFSGetUGCDetails extends EMsg
  /* 5226 */ val ClientUFSGetUGCDetails: typingsSlinky.steamClient.mod.EMsg.ClientUFSGetUGCDetails with Double = js.native
  
  @js.native
  sealed trait ClientUFSGetUGCDetailsResponse extends EMsg
  /* 5227 */ val ClientUFSGetUGCDetailsResponse: typingsSlinky.steamClient.mod.EMsg.ClientUFSGetUGCDetailsResponse with Double = js.native
  
  @js.native
  sealed trait ClientUFSLoginRequest extends EMsg
  /* 5213 */ val ClientUFSLoginRequest: typingsSlinky.steamClient.mod.EMsg.ClientUFSLoginRequest with Double = js.native
  
  @js.native
  sealed trait ClientUFSLoginResponse extends EMsg
  /* 5214 */ val ClientUFSLoginResponse: typingsSlinky.steamClient.mod.EMsg.ClientUFSLoginResponse with Double = js.native
  
  @js.native
  sealed trait ClientUFSShareFile extends EMsg
  /* 5232 */ val ClientUFSShareFile: typingsSlinky.steamClient.mod.EMsg.ClientUFSShareFile with Double = js.native
  
  @js.native
  sealed trait ClientUFSShareFileResponse extends EMsg
  /* 5233 */ val ClientUFSShareFileResponse: typingsSlinky.steamClient.mod.EMsg.ClientUFSShareFileResponse with Double = js.native
  
  @js.native
  sealed trait ClientUFSTransferHeartbeat extends EMsg
  /* 5216 */ val ClientUFSTransferHeartbeat: typingsSlinky.steamClient.mod.EMsg.ClientUFSTransferHeartbeat with Double = js.native
  
  @js.native
  sealed trait ClientUFSUploadFileChunk extends EMsg
  /* 5204 */ val ClientUFSUploadFileChunk: typingsSlinky.steamClient.mod.EMsg.ClientUFSUploadFileChunk with Double = js.native
  
  @js.native
  sealed trait ClientUFSUploadFileFinished extends EMsg
  /* 5205 */ val ClientUFSUploadFileFinished: typingsSlinky.steamClient.mod.EMsg.ClientUFSUploadFileFinished with Double = js.native
  
  @js.native
  sealed trait ClientUFSUploadFileRequest extends EMsg
  /* 5202 */ val ClientUFSUploadFileRequest: typingsSlinky.steamClient.mod.EMsg.ClientUFSUploadFileRequest with Double = js.native
  
  @js.native
  sealed trait ClientUFSUploadFileResponse extends EMsg
  /* 5203 */ val ClientUFSUploadFileResponse: typingsSlinky.steamClient.mod.EMsg.ClientUFSUploadFileResponse with Double = js.native
  
  @js.native
  sealed trait ClientUGSGetGlobalStats extends EMsg
  /* 7901 */ val ClientUGSGetGlobalStats: typingsSlinky.steamClient.mod.EMsg.ClientUGSGetGlobalStats with Double = js.native
  
  @js.native
  sealed trait ClientUGSGetGlobalStatsResponse extends EMsg
  /* 7902 */ val ClientUGSGetGlobalStatsResponse: typingsSlinky.steamClient.mod.EMsg.ClientUGSGetGlobalStatsResponse with Double = js.native
  
  @js.native
  sealed trait ClientUninstallClientApp extends EMsg
  /* 5522 */ val ClientUninstallClientApp: typingsSlinky.steamClient.mod.EMsg.ClientUninstallClientApp with Double = js.native
  
  @js.native
  sealed trait ClientUninstallClientAppResponse extends EMsg
  /* 5523 */ val ClientUninstallClientAppResponse: typingsSlinky.steamClient.mod.EMsg.ClientUninstallClientAppResponse with Double = js.native
  
  @js.native
  sealed trait ClientUnlockStreaming extends EMsg
  /* 9507 */ val ClientUnlockStreaming: typingsSlinky.steamClient.mod.EMsg.ClientUnlockStreaming with Double = js.native
  
  @js.native
  sealed trait ClientUnlockStreamingResponse extends EMsg
  /* 9508 */ val ClientUnlockStreamingResponse: typingsSlinky.steamClient.mod.EMsg.ClientUnlockStreamingResponse with Double = js.native
  
  @js.native
  sealed trait ClientUpdateChatMetadata extends EMsg
  /* 811 */ val ClientUpdateChatMetadata: typingsSlinky.steamClient.mod.EMsg.ClientUpdateChatMetadata with Double = js.native
  
  @js.native
  sealed trait ClientUpdateGuestPassesList extends EMsg
  /* 798 */ val ClientUpdateGuestPassesList: typingsSlinky.steamClient.mod.EMsg.ClientUpdateGuestPassesList with Double = js.native
  
  @js.native
  sealed trait ClientUpdateMachineAuth extends EMsg
  /* 5537 */ val ClientUpdateMachineAuth: typingsSlinky.steamClient.mod.EMsg.ClientUpdateMachineAuth with Double = js.native
  
  @js.native
  sealed trait ClientUpdateMachineAuthResponse extends EMsg
  /* 5538 */ val ClientUpdateMachineAuthResponse: typingsSlinky.steamClient.mod.EMsg.ClientUpdateMachineAuthResponse with Double = js.native
  
  @js.native
  sealed trait ClientUpdateUserGameInfo extends EMsg
  /* 5411 */ val ClientUpdateUserGameInfo: typingsSlinky.steamClient.mod.EMsg.ClientUpdateUserGameInfo with Double = js.native
  
  @js.native
  sealed trait ClientUseLocalDeviceAuthorizations extends EMsg
  /* 6505 */ val ClientUseLocalDeviceAuthorizations: typingsSlinky.steamClient.mod.EMsg.ClientUseLocalDeviceAuthorizations with Double = js.native
  
  @js.native
  sealed trait ClientUserNotifications extends EMsg
  /* 5599 */ val ClientUserNotifications: typingsSlinky.steamClient.mod.EMsg.ClientUserNotifications with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientVACBanStatus extends EMsg
  /* 782 */ val ClientVACBanStatus: typingsSlinky.steamClient.mod.EMsg.ClientVACBanStatus with Double = js.native
  
  @js.native
  sealed trait ClientVACChallenge extends EMsg
  /* 753 */ val ClientVACChallenge: typingsSlinky.steamClient.mod.EMsg.ClientVACChallenge with Double = js.native
  
  @js.native
  sealed trait ClientVACResponse extends EMsg
  /* 704 */ val ClientVACResponse: typingsSlinky.steamClient.mod.EMsg.ClientVACResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait ClientVTTCert extends EMsg
  /* 863 */ val ClientVTTCert: typingsSlinky.steamClient.mod.EMsg.ClientVTTCert with Double = js.native
  
  @js.native
  sealed trait ClientVacStatusQuery extends EMsg
  /* 770 */ val ClientVacStatusQuery: typingsSlinky.steamClient.mod.EMsg.ClientVacStatusQuery with Double = js.native
  
  @js.native
  sealed trait ClientVacStatusResponse extends EMsg
  /* 717 */ val ClientVacStatusResponse: typingsSlinky.steamClient.mod.EMsg.ClientVacStatusResponse with Double = js.native
  
  @js.native
  sealed trait ClientVanityURLChangedNotification extends EMsg
  /* 5598 */ val ClientVanityURLChangedNotification: typingsSlinky.steamClient.mod.EMsg.ClientVanityURLChangedNotification with Double = js.native
  
  @js.native
  sealed trait ClientVerifyPassword extends EMsg
  /* 5483 */ val ClientVerifyPassword: typingsSlinky.steamClient.mod.EMsg.ClientVerifyPassword with Double = js.native
  
  @js.native
  sealed trait ClientVerifyPasswordResponse extends EMsg
  /* 5484 */ val ClientVerifyPasswordResponse: typingsSlinky.steamClient.mod.EMsg.ClientVerifyPasswordResponse with Double = js.native
  
  @js.native
  sealed trait ClientVoiceCallPreAuthorize extends EMsg
  /* 9800 */ val ClientVoiceCallPreAuthorize: typingsSlinky.steamClient.mod.EMsg.ClientVoiceCallPreAuthorize with Double = js.native
  
  @js.native
  sealed trait ClientVoiceCallPreAuthorizeResponse extends EMsg
  /* 9801 */ val ClientVoiceCallPreAuthorizeResponse: typingsSlinky.steamClient.mod.EMsg.ClientVoiceCallPreAuthorizeResponse with Double = js.native
  
  @js.native
  sealed trait ClientWalletInfoUpdate extends EMsg
  /* 5528 */ val ClientWalletInfoUpdate: typingsSlinky.steamClient.mod.EMsg.ClientWalletInfoUpdate with Double = js.native
  
  @js.native
  sealed trait ClientWorkshopItemChangesRequest extends EMsg
  /* 7382 */ val ClientWorkshopItemChangesRequest: typingsSlinky.steamClient.mod.EMsg.ClientWorkshopItemChangesRequest with Double = js.native
  
  @js.native
  sealed trait ClientWorkshopItemChangesResponse extends EMsg
  /* 7383 */ val ClientWorkshopItemChangesResponse: typingsSlinky.steamClient.mod.EMsg.ClientWorkshopItemChangesResponse with Double = js.native
  
  @js.native
  sealed trait ClientWorkshopItemInfoRequest extends EMsg
  /* 7384 */ val ClientWorkshopItemInfoRequest: typingsSlinky.steamClient.mod.EMsg.ClientWorkshopItemInfoRequest with Double = js.native
  
  @js.native
  sealed trait ClientWorkshopItemInfoResponse extends EMsg
  /* 7385 */ val ClientWorkshopItemInfoResponse: typingsSlinky.steamClient.mod.EMsg.ClientWorkshopItemInfoResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait CommunityAddFriendNews extends EMsg
  /* 4140 */ val CommunityAddFriendNews: typingsSlinky.steamClient.mod.EMsg.CommunityAddFriendNews with Double = js.native
  
  // obsolete
  @js.native
  sealed trait CommunityDeleteUserNews extends EMsg
  /* 4155 */ val CommunityDeleteUserNews: typingsSlinky.steamClient.mod.EMsg.CommunityDeleteUserNews with Double = js.native
  
  @js.native
  sealed trait CommunityGetUserFriendNews extends EMsg
  /* 4173 */ val CommunityGetUserFriendNews: typingsSlinky.steamClient.mod.EMsg.CommunityGetUserFriendNews with Double = js.native
  
  @js.native
  sealed trait ContentDescriptionUpdate extends EMsg
  /* 227 */ val ContentDescriptionUpdate: typingsSlinky.steamClient.mod.EMsg.ContentDescriptionUpdate with Double = js.native
  
  @js.native
  sealed trait DFSAcceptedResponse extends EMsg
  /* 5611 */ val DFSAcceptedResponse: typingsSlinky.steamClient.mod.EMsg.DFSAcceptedResponse with Double = js.native
  
  @js.native
  sealed trait DFSConnection extends EMsg
  /* 5603 */ val DFSConnection: typingsSlinky.steamClient.mod.EMsg.DFSConnection with Double = js.native
  
  @js.native
  sealed trait DFSConnectionReply extends EMsg
  /* 5604 */ val DFSConnectionReply: typingsSlinky.steamClient.mod.EMsg.DFSConnectionReply with Double = js.native
  
  @js.native
  sealed trait DFSGetFile extends EMsg
  /* 5601 */ val DFSGetFile: typingsSlinky.steamClient.mod.EMsg.DFSGetFile with Double = js.native
  
  @js.native
  sealed trait DFSGetFileFromServer extends EMsg
  /* 5610 */ val DFSGetFileFromServer: typingsSlinky.steamClient.mod.EMsg.DFSGetFileFromServer with Double = js.native
  
  @js.native
  sealed trait DFSInstallLocalFile extends EMsg
  /* 5602 */ val DFSInstallLocalFile: typingsSlinky.steamClient.mod.EMsg.DFSInstallLocalFile with Double = js.native
  
  @js.native
  sealed trait DFSPurgeFile extends EMsg
  /* 5608 */ val DFSPurgeFile: typingsSlinky.steamClient.mod.EMsg.DFSPurgeFile with Double = js.native
  
  @js.native
  sealed trait DFSRecvTransmitFile extends EMsg
  /* 5613 */ val DFSRecvTransmitFile: typingsSlinky.steamClient.mod.EMsg.DFSRecvTransmitFile with Double = js.native
  
  @js.native
  sealed trait DFSRequestPingback extends EMsg
  /* 5612 */ val DFSRequestPingback: typingsSlinky.steamClient.mod.EMsg.DFSRequestPingback with Double = js.native
  
  @js.native
  sealed trait DFSRequestPingback2 extends EMsg
  /* 5615 */ val DFSRequestPingback2: typingsSlinky.steamClient.mod.EMsg.DFSRequestPingback2 with Double = js.native
  
  @js.native
  sealed trait DFSResponsePingback2 extends EMsg
  /* 5616 */ val DFSResponsePingback2: typingsSlinky.steamClient.mod.EMsg.DFSResponsePingback2 with Double = js.native
  
  @js.native
  sealed trait DFSRouteFile extends EMsg
  /* 5609 */ val DFSRouteFile: typingsSlinky.steamClient.mod.EMsg.DFSRouteFile with Double = js.native
  
  @js.native
  sealed trait DFSRouteFileResponse extends EMsg
  /* 5620 */ val DFSRouteFileResponse: typingsSlinky.steamClient.mod.EMsg.DFSRouteFileResponse with Double = js.native
  
  @js.native
  sealed trait DFSSendTransmitFile extends EMsg
  /* 5614 */ val DFSSendTransmitFile: typingsSlinky.steamClient.mod.EMsg.DFSSendTransmitFile with Double = js.native
  
  @js.native
  sealed trait DFSStartTransfer extends EMsg
  /* 5618 */ val DFSStartTransfer: typingsSlinky.steamClient.mod.EMsg.DFSStartTransfer with Double = js.native
  
  @js.native
  sealed trait DFSTransferComplete extends EMsg
  /* 5619 */ val DFSTransferComplete: typingsSlinky.steamClient.mod.EMsg.DFSTransferComplete with Double = js.native
  
  @js.native
  sealed trait DPAccountCreationStats extends EMsg
  /* 1614 */ val DPAccountCreationStats: typingsSlinky.steamClient.mod.EMsg.DPAccountCreationStats with Double = js.native
  
  @js.native
  sealed trait DPAchievementStats extends EMsg
  /* 1613 */ val DPAchievementStats: typingsSlinky.steamClient.mod.EMsg.DPAchievementStats with Double = js.native
  
  @js.native
  sealed trait DPBlockingStats extends EMsg
  /* 1607 */ val DPBlockingStats: typingsSlinky.steamClient.mod.EMsg.DPBlockingStats with Double = js.native
  
  @js.native
  sealed trait DPCloudStats extends EMsg
  /* 1612 */ val DPCloudStats: typingsSlinky.steamClient.mod.EMsg.DPCloudStats with Double = js.native
  
  @js.native
  sealed trait DPDownloadRateStatistics extends EMsg
  /* 1618 */ val DPDownloadRateStatistics: typingsSlinky.steamClient.mod.EMsg.DPDownloadRateStatistics with Double = js.native
  
  // obsolete
  @js.native
  sealed trait DPFacebookStatistics extends EMsg
  /* 1619 */ val DPFacebookStatistics: typingsSlinky.steamClient.mod.EMsg.DPFacebookStatistics with Double = js.native
  
  @js.native
  sealed trait DPGamePlayedStats extends EMsg
  /* 1602 */ val DPGamePlayedStats: typingsSlinky.steamClient.mod.EMsg.DPGamePlayedStats with Double = js.native
  
  @js.native
  sealed trait DPGameServersPlayersStats extends EMsg
  /* 1617 */ val DPGameServersPlayersStats: typingsSlinky.steamClient.mod.EMsg.DPGameServersPlayersStats with Double = js.native
  
  @js.native
  sealed trait DPGetPlayerCount extends EMsg
  /* 1615 */ val DPGetPlayerCount: typingsSlinky.steamClient.mod.EMsg.DPGetPlayerCount with Double = js.native
  
  @js.native
  sealed trait DPGetPlayerCountResponse extends EMsg
  /* 1616 */ val DPGetPlayerCountResponse: typingsSlinky.steamClient.mod.EMsg.DPGetPlayerCountResponse with Double = js.native
  
  @js.native
  sealed trait DPNatTraversalStats extends EMsg
  /* 1608 */ val DPNatTraversalStats: typingsSlinky.steamClient.mod.EMsg.DPNatTraversalStats with Double = js.native
  
  @js.native
  sealed trait DPPartnerMicroTxns extends EMsg
  /* 1628 */ val DPPartnerMicroTxns: typingsSlinky.steamClient.mod.EMsg.DPPartnerMicroTxns with Double = js.native
  
  @js.native
  sealed trait DPPartnerMicroTxnsResponse extends EMsg
  /* 1629 */ val DPPartnerMicroTxnsResponse: typingsSlinky.steamClient.mod.EMsg.DPPartnerMicroTxnsResponse with Double = js.native
  
  @js.native
  sealed trait DPSetPublishingState extends EMsg
  /* 1601 */ val DPSetPublishingState: typingsSlinky.steamClient.mod.EMsg.DPSetPublishingState with Double = js.native
  
  @js.native
  sealed trait DPSteamUsageEvent extends EMsg
  /* 1609 */ val DPSteamUsageEvent: typingsSlinky.steamClient.mod.EMsg.DPSteamUsageEvent with Double = js.native
  
  @js.native
  sealed trait DPStoreSaleStatistics extends EMsg
  /* 1624 */ val DPStoreSaleStatistics: typingsSlinky.steamClient.mod.EMsg.DPStoreSaleStatistics with Double = js.native
  
  @js.native
  sealed trait DPStreamingUniquePlayersStat extends EMsg
  /* 1604 */ val DPStreamingUniquePlayersStat: typingsSlinky.steamClient.mod.EMsg.DPStreamingUniquePlayersStat with Double = js.native
  
  // obsolete
  @js.native
  sealed trait DPUniquePlayersStat extends EMsg
  /* 1603 */ val DPUniquePlayersStat: typingsSlinky.steamClient.mod.EMsg.DPUniquePlayersStat with Double = js.native
  
  // obsolete
  @js.native
  sealed trait DPUpdateContentEvent extends EMsg
  /* 1626 */ val DPUpdateContentEvent: typingsSlinky.steamClient.mod.EMsg.DPUpdateContentEvent with Double = js.native
  
  @js.native
  sealed trait DPVRUniquePlayersStat extends EMsg
  /* 1631 */ val DPVRUniquePlayersStat: typingsSlinky.steamClient.mod.EMsg.DPVRUniquePlayersStat with Double = js.native
  
  @js.native
  sealed trait DPVacBanStats extends EMsg
  /* 1606 */ val DPVacBanStats: typingsSlinky.steamClient.mod.EMsg.DPVacBanStats with Double = js.native
  
  @js.native
  sealed trait DPVacCafeBanStats extends EMsg
  /* 1611 */ val DPVacCafeBanStats: typingsSlinky.steamClient.mod.EMsg.DPVacCafeBanStats with Double = js.native
  
  // obsolete
  @js.native
  sealed trait DPVacCertBanStats extends EMsg
  /* 1610 */ val DPVacCertBanStats: typingsSlinky.steamClient.mod.EMsg.DPVacCertBanStats with Double = js.native
  
  @js.native
  sealed trait DPVacInfractionStats extends EMsg
  /* 1605 */ val DPVacInfractionStats: typingsSlinky.steamClient.mod.EMsg.DPVacInfractionStats with Double = js.native
  
  @js.native
  sealed trait DRMAdminUpdate extends EMsg
  /* 640 */ val DRMAdminUpdate: typingsSlinky.steamClient.mod.EMsg.DRMAdminUpdate with Double = js.native
  
  @js.native
  sealed trait DRMAdminUpdateResponse extends EMsg
  /* 641 */ val DRMAdminUpdateResponse: typingsSlinky.steamClient.mod.EMsg.DRMAdminUpdateResponse with Double = js.native
  
  @js.native
  sealed trait DRMBuildBlobRequest extends EMsg
  /* 628 */ val DRMBuildBlobRequest: typingsSlinky.steamClient.mod.EMsg.DRMBuildBlobRequest with Double = js.native
  
  @js.native
  sealed trait DRMBuildBlobResponse extends EMsg
  /* 629 */ val DRMBuildBlobResponse: typingsSlinky.steamClient.mod.EMsg.DRMBuildBlobResponse with Double = js.native
  
  @js.native
  sealed trait DRMDetailsReportRequest extends EMsg
  /* 637 */ val DRMDetailsReportRequest: typingsSlinky.steamClient.mod.EMsg.DRMDetailsReportRequest with Double = js.native
  
  @js.native
  sealed trait DRMDetailsReportResponse extends EMsg
  /* 638 */ val DRMDetailsReportResponse: typingsSlinky.steamClient.mod.EMsg.DRMDetailsReportResponse with Double = js.native
  
  @js.native
  sealed trait DRMEmptyGuidCache extends EMsg
  /* 645 */ val DRMEmptyGuidCache: typingsSlinky.steamClient.mod.EMsg.DRMEmptyGuidCache with Double = js.native
  
  @js.native
  sealed trait DRMEmptyGuidCacheResponse extends EMsg
  /* 646 */ val DRMEmptyGuidCacheResponse: typingsSlinky.steamClient.mod.EMsg.DRMEmptyGuidCacheResponse with Double = js.native
  
  @js.native
  sealed trait DRMProcessFile extends EMsg
  /* 639 */ val DRMProcessFile: typingsSlinky.steamClient.mod.EMsg.DRMProcessFile with Double = js.native
  
  @js.native
  sealed trait DRMProcessFileResponse extends EMsg
  /* 644 */ val DRMProcessFileResponse: typingsSlinky.steamClient.mod.EMsg.DRMProcessFileResponse with Double = js.native
  
  @js.native
  sealed trait DRMRange2 extends EMsg
  /* 7600 */ val DRMRange2: typingsSlinky.steamClient.mod.EMsg.DRMRange2 with Double = js.native
  
  @js.native
  sealed trait DRMResolveGuidRequest extends EMsg
  /* 630 */ val DRMResolveGuidRequest: typingsSlinky.steamClient.mod.EMsg.DRMResolveGuidRequest with Double = js.native
  
  @js.native
  sealed trait DRMResolveGuidResponse extends EMsg
  /* 631 */ val DRMResolveGuidResponse: typingsSlinky.steamClient.mod.EMsg.DRMResolveGuidResponse with Double = js.native
  
  @js.native
  sealed trait DRMSFetchVersionSet extends EMsg
  /* 7606 */ val DRMSFetchVersionSet: typingsSlinky.steamClient.mod.EMsg.DRMSFetchVersionSet with Double = js.native
  
  @js.native
  sealed trait DRMSFetchVersionSetResponse extends EMsg
  /* 7607 */ val DRMSFetchVersionSetResponse: typingsSlinky.steamClient.mod.EMsg.DRMSFetchVersionSetResponse with Double = js.native
  
  @js.native
  sealed trait DRMStabilityReport extends EMsg
  /* 635 */ val DRMStabilityReport: typingsSlinky.steamClient.mod.EMsg.DRMStabilityReport with Double = js.native
  
  @js.native
  sealed trait DRMStabilityReportResponse extends EMsg
  /* 636 */ val DRMStabilityReportResponse: typingsSlinky.steamClient.mod.EMsg.DRMStabilityReportResponse with Double = js.native
  
  @js.native
  sealed trait DRMSync extends EMsg
  /* 642 */ val DRMSync: typingsSlinky.steamClient.mod.EMsg.DRMSync with Double = js.native
  
  @js.native
  sealed trait DRMSyncResponse extends EMsg
  /* 643 */ val DRMSyncResponse: typingsSlinky.steamClient.mod.EMsg.DRMSyncResponse with Double = js.native
  
  @js.native
  sealed trait DRMVariabilityReport extends EMsg
  /* 633 */ val DRMVariabilityReport: typingsSlinky.steamClient.mod.EMsg.DRMVariabilityReport with Double = js.native
  
  @js.native
  sealed trait DRMVariabilityReportResponse extends EMsg
  /* 634 */ val DRMVariabilityReportResponse: typingsSlinky.steamClient.mod.EMsg.DRMVariabilityReportResponse with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcess extends EMsg
  /* 9100 */ val DRMWorkerProcess: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcess with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessAnalyzeFileRequest extends EMsg
  /* 9128 */ val DRMWorkerProcessAnalyzeFileRequest: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessAnalyzeFileRequest with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessAnalyzeFileResponse extends EMsg
  /* 9129 */ val DRMWorkerProcessAnalyzeFileResponse: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessAnalyzeFileResponse with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessBackfillOriginalRequest extends EMsg
  /* 9116 */ val DRMWorkerProcessBackfillOriginalRequest: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessBackfillOriginalRequest with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessBackfillOriginalResponse extends EMsg
  /* 9117 */ val DRMWorkerProcessBackfillOriginalResponse: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessBackfillOriginalResponse with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessDRMAndSign extends EMsg
  /* 9100 */ val DRMWorkerProcessDRMAndSign: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessDRMAndSign with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessDRMAndSignResponse extends EMsg
  /* 9101 */ val DRMWorkerProcessDRMAndSignResponse: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessDRMAndSignResponse with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessDescribeSecretRequest extends EMsg
  /* 9114 */ val DRMWorkerProcessDescribeSecretRequest: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessDescribeSecretRequest with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessDescribeSecretResponse extends EMsg
  /* 9115 */ val DRMWorkerProcessDescribeSecretResponse: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessDescribeSecretResponse with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessEvaluateCrashRequest extends EMsg
  /* 9126 */ val DRMWorkerProcessEvaluateCrashRequest: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessEvaluateCrashRequest with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessEvaluateCrashResponse extends EMsg
  /* 9127 */ val DRMWorkerProcessEvaluateCrashResponse: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessEvaluateCrashResponse with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessExamineBlobRequest extends EMsg
  /* 9112 */ val DRMWorkerProcessExamineBlobRequest: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessExamineBlobRequest with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessExamineBlobResponse extends EMsg
  /* 9113 */ val DRMWorkerProcessExamineBlobResponse: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessExamineBlobResponse with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessGetBlobRequest extends EMsg
  /* 9124 */ val DRMWorkerProcessGetBlobRequest: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessGetBlobRequest with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessGetBlobResponse extends EMsg
  /* 9125 */ val DRMWorkerProcessGetBlobResponse: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessGetBlobResponse with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessGetDRMGuidsFromFileRequest extends EMsg
  /* 9108 */ val DRMWorkerProcessGetDRMGuidsFromFileRequest: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessGetDRMGuidsFromFileRequest with Double = js.native
  
  // obsolete
  @js.native
  sealed trait DRMWorkerProcessGetDRMGuidsFromFileResponse extends EMsg
  /* 9109 */ val DRMWorkerProcessGetDRMGuidsFromFileResponse: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessGetDRMGuidsFromFileResponse with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessInstallAllRequest extends EMsg
  /* 9132 */ val DRMWorkerProcessInstallAllRequest: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessInstallAllRequest with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessInstallAllResponse extends EMsg
  /* 9133 */ val DRMWorkerProcessInstallAllResponse: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessInstallAllResponse with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessInstallDRMDLLRequest extends EMsg
  /* 9104 */ val DRMWorkerProcessInstallDRMDLLRequest: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessInstallDRMDLLRequest with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessInstallDRMDLLResponse extends EMsg
  /* 9105 */ val DRMWorkerProcessInstallDRMDLLResponse: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessInstallDRMDLLResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait DRMWorkerProcessInstallProcessedFilesRequest extends EMsg
  /* 9110 */ val DRMWorkerProcessInstallProcessedFilesRequest: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessInstallProcessedFilesRequest with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessInstallProcessedFilesResponse extends EMsg
  /* 9111 */ val DRMWorkerProcessInstallProcessedFilesResponse: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessInstallProcessedFilesResponse with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessSecretIdStringRequest extends EMsg
  /* 9106 */ val DRMWorkerProcessSecretIdStringRequest: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessSecretIdStringRequest with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessSecretIdStringResponse extends EMsg
  /* 9107 */ val DRMWorkerProcessSecretIdStringResponse: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessSecretIdStringResponse with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessSplitAndInstallRequest extends EMsg
  /* 9122 */ val DRMWorkerProcessSplitAndInstallRequest: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessSplitAndInstallRequest with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessSplitAndInstallResponse extends EMsg
  /* 9123 */ val DRMWorkerProcessSplitAndInstallResponse: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessSplitAndInstallResponse with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessSteamworksInfoRequest extends EMsg
  /* 9102 */ val DRMWorkerProcessSteamworksInfoRequest: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessSteamworksInfoRequest with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessSteamworksInfoResponse extends EMsg
  /* 9103 */ val DRMWorkerProcessSteamworksInfoResponse: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessSteamworksInfoResponse with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessUnpackBlobRequest extends EMsg
  /* 9130 */ val DRMWorkerProcessUnpackBlobRequest: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessUnpackBlobRequest with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessUnpackBlobResponse extends EMsg
  /* 9131 */ val DRMWorkerProcessUnpackBlobResponse: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessUnpackBlobResponse with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessValidateDRMDLLRequest extends EMsg
  /* 9118 */ val DRMWorkerProcessValidateDRMDLLRequest: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessValidateDRMDLLRequest with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessValidateDRMDLLResponse extends EMsg
  /* 9119 */ val DRMWorkerProcessValidateDRMDLLResponse: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessValidateDRMDLLResponse with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessValidateFileRequest extends EMsg
  /* 9120 */ val DRMWorkerProcessValidateFileRequest: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessValidateFileRequest with Double = js.native
  
  @js.native
  sealed trait DRMWorkerProcessValidateFileResponse extends EMsg
  /* 9121 */ val DRMWorkerProcessValidateFileResponse: typingsSlinky.steamClient.mod.EMsg.DRMWorkerProcessValidateFileResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait DSSCurrentFileList extends EMsg
  /* 1802 */ val DSSCurrentFileList: typingsSlinky.steamClient.mod.EMsg.DSSCurrentFileList with Double = js.native
  
  // obsolete
  @js.native
  sealed trait DSSNewFile extends EMsg
  /* 1801 */ val DSSNewFile: typingsSlinky.steamClient.mod.EMsg.DSSNewFile with Double = js.native
  
  // obsolete
  @js.native
  sealed trait DSSSynchList extends EMsg
  /* 1803 */ val DSSSynchList: typingsSlinky.steamClient.mod.EMsg.DSSSynchList with Double = js.native
  
  // obsolete
  @js.native
  sealed trait DSSSynchListResponse extends EMsg
  /* 1804 */ val DSSSynchListResponse: typingsSlinky.steamClient.mod.EMsg.DSSSynchListResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait DSSSynchSubscribe extends EMsg
  /* 1805 */ val DSSSynchSubscribe: typingsSlinky.steamClient.mod.EMsg.DSSSynchSubscribe with Double = js.native
  
  // obsolete
  @js.native
  sealed trait DSSSynchUnsubscribe extends EMsg
  /* 1806 */ val DSSSynchUnsubscribe: typingsSlinky.steamClient.mod.EMsg.DSSSynchUnsubscribe with Double = js.native
  
  @js.native
  sealed trait DestJobFailed extends EMsg
  /* 113 */ val DestJobFailed: typingsSlinky.steamClient.mod.EMsg.DestJobFailed with Double = js.native
  
  @js.native
  sealed trait DeviceAuthorizationBase extends EMsg
  /* 6500 */ val DeviceAuthorizationBase: typingsSlinky.steamClient.mod.EMsg.DeviceAuthorizationBase with Double = js.native
  
  @js.native
  sealed trait DirRequest extends EMsg
  /* 202 */ val DirRequest: typingsSlinky.steamClient.mod.EMsg.DirRequest with Double = js.native
  
  @js.native
  sealed trait DirResponse extends EMsg
  /* 203 */ val DirResponse: typingsSlinky.steamClient.mod.EMsg.DirResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait EPMRestartProcess extends EMsg
  /* 1903 */ val EPMRestartProcess: typingsSlinky.steamClient.mod.EMsg.EPMRestartProcess with Double = js.native
  
  // obsolete
  @js.native
  sealed trait EPMStartProcess extends EMsg
  /* 1901 */ val EPMStartProcess: typingsSlinky.steamClient.mod.EMsg.EPMStartProcess with Double = js.native
  
  // obsolete
  @js.native
  sealed trait EPMStopProcess extends EMsg
  /* 1902 */ val EPMStopProcess: typingsSlinky.steamClient.mod.EMsg.EPMStopProcess with Double = js.native
  
  @js.native
  sealed trait EconBase extends EMsg
  /* 7700 */ val EconBase: typingsSlinky.steamClient.mod.EMsg.EconBase with Double = js.native
  
  @js.native
  sealed trait EconCDKeyProcessTransaction extends EMsg
  /* 7711 */ val EconCDKeyProcessTransaction: typingsSlinky.steamClient.mod.EMsg.EconCDKeyProcessTransaction with Double = js.native
  
  @js.native
  sealed trait EconCDKeyProcessTransactionResponse extends EMsg
  /* 7712 */ val EconCDKeyProcessTransactionResponse: typingsSlinky.steamClient.mod.EMsg.EconCDKeyProcessTransactionResponse with Double = js.native
  
  @js.native
  sealed trait EconFlushInventoryCache extends EMsg
  /* 7707 */ val EconFlushInventoryCache: typingsSlinky.steamClient.mod.EMsg.EconFlushInventoryCache with Double = js.native
  
  @js.native
  sealed trait EconFlushInventoryCacheResponse extends EMsg
  /* 7708 */ val EconFlushInventoryCacheResponse: typingsSlinky.steamClient.mod.EMsg.EconFlushInventoryCacheResponse with Double = js.native
  
  @js.native
  sealed trait EconGetErrorLogs extends EMsg
  /* 7713 */ val EconGetErrorLogs: typingsSlinky.steamClient.mod.EMsg.EconGetErrorLogs with Double = js.native
  
  @js.native
  sealed trait EconGetErrorLogsResponse extends EMsg
  /* 7714 */ val EconGetErrorLogsResponse: typingsSlinky.steamClient.mod.EMsg.EconGetErrorLogsResponse with Double = js.native
  
  @js.native
  sealed trait EconTrading_CancelTradeRequest extends EMsg
  /* 7706 */ val EconTrading_CancelTradeRequest: typingsSlinky.steamClient.mod.EMsg.EconTrading_CancelTradeRequest with Double = js.native
  
  @js.native
  sealed trait EconTrading_InitiateTradeProposed extends EMsg
  /* 7702 */ val EconTrading_InitiateTradeProposed: typingsSlinky.steamClient.mod.EMsg.EconTrading_InitiateTradeProposed with Double = js.native
  
  @js.native
  sealed trait EconTrading_InitiateTradeRequest extends EMsg
  /* 7701 */ val EconTrading_InitiateTradeRequest: typingsSlinky.steamClient.mod.EMsg.EconTrading_InitiateTradeRequest with Double = js.native
  
  @js.native
  sealed trait EconTrading_InitiateTradeResponse extends EMsg
  /* 7703 */ val EconTrading_InitiateTradeResponse: typingsSlinky.steamClient.mod.EMsg.EconTrading_InitiateTradeResponse with Double = js.native
  
  @js.native
  sealed trait EconTrading_InitiateTradeResult extends EMsg
  /* 7704 */ val EconTrading_InitiateTradeResult: typingsSlinky.steamClient.mod.EMsg.EconTrading_InitiateTradeResult with Double = js.native
  
  @js.native
  sealed trait EconTrading_StartSession extends EMsg
  /* 7705 */ val EconTrading_StartSession: typingsSlinky.steamClient.mod.EMsg.EconTrading_StartSession with Double = js.native
  
  @js.native
  sealed trait Exit extends EMsg
  /* 201 */ val Exit: typingsSlinky.steamClient.mod.EMsg.Exit with Double = js.native
  
  @js.native
  sealed trait ExitShell extends EMsg
  /* 308 */ val ExitShell: typingsSlinky.steamClient.mod.EMsg.ExitShell with Double = js.native
  
  @js.native
  sealed trait ExitShells extends EMsg
  /* 307 */ val ExitShells: typingsSlinky.steamClient.mod.EMsg.ExitShells with Double = js.native
  
  @js.native
  sealed trait FBSApplyAccountCred extends EMsg
  /* 1119 */ val FBSApplyAccountCred: typingsSlinky.steamClient.mod.EMsg.FBSApplyAccountCred with Double = js.native
  
  @js.native
  sealed trait FBSApplyAccountCredResponse extends EMsg
  /* 1120 */ val FBSApplyAccountCredResponse: typingsSlinky.steamClient.mod.EMsg.FBSApplyAccountCredResponse with Double = js.native
  
  @js.native
  sealed trait FBSApplyOSUpdates extends EMsg
  /* 1108 */ val FBSApplyOSUpdates: typingsSlinky.steamClient.mod.EMsg.FBSApplyOSUpdates with Double = js.native
  
  @js.native
  sealed trait FBSBootstrapperGetPackageChunk extends EMsg
  /* 1130 */ val FBSBootstrapperGetPackageChunk: typingsSlinky.steamClient.mod.EMsg.FBSBootstrapperGetPackageChunk with Double = js.native
  
  @js.native
  sealed trait FBSBootstrapperGetPackageChunkResponse extends EMsg
  /* 1131 */ val FBSBootstrapperGetPackageChunkResponse: typingsSlinky.steamClient.mod.EMsg.FBSBootstrapperGetPackageChunkResponse with Double = js.native
  
  @js.native
  sealed trait FBSBootstrapperPackageRequest extends EMsg
  /* 1128 */ val FBSBootstrapperPackageRequest: typingsSlinky.steamClient.mod.EMsg.FBSBootstrapperPackageRequest with Double = js.native
  
  @js.native
  sealed trait FBSBootstrapperPackageResponse extends EMsg
  /* 1129 */ val FBSBootstrapperPackageResponse: typingsSlinky.steamClient.mod.EMsg.FBSBootstrapperPackageResponse with Double = js.native
  
  @js.native
  sealed trait FBSBootstrapperPackageTransferProgress extends EMsg
  /* 1132 */ val FBSBootstrapperPackageTransferProgress: typingsSlinky.steamClient.mod.EMsg.FBSBootstrapperPackageTransferProgress with Double = js.native
  
  @js.native
  sealed trait FBSConnectionData extends EMsg
  /* 1027 */ val FBSConnectionData: typingsSlinky.steamClient.mod.EMsg.FBSConnectionData with Double = js.native
  
  // obsolete
  @js.native
  sealed trait FBSDeployHotFixPackage extends EMsg
  /* 1114 */ val FBSDeployHotFixPackage: typingsSlinky.steamClient.mod.EMsg.FBSDeployHotFixPackage with Double = js.native
  
  @js.native
  sealed trait FBSDeployHotFixResponse extends EMsg
  /* 1115 */ val FBSDeployHotFixResponse: typingsSlinky.steamClient.mod.EMsg.FBSDeployHotFixResponse with Double = js.native
  
  @js.native
  sealed trait FBSDeployPackage extends EMsg
  /* 1104 */ val FBSDeployPackage: typingsSlinky.steamClient.mod.EMsg.FBSDeployPackage with Double = js.native
  
  @js.native
  sealed trait FBSDeployResponse extends EMsg
  /* 1105 */ val FBSDeployResponse: typingsSlinky.steamClient.mod.EMsg.FBSDeployResponse with Double = js.native
  
  @js.native
  sealed trait FBSDownloadHotFix extends EMsg
  /* 1116 */ val FBSDownloadHotFix: typingsSlinky.steamClient.mod.EMsg.FBSDownloadHotFix with Double = js.native
  
  @js.native
  sealed trait FBSDownloadHotFixResponse extends EMsg
  /* 1117 */ val FBSDownloadHotFixResponse: typingsSlinky.steamClient.mod.EMsg.FBSDownloadHotFixResponse with Double = js.native
  
  @js.native
  sealed trait FBSForceBounce extends EMsg
  /* 1103 */ val FBSForceBounce: typingsSlinky.steamClient.mod.EMsg.FBSForceBounce with Double = js.native
  
  @js.native
  sealed trait FBSForceRefresh extends EMsg
  /* 1102 */ val FBSForceRefresh: typingsSlinky.steamClient.mod.EMsg.FBSForceRefresh with Double = js.native
  
  @js.native
  sealed trait FBSInfoFromBootstrapper extends EMsg
  /* 1126 */ val FBSInfoFromBootstrapper: typingsSlinky.steamClient.mod.EMsg.FBSInfoFromBootstrapper with Double = js.native
  
  @js.native
  sealed trait FBSMinidumpServer extends EMsg
  /* 1112 */ val FBSMinidumpServer: typingsSlinky.steamClient.mod.EMsg.FBSMinidumpServer with Double = js.native
  
  @js.native
  sealed trait FBSQueryGMForRequest extends EMsg
  /* 1123 */ val FBSQueryGMForRequest: typingsSlinky.steamClient.mod.EMsg.FBSQueryGMForRequest with Double = js.native
  
  @js.native
  sealed trait FBSQueryGMResponse extends EMsg
  /* 1124 */ val FBSQueryGMResponse: typingsSlinky.steamClient.mod.EMsg.FBSQueryGMResponse with Double = js.native
  
  @js.native
  sealed trait FBSRebootBox extends EMsg
  /* 1110 */ val FBSRebootBox: typingsSlinky.steamClient.mod.EMsg.FBSRebootBox with Double = js.native
  
  @js.native
  sealed trait FBSRebootBoxResponse extends EMsg
  /* 1127 */ val FBSRebootBoxResponse: typingsSlinky.steamClient.mod.EMsg.FBSRebootBoxResponse with Double = js.native
  
  @js.native
  sealed trait FBSReqVersion extends EMsg
  /* 1100 */ val FBSReqVersion: typingsSlinky.steamClient.mod.EMsg.FBSReqVersion with Double = js.native
  
  @js.native
  sealed trait FBSRestartBootstrapper extends EMsg
  /* 1133 */ val FBSRestartBootstrapper: typingsSlinky.steamClient.mod.EMsg.FBSRestartBootstrapper with Double = js.native
  
  @js.native
  sealed trait FBSRunCMDScript extends EMsg
  /* 1109 */ val FBSRunCMDScript: typingsSlinky.steamClient.mod.EMsg.FBSRunCMDScript with Double = js.native
  
  @js.native
  sealed trait FBSSetBigBrotherMode extends EMsg
  /* 1111 */ val FBSSetBigBrotherMode: typingsSlinky.steamClient.mod.EMsg.FBSSetBigBrotherMode with Double = js.native
  
  @js.native
  sealed trait FBSSetShellCount extends EMsg
  /* 1121 */ val FBSSetShellCount: typingsSlinky.steamClient.mod.EMsg.FBSSetShellCount with Double = js.native
  
  @js.native
  sealed trait FBSSetShellCount_obsolete extends EMsg
  /* 1113 */ val FBSSetShellCount_obsolete: typingsSlinky.steamClient.mod.EMsg.FBSSetShellCount_obsolete with Double = js.native
  
  @js.native
  sealed trait FBSSetState extends EMsg
  /* 1107 */ val FBSSetState: typingsSlinky.steamClient.mod.EMsg.FBSSetState with Double = js.native
  
  @js.native
  sealed trait FBSTerminateShell extends EMsg
  /* 1122 */ val FBSTerminateShell: typingsSlinky.steamClient.mod.EMsg.FBSTerminateShell with Double = js.native
  
  @js.native
  sealed trait FBSTerminateZombies extends EMsg
  /* 1125 */ val FBSTerminateZombies: typingsSlinky.steamClient.mod.EMsg.FBSTerminateZombies with Double = js.native
  
  @js.native
  sealed trait FBSUpdateBootstrapper extends EMsg
  /* 1106 */ val FBSUpdateBootstrapper: typingsSlinky.steamClient.mod.EMsg.FBSUpdateBootstrapper with Double = js.native
  
  @js.native
  sealed trait FBSUpdateTargetConfigFile extends EMsg
  /* 1118 */ val FBSUpdateTargetConfigFile: typingsSlinky.steamClient.mod.EMsg.FBSUpdateTargetConfigFile with Double = js.native
  
  @js.native
  sealed trait FBSVersionInfo extends EMsg
  /* 1101 */ val FBSVersionInfo: typingsSlinky.steamClient.mod.EMsg.FBSVersionInfo with Double = js.native
  
  @js.native
  sealed trait FSAddOrRemoveFollower extends EMsg
  /* 7510 */ val FSAddOrRemoveFollower: typingsSlinky.steamClient.mod.EMsg.FSAddOrRemoveFollower with Double = js.native
  
  @js.native
  sealed trait FSAddOrRemoveFollowerResponse extends EMsg
  /* 7511 */ val FSAddOrRemoveFollowerResponse: typingsSlinky.steamClient.mod.EMsg.FSAddOrRemoveFollowerResponse with Double = js.native
  
  @js.native
  sealed trait FSBase extends EMsg
  /* 7500 */ val FSBase: typingsSlinky.steamClient.mod.EMsg.FSBase with Double = js.native
  
  @js.native
  sealed trait FSCommentNotification extends EMsg
  /* 7513 */ val FSCommentNotification: typingsSlinky.steamClient.mod.EMsg.FSCommentNotification with Double = js.native
  
  @js.native
  sealed trait FSCommentNotificationViewed extends EMsg
  /* 7514 */ val FSCommentNotificationViewed: typingsSlinky.steamClient.mod.EMsg.FSCommentNotificationViewed with Double = js.native
  
  @js.native
  sealed trait FSComputeFrenematrix extends EMsg
  /* 7506 */ val FSComputeFrenematrix: typingsSlinky.steamClient.mod.EMsg.FSComputeFrenematrix with Double = js.native
  
  @js.native
  sealed trait FSComputeFrenematrixResponse extends EMsg
  /* 7507 */ val FSComputeFrenematrixResponse: typingsSlinky.steamClient.mod.EMsg.FSComputeFrenematrixResponse with Double = js.native
  
  @js.native
  sealed trait FSGetPendingNotificationCount extends EMsg
  /* 7521 */ val FSGetPendingNotificationCount: typingsSlinky.steamClient.mod.EMsg.FSGetPendingNotificationCount with Double = js.native
  
  @js.native
  sealed trait FSGetPendingNotificationCountResponse extends EMsg
  /* 7522 */ val FSGetPendingNotificationCountResponse: typingsSlinky.steamClient.mod.EMsg.FSGetPendingNotificationCountResponse with Double = js.native
  
  @js.native
  sealed trait FSPlayStatusNotification extends EMsg
  /* 7508 */ val FSPlayStatusNotification: typingsSlinky.steamClient.mod.EMsg.FSPlayStatusNotification with Double = js.native
  
  @js.native
  sealed trait FSPublishPersonaStatus extends EMsg
  /* 7509 */ val FSPublishPersonaStatus: typingsSlinky.steamClient.mod.EMsg.FSPublishPersonaStatus with Double = js.native
  
  @js.native
  sealed trait FSRequestFriendData extends EMsg
  /* 7530 */ val FSRequestFriendData: typingsSlinky.steamClient.mod.EMsg.FSRequestFriendData with Double = js.native
  
  @js.native
  sealed trait FSRichPresenceRequest extends EMsg
  /* 7504 */ val FSRichPresenceRequest: typingsSlinky.steamClient.mod.EMsg.FSRichPresenceRequest with Double = js.native
  
  @js.native
  sealed trait FSRichPresenceResponse extends EMsg
  /* 7505 */ val FSRichPresenceResponse: typingsSlinky.steamClient.mod.EMsg.FSRichPresenceResponse with Double = js.native
  
  @js.native
  sealed trait FSUpdateFollowingList extends EMsg
  /* 7512 */ val FSUpdateFollowingList: typingsSlinky.steamClient.mod.EMsg.FSUpdateFollowingList with Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSBrowseClans extends EMsg
  /* 3103 */ val FTSBrowseClans: typingsSlinky.steamClient.mod.EMsg.FTSBrowseClans with Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSBrowseClansResponse extends EMsg
  /* 3104 */ val FTSBrowseClansResponse: typingsSlinky.steamClient.mod.EMsg.FTSBrowseClansResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSClanDeleted extends EMsg
  /* 3109 */ val FTSClanDeleted: typingsSlinky.steamClient.mod.EMsg.FTSClanDeleted with Double = js.native
  
  @js.native
  sealed trait FTSGetBrowseCounts extends EMsg
  /* 3101 */ val FTSGetBrowseCounts: typingsSlinky.steamClient.mod.EMsg.FTSGetBrowseCounts with Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSGetBrowseCountsResponse extends EMsg
  /* 3102 */ val FTSGetBrowseCountsResponse: typingsSlinky.steamClient.mod.EMsg.FTSGetBrowseCountsResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSGetGSPlayStats extends EMsg
  /* 3114 */ val FTSGetGSPlayStats: typingsSlinky.steamClient.mod.EMsg.FTSGetGSPlayStats with Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSGetGSPlayStatsForServer extends EMsg
  /* 3116 */ val FTSGetGSPlayStatsForServer: typingsSlinky.steamClient.mod.EMsg.FTSGetGSPlayStatsForServer with Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSGetGSPlayStatsForServerResponse extends EMsg
  /* 3117 */ val FTSGetGSPlayStatsForServerResponse: typingsSlinky.steamClient.mod.EMsg.FTSGetGSPlayStatsForServerResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSGetGSPlayStatsResponse extends EMsg
  /* 3115 */ val FTSGetGSPlayStatsResponse: typingsSlinky.steamClient.mod.EMsg.FTSGetGSPlayStatsResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSReportIPUpdates extends EMsg
  /* 3118 */ val FTSReportIPUpdates: typingsSlinky.steamClient.mod.EMsg.FTSReportIPUpdates with Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSSearch extends EMsg
  /* 3110 */ val FTSSearch: typingsSlinky.steamClient.mod.EMsg.FTSSearch with Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSSearchClansByLocation extends EMsg
  /* 3105 */ val FTSSearchClansByLocation: typingsSlinky.steamClient.mod.EMsg.FTSSearchClansByLocation with Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSSearchClansByLocationResponse extends EMsg
  /* 3106 */ val FTSSearchClansByLocationResponse: typingsSlinky.steamClient.mod.EMsg.FTSSearchClansByLocationResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSSearchPlayersByLocation extends EMsg
  /* 3107 */ val FTSSearchPlayersByLocation: typingsSlinky.steamClient.mod.EMsg.FTSSearchPlayersByLocation with Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSSearchPlayersByLocationResponse extends EMsg
  /* 3108 */ val FTSSearchPlayersByLocationResponse: typingsSlinky.steamClient.mod.EMsg.FTSSearchPlayersByLocationResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSSearchResponse extends EMsg
  /* 3111 */ val FTSSearchResponse: typingsSlinky.steamClient.mod.EMsg.FTSSearchResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSSearchStatus extends EMsg
  /* 3112 */ val FTSSearchStatus: typingsSlinky.steamClient.mod.EMsg.FTSSearchStatus with Double = js.native
  
  // obsolete
  @js.native
  sealed trait FTSSearchStatusResponse extends EMsg
  /* 3113 */ val FTSSearchStatusResponse: typingsSlinky.steamClient.mod.EMsg.FTSSearchStatusResponse with Double = js.native
  
  @js.native
  sealed trait FailServer extends EMsg
  /* 3000 */ val FailServer: typingsSlinky.steamClient.mod.EMsg.FailServer with Double = js.native
  
  @js.native
  sealed trait FileXferData extends EMsg
  /* 1202 */ val FileXferData: typingsSlinky.steamClient.mod.EMsg.FileXferData with Double = js.native
  
  @js.native
  sealed trait FileXferDataAck extends EMsg
  /* 1204 */ val FileXferDataAck: typingsSlinky.steamClient.mod.EMsg.FileXferDataAck with Double = js.native
  
  @js.native
  sealed trait FileXferEnd extends EMsg
  /* 1203 */ val FileXferEnd: typingsSlinky.steamClient.mod.EMsg.FileXferEnd with Double = js.native
  
  @js.native
  sealed trait FileXferRequest extends EMsg
  /* 1200 */ val FileXferRequest: typingsSlinky.steamClient.mod.EMsg.FileXferRequest with Double = js.native
  
  @js.native
  sealed trait FileXferResponse extends EMsg
  /* 1201 */ val FileXferResponse: typingsSlinky.steamClient.mod.EMsg.FileXferResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait GCAchievementAwarded extends EMsg
  /* 2212 */ val GCAchievementAwarded: typingsSlinky.steamClient.mod.EMsg.GCAchievementAwarded with Double = js.native
  
  @js.native
  sealed trait GCCmdBounce extends EMsg
  /* 2204 */ val GCCmdBounce: typingsSlinky.steamClient.mod.EMsg.GCCmdBounce with Double = js.native
  
  @js.native
  sealed trait GCCmdDeploy extends EMsg
  /* 2207 */ val GCCmdDeploy: typingsSlinky.steamClient.mod.EMsg.GCCmdDeploy with Double = js.native
  
  @js.native
  sealed trait GCCmdDeployResponse extends EMsg
  /* 2208 */ val GCCmdDeployResponse: typingsSlinky.steamClient.mod.EMsg.GCCmdDeployResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait GCCmdDown extends EMsg
  /* 2206 */ val GCCmdDown: typingsSlinky.steamClient.mod.EMsg.GCCmdDown with Double = js.native
  
  // obsolete
  @js.native
  sealed trait GCCmdForceBounce extends EMsg
  /* 2205 */ val GCCmdForceBounce: typingsSlinky.steamClient.mod.EMsg.GCCmdForceBounce with Double = js.native
  
  // obsolete
  @js.native
  sealed trait GCCmdRevive extends EMsg
  /* 2203 */ val GCCmdRevive: typingsSlinky.steamClient.mod.EMsg.GCCmdRevive with Double = js.native
  
  // obsolete
  @js.native
  sealed trait GCCmdStatus extends EMsg
  /* 2216 */ val GCCmdStatus: typingsSlinky.steamClient.mod.EMsg.GCCmdStatus with Double = js.native
  
  @js.native
  sealed trait GCCmdSwitch extends EMsg
  /* 2209 */ val GCCmdSwitch: typingsSlinky.steamClient.mod.EMsg.GCCmdSwitch with Double = js.native
  
  // obsolete
  @js.native
  sealed trait GCGetAccountDetails extends EMsg
  /* 2218 */ val GCGetAccountDetails: typingsSlinky.steamClient.mod.EMsg.GCGetAccountDetails with Double = js.native
  
  // obsolete
  @js.native
  sealed trait GCGetAccountDetails_DEPRECATED extends EMsg
  /* 2218 */ val GCGetAccountDetails_DEPRECATED: typingsSlinky.steamClient.mod.EMsg.GCGetAccountDetails_DEPRECATED with Double = js.native
  
  @js.native
  sealed trait GCGetEmailTemplate extends EMsg
  /* 2220 */ val GCGetEmailTemplate: typingsSlinky.steamClient.mod.EMsg.GCGetEmailTemplate with Double = js.native
  
  @js.native
  sealed trait GCGetEmailTemplateResponse extends EMsg
  /* 2221 */ val GCGetEmailTemplateResponse: typingsSlinky.steamClient.mod.EMsg.GCGetEmailTemplateResponse with Double = js.native
  
  @js.native
  sealed trait GCHAccountLockStatusChange extends EMsg
  /* 2234 */ val GCHAccountLockStatusChange: typingsSlinky.steamClient.mod.EMsg.GCHAccountLockStatusChange with Double = js.native
  
  @js.native
  sealed trait GCHAccountPhoneNumberChange extends EMsg
  /* 2236 */ val GCHAccountPhoneNumberChange: typingsSlinky.steamClient.mod.EMsg.GCHAccountPhoneNumberChange with Double = js.native
  
  @js.native
  sealed trait GCHAccountTradeBanStatusChange extends EMsg
  /* 2233 */ val GCHAccountTradeBanStatusChange: typingsSlinky.steamClient.mod.EMsg.GCHAccountTradeBanStatusChange with Double = js.native
  
  @js.native
  sealed trait GCHAccountTwoFactorChange extends EMsg
  /* 2237 */ val GCHAccountTwoFactorChange: typingsSlinky.steamClient.mod.EMsg.GCHAccountTwoFactorChange with Double = js.native
  
  @js.native
  sealed trait GCHAccountVacStatusChange extends EMsg
  /* 2228 */ val GCHAccountVacStatusChange: typingsSlinky.steamClient.mod.EMsg.GCHAccountVacStatusChange with Double = js.native
  
  @js.native
  sealed trait GCHKillGC extends EMsg
  /* 2231 */ val GCHKillGC: typingsSlinky.steamClient.mod.EMsg.GCHKillGC with Double = js.native
  
  @js.native
  sealed trait GCHKillGCResponse extends EMsg
  /* 2232 */ val GCHKillGCResponse: typingsSlinky.steamClient.mod.EMsg.GCHKillGCResponse with Double = js.native
  
  // obsolete "renamed to GCHRelay"
  @js.native
  sealed trait GCHRelay extends EMsg
  /* 2222 */ val GCHRelay: typingsSlinky.steamClient.mod.EMsg.GCHRelay with Double = js.native
  
  @js.native
  sealed trait GCHRelayClientToIS extends EMsg
  /* 2223 */ val GCHRelayClientToIS: typingsSlinky.steamClient.mod.EMsg.GCHRelayClientToIS with Double = js.native
  
  // obsolete "renamed to GCHRelayToClient"
  @js.native
  sealed trait GCHRelayToClient extends EMsg
  /* 2223 */ val GCHRelayToClient: typingsSlinky.steamClient.mod.EMsg.GCHRelayToClient with Double = js.native
  
  @js.native
  sealed trait GCHRequestStatus extends EMsg
  /* 2226 */ val GCHRequestStatus: typingsSlinky.steamClient.mod.EMsg.GCHRequestStatus with Double = js.native
  
  @js.native
  sealed trait GCHRequestStatusResponse extends EMsg
  /* 2227 */ val GCHRequestStatusResponse: typingsSlinky.steamClient.mod.EMsg.GCHRequestStatusResponse with Double = js.native
  
  @js.native
  sealed trait GCHRequestUpdateSession extends EMsg
  /* 2225 */ val GCHRequestUpdateSession: typingsSlinky.steamClient.mod.EMsg.GCHRequestUpdateSession with Double = js.native
  
  @js.native
  sealed trait GCHSpawnGC extends EMsg
  /* 2229 */ val GCHSpawnGC: typingsSlinky.steamClient.mod.EMsg.GCHSpawnGC with Double = js.native
  
  @js.native
  sealed trait GCHSpawnGCResponse extends EMsg
  /* 2230 */ val GCHSpawnGCResponse: typingsSlinky.steamClient.mod.EMsg.GCHSpawnGCResponse with Double = js.native
  
  @js.native
  sealed trait GCHUpdateSession extends EMsg
  /* 2224 */ val GCHUpdateSession: typingsSlinky.steamClient.mod.EMsg.GCHUpdateSession with Double = js.native
  
  @js.native
  sealed trait GCHVacVerificationChange extends EMsg
  /* 2235 */ val GCHVacVerificationChange: typingsSlinky.steamClient.mod.EMsg.GCHVacVerificationChange with Double = js.native
  
  // obsolete
  @js.native
  sealed trait GCInterAppMessage extends EMsg
  /* 2219 */ val GCInterAppMessage: typingsSlinky.steamClient.mod.EMsg.GCInterAppMessage with Double = js.native
  
  @js.native
  sealed trait GCRegisterWebInterfaces extends EMsg
  /* 2217 */ val GCRegisterWebInterfaces: typingsSlinky.steamClient.mod.EMsg.GCRegisterWebInterfaces with Double = js.native
  
  // obsolete
  @js.native
  sealed trait GCRegisterWebInterfaces_Deprecated extends EMsg
  /* 2217 */ val GCRegisterWebInterfaces_Deprecated: typingsSlinky.steamClient.mod.EMsg.GCRegisterWebInterfaces_Deprecated with Double = js.native
  
  @js.native
  sealed trait GCSendClient extends EMsg
  /* 2200 */ val GCSendClient: typingsSlinky.steamClient.mod.EMsg.GCSendClient with Double = js.native
  
  @js.native
  sealed trait GCSystemMessage extends EMsg
  /* 2213 */ val GCSystemMessage: typingsSlinky.steamClient.mod.EMsg.GCSystemMessage with Double = js.native
  
  @js.native
  sealed trait GCUpdateGSState extends EMsg
  /* 2211 */ val GCUpdateGSState: typingsSlinky.steamClient.mod.EMsg.GCUpdateGSState with Double = js.native
  
  // obsolete
  @js.native
  sealed trait GCUpdatePlayedState extends EMsg
  /* 2202 */ val GCUpdatePlayedState: typingsSlinky.steamClient.mod.EMsg.GCUpdatePlayedState with Double = js.native
  
  @js.native
  sealed trait GCValidateSession extends EMsg
  /* 2214 */ val GCValidateSession: typingsSlinky.steamClient.mod.EMsg.GCValidateSession with Double = js.native
  
  // obsolete
  @js.native
  sealed trait GCValidateSessionResponse extends EMsg
  /* 2215 */ val GCValidateSessionResponse: typingsSlinky.steamClient.mod.EMsg.GCValidateSessionResponse with Double = js.native
  
  @js.native
  sealed trait GMConvertUserWallets extends EMsg
  /* 333 */ val GMConvertUserWallets: typingsSlinky.steamClient.mod.EMsg.GMConvertUserWallets with Double = js.native
  
  @js.native
  sealed trait GMDRMSync extends EMsg
  /* 320 */ val GMDRMSync: typingsSlinky.steamClient.mod.EMsg.GMDRMSync with Double = js.native
  
  @js.native
  sealed trait GMGetServiceMethodRouting extends EMsg
  /* 331 */ val GMGetServiceMethodRouting: typingsSlinky.steamClient.mod.EMsg.GMGetServiceMethodRouting with Double = js.native
  
  @js.native
  sealed trait GMGetServiceMethodRoutingResponse extends EMsg
  /* 332 */ val GMGetServiceMethodRoutingResponse: typingsSlinky.steamClient.mod.EMsg.GMGetServiceMethodRoutingResponse with Double = js.native
  
  @js.native
  sealed trait GMLoadActivationCodes extends EMsg
  /* 325 */ val GMLoadActivationCodes: typingsSlinky.steamClient.mod.EMsg.GMLoadActivationCodes with Double = js.native
  
  @js.native
  sealed trait GMQueueForFBS extends EMsg
  /* 326 */ val GMQueueForFBS: typingsSlinky.steamClient.mod.EMsg.GMQueueForFBS with Double = js.native
  
  @js.native
  sealed trait GMReportPHPError extends EMsg
  /* 319 */ val GMReportPHPError: typingsSlinky.steamClient.mod.EMsg.GMReportPHPError with Double = js.native
  
  @js.native
  sealed trait GMSBase extends EMsg
  /* 6400 */ val GMSBase: typingsSlinky.steamClient.mod.EMsg.GMSBase with Double = js.native
  
  @js.native
  sealed trait GMSClientServerQueryResponse extends EMsg
  /* 6404 */ val GMSClientServerQueryResponse: typingsSlinky.steamClient.mod.EMsg.GMSClientServerQueryResponse with Double = js.native
  
  @js.native
  sealed trait GMSGameServerReplicate extends EMsg
  /* 6401 */ val GMSGameServerReplicate: typingsSlinky.steamClient.mod.EMsg.GMSGameServerReplicate with Double = js.native
  
  @js.native
  sealed trait GMSchemaConversionResults extends EMsg
  /* 327 */ val GMSchemaConversionResults: typingsSlinky.steamClient.mod.EMsg.GMSchemaConversionResults with Double = js.native
  
  @js.native
  sealed trait GMSchemaConversionResultsResponse extends EMsg
  /* 328 */ val GMSchemaConversionResultsResponse: typingsSlinky.steamClient.mod.EMsg.GMSchemaConversionResultsResponse with Double = js.native
  
  @js.native
  sealed trait GMWriteConfigToSQL extends EMsg
  /* 324 */ val GMWriteConfigToSQL: typingsSlinky.steamClient.mod.EMsg.GMWriteConfigToSQL with Double = js.native
  
  // obsolete
  @js.native
  sealed trait GMWriteShellFailureToSQL extends EMsg
  /* 329 */ val GMWriteShellFailureToSQL: typingsSlinky.steamClient.mod.EMsg.GMWriteShellFailureToSQL with Double = js.native
  
  @js.native
  sealed trait GMWriteStatsToSOS extends EMsg
  /* 330 */ val GMWriteStatsToSOS: typingsSlinky.steamClient.mod.EMsg.GMWriteStatsToSOS with Double = js.native
  
  @js.native
  sealed trait GSApprove extends EMsg
  /* 758 */ val GSApprove: typingsSlinky.steamClient.mod.EMsg.GSApprove with Double = js.native
  
  @js.native
  sealed trait GSAssociateWithClan extends EMsg
  /* 938 */ val GSAssociateWithClan: typingsSlinky.steamClient.mod.EMsg.GSAssociateWithClan with Double = js.native
  
  @js.native
  sealed trait GSAssociateWithClanResponse extends EMsg
  /* 939 */ val GSAssociateWithClanResponse: typingsSlinky.steamClient.mod.EMsg.GSAssociateWithClanResponse with Double = js.native
  
  @js.native
  sealed trait GSComputeNewPlayerCompatibility extends EMsg
  /* 940 */ val GSComputeNewPlayerCompatibility: typingsSlinky.steamClient.mod.EMsg.GSComputeNewPlayerCompatibility with Double = js.native
  
  @js.native
  sealed trait GSComputeNewPlayerCompatibilityResponse extends EMsg
  /* 941 */ val GSComputeNewPlayerCompatibilityResponse: typingsSlinky.steamClient.mod.EMsg.GSComputeNewPlayerCompatibilityResponse with Double = js.native
  
  @js.native
  sealed trait GSDeny extends EMsg
  /* 759 */ val GSDeny: typingsSlinky.steamClient.mod.EMsg.GSDeny with Double = js.native
  
  @js.native
  sealed trait GSDisconnectNotice extends EMsg
  /* 901 */ val GSDisconnectNotice: typingsSlinky.steamClient.mod.EMsg.GSDisconnectNotice with Double = js.native
  
  @js.native
  sealed trait GSGetPlayStats extends EMsg
  /* 918 */ val GSGetPlayStats: typingsSlinky.steamClient.mod.EMsg.GSGetPlayStats with Double = js.native
  
  @js.native
  sealed trait GSGetPlayStatsResponse extends EMsg
  /* 919 */ val GSGetPlayStatsResponse: typingsSlinky.steamClient.mod.EMsg.GSGetPlayStatsResponse with Double = js.native
  
  @js.native
  sealed trait GSGetReputation extends EMsg
  /* 936 */ val GSGetReputation: typingsSlinky.steamClient.mod.EMsg.GSGetReputation with Double = js.native
  
  @js.native
  sealed trait GSGetReputationResponse extends EMsg
  /* 937 */ val GSGetReputationResponse: typingsSlinky.steamClient.mod.EMsg.GSGetReputationResponse with Double = js.native
  
  @js.native
  sealed trait GSGetUserAchievementStatus extends EMsg
  /* 910 */ val GSGetUserAchievementStatus: typingsSlinky.steamClient.mod.EMsg.GSGetUserAchievementStatus with Double = js.native
  
  @js.native
  sealed trait GSGetUserAchievementStatusResponse extends EMsg
  /* 911 */ val GSGetUserAchievementStatusResponse: typingsSlinky.steamClient.mod.EMsg.GSGetUserAchievementStatusResponse with Double = js.native
  
  @js.native
  sealed trait GSGetUserGroupStatus extends EMsg
  /* 920 */ val GSGetUserGroupStatus: typingsSlinky.steamClient.mod.EMsg.GSGetUserGroupStatus with Double = js.native
  
  @js.native
  sealed trait GSGetUserGroupStatusResponse extends EMsg
  /* 923 */ val GSGetUserGroupStatusResponse: typingsSlinky.steamClient.mod.EMsg.GSGetUserGroupStatusResponse with Double = js.native
  
  @js.native
  sealed trait GSKick extends EMsg
  /* 760 */ val GSKick: typingsSlinky.steamClient.mod.EMsg.GSKick with Double = js.native
  
  @js.native
  sealed trait GSPerformHardwareSurvey extends EMsg
  /* 5440 */ val GSPerformHardwareSurvey: typingsSlinky.steamClient.mod.EMsg.GSPerformHardwareSurvey with Double = js.native
  
  @js.native
  sealed trait GSPlayerList extends EMsg
  /* 909 */ val GSPlayerList: typingsSlinky.steamClient.mod.EMsg.GSPlayerList with Double = js.native
  
  @js.native
  sealed trait GSServerType extends EMsg
  /* 908 */ val GSServerType: typingsSlinky.steamClient.mod.EMsg.GSServerType with Double = js.native
  
  @js.native
  sealed trait GSStatus extends EMsg
  /* 903 */ val GSStatus: typingsSlinky.steamClient.mod.EMsg.GSStatus with Double = js.native
  
  @js.native
  sealed trait GSStatus2 extends EMsg
  /* 906 */ val GSStatus2: typingsSlinky.steamClient.mod.EMsg.GSStatus2 with Double = js.native
  
  @js.native
  sealed trait GSStatusReply extends EMsg
  /* 774 */ val GSStatusReply: typingsSlinky.steamClient.mod.EMsg.GSStatusReply with Double = js.native
  
  @js.native
  sealed trait GSStatusUpdate_Unused extends EMsg
  /* 907 */ val GSStatusUpdate_Unused: typingsSlinky.steamClient.mod.EMsg.GSStatusUpdate_Unused with Double = js.native
  
  @js.native
  sealed trait GSUserPlaying extends EMsg
  /* 905 */ val GSUserPlaying: typingsSlinky.steamClient.mod.EMsg.GSUserPlaying with Double = js.native
  
  @js.native
  sealed trait GameServerOutOfDate extends EMsg
  /* 6407 */ val GameServerOutOfDate: typingsSlinky.steamClient.mod.EMsg.GameServerOutOfDate with Double = js.native
  
  @js.native
  sealed trait GenericReply extends EMsg
  /* 100 */ val GenericReply: typingsSlinky.steamClient.mod.EMsg.GenericReply with Double = js.native
  
  @js.native
  sealed trait GetUserIPCountry extends EMsg
  /* 4393 */ val GetUserIPCountry: typingsSlinky.steamClient.mod.EMsg.GetUserIPCountry with Double = js.native
  
  @js.native
  sealed trait GetUserIPCountryResponse extends EMsg
  /* 4394 */ val GetUserIPCountryResponse: typingsSlinky.steamClient.mod.EMsg.GetUserIPCountryResponse with Double = js.native
  
  @js.native
  sealed trait GracefulExitShell extends EMsg
  /* 309 */ val GracefulExitShell: typingsSlinky.steamClient.mod.EMsg.GracefulExitShell with Double = js.native
  
  @js.native
  sealed trait Heartbeat extends EMsg
  /* 300 */ val Heartbeat: typingsSlinky.steamClient.mod.EMsg.Heartbeat with Double = js.native
  
  @js.native
  sealed trait HubConnect extends EMsg
  /* 124 */ val HubConnect: typingsSlinky.steamClient.mod.EMsg.HubConnect with Double = js.native
  
  @js.native
  sealed trait ISRelayToGCH extends EMsg
  /* 2222 */ val ISRelayToGCH: typingsSlinky.steamClient.mod.EMsg.ISRelayToGCH with Double = js.native
  
  @js.native
  sealed trait Invalid extends EMsg
  /* 0 */ val Invalid: typingsSlinky.steamClient.mod.EMsg.Invalid with Double = js.native
  
  @js.native
  sealed trait InvalidateDBOCacheItems extends EMsg
  /* 145 */ val InvalidateDBOCacheItems: typingsSlinky.steamClient.mod.EMsg.InvalidateDBOCacheItems with Double = js.native
  
  @js.native
  sealed trait JobHeartbeat extends EMsg
  /* 123 */ val JobHeartbeat: typingsSlinky.steamClient.mod.EMsg.JobHeartbeat with Double = js.native
  
  @js.native
  sealed trait JobHeartbeatTest extends EMsg
  /* 3001 */ val JobHeartbeatTest: typingsSlinky.steamClient.mod.EMsg.JobHeartbeatTest with Double = js.native
  
  @js.native
  sealed trait JobHeartbeatTestResponse extends EMsg
  /* 3002 */ val JobHeartbeatTestResponse: typingsSlinky.steamClient.mod.EMsg.JobHeartbeatTestResponse with Double = js.native
  
  @js.native
  sealed trait KGSAllocateKeyRange extends EMsg
  /* 7201 */ val KGSAllocateKeyRange: typingsSlinky.steamClient.mod.EMsg.KGSAllocateKeyRange with Double = js.native
  
  // obsolete
  @js.native
  sealed trait KGSAllocateKeyRangeResponse extends EMsg
  /* 7202 */ val KGSAllocateKeyRangeResponse: typingsSlinky.steamClient.mod.EMsg.KGSAllocateKeyRangeResponse with Double = js.native
  
  @js.native
  sealed trait KGSBase extends EMsg
  /* 7200 */ val KGSBase: typingsSlinky.steamClient.mod.EMsg.KGSBase with Double = js.native
  
  // obsolete
  @js.native
  sealed trait KGSGenerateGameStopWCKeys extends EMsg
  /* 7207 */ val KGSGenerateGameStopWCKeys: typingsSlinky.steamClient.mod.EMsg.KGSGenerateGameStopWCKeys with Double = js.native
  
  // obsolete
  @js.native
  sealed trait KGSGenerateGameStopWCKeysResponse extends EMsg
  /* 7208 */ val KGSGenerateGameStopWCKeysResponse: typingsSlinky.steamClient.mod.EMsg.KGSGenerateGameStopWCKeysResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait KGSGenerateKeys extends EMsg
  /* 7203 */ val KGSGenerateKeys: typingsSlinky.steamClient.mod.EMsg.KGSGenerateKeys with Double = js.native
  
  // obsolete
  @js.native
  sealed trait KGSGenerateKeysResponse extends EMsg
  /* 7204 */ val KGSGenerateKeysResponse: typingsSlinky.steamClient.mod.EMsg.KGSGenerateKeysResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait KGSRemapKeys extends EMsg
  /* 7205 */ val KGSRemapKeys: typingsSlinky.steamClient.mod.EMsg.KGSRemapKeys with Double = js.native
  
  // obsolete
  @js.native
  sealed trait KGSRemapKeysResponse extends EMsg
  /* 7206 */ val KGSRemapKeysResponse: typingsSlinky.steamClient.mod.EMsg.KGSRemapKeysResponse with Double = js.native
  
  @js.native
  sealed trait KeepAlive extends EMsg
  /* 132 */ val KeepAlive: typingsSlinky.steamClient.mod.EMsg.KeepAlive with Double = js.native
  
  @js.native
  sealed trait LBSDeleteLB extends EMsg
  /* 3210 */ val LBSDeleteLB: typingsSlinky.steamClient.mod.EMsg.LBSDeleteLB with Double = js.native
  
  @js.native
  sealed trait LBSDeleteLBEntry extends EMsg
  /* 3211 */ val LBSDeleteLBEntry: typingsSlinky.steamClient.mod.EMsg.LBSDeleteLBEntry with Double = js.native
  
  @js.native
  sealed trait LBSDeleteLBResponse extends EMsg
  /* 3214 */ val LBSDeleteLBResponse: typingsSlinky.steamClient.mod.EMsg.LBSDeleteLBResponse with Double = js.native
  
  @js.native
  sealed trait LBSFindOrCreateLB extends EMsg
  /* 3203 */ val LBSFindOrCreateLB: typingsSlinky.steamClient.mod.EMsg.LBSFindOrCreateLB with Double = js.native
  
  @js.native
  sealed trait LBSFindOrCreateLBResponse extends EMsg
  /* 3204 */ val LBSFindOrCreateLBResponse: typingsSlinky.steamClient.mod.EMsg.LBSFindOrCreateLBResponse with Double = js.native
  
  @js.native
  sealed trait LBSGetLBEntries extends EMsg
  /* 3205 */ val LBSGetLBEntries: typingsSlinky.steamClient.mod.EMsg.LBSGetLBEntries with Double = js.native
  
  @js.native
  sealed trait LBSGetLBEntriesResponse extends EMsg
  /* 3206 */ val LBSGetLBEntriesResponse: typingsSlinky.steamClient.mod.EMsg.LBSGetLBEntriesResponse with Double = js.native
  
  @js.native
  sealed trait LBSGetLBList extends EMsg
  /* 3207 */ val LBSGetLBList: typingsSlinky.steamClient.mod.EMsg.LBSGetLBList with Double = js.native
  
  @js.native
  sealed trait LBSGetLBListResponse extends EMsg
  /* 3208 */ val LBSGetLBListResponse: typingsSlinky.steamClient.mod.EMsg.LBSGetLBListResponse with Double = js.native
  
  @js.native
  sealed trait LBSResetLB extends EMsg
  /* 3212 */ val LBSResetLB: typingsSlinky.steamClient.mod.EMsg.LBSResetLB with Double = js.native
  
  @js.native
  sealed trait LBSResetLBResponse extends EMsg
  /* 3213 */ val LBSResetLBResponse: typingsSlinky.steamClient.mod.EMsg.LBSResetLBResponse with Double = js.native
  
  @js.native
  sealed trait LBSSetLBDetails extends EMsg
  /* 3209 */ val LBSSetLBDetails: typingsSlinky.steamClient.mod.EMsg.LBSSetLBDetails with Double = js.native
  
  @js.native
  sealed trait LBSSetScore extends EMsg
  /* 3201 */ val LBSSetScore: typingsSlinky.steamClient.mod.EMsg.LBSSetScore with Double = js.native
  
  @js.native
  sealed trait LBSSetScoreResponse extends EMsg
  /* 3202 */ val LBSSetScoreResponse: typingsSlinky.steamClient.mod.EMsg.LBSSetScoreResponse with Double = js.native
  
  @js.native
  sealed trait LicenseProcessingComplete extends EMsg
  /* 316 */ val LicenseProcessingComplete: typingsSlinky.steamClient.mod.EMsg.LicenseProcessingComplete with Double = js.native
  
  @js.native
  sealed trait LoadDBOCacheItem extends EMsg
  /* 143 */ val LoadDBOCacheItem: typingsSlinky.steamClient.mod.EMsg.LoadDBOCacheItem with Double = js.native
  
  @js.native
  sealed trait LoadDBOCacheItemResponse extends EMsg
  /* 144 */ val LoadDBOCacheItemResponse: typingsSlinky.steamClient.mod.EMsg.LoadDBOCacheItemResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait LogSearchCancel extends EMsg
  /* 1009 */ val LogSearchCancel: typingsSlinky.steamClient.mod.EMsg.LogSearchCancel with Double = js.native
  
  @js.native
  sealed trait LogSearchRequest extends EMsg
  /* 1007 */ val LogSearchRequest: typingsSlinky.steamClient.mod.EMsg.LogSearchRequest with Double = js.native
  
  // obsolete
  @js.native
  sealed trait LogSearchResponse extends EMsg
  /* 1008 */ val LogSearchResponse: typingsSlinky.steamClient.mod.EMsg.LogSearchResponse with Double = js.native
  
  @js.native
  sealed trait LogsinkBase extends EMsg
  /* 8800 */ val LogsinkBase: typingsSlinky.steamClient.mod.EMsg.LogsinkBase with Double = js.native
  
  @js.native
  sealed trait LogsinkWriteReport extends EMsg
  /* 8800 */ val LogsinkWriteReport: typingsSlinky.steamClient.mod.EMsg.LogsinkWriteReport with Double = js.native
  
  @js.native
  sealed trait MDSContentServerConfig extends EMsg
  /* 5828 */ val MDSContentServerConfig: typingsSlinky.steamClient.mod.EMsg.MDSContentServerConfig with Double = js.native
  
  // obsolete
  @js.native
  sealed trait MDSContentServerConfigRequest extends EMsg
  /* 5827 */ val MDSContentServerConfigRequest: typingsSlinky.steamClient.mod.EMsg.MDSContentServerConfigRequest with Double = js.native
  
  // obsolete
  @js.native
  sealed trait MDSContentServerStatsBroadcast extends EMsg
  /* 5826 */ val MDSContentServerStatsBroadcast: typingsSlinky.steamClient.mod.EMsg.MDSContentServerStatsBroadcast with Double = js.native
  
  // obsolete
  @js.native
  sealed trait MDSDownloadDepotChunksAck extends EMsg
  /* 5825 */ val MDSDownloadDepotChunksAck: typingsSlinky.steamClient.mod.EMsg.MDSDownloadDepotChunksAck with Double = js.native
  
  @js.native
  sealed trait MDSGetDepotChunk extends EMsg
  /* 5832 */ val MDSGetDepotChunk: typingsSlinky.steamClient.mod.EMsg.MDSGetDepotChunk with Double = js.native
  
  @js.native
  sealed trait MDSGetDepotChunkChunk extends EMsg
  /* 5834 */ val MDSGetDepotChunkChunk: typingsSlinky.steamClient.mod.EMsg.MDSGetDepotChunkChunk with Double = js.native
  
  @js.native
  sealed trait MDSGetDepotChunkResponse extends EMsg
  /* 5833 */ val MDSGetDepotChunkResponse: typingsSlinky.steamClient.mod.EMsg.MDSGetDepotChunkResponse with Double = js.native
  
  @js.native
  sealed trait MDSGetDepotManifest extends EMsg
  /* 5829 */ val MDSGetDepotManifest: typingsSlinky.steamClient.mod.EMsg.MDSGetDepotManifest with Double = js.native
  
  @js.native
  sealed trait MDSGetDepotManifestChunk extends EMsg
  /* 5831 */ val MDSGetDepotManifestChunk: typingsSlinky.steamClient.mod.EMsg.MDSGetDepotManifestChunk with Double = js.native
  
  @js.native
  sealed trait MDSGetDepotManifestResponse extends EMsg
  /* 5830 */ val MDSGetDepotManifestResponse: typingsSlinky.steamClient.mod.EMsg.MDSGetDepotManifestResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait MDSGetServerListForUser extends EMsg
  /* 5836 */ val MDSGetServerListForUser: typingsSlinky.steamClient.mod.EMsg.MDSGetServerListForUser with Double = js.native
  
  @js.native
  sealed trait MDSGetServerListForUserResponse extends EMsg
  /* 5837 */ val MDSGetServerListForUserResponse: typingsSlinky.steamClient.mod.EMsg.MDSGetServerListForUserResponse with Double = js.native
  
  @js.native
  sealed trait MDSGetVersionsForDepot extends EMsg
  /* 5814 */ val MDSGetVersionsForDepot: typingsSlinky.steamClient.mod.EMsg.MDSGetVersionsForDepot with Double = js.native
  
  // obsolete
  @js.native
  sealed trait MDSGetVersionsForDepotResponse extends EMsg
  /* 5815 */ val MDSGetVersionsForDepotResponse: typingsSlinky.steamClient.mod.EMsg.MDSGetVersionsForDepotResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait MDSMigrateChunk extends EMsg
  /* 5847 */ val MDSMigrateChunk: typingsSlinky.steamClient.mod.EMsg.MDSMigrateChunk with Double = js.native
  
  @js.native
  sealed trait MDSMigrateChunkResponse extends EMsg
  /* 5848 */ val MDSMigrateChunkResponse: typingsSlinky.steamClient.mod.EMsg.MDSMigrateChunkResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait MDSSetPublicVersionForDepot extends EMsg
  /* 5816 */ val MDSSetPublicVersionForDepot: typingsSlinky.steamClient.mod.EMsg.MDSSetPublicVersionForDepot with Double = js.native
  
  // obsolete
  @js.native
  sealed trait MDSSetPublicVersionForDepotResponse extends EMsg
  /* 5817 */ val MDSSetPublicVersionForDepotResponse: typingsSlinky.steamClient.mod.EMsg.MDSSetPublicVersionForDepotResponse with Double = js.native
  
  @js.native
  sealed trait MDSToAMGetDepotDecryptionKeyResponse extends EMsg
  /* 5813 */ val MDSToAMGetDepotDecryptionKeyResponse: typingsSlinky.steamClient.mod.EMsg.MDSToAMGetDepotDecryptionKeyResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait MDSToCSFlushChunk extends EMsg
  /* 5844 */ val MDSToCSFlushChunk: typingsSlinky.steamClient.mod.EMsg.MDSToCSFlushChunk with Double = js.native
  
  @js.native
  sealed trait MDSUpdateContentServerConfig extends EMsg
  /* 5835 */ val MDSUpdateContentServerConfig: typingsSlinky.steamClient.mod.EMsg.MDSUpdateContentServerConfig with Double = js.native
  
  @js.native
  sealed trait MMSBase extends EMsg
  /* 6600 */ val MMSBase: typingsSlinky.steamClient.mod.EMsg.MMSBase with Double = js.native
  
  @js.native
  sealed trait MPASBase extends EMsg
  /* 7100 */ val MPASBase: typingsSlinky.steamClient.mod.EMsg.MPASBase with Double = js.native
  
  @js.native
  sealed trait MPASVacBanReset extends EMsg
  /* 7101 */ val MPASVacBanReset: typingsSlinky.steamClient.mod.EMsg.MPASVacBanReset with Double = js.native
  
  @js.native
  sealed trait MarketingMessageUpdate extends EMsg
  /* 4216 */ val MarketingMessageUpdate: typingsSlinky.steamClient.mod.EMsg.MarketingMessageUpdate with Double = js.native
  
  @js.native
  sealed trait Multi extends EMsg
  /* 1 */ val Multi: typingsSlinky.steamClient.mod.EMsg.Multi with Double = js.native
  
  @js.native
  sealed trait NonStdMsgBase extends EMsg
  /* 6800 */ val NonStdMsgBase: typingsSlinky.steamClient.mod.EMsg.NonStdMsgBase with Double = js.native
  
  @js.native
  sealed trait NonStdMsgChase extends EMsg
  /* 6806 */ val NonStdMsgChase: typingsSlinky.steamClient.mod.EMsg.NonStdMsgChase with Double = js.native
  
  @js.native
  sealed trait NonStdMsgDFSTransfer extends EMsg
  /* 6807 */ val NonStdMsgDFSTransfer: typingsSlinky.steamClient.mod.EMsg.NonStdMsgDFSTransfer with Double = js.native
  
  @js.native
  sealed trait NonStdMsgHTTPClient extends EMsg
  /* 6803 */ val NonStdMsgHTTPClient: typingsSlinky.steamClient.mod.EMsg.NonStdMsgHTTPClient with Double = js.native
  
  @js.native
  sealed trait NonStdMsgHTTPServer extends EMsg
  /* 6802 */ val NonStdMsgHTTPServer: typingsSlinky.steamClient.mod.EMsg.NonStdMsgHTTPServer with Double = js.native
  
  // obsolete
  @js.native
  sealed trait NonStdMsgLogsink extends EMsg
  /* 6811 */ val NonStdMsgLogsink: typingsSlinky.steamClient.mod.EMsg.NonStdMsgLogsink with Double = js.native
  
  @js.native
  sealed trait NonStdMsgMemcached extends EMsg
  /* 6801 */ val NonStdMsgMemcached: typingsSlinky.steamClient.mod.EMsg.NonStdMsgMemcached with Double = js.native
  
  @js.native
  sealed trait NonStdMsgPHPSimulator extends EMsg
  /* 6805 */ val NonStdMsgPHPSimulator: typingsSlinky.steamClient.mod.EMsg.NonStdMsgPHPSimulator with Double = js.native
  
  @js.native
  sealed trait NonStdMsgRTMPServer extends EMsg
  /* 6813 */ val NonStdMsgRTMPServer: typingsSlinky.steamClient.mod.EMsg.NonStdMsgRTMPServer with Double = js.native
  
  @js.native
  sealed trait NonStdMsgSteam2Emulator extends EMsg
  /* 6812 */ val NonStdMsgSteam2Emulator: typingsSlinky.steamClient.mod.EMsg.NonStdMsgSteam2Emulator with Double = js.native
  
  @js.native
  sealed trait NonStdMsgSyslog extends EMsg
  /* 6810 */ val NonStdMsgSyslog: typingsSlinky.steamClient.mod.EMsg.NonStdMsgSyslog with Double = js.native
  
  @js.native
  sealed trait NonStdMsgTests extends EMsg
  /* 6808 */ val NonStdMsgTests: typingsSlinky.steamClient.mod.EMsg.NonStdMsgTests with Double = js.native
  
  @js.native
  sealed trait NonStdMsgUMQpipeAAPL extends EMsg
  /* 6809 */ val NonStdMsgUMQpipeAAPL: typingsSlinky.steamClient.mod.EMsg.NonStdMsgUMQpipeAAPL with Double = js.native
  
  @js.native
  sealed trait NonStdMsgWGResponse extends EMsg
  /* 6804 */ val NonStdMsgWGResponse: typingsSlinky.steamClient.mod.EMsg.NonStdMsgWGResponse with Double = js.native
  
  @js.native
  sealed trait NotificationOfSuspiciousActivity extends EMsg
  /* 4395 */ val NotificationOfSuspiciousActivity: typingsSlinky.steamClient.mod.EMsg.NotificationOfSuspiciousActivity with Double = js.native
  
  @js.native
  sealed trait NotifyWatchdog extends EMsg
  /* 314 */ val NotifyWatchdog: typingsSlinky.steamClient.mod.EMsg.NotifyWatchdog with Double = js.native
  
  @js.native
  sealed trait OGSBeginSession extends EMsg
  /* 3401 */ val OGSBeginSession: typingsSlinky.steamClient.mod.EMsg.OGSBeginSession with Double = js.native
  
  @js.native
  sealed trait OGSBeginSessionResponse extends EMsg
  /* 3402 */ val OGSBeginSessionResponse: typingsSlinky.steamClient.mod.EMsg.OGSBeginSessionResponse with Double = js.native
  
  @js.native
  sealed trait OGSEndSession extends EMsg
  /* 3403 */ val OGSEndSession: typingsSlinky.steamClient.mod.EMsg.OGSEndSession with Double = js.native
  
  @js.native
  sealed trait OGSEndSessionResponse extends EMsg
  /* 3404 */ val OGSEndSessionResponse: typingsSlinky.steamClient.mod.EMsg.OGSEndSessionResponse with Double = js.native
  
  @js.native
  sealed trait OGSWriteAppSessionRow extends EMsg
  /* 3406 */ val OGSWriteAppSessionRow: typingsSlinky.steamClient.mod.EMsg.OGSWriteAppSessionRow with Double = js.native
  
  @js.native
  sealed trait P2PIntroducerMessage extends EMsg
  /* 2502 */ val P2PIntroducerMessage: typingsSlinky.steamClient.mod.EMsg.P2PIntroducerMessage with Double = js.native
  
  @js.native
  sealed trait PICSBase extends EMsg
  /* 8900 */ val PICSBase: typingsSlinky.steamClient.mod.EMsg.PICSBase with Double = js.native
  
  @js.native
  sealed trait PSAddPackageToShoppingCart extends EMsg
  /* 5005 */ val PSAddPackageToShoppingCart: typingsSlinky.steamClient.mod.EMsg.PSAddPackageToShoppingCart with Double = js.native
  
  @js.native
  sealed trait PSAddPackageToShoppingCartResponse extends EMsg
  /* 5006 */ val PSAddPackageToShoppingCartResponse: typingsSlinky.steamClient.mod.EMsg.PSAddPackageToShoppingCartResponse with Double = js.native
  
  @js.native
  sealed trait PSAddWalletCreditToShoppingCart extends EMsg
  /* 5011 */ val PSAddWalletCreditToShoppingCart: typingsSlinky.steamClient.mod.EMsg.PSAddWalletCreditToShoppingCart with Double = js.native
  
  @js.native
  sealed trait PSAddWalletCreditToShoppingCartResponse extends EMsg
  /* 5012 */ val PSAddWalletCreditToShoppingCartResponse: typingsSlinky.steamClient.mod.EMsg.PSAddWalletCreditToShoppingCartResponse with Double = js.native
  
  @js.native
  sealed trait PSCreateShoppingCart extends EMsg
  /* 5001 */ val PSCreateShoppingCart: typingsSlinky.steamClient.mod.EMsg.PSCreateShoppingCart with Double = js.native
  
  @js.native
  sealed trait PSCreateShoppingCartResponse extends EMsg
  /* 5002 */ val PSCreateShoppingCartResponse: typingsSlinky.steamClient.mod.EMsg.PSCreateShoppingCartResponse with Double = js.native
  
  @js.native
  sealed trait PSGetShoppingCartContents extends EMsg
  /* 5009 */ val PSGetShoppingCartContents: typingsSlinky.steamClient.mod.EMsg.PSGetShoppingCartContents with Double = js.native
  
  @js.native
  sealed trait PSGetShoppingCartContentsResponse extends EMsg
  /* 5010 */ val PSGetShoppingCartContentsResponse: typingsSlinky.steamClient.mod.EMsg.PSGetShoppingCartContentsResponse with Double = js.native
  
  @js.native
  sealed trait PSIsValidShoppingCart extends EMsg
  /* 5003 */ val PSIsValidShoppingCart: typingsSlinky.steamClient.mod.EMsg.PSIsValidShoppingCart with Double = js.native
  
  @js.native
  sealed trait PSIsValidShoppingCartResponse extends EMsg
  /* 5004 */ val PSIsValidShoppingCartResponse: typingsSlinky.steamClient.mod.EMsg.PSIsValidShoppingCartResponse with Double = js.native
  
  @js.native
  sealed trait PSRemoveLineItemFromShoppingCart extends EMsg
  /* 5007 */ val PSRemoveLineItemFromShoppingCart: typingsSlinky.steamClient.mod.EMsg.PSRemoveLineItemFromShoppingCart with Double = js.native
  
  @js.native
  sealed trait PSRemoveLineItemFromShoppingCartResponse extends EMsg
  /* 5008 */ val PSRemoveLineItemFromShoppingCartResponse: typingsSlinky.steamClient.mod.EMsg.PSRemoveLineItemFromShoppingCartResponse with Double = js.native
  
  @js.native
  sealed trait PhysicalBoxInventory extends EMsg
  /* 321 */ val PhysicalBoxInventory: typingsSlinky.steamClient.mod.EMsg.PhysicalBoxInventory with Double = js.native
  
  // obsolete
  @js.native
  sealed trait Ping extends EMsg
  /* 139 */ val Ping: typingsSlinky.steamClient.mod.EMsg.Ping with Double = js.native
  
  @js.native
  sealed trait PingResponse extends EMsg
  /* 140 */ val PingResponse: typingsSlinky.steamClient.mod.EMsg.PingResponse with Double = js.native
  
  @js.native
  sealed trait PrepareToExit extends EMsg
  /* 226 */ val PrepareToExit: typingsSlinky.steamClient.mod.EMsg.PrepareToExit with Double = js.native
  
  @js.native
  sealed trait ProtobufWrapped extends EMsg
  /* 2 */ val ProtobufWrapped: typingsSlinky.steamClient.mod.EMsg.ProtobufWrapped with Double = js.native
  
  @js.native
  sealed trait ProvideWindowsEventLogEntries extends EMsg
  /* 234 */ val ProvideWindowsEventLogEntries: typingsSlinky.steamClient.mod.EMsg.ProvideWindowsEventLogEntries with Double = js.native
  
  @js.native
  sealed trait QuestServerBase extends EMsg
  /* 9300 */ val QuestServerBase: typingsSlinky.steamClient.mod.EMsg.QuestServerBase with Double = js.native
  
  @js.native
  sealed trait QueuedEmailsComplete extends EMsg
  /* 318 */ val QueuedEmailsComplete: typingsSlinky.steamClient.mod.EMsg.QueuedEmailsComplete with Double = js.native
  
  @js.native
  sealed trait RMDeleteMemcachedKeys extends EMsg
  /* 7803 */ val RMDeleteMemcachedKeys: typingsSlinky.steamClient.mod.EMsg.RMDeleteMemcachedKeys with Double = js.native
  
  @js.native
  sealed trait RMMsgTraceAddTrigger extends EMsg
  /* 7806 */ val RMMsgTraceAddTrigger: typingsSlinky.steamClient.mod.EMsg.RMMsgTraceAddTrigger with Double = js.native
  
  @js.native
  sealed trait RMMsgTraceEvent extends EMsg
  /* 7808 */ val RMMsgTraceEvent: typingsSlinky.steamClient.mod.EMsg.RMMsgTraceEvent with Double = js.native
  
  @js.native
  sealed trait RMMsgTraceRemoveTrigger extends EMsg
  /* 7807 */ val RMMsgTraceRemoveTrigger: typingsSlinky.steamClient.mod.EMsg.RMMsgTraceRemoveTrigger with Double = js.native
  
  @js.native
  sealed trait RMRange extends EMsg
  /* 7800 */ val RMRange: typingsSlinky.steamClient.mod.EMsg.RMRange with Double = js.native
  
  @js.native
  sealed trait RMRemoteInvoke extends EMsg
  /* 7804 */ val RMRemoteInvoke: typingsSlinky.steamClient.mod.EMsg.RMRemoteInvoke with Double = js.native
  
  @js.native
  sealed trait RMTestVerisignOTP extends EMsg
  /* 7800 */ val RMTestVerisignOTP: typingsSlinky.steamClient.mod.EMsg.RMTestVerisignOTP with Double = js.native
  
  @js.native
  sealed trait RMTestVerisignOTPResponse extends EMsg
  /* 7801 */ val RMTestVerisignOTPResponse: typingsSlinky.steamClient.mod.EMsg.RMTestVerisignOTPResponse with Double = js.native
  
  @js.native
  sealed trait RemoteClientAcceptEULA extends EMsg
  /* 9509 */ val RemoteClientAcceptEULA: typingsSlinky.steamClient.mod.EMsg.RemoteClientAcceptEULA with Double = js.native
  
  @js.native
  sealed trait RemoteClientAppStatus extends EMsg
  /* 9502 */ val RemoteClientAppStatus: typingsSlinky.steamClient.mod.EMsg.RemoteClientAppStatus with Double = js.native
  
  @js.native
  sealed trait RemoteClientAuth extends EMsg
  /* 9500 */ val RemoteClientAuth: typingsSlinky.steamClient.mod.EMsg.RemoteClientAuth with Double = js.native
  
  @js.native
  sealed trait RemoteClientAuthResponse extends EMsg
  /* 9501 */ val RemoteClientAuthResponse: typingsSlinky.steamClient.mod.EMsg.RemoteClientAuthResponse with Double = js.native
  
  @js.native
  sealed trait RemoteClientBase extends EMsg
  /* 9500 */ val RemoteClientBase: typingsSlinky.steamClient.mod.EMsg.RemoteClientBase with Double = js.native
  
  @js.native
  sealed trait RemoteClientGetControllerConfig extends EMsg
  /* 9510 */ val RemoteClientGetControllerConfig: typingsSlinky.steamClient.mod.EMsg.RemoteClientGetControllerConfig with Double = js.native
  
  @js.native
  sealed trait RemoteClientGetControllerConfigResposne extends EMsg
  /* 9511 */ val RemoteClientGetControllerConfigResposne: typingsSlinky.steamClient.mod.EMsg.RemoteClientGetControllerConfigResposne with Double = js.native
  
  @js.native
  sealed trait RemoteClientPing extends EMsg
  /* 9505 */ val RemoteClientPing: typingsSlinky.steamClient.mod.EMsg.RemoteClientPing with Double = js.native
  
  @js.native
  sealed trait RemoteClientPingResponse extends EMsg
  /* 9506 */ val RemoteClientPingResponse: typingsSlinky.steamClient.mod.EMsg.RemoteClientPingResponse with Double = js.native
  
  @js.native
  sealed trait RemoteClientStartStream extends EMsg
  /* 9503 */ val RemoteClientStartStream: typingsSlinky.steamClient.mod.EMsg.RemoteClientStartStream with Double = js.native
  
  @js.native
  sealed trait RemoteClientStartStreamResponse extends EMsg
  /* 9504 */ val RemoteClientStartStreamResponse: typingsSlinky.steamClient.mod.EMsg.RemoteClientStartStreamResponse with Double = js.native
  
  @js.native
  sealed trait RemoteClientStreamingEnabled extends EMsg
  /* 9512 */ val RemoteClientStreamingEnabled: typingsSlinky.steamClient.mod.EMsg.RemoteClientStreamingEnabled with Double = js.native
  
  // obsolete
  @js.native
  sealed trait RemoteSysID extends EMsg
  /* 128 */ val RemoteSysID: typingsSlinky.steamClient.mod.EMsg.RemoteSysID with Double = js.native
  
  @js.native
  sealed trait ReqChallenge extends EMsg
  /* 600 */ val ReqChallenge: typingsSlinky.steamClient.mod.EMsg.ReqChallenge with Double = js.native
  
  @js.native
  sealed trait ReqChallengeTest extends EMsg
  /* 602 */ val ReqChallengeTest: typingsSlinky.steamClient.mod.EMsg.ReqChallengeTest with Double = js.native
  
  @js.native
  sealed trait RequestFullStatsBlock extends EMsg
  /* 142 */ val RequestFullStatsBlock: typingsSlinky.steamClient.mod.EMsg.RequestFullStatsBlock with Double = js.native
  
  @js.native
  sealed trait RequestStatHistory extends EMsg
  /* 1014 */ val RequestStatHistory: typingsSlinky.steamClient.mod.EMsg.RequestStatHistory with Double = js.native
  
  @js.native
  sealed trait RequestWindowsEventLogEntries extends EMsg
  /* 233 */ val RequestWindowsEventLogEntries: typingsSlinky.steamClient.mod.EMsg.RequestWindowsEventLogEntries with Double = js.native
  
  @js.native
  sealed trait RouteMessage extends EMsg
  /* 127 */ val RouteMessage: typingsSlinky.steamClient.mod.EMsg.RouteMessage with Double = js.native
  
  @js.native
  sealed trait SCIDRequest extends EMsg
  /* 120 */ val SCIDRequest: typingsSlinky.steamClient.mod.EMsg.SCIDRequest with Double = js.native
  
  @js.native
  sealed trait SCIDResponse extends EMsg
  /* 121 */ val SCIDResponse: typingsSlinky.steamClient.mod.EMsg.SCIDResponse with Double = js.native
  
  // obsolete "renamed to SLCBase"
  @js.native
  sealed trait SLCBase extends EMsg
  /* 9400 */ val SLCBase: typingsSlinky.steamClient.mod.EMsg.SLCBase with Double = js.native
  
  @js.native
  sealed trait SLCOwnerLibraryChanged extends EMsg
  /* 9407 */ val SLCOwnerLibraryChanged: typingsSlinky.steamClient.mod.EMsg.SLCOwnerLibraryChanged with Double = js.native
  
  @js.native
  sealed trait SLCRequestUserSessionStatus extends EMsg
  /* 9401 */ val SLCRequestUserSessionStatus: typingsSlinky.steamClient.mod.EMsg.SLCRequestUserSessionStatus with Double = js.native
  
  @js.native
  sealed trait SLCSharedLibraryChanged extends EMsg
  /* 9408 */ val SLCSharedLibraryChanged: typingsSlinky.steamClient.mod.EMsg.SLCSharedLibraryChanged with Double = js.native
  
  @js.native
  sealed trait SLCSharedLicensesLockStatus extends EMsg
  /* 9402 */ val SLCSharedLicensesLockStatus: typingsSlinky.steamClient.mod.EMsg.SLCSharedLicensesLockStatus with Double = js.native
  
  @js.native
  sealed trait SLCUserSessionStatus extends EMsg
  /* 9400 */ val SLCUserSessionStatus: typingsSlinky.steamClient.mod.EMsg.SLCUserSessionStatus with Double = js.native
  
  @js.native
  sealed trait SMExpensiveReport extends EMsg
  /* 2902 */ val SMExpensiveReport: typingsSlinky.steamClient.mod.EMsg.SMExpensiveReport with Double = js.native
  
  @js.native
  sealed trait SMFishingReport extends EMsg
  /* 2904 */ val SMFishingReport: typingsSlinky.steamClient.mod.EMsg.SMFishingReport with Double = js.native
  
  @js.native
  sealed trait SMGetSchemaConversionResults extends EMsg
  /* 2907 */ val SMGetSchemaConversionResults: typingsSlinky.steamClient.mod.EMsg.SMGetSchemaConversionResults with Double = js.native
  
  // obsolete
  @js.native
  sealed trait SMGetSchemaConversionResultsResponse extends EMsg
  /* 2908 */ val SMGetSchemaConversionResultsResponse: typingsSlinky.steamClient.mod.EMsg.SMGetSchemaConversionResultsResponse with Double = js.native
  
  @js.native
  sealed trait SMHourlyReport extends EMsg
  /* 2903 */ val SMHourlyReport: typingsSlinky.steamClient.mod.EMsg.SMHourlyReport with Double = js.native
  
  @js.native
  sealed trait SMMonitorSpace extends EMsg
  /* 2906 */ val SMMonitorSpace: typingsSlinky.steamClient.mod.EMsg.SMMonitorSpace with Double = js.native
  
  @js.native
  sealed trait SMPartitionRenames extends EMsg
  /* 2905 */ val SMPartitionRenames: typingsSlinky.steamClient.mod.EMsg.SMPartitionRenames with Double = js.native
  
  @js.native
  sealed trait SecretsBase extends EMsg
  /* 8600 */ val SecretsBase: typingsSlinky.steamClient.mod.EMsg.SecretsBase with Double = js.native
  
  @js.native
  sealed trait SecretsCredentialPairResponse extends EMsg
  /* 8601 */ val SecretsCredentialPairResponse: typingsSlinky.steamClient.mod.EMsg.SecretsCredentialPairResponse with Double = js.native
  
  @js.native
  sealed trait SecretsRequestCredentialPair extends EMsg
  /* 8600 */ val SecretsRequestCredentialPair: typingsSlinky.steamClient.mod.EMsg.SecretsRequestCredentialPair with Double = js.native
  
  @js.native
  sealed trait SecretsRequestServerIdentity extends EMsg
  /* 8602 */ val SecretsRequestServerIdentity: typingsSlinky.steamClient.mod.EMsg.SecretsRequestServerIdentity with Double = js.native
  
  // obsolete
  @js.native
  sealed trait SecretsServerIdentityResponse extends EMsg
  /* 8603 */ val SecretsServerIdentityResponse: typingsSlinky.steamClient.mod.EMsg.SecretsServerIdentityResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait SecretsUpdateServerIdentities extends EMsg
  /* 8604 */ val SecretsUpdateServerIdentities: typingsSlinky.steamClient.mod.EMsg.SecretsUpdateServerIdentities with Double = js.native
  
  @js.native
  sealed trait ServiceMethod extends EMsg
  /* 146 */ val ServiceMethod: typingsSlinky.steamClient.mod.EMsg.ServiceMethod with Double = js.native
  
  @js.native
  sealed trait ServiceMethodResponse extends EMsg
  /* 147 */ val ServiceMethodResponse: typingsSlinky.steamClient.mod.EMsg.ServiceMethodResponse with Double = js.native
  
  @js.native
  sealed trait SetTestFlag extends EMsg
  /* 317 */ val SetTestFlag: typingsSlinky.steamClient.mod.EMsg.SetTestFlag with Double = js.native
  
  @js.native
  sealed trait ShellCheckWindowsUpdates extends EMsg
  /* 237 */ val ShellCheckWindowsUpdates: typingsSlinky.steamClient.mod.EMsg.ShellCheckWindowsUpdates with Double = js.native
  
  @js.native
  sealed trait ShellCheckWindowsUpdatesResponse extends EMsg
  /* 238 */ val ShellCheckWindowsUpdatesResponse: typingsSlinky.steamClient.mod.EMsg.ShellCheckWindowsUpdatesResponse with Double = js.native
  
  @js.native
  sealed trait ShellConfigInfoUpdate extends EMsg
  /* 230 */ val ShellConfigInfoUpdate: typingsSlinky.steamClient.mod.EMsg.ShellConfigInfoUpdate with Double = js.native
  
  @js.native
  sealed trait ShellFailed extends EMsg
  /* 301 */ val ShellFailed: typingsSlinky.steamClient.mod.EMsg.ShellFailed with Double = js.native
  
  @js.native
  sealed trait ShellFlushUserLicenseCache extends EMsg
  /* 239 */ val ShellFlushUserLicenseCache: typingsSlinky.steamClient.mod.EMsg.ShellFlushUserLicenseCache with Double = js.native
  
  @js.native
  sealed trait ShellSearchLogs extends EMsg
  /* 235 */ val ShellSearchLogs: typingsSlinky.steamClient.mod.EMsg.ShellSearchLogs with Double = js.native
  
  @js.native
  sealed trait ShellSearchLogsResponse extends EMsg
  /* 236 */ val ShellSearchLogsResponse: typingsSlinky.steamClient.mod.EMsg.ShellSearchLogsResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait StatHistory extends EMsg
  /* 1015 */ val StatHistory: typingsSlinky.steamClient.mod.EMsg.StatHistory with Double = js.native
  
  @js.native
  sealed trait Stats extends EMsg
  /* 141 */ val Stats: typingsSlinky.steamClient.mod.EMsg.Stats with Double = js.native
  
  @js.native
  sealed trait StatsDeprecated extends EMsg
  /* 138 */ val StatsDeprecated: typingsSlinky.steamClient.mod.EMsg.StatsDeprecated with Double = js.native
  
  @js.native
  sealed trait StoreBase extends EMsg
  /* 8000 */ val StoreBase: typingsSlinky.steamClient.mod.EMsg.StoreBase with Double = js.native
  
  @js.native
  sealed trait StoreUpdateRecommendationCount extends EMsg
  /* 8000 */ val StoreUpdateRecommendationCount: typingsSlinky.steamClient.mod.EMsg.StoreUpdateRecommendationCount with Double = js.native
  
  @js.native
  sealed trait Subscribe extends EMsg
  /* 126 */ val Subscribe: typingsSlinky.steamClient.mod.EMsg.Subscribe with Double = js.native
  
  @js.native
  sealed trait TestInitDB extends EMsg
  /* 323 */ val TestInitDB: typingsSlinky.steamClient.mod.EMsg.TestInitDB with Double = js.native
  
  @js.native
  sealed trait TestResetServer extends EMsg
  /* 228 */ val TestResetServer: typingsSlinky.steamClient.mod.EMsg.TestResetServer with Double = js.native
  
  @js.native
  sealed trait TestWorkerProcess extends EMsg
  /* 9200 */ val TestWorkerProcess: typingsSlinky.steamClient.mod.EMsg.TestWorkerProcess with Double = js.native
  
  @js.native
  sealed trait TestWorkerProcessLoadUnloadModuleRequest extends EMsg
  /* 9200 */ val TestWorkerProcessLoadUnloadModuleRequest: typingsSlinky.steamClient.mod.EMsg.TestWorkerProcessLoadUnloadModuleRequest with Double = js.native
  
  @js.native
  sealed trait TestWorkerProcessLoadUnloadModuleResponse extends EMsg
  /* 9201 */ val TestWorkerProcessLoadUnloadModuleResponse: typingsSlinky.steamClient.mod.EMsg.TestWorkerProcessLoadUnloadModuleResponse with Double = js.native
  
  @js.native
  sealed trait TestWorkerProcessServiceModuleCallRequest extends EMsg
  /* 9202 */ val TestWorkerProcessServiceModuleCallRequest: typingsSlinky.steamClient.mod.EMsg.TestWorkerProcessServiceModuleCallRequest with Double = js.native
  
  @js.native
  sealed trait TestWorkerProcessServiceModuleCallResponse extends EMsg
  /* 9203 */ val TestWorkerProcessServiceModuleCallResponse: typingsSlinky.steamClient.mod.EMsg.TestWorkerProcessServiceModuleCallResponse with Double = js.native
  
  @js.native
  sealed trait TimestampRequest extends EMsg
  /* 149 */ val TimestampRequest: typingsSlinky.steamClient.mod.EMsg.TimestampRequest with Double = js.native
  
  @js.native
  sealed trait TimestampResponse extends EMsg
  /* 150 */ val TimestampResponse: typingsSlinky.steamClient.mod.EMsg.TimestampResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMAddTaggedScreenshot extends EMsg
  /* 7335 */ val UCMAddTaggedScreenshot: typingsSlinky.steamClient.mod.EMsg.UCMAddTaggedScreenshot with Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMBase extends EMsg
  /* 7300 */ val UCMBase: typingsSlinky.steamClient.mod.EMsg.UCMBase with Double = js.native
  
  @js.native
  sealed trait UCMDeleteOldScreenshot extends EMsg
  /* 7372 */ val UCMDeleteOldScreenshot: typingsSlinky.steamClient.mod.EMsg.UCMDeleteOldScreenshot with Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMDeleteOldScreenshotResponse extends EMsg
  /* 7373 */ val UCMDeleteOldScreenshotResponse: typingsSlinky.steamClient.mod.EMsg.UCMDeleteOldScreenshotResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMDeleteOldVideo extends EMsg
  /* 7374 */ val UCMDeleteOldVideo: typingsSlinky.steamClient.mod.EMsg.UCMDeleteOldVideo with Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMDeleteOldVideoResponse extends EMsg
  /* 7375 */ val UCMDeleteOldVideoResponse: typingsSlinky.steamClient.mod.EMsg.UCMDeleteOldVideoResponse with Double = js.native
  
  @js.native
  sealed trait UCMDeletePublishedFile extends EMsg
  /* 7329 */ val UCMDeletePublishedFile: typingsSlinky.steamClient.mod.EMsg.UCMDeletePublishedFile with Double = js.native
  
  @js.native
  sealed trait UCMDeletePublishedFileResponse extends EMsg
  /* 7330 */ val UCMDeletePublishedFileResponse: typingsSlinky.steamClient.mod.EMsg.UCMDeletePublishedFileResponse with Double = js.native
  
  @js.native
  sealed trait UCMFixStatsPublishedFile extends EMsg
  /* 7371 */ val UCMFixStatsPublishedFile: typingsSlinky.steamClient.mod.EMsg.UCMFixStatsPublishedFile with Double = js.native
  
  @js.native
  sealed trait UCMGetPublishedFilesForUser extends EMsg
  /* 7362 */ val UCMGetPublishedFilesForUser: typingsSlinky.steamClient.mod.EMsg.UCMGetPublishedFilesForUser with Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMGetPublishedFilesForUserResponse extends EMsg
  /* 7363 */ val UCMGetPublishedFilesForUserResponse: typingsSlinky.steamClient.mod.EMsg.UCMGetPublishedFilesForUserResponse with Double = js.native
  
  @js.native
  sealed trait UCMGetUserSubscribedFiles extends EMsg
  /* 7369 */ val UCMGetUserSubscribedFiles: typingsSlinky.steamClient.mod.EMsg.UCMGetUserSubscribedFiles with Double = js.native
  
  @js.native
  sealed trait UCMGetUserSubscribedFilesResponse extends EMsg
  /* 7370 */ val UCMGetUserSubscribedFilesResponse: typingsSlinky.steamClient.mod.EMsg.UCMGetUserSubscribedFilesResponse with Double = js.native
  
  @js.native
  sealed trait UCMPublishFile extends EMsg
  /* 7351 */ val UCMPublishFile: typingsSlinky.steamClient.mod.EMsg.UCMPublishFile with Double = js.native
  
  @js.native
  sealed trait UCMPublishFileResponse extends EMsg
  /* 7352 */ val UCMPublishFileResponse: typingsSlinky.steamClient.mod.EMsg.UCMPublishFileResponse with Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileChildAdd extends EMsg
  /* 7353 */ val UCMPublishedFileChildAdd: typingsSlinky.steamClient.mod.EMsg.UCMPublishedFileChildAdd with Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileChildAddResponse extends EMsg
  /* 7354 */ val UCMPublishedFileChildAddResponse: typingsSlinky.steamClient.mod.EMsg.UCMPublishedFileChildAddResponse with Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileChildChangeSortOrder extends EMsg
  /* 7357 */ val UCMPublishedFileChildChangeSortOrder: typingsSlinky.steamClient.mod.EMsg.UCMPublishedFileChildChangeSortOrder with Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMPublishedFileChildChangeSortOrderResponse extends EMsg
  /* 7358 */ val UCMPublishedFileChildChangeSortOrderResponse: typingsSlinky.steamClient.mod.EMsg.UCMPublishedFileChildChangeSortOrderResponse with Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileChildRemove extends EMsg
  /* 7355 */ val UCMPublishedFileChildRemove: typingsSlinky.steamClient.mod.EMsg.UCMPublishedFileChildRemove with Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileChildRemoveResponse extends EMsg
  /* 7356 */ val UCMPublishedFileChildRemoveResponse: typingsSlinky.steamClient.mod.EMsg.UCMPublishedFileChildRemoveResponse with Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileContentUpdated extends EMsg
  /* 7380 */ val UCMPublishedFileContentUpdated: typingsSlinky.steamClient.mod.EMsg.UCMPublishedFileContentUpdated with Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMPublishedFileParentChanged extends EMsg
  /* 7359 */ val UCMPublishedFileParentChanged: typingsSlinky.steamClient.mod.EMsg.UCMPublishedFileParentChanged with Double = js.native
  
  @js.native
  sealed trait UCMPublishedFilePreviewAdd extends EMsg
  /* 7341 */ val UCMPublishedFilePreviewAdd: typingsSlinky.steamClient.mod.EMsg.UCMPublishedFilePreviewAdd with Double = js.native
  
  @js.native
  sealed trait UCMPublishedFilePreviewAddResponse extends EMsg
  /* 7342 */ val UCMPublishedFilePreviewAddResponse: typingsSlinky.steamClient.mod.EMsg.UCMPublishedFilePreviewAddResponse with Double = js.native
  
  @js.native
  sealed trait UCMPublishedFilePreviewChangeSortOrder extends EMsg
  /* 7345 */ val UCMPublishedFilePreviewChangeSortOrder: typingsSlinky.steamClient.mod.EMsg.UCMPublishedFilePreviewChangeSortOrder with Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMPublishedFilePreviewChangeSortOrderResponse extends EMsg
  /* 7346 */ val UCMPublishedFilePreviewChangeSortOrderResponse: typingsSlinky.steamClient.mod.EMsg.UCMPublishedFilePreviewChangeSortOrderResponse with Double = js.native
  
  @js.native
  sealed trait UCMPublishedFilePreviewRemove extends EMsg
  /* 7343 */ val UCMPublishedFilePreviewRemove: typingsSlinky.steamClient.mod.EMsg.UCMPublishedFilePreviewRemove with Double = js.native
  
  @js.native
  sealed trait UCMPublishedFilePreviewRemoveResponse extends EMsg
  /* 7344 */ val UCMPublishedFilePreviewRemoveResponse: typingsSlinky.steamClient.mod.EMsg.UCMPublishedFilePreviewRemoveResponse with Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileReported extends EMsg
  /* 7339 */ val UCMPublishedFileReported: typingsSlinky.steamClient.mod.EMsg.UCMPublishedFileReported with Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileSubscribed extends EMsg
  /* 7349 */ val UCMPublishedFileSubscribed: typingsSlinky.steamClient.mod.EMsg.UCMPublishedFileSubscribed with Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileUnsubscribed extends EMsg
  /* 7350 */ val UCMPublishedFileUnsubscribed: typingsSlinky.steamClient.mod.EMsg.UCMPublishedFileUnsubscribed with Double = js.native
  
  @js.native
  sealed trait UCMPublishedFileUpdated extends EMsg
  /* 7381 */ val UCMPublishedFileUpdated: typingsSlinky.steamClient.mod.EMsg.UCMPublishedFileUpdated with Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMReloadPublishedFile extends EMsg
  /* 7337 */ val UCMReloadPublishedFile: typingsSlinky.steamClient.mod.EMsg.UCMReloadPublishedFile with Double = js.native
  
  @js.native
  sealed trait UCMReloadUserFileListCaches extends EMsg
  /* 7338 */ val UCMReloadUserFileListCaches: typingsSlinky.steamClient.mod.EMsg.UCMReloadUserFileListCaches with Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMRemoveTaggedScreenshot extends EMsg
  /* 7336 */ val UCMRemoveTaggedScreenshot: typingsSlinky.steamClient.mod.EMsg.UCMRemoveTaggedScreenshot with Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMResetCommunityContent extends EMsg
  /* 7307 */ val UCMResetCommunityContent: typingsSlinky.steamClient.mod.EMsg.UCMResetCommunityContent with Double = js.native
  
  @js.native
  sealed trait UCMResetCommunityContentResponse extends EMsg
  /* 7308 */ val UCMResetCommunityContentResponse: typingsSlinky.steamClient.mod.EMsg.UCMResetCommunityContentResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMUpdateOldScreenshotPrivacy extends EMsg
  /* 7376 */ val UCMUpdateOldScreenshotPrivacy: typingsSlinky.steamClient.mod.EMsg.UCMUpdateOldScreenshotPrivacy with Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMUpdateOldScreenshotPrivacyResponse extends EMsg
  /* 7377 */ val UCMUpdateOldScreenshotPrivacyResponse: typingsSlinky.steamClient.mod.EMsg.UCMUpdateOldScreenshotPrivacyResponse with Double = js.native
  
  @js.native
  sealed trait UCMUpdatePublishedFile extends EMsg
  /* 7327 */ val UCMUpdatePublishedFile: typingsSlinky.steamClient.mod.EMsg.UCMUpdatePublishedFile with Double = js.native
  
  @js.native
  sealed trait UCMUpdatePublishedFileBan extends EMsg
  /* 7332 */ val UCMUpdatePublishedFileBan: typingsSlinky.steamClient.mod.EMsg.UCMUpdatePublishedFileBan with Double = js.native
  
  @js.native
  sealed trait UCMUpdatePublishedFileBanResponse extends EMsg
  /* 7333 */ val UCMUpdatePublishedFileBanResponse: typingsSlinky.steamClient.mod.EMsg.UCMUpdatePublishedFileBanResponse with Double = js.native
  
  @js.native
  sealed trait UCMUpdatePublishedFileIncompatibleStatus extends EMsg
  /* 7340 */ val UCMUpdatePublishedFileIncompatibleStatus: typingsSlinky.steamClient.mod.EMsg.UCMUpdatePublishedFileIncompatibleStatus with Double = js.native
  
  @js.native
  sealed trait UCMUpdatePublishedFileResponse extends EMsg
  /* 7328 */ val UCMUpdatePublishedFileResponse: typingsSlinky.steamClient.mod.EMsg.UCMUpdatePublishedFileResponse with Double = js.native
  
  @js.native
  sealed trait UCMUpdatePublishedFileStat extends EMsg
  /* 7331 */ val UCMUpdatePublishedFileStat: typingsSlinky.steamClient.mod.EMsg.UCMUpdatePublishedFileStat with Double = js.native
  
  @js.native
  sealed trait UCMUpdateTaggedScreenshot extends EMsg
  /* 7334 */ val UCMUpdateTaggedScreenshot: typingsSlinky.steamClient.mod.EMsg.UCMUpdateTaggedScreenshot with Double = js.native
  
  @js.native
  sealed trait UCMValidateObjectExists extends EMsg
  /* 7303 */ val UCMValidateObjectExists: typingsSlinky.steamClient.mod.EMsg.UCMValidateObjectExists with Double = js.native
  
  // obsolete
  @js.native
  sealed trait UCMValidateObjectExistsResponse extends EMsg
  /* 7304 */ val UCMValidateObjectExistsResponse: typingsSlinky.steamClient.mod.EMsg.UCMValidateObjectExistsResponse with Double = js.native
  
  @js.native
  sealed trait UDSBase extends EMsg
  /* 7000 */ val UDSBase: typingsSlinky.steamClient.mod.EMsg.UDSBase with Double = js.native
  
  @js.native
  sealed trait UDSFindSession extends EMsg
  /* 7006 */ val UDSFindSession: typingsSlinky.steamClient.mod.EMsg.UDSFindSession with Double = js.native
  
  @js.native
  sealed trait UDSFindSessionResponse extends EMsg
  /* 7007 */ val UDSFindSessionResponse: typingsSlinky.steamClient.mod.EMsg.UDSFindSessionResponse with Double = js.native
  
  // obsolete "renamed to UDSHasSession"
  @js.native
  sealed trait UDSHasSession extends EMsg
  /* 7006 */ val UDSHasSession: typingsSlinky.steamClient.mod.EMsg.UDSHasSession with Double = js.native
  
  // obsolete "renamed to UDSHasSessionResponse"
  @js.native
  sealed trait UDSHasSessionResponse extends EMsg
  /* 7007 */ val UDSHasSessionResponse: typingsSlinky.steamClient.mod.EMsg.UDSHasSessionResponse with Double = js.native
  
  @js.native
  sealed trait UDSRenderUserAuth extends EMsg
  /* 7003 */ val UDSRenderUserAuth: typingsSlinky.steamClient.mod.EMsg.UDSRenderUserAuth with Double = js.native
  
  @js.native
  sealed trait UDSRenderUserAuthResponse extends EMsg
  /* 7004 */ val UDSRenderUserAuthResponse: typingsSlinky.steamClient.mod.EMsg.UDSRenderUserAuthResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait UFSDownloadChunk extends EMsg
  /* 5223 */ val UFSDownloadChunk: typingsSlinky.steamClient.mod.EMsg.UFSDownloadChunk with Double = js.native
  
  @js.native
  sealed trait UFSDownloadChunkRequest extends EMsg
  /* 5246 */ val UFSDownloadChunkRequest: typingsSlinky.steamClient.mod.EMsg.UFSDownloadChunkRequest with Double = js.native
  
  @js.native
  sealed trait UFSDownloadChunkResponse extends EMsg
  /* 5247 */ val UFSDownloadChunkResponse: typingsSlinky.steamClient.mod.EMsg.UFSDownloadChunkResponse with Double = js.native
  
  @js.native
  sealed trait UFSDownloadFinishRequest extends EMsg
  /* 5248 */ val UFSDownloadFinishRequest: typingsSlinky.steamClient.mod.EMsg.UFSDownloadFinishRequest with Double = js.native
  
  @js.native
  sealed trait UFSDownloadFinishResponse extends EMsg
  /* 5249 */ val UFSDownloadFinishResponse: typingsSlinky.steamClient.mod.EMsg.UFSDownloadFinishResponse with Double = js.native
  
  @js.native
  sealed trait UFSDownloadRequest extends EMsg
  /* 5221 */ val UFSDownloadRequest: typingsSlinky.steamClient.mod.EMsg.UFSDownloadRequest with Double = js.native
  
  // obsolete
  @js.native
  sealed trait UFSDownloadResponse extends EMsg
  /* 5222 */ val UFSDownloadResponse: typingsSlinky.steamClient.mod.EMsg.UFSDownloadResponse with Double = js.native
  
  @js.native
  sealed trait UFSDownloadStartRequest extends EMsg
  /* 5244 */ val UFSDownloadStartRequest: typingsSlinky.steamClient.mod.EMsg.UFSDownloadStartRequest with Double = js.native
  
  @js.native
  sealed trait UFSDownloadStartResponse extends EMsg
  /* 5245 */ val UFSDownloadStartResponse: typingsSlinky.steamClient.mod.EMsg.UFSDownloadStartResponse with Double = js.native
  
  @js.native
  sealed trait UFSFlushURLCache extends EMsg
  /* 5250 */ val UFSFlushURLCache: typingsSlinky.steamClient.mod.EMsg.UFSFlushURLCache with Double = js.native
  
  @js.native
  sealed trait UFSGetUGCURLs extends EMsg
  /* 5240 */ val UFSGetUGCURLs: typingsSlinky.steamClient.mod.EMsg.UFSGetUGCURLs with Double = js.native
  
  @js.native
  sealed trait UFSGetUGCURLsResponse extends EMsg
  /* 5241 */ val UFSGetUGCURLsResponse: typingsSlinky.steamClient.mod.EMsg.UFSGetUGCURLsResponse with Double = js.native
  
  @js.native
  sealed trait UFSHttpUploadFileFinishRequest extends EMsg
  /* 5242 */ val UFSHttpUploadFileFinishRequest: typingsSlinky.steamClient.mod.EMsg.UFSHttpUploadFileFinishRequest with Double = js.native
  
  @js.native
  sealed trait UFSHttpUploadFileFinishResponse extends EMsg
  /* 5243 */ val UFSHttpUploadFileFinishResponse: typingsSlinky.steamClient.mod.EMsg.UFSHttpUploadFileFinishResponse with Double = js.native
  
  @js.native
  sealed trait UFSMigrateFile extends EMsg
  /* 5238 */ val UFSMigrateFile: typingsSlinky.steamClient.mod.EMsg.UFSMigrateFile with Double = js.native
  
  @js.native
  sealed trait UFSMigrateFileAppID extends EMsg
  /* 5253 */ val UFSMigrateFileAppID: typingsSlinky.steamClient.mod.EMsg.UFSMigrateFileAppID with Double = js.native
  
  @js.native
  sealed trait UFSMigrateFileAppIDResponse extends EMsg
  /* 5254 */ val UFSMigrateFileAppIDResponse: typingsSlinky.steamClient.mod.EMsg.UFSMigrateFileAppIDResponse with Double = js.native
  
  @js.native
  sealed trait UFSMigrateFileResponse extends EMsg
  /* 5239 */ val UFSMigrateFileResponse: typingsSlinky.steamClient.mod.EMsg.UFSMigrateFileResponse with Double = js.native
  
  @js.native
  sealed trait UFSReloadAccount extends EMsg
  /* 5234 */ val UFSReloadAccount: typingsSlinky.steamClient.mod.EMsg.UFSReloadAccount with Double = js.native
  
  @js.native
  sealed trait UFSReloadAccountResponse extends EMsg
  /* 5235 */ val UFSReloadAccountResponse: typingsSlinky.steamClient.mod.EMsg.UFSReloadAccountResponse with Double = js.native
  
  @js.native
  sealed trait UFSReloadPartitionInfo extends EMsg
  /* 5215 */ val UFSReloadPartitionInfo: typingsSlinky.steamClient.mod.EMsg.UFSReloadPartitionInfo with Double = js.native
  
  @js.native
  sealed trait UFSSynchronizeFile extends EMsg
  /* 5217 */ val UFSSynchronizeFile: typingsSlinky.steamClient.mod.EMsg.UFSSynchronizeFile with Double = js.native
  
  @js.native
  sealed trait UFSSynchronizeFileResponse extends EMsg
  /* 5218 */ val UFSSynchronizeFileResponse: typingsSlinky.steamClient.mod.EMsg.UFSSynchronizeFileResponse with Double = js.native
  
  @js.native
  sealed trait UFSUpdateFileFlags extends EMsg
  /* 5228 */ val UFSUpdateFileFlags: typingsSlinky.steamClient.mod.EMsg.UFSUpdateFileFlags with Double = js.native
  
  @js.native
  sealed trait UFSUpdateFileFlagsResponse extends EMsg
  /* 5229 */ val UFSUpdateFileFlagsResponse: typingsSlinky.steamClient.mod.EMsg.UFSUpdateFileFlagsResponse with Double = js.native
  
  @js.native
  sealed trait UFSUpdateRecordBatched extends EMsg
  /* 5236 */ val UFSUpdateRecordBatched: typingsSlinky.steamClient.mod.EMsg.UFSUpdateRecordBatched with Double = js.native
  
  @js.native
  sealed trait UFSUpdateRecordBatchedResponse extends EMsg
  /* 5237 */ val UFSUpdateRecordBatchedResponse: typingsSlinky.steamClient.mod.EMsg.UFSUpdateRecordBatchedResponse with Double = js.native
  
  @js.native
  sealed trait UFSUploadCommit extends EMsg
  /* 5251 */ val UFSUploadCommit: typingsSlinky.steamClient.mod.EMsg.UFSUploadCommit with Double = js.native
  
  @js.native
  sealed trait UFSUploadCommitResponse extends EMsg
  /* 5252 */ val UFSUploadCommitResponse: typingsSlinky.steamClient.mod.EMsg.UFSUploadCommitResponse with Double = js.native
  
  @js.native
  sealed trait UGSBase extends EMsg
  /* 7900 */ val UGSBase: typingsSlinky.steamClient.mod.EMsg.UGSBase with Double = js.native
  
  @js.native
  sealed trait UGSUpdateGlobalStats extends EMsg
  /* 7900 */ val UGSUpdateGlobalStats: typingsSlinky.steamClient.mod.EMsg.UGSUpdateGlobalStats with Double = js.native
  
  @js.native
  sealed trait UMQ2AM_ClientMsgBatch extends EMsg
  /* 8108 */ val UMQ2AM_ClientMsgBatch: typingsSlinky.steamClient.mod.EMsg.UMQ2AM_ClientMsgBatch with Double = js.native
  
  // obsolete
  @js.native
  sealed trait UMQBase extends EMsg
  /* 8100 */ val UMQBase: typingsSlinky.steamClient.mod.EMsg.UMQBase with Double = js.native
  
  // obsolete
  @js.native
  sealed trait UMQEnqueueMobileAnnouncements extends EMsg
  /* 8110 */ val UMQEnqueueMobileAnnouncements: typingsSlinky.steamClient.mod.EMsg.UMQEnqueueMobileAnnouncements with Double = js.native
  
  @js.native
  sealed trait UMQEnqueueMobileSalePromotions extends EMsg
  /* 8109 */ val UMQEnqueueMobileSalePromotions: typingsSlinky.steamClient.mod.EMsg.UMQEnqueueMobileSalePromotions with Double = js.native
  
  @js.native
  sealed trait UMQIncomingChatMessage extends EMsg
  /* 8105 */ val UMQIncomingChatMessage: typingsSlinky.steamClient.mod.EMsg.UMQIncomingChatMessage with Double = js.native
  
  @js.native
  sealed trait UMQLogoffRequest extends EMsg
  /* 8102 */ val UMQLogoffRequest: typingsSlinky.steamClient.mod.EMsg.UMQLogoffRequest with Double = js.native
  
  @js.native
  sealed trait UMQLogoffResponse extends EMsg
  /* 8103 */ val UMQLogoffResponse: typingsSlinky.steamClient.mod.EMsg.UMQLogoffResponse with Double = js.native
  
  @js.native
  sealed trait UMQLogonRequest extends EMsg
  /* 8100 */ val UMQLogonRequest: typingsSlinky.steamClient.mod.EMsg.UMQLogonRequest with Double = js.native
  
  @js.native
  sealed trait UMQLogonResponse extends EMsg
  /* 8101 */ val UMQLogonResponse: typingsSlinky.steamClient.mod.EMsg.UMQLogonResponse with Double = js.native
  
  @js.native
  sealed trait UMQPoll extends EMsg
  /* 8106 */ val UMQPoll: typingsSlinky.steamClient.mod.EMsg.UMQPoll with Double = js.native
  
  @js.native
  sealed trait UMQPollResults extends EMsg
  /* 8107 */ val UMQPollResults: typingsSlinky.steamClient.mod.EMsg.UMQPollResults with Double = js.native
  
  @js.native
  sealed trait UMQSendChatMessage extends EMsg
  /* 8104 */ val UMQSendChatMessage: typingsSlinky.steamClient.mod.EMsg.UMQSendChatMessage with Double = js.native
  
  @js.native
  sealed trait UniverseChanged extends EMsg
  /* 229 */ val UniverseChanged: typingsSlinky.steamClient.mod.EMsg.UniverseChanged with Double = js.native
  
  // obsolete
  @js.native
  sealed trait UniverseData extends EMsg
  /* 1010 */ val UniverseData: typingsSlinky.steamClient.mod.EMsg.UniverseData with Double = js.native
  
  @js.native
  sealed trait UpdateConfigFile extends EMsg
  /* 322 */ val UpdateConfigFile: typingsSlinky.steamClient.mod.EMsg.UpdateConfigFile with Double = js.native
  
  @js.native
  sealed trait UpdateCreditCardRequest extends EMsg
  /* 221 */ val UpdateCreditCardRequest: typingsSlinky.steamClient.mod.EMsg.UpdateCreditCardRequest with Double = js.native
  
  @js.native
  sealed trait UpdateRecordResponse extends EMsg
  /* 215 */ val UpdateRecordResponse: typingsSlinky.steamClient.mod.EMsg.UpdateRecordResponse with Double = js.native
  
  @js.native
  sealed trait UpdateUserBanResponse extends EMsg
  /* 225 */ val UpdateUserBanResponse: typingsSlinky.steamClient.mod.EMsg.UpdateUserBanResponse with Double = js.native
  
  @js.native
  sealed trait VACResponse extends EMsg
  /* 601 */ val VACResponse: typingsSlinky.steamClient.mod.EMsg.VACResponse with Double = js.native
  
  @js.native
  sealed trait VSAddCheat extends EMsg
  /* 605 */ val VSAddCheat: typingsSlinky.steamClient.mod.EMsg.VSAddCheat with Double = js.native
  
  @js.native
  sealed trait VSChallengeResultText extends EMsg
  /* 608 */ val VSChallengeResultText: typingsSlinky.steamClient.mod.EMsg.VSChallengeResultText with Double = js.native
  
  @js.native
  sealed trait VSGetChallengeResults extends EMsg
  /* 607 */ val VSGetChallengeResults: typingsSlinky.steamClient.mod.EMsg.VSGetChallengeResults with Double = js.native
  
  @js.native
  sealed trait VSLoadDBFinished extends EMsg
  /* 611 */ val VSLoadDBFinished: typingsSlinky.steamClient.mod.EMsg.VSLoadDBFinished with Double = js.native
  
  @js.native
  sealed trait VSMarkCheat extends EMsg
  /* 604 */ val VSMarkCheat: typingsSlinky.steamClient.mod.EMsg.VSMarkCheat with Double = js.native
  
  @js.native
  sealed trait VSPurgeCodeModDB extends EMsg
  /* 606 */ val VSPurgeCodeModDB: typingsSlinky.steamClient.mod.EMsg.VSPurgeCodeModDB with Double = js.native
  
  @js.native
  sealed trait VSReportLingerer extends EMsg
  /* 609 */ val VSReportLingerer: typingsSlinky.steamClient.mod.EMsg.VSReportLingerer with Double = js.native
  
  @js.native
  sealed trait VSRequestManagedChallenge extends EMsg
  /* 610 */ val VSRequestManagedChallenge: typingsSlinky.steamClient.mod.EMsg.VSRequestManagedChallenge with Double = js.native
  
  @js.native
  sealed trait WGRequest extends EMsg
  /* 130 */ val WGRequest: typingsSlinky.steamClient.mod.EMsg.WGRequest with Double = js.native
  
  @js.native
  sealed trait WGResponse extends EMsg
  /* 131 */ val WGResponse: typingsSlinky.steamClient.mod.EMsg.WGResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait WebAPIBase extends EMsg
  /* 8300 */ val WebAPIBase: typingsSlinky.steamClient.mod.EMsg.WebAPIBase with Double = js.native
  
  @js.native
  sealed trait WebAPIInvalidateOAuthClientCache extends EMsg
  /* 8304 */ val WebAPIInvalidateOAuthClientCache: typingsSlinky.steamClient.mod.EMsg.WebAPIInvalidateOAuthClientCache with Double = js.native
  
  @js.native
  sealed trait WebAPIInvalidateOAuthTokenCache extends EMsg
  /* 8305 */ val WebAPIInvalidateOAuthTokenCache: typingsSlinky.steamClient.mod.EMsg.WebAPIInvalidateOAuthTokenCache with Double = js.native
  
  @js.native
  sealed trait WebAPIInvalidateTokensForAccount extends EMsg
  /* 8302 */ val WebAPIInvalidateTokensForAccount: typingsSlinky.steamClient.mod.EMsg.WebAPIInvalidateTokensForAccount with Double = js.native
  
  @js.native
  sealed trait WebAPIJobRequest extends EMsg
  /* 133 */ val WebAPIJobRequest: typingsSlinky.steamClient.mod.EMsg.WebAPIJobRequest with Double = js.native
  
  @js.native
  sealed trait WebAPIJobResponse extends EMsg
  /* 134 */ val WebAPIJobResponse: typingsSlinky.steamClient.mod.EMsg.WebAPIJobResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait WebAPIRegisterGCInterfaces extends EMsg
  /* 8303 */ val WebAPIRegisterGCInterfaces: typingsSlinky.steamClient.mod.EMsg.WebAPIRegisterGCInterfaces with Double = js.native
  
  @js.native
  sealed trait WebAPISetSecrets extends EMsg
  /* 8306 */ val WebAPISetSecrets: typingsSlinky.steamClient.mod.EMsg.WebAPISetSecrets with Double = js.native
  
  @js.native
  sealed trait WebAPIValidateOAuth2Token extends EMsg
  /* 8300 */ val WebAPIValidateOAuth2Token: typingsSlinky.steamClient.mod.EMsg.WebAPIValidateOAuth2Token with Double = js.native
  
  @js.native
  sealed trait WebAPIValidateOAuth2TokenResponse extends EMsg
  /* 8301 */ val WebAPIValidateOAuth2TokenResponse: typingsSlinky.steamClient.mod.EMsg.WebAPIValidateOAuth2TokenResponse with Double = js.native
  
  @js.native
  sealed trait WorkerProcess extends EMsg
  /* 9000 */ val WorkerProcess: typingsSlinky.steamClient.mod.EMsg.WorkerProcess with Double = js.native
  
  @js.native
  sealed trait WorkerProcessPingRequest extends EMsg
  /* 9000 */ val WorkerProcessPingRequest: typingsSlinky.steamClient.mod.EMsg.WorkerProcessPingRequest with Double = js.native
  
  @js.native
  sealed trait WorkerProcessPingResponse extends EMsg
  /* 9001 */ val WorkerProcessPingResponse: typingsSlinky.steamClient.mod.EMsg.WorkerProcessPingResponse with Double = js.native
  
  @js.native
  sealed trait WorkerProcessShutdown extends EMsg
  /* 9002 */ val WorkerProcessShutdown: typingsSlinky.steamClient.mod.EMsg.WorkerProcessShutdown with Double = js.native
  
  @js.native
  sealed trait WorkshopAcceptTOSRequest extends EMsg
  /* 8200 */ val WorkshopAcceptTOSRequest: typingsSlinky.steamClient.mod.EMsg.WorkshopAcceptTOSRequest with Double = js.native
  
  // obsolete
  @js.native
  sealed trait WorkshopAcceptTOSResponse extends EMsg
  /* 8201 */ val WorkshopAcceptTOSResponse: typingsSlinky.steamClient.mod.EMsg.WorkshopAcceptTOSResponse with Double = js.native
  
  // obsolete
  @js.native
  sealed trait WorkshopBase extends EMsg
  /* 8200 */ val WorkshopBase: typingsSlinky.steamClient.mod.EMsg.WorkshopBase with Double = js.native
  
  @js.native
  sealed trait ZipRequest extends EMsg
  /* 204 */ val ZipRequest: typingsSlinky.steamClient.mod.EMsg.ZipRequest with Double = js.native
  
  @js.native
  sealed trait ZipResponse extends EMsg
  /* 205 */ val ZipResponse: typingsSlinky.steamClient.mod.EMsg.ZipResponse with Double = js.native
}

package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EMsg extends js.Object

@JSImport("steam-client", "EMsg")
@js.native
object EMsg extends js.Object {
  @js.native
  sealed trait AIGetAppGCFlags extends EMsg
  
  @js.native
  sealed trait AIGetAppGCFlagsResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AIGetAppInfo extends EMsg
  
   // obsolete
  @js.native
  sealed trait AIGetAppInfoResponse extends EMsg
  
  @js.native
  sealed trait AIGetAppList extends EMsg
  
  @js.native
  sealed trait AIGetAppListResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AISAppInfoTableChanged extends EMsg
  
  @js.native
  sealed trait AISCreateMarketingMessage extends EMsg
  
  @js.native
  sealed trait AISCreateMarketingMessageResponse extends EMsg
  
  @js.native
  sealed trait AISDeleteMarketingMessage extends EMsg
  
  @js.native
  sealed trait AISGetCouponDefinition extends EMsg
  
  @js.native
  sealed trait AISGetCouponDefinitionResponse extends EMsg
  
  @js.native
  sealed trait AISGetMarketingMessage extends EMsg
  
  @js.native
  sealed trait AISGetMarketingMessageResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AISGetMarketingTreatments extends EMsg
  
   // obsolete
  @js.native
  sealed trait AISGetMarketingTreatmentsResponse extends EMsg
  
  @js.native
  sealed trait AISGetPackageChangeNumber extends EMsg
  
  @js.native
  sealed trait AISGetPackageChangeNumberResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AISRefreshContentDescription extends EMsg
  
  @js.native
  sealed trait AISRequestContentDescription extends EMsg
  
  @js.native
  sealed trait AISRequestMarketingMessageUpdate extends EMsg
  
   // obsolete
  @js.native
  sealed trait AISRequestMarketingTreatmentUpdate extends EMsg
  
   // obsolete
  @js.native
  sealed trait AISTestAddPackage extends EMsg
  
  @js.native
  sealed trait AISTestEnableGC extends EMsg
  
  @js.native
  sealed trait AISUpdateAppInfo extends EMsg
  
  @js.native
  sealed trait AISUpdateMarketingMessage extends EMsg
  
  @js.native
  sealed trait AISUpdateMarketingMessageResponse extends EMsg
  
  @js.native
  sealed trait AISUpdatePackageCosts extends EMsg
  
  @js.native
  sealed trait AISUpdatePackageCostsResponse extends EMsg
  
   // obsolete "renamed to AISUpdatePackageCosts"
  @js.native
  sealed trait AISUpdatePackageInfo extends EMsg
  
  @js.native
  sealed trait AISUpdateSlaveContentDescription extends EMsg
  
  @js.native
  sealed trait AISUpdateSlaveContentDescriptionResponse extends EMsg
  
  @js.native
  sealed trait AMAccountPS3Unlink extends EMsg
  
  @js.native
  sealed trait AMAccountPS3UnlinkResponse extends EMsg
  
  @js.native
  sealed trait AMAcctAllowedToPurchase extends EMsg
  
  @js.native
  sealed trait AMAcctAllowedToPurchaseResponse extends EMsg
  
  @js.native
  sealed trait AMAcknowledgeClanInvite extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMAddClanNews extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMAddComment extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMAddCommentResponse extends EMsg
  
  @js.native
  sealed trait AMAddFounderToClan extends EMsg
  
  @js.native
  sealed trait AMAddFreeLicense extends EMsg
  
  @js.native
  sealed trait AMAddFreeLicenseResponse extends EMsg
  
  @js.native
  sealed trait AMAddFriend extends EMsg
  
  @js.native
  sealed trait AMAddFriendResponse extends EMsg
  
  @js.native
  sealed trait AMAddLicense extends EMsg
  
  @js.native
  sealed trait AMAddMinutesToLicense extends EMsg
  
  @js.native
  sealed trait AMAddPublisherUser extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMAddUsersToMarketingTreatment extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMAllowUserContentQuery extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMAllowUserContentResponse extends EMsg
  
  @js.native
  sealed trait AMAllowUserFilesRequest extends EMsg
  
  @js.native
  sealed trait AMAllowUserFilesResponse extends EMsg
  
  @js.native
  sealed trait AMAuthenticateUser extends EMsg
  
  @js.native
  sealed trait AMAuthenticateUserResponse extends EMsg
  
  @js.native
  sealed trait AMAuthenticatedPlayerList extends EMsg
  
  @js.native
  sealed trait AMBanFromChat extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMBeginProcessingLicenses extends EMsg
  
  @js.native
  sealed trait AMBitPayPayment extends EMsg
  
  @js.native
  sealed trait AMBitPayPaymentResponse extends EMsg
  
  @js.native
  sealed trait AMBoaCompraPayment extends EMsg
  
  @js.native
  sealed trait AMBoaCompraPaymentResponse extends EMsg
  
  @js.native
  sealed trait AMCancelEasyCollect extends EMsg
  
  @js.native
  sealed trait AMCancelEasyCollectResponse extends EMsg
  
  @js.native
  sealed trait AMCancelLicense extends EMsg
  
  @js.native
  sealed trait AMCancelPurchase extends EMsg
  
  @js.native
  sealed trait AMChallengeNotification extends EMsg
  
  @js.native
  sealed trait AMChallengeVerdict extends EMsg
  
  @js.native
  sealed trait AMChangeClanOwner extends EMsg
  
  @js.native
  sealed trait AMChatActionResult extends EMsg
  
  @js.native
  sealed trait AMChatCleanup extends EMsg
  
  @js.native
  sealed trait AMChatEnter extends EMsg
  
  @js.native
  sealed trait AMChatInvite extends EMsg
  
  @js.native
  sealed trait AMChatMulti extends EMsg
  
  @js.native
  sealed trait AMCheckClanInviteRateLimiting extends EMsg
  
  @js.native
  sealed trait AMCheckClanMembership extends EMsg
  
  @js.native
  sealed trait AMCheckClanMembershipResponse extends EMsg
  
  @js.native
  sealed trait AMClaimUnownedUserGift extends EMsg
  
  @js.native
  sealed trait AMClaimUnownedUserGiftResponse extends EMsg
  
  @js.native
  sealed trait AMClanCleanup extends EMsg
  
  @js.native
  sealed trait AMClanCleanupList extends EMsg
  
  @js.native
  sealed trait AMClanDataUpdated extends EMsg
  
  @js.native
  sealed trait AMClanPermissions extends EMsg
  
  @js.native
  sealed trait AMClanPermissionsResponse extends EMsg
  
  @js.native
  sealed trait AMClansInCommon extends EMsg
  
  @js.native
  sealed trait AMClansInCommonCount extends EMsg
  
  @js.native
  sealed trait AMClansInCommonCountResponse extends EMsg
  
  @js.native
  sealed trait AMClansInCommonResponse extends EMsg
  
  @js.native
  sealed trait AMClearDispute extends EMsg
  
  @js.native
  sealed trait AMClearDisputeResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMClearPersonaMetadataBlob extends EMsg
  
  @js.native
  sealed trait AMClientAcceptFriendInvite extends EMsg
  
  @js.native
  sealed trait AMClientAddFriendToGroup extends EMsg
  
  @js.native
  sealed trait AMClientAddFriendToGroupResponse extends EMsg
  
  @js.native
  sealed trait AMClientChatActionRelay extends EMsg
  
  @js.native
  sealed trait AMClientChatInviteRelay extends EMsg
  
  @js.native
  sealed trait AMClientChatMemberInfoRelay extends EMsg
  
  @js.native
  sealed trait AMClientChatMsgRelay extends EMsg
  
  @js.native
  sealed trait AMClientCreateFriendsGroup extends EMsg
  
  @js.native
  sealed trait AMClientCreateFriendsGroupResponse extends EMsg
  
  @js.native
  sealed trait AMClientDeleteFriendsGroup extends EMsg
  
  @js.native
  sealed trait AMClientDeleteFriendsGroupResponse extends EMsg
  
  @js.native
  sealed trait AMClientJoinChatRelay extends EMsg
  
  @js.native
  sealed trait AMClientNotPlaying extends EMsg
  
  @js.native
  sealed trait AMClientPublishRemovalFromSource extends EMsg
  
  @js.native
  sealed trait AMClientRemoveFriendFromGroup extends EMsg
  
  @js.native
  sealed trait AMClientRemoveFriendFromGroupResponse extends EMsg
  
  @js.native
  sealed trait AMClientRenameFriendsGroup extends EMsg
  
  @js.native
  sealed trait AMClientRenameFriendsGroupResponse extends EMsg
  
  @js.native
  sealed trait AMClientSetPlayerNickname extends EMsg
  
  @js.native
  sealed trait AMClientSetPlayerNicknameResponse extends EMsg
  
  @js.native
  sealed trait AMCompleteExternalPurchase extends EMsg
  
  @js.native
  sealed trait AMCompleteExternalPurchaseResponse extends EMsg
  
  @js.native
  sealed trait AMCompletePurchase extends EMsg
  
  @js.native
  sealed trait AMConvertClan extends EMsg
  
  @js.native
  sealed trait AMConvertWallet extends EMsg
  
  @js.native
  sealed trait AMConvertWalletResponse extends EMsg
  
  @js.native
  sealed trait AMCreateAccountRecord extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMCreateAccountRecordInSteam3 extends EMsg
  
  @js.native
  sealed trait AMCreateAccountResponse extends EMsg
  
  @js.native
  sealed trait AMCreateChargeback extends EMsg
  
  @js.native
  sealed trait AMCreateChargebackResponse extends EMsg
  
  @js.native
  sealed trait AMCreateChat extends EMsg
  
  @js.native
  sealed trait AMCreateChatResponse extends EMsg
  
  @js.native
  sealed trait AMCreateClan extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMCreateClanAnnouncement extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMCreateClanAnnouncementResponse extends EMsg
  
  @js.native
  sealed trait AMCreateClanEvent extends EMsg
  
  @js.native
  sealed trait AMCreateClanEventResponse extends EMsg
  
  @js.native
  sealed trait AMCreateClanResponse extends EMsg
  
  @js.native
  sealed trait AMCreateDispute extends EMsg
  
  @js.native
  sealed trait AMCreateDisputeResponse extends EMsg
  
  @js.native
  sealed trait AMCreateRefund extends EMsg
  
  @js.native
  sealed trait AMCreateRefundResponse extends EMsg
  
  @js.native
  sealed trait AMDegicaPayment extends EMsg
  
  @js.native
  sealed trait AMDegicaPaymentResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMDeleteClanAnnouncement extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMDeleteClanAnnouncementResponse extends EMsg
  
  @js.native
  sealed trait AMDeleteClanEvent extends EMsg
  
  @js.native
  sealed trait AMDeleteClanEventResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMDeleteComment extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMDeleteCommentResponse extends EMsg
  
  @js.native
  sealed trait AMDeleteStoredCard extends EMsg
  
  @js.native
  sealed trait AMDeleteStoredPaymentInfo extends EMsg
  
  @js.native
  sealed trait AMDeleteStoredPaypalAgreement extends EMsg
  
  @js.native
  sealed trait AMDumpClan extends EMsg
  
  @js.native
  sealed trait AMDumpUser extends EMsg
  
  @js.native
  sealed trait AMEClubPayment extends EMsg
  
  @js.native
  sealed trait AMEClubPaymentResponse extends EMsg
  
  @js.native
  sealed trait AMEditBanReason extends EMsg
  
  @js.native
  sealed trait AMExpireCaptchaByGID extends EMsg
  
  @js.native
  sealed trait AMExtendLicense extends EMsg
  
  @js.native
  sealed trait AMFinalizePurchase extends EMsg
  
  @js.native
  sealed trait AMFinalizePurchaseResponse extends EMsg
  
  @js.native
  sealed trait AMFindAccounts extends EMsg
  
  @js.native
  sealed trait AMFindAccountsResponse extends EMsg
  
  @js.native
  sealed trait AMFindClanUser extends EMsg
  
  @js.native
  sealed trait AMFindClanUserResponse extends EMsg
  
  @js.native
  sealed trait AMFindGSByIP extends EMsg
  
  @js.native
  sealed trait AMFindHungTransactions extends EMsg
  
  @js.native
  sealed trait AMFixPendingPurchase extends EMsg
  
  @js.native
  sealed trait AMFixPendingPurchaseResponse extends EMsg
  
  @js.native
  sealed trait AMFixPendingRefund extends EMsg
  
  @js.native
  sealed trait AMFoundGSByIP extends EMsg
  
  @js.native
  sealed trait AMFriendsInCommon extends EMsg
  
  @js.native
  sealed trait AMFriendsInCommonCountResponse extends EMsg
  
  @js.native
  sealed trait AMFriendsInCommonResponse extends EMsg
  
  @js.native
  sealed trait AMFriendsList extends EMsg
  
  @js.native
  sealed trait AMFriendsListResponse extends EMsg
  
  @js.native
  sealed trait AMGMSGameServerRemove extends EMsg
  
  @js.native
  sealed trait AMGMSGameServerUpdate extends EMsg
  
  @js.native
  sealed trait AMGSSearch extends EMsg
  
  @js.native
  sealed trait AMGameServerAccountChangePassword extends EMsg
  
  @js.native
  sealed trait AMGameServerAccountDeleteAccount extends EMsg
  
  @js.native
  sealed trait AMGameServerPlayerCompatibilityCheck extends EMsg
  
  @js.native
  sealed trait AMGameServerPlayerCompatibilityCheckResponse extends EMsg
  
  @js.native
  sealed trait AMGameServerRemove extends EMsg
  
  @js.native
  sealed trait AMGameServerUpdate extends EMsg
  
  @js.native
  sealed trait AMGetAccountBanInfo extends EMsg
  
  @js.native
  sealed trait AMGetAccountBanInfoResponse extends EMsg
  
  @js.native
  sealed trait AMGetAccountCommunityBanInfo extends EMsg
  
  @js.native
  sealed trait AMGetAccountCommunityBanInfoResponse extends EMsg
  
  @js.native
  sealed trait AMGetAccountDetails extends EMsg
  
  @js.native
  sealed trait AMGetAccountDetails2 extends EMsg
  
  @js.native
  sealed trait AMGetAccountDetailsResponse extends EMsg
  
  @js.native
  sealed trait AMGetAccountDetailsResponse2 extends EMsg
  
  @js.native
  sealed trait AMGetAccountEmailAddress extends EMsg
  
  @js.native
  sealed trait AMGetAccountEmailAddressResponse extends EMsg
  
  @js.native
  sealed trait AMGetAccountFlagsForWGSpoofing extends EMsg
  
  @js.native
  sealed trait AMGetAccountFlagsForWGSpoofingResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetAccountFriendsCount extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetAccountFriendsCountResponse extends EMsg
  
  @js.native
  sealed trait AMGetAccountLinks extends EMsg
  
  @js.native
  sealed trait AMGetAccountLinksResponse extends EMsg
  
  @js.native
  sealed trait AMGetAccountPSNInfo extends EMsg
  
  @js.native
  sealed trait AMGetAccountPSNInfoResponse extends EMsg
  
  @js.native
  sealed trait AMGetAccountResetDetailsRequest extends EMsg
  
  @js.native
  sealed trait AMGetAccountResetDetailsResponse extends EMsg
  
  @js.native
  sealed trait AMGetAccountStatus extends EMsg
  
  @js.native
  sealed trait AMGetAccountStatusResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetBillingAddress extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetBillingAddressResponse extends EMsg
  
  @js.native
  sealed trait AMGetCaptchaDataByGID extends EMsg
  
  @js.native
  sealed trait AMGetCaptchaDataByGIDResponse extends EMsg
  
  @js.native
  sealed trait AMGetCaptchaDataForIP extends EMsg
  
  @js.native
  sealed trait AMGetCaptchaDataForIPResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetCardList extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetCardListResponse extends EMsg
  
  @js.native
  sealed trait AMGetChatBanList extends EMsg
  
  @js.native
  sealed trait AMGetChatBanListResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetClanAnnouncements extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetClanAnnouncementsCount extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetClanAnnouncementsCountResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetClanAnnouncementsResponse extends EMsg
  
  @js.native
  sealed trait AMGetClanDetails extends EMsg
  
  @js.native
  sealed trait AMGetClanDetailsForForumCreation extends EMsg
  
  @js.native
  sealed trait AMGetClanDetailsForForumCreationResponse extends EMsg
  
  @js.native
  sealed trait AMGetClanDetailsResponse extends EMsg
  
  @js.native
  sealed trait AMGetClanEvents extends EMsg
  
  @js.native
  sealed trait AMGetClanEventsResponse extends EMsg
  
  @js.native
  sealed trait AMGetClanHistory extends EMsg
  
  @js.native
  sealed trait AMGetClanHistoryResponse extends EMsg
  
  @js.native
  sealed trait AMGetClanMembers extends EMsg
  
  @js.native
  sealed trait AMGetClanMembersResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetClanMembershipList extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetClanMembershipListResponse extends EMsg
  
  @js.native
  sealed trait AMGetClanOfficers extends EMsg
  
  @js.native
  sealed trait AMGetClanOfficersResponse extends EMsg
  
  @js.native
  sealed trait AMGetClanPOTW extends EMsg
  
  @js.native
  sealed trait AMGetClanPOTWResponse extends EMsg
  
  @js.native
  sealed trait AMGetClanPermissionBits extends EMsg
  
  @js.native
  sealed trait AMGetClanPermissionBitsResponse extends EMsg
  
  @js.native
  sealed trait AMGetClanPermissionSettings extends EMsg
  
  @js.native
  sealed trait AMGetClanPermissionSettingsResponse extends EMsg
  
  @js.native
  sealed trait AMGetClanRank extends EMsg
  
  @js.native
  sealed trait AMGetClanRankResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetComments extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetCommentsResponse extends EMsg
  
  @js.native
  sealed trait AMGetCommunityPrivacyState extends EMsg
  
  @js.native
  sealed trait AMGetCommunityPrivacyStateResponse extends EMsg
  
  @js.native
  sealed trait AMGetFinalPrice extends EMsg
  
  @js.native
  sealed trait AMGetFinalPriceResponse extends EMsg
  
  @js.native
  sealed trait AMGetFriendRelationship extends EMsg
  
  @js.native
  sealed trait AMGetFriendRelationshipResponse extends EMsg
  
  @js.native
  sealed trait AMGetFriendsLobbies extends EMsg
  
  @js.native
  sealed trait AMGetFriendsLobbiesResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetFriendsWishlistInfo extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetFriendsWishlistInfoResponse extends EMsg
  
  @js.native
  sealed trait AMGetGSPlayerList extends EMsg
  
  @js.native
  sealed trait AMGetGSPlayerListResponse extends EMsg
  
  @js.native
  sealed trait AMGetGameMembers extends EMsg
  
  @js.native
  sealed trait AMGetGameMembersResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetGiftTargetListRelay extends EMsg
  
  @js.native
  sealed trait AMGetIgnored extends EMsg
  
  @js.native
  sealed trait AMGetIgnoredResponse extends EMsg
  
  @js.native
  sealed trait AMGetLegacyGameKey extends EMsg
  
  @js.native
  sealed trait AMGetLegacyGameKeyResponse extends EMsg
  
  @js.native
  sealed trait AMGetLicenses extends EMsg
  
  @js.native
  sealed trait AMGetLicensesResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetLobbyList extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetLobbyListResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetLobbyMetadata extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetLobbyMetadataResponse extends EMsg
  
  @js.native
  sealed trait AMGetNameHistory extends EMsg
  
  @js.native
  sealed trait AMGetNameHistoryResponse extends EMsg
  
  @js.native
  sealed trait AMGetPaypalAgreements extends EMsg
  
  @js.native
  sealed trait AMGetPaypalAgreementsResponse extends EMsg
  
  @js.native
  sealed trait AMGetPendingNotificationCount extends EMsg
  
  @js.native
  sealed trait AMGetPendingNotificationCountResponse extends EMsg
  
  @js.native
  sealed trait AMGetPlayerBanDetails extends EMsg
  
  @js.native
  sealed trait AMGetPlayerBanDetailsResponse extends EMsg
  
  @js.native
  sealed trait AMGetPlayerLinkDetails extends EMsg
  
  @js.native
  sealed trait AMGetPlayerLinkDetailsResponse extends EMsg
  
  @js.native
  sealed trait AMGetPreviousCBAccount extends EMsg
  
  @js.native
  sealed trait AMGetPreviousCBAccountResponse extends EMsg
  
  @js.native
  sealed trait AMGetPurchaseStatus extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetSingleClanAnnouncement extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetSingleClanAnnouncementResponse extends EMsg
  
  @js.native
  sealed trait AMGetSingleClanEvent extends EMsg
  
  @js.native
  sealed trait AMGetSingleClanEventResponse extends EMsg
  
  @js.native
  sealed trait AMGetSteamIDForMicroTxn extends EMsg
  
  @js.native
  sealed trait AMGetSteamIDForMicroTxnResponse extends EMsg
  
  @js.native
  sealed trait AMGetStoredPaymentSummary extends EMsg
  
  @js.native
  sealed trait AMGetStoredPaymentSummaryResponse extends EMsg
  
  @js.native
  sealed trait AMGetUserAchievementStatus extends EMsg
  
  @js.native
  sealed trait AMGetUserClansNews extends EMsg
  
  @js.native
  sealed trait AMGetUserClansNewsResponse extends EMsg
  
  @js.native
  sealed trait AMGetUserCurrentGameInfo extends EMsg
  
  @js.native
  sealed trait AMGetUserCurrentGameInfoResponse extends EMsg
  
  @js.native
  sealed trait AMGetUserFriendNewsResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserFriendsMinutesPlayed extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserFriendsMinutesPlayedResponse extends EMsg
  
  @js.native
  sealed trait AMGetUserGameStats extends EMsg
  
  @js.native
  sealed trait AMGetUserGameStatsResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserGameplayInfo extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserGameplayInfoResponse extends EMsg
  
  @js.native
  sealed trait AMGetUserGifts extends EMsg
  
  @js.native
  sealed trait AMGetUserGiftsResponse extends EMsg
  
  @js.native
  sealed trait AMGetUserGroupStatus extends EMsg
  
  @js.native
  sealed trait AMGetUserGroupStatusResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserHistory extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserHistoryResponse extends EMsg
  
  @js.native
  sealed trait AMGetUserLicenseHistory extends EMsg
  
  @js.native
  sealed trait AMGetUserLicenseHistoryResponse extends EMsg
  
  @js.native
  sealed trait AMGetUserLicenseList extends EMsg
  
  @js.native
  sealed trait AMGetUserLicenseListResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserMinutesPlayed extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserMinutesPlayedResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserNews extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserNewsResponse extends EMsg
  
  @js.native
  sealed trait AMGetUserNewsSubscriptions extends EMsg
  
  @js.native
  sealed trait AMGetUserNewsSubscriptionsResponse extends EMsg
  
  @js.native
  sealed trait AMGetUserStats extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserVacBanList extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMGetUserVacBanListResponse extends EMsg
  
  @js.native
  sealed trait AMGetWalletConversionRate extends EMsg
  
  @js.native
  sealed trait AMGetWalletConversionRateResponse extends EMsg
  
  @js.native
  sealed trait AMGetWalletDetails extends EMsg
  
  @js.native
  sealed trait AMGetWalletDetailsResponse extends EMsg
  
  @js.native
  sealed trait AMGiftRevoked extends EMsg
  
  @js.native
  sealed trait AMGrantCoupon extends EMsg
  
  @js.native
  sealed trait AMGrantCouponResponse extends EMsg
  
  @js.native
  sealed trait AMGrantGuestPasses extends EMsg
  
  @js.native
  sealed trait AMGrantGuestPasses2 extends EMsg
  
  @js.native
  sealed trait AMGrantGuestPasses2Response extends EMsg
  
  @js.native
  sealed trait AMHandlePendingTransaction extends EMsg
  
  @js.native
  sealed trait AMHandlePendingTransactionResponse extends EMsg
  
  @js.native
  sealed trait AMInitPurchase extends EMsg
  
  @js.native
  sealed trait AMInitPurchaseResponse extends EMsg
  
  @js.native
  sealed trait AMInviteUserToClan extends EMsg
  
  @js.native
  sealed trait AMIsAccountInCaptchaGracePeriod extends EMsg
  
  @js.native
  sealed trait AMIsAccountInCaptchaGracePeriodResponse extends EMsg
  
  @js.native
  sealed trait AMIsPackageRestrictedInUserCountry extends EMsg
  
  @js.native
  sealed trait AMIsPackageRestrictedInUserCountryResponse extends EMsg
  
  @js.native
  sealed trait AMIsUserBanned extends EMsg
  
  @js.native
  sealed trait AMIsValidAccountID extends EMsg
  
  @js.native
  sealed trait AMJoinPublicClan extends EMsg
  
  @js.native
  sealed trait AMKickUserFromClan extends EMsg
  
  @js.native
  sealed trait AMLeaveClan extends EMsg
  
  @js.native
  sealed trait AMLoadActivationCodes extends EMsg
  
  @js.native
  sealed trait AMLoadActivationCodesResponse extends EMsg
  
  @js.native
  sealed trait AMLoadOEMTickets extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMLockProfile extends EMsg
  
  @js.native
  sealed trait AMLookupKey extends EMsg
  
  @js.native
  sealed trait AMLookupKeyResponse extends EMsg
  
  @js.native
  sealed trait AMMOLPayment extends EMsg
  
  @js.native
  sealed trait AMMOLPaymentResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMMarketingTreatmentUpdate extends EMsg
  
  @js.native
  sealed trait AMMoPayPayment extends EMsg
  
  @js.native
  sealed trait AMMoPayPaymentResponse extends EMsg
  
  @js.native
  sealed trait AMNameChange extends EMsg
  
  @js.native
  sealed trait AMNewChallenge extends EMsg
  
  @js.native
  sealed trait AMNotifyChatOfClanChange extends EMsg
  
  @js.native
  sealed trait AMNotifySessionDeviceAuthorized extends EMsg
  
  @js.native
  sealed trait AMP2PIntroducerMessage extends EMsg
  
  @js.native
  sealed trait AMPasswordHashUpgrade extends EMsg
  
  @js.native
  sealed trait AMPayPalPaymentsHubPayment extends EMsg
  
  @js.native
  sealed trait AMPayPalPaymentsHubPaymentResponse extends EMsg
  
  @js.native
  sealed trait AMPayelpPayment extends EMsg
  
  @js.native
  sealed trait AMPayelpPaymentResponse extends EMsg
  
  @js.native
  sealed trait AMPersonaChangeResponse extends EMsg
  
  @js.native
  sealed trait AMPlayerGetClanBasicDetails extends EMsg
  
  @js.native
  sealed trait AMPlayerGetClanBasicDetailsResponse extends EMsg
  
  @js.native
  sealed trait AMPlayerHostedOnGameServer extends EMsg
  
  @js.native
  sealed trait AMPlayerNicknameList extends EMsg
  
  @js.native
  sealed trait AMPlayerNicknameListResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMPrimePersonaStateCache extends EMsg
  
  @js.native
  sealed trait AMProbeClanMembershipList extends EMsg
  
  @js.native
  sealed trait AMProbeClanMembershipListResponse extends EMsg
  
  @js.native
  sealed trait AMPublishChatMemberInfo extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMPublishChatMetadata extends EMsg
  
  @js.native
  sealed trait AMPublishChatRoomInfo extends EMsg
  
  @js.native
  sealed trait AMPurchaseResponse extends EMsg
  
  @js.native
  sealed trait AMRecordBanEnforcement extends EMsg
  
  @js.native
  sealed trait AMRefreshGuestPasses extends EMsg
  
  @js.native
  sealed trait AMRefreshSessions extends EMsg
  
  @js.native
  sealed trait AMRegisterKey extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMRelayGetFriendsWhoPlayGame extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMRelayGetFriendsWhoPlayGameResponse extends EMsg
  
  @js.native
  sealed trait AMRelayPublishStatus extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMRelayToGC extends EMsg
  
  @js.native
  sealed trait AMReloadAccount extends EMsg
  
  @js.native
  sealed trait AMReloadGameGroupPolicy extends EMsg
  
  @js.native
  sealed trait AMRemoveFriend extends EMsg
  
  @js.native
  sealed trait AMRemovePublisherUser extends EMsg
  
  @js.native
  sealed trait AMRenewAgreement extends EMsg
  
  @js.native
  sealed trait AMRenewLicense extends EMsg
  
  @js.native
  sealed trait AMRequestAccountData extends EMsg
  
  @js.native
  sealed trait AMRequestAccountDataResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMRequestChatMetadata extends EMsg
  
  @js.native
  sealed trait AMRequestClanData extends EMsg
  
  @js.native
  sealed trait AMRequestClanDetails extends EMsg
  
   // obsolete "renamed to AMRequestClanData"
  @js.native
  sealed trait AMRequestFriendData extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMResetCommunityContent extends EMsg
  
  @js.native
  sealed trait AMResetUserVerificationGSByIP extends EMsg
  
  @js.native
  sealed trait AMResolveNegativeWalletCredits extends EMsg
  
  @js.native
  sealed trait AMResolveNegativeWalletCreditsResponse extends EMsg
  
  @js.native
  sealed trait AMResubmitPurchase extends EMsg
  
  @js.native
  sealed trait AMReverseChargeback extends EMsg
  
  @js.native
  sealed trait AMReverseChargebackResponse extends EMsg
  
  @js.native
  sealed trait AMRevokeLegacyGameKeys extends EMsg
  
  @js.native
  sealed trait AMRevokePurchaseResponse extends EMsg
  
  @js.native
  sealed trait AMRollbackGiftTransfer extends EMsg
  
  @js.native
  sealed trait AMRollbackGiftTransferResponse extends EMsg
  
  @js.native
  sealed trait AMRouteFriendMsg extends EMsg
  
  @js.native
  sealed trait AMRouteToClients extends EMsg
  
  @js.native
  sealed trait AMSendAccountInfoUpdate extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMSendEmail extends EMsg
  
  @js.native
  sealed trait AMSendQueuedEmails extends EMsg
  
  @js.native
  sealed trait AMSendSystemIMToUser extends EMsg
  
  @js.native
  sealed trait AMServiceModulesCache extends EMsg
  
  @js.native
  sealed trait AMServiceModulesCall extends EMsg
  
  @js.native
  sealed trait AMServiceModulesCallResponse extends EMsg
  
  @js.native
  sealed trait AMSessionInfoRequest extends EMsg
  
  @js.native
  sealed trait AMSessionInfoResponse extends EMsg
  
  @js.native
  sealed trait AMSessionQuery extends EMsg
  
  @js.native
  sealed trait AMSessionQueryResponse extends EMsg
  
  @js.native
  sealed trait AMSetAccountDetails extends EMsg
  
  @js.native
  sealed trait AMSetAccountFlags extends EMsg
  
  @js.native
  sealed trait AMSetAccountLinks extends EMsg
  
  @js.native
  sealed trait AMSetAccountLinksResponse extends EMsg
  
  @js.native
  sealed trait AMSetAccountTrustedRequest extends EMsg
  
  @js.native
  sealed trait AMSetAvatar extends EMsg
  
  @js.native
  sealed trait AMSetClanDetails extends EMsg
  
  @js.native
  sealed trait AMSetClanName extends EMsg
  
  @js.native
  sealed trait AMSetClanNameResponse extends EMsg
  
  @js.native
  sealed trait AMSetClanPOTW extends EMsg
  
  @js.native
  sealed trait AMSetClanPOTWResponse extends EMsg
  
  @js.native
  sealed trait AMSetClanPermissionBits extends EMsg
  
  @js.native
  sealed trait AMSetClanPermissionBitsResponse extends EMsg
  
  @js.native
  sealed trait AMSetClanPermissionSettings extends EMsg
  
  @js.native
  sealed trait AMSetClanPermissionSettingsResponse extends EMsg
  
  @js.native
  sealed trait AMSetClanRank extends EMsg
  
  @js.native
  sealed trait AMSetClanRankResponse extends EMsg
  
  @js.native
  sealed trait AMSetCommunityProfileSettings extends EMsg
  
  @js.native
  sealed trait AMSetCommunityProfileSettingsResponse extends EMsg
  
  @js.native
  sealed trait AMSetCommunityState extends EMsg
  
  @js.native
  sealed trait AMSetDRMTestConfig extends EMsg
  
  @js.native
  sealed trait AMSetFriendRelationshipNone extends EMsg
  
  @js.native
  sealed trait AMSetIgnored extends EMsg
  
  @js.native
  sealed trait AMSetIgnoredResponse extends EMsg
  
  @js.native
  sealed trait AMSetLicenseFlags extends EMsg
  
  @js.native
  sealed trait AMSetPersonaName extends EMsg
  
  @js.native
  sealed trait AMSetPreApproval extends EMsg
  
  @js.native
  sealed trait AMSetPreApprovalResponse extends EMsg
  
  @js.native
  sealed trait AMSetProfileURL extends EMsg
  
  @js.native
  sealed trait AMSetUserGiftUnowned extends EMsg
  
  @js.native
  sealed trait AMSetUserGiftUnownedResponse extends EMsg
  
  @js.native
  sealed trait AMSetUserNewsSubscriptions extends EMsg
  
  @js.native
  sealed trait AMSmart2PayPayment extends EMsg
  
  @js.native
  sealed trait AMSmart2PayPaymentResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMStoreCancelPurchase extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMStoreCompletePurchase extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMStoreGetFinalPrice extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMStoreGetFinalPriceResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMStoreInitPurchase extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMStoreInitPurchaseResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMStorePurchaseResponse extends EMsg
  
  @js.native
  sealed trait AMStoreUserStats extends EMsg
  
  @js.native
  sealed trait AMStoreUserStatsResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMSubscribeToPersonaFeed extends EMsg
  
  @js.native
  sealed trait AMSupportChangeEmail extends EMsg
  
  @js.native
  sealed trait AMSupportChangePassword extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMSupportChangeSecretQA extends EMsg
  
  @js.native
  sealed trait AMSupportEnableOrDisable extends EMsg
  
  @js.native
  sealed trait AMSupportIsAccountEnabled extends EMsg
  
  @js.native
  sealed trait AMSupportIsAccountEnabledResponse extends EMsg
  
  @js.native
  sealed trait AMSupportKickSession extends EMsg
  
  @js.native
  sealed trait AMSupportRemoveAccountSecurity extends EMsg
  
  @js.native
  sealed trait AMSwapKioskDeposit extends EMsg
  
  @js.native
  sealed trait AMSwapKioskDepositResponse extends EMsg
  
  @js.native
  sealed trait AMTicketAuthRequestOrResponse extends EMsg
  
  @js.native
  sealed trait AMToMDSGetDepotDecryptionKey extends EMsg
  
  @js.native
  sealed trait AMTrackFailedAuthByIP extends EMsg
  
  @js.native
  sealed trait AMTransferLockedGifts extends EMsg
  
  @js.native
  sealed trait AMTransferLockedGiftsResponse extends EMsg
  
  @js.native
  sealed trait AMTwoFactorRecoverAuthenticatorRequest extends EMsg
  
  @js.native
  sealed trait AMTwoFactorRecoverAuthenticatorResponse extends EMsg
  
  @js.native
  sealed trait AMUnBanFromChat extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMUpdateBillingAddress extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMUpdateBillingAddressResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMUpdateChatMetadata extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMUpdateClanAnnouncement extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMUpdateClanAnnouncementResponse extends EMsg
  
  @js.native
  sealed trait AMUpdateClanEvent extends EMsg
  
  @js.native
  sealed trait AMUpdateClanEventResponse extends EMsg
  
  @js.native
  sealed trait AMUpdateGSPlayStats extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMUpdatePersonaStateCache extends EMsg
  
  @js.native
  sealed trait AMUpdateProviderStatus extends EMsg
  
  @js.native
  sealed trait AMUpdateUserBanRequest extends EMsg
  
  @js.native
  sealed trait AMUserClanList extends EMsg
  
  @js.native
  sealed trait AMUserClanListResponse extends EMsg
  
  @js.native
  sealed trait AMVACStatusUpdate extends EMsg
  
  @js.native
  sealed trait AMValidateCaptchaDataForIP extends EMsg
  
  @js.native
  sealed trait AMValidateCaptchaDataForIPResponse extends EMsg
  
  @js.native
  sealed trait AMValidateEmailLink extends EMsg
  
  @js.native
  sealed trait AMValidateEmailLinkResponse extends EMsg
  
  @js.native
  sealed trait AMValidatePasswordResetCodeAndSendSmsRequest extends EMsg
  
  @js.native
  sealed trait AMValidatePasswordResetCodeAndSendSmsResponse extends EMsg
  
  @js.native
  sealed trait AMValidateWGToken extends EMsg
  
  @js.native
  sealed trait AMValidateWGTokenResponse extends EMsg
  
  @js.native
  sealed trait AMVerfiyUser extends EMsg
  
  @js.native
  sealed trait AMVerifyDepotManagementRights extends EMsg
  
  @js.native
  sealed trait AMVerifyDepotManagementRightsResponse extends EMsg
  
  @js.native
  sealed trait AMWipeFriendsList extends EMsg
  
   // obsolete
  @js.native
  sealed trait AMWriteNews extends EMsg
  
  @js.native
  sealed trait AMXsollaPayment extends EMsg
  
  @js.native
  sealed trait AMXsollaPaymentResponse extends EMsg
  
  @js.native
  sealed trait ATSCSPerfTestResponse extends EMsg
  
  @js.native
  sealed trait ATSCSPerfTestTask extends EMsg
  
  @js.native
  sealed trait ATSCallTest extends EMsg
  
  @js.native
  sealed trait ATSCallTestReply extends EMsg
  
  @js.native
  sealed trait ATSCycleTCM extends EMsg
  
  @js.native
  sealed trait ATSExternalStressActionResult extends EMsg
  
  @js.native
  sealed trait ATSExternalStressJobQueued extends EMsg
  
  @js.native
  sealed trait ATSExternalStressJobRunning extends EMsg
  
  @js.native
  sealed trait ATSExternalStressJobStart extends EMsg
  
  @js.native
  sealed trait ATSExternalStressJobStopAll extends EMsg
  
  @js.native
  sealed trait ATSExternalStressJobStopped extends EMsg
  
  @js.native
  sealed trait ATSInitDRMSStressTest extends EMsg
  
  @js.native
  sealed trait ATSRunFailServerTest extends EMsg
  
  @js.native
  sealed trait ATSStartExternalStress extends EMsg
  
  @js.native
  sealed trait ATSStartStressTest extends EMsg
  
  @js.native
  sealed trait ATSStarted extends EMsg
  
  @js.native
  sealed trait ATSStopStressTest extends EMsg
  
  @js.native
  sealed trait ATSUFSPerfTestResponse extends EMsg
  
  @js.native
  sealed trait ATSUFSPerfTestTask extends EMsg
  
  @js.native
  sealed trait AdminCmd extends EMsg
  
  @js.native
  sealed trait AdminCmdResponse extends EMsg
  
  @js.native
  sealed trait AdminConsoleTitle extends EMsg
  
  @js.native
  sealed trait AdminGCCommand extends EMsg
  
  @js.native
  sealed trait AdminGCGetCommandList extends EMsg
  
  @js.native
  sealed trait AdminGCGetCommandListResponse extends EMsg
  
  @js.native
  sealed trait AdminGCSpew extends EMsg
  
  @js.native
  sealed trait AdminLogEvent extends EMsg
  
  @js.native
  sealed trait AdminLogListenRequest extends EMsg
  
  @js.native
  sealed trait AdminMsgSpew extends EMsg
  
   // obsolete
  @js.native
  sealed trait AdminPwLogon extends EMsg
  
   // obsolete
  @js.native
  sealed trait AdminPwLogonResponse extends EMsg
  
  @js.native
  sealed trait AdminSpew extends EMsg
  
  @js.native
  sealed trait Alert extends EMsg
  
  @js.native
  sealed trait AllowUserToPlayQuery extends EMsg
  
  @js.native
  sealed trait AllowUserToPlayResponse extends EMsg
  
  @js.native
  sealed trait AssignSysID extends EMsg
  
  @js.native
  sealed trait BRPCheckActivationCodes extends EMsg
  
  @js.native
  sealed trait BRPCheckActivationCodesResponse extends EMsg
  
  @js.native
  sealed trait BRPCheckFinanceCloseOutDate extends EMsg
  
  @js.native
  sealed trait BRPCheckSettlementReports extends EMsg
  
  @js.native
  sealed trait BRPCommitGC extends EMsg
  
  @js.native
  sealed trait BRPCommitGCResponse extends EMsg
  
  @js.native
  sealed trait BRPCommitWP extends EMsg
  
  @js.native
  sealed trait BRPCommitWPResponse extends EMsg
  
  @js.native
  sealed trait BRPConvertToCurrentKeys extends EMsg
  
  @js.native
  sealed trait BRPConvertToCurrentKeysResponse extends EMsg
  
  @js.native
  sealed trait BRPFindHungTransactions extends EMsg
  
  @js.native
  sealed trait BRPPostTaxToAvalara extends EMsg
  
  @js.native
  sealed trait BRPPostTransactionTax extends EMsg
  
  @js.native
  sealed trait BRPPostTransactionTaxResponse extends EMsg
  
  @js.native
  sealed trait BRPProcessGCReports extends EMsg
  
  @js.native
  sealed trait BRPProcessIMReports extends EMsg
  
  @js.native
  sealed trait BRPProcessLicenses extends EMsg
  
  @js.native
  sealed trait BRPProcessLicensesResponse extends EMsg
  
  @js.native
  sealed trait BRPProcessPPReports extends EMsg
  
  @js.native
  sealed trait BRPProcessPartnerPayments extends EMsg
  
  @js.native
  sealed trait BRPProcessPaymentRules extends EMsg
  
  @js.native
  sealed trait BRPProcessUSBankReports extends EMsg
  
  @js.native
  sealed trait BRPProcessWPReports extends EMsg
  
  @js.native
  sealed trait BRPPruneCardUsageStats extends EMsg
  
  @js.native
  sealed trait BRPPruneCardUsageStatsResponse extends EMsg
  
  @js.native
  sealed trait BRPRemoveExpiredPaymentData extends EMsg
  
  @js.native
  sealed trait BRPRemoveExpiredPaymentDataResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait BRPSettleCB extends EMsg
  
   // obsolete
  @js.native
  sealed trait BRPSettleNOVA extends EMsg
  
  @js.native
  sealed trait BRPStartShippingJobs extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSBannedRequest extends EMsg
  
  @js.native
  sealed trait BSBoaCompraConfirmProductDelivery extends EMsg
  
  @js.native
  sealed trait BSBoaCompraConfirmProductDeliveryResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSChaseRFRRequest extends EMsg
  
  @js.native
  sealed trait BSCheckJobRunning extends EMsg
  
  @js.native
  sealed trait BSCheckJobRunningResponse extends EMsg
  
  @js.native
  sealed trait BSCommitGCTxn extends EMsg
  
  @js.native
  sealed trait BSCommitWPTxn extends EMsg
  
  @js.native
  sealed trait BSCompletePurchase extends EMsg
  
  @js.native
  sealed trait BSCompletePurchaseResponse extends EMsg
  
  @js.native
  sealed trait BSConvertToCurrentKeys extends EMsg
  
  @js.native
  sealed trait BSConvertToCurrentKeysResponse extends EMsg
  
  @js.native
  sealed trait BSGenerateBoaCompraMD5 extends EMsg
  
  @js.native
  sealed trait BSGenerateBoaCompraMD5Response extends EMsg
  
  @js.native
  sealed trait BSGenerateMoPayMD5 extends EMsg
  
  @js.native
  sealed trait BSGenerateMoPayMD5Response extends EMsg
  
  @js.native
  sealed trait BSGetBillingAddress extends EMsg
  
  @js.native
  sealed trait BSGetBillingAddressResponse extends EMsg
  
  @js.native
  sealed trait BSGetCreditCardInfo extends EMsg
  
  @js.native
  sealed trait BSGetCreditCardInfoResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSGetEvents extends EMsg
  
  @js.native
  sealed trait BSGetPayPalUserInfo extends EMsg
  
  @js.native
  sealed trait BSGetPayPalUserInfoResponse extends EMsg
  
  @js.native
  sealed trait BSGetProPackOrderStatus extends EMsg
  
  @js.native
  sealed trait BSGetProPackOrderStatusResponse extends EMsg
  
  @js.native
  sealed trait BSInitGCBankXferTxn extends EMsg
  
  @js.native
  sealed trait BSInitGCBankXferTxnResponse extends EMsg
  
  @js.native
  sealed trait BSInitPayPalTxn extends EMsg
  
  @js.native
  sealed trait BSInitPayPalTxnResponse extends EMsg
  
  @js.native
  sealed trait BSInitPurchase extends EMsg
  
  @js.native
  sealed trait BSInitPurchaseResponse extends EMsg
  
  @js.native
  sealed trait BSMoPayConfirmProductDelivery extends EMsg
  
  @js.native
  sealed trait BSMoPayConfirmProductDeliveryResponse extends EMsg
  
  @js.native
  sealed trait BSPaymentInstrBan extends EMsg
  
  @js.native
  sealed trait BSPaymentInstrBanResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSProcessGCReports extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSProcessPPReports extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSProcessUSBankReports extends EMsg
  
  @js.native
  sealed trait BSPruneCardUsageStats extends EMsg
  
  @js.native
  sealed trait BSPruneCardUsageStatsResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSPurchaseResponse extends EMsg
  
  @js.native
  sealed trait BSPurchaseRunFraudChecks extends EMsg
  
  @js.native
  sealed trait BSPurchaseRunFraudChecksResponse extends EMsg
  
  @js.native
  sealed trait BSPurchaseStart extends EMsg
  
  @js.native
  sealed trait BSQiwiWalletInvoice extends EMsg
  
  @js.native
  sealed trait BSQiwiWalletInvoiceResponse extends EMsg
  
  @js.native
  sealed trait BSQueryBankInformation extends EMsg
  
  @js.native
  sealed trait BSQueryBankInformationResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSQueryCBOrderStatus extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSQueryCBOrderStatusResponse extends EMsg
  
  @js.native
  sealed trait BSQueryFindCreditCard extends EMsg
  
  @js.native
  sealed trait BSQueryFindCreditCardResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSQueryGCBankXferTxn extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSQueryGCBankXferTxnResponse extends EMsg
  
  @js.native
  sealed trait BSQueryPaymentInstResponse extends EMsg
  
  @js.native
  sealed trait BSQueryPaymentInstUsage extends EMsg
  
  @js.native
  sealed trait BSQueryTransactionStatus extends EMsg
  
  @js.native
  sealed trait BSQueryTransactionStatusResponse extends EMsg
  
  @js.native
  sealed trait BSQueryTxnExtendedInfo extends EMsg
  
  @js.native
  sealed trait BSQueryTxnExtendedInfoResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSRefundTxn extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSRefundTxnResponse extends EMsg
  
  @js.native
  sealed trait BSRemoveExpiredPaymentData extends EMsg
  
  @js.native
  sealed trait BSRemoveExpiredPaymentDataResponse extends EMsg
  
  @js.native
  sealed trait BSResetPackagePurchaseRateLimit extends EMsg
  
  @js.native
  sealed trait BSResetPackagePurchaseRateLimitResponse extends EMsg
  
  @js.native
  sealed trait BSReverseRedeemPOSAKey extends EMsg
  
  @js.native
  sealed trait BSReverseRedeemPOSAKeyResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSRunRedFlagReport extends EMsg
  
  @js.native
  sealed trait BSSendShippingRequest extends EMsg
  
  @js.native
  sealed trait BSSendShippingRequestResponse extends EMsg
  
  @js.native
  sealed trait BSSettleComplete extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSSettleNOVA extends EMsg
  
   // obsolete
  @js.native
  sealed trait BSStartShippingJobs extends EMsg
  
  @js.native
  sealed trait BSStatusInquiryPOSAKey extends EMsg
  
  @js.native
  sealed trait BSStatusInquiryPOSAKeyResponse extends EMsg
  
  @js.native
  sealed trait BSStoreBankInformation extends EMsg
  
  @js.native
  sealed trait BSStoreBankInformationResponse extends EMsg
  
  @js.native
  sealed trait BSUpdateConversionRates extends EMsg
  
  @js.native
  sealed trait BSUpdateInventoryFromProPack extends EMsg
  
  @js.native
  sealed trait BSUpdateInventoryFromProPackResponse extends EMsg
  
  @js.native
  sealed trait BSUpdatePaymentData extends EMsg
  
  @js.native
  sealed trait BSUpdatePaymentDataResponse extends EMsg
  
  @js.native
  sealed trait BSValidateMoPaySignature extends EMsg
  
  @js.native
  sealed trait BSValidateMoPaySignatureResponse extends EMsg
  
  @js.native
  sealed trait BSValidateXsollaSignature extends EMsg
  
  @js.native
  sealed trait BSValidateXsollaSignatureResponse extends EMsg
  
  @js.native
  sealed trait BSVerifyPOSAKey extends EMsg
  
  @js.native
  sealed trait BSVerifyPOSAKeyResponse extends EMsg
  
  @js.native
  sealed trait BackpackAddToCurrency extends EMsg
  
  @js.native
  sealed trait BackpackAddToCurrencyResponse extends EMsg
  
  @js.native
  sealed trait BackpackBase extends EMsg
  
  @js.native
  sealed trait BadLoginIPList extends EMsg
  
  @js.native
  sealed trait BaseAIS extends EMsg
  
  @js.native
  sealed trait BaseAM extends EMsg
  
  @js.native
  sealed trait BaseAMRange2 extends EMsg
  
  @js.native
  sealed trait BaseATS extends EMsg
  
  @js.native
  sealed trait BaseAdmin extends EMsg
  
  @js.native
  sealed trait BaseBRP extends EMsg
  
  @js.native
  sealed trait BaseBS extends EMsg
  
  @js.native
  sealed trait BaseCCSRange extends EMsg
  
  @js.native
  sealed trait BaseCM extends EMsg
  
  @js.native
  sealed trait BaseCS extends EMsg
  
  @js.native
  sealed trait BaseChannelAuth extends EMsg
  
  @js.native
  sealed trait BaseClient extends EMsg
  
  @js.native
  sealed trait BaseClient2 extends EMsg
  
  @js.native
  sealed trait BaseClient3 extends EMsg
  
  @js.native
  sealed trait BaseDFS extends EMsg
  
  @js.native
  sealed trait BaseDP extends EMsg
  
  @js.native
  sealed trait BaseDRMS extends EMsg
  
   // obsolete
  @js.native
  sealed trait BaseDSS extends EMsg
  
   // obsolete
  @js.native
  sealed trait BaseEPM extends EMsg
  
  @js.native
  sealed trait BaseFBS extends EMsg
  
  @js.native
  sealed trait BaseFTSRange extends EMsg
  
  @js.native
  sealed trait BaseFileXfer extends EMsg
  
  @js.native
  sealed trait BaseGC extends EMsg
  
  @js.native
  sealed trait BaseGM extends EMsg
  
  @js.native
  sealed trait BaseGameServer extends EMsg
  
  @js.native
  sealed trait BaseGeneral extends EMsg
  
  @js.native
  sealed trait BaseLBSRange extends EMsg
  
  @js.native
  sealed trait BaseMDS extends EMsg
  
  @js.native
  sealed trait BaseOGS extends EMsg
  
  @js.native
  sealed trait BaseP2P extends EMsg
  
  @js.native
  sealed trait BasePSRange extends EMsg
  
  @js.native
  sealed trait BaseSM extends EMsg
  
  @js.native
  sealed trait BaseShell extends EMsg
  
  @js.native
  sealed trait BaseTest extends EMsg
  
  @js.native
  sealed trait BaseUFSRange extends EMsg
  
  @js.native
  sealed trait BaseVS extends EMsg
  
  @js.native
  sealed trait BoxMonitorBase extends EMsg
  
  @js.native
  sealed trait BoxMonitorReportRequest extends EMsg
  
  @js.native
  sealed trait BoxMonitorReportResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait CCSAddComment extends EMsg
  
   // obsolete
  @js.native
  sealed trait CCSAddCommentResponse extends EMsg
  
  @js.native
  sealed trait CCSDeleteAllCommentsByAuthor extends EMsg
  
  @js.native
  sealed trait CCSDeleteAllCommentsByAuthorResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait CCSDeleteComment extends EMsg
  
   // obsolete
  @js.native
  sealed trait CCSDeleteCommentResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait CCSGetComments extends EMsg
  
   // obsolete
  @js.native
  sealed trait CCSGetCommentsForNews extends EMsg
  
   // obsolete
  @js.native
  sealed trait CCSGetCommentsForNewsResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait CCSGetCommentsResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait CCSNotifyCommentCount extends EMsg
  
   // obsolete
  @js.native
  sealed trait CCSPreloadComments extends EMsg
  
  @js.native
  sealed trait CEGPropStatusDRMSRequest extends EMsg
  
  @js.native
  sealed trait CEGPropStatusDRMSResponse extends EMsg
  
  @js.native
  sealed trait CEGVersionSetEnableDisableRequest extends EMsg
  
  @js.native
  sealed trait CEGVersionSetEnableDisableResponse extends EMsg
  
  @js.native
  sealed trait CEGWhackFailureReportRequest extends EMsg
  
  @js.native
  sealed trait CEGWhackFailureReportResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait CMAppInfoResponseDeprecated extends EMsg
  
  @js.native
  sealed trait CMSetAllowState extends EMsg
  
  @js.native
  sealed trait CMSpewAllowState extends EMsg
  
  @js.native
  sealed trait CREBase extends EMsg
  
  @js.native
  sealed trait CREEnumeratePublishedFiles extends EMsg
  
  @js.native
  sealed trait CREEnumeratePublishedFilesResponse extends EMsg
  
  @js.native
  sealed trait CREGetUserPublishedItemVoteDetails extends EMsg
  
  @js.native
  sealed trait CREGetUserPublishedItemVoteDetailsResponse extends EMsg
  
  @js.native
  sealed trait CREItemVoteSummary extends EMsg
  
  @js.native
  sealed trait CREItemVoteSummaryResponse extends EMsg
  
  @js.native
  sealed trait CREPublishedFileVoteAdded extends EMsg
  
   // obsolete
  @js.native
  sealed trait CRERankByTrend extends EMsg
  
   // obsolete
  @js.native
  sealed trait CRERankByTrendResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait CRERankByVote extends EMsg
  
   // obsolete
  @js.native
  sealed trait CRERankByVoteResponse extends EMsg
  
  @js.native
  sealed trait CREUpdateUserPublishedItemVote extends EMsg
  
  @js.native
  sealed trait CREUpdateUserPublishedItemVoteResponse extends EMsg
  
  @js.native
  sealed trait CSBase extends EMsg
  
  @js.native
  sealed trait CSPing extends EMsg
  
  @js.native
  sealed trait CSPingResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait CSUserContentApprove extends EMsg
  
   // obsolete
  @js.native
  sealed trait CSUserContentDeny extends EMsg
  
   // obsolete
  @js.native
  sealed trait CSUserContentRequest extends EMsg
  
  @js.native
  sealed trait ChannelAuthChallenge extends EMsg
  
  @js.native
  sealed trait ChannelAuthResponse extends EMsg
  
  @js.native
  sealed trait ChannelAuthResult extends EMsg
  
  @js.native
  sealed trait ChannelEncryptRequest extends EMsg
  
  @js.native
  sealed trait ChannelEncryptResponse extends EMsg
  
  @js.native
  sealed trait ChannelEncryptResult extends EMsg
  
  @js.native
  sealed trait ClientAMGetClanOfficers extends EMsg
  
  @js.native
  sealed trait ClientAMGetClanOfficersResponse extends EMsg
  
  @js.native
  sealed trait ClientAMGetPersonaNameHistory extends EMsg
  
  @js.native
  sealed trait ClientAMGetPersonaNameHistoryResponse extends EMsg
  
  @js.native
  sealed trait ClientAccountInfo extends EMsg
  
  @js.native
  sealed trait ClientAckGuestPass extends EMsg
  
  @js.native
  sealed trait ClientAckGuestPassResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAckMessageByGID extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAckPurchaseReceipt extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAckVACBan extends EMsg
  
  @js.native
  sealed trait ClientAckVACBan2 extends EMsg
  
  @js.native
  sealed trait ClientAcknowledgeClanInvite extends EMsg
  
  @js.native
  sealed trait ClientActivateOEMLicense extends EMsg
  
  @js.native
  sealed trait ClientAddFriend extends EMsg
  
  @js.native
  sealed trait ClientAddFriendResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAnonLogOn_Deprecated extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAnonUserLogOn_Deprecated extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAppInfoChanges extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAppInfoRequest extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAppInfoResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAppInfoUpdate extends EMsg
  
  @js.native
  sealed trait ClientAppMinutesPlayedData extends EMsg
  
  @js.native
  sealed trait ClientAppUsageEvent extends EMsg
  
  @js.native
  sealed trait ClientAuthList extends EMsg
  
  @js.native
  sealed trait ClientAuthListAck extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAuthList_Deprecated extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientAuthorizeLocalDevice extends EMsg
  
  @js.native
  sealed trait ClientAuthorizeLocalDeviceNotification extends EMsg
  
  @js.native
  sealed trait ClientAuthorizeLocalDeviceRequest extends EMsg
  
  @js.native
  sealed trait ClientAuthorizeLocalDeviceResponse extends EMsg
  
  @js.native
  sealed trait ClientBroadcastBase extends EMsg
  
  @js.native
  sealed trait ClientBroadcastDisconnect extends EMsg
  
  @js.native
  sealed trait ClientBroadcastFrames extends EMsg
  
  @js.native
  sealed trait ClientBroadcastInit extends EMsg
  
  @js.native
  sealed trait ClientBroadcastScreenshot extends EMsg
  
  @js.native
  sealed trait ClientBroadcastUploadConfig extends EMsg
  
  @js.native
  sealed trait ClientCMList extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientCancelLicense extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientCancelLicenseResponse extends EMsg
  
  @js.native
  sealed trait ClientChangeStatus extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientChangeSteamGuardOptions extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientChangeSteamGuardOptionsResponse extends EMsg
  
  @js.native
  sealed trait ClientChatAction extends EMsg
  
  @js.native
  sealed trait ClientChatActionResult extends EMsg
  
  @js.native
  sealed trait ClientChatDeclined extends EMsg
  
  @js.native
  sealed trait ClientChatEnter extends EMsg
  
  @js.native
  sealed trait ClientChatInvite extends EMsg
  
  @js.native
  sealed trait ClientChatMemberInfo extends EMsg
  
  @js.native
  sealed trait ClientChatMsg extends EMsg
  
  @js.native
  sealed trait ClientChatRoomInfo extends EMsg
  
  @js.native
  sealed trait ClientCheckAppBetaPassword extends EMsg
  
  @js.native
  sealed trait ClientCheckAppBetaPasswordResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientCheckFileSignature extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientCheckFileSignatureResponse extends EMsg
  
  @js.native
  sealed trait ClientCheckPassword extends EMsg
  
  @js.native
  sealed trait ClientCheckPasswordResponse extends EMsg
  
  @js.native
  sealed trait ClientClanState extends EMsg
  
  @js.native
  sealed trait ClientCommentNotifications extends EMsg
  
  @js.native
  sealed trait ClientConcurrentSessionsBase extends EMsg
  
  @js.native
  sealed trait ClientConnectionStats extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientContentServerLogOn_Deprecated extends EMsg
  
  @js.native
  sealed trait ClientCreateAccount2 extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientCreateAccount3 extends EMsg
  
  @js.native
  sealed trait ClientCreateAccountProto extends EMsg
  
  @js.native
  sealed trait ClientCreateAccountProtoResponse extends EMsg
  
  @js.native
  sealed trait ClientCreateAccountResponse extends EMsg
  
  @js.native
  sealed trait ClientCreateAcctResponse extends EMsg
  
  @js.native
  sealed trait ClientCreateChat extends EMsg
  
  @js.native
  sealed trait ClientCreateChatResponse extends EMsg
  
  @js.native
  sealed trait ClientCurrentUIMode extends EMsg
  
  @js.native
  sealed trait ClientDFSAuthenticateRequest extends EMsg
  
  @js.native
  sealed trait ClientDFSAuthenticateResponse extends EMsg
  
  @js.native
  sealed trait ClientDFSDownloadStatus extends EMsg
  
  @js.native
  sealed trait ClientDFSEndSession extends EMsg
  
  @js.native
  sealed trait ClientDPCheckSpecialSurvey extends EMsg
  
  @js.native
  sealed trait ClientDPCheckSpecialSurveyResponse extends EMsg
  
  @js.native
  sealed trait ClientDPContentStatsReport extends EMsg
  
  @js.native
  sealed trait ClientDPSendSpecialSurveyResponse extends EMsg
  
  @js.native
  sealed trait ClientDPSendSpecialSurveyResponseReply extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientDPSteam2AppStarted extends EMsg
  
  @js.native
  sealed trait ClientDPUpdateAppJobReport extends EMsg
  
  @js.native
  sealed trait ClientDRMBlobRequest extends EMsg
  
  @js.native
  sealed trait ClientDRMBlobResponse extends EMsg
  
  @js.native
  sealed trait ClientDRMDownloadRequest extends EMsg
  
  @js.native
  sealed trait ClientDRMDownloadRequestWithCrashData extends EMsg
  
  @js.native
  sealed trait ClientDRMDownloadResponse extends EMsg
  
  @js.native
  sealed trait ClientDRMFinalResult extends EMsg
  
  @js.native
  sealed trait ClientDRMProblemReport extends EMsg
  
  @js.native
  sealed trait ClientDRMTest extends EMsg
  
  @js.native
  sealed trait ClientDRMTestResult extends EMsg
  
  @js.native
  sealed trait ClientDeauthorizeDevice extends EMsg
  
  @js.native
  sealed trait ClientDeauthorizeDeviceRequest extends EMsg
  
  @js.native
  sealed trait ClientDeregisterWithServer extends EMsg
  
  @js.native
  sealed trait ClientDisableTestLicense extends EMsg
  
  @js.native
  sealed trait ClientDisableTestLicenseResponse extends EMsg
  
  @js.native
  sealed trait ClientDownloadRateStatistics extends EMsg
  
  @js.native
  sealed trait ClientEmailAddrInfo extends EMsg
  
  @js.native
  sealed trait ClientEmailChange3 extends EMsg
  
  @js.native
  sealed trait ClientEmailChange4 extends EMsg
  
  @js.native
  sealed trait ClientEmailChangeResponse extends EMsg
  
  @js.native
  sealed trait ClientEmailChangeResponse4 extends EMsg
  
  @js.native
  sealed trait ClientEmoticonList extends EMsg
  
  @js.native
  sealed trait ClientEnableTestLicense extends EMsg
  
  @js.native
  sealed trait ClientEnableTestLicenseResponse extends EMsg
  
  @js.native
  sealed trait ClientEncryptPct extends EMsg
  
  @js.native
  sealed trait ClientFSEnumerateFollowingList extends EMsg
  
  @js.native
  sealed trait ClientFSEnumerateFollowingListResponse extends EMsg
  
  @js.native
  sealed trait ClientFSGetFollowerCount extends EMsg
  
  @js.native
  sealed trait ClientFSGetFollowerCountResponse extends EMsg
  
  @js.native
  sealed trait ClientFSGetFriendMessageHistory extends EMsg
  
  @js.native
  sealed trait ClientFSGetFriendMessageHistoryForOfflineMessages extends EMsg
  
  @js.native
  sealed trait ClientFSGetFriendMessageHistoryResponse extends EMsg
  
  @js.native
  sealed trait ClientFSGetFriendsSteamLevels extends EMsg
  
  @js.native
  sealed trait ClientFSGetFriendsSteamLevelsResponse extends EMsg
  
  @js.native
  sealed trait ClientFSGetIsFollowing extends EMsg
  
  @js.native
  sealed trait ClientFSGetIsFollowingResponse extends EMsg
  
  @js.native
  sealed trait ClientFSOfflineMessageNotification extends EMsg
  
  @js.native
  sealed trait ClientFSRequestOfflineMessageCount extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientFavoritesList extends EMsg
  
  @js.native
  sealed trait ClientFileToDownload extends EMsg
  
  @js.native
  sealed trait ClientFileToDownloadResponse extends EMsg
  
  @js.native
  sealed trait ClientFriendMsg extends EMsg
  
  @js.native
  sealed trait ClientFriendMsgEchoToSender extends EMsg
  
  @js.native
  sealed trait ClientFriendMsgIncoming extends EMsg
  
  @js.native
  sealed trait ClientFriendProfileInfo extends EMsg
  
  @js.native
  sealed trait ClientFriendProfileInfoResponse extends EMsg
  
  @js.native
  sealed trait ClientFriendRemovedFromSource extends EMsg
  
  @js.native
  sealed trait ClientFriendUserStatusPublished extends EMsg
  
  @js.native
  sealed trait ClientFriendsGroupsList extends EMsg
  
  @js.native
  sealed trait ClientFriendsList extends EMsg
  
  @js.native
  sealed trait ClientFromGC extends EMsg
  
  @js.native
  sealed trait ClientGCMsgFailed extends EMsg
  
  @js.native
  sealed trait ClientGMSServerQuery extends EMsg
  
  @js.native
  sealed trait ClientGameConnectDeny extends EMsg
  
  @js.native
  sealed trait ClientGameConnectTokens extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGameConnect_obsolete extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGameEnded_obsolete extends EMsg
  
  @js.native
  sealed trait ClientGamesPlayed extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGamesPlayed2_obsolete extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGamesPlayed3_obsolete extends EMsg
  
  @js.native
  sealed trait ClientGamesPlayedNoDataBlob extends EMsg
  
  @js.native
  sealed trait ClientGamesPlayedWithDataBlob extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGamesPlayed_obsolete extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetAppBetaPasswords extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetAppBetaPasswordsResponse extends EMsg
  
  @js.native
  sealed trait ClientGetAppOwnershipTicket extends EMsg
  
  @js.native
  sealed trait ClientGetAppOwnershipTicketResponse extends EMsg
  
  @js.native
  sealed trait ClientGetAuthorizedDevices extends EMsg
  
  @js.native
  sealed trait ClientGetAuthorizedDevicesResponse extends EMsg
  
  @js.native
  sealed trait ClientGetCDNAuthToken extends EMsg
  
  @js.native
  sealed trait ClientGetCDNAuthTokenResponse extends EMsg
  
  @js.native
  sealed trait ClientGetClanActivityCounts extends EMsg
  
  @js.native
  sealed trait ClientGetClanActivityCountsResponse extends EMsg
  
  @js.native
  sealed trait ClientGetClientAppList extends EMsg
  
  @js.native
  sealed trait ClientGetClientAppListResponse extends EMsg
  
  @js.native
  sealed trait ClientGetClientDetails extends EMsg
  
  @js.native
  sealed trait ClientGetClientDetailsResponse extends EMsg
  
  @js.native
  sealed trait ClientGetDepotDecryptionKey extends EMsg
  
  @js.native
  sealed trait ClientGetDepotDecryptionKeyResponse extends EMsg
  
  @js.native
  sealed trait ClientGetEmoticonList extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetFinalPrice extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetFinalPriceResponse extends EMsg
  
  @js.native
  sealed trait ClientGetFriendsWhoPlayGame extends EMsg
  
  @js.native
  sealed trait ClientGetFriendsWhoPlayGameResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetGiftTargetList extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetGiftTargetListResponse extends EMsg
  
  @js.native
  sealed trait ClientGetLegacyGameKey extends EMsg
  
  @js.native
  sealed trait ClientGetLegacyGameKeyResponse extends EMsg
  
  @js.native
  sealed trait ClientGetLicenses extends EMsg
  
  @js.native
  sealed trait ClientGetLobbyListResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetLobbyMetadata extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetLobbyMetadataResponse extends EMsg
  
  @js.native
  sealed trait ClientGetMicroTxnInfo extends EMsg
  
  @js.native
  sealed trait ClientGetMicroTxnInfoResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayers extends EMsg
  
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayersDP extends EMsg
  
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayersDPResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientGetNumberOfCurrentPlayersResponse extends EMsg
  
  @js.native
  sealed trait ClientGetPurchaseReceipts extends EMsg
  
  @js.native
  sealed trait ClientGetUserStats extends EMsg
  
  @js.native
  sealed trait ClientGetUserStatsResponse extends EMsg
  
  @js.native
  sealed trait ClientHeartBeat extends EMsg
  
  @js.native
  sealed trait ClientHideFriend extends EMsg
  
  @js.native
  sealed trait ClientInformOfCreateAccount extends EMsg
  
  @js.native
  sealed trait ClientInformOfResetForgottenPassword extends EMsg
  
  @js.native
  sealed trait ClientInformOfResetForgottenPasswordResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientInitPurchase extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientInitPurchaseResponse extends EMsg
  
  @js.native
  sealed trait ClientInstallClientApp extends EMsg
  
  @js.native
  sealed trait ClientInstallClientAppResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientInviteFriend extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientInviteFriendResponse extends EMsg
  
  @js.native
  sealed trait ClientInviteUserToClan extends EMsg
  
  @js.native
  sealed trait ClientIsLimitedAccount extends EMsg
  
  @js.native
  sealed trait ClientItemAnnouncements extends EMsg
  
  @js.native
  sealed trait ClientJoinChat extends EMsg
  
  @js.native
  sealed trait ClientKickPlayingSession extends EMsg
  
  @js.native
  sealed trait ClientLBSFindOrCreateLB extends EMsg
  
  @js.native
  sealed trait ClientLBSFindOrCreateLBResponse extends EMsg
  
  @js.native
  sealed trait ClientLBSGetLBEntries extends EMsg
  
  @js.native
  sealed trait ClientLBSGetLBEntriesResponse extends EMsg
  
  @js.native
  sealed trait ClientLBSSetScore extends EMsg
  
  @js.native
  sealed trait ClientLBSSetScoreResponse extends EMsg
  
  @js.native
  sealed trait ClientLBSSetUGC extends EMsg
  
  @js.native
  sealed trait ClientLBSSetUGCResponse extends EMsg
  
  @js.native
  sealed trait ClientLicenseList extends EMsg
  
  @js.native
  sealed trait ClientLogOff extends EMsg
  
  @js.native
  sealed trait ClientLogOnResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientLogOnWithCredentials_Deprecated extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientLogOnWithHash_Deprecated extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientLogOn_Deprecated extends EMsg
  
  @js.native
  sealed trait ClientLoggedOff extends EMsg
  
  @js.native
  sealed trait ClientLogon extends EMsg
  
  @js.native
  sealed trait ClientLogonGameServer extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientLookupKey extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientLookupKeyResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSGetDepotManifest extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSGetDepotManifestChunk extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSGetDepotManifestResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSGetPrevDepotBuild extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSGetPrevDepotBuildResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSHeartbeat extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSInitDepotBuildRequest extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSInitDepotBuildResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSInitWorkshopBuildRequest extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSInitWorkshopBuildResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSLoginRequest extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSLoginResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSRegisterAppBuild extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSRegisterAppBuildResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSSetAppBuildLive extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSSetAppBuildLiveResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSSignInstallScript extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSSignInstallScriptResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSTransmitManifestDataChunk extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSUploadDepotChunks extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSUploadDepotChunksResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSUploadManifestRequest extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSUploadManifestResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSUploadRateTest extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMDSUploadRateTestResponse extends EMsg
  
  @js.native
  sealed trait ClientMMSCreateLobby extends EMsg
  
  @js.native
  sealed trait ClientMMSCreateLobbyResponse extends EMsg
  
  @js.native
  sealed trait ClientMMSFlushFrenemyListCache extends EMsg
  
  @js.native
  sealed trait ClientMMSFlushFrenemyListCacheResponse extends EMsg
  
  @js.native
  sealed trait ClientMMSGetLobbyData extends EMsg
  
  @js.native
  sealed trait ClientMMSGetLobbyList extends EMsg
  
  @js.native
  sealed trait ClientMMSGetLobbyListResponse extends EMsg
  
  @js.native
  sealed trait ClientMMSInviteToLobby extends EMsg
  
  @js.native
  sealed trait ClientMMSJoinLobby extends EMsg
  
  @js.native
  sealed trait ClientMMSJoinLobbyResponse extends EMsg
  
  @js.native
  sealed trait ClientMMSLeaveLobby extends EMsg
  
  @js.native
  sealed trait ClientMMSLeaveLobbyResponse extends EMsg
  
  @js.native
  sealed trait ClientMMSLobbyChatMsg extends EMsg
  
  @js.native
  sealed trait ClientMMSLobbyData extends EMsg
  
  @js.native
  sealed trait ClientMMSLobbyGameServerSet extends EMsg
  
  @js.native
  sealed trait ClientMMSSendLobbyChatMsg extends EMsg
  
  @js.native
  sealed trait ClientMMSSetLobbyData extends EMsg
  
  @js.native
  sealed trait ClientMMSSetLobbyDataResponse extends EMsg
  
  @js.native
  sealed trait ClientMMSSetLobbyGameServer extends EMsg
  
  @js.native
  sealed trait ClientMMSSetLobbyLinked extends EMsg
  
  @js.native
  sealed trait ClientMMSSetLobbyOwner extends EMsg
  
  @js.native
  sealed trait ClientMMSSetLobbyOwnerResponse extends EMsg
  
  @js.native
  sealed trait ClientMMSUserJoinedLobby extends EMsg
  
  @js.native
  sealed trait ClientMMSUserLeftLobby extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientMarketingMessageUpdate extends EMsg
  
  @js.native
  sealed trait ClientMarketingMessageUpdate2 extends EMsg
  
  @js.native
  sealed trait ClientMicroTxnAuthRequest extends EMsg
  
  @js.native
  sealed trait ClientMicroTxnAuthorize extends EMsg
  
  @js.native
  sealed trait ClientMicroTxnAuthorizeResponse extends EMsg
  
  @js.native
  sealed trait ClientNOP extends EMsg
  
  @js.native
  sealed trait ClientNatTraversalStatEvent extends EMsg
  
  @js.native
  sealed trait ClientNewLoginKey extends EMsg
  
  @js.native
  sealed trait ClientNewLoginKeyAccepted extends EMsg
  
  @js.native
  sealed trait ClientNewsUpdate extends EMsg
  
  @js.native
  sealed trait ClientNoUDPConnectivity extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientNotLoggedOnDeprecated extends EMsg
  
  @js.native
  sealed trait ClientOGSBeginSession extends EMsg
  
  @js.native
  sealed trait ClientOGSBeginSessionResponse extends EMsg
  
  @js.native
  sealed trait ClientOGSEndSession extends EMsg
  
  @js.native
  sealed trait ClientOGSEndSessionResponse extends EMsg
  
  @js.native
  sealed trait ClientOGSGameServerPingSample extends EMsg
  
  @js.native
  sealed trait ClientOGSReportBug extends EMsg
  
  @js.native
  sealed trait ClientOGSReportString extends EMsg
  
  @js.native
  sealed trait ClientOGSWriteRow extends EMsg
  
  @js.native
  sealed trait ClientP2PConnectionFailInfo extends EMsg
  
  @js.native
  sealed trait ClientP2PConnectionInfo extends EMsg
  
  @js.native
  sealed trait ClientP2PIntroducerMessage extends EMsg
  
  @js.native
  sealed trait ClientPICSAccessTokenRequest extends EMsg
  
  @js.native
  sealed trait ClientPICSAccessTokenResponse extends EMsg
  
  @js.native
  sealed trait ClientPICSChangesSinceRequest extends EMsg
  
  @js.native
  sealed trait ClientPICSChangesSinceResponse extends EMsg
  
  @js.native
  sealed trait ClientPICSProductInfoRequest extends EMsg
  
  @js.native
  sealed trait ClientPICSProductInfoResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientPackageInfoRequest extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientPackageInfoResponse extends EMsg
  
  @js.native
  sealed trait ClientPackageVersions extends EMsg
  
  @js.native
  sealed trait ClientPasswordChange3 extends EMsg
  
  @js.native
  sealed trait ClientPasswordChangeResponse extends EMsg
  
  @js.native
  sealed trait ClientPersonaChangeResponse extends EMsg
  
  @js.native
  sealed trait ClientPersonaState extends EMsg
  
  @js.native
  sealed trait ClientPersonalQAChange3 extends EMsg
  
  @js.native
  sealed trait ClientPing extends EMsg
  
  @js.native
  sealed trait ClientPingResponse extends EMsg
  
  @js.native
  sealed trait ClientPlayerNicknameList extends EMsg
  
  @js.native
  sealed trait ClientPlayingSessionState extends EMsg
  
  @js.native
  sealed trait ClientPurchaseResponse extends EMsg
  
  @js.native
  sealed trait ClientPurchaseWithMachineID extends EMsg
  
  @js.native
  sealed trait ClientReadMachineAuth extends EMsg
  
  @js.native
  sealed trait ClientReadMachineAuthResponse extends EMsg
  
  @js.native
  sealed trait ClientRedeemGuestPass extends EMsg
  
  @js.native
  sealed trait ClientRedeemGuestPassResponse extends EMsg
  
  @js.native
  sealed trait ClientRegisterAuthTicketWithCM extends EMsg
  
  @js.native
  sealed trait ClientRegisterKey extends EMsg
  
  @js.native
  sealed trait ClientRegisterOEMMachine extends EMsg
  
  @js.native
  sealed trait ClientRegisterOEMMachineResponse extends EMsg
  
  @js.native
  sealed trait ClientRemoveFriend extends EMsg
  
  @js.native
  sealed trait ClientReportOverlayDetourFailure extends EMsg
  
  @js.native
  sealed trait ClientRequestAccountData extends EMsg
  
  @js.native
  sealed trait ClientRequestAccountDataResponse extends EMsg
  
  @js.native
  sealed trait ClientRequestAuthList extends EMsg
  
  @js.native
  sealed trait ClientRequestChangeMail extends EMsg
  
  @js.native
  sealed trait ClientRequestChangeMailResponse extends EMsg
  
  @js.native
  sealed trait ClientRequestCommentNotifications extends EMsg
  
  @js.native
  sealed trait ClientRequestEncryptedAppTicket extends EMsg
  
  @js.native
  sealed trait ClientRequestEncryptedAppTicketResponse extends EMsg
  
  @js.native
  sealed trait ClientRequestForgottenPasswordEmail extends EMsg
  
  @js.native
  sealed trait ClientRequestForgottenPasswordEmail3 extends EMsg
  
  @js.native
  sealed trait ClientRequestForgottenPasswordEmailResponse extends EMsg
  
  @js.native
  sealed trait ClientRequestFreeLicense extends EMsg
  
  @js.native
  sealed trait ClientRequestFreeLicenseResponse extends EMsg
  
  @js.native
  sealed trait ClientRequestFriendData extends EMsg
  
  @js.native
  sealed trait ClientRequestFriendship extends EMsg
  
  @js.native
  sealed trait ClientRequestItemAnnouncements extends EMsg
  
  @js.native
  sealed trait ClientRequestMachineAuth extends EMsg
  
  @js.native
  sealed trait ClientRequestMachineAuthResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientRequestOAuthTokenForApp extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientRequestOAuthTokenForAppResponse extends EMsg
  
  @js.native
  sealed trait ClientRequestValidationMail extends EMsg
  
  @js.native
  sealed trait ClientRequestValidationMailResponse extends EMsg
  
  @js.native
  sealed trait ClientRequestWebAPIAuthenticateUserNonce extends EMsg
  
  @js.native
  sealed trait ClientRequestWebAPIAuthenticateUserNonceResponse extends EMsg
  
  @js.native
  sealed trait ClientRequestedClientStats extends EMsg
  
  @js.native
  sealed trait ClientResetForgottenPassword extends EMsg
  
  @js.native
  sealed trait ClientResetForgottenPassword3 extends EMsg
  
  @js.native
  sealed trait ClientResetForgottenPassword4 extends EMsg
  
  @js.native
  sealed trait ClientResetForgottenPasswordResponse extends EMsg
  
  @js.native
  sealed trait ClientResetPassword extends EMsg
  
  @js.native
  sealed trait ClientResetPasswordResponse extends EMsg
  
  @js.native
  sealed trait ClientRichPresenceInfo extends EMsg
  
  @js.native
  sealed trait ClientRichPresenceRequest extends EMsg
  
  @js.native
  sealed trait ClientRichPresenceUpload extends EMsg
  
  @js.native
  sealed trait ClientScreenshotsChanged extends EMsg
  
  @js.native
  sealed trait ClientSecretQAChangeResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientSendGuestPass extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientSendGuestPassResponse extends EMsg
  
  @js.native
  sealed trait ClientSentLogs extends EMsg
  
  @js.native
  sealed trait ClientServerList extends EMsg
  
  @js.native
  sealed trait ClientServerUnavailable extends EMsg
  
  @js.native
  sealed trait ClientServersAvailable extends EMsg
  
  @js.native
  sealed trait ClientServiceCall extends EMsg
  
  @js.native
  sealed trait ClientServiceCallResponse extends EMsg
  
  @js.native
  sealed trait ClientServiceMethod extends EMsg
  
  @js.native
  sealed trait ClientServiceMethodResponse extends EMsg
  
  @js.native
  sealed trait ClientServiceModule extends EMsg
  
  @js.native
  sealed trait ClientSessionEnd extends EMsg
  
  @js.native
  sealed trait ClientSessionStart extends EMsg
  
  @js.native
  sealed trait ClientSessionToken extends EMsg
  
  @js.native
  sealed trait ClientSessionUpdate extends EMsg
  
   // obsolete "renamed to ClientSessionUpdate"
  @js.native
  sealed trait ClientSessionUpdateAuthTicket extends EMsg
  
  @js.native
  sealed trait ClientSetClientAppUpdateState extends EMsg
  
  @js.native
  sealed trait ClientSetClientAppUpdateStateResponse extends EMsg
  
  @js.native
  sealed trait ClientSetHeartbeatRate extends EMsg
  
  @js.native
  sealed trait ClientSetIgnoreFriend extends EMsg
  
  @js.native
  sealed trait ClientSetIgnoreFriendResponse extends EMsg
  
   // obsolete "renamed to SLCBase"
  @js.native
  sealed trait ClientSharedLibraryBase extends EMsg
  
  @js.native
  sealed trait ClientSharedLibraryLockStatus extends EMsg
  
  @js.native
  sealed trait ClientSharedLibraryStopPlaying extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientSharedLicensesLockStatus extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientSharedLicensesStopPlaying extends EMsg
  
  @js.native
  sealed trait ClientStat extends EMsg
  
  @js.native
  sealed trait ClientStat2 extends EMsg
  
  @js.native
  sealed trait ClientStat2Int32 extends EMsg
  
  @js.native
  sealed trait ClientStatsUpdated extends EMsg
  
  @js.native
  sealed trait ClientSteamUsageEvent extends EMsg
  
  @js.native
  sealed trait ClientStoreUserStats extends EMsg
  
  @js.native
  sealed trait ClientStoreUserStats2 extends EMsg
  
  @js.native
  sealed trait ClientStoreUserStatsResponse extends EMsg
  
  @js.native
  sealed trait ClientSubscribeToPersonaFeed extends EMsg
  
  @js.native
  sealed trait ClientSystemIM extends EMsg
  
  @js.native
  sealed trait ClientSystemIMAck extends EMsg
  
  @js.native
  sealed trait ClientTicketAuthComplete extends EMsg
  
  @js.native
  sealed trait ClientToGC extends EMsg
  
  @js.native
  sealed trait ClientUCMAddScreenshot extends EMsg
  
  @js.native
  sealed trait ClientUCMAddScreenshotResponse extends EMsg
  
  @js.native
  sealed trait ClientUCMDeletePublishedFile extends EMsg
  
  @js.native
  sealed trait ClientUCMDeletePublishedFileResponse extends EMsg
  
  @js.native
  sealed trait ClientUCMDeleteScreenshot extends EMsg
  
  @js.native
  sealed trait ClientUCMDeleteScreenshotResponse extends EMsg
  
  @js.native
  sealed trait ClientUCMEnumeratePublishedFilesByUserAction extends EMsg
  
  @js.native
  sealed trait ClientUCMEnumeratePublishedFilesByUserActionResponse extends EMsg
  
  @js.native
  sealed trait ClientUCMEnumerateUserPublishedFiles extends EMsg
  
  @js.native
  sealed trait ClientUCMEnumerateUserPublishedFilesResponse extends EMsg
  
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFiles extends EMsg
  
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFilesResponse extends EMsg
  
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFilesWithUpdates extends EMsg
  
  @js.native
  sealed trait ClientUCMEnumerateUserSubscribedFilesWithUpdatesResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientUCMGetPublishedFileDetails extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientUCMGetPublishedFileDetailsResponse extends EMsg
  
  @js.native
  sealed trait ClientUCMGetPublishedFilesForUser extends EMsg
  
  @js.native
  sealed trait ClientUCMGetPublishedFilesForUserResponse extends EMsg
  
  @js.native
  sealed trait ClientUCMPublishFile extends EMsg
  
  @js.native
  sealed trait ClientUCMPublishFileResponse extends EMsg
  
  @js.native
  sealed trait ClientUCMPublishedFileDeleted extends EMsg
  
  @js.native
  sealed trait ClientUCMPublishedFileSubscribed extends EMsg
  
  @js.native
  sealed trait ClientUCMPublishedFileUnsubscribed extends EMsg
  
  @js.native
  sealed trait ClientUCMSetUserPublishedFileAction extends EMsg
  
  @js.native
  sealed trait ClientUCMSetUserPublishedFileActionResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientUCMSubscribePublishedFile extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientUCMSubscribePublishedFileResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientUCMUnsubscribePublishedFile extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientUCMUnsubscribePublishedFileResponse extends EMsg
  
  @js.native
  sealed trait ClientUCMUpdatePublishedFile extends EMsg
  
  @js.native
  sealed trait ClientUCMUpdatePublishedFileResponse extends EMsg
  
  @js.native
  sealed trait ClientUDSInviteToGame extends EMsg
  
  @js.native
  sealed trait ClientUDSP2PSessionEnded extends EMsg
  
  @js.native
  sealed trait ClientUDSP2PSessionStarted extends EMsg
  
  @js.native
  sealed trait ClientUFSDeleteFileRequest extends EMsg
  
  @js.native
  sealed trait ClientUFSDeleteFileResponse extends EMsg
  
  @js.native
  sealed trait ClientUFSDownloadChunk extends EMsg
  
  @js.native
  sealed trait ClientUFSDownloadRequest extends EMsg
  
  @js.native
  sealed trait ClientUFSDownloadResponse extends EMsg
  
  @js.native
  sealed trait ClientUFSGetFileListForApp extends EMsg
  
  @js.native
  sealed trait ClientUFSGetFileListForAppResponse extends EMsg
  
  @js.native
  sealed trait ClientUFSGetSingleFileInfo extends EMsg
  
  @js.native
  sealed trait ClientUFSGetSingleFileInfoResponse extends EMsg
  
  @js.native
  sealed trait ClientUFSGetUGCDetails extends EMsg
  
  @js.native
  sealed trait ClientUFSGetUGCDetailsResponse extends EMsg
  
  @js.native
  sealed trait ClientUFSLoginRequest extends EMsg
  
  @js.native
  sealed trait ClientUFSLoginResponse extends EMsg
  
  @js.native
  sealed trait ClientUFSShareFile extends EMsg
  
  @js.native
  sealed trait ClientUFSShareFileResponse extends EMsg
  
  @js.native
  sealed trait ClientUFSTransferHeartbeat extends EMsg
  
  @js.native
  sealed trait ClientUFSUploadFileChunk extends EMsg
  
  @js.native
  sealed trait ClientUFSUploadFileFinished extends EMsg
  
  @js.native
  sealed trait ClientUFSUploadFileRequest extends EMsg
  
  @js.native
  sealed trait ClientUFSUploadFileResponse extends EMsg
  
  @js.native
  sealed trait ClientUGSGetGlobalStats extends EMsg
  
  @js.native
  sealed trait ClientUGSGetGlobalStatsResponse extends EMsg
  
  @js.native
  sealed trait ClientUninstallClientApp extends EMsg
  
  @js.native
  sealed trait ClientUninstallClientAppResponse extends EMsg
  
  @js.native
  sealed trait ClientUnlockStreaming extends EMsg
  
  @js.native
  sealed trait ClientUnlockStreamingResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientUpdateChatMetadata extends EMsg
  
  @js.native
  sealed trait ClientUpdateGuestPassesList extends EMsg
  
  @js.native
  sealed trait ClientUpdateMachineAuth extends EMsg
  
  @js.native
  sealed trait ClientUpdateMachineAuthResponse extends EMsg
  
  @js.native
  sealed trait ClientUpdateUserGameInfo extends EMsg
  
  @js.native
  sealed trait ClientUseLocalDeviceAuthorizations extends EMsg
  
  @js.native
  sealed trait ClientUserNotifications extends EMsg
  
  @js.native
  sealed trait ClientVACBanStatus extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientVACChallenge extends EMsg
  
  @js.native
  sealed trait ClientVACResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientVTTCert extends EMsg
  
   // obsolete
  @js.native
  sealed trait ClientVacStatusQuery extends EMsg
  
  @js.native
  sealed trait ClientVacStatusResponse extends EMsg
  
  @js.native
  sealed trait ClientVanityURLChangedNotification extends EMsg
  
  @js.native
  sealed trait ClientVerifyPassword extends EMsg
  
  @js.native
  sealed trait ClientVerifyPasswordResponse extends EMsg
  
  @js.native
  sealed trait ClientVoiceCallPreAuthorize extends EMsg
  
  @js.native
  sealed trait ClientVoiceCallPreAuthorizeResponse extends EMsg
  
  @js.native
  sealed trait ClientWalletInfoUpdate extends EMsg
  
  @js.native
  sealed trait ClientWorkshopItemChangesRequest extends EMsg
  
  @js.native
  sealed trait ClientWorkshopItemChangesResponse extends EMsg
  
  @js.native
  sealed trait ClientWorkshopItemInfoRequest extends EMsg
  
  @js.native
  sealed trait ClientWorkshopItemInfoResponse extends EMsg
  
  @js.native
  sealed trait CommunityAddFriendNews extends EMsg
  
  @js.native
  sealed trait CommunityDeleteUserNews extends EMsg
  
  @js.native
  sealed trait CommunityGetUserFriendNews extends EMsg
  
  @js.native
  sealed trait ContentDescriptionUpdate extends EMsg
  
  @js.native
  sealed trait DFSAcceptedResponse extends EMsg
  
  @js.native
  sealed trait DFSConnection extends EMsg
  
  @js.native
  sealed trait DFSConnectionReply extends EMsg
  
  @js.native
  sealed trait DFSGetFile extends EMsg
  
  @js.native
  sealed trait DFSGetFileFromServer extends EMsg
  
  @js.native
  sealed trait DFSInstallLocalFile extends EMsg
  
  @js.native
  sealed trait DFSPurgeFile extends EMsg
  
  @js.native
  sealed trait DFSRecvTransmitFile extends EMsg
  
  @js.native
  sealed trait DFSRequestPingback extends EMsg
  
  @js.native
  sealed trait DFSRequestPingback2 extends EMsg
  
  @js.native
  sealed trait DFSResponsePingback2 extends EMsg
  
  @js.native
  sealed trait DFSRouteFile extends EMsg
  
  @js.native
  sealed trait DFSRouteFileResponse extends EMsg
  
  @js.native
  sealed trait DFSSendTransmitFile extends EMsg
  
  @js.native
  sealed trait DFSStartTransfer extends EMsg
  
  @js.native
  sealed trait DFSTransferComplete extends EMsg
  
  @js.native
  sealed trait DPAccountCreationStats extends EMsg
  
  @js.native
  sealed trait DPAchievementStats extends EMsg
  
  @js.native
  sealed trait DPBlockingStats extends EMsg
  
  @js.native
  sealed trait DPCloudStats extends EMsg
  
   // obsolete
  @js.native
  sealed trait DPDownloadRateStatistics extends EMsg
  
  @js.native
  sealed trait DPFacebookStatistics extends EMsg
  
   // obsolete
  @js.native
  sealed trait DPGamePlayedStats extends EMsg
  
  @js.native
  sealed trait DPGameServersPlayersStats extends EMsg
  
  @js.native
  sealed trait DPGetPlayerCount extends EMsg
  
  @js.native
  sealed trait DPGetPlayerCountResponse extends EMsg
  
  @js.native
  sealed trait DPNatTraversalStats extends EMsg
  
  @js.native
  sealed trait DPPartnerMicroTxns extends EMsg
  
  @js.native
  sealed trait DPPartnerMicroTxnsResponse extends EMsg
  
  @js.native
  sealed trait DPSetPublishingState extends EMsg
  
   // obsolete
  @js.native
  sealed trait DPSteamUsageEvent extends EMsg
  
  @js.native
  sealed trait DPStoreSaleStatistics extends EMsg
  
  @js.native
  sealed trait DPStreamingUniquePlayersStat extends EMsg
  
  @js.native
  sealed trait DPUniquePlayersStat extends EMsg
  
  @js.native
  sealed trait DPUpdateContentEvent extends EMsg
  
  @js.native
  sealed trait DPVRUniquePlayersStat extends EMsg
  
  @js.native
  sealed trait DPVacBanStats extends EMsg
  
  @js.native
  sealed trait DPVacCafeBanStats extends EMsg
  
  @js.native
  sealed trait DPVacCertBanStats extends EMsg
  
  @js.native
  sealed trait DPVacInfractionStats extends EMsg
  
  @js.native
  sealed trait DRMAdminUpdate extends EMsg
  
  @js.native
  sealed trait DRMAdminUpdateResponse extends EMsg
  
  @js.native
  sealed trait DRMBuildBlobRequest extends EMsg
  
  @js.native
  sealed trait DRMBuildBlobResponse extends EMsg
  
  @js.native
  sealed trait DRMDetailsReportRequest extends EMsg
  
  @js.native
  sealed trait DRMDetailsReportResponse extends EMsg
  
  @js.native
  sealed trait DRMEmptyGuidCache extends EMsg
  
  @js.native
  sealed trait DRMEmptyGuidCacheResponse extends EMsg
  
  @js.native
  sealed trait DRMProcessFile extends EMsg
  
  @js.native
  sealed trait DRMProcessFileResponse extends EMsg
  
  @js.native
  sealed trait DRMRange2 extends EMsg
  
  @js.native
  sealed trait DRMResolveGuidRequest extends EMsg
  
  @js.native
  sealed trait DRMResolveGuidResponse extends EMsg
  
  @js.native
  sealed trait DRMSFetchVersionSet extends EMsg
  
  @js.native
  sealed trait DRMSFetchVersionSetResponse extends EMsg
  
  @js.native
  sealed trait DRMStabilityReport extends EMsg
  
  @js.native
  sealed trait DRMStabilityReportResponse extends EMsg
  
  @js.native
  sealed trait DRMSync extends EMsg
  
  @js.native
  sealed trait DRMSyncResponse extends EMsg
  
  @js.native
  sealed trait DRMVariabilityReport extends EMsg
  
  @js.native
  sealed trait DRMVariabilityReportResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcess extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessAnalyzeFileRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessAnalyzeFileResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessBackfillOriginalRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessBackfillOriginalResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessDRMAndSign extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessDRMAndSignResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessDescribeSecretRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessDescribeSecretResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessEvaluateCrashRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessEvaluateCrashResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessExamineBlobRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessExamineBlobResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessGetBlobRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessGetBlobResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait DRMWorkerProcessGetDRMGuidsFromFileRequest extends EMsg
  
   // obsolete
  @js.native
  sealed trait DRMWorkerProcessGetDRMGuidsFromFileResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessInstallAllRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessInstallAllResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessInstallDRMDLLRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessInstallDRMDLLResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessInstallProcessedFilesRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessInstallProcessedFilesResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessSecretIdStringRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessSecretIdStringResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessSplitAndInstallRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessSplitAndInstallResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessSteamworksInfoRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessSteamworksInfoResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessUnpackBlobRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessUnpackBlobResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessValidateDRMDLLRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessValidateDRMDLLResponse extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessValidateFileRequest extends EMsg
  
  @js.native
  sealed trait DRMWorkerProcessValidateFileResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait DSSCurrentFileList extends EMsg
  
   // obsolete
  @js.native
  sealed trait DSSNewFile extends EMsg
  
   // obsolete
  @js.native
  sealed trait DSSSynchList extends EMsg
  
   // obsolete
  @js.native
  sealed trait DSSSynchListResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait DSSSynchSubscribe extends EMsg
  
   // obsolete
  @js.native
  sealed trait DSSSynchUnsubscribe extends EMsg
  
  @js.native
  sealed trait DestJobFailed extends EMsg
  
  @js.native
  sealed trait DeviceAuthorizationBase extends EMsg
  
  @js.native
  sealed trait DirRequest extends EMsg
  
  @js.native
  sealed trait DirResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait EPMRestartProcess extends EMsg
  
   // obsolete
  @js.native
  sealed trait EPMStartProcess extends EMsg
  
   // obsolete
  @js.native
  sealed trait EPMStopProcess extends EMsg
  
  @js.native
  sealed trait EconBase extends EMsg
  
  @js.native
  sealed trait EconCDKeyProcessTransaction extends EMsg
  
  @js.native
  sealed trait EconCDKeyProcessTransactionResponse extends EMsg
  
  @js.native
  sealed trait EconFlushInventoryCache extends EMsg
  
  @js.native
  sealed trait EconFlushInventoryCacheResponse extends EMsg
  
  @js.native
  sealed trait EconGetErrorLogs extends EMsg
  
  @js.native
  sealed trait EconGetErrorLogsResponse extends EMsg
  
  @js.native
  sealed trait EconTrading_CancelTradeRequest extends EMsg
  
  @js.native
  sealed trait EconTrading_InitiateTradeProposed extends EMsg
  
  @js.native
  sealed trait EconTrading_InitiateTradeRequest extends EMsg
  
  @js.native
  sealed trait EconTrading_InitiateTradeResponse extends EMsg
  
  @js.native
  sealed trait EconTrading_InitiateTradeResult extends EMsg
  
  @js.native
  sealed trait EconTrading_StartSession extends EMsg
  
  @js.native
  sealed trait Exit extends EMsg
  
  @js.native
  sealed trait ExitShell extends EMsg
  
  @js.native
  sealed trait ExitShells extends EMsg
  
  @js.native
  sealed trait FBSApplyAccountCred extends EMsg
  
  @js.native
  sealed trait FBSApplyAccountCredResponse extends EMsg
  
  @js.native
  sealed trait FBSApplyOSUpdates extends EMsg
  
  @js.native
  sealed trait FBSBootstrapperGetPackageChunk extends EMsg
  
  @js.native
  sealed trait FBSBootstrapperGetPackageChunkResponse extends EMsg
  
  @js.native
  sealed trait FBSBootstrapperPackageRequest extends EMsg
  
  @js.native
  sealed trait FBSBootstrapperPackageResponse extends EMsg
  
  @js.native
  sealed trait FBSBootstrapperPackageTransferProgress extends EMsg
  
  @js.native
  sealed trait FBSConnectionData extends EMsg
  
  @js.native
  sealed trait FBSDeployHotFixPackage extends EMsg
  
  @js.native
  sealed trait FBSDeployHotFixResponse extends EMsg
  
  @js.native
  sealed trait FBSDeployPackage extends EMsg
  
  @js.native
  sealed trait FBSDeployResponse extends EMsg
  
  @js.native
  sealed trait FBSDownloadHotFix extends EMsg
  
  @js.native
  sealed trait FBSDownloadHotFixResponse extends EMsg
  
  @js.native
  sealed trait FBSForceBounce extends EMsg
  
  @js.native
  sealed trait FBSForceRefresh extends EMsg
  
  @js.native
  sealed trait FBSInfoFromBootstrapper extends EMsg
  
  @js.native
  sealed trait FBSMinidumpServer extends EMsg
  
  @js.native
  sealed trait FBSQueryGMForRequest extends EMsg
  
  @js.native
  sealed trait FBSQueryGMResponse extends EMsg
  
  @js.native
  sealed trait FBSRebootBox extends EMsg
  
  @js.native
  sealed trait FBSRebootBoxResponse extends EMsg
  
  @js.native
  sealed trait FBSReqVersion extends EMsg
  
  @js.native
  sealed trait FBSRestartBootstrapper extends EMsg
  
  @js.native
  sealed trait FBSRunCMDScript extends EMsg
  
  @js.native
  sealed trait FBSSetBigBrotherMode extends EMsg
  
  @js.native
  sealed trait FBSSetShellCount extends EMsg
  
   // obsolete
  @js.native
  sealed trait FBSSetShellCount_obsolete extends EMsg
  
  @js.native
  sealed trait FBSSetState extends EMsg
  
  @js.native
  sealed trait FBSTerminateShell extends EMsg
  
  @js.native
  sealed trait FBSTerminateZombies extends EMsg
  
  @js.native
  sealed trait FBSUpdateBootstrapper extends EMsg
  
  @js.native
  sealed trait FBSUpdateTargetConfigFile extends EMsg
  
  @js.native
  sealed trait FBSVersionInfo extends EMsg
  
  @js.native
  sealed trait FSAddOrRemoveFollower extends EMsg
  
  @js.native
  sealed trait FSAddOrRemoveFollowerResponse extends EMsg
  
  @js.native
  sealed trait FSBase extends EMsg
  
  @js.native
  sealed trait FSCommentNotification extends EMsg
  
  @js.native
  sealed trait FSCommentNotificationViewed extends EMsg
  
  @js.native
  sealed trait FSComputeFrenematrix extends EMsg
  
  @js.native
  sealed trait FSComputeFrenematrixResponse extends EMsg
  
  @js.native
  sealed trait FSGetPendingNotificationCount extends EMsg
  
  @js.native
  sealed trait FSGetPendingNotificationCountResponse extends EMsg
  
  @js.native
  sealed trait FSPlayStatusNotification extends EMsg
  
  @js.native
  sealed trait FSPublishPersonaStatus extends EMsg
  
  @js.native
  sealed trait FSRequestFriendData extends EMsg
  
  @js.native
  sealed trait FSRichPresenceRequest extends EMsg
  
  @js.native
  sealed trait FSRichPresenceResponse extends EMsg
  
  @js.native
  sealed trait FSUpdateFollowingList extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSBrowseClans extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSBrowseClansResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSClanDeleted extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSGetBrowseCounts extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSGetBrowseCountsResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSGetGSPlayStats extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSGetGSPlayStatsForServer extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSGetGSPlayStatsForServerResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSGetGSPlayStatsResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSReportIPUpdates extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSSearch extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSSearchClansByLocation extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSSearchClansByLocationResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSSearchPlayersByLocation extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSSearchPlayersByLocationResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSSearchResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSSearchStatus extends EMsg
  
   // obsolete
  @js.native
  sealed trait FTSSearchStatusResponse extends EMsg
  
  @js.native
  sealed trait FailServer extends EMsg
  
  @js.native
  sealed trait FileXferData extends EMsg
  
  @js.native
  sealed trait FileXferDataAck extends EMsg
  
  @js.native
  sealed trait FileXferEnd extends EMsg
  
  @js.native
  sealed trait FileXferRequest extends EMsg
  
  @js.native
  sealed trait FileXferResponse extends EMsg
  
  @js.native
  sealed trait GCAchievementAwarded extends EMsg
  
   // obsolete
  @js.native
  sealed trait GCCmdBounce extends EMsg
  
  @js.native
  sealed trait GCCmdDeploy extends EMsg
  
  @js.native
  sealed trait GCCmdDeployResponse extends EMsg
  
  @js.native
  sealed trait GCCmdDown extends EMsg
  
   // obsolete
  @js.native
  sealed trait GCCmdForceBounce extends EMsg
  
  @js.native
  sealed trait GCCmdRevive extends EMsg
  
  @js.native
  sealed trait GCCmdStatus extends EMsg
  
  @js.native
  sealed trait GCCmdSwitch extends EMsg
  
   // obsolete
  @js.native
  sealed trait GCGetAccountDetails extends EMsg
  
   // obsolete
  @js.native
  sealed trait GCGetAccountDetails_DEPRECATED extends EMsg
  
  @js.native
  sealed trait GCGetEmailTemplate extends EMsg
  
  @js.native
  sealed trait GCGetEmailTemplateResponse extends EMsg
  
  @js.native
  sealed trait GCHAccountLockStatusChange extends EMsg
  
  @js.native
  sealed trait GCHAccountPhoneNumberChange extends EMsg
  
  @js.native
  sealed trait GCHAccountTradeBanStatusChange extends EMsg
  
  @js.native
  sealed trait GCHAccountTwoFactorChange extends EMsg
  
  @js.native
  sealed trait GCHAccountVacStatusChange extends EMsg
  
  @js.native
  sealed trait GCHKillGC extends EMsg
  
  @js.native
  sealed trait GCHKillGCResponse extends EMsg
  
  @js.native
  sealed trait GCHRelay extends EMsg
  
   // obsolete "renamed to GCHRelayToClient"
  @js.native
  sealed trait GCHRelayClientToIS extends EMsg
  
  @js.native
  sealed trait GCHRelayToClient extends EMsg
  
  @js.native
  sealed trait GCHRequestStatus extends EMsg
  
  @js.native
  sealed trait GCHRequestStatusResponse extends EMsg
  
  @js.native
  sealed trait GCHRequestUpdateSession extends EMsg
  
  @js.native
  sealed trait GCHSpawnGC extends EMsg
  
  @js.native
  sealed trait GCHSpawnGCResponse extends EMsg
  
  @js.native
  sealed trait GCHUpdateSession extends EMsg
  
  @js.native
  sealed trait GCHVacVerificationChange extends EMsg
  
  @js.native
  sealed trait GCInterAppMessage extends EMsg
  
   // obsolete
  @js.native
  sealed trait GCRegisterWebInterfaces extends EMsg
  
   // obsolete
  @js.native
  sealed trait GCRegisterWebInterfaces_Deprecated extends EMsg
  
   // obsolete
  @js.native
  sealed trait GCSendClient extends EMsg
  
  @js.native
  sealed trait GCSystemMessage extends EMsg
  
   // obsolete
  @js.native
  sealed trait GCUpdateGSState extends EMsg
  
   // obsolete
  @js.native
  sealed trait GCUpdatePlayedState extends EMsg
  
   // obsolete
  @js.native
  sealed trait GCValidateSession extends EMsg
  
   // obsolete
  @js.native
  sealed trait GCValidateSessionResponse extends EMsg
  
  @js.native
  sealed trait GMConvertUserWallets extends EMsg
  
  @js.native
  sealed trait GMDRMSync extends EMsg
  
  @js.native
  sealed trait GMGetServiceMethodRouting extends EMsg
  
  @js.native
  sealed trait GMGetServiceMethodRoutingResponse extends EMsg
  
  @js.native
  sealed trait GMLoadActivationCodes extends EMsg
  
  @js.native
  sealed trait GMQueueForFBS extends EMsg
  
  @js.native
  sealed trait GMReportPHPError extends EMsg
  
  @js.native
  sealed trait GMSBase extends EMsg
  
  @js.native
  sealed trait GMSClientServerQueryResponse extends EMsg
  
  @js.native
  sealed trait GMSGameServerReplicate extends EMsg
  
  @js.native
  sealed trait GMSchemaConversionResults extends EMsg
  
   // obsolete
  @js.native
  sealed trait GMSchemaConversionResultsResponse extends EMsg
  
  @js.native
  sealed trait GMWriteConfigToSQL extends EMsg
  
  @js.native
  sealed trait GMWriteShellFailureToSQL extends EMsg
  
  @js.native
  sealed trait GMWriteStatsToSOS extends EMsg
  
  @js.native
  sealed trait GSApprove extends EMsg
  
  @js.native
  sealed trait GSAssociateWithClan extends EMsg
  
  @js.native
  sealed trait GSAssociateWithClanResponse extends EMsg
  
  @js.native
  sealed trait GSComputeNewPlayerCompatibility extends EMsg
  
  @js.native
  sealed trait GSComputeNewPlayerCompatibilityResponse extends EMsg
  
  @js.native
  sealed trait GSDeny extends EMsg
  
  @js.native
  sealed trait GSDisconnectNotice extends EMsg
  
  @js.native
  sealed trait GSGetPlayStats extends EMsg
  
  @js.native
  sealed trait GSGetPlayStatsResponse extends EMsg
  
  @js.native
  sealed trait GSGetReputation extends EMsg
  
  @js.native
  sealed trait GSGetReputationResponse extends EMsg
  
  @js.native
  sealed trait GSGetUserAchievementStatus extends EMsg
  
  @js.native
  sealed trait GSGetUserAchievementStatusResponse extends EMsg
  
  @js.native
  sealed trait GSGetUserGroupStatus extends EMsg
  
  @js.native
  sealed trait GSGetUserGroupStatusResponse extends EMsg
  
  @js.native
  sealed trait GSKick extends EMsg
  
  @js.native
  sealed trait GSPerformHardwareSurvey extends EMsg
  
  @js.native
  sealed trait GSPlayerList extends EMsg
  
  @js.native
  sealed trait GSServerType extends EMsg
  
  @js.native
  sealed trait GSStatus extends EMsg
  
  @js.native
  sealed trait GSStatus2 extends EMsg
  
  @js.native
  sealed trait GSStatusReply extends EMsg
  
  @js.native
  sealed trait GSStatusUpdate_Unused extends EMsg
  
  @js.native
  sealed trait GSUserPlaying extends EMsg
  
  @js.native
  sealed trait GameServerOutOfDate extends EMsg
  
  @js.native
  sealed trait GenericReply extends EMsg
  
  @js.native
  sealed trait GetUserIPCountry extends EMsg
  
  @js.native
  sealed trait GetUserIPCountryResponse extends EMsg
  
  @js.native
  sealed trait GracefulExitShell extends EMsg
  
  @js.native
  sealed trait Heartbeat extends EMsg
  
  @js.native
  sealed trait HubConnect extends EMsg
  
   // obsolete "renamed to GCHRelay"
  @js.native
  sealed trait ISRelayToGCH extends EMsg
  
  @js.native
  sealed trait Invalid extends EMsg
  
  @js.native
  sealed trait InvalidateDBOCacheItems extends EMsg
  
  @js.native
  sealed trait JobHeartbeat extends EMsg
  
  @js.native
  sealed trait JobHeartbeatTest extends EMsg
  
  @js.native
  sealed trait JobHeartbeatTestResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait KGSAllocateKeyRange extends EMsg
  
   // obsolete
  @js.native
  sealed trait KGSAllocateKeyRangeResponse extends EMsg
  
  @js.native
  sealed trait KGSBase extends EMsg
  
   // obsolete
  @js.native
  sealed trait KGSGenerateGameStopWCKeys extends EMsg
  
   // obsolete
  @js.native
  sealed trait KGSGenerateGameStopWCKeysResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait KGSGenerateKeys extends EMsg
  
   // obsolete
  @js.native
  sealed trait KGSGenerateKeysResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait KGSRemapKeys extends EMsg
  
   // obsolete
  @js.native
  sealed trait KGSRemapKeysResponse extends EMsg
  
  @js.native
  sealed trait KeepAlive extends EMsg
  
  @js.native
  sealed trait LBSDeleteLB extends EMsg
  
  @js.native
  sealed trait LBSDeleteLBEntry extends EMsg
  
  @js.native
  sealed trait LBSDeleteLBResponse extends EMsg
  
  @js.native
  sealed trait LBSFindOrCreateLB extends EMsg
  
  @js.native
  sealed trait LBSFindOrCreateLBResponse extends EMsg
  
  @js.native
  sealed trait LBSGetLBEntries extends EMsg
  
  @js.native
  sealed trait LBSGetLBEntriesResponse extends EMsg
  
  @js.native
  sealed trait LBSGetLBList extends EMsg
  
  @js.native
  sealed trait LBSGetLBListResponse extends EMsg
  
  @js.native
  sealed trait LBSResetLB extends EMsg
  
  @js.native
  sealed trait LBSResetLBResponse extends EMsg
  
  @js.native
  sealed trait LBSSetLBDetails extends EMsg
  
  @js.native
  sealed trait LBSSetScore extends EMsg
  
  @js.native
  sealed trait LBSSetScoreResponse extends EMsg
  
  @js.native
  sealed trait LicenseProcessingComplete extends EMsg
  
  @js.native
  sealed trait LoadDBOCacheItem extends EMsg
  
  @js.native
  sealed trait LoadDBOCacheItemResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait LogSearchCancel extends EMsg
  
   // obsolete
  @js.native
  sealed trait LogSearchRequest extends EMsg
  
   // obsolete
  @js.native
  sealed trait LogSearchResponse extends EMsg
  
  @js.native
  sealed trait LogsinkBase extends EMsg
  
  @js.native
  sealed trait LogsinkWriteReport extends EMsg
  
  @js.native
  sealed trait MDSContentServerConfig extends EMsg
  
  @js.native
  sealed trait MDSContentServerConfigRequest extends EMsg
  
   // obsolete
  @js.native
  sealed trait MDSContentServerStatsBroadcast extends EMsg
  
   // obsolete
  @js.native
  sealed trait MDSDownloadDepotChunksAck extends EMsg
  
  @js.native
  sealed trait MDSGetDepotChunk extends EMsg
  
  @js.native
  sealed trait MDSGetDepotChunkChunk extends EMsg
  
  @js.native
  sealed trait MDSGetDepotChunkResponse extends EMsg
  
  @js.native
  sealed trait MDSGetDepotManifest extends EMsg
  
  @js.native
  sealed trait MDSGetDepotManifestChunk extends EMsg
  
  @js.native
  sealed trait MDSGetDepotManifestResponse extends EMsg
  
  @js.native
  sealed trait MDSGetServerListForUser extends EMsg
  
  @js.native
  sealed trait MDSGetServerListForUserResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait MDSGetVersionsForDepot extends EMsg
  
   // obsolete
  @js.native
  sealed trait MDSGetVersionsForDepotResponse extends EMsg
  
  @js.native
  sealed trait MDSMigrateChunk extends EMsg
  
  @js.native
  sealed trait MDSMigrateChunkResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait MDSSetPublicVersionForDepot extends EMsg
  
   // obsolete
  @js.native
  sealed trait MDSSetPublicVersionForDepotResponse extends EMsg
  
  @js.native
  sealed trait MDSToAMGetDepotDecryptionKeyResponse extends EMsg
  
  @js.native
  sealed trait MDSToCSFlushChunk extends EMsg
  
   // obsolete
  @js.native
  sealed trait MDSUpdateContentServerConfig extends EMsg
  
  @js.native
  sealed trait MMSBase extends EMsg
  
  @js.native
  sealed trait MPASBase extends EMsg
  
  @js.native
  sealed trait MPASVacBanReset extends EMsg
  
  @js.native
  sealed trait MarketingMessageUpdate extends EMsg
  
  @js.native
  sealed trait Multi extends EMsg
  
  @js.native
  sealed trait NonStdMsgBase extends EMsg
  
  @js.native
  sealed trait NonStdMsgChase extends EMsg
  
  @js.native
  sealed trait NonStdMsgDFSTransfer extends EMsg
  
  @js.native
  sealed trait NonStdMsgHTTPClient extends EMsg
  
  @js.native
  sealed trait NonStdMsgHTTPServer extends EMsg
  
  @js.native
  sealed trait NonStdMsgLogsink extends EMsg
  
  @js.native
  sealed trait NonStdMsgMemcached extends EMsg
  
  @js.native
  sealed trait NonStdMsgPHPSimulator extends EMsg
  
  @js.native
  sealed trait NonStdMsgRTMPServer extends EMsg
  
  @js.native
  sealed trait NonStdMsgSteam2Emulator extends EMsg
  
   // obsolete
  @js.native
  sealed trait NonStdMsgSyslog extends EMsg
  
  @js.native
  sealed trait NonStdMsgTests extends EMsg
  
  @js.native
  sealed trait NonStdMsgUMQpipeAAPL extends EMsg
  
  @js.native
  sealed trait NonStdMsgWGResponse extends EMsg
  
  @js.native
  sealed trait NotificationOfSuspiciousActivity extends EMsg
  
  @js.native
  sealed trait NotifyWatchdog extends EMsg
  
  @js.native
  sealed trait OGSBeginSession extends EMsg
  
  @js.native
  sealed trait OGSBeginSessionResponse extends EMsg
  
  @js.native
  sealed trait OGSEndSession extends EMsg
  
  @js.native
  sealed trait OGSEndSessionResponse extends EMsg
  
  @js.native
  sealed trait OGSWriteAppSessionRow extends EMsg
  
  @js.native
  sealed trait P2PIntroducerMessage extends EMsg
  
  @js.native
  sealed trait PICSBase extends EMsg
  
  @js.native
  sealed trait PSAddPackageToShoppingCart extends EMsg
  
  @js.native
  sealed trait PSAddPackageToShoppingCartResponse extends EMsg
  
  @js.native
  sealed trait PSAddWalletCreditToShoppingCart extends EMsg
  
  @js.native
  sealed trait PSAddWalletCreditToShoppingCartResponse extends EMsg
  
  @js.native
  sealed trait PSCreateShoppingCart extends EMsg
  
  @js.native
  sealed trait PSCreateShoppingCartResponse extends EMsg
  
  @js.native
  sealed trait PSGetShoppingCartContents extends EMsg
  
  @js.native
  sealed trait PSGetShoppingCartContentsResponse extends EMsg
  
  @js.native
  sealed trait PSIsValidShoppingCart extends EMsg
  
  @js.native
  sealed trait PSIsValidShoppingCartResponse extends EMsg
  
  @js.native
  sealed trait PSRemoveLineItemFromShoppingCart extends EMsg
  
  @js.native
  sealed trait PSRemoveLineItemFromShoppingCartResponse extends EMsg
  
  @js.native
  sealed trait PhysicalBoxInventory extends EMsg
  
  @js.native
  sealed trait Ping extends EMsg
  
  @js.native
  sealed trait PingResponse extends EMsg
  
  @js.native
  sealed trait PrepareToExit extends EMsg
  
  @js.native
  sealed trait ProtobufWrapped extends EMsg
  
  @js.native
  sealed trait ProvideWindowsEventLogEntries extends EMsg
  
  @js.native
  sealed trait QuestServerBase extends EMsg
  
  @js.native
  sealed trait QueuedEmailsComplete extends EMsg
  
  @js.native
  sealed trait RMDeleteMemcachedKeys extends EMsg
  
  @js.native
  sealed trait RMMsgTraceAddTrigger extends EMsg
  
  @js.native
  sealed trait RMMsgTraceEvent extends EMsg
  
  @js.native
  sealed trait RMMsgTraceRemoveTrigger extends EMsg
  
  @js.native
  sealed trait RMRange extends EMsg
  
  @js.native
  sealed trait RMRemoteInvoke extends EMsg
  
  @js.native
  sealed trait RMTestVerisignOTP extends EMsg
  
  @js.native
  sealed trait RMTestVerisignOTPResponse extends EMsg
  
  @js.native
  sealed trait RemoteClientAcceptEULA extends EMsg
  
  @js.native
  sealed trait RemoteClientAppStatus extends EMsg
  
  @js.native
  sealed trait RemoteClientAuth extends EMsg
  
  @js.native
  sealed trait RemoteClientAuthResponse extends EMsg
  
  @js.native
  sealed trait RemoteClientBase extends EMsg
  
  @js.native
  sealed trait RemoteClientGetControllerConfig extends EMsg
  
  @js.native
  sealed trait RemoteClientGetControllerConfigResposne extends EMsg
  
  @js.native
  sealed trait RemoteClientPing extends EMsg
  
  @js.native
  sealed trait RemoteClientPingResponse extends EMsg
  
  @js.native
  sealed trait RemoteClientStartStream extends EMsg
  
  @js.native
  sealed trait RemoteClientStartStreamResponse extends EMsg
  
  @js.native
  sealed trait RemoteClientStreamingEnabled extends EMsg
  
   // obsolete
  @js.native
  sealed trait RemoteSysID extends EMsg
  
  @js.native
  sealed trait ReqChallenge extends EMsg
  
  @js.native
  sealed trait ReqChallengeTest extends EMsg
  
  @js.native
  sealed trait RequestFullStatsBlock extends EMsg
  
   // obsolete
  @js.native
  sealed trait RequestStatHistory extends EMsg
  
  @js.native
  sealed trait RequestWindowsEventLogEntries extends EMsg
  
   // obsolete
  @js.native
  sealed trait RouteMessage extends EMsg
  
  @js.native
  sealed trait SCIDRequest extends EMsg
  
  @js.native
  sealed trait SCIDResponse extends EMsg
  
  @js.native
  sealed trait SLCBase extends EMsg
  
  @js.native
  sealed trait SLCOwnerLibraryChanged extends EMsg
  
  @js.native
  sealed trait SLCRequestUserSessionStatus extends EMsg
  
  @js.native
  sealed trait SLCSharedLibraryChanged extends EMsg
  
  @js.native
  sealed trait SLCSharedLicensesLockStatus extends EMsg
  
  @js.native
  sealed trait SLCUserSessionStatus extends EMsg
  
  @js.native
  sealed trait SMExpensiveReport extends EMsg
  
  @js.native
  sealed trait SMFishingReport extends EMsg
  
   // obsolete
  @js.native
  sealed trait SMGetSchemaConversionResults extends EMsg
  
   // obsolete
  @js.native
  sealed trait SMGetSchemaConversionResultsResponse extends EMsg
  
  @js.native
  sealed trait SMHourlyReport extends EMsg
  
  @js.native
  sealed trait SMMonitorSpace extends EMsg
  
  @js.native
  sealed trait SMPartitionRenames extends EMsg
  
  @js.native
  sealed trait SecretsBase extends EMsg
  
  @js.native
  sealed trait SecretsCredentialPairResponse extends EMsg
  
  @js.native
  sealed trait SecretsRequestCredentialPair extends EMsg
  
   // obsolete
  @js.native
  sealed trait SecretsRequestServerIdentity extends EMsg
  
   // obsolete
  @js.native
  sealed trait SecretsServerIdentityResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait SecretsUpdateServerIdentities extends EMsg
  
  @js.native
  sealed trait ServiceMethod extends EMsg
  
  @js.native
  sealed trait ServiceMethodResponse extends EMsg
  
  @js.native
  sealed trait SetTestFlag extends EMsg
  
  @js.native
  sealed trait ShellCheckWindowsUpdates extends EMsg
  
  @js.native
  sealed trait ShellCheckWindowsUpdatesResponse extends EMsg
  
  @js.native
  sealed trait ShellConfigInfoUpdate extends EMsg
  
  @js.native
  sealed trait ShellFailed extends EMsg
  
   // obsolete
  @js.native
  sealed trait ShellFlushUserLicenseCache extends EMsg
  
  @js.native
  sealed trait ShellSearchLogs extends EMsg
  
  @js.native
  sealed trait ShellSearchLogsResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait StatHistory extends EMsg
  
  @js.native
  sealed trait Stats extends EMsg
  
   // obsolete
  @js.native
  sealed trait StatsDeprecated extends EMsg
  
  @js.native
  sealed trait StoreBase extends EMsg
  
   // obsolete
  @js.native
  sealed trait StoreUpdateRecommendationCount extends EMsg
  
  @js.native
  sealed trait Subscribe extends EMsg
  
  @js.native
  sealed trait TestInitDB extends EMsg
  
  @js.native
  sealed trait TestResetServer extends EMsg
  
  @js.native
  sealed trait TestWorkerProcess extends EMsg
  
  @js.native
  sealed trait TestWorkerProcessLoadUnloadModuleRequest extends EMsg
  
  @js.native
  sealed trait TestWorkerProcessLoadUnloadModuleResponse extends EMsg
  
  @js.native
  sealed trait TestWorkerProcessServiceModuleCallRequest extends EMsg
  
  @js.native
  sealed trait TestWorkerProcessServiceModuleCallResponse extends EMsg
  
  @js.native
  sealed trait TimestampRequest extends EMsg
  
  @js.native
  sealed trait TimestampResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMAddTaggedScreenshot extends EMsg
  
  @js.native
  sealed trait UCMBase extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMDeleteOldScreenshot extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMDeleteOldScreenshotResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMDeleteOldVideo extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMDeleteOldVideoResponse extends EMsg
  
  @js.native
  sealed trait UCMDeletePublishedFile extends EMsg
  
  @js.native
  sealed trait UCMDeletePublishedFileResponse extends EMsg
  
  @js.native
  sealed trait UCMFixStatsPublishedFile extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMGetPublishedFilesForUser extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMGetPublishedFilesForUserResponse extends EMsg
  
  @js.native
  sealed trait UCMGetUserSubscribedFiles extends EMsg
  
  @js.native
  sealed trait UCMGetUserSubscribedFilesResponse extends EMsg
  
  @js.native
  sealed trait UCMPublishFile extends EMsg
  
  @js.native
  sealed trait UCMPublishFileResponse extends EMsg
  
  @js.native
  sealed trait UCMPublishedFileChildAdd extends EMsg
  
  @js.native
  sealed trait UCMPublishedFileChildAddResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMPublishedFileChildChangeSortOrder extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMPublishedFileChildChangeSortOrderResponse extends EMsg
  
  @js.native
  sealed trait UCMPublishedFileChildRemove extends EMsg
  
  @js.native
  sealed trait UCMPublishedFileChildRemoveResponse extends EMsg
  
  @js.native
  sealed trait UCMPublishedFileContentUpdated extends EMsg
  
  @js.native
  sealed trait UCMPublishedFileParentChanged extends EMsg
  
  @js.native
  sealed trait UCMPublishedFilePreviewAdd extends EMsg
  
  @js.native
  sealed trait UCMPublishedFilePreviewAddResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMPublishedFilePreviewChangeSortOrder extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMPublishedFilePreviewChangeSortOrderResponse extends EMsg
  
  @js.native
  sealed trait UCMPublishedFilePreviewRemove extends EMsg
  
  @js.native
  sealed trait UCMPublishedFilePreviewRemoveResponse extends EMsg
  
  @js.native
  sealed trait UCMPublishedFileReported extends EMsg
  
  @js.native
  sealed trait UCMPublishedFileSubscribed extends EMsg
  
  @js.native
  sealed trait UCMPublishedFileUnsubscribed extends EMsg
  
  @js.native
  sealed trait UCMPublishedFileUpdated extends EMsg
  
  @js.native
  sealed trait UCMReloadPublishedFile extends EMsg
  
  @js.native
  sealed trait UCMReloadUserFileListCaches extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMRemoveTaggedScreenshot extends EMsg
  
  @js.native
  sealed trait UCMResetCommunityContent extends EMsg
  
  @js.native
  sealed trait UCMResetCommunityContentResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMUpdateOldScreenshotPrivacy extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMUpdateOldScreenshotPrivacyResponse extends EMsg
  
  @js.native
  sealed trait UCMUpdatePublishedFile extends EMsg
  
  @js.native
  sealed trait UCMUpdatePublishedFileBan extends EMsg
  
  @js.native
  sealed trait UCMUpdatePublishedFileBanResponse extends EMsg
  
  @js.native
  sealed trait UCMUpdatePublishedFileIncompatibleStatus extends EMsg
  
  @js.native
  sealed trait UCMUpdatePublishedFileResponse extends EMsg
  
  @js.native
  sealed trait UCMUpdatePublishedFileStat extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMUpdateTaggedScreenshot extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMValidateObjectExists extends EMsg
  
   // obsolete
  @js.native
  sealed trait UCMValidateObjectExistsResponse extends EMsg
  
  @js.native
  sealed trait UDSBase extends EMsg
  
   // obsolete "renamed to UDSHasSession"
  @js.native
  sealed trait UDSFindSession extends EMsg
  
   // obsolete "renamed to UDSHasSessionResponse"
  @js.native
  sealed trait UDSFindSessionResponse extends EMsg
  
  @js.native
  sealed trait UDSHasSession extends EMsg
  
  @js.native
  sealed trait UDSHasSessionResponse extends EMsg
  
  @js.native
  sealed trait UDSRenderUserAuth extends EMsg
  
  @js.native
  sealed trait UDSRenderUserAuthResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait UFSDownloadChunk extends EMsg
  
  @js.native
  sealed trait UFSDownloadChunkRequest extends EMsg
  
  @js.native
  sealed trait UFSDownloadChunkResponse extends EMsg
  
  @js.native
  sealed trait UFSDownloadFinishRequest extends EMsg
  
  @js.native
  sealed trait UFSDownloadFinishResponse extends EMsg
  
   // obsolete
  @js.native
  sealed trait UFSDownloadRequest extends EMsg
  
   // obsolete
  @js.native
  sealed trait UFSDownloadResponse extends EMsg
  
  @js.native
  sealed trait UFSDownloadStartRequest extends EMsg
  
  @js.native
  sealed trait UFSDownloadStartResponse extends EMsg
  
  @js.native
  sealed trait UFSFlushURLCache extends EMsg
  
  @js.native
  sealed trait UFSGetUGCURLs extends EMsg
  
  @js.native
  sealed trait UFSGetUGCURLsResponse extends EMsg
  
  @js.native
  sealed trait UFSHttpUploadFileFinishRequest extends EMsg
  
  @js.native
  sealed trait UFSHttpUploadFileFinishResponse extends EMsg
  
  @js.native
  sealed trait UFSMigrateFile extends EMsg
  
  @js.native
  sealed trait UFSMigrateFileAppID extends EMsg
  
  @js.native
  sealed trait UFSMigrateFileAppIDResponse extends EMsg
  
  @js.native
  sealed trait UFSMigrateFileResponse extends EMsg
  
  @js.native
  sealed trait UFSReloadAccount extends EMsg
  
  @js.native
  sealed trait UFSReloadAccountResponse extends EMsg
  
  @js.native
  sealed trait UFSReloadPartitionInfo extends EMsg
  
  @js.native
  sealed trait UFSSynchronizeFile extends EMsg
  
  @js.native
  sealed trait UFSSynchronizeFileResponse extends EMsg
  
  @js.native
  sealed trait UFSUpdateFileFlags extends EMsg
  
  @js.native
  sealed trait UFSUpdateFileFlagsResponse extends EMsg
  
  @js.native
  sealed trait UFSUpdateRecordBatched extends EMsg
  
  @js.native
  sealed trait UFSUpdateRecordBatchedResponse extends EMsg
  
  @js.native
  sealed trait UFSUploadCommit extends EMsg
  
  @js.native
  sealed trait UFSUploadCommitResponse extends EMsg
  
  @js.native
  sealed trait UGSBase extends EMsg
  
  @js.native
  sealed trait UGSUpdateGlobalStats extends EMsg
  
  @js.native
  sealed trait UMQ2AM_ClientMsgBatch extends EMsg
  
  @js.native
  sealed trait UMQBase extends EMsg
  
   // obsolete
  @js.native
  sealed trait UMQEnqueueMobileAnnouncements extends EMsg
  
   // obsolete
  @js.native
  sealed trait UMQEnqueueMobileSalePromotions extends EMsg
  
  @js.native
  sealed trait UMQIncomingChatMessage extends EMsg
  
  @js.native
  sealed trait UMQLogoffRequest extends EMsg
  
  @js.native
  sealed trait UMQLogoffResponse extends EMsg
  
  @js.native
  sealed trait UMQLogonRequest extends EMsg
  
  @js.native
  sealed trait UMQLogonResponse extends EMsg
  
  @js.native
  sealed trait UMQPoll extends EMsg
  
  @js.native
  sealed trait UMQPollResults extends EMsg
  
  @js.native
  sealed trait UMQSendChatMessage extends EMsg
  
  @js.native
  sealed trait UniverseChanged extends EMsg
  
  @js.native
  sealed trait UniverseData extends EMsg
  
  @js.native
  sealed trait UpdateConfigFile extends EMsg
  
  @js.native
  sealed trait UpdateCreditCardRequest extends EMsg
  
  @js.native
  sealed trait UpdateRecordResponse extends EMsg
  
  @js.native
  sealed trait UpdateUserBanResponse extends EMsg
  
  @js.native
  sealed trait VACResponse extends EMsg
  
  @js.native
  sealed trait VSAddCheat extends EMsg
  
  @js.native
  sealed trait VSChallengeResultText extends EMsg
  
  @js.native
  sealed trait VSGetChallengeResults extends EMsg
  
  @js.native
  sealed trait VSLoadDBFinished extends EMsg
  
  @js.native
  sealed trait VSMarkCheat extends EMsg
  
  @js.native
  sealed trait VSPurgeCodeModDB extends EMsg
  
  @js.native
  sealed trait VSReportLingerer extends EMsg
  
  @js.native
  sealed trait VSRequestManagedChallenge extends EMsg
  
  @js.native
  sealed trait WGRequest extends EMsg
  
  @js.native
  sealed trait WGResponse extends EMsg
  
  @js.native
  sealed trait WebAPIBase extends EMsg
  
  @js.native
  sealed trait WebAPIInvalidateOAuthClientCache extends EMsg
  
  @js.native
  sealed trait WebAPIInvalidateOAuthTokenCache extends EMsg
  
   // obsolete
  @js.native
  sealed trait WebAPIInvalidateTokensForAccount extends EMsg
  
  @js.native
  sealed trait WebAPIJobRequest extends EMsg
  
  @js.native
  sealed trait WebAPIJobResponse extends EMsg
  
  @js.native
  sealed trait WebAPIRegisterGCInterfaces extends EMsg
  
  @js.native
  sealed trait WebAPISetSecrets extends EMsg
  
  @js.native
  sealed trait WebAPIValidateOAuth2Token extends EMsg
  
  @js.native
  sealed trait WebAPIValidateOAuth2TokenResponse extends EMsg
  
  @js.native
  sealed trait WorkerProcess extends EMsg
  
  @js.native
  sealed trait WorkerProcessPingRequest extends EMsg
  
  @js.native
  sealed trait WorkerProcessPingResponse extends EMsg
  
  @js.native
  sealed trait WorkerProcessShutdown extends EMsg
  
   // obsolete
  @js.native
  sealed trait WorkshopAcceptTOSRequest extends EMsg
  
   // obsolete
  @js.native
  sealed trait WorkshopAcceptTOSResponse extends EMsg
  
  @js.native
  sealed trait WorkshopBase extends EMsg
  
  @js.native
  sealed trait ZipRequest extends EMsg
  
  @js.native
  sealed trait ZipResponse extends EMsg
  
  /* 423 */ val AIGetAppGCFlags: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AIGetAppGCFlags with Double = js.native
  /* 424 */ val AIGetAppGCFlagsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AIGetAppGCFlagsResponse with Double = js.native
  /* 427 */ val AIGetAppInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AIGetAppInfo with Double = js.native
  /* 428 */ val AIGetAppInfoResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AIGetAppInfoResponse with Double = js.native
  /* 425 */ val AIGetAppList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AIGetAppList with Double = js.native
  /* 426 */ val AIGetAppListResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AIGetAppListResponse with Double = js.native
  /* 407 */ val AISAppInfoTableChanged: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AISAppInfoTableChanged with Double = js.native
  /* 409 */ val AISCreateMarketingMessage: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AISCreateMarketingMessage with Double = js.native
  /* 410 */ val AISCreateMarketingMessageResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AISCreateMarketingMessageResponse with Double = js.native
  /* 416 */ val AISDeleteMarketingMessage: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AISDeleteMarketingMessage with Double = js.native
  /* 429 */ val AISGetCouponDefinition: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AISGetCouponDefinition with Double = js.native
  /* 430 */ val AISGetCouponDefinitionResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AISGetCouponDefinitionResponse with Double = js.native
  /* 411 */ val AISGetMarketingMessage: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AISGetMarketingMessage with Double = js.native
  /* 412 */ val AISGetMarketingMessageResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AISGetMarketingMessageResponse with Double = js.native
  /* 419 */ val AISGetMarketingTreatments: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AISGetMarketingTreatments with Double = js.native
  /* 420 */ val AISGetMarketingTreatmentsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AISGetMarketingTreatmentsResponse with Double = js.native
  /* 405 */ val AISGetPackageChangeNumber: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AISGetPackageChangeNumber with Double = js.native
  /* 406 */ val AISGetPackageChangeNumberResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AISGetPackageChangeNumberResponse with Double = js.native
  /* 401 */ val AISRefreshContentDescription: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AISRefreshContentDescription with Double = js.native
  /* 402 */ val AISRequestContentDescription: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AISRequestContentDescription with Double = js.native
  /* 415 */ val AISRequestMarketingMessageUpdate: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AISRequestMarketingMessageUpdate with Double = js.native
  /* 421 */ val AISRequestMarketingTreatmentUpdate: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AISRequestMarketingTreatmentUpdate with Double = js.native
  /* 422 */ val AISTestAddPackage: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AISTestAddPackage with Double = js.native
  /* 433 */ val AISTestEnableGC: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AISTestEnableGC with Double = js.native
  /* 403 */ val AISUpdateAppInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AISUpdateAppInfo with Double = js.native
  /* 413 */ val AISUpdateMarketingMessage: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AISUpdateMarketingMessage with Double = js.native
  /* 414 */ val AISUpdateMarketingMessageResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AISUpdateMarketingMessageResponse with Double = js.native
  /* 404 */ val AISUpdatePackageCosts: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AISUpdatePackageCosts with Double = js.native
  /* 408 */ val AISUpdatePackageCostsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AISUpdatePackageCostsResponse with Double = js.native
  /* 404 */ val AISUpdatePackageInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AISUpdatePackageInfo with Double = js.native
  /* 431 */ val AISUpdateSlaveContentDescription: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AISUpdateSlaveContentDescription with Double = js.native
  /* 432 */ val AISUpdateSlaveContentDescriptionResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AISUpdateSlaveContentDescriptionResponse with Double = js.native
  /* 4310 */ val AMAccountPS3Unlink: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMAccountPS3Unlink with Double = js.native
  /* 4311 */ val AMAccountPS3UnlinkResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMAccountPS3UnlinkResponse with Double = js.native
  /* 4346 */ val AMAcctAllowedToPurchase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMAcctAllowedToPurchase with Double = js.native
  /* 4347 */ val AMAcctAllowedToPurchaseResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMAcctAllowedToPurchaseResponse with Double = js.native
  /* 565 */ val AMAcknowledgeClanInvite: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMAcknowledgeClanInvite with Double = js.native
  /* 4141 */ val AMAddClanNews: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMAddClanNews with Double = js.native
  /* 4202 */ val AMAddComment: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMAddComment with Double = js.native
  /* 4203 */ val AMAddCommentResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMAddCommentResponse with Double = js.native
  /* 4061 */ val AMAddFounderToClan: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMAddFounderToClan with Double = js.native
  /* 4224 */ val AMAddFreeLicense: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMAddFreeLicense with Double = js.native
  /* 4285 */ val AMAddFreeLicenseResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMAddFreeLicenseResponse with Double = js.native
  /* 4081 */ val AMAddFriend: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMAddFriend with Double = js.native
  /* 4082 */ val AMAddFriendResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMAddFriendResponse with Double = js.native
  /* 505 */ val AMAddLicense: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMAddLicense with Double = js.native
  /* 510 */ val AMAddMinutesToLicense: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMAddMinutesToLicense with Double = js.native
  /* 4280 */ val AMAddPublisherUser: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMAddPublisherUser with Double = js.native
  /* 4234 */ val AMAddUsersToMarketingTreatment: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMAddUsersToMarketingTreatment with Double = js.native
  /* 558 */ val AMAllowUserContentQuery: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMAllowUserContentQuery with Double = js.native
  /* 559 */ val AMAllowUserContentResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMAllowUserContentResponse with Double = js.native
  /* 4156 */ val AMAllowUserFilesRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMAllowUserFilesRequest with Double = js.native
  /* 4157 */ val AMAllowUserFilesResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMAllowUserFilesResponse with Double = js.native
  /* 592 */ val AMAuthenticateUser: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMAuthenticateUser with Double = js.native
  /* 593 */ val AMAuthenticateUserResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMAuthenticateUserResponse with Double = js.native
  /* 4315 */ val AMAuthenticatedPlayerList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMAuthenticatedPlayerList with Double = js.native
  /* 4145 */ val AMBanFromChat: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMBanFromChat with Double = js.native
  /* 507 */ val AMBeginProcessingLicenses: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMBeginProcessingLicenses with Double = js.native
  /* 4410 */ val AMBitPayPayment: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMBitPayPayment with Double = js.native
  /* 4411 */ val AMBitPayPaymentResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMBitPayPaymentResponse with Double = js.native
  /* 4380 */ val AMBoaCompraPayment: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMBoaCompraPayment with Double = js.native
  /* 4381 */ val AMBoaCompraPaymentResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMBoaCompraPaymentResponse with Double = js.native
  /* 4086 */ val AMCancelEasyCollect: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCancelEasyCollect with Double = js.native
  /* 4087 */ val AMCancelEasyCollectResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCancelEasyCollectResponse with Double = js.native
  /* 511 */ val AMCancelLicense: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCancelLicense with Double = js.native
  /* 522 */ val AMCancelPurchase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCancelPurchase with Double = js.native
  /* 4105 */ val AMChallengeNotification: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMChallengeNotification with Double = js.native
  /* 4104 */ val AMChallengeVerdict: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMChallengeVerdict with Double = js.native
  /* 4085 */ val AMChangeClanOwner: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMChangeClanOwner with Double = js.native
  /* 579 */ val AMChatActionResult: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMChatActionResult with Double = js.native
  /* 533 */ val AMChatCleanup: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMChatCleanup with Double = js.native
  /* 577 */ val AMChatEnter: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMChatEnter with Double = js.native
  /* 572 */ val AMChatInvite: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMChatInvite with Double = js.native
  /* 570 */ val AMChatMulti: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMChatMulti with Double = js.native
  /* 4118 */ val AMCheckClanInviteRateLimiting: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCheckClanInviteRateLimiting with Double = js.native
  /* 4075 */ val AMCheckClanMembership: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCheckClanMembership with Double = js.native
  /* 4161 */ val AMCheckClanMembershipResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCheckClanMembershipResponse with Double = js.native
  /* 4352 */ val AMClaimUnownedUserGift: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClaimUnownedUserGift with Double = js.native
  /* 4353 */ val AMClaimUnownedUserGiftResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClaimUnownedUserGiftResponse with Double = js.native
  /* 534 */ val AMClanCleanup: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClanCleanup with Double = js.native
  /* 538 */ val AMClanCleanupList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClanCleanupList with Double = js.native
  /* 567 */ val AMClanDataUpdated: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClanDataUpdated with Double = js.native
  /* 4011 */ val AMClanPermissions: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClanPermissions with Double = js.native
  /* 4012 */ val AMClanPermissionsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClanPermissionsResponse with Double = js.native
  /* 4090 */ val AMClansInCommon: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClansInCommon with Double = js.native
  /* 4103 */ val AMClansInCommonCount: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClansInCommonCount with Double = js.native
  /* 4097 */ val AMClansInCommonCountResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClansInCommonCountResponse with Double = js.native
  /* 4091 */ val AMClansInCommonResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClansInCommonResponse with Double = js.native
  /* 4264 */ val AMClearDispute: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClearDispute with Double = js.native
  /* 4265 */ val AMClearDisputeResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClearDisputeResponse with Double = js.native
  /* 4306 */ val AMClearPersonaMetadataBlob: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClearPersonaMetadataBlob with Double = js.native
  /* 576 */ val AMClientAcceptFriendInvite: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClientAcceptFriendInvite with Double = js.native
  /* 5566 */ val AMClientAddFriendToGroup: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClientAddFriendToGroup with Double = js.native
  /* 5567 */ val AMClientAddFriendToGroupResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClientAddFriendToGroupResponse with Double = js.native
  /* 598 */ val AMClientChatActionRelay: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClientChatActionRelay with Double = js.native
  /* 571 */ val AMClientChatInviteRelay: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClientChatInviteRelay with Double = js.native
  /* 574 */ val AMClientChatMemberInfoRelay: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClientChatMemberInfoRelay with Double = js.native
  /* 569 */ val AMClientChatMsgRelay: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClientChatMsgRelay with Double = js.native
  /* 5560 */ val AMClientCreateFriendsGroup: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClientCreateFriendsGroup with Double = js.native
  /* 5561 */ val AMClientCreateFriendsGroupResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClientCreateFriendsGroupResponse with Double = js.native
  /* 5562 */ val AMClientDeleteFriendsGroup: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClientDeleteFriendsGroup with Double = js.native
  /* 5563 */ val AMClientDeleteFriendsGroupResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClientDeleteFriendsGroupResponse with Double = js.native
  /* 573 */ val AMClientJoinChatRelay: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClientJoinChatRelay with Double = js.native
  /* 553 */ val AMClientNotPlaying: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClientNotPlaying with Double = js.native
  /* 578 */ val AMClientPublishRemovalFromSource: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClientPublishRemovalFromSource with Double = js.native
  /* 5568 */ val AMClientRemoveFriendFromGroup: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClientRemoveFriendFromGroup with Double = js.native
  /* 5569 */ val AMClientRemoveFriendFromGroupResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClientRemoveFriendFromGroupResponse with Double = js.native
  /* 5564 */ val AMClientRenameFriendsGroup: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClientRenameFriendsGroup with Double = js.native
  /* 5565 */ val AMClientRenameFriendsGroupResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClientRenameFriendsGroupResponse with Double = js.native
  /* 5588 */ val AMClientSetPlayerNickname: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClientSetPlayerNickname with Double = js.native
  /* 5589 */ val AMClientSetPlayerNicknameResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMClientSetPlayerNicknameResponse with Double = js.native
  /* 4383 */ val AMCompleteExternalPurchase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCompleteExternalPurchase with Double = js.native
  /* 4384 */ val AMCompleteExternalPurchaseResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCompleteExternalPurchaseResponse with Double = js.native
  /* 521 */ val AMCompletePurchase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCompletePurchase with Double = js.native
  /* 4093 */ val AMConvertClan: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMConvertClan with Double = js.native
  /* 4251 */ val AMConvertWallet: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMConvertWallet with Double = js.native
  /* 4252 */ val AMConvertWalletResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMConvertWalletResponse with Double = js.native
  /* 4109 */ val AMCreateAccountRecord: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCreateAccountRecord with Double = js.native
  /* 4183 */ val AMCreateAccountRecordInSteam3: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCreateAccountRecordInSteam3 with Double = js.native
  /* 129 */ val AMCreateAccountResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCreateAccountResponse with Double = js.native
  /* 4260 */ val AMCreateChargeback: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCreateChargeback with Double = js.native
  /* 4261 */ val AMCreateChargebackResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCreateChargebackResponse with Double = js.native
  /* 4001 */ val AMCreateChat: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCreateChat with Double = js.native
  /* 4002 */ val AMCreateChatResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCreateChatResponse with Double = js.native
  /* 586 */ val AMCreateClan: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCreateClan with Double = js.native
  /* 4027 */ val AMCreateClanAnnouncement: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCreateClanAnnouncement with Double = js.native
  /* 4028 */ val AMCreateClanAnnouncementResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCreateClanAnnouncementResponse with Double = js.native
  /* 4013 */ val AMCreateClanEvent: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCreateClanEvent with Double = js.native
  /* 4014 */ val AMCreateClanEventResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCreateClanEventResponse with Double = js.native
  /* 587 */ val AMCreateClanResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCreateClanResponse with Double = js.native
  /* 4262 */ val AMCreateDispute: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCreateDispute with Double = js.native
  /* 4263 */ val AMCreateDisputeResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCreateDisputeResponse with Double = js.native
  /* 4258 */ val AMCreateRefund: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCreateRefund with Double = js.native
  /* 4259 */ val AMCreateRefundResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMCreateRefundResponse with Double = js.native
  /* 4396 */ val AMDegicaPayment: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMDegicaPayment with Double = js.native
  /* 4397 */ val AMDegicaPaymentResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMDegicaPaymentResponse with Double = js.native
  /* 4035 */ val AMDeleteClanAnnouncement: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMDeleteClanAnnouncement with Double = js.native
  /* 4036 */ val AMDeleteClanAnnouncementResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMDeleteClanAnnouncementResponse with Double = js.native
  /* 4019 */ val AMDeleteClanEvent: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMDeleteClanEvent with Double = js.native
  /* 4020 */ val AMDeleteClanEventResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMDeleteClanEventResponse with Double = js.native
  /* 4204 */ val AMDeleteComment: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMDeleteComment with Double = js.native
  /* 4205 */ val AMDeleteCommentResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMDeleteCommentResponse with Double = js.native
  /* 4241 */ val AMDeleteStoredCard: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMDeleteStoredCard with Double = js.native
  /* 4246 */ val AMDeleteStoredPaymentInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMDeleteStoredPaymentInfo with Double = js.native
  /* 4330 */ val AMDeleteStoredPaypalAgreement: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMDeleteStoredPaypalAgreement with Double = js.native
  /* 4084 */ val AMDumpClan: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMDumpClan with Double = js.native
  /* 4059 */ val AMDumpUser: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMDumpUser with Double = js.native
  /* 4398 */ val AMEClubPayment: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMEClubPayment with Double = js.native
  /* 4399 */ val AMEClubPaymentResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMEClubPaymentResponse with Double = js.native
  /* 4160 */ val AMEditBanReason: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMEditBanReason with Double = js.native
  /* 4382 */ val AMExpireCaptchaByGID: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMExpireCaptchaByGID with Double = js.native
  /* 509 */ val AMExtendLicense: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMExtendLicense with Double = js.native
  /* 4367 */ val AMFinalizePurchase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMFinalizePurchase with Double = js.native
  /* 4368 */ val AMFinalizePurchaseResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMFinalizePurchaseResponse with Double = js.native
  /* 580 */ val AMFindAccounts: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMFindAccounts with Double = js.native
  /* 581 */ val AMFindAccountsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMFindAccountsResponse with Double = js.native
  /* 4143 */ val AMFindClanUser: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMFindClanUser with Double = js.native
  /* 4144 */ val AMFindClanUserResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMFindClanUserResponse with Double = js.native
  /* 4106 */ val AMFindGSByIP: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMFindGSByIP with Double = js.native
  /* 518 */ val AMFindHungTransactions: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMFindHungTransactions with Double = js.native
  /* 525 */ val AMFixPendingPurchase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMFixPendingPurchase with Double = js.native
  /* 526 */ val AMFixPendingPurchaseResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMFixPendingPurchaseResponse with Double = js.native
  /* 535 */ val AMFixPendingRefund: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMFixPendingRefund with Double = js.native
  /* 4107 */ val AMFoundGSByIP: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMFoundGSByIP with Double = js.native
  /* 4100 */ val AMFriendsInCommon: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMFriendsInCommon with Double = js.native
  /* 4102 */ val AMFriendsInCommonCountResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMFriendsInCommonCountResponse with Double = js.native
  /* 4101 */ val AMFriendsInCommonResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMFriendsInCommonResponse with Double = js.native
  /* 4098 */ val AMFriendsList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMFriendsList with Double = js.native
  /* 4099 */ val AMFriendsListResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMFriendsListResponse with Double = js.native
  /* 6406 */ val AMGMSGameServerRemove: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGMSGameServerRemove with Double = js.native
  /* 6405 */ val AMGMSGameServerUpdate: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGMSGameServerUpdate with Double = js.native
  /* 4213 */ val AMGSSearch: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGSSearch with Double = js.native
  /* 4340 */ val AMGameServerAccountChangePassword: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGameServerAccountChangePassword with Double = js.native
  /* 4341 */ val AMGameServerAccountDeleteAccount: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGameServerAccountDeleteAccount with Double = js.native
  /* 4335 */ val AMGameServerPlayerCompatibilityCheck: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGameServerPlayerCompatibilityCheck with Double = js.native
  /* 4336 */ val AMGameServerPlayerCompatibilityCheckResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGameServerPlayerCompatibilityCheckResponse with Double = js.native
  /* 4332 */ val AMGameServerRemove: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGameServerRemove with Double = js.native
  /* 4331 */ val AMGameServerUpdate: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGameServerUpdate with Double = js.native
  /* 4323 */ val AMGetAccountBanInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetAccountBanInfo with Double = js.native
  /* 4324 */ val AMGetAccountBanInfoResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetAccountBanInfoResponse with Double = js.native
  /* 4338 */ val AMGetAccountCommunityBanInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetAccountCommunityBanInfo with Double = js.native
  /* 4339 */ val AMGetAccountCommunityBanInfoResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetAccountCommunityBanInfoResponse with Double = js.native
  /* 4287 */ val AMGetAccountDetails: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetAccountDetails with Double = js.native
  /* 4112 */ val AMGetAccountDetails2: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetAccountDetails2 with Double = js.native
  /* 4288 */ val AMGetAccountDetailsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetAccountDetailsResponse with Double = js.native
  /* 4113 */ val AMGetAccountDetailsResponse2: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetAccountDetailsResponse2 with Double = js.native
  /* 4006 */ val AMGetAccountEmailAddress: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetAccountEmailAddress with Double = js.native
  /* 4007 */ val AMGetAccountEmailAddressResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetAccountEmailAddressResponse with Double = js.native
  /* 4294 */ val AMGetAccountFlagsForWGSpoofing: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetAccountFlagsForWGSpoofing with Double = js.native
  /* 4295 */ val AMGetAccountFlagsForWGSpoofingResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetAccountFlagsForWGSpoofingResponse with Double = js.native
  /* 594 */ val AMGetAccountFriendsCount: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetAccountFriendsCount with Double = js.native
  /* 595 */ val AMGetAccountFriendsCountResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetAccountFriendsCountResponse with Double = js.native
  /* 4069 */ val AMGetAccountLinks: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetAccountLinks with Double = js.native
  /* 4070 */ val AMGetAccountLinksResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetAccountLinksResponse with Double = js.native
  /* 4313 */ val AMGetAccountPSNInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetAccountPSNInfo with Double = js.native
  /* 4314 */ val AMGetAccountPSNInfoResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetAccountPSNInfoResponse with Double = js.native
  /* 4408 */ val AMGetAccountResetDetailsRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetAccountResetDetailsRequest with Double = js.native
  /* 4409 */ val AMGetAccountResetDetailsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetAccountResetDetailsResponse with Double = js.native
  /* 4158 */ val AMGetAccountStatus: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetAccountStatus with Double = js.native
  /* 4159 */ val AMGetAccountStatusResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetAccountStatusResponse with Double = js.native
  /* 4188 */ val AMGetBillingAddress: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetBillingAddress with Double = js.native
  /* 4189 */ val AMGetBillingAddressResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetBillingAddressResponse with Double = js.native
  /* 4134 */ val AMGetCaptchaDataByGID: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetCaptchaDataByGID with Double = js.native
  /* 4135 */ val AMGetCaptchaDataByGIDResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetCaptchaDataByGIDResponse with Double = js.native
  /* 4129 */ val AMGetCaptchaDataForIP: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetCaptchaDataForIP with Double = js.native
  /* 4130 */ val AMGetCaptchaDataForIPResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetCaptchaDataForIPResponse with Double = js.native
  /* 4239 */ val AMGetCardList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetCardList with Double = js.native
  /* 4240 */ val AMGetCardListResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetCardListResponse with Double = js.native
  /* 4065 */ val AMGetChatBanList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetChatBanList with Double = js.native
  /* 4066 */ val AMGetChatBanListResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetChatBanListResponse with Double = js.native
  /* 4033 */ val AMGetClanAnnouncements: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetClanAnnouncements with Double = js.native
  /* 4031 */ val AMGetClanAnnouncementsCount: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetClanAnnouncementsCount with Double = js.native
  /* 4032 */ val AMGetClanAnnouncementsCountResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetClanAnnouncementsCountResponse with Double = js.native
  /* 4034 */ val AMGetClanAnnouncementsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetClanAnnouncementsResponse with Double = js.native
  /* 588 */ val AMGetClanDetails: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetClanDetails with Double = js.native
  /* 4373 */ val AMGetClanDetailsForForumCreation: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetClanDetailsForForumCreation with Double = js.native
  /* 4374 */ val AMGetClanDetailsForForumCreationResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetClanDetailsForForumCreationResponse with Double = js.native
  /* 589 */ val AMGetClanDetailsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetClanDetailsResponse with Double = js.native
  /* 4017 */ val AMGetClanEvents: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetClanEvents with Double = js.native
  /* 4018 */ val AMGetClanEventsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetClanEventsResponse with Double = js.native
  /* 4039 */ val AMGetClanHistory: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetClanHistory with Double = js.native
  /* 4040 */ val AMGetClanHistoryResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetClanHistoryResponse with Double = js.native
  /* 4076 */ val AMGetClanMembers: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetClanMembers with Double = js.native
  /* 4077 */ val AMGetClanMembersResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetClanMembersResponse with Double = js.native
  /* 4088 */ val AMGetClanMembershipList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetClanMembershipList with Double = js.native
  /* 4089 */ val AMGetClanMembershipListResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetClanMembershipListResponse with Double = js.native
  /* 4298 */ val AMGetClanOfficers: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetClanOfficers with Double = js.native
  /* 4299 */ val AMGetClanOfficersResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetClanOfficersResponse with Double = js.native
  /* 4054 */ val AMGetClanPOTW: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetClanPOTW with Double = js.native
  /* 4055 */ val AMGetClanPOTWResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetClanPOTWResponse with Double = js.native
  /* 4041 */ val AMGetClanPermissionBits: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetClanPermissionBits with Double = js.native
  /* 4042 */ val AMGetClanPermissionBitsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetClanPermissionBitsResponse with Double = js.native
  /* 4023 */ val AMGetClanPermissionSettings: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetClanPermissionSettings with Double = js.native
  /* 4024 */ val AMGetClanPermissionSettingsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetClanPermissionSettingsResponse with Double = js.native
  /* 4050 */ val AMGetClanRank: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetClanRank with Double = js.native
  /* 4051 */ val AMGetClanRankResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetClanRankResponse with Double = js.native
  /* 4200 */ val AMGetComments: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetComments with Double = js.native
  /* 4201 */ val AMGetCommentsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetCommentsResponse with Double = js.native
  /* 4116 */ val AMGetCommunityPrivacyState: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetCommunityPrivacyState with Double = js.native
  /* 4117 */ val AMGetCommunityPrivacyStateResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetCommunityPrivacyStateResponse with Double = js.native
  /* 514 */ val AMGetFinalPrice: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetFinalPrice with Double = js.native
  /* 515 */ val AMGetFinalPriceResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetFinalPriceResponse with Double = js.native
  /* 4124 */ val AMGetFriendRelationship: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetFriendRelationship with Double = js.native
  /* 4125 */ val AMGetFriendRelationshipResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetFriendRelationshipResponse with Double = js.native
  /* 4165 */ val AMGetFriendsLobbies: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetFriendsLobbies with Double = js.native
  /* 4166 */ val AMGetFriendsLobbiesResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetFriendsLobbiesResponse with Double = js.native
  /* 4296 */ val AMGetFriendsWishlistInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetFriendsWishlistInfo with Double = js.native
  /* 4297 */ val AMGetFriendsWishlistInfoResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetFriendsWishlistInfoResponse with Double = js.native
  /* 4271 */ val AMGetGSPlayerList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetGSPlayerList with Double = js.native
  /* 4272 */ val AMGetGSPlayerListResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetGSPlayerListResponse with Double = js.native
  /* 4276 */ val AMGetGameMembers: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetGameMembers with Double = js.native
  /* 4277 */ val AMGetGameMembersResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetGameMembersResponse with Double = js.native
  /* 4094 */ val AMGetGiftTargetListRelay: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetGiftTargetListRelay with Double = js.native
  /* 4120 */ val AMGetIgnored: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetIgnored with Double = js.native
  /* 4121 */ val AMGetIgnoredResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetIgnoredResponse with Double = js.native
  /* 516 */ val AMGetLegacyGameKey: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetLegacyGameKey with Double = js.native
  /* 517 */ val AMGetLegacyGameKeyResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetLegacyGameKeyResponse with Double = js.native
  /* 539 */ val AMGetLicenses: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetLicenses with Double = js.native
  /* 540 */ val AMGetLicensesResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetLicensesResponse with Double = js.native
  /* 4136 */ val AMGetLobbyList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetLobbyList with Double = js.native
  /* 4137 */ val AMGetLobbyListResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetLobbyListResponse with Double = js.native
  /* 4138 */ val AMGetLobbyMetadata: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetLobbyMetadata with Double = js.native
  /* 4139 */ val AMGetLobbyMetadataResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetLobbyMetadataResponse with Double = js.native
  /* 4301 */ val AMGetNameHistory: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetNameHistory with Double = js.native
  /* 4302 */ val AMGetNameHistoryResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetNameHistoryResponse with Double = js.native
  /* 4333 */ val AMGetPaypalAgreements: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetPaypalAgreements with Double = js.native
  /* 4334 */ val AMGetPaypalAgreementsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetPaypalAgreementsResponse with Double = js.native
  /* 4375 */ val AMGetPendingNotificationCount: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetPendingNotificationCount with Double = js.native
  /* 4376 */ val AMGetPendingNotificationCountResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetPendingNotificationCountResponse with Double = js.native
  /* 4365 */ val AMGetPlayerBanDetails: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetPlayerBanDetails with Double = js.native
  /* 4366 */ val AMGetPlayerBanDetailsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetPlayerBanDetailsResponse with Double = js.native
  /* 4289 */ val AMGetPlayerLinkDetails: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetPlayerLinkDetails with Double = js.native
  /* 4290 */ val AMGetPlayerLinkDetailsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetPlayerLinkDetailsResponse with Double = js.native
  /* 4184 */ val AMGetPreviousCBAccount: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetPreviousCBAccount with Double = js.native
  /* 4185 */ val AMGetPreviousCBAccountResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetPreviousCBAccountResponse with Double = js.native
  /* 4206 */ val AMGetPurchaseStatus: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetPurchaseStatus with Double = js.native
  /* 4037 */ val AMGetSingleClanAnnouncement: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetSingleClanAnnouncement with Double = js.native
  /* 4038 */ val AMGetSingleClanAnnouncementResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetSingleClanAnnouncementResponse with Double = js.native
  /* 4048 */ val AMGetSingleClanEvent: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetSingleClanEvent with Double = js.native
  /* 4049 */ val AMGetSingleClanEventResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetSingleClanEventResponse with Double = js.native
  /* 4278 */ val AMGetSteamIDForMicroTxn: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetSteamIDForMicroTxn with Double = js.native
  /* 4279 */ val AMGetSteamIDForMicroTxnResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetSteamIDForMicroTxnResponse with Double = js.native
  /* 4247 */ val AMGetStoredPaymentSummary: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetStoredPaymentSummary with Double = js.native
  /* 4248 */ val AMGetStoredPaymentSummaryResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetStoredPaymentSummaryResponse with Double = js.native
  /* 4119 */ val AMGetUserAchievementStatus: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserAchievementStatus with Double = js.native
  /* 4175 */ val AMGetUserClansNews: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserClansNews with Double = js.native
  /* 4174 */ val AMGetUserClansNewsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserClansNewsResponse with Double = js.native
  /* 4269 */ val AMGetUserCurrentGameInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserCurrentGameInfo with Double = js.native
  /* 4270 */ val AMGetUserCurrentGameInfoResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserCurrentGameInfoResponse with Double = js.native
  /* 4172 */ val AMGetUserFriendNewsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserFriendNewsResponse with Double = js.native
  /* 4225 */ val AMGetUserFriendsMinutesPlayed: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserFriendsMinutesPlayed with Double = js.native
  /* 4226 */ val AMGetUserFriendsMinutesPlayedResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserFriendsMinutesPlayedResponse with Double = js.native
  /* 4073 */ val AMGetUserGameStats: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserGameStats with Double = js.native
  /* 4074 */ val AMGetUserGameStatsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserGameStatsResponse with Double = js.native
  /* 4237 */ val AMGetUserGameplayInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserGameplayInfo with Double = js.native
  /* 4238 */ val AMGetUserGameplayInfoResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserGameplayInfoResponse with Double = js.native
  /* 4316 */ val AMGetUserGifts: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserGifts with Double = js.native
  /* 4317 */ val AMGetUserGiftsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserGiftsResponse with Double = js.native
  /* 921 */ val AMGetUserGroupStatus: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserGroupStatus with Double = js.native
  /* 922 */ val AMGetUserGroupStatusResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserGroupStatusResponse with Double = js.native
  /* 4154 */ val AMGetUserHistory: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserHistory with Double = js.native
  /* 4146 */ val AMGetUserHistoryResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserHistoryResponse with Double = js.native
  /* 4190 */ val AMGetUserLicenseHistory: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserLicenseHistory with Double = js.native
  /* 4191 */ val AMGetUserLicenseHistoryResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserLicenseHistoryResponse with Double = js.native
  /* 4282 */ val AMGetUserLicenseList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserLicenseList with Double = js.native
  /* 4283 */ val AMGetUserLicenseListResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserLicenseListResponse with Double = js.native
  /* 4227 */ val AMGetUserMinutesPlayed: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserMinutesPlayed with Double = js.native
  /* 4228 */ val AMGetUserMinutesPlayedResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserMinutesPlayedResponse with Double = js.native
  /* 4150 */ val AMGetUserNews: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserNews with Double = js.native
  /* 4151 */ val AMGetUserNewsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserNewsResponse with Double = js.native
  /* 4147 */ val AMGetUserNewsSubscriptions: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserNewsSubscriptions with Double = js.native
  /* 4148 */ val AMGetUserNewsSubscriptionsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserNewsSubscriptionsResponse with Double = js.native
  /* 4211 */ val AMGetUserStats: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserStats with Double = js.native
  /* 4292 */ val AMGetUserVacBanList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserVacBanList with Double = js.native
  /* 4293 */ val AMGetUserVacBanListResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetUserVacBanListResponse with Double = js.native
  /* 4249 */ val AMGetWalletConversionRate: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetWalletConversionRate with Double = js.native
  /* 4250 */ val AMGetWalletConversionRateResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetWalletConversionRateResponse with Double = js.native
  /* 4244 */ val AMGetWalletDetails: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetWalletDetails with Double = js.native
  /* 4245 */ val AMGetWalletDetailsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGetWalletDetailsResponse with Double = js.native
  /* 4108 */ val AMGiftRevoked: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGiftRevoked with Double = js.native
  /* 4356 */ val AMGrantCoupon: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGrantCoupon with Double = js.native
  /* 4357 */ val AMGrantCouponResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGrantCouponResponse with Double = js.native
  /* 566 */ val AMGrantGuestPasses: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGrantGuestPasses with Double = js.native
  /* 4361 */ val AMGrantGuestPasses2: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGrantGuestPasses2 with Double = js.native
  /* 4362 */ val AMGrantGuestPasses2Response: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMGrantGuestPasses2Response with Double = js.native
  /* 4328 */ val AMHandlePendingTransaction: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMHandlePendingTransaction with Double = js.native
  /* 4360 */ val AMHandlePendingTransactionResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMHandlePendingTransactionResponse with Double = js.native
  /* 512 */ val AMInitPurchase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMInitPurchase with Double = js.native
  /* 560 */ val AMInitPurchaseResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMInitPurchaseResponse with Double = js.native
  /* 564 */ val AMInviteUserToClan: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMInviteUserToClan with Double = js.native
  /* 4308 */ val AMIsAccountInCaptchaGracePeriod: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMIsAccountInCaptchaGracePeriod with Double = js.native
  /* 4309 */ val AMIsAccountInCaptchaGracePeriodResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMIsAccountInCaptchaGracePeriodResponse with Double = js.native
  /* 4358 */ val AMIsPackageRestrictedInUserCountry: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMIsPackageRestrictedInUserCountry with Double = js.native
  /* 4359 */ val AMIsPackageRestrictedInUserCountryResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMIsPackageRestrictedInUserCountryResponse with Double = js.native
  /* 527 */ val AMIsUserBanned: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMIsUserBanned with Double = js.native
  /* 4092 */ val AMIsValidAccountID: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMIsValidAccountID with Double = js.native
  /* 4078 */ val AMJoinPublicClan: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMJoinPublicClan with Double = js.native
  /* 4060 */ val AMKickUserFromClan: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMKickUserFromClan with Double = js.native
  /* 4010 */ val AMLeaveClan: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMLeaveClan with Double = js.native
  /* 529 */ val AMLoadActivationCodes: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMLoadActivationCodes with Double = js.native
  /* 530 */ val AMLoadActivationCodesResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMLoadActivationCodesResponse with Double = js.native
  /* 524 */ val AMLoadOEMTickets: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMLoadOEMTickets with Double = js.native
  /* 562 */ val AMLockProfile: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMLockProfile with Double = js.native
  /* 532 */ val AMLookupKey: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMLookupKey with Double = js.native
  /* 531 */ val AMLookupKeyResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMLookupKeyResponse with Double = js.native
  /* 4391 */ val AMMOLPayment: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMMOLPayment with Double = js.native
  /* 4392 */ val AMMOLPaymentResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMMOLPaymentResponse with Double = js.native
  /* 4257 */ val AMMarketingTreatmentUpdate: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMMarketingTreatmentUpdate with Double = js.native
  /* 4378 */ val AMMoPayPayment: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMMoPayPayment with Double = js.native
  /* 4379 */ val AMMoPayPaymentResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMMoPayPaymentResponse with Double = js.native
  /* 4300 */ val AMNameChange: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMNameChange with Double = js.native
  /* 523 */ val AMNewChallenge: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMNewChallenge with Double = js.native
  /* 4079 */ val AMNotifyChatOfClanChange: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMNotifyChatOfClanChange with Double = js.native
  /* 6508 */ val AMNotifySessionDeviceAuthorized: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMNotifySessionDeviceAuthorized with Double = js.native
  /* 596 */ val AMP2PIntroducerMessage: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMP2PIntroducerMessage with Double = js.native
  /* 4377 */ val AMPasswordHashUpgrade: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMPasswordHashUpgrade with Double = js.native
  /* 4400 */ val AMPayPalPaymentsHubPayment: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMPayPalPaymentsHubPayment with Double = js.native
  /* 4401 */ val AMPayPalPaymentsHubPaymentResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMPayPalPaymentsHubPaymentResponse with Double = js.native
  /* 4387 */ val AMPayelpPayment: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMPayelpPayment with Double = js.native
  /* 4388 */ val AMPayelpPaymentResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMPayelpPaymentResponse with Double = js.native
  /* 4372 */ val AMPersonaChangeResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMPersonaChangeResponse with Double = js.native
  /* 4389 */ val AMPlayerGetClanBasicDetails: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMPlayerGetClanBasicDetails with Double = js.native
  /* 4390 */ val AMPlayerGetClanBasicDetailsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMPlayerGetClanBasicDetailsResponse with Double = js.native
  /* 4322 */ val AMPlayerHostedOnGameServer: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMPlayerHostedOnGameServer with Double = js.native
  /* 4266 */ val AMPlayerNicknameList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMPlayerNicknameList with Double = js.native
  /* 4267 */ val AMPlayerNicknameListResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMPlayerNicknameListResponse with Double = js.native
  /* 557 */ val AMPrimePersonaStateCache: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMPrimePersonaStateCache with Double = js.native
  /* 4162 */ val AMProbeClanMembershipList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMProbeClanMembershipList with Double = js.native
  /* 4163 */ val AMProbeClanMembershipListResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMProbeClanMembershipListResponse with Double = js.native
  /* 575 */ val AMPublishChatMemberInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMPublishChatMemberInfo with Double = js.native
  /* 4004 */ val AMPublishChatMetadata: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMPublishChatMetadata with Double = js.native
  /* 4025 */ val AMPublishChatRoomInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMPublishChatRoomInfo with Double = js.native
  /* 513 */ val AMPurchaseResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMPurchaseResponse with Double = js.native
  /* 4325 */ val AMRecordBanEnforcement: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMRecordBanEnforcement with Double = js.native
  /* 563 */ val AMRefreshGuestPasses: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMRefreshGuestPasses with Double = js.native
  /* 2210 */ val AMRefreshSessions: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMRefreshSessions with Double = js.native
  /* 528 */ val AMRegisterKey: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMRegisterKey with Double = js.native
  /* 4253 */ val AMRelayGetFriendsWhoPlayGame: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMRelayGetFriendsWhoPlayGame with Double = js.native
  /* 4254 */ val AMRelayGetFriendsWhoPlayGameResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMRelayGetFriendsWhoPlayGameResponse with Double = js.native
  /* 555 */ val AMRelayPublishStatus: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMRelayPublishStatus with Double = js.native
  /* 2201 */ val AMRelayToGC: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMRelayToGC with Double = js.native
  /* 568 */ val AMReloadAccount: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMReloadAccount with Double = js.native
  /* 4284 */ val AMReloadGameGroupPolicy: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMReloadGameGroupPolicy with Double = js.native
  /* 4083 */ val AMRemoveFriend: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMRemoveFriend with Double = js.native
  /* 4281 */ val AMRemovePublisherUser: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMRemovePublisherUser with Double = js.native
  /* 4342 */ val AMRenewAgreement: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMRenewAgreement with Double = js.native
  /* 4337 */ val AMRenewLicense: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMRenewLicense with Double = js.native
  /* 582 */ val AMRequestAccountData: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMRequestAccountData with Double = js.native
  /* 583 */ val AMRequestAccountDataResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMRequestAccountDataResponse with Double = js.native
  /* 4058 */ val AMRequestChatMetadata: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMRequestChatMetadata with Double = js.native
  /* 4008 */ val AMRequestClanData: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMRequestClanData with Double = js.native
  /* 4329 */ val AMRequestClanDetails: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMRequestClanDetails with Double = js.native
  /* 4008 */ val AMRequestFriendData: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMRequestFriendData with Double = js.native
  /* 556 */ val AMResetCommunityContent: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMResetCommunityContent with Double = js.native
  /* 4197 */ val AMResetUserVerificationGSByIP: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMResetUserVerificationGSByIP with Double = js.native
  /* 4385 */ val AMResolveNegativeWalletCredits: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMResolveNegativeWalletCredits with Double = js.native
  /* 4386 */ val AMResolveNegativeWalletCreditsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMResolveNegativeWalletCreditsResponse with Double = js.native
  /* 4080 */ val AMResubmitPurchase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMResubmitPurchase with Double = js.native
  /* 536 */ val AMReverseChargeback: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMReverseChargeback with Double = js.native
  /* 537 */ val AMReverseChargebackResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMReverseChargebackResponse with Double = js.native
  /* 4242 */ val AMRevokeLegacyGameKeys: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMRevokeLegacyGameKeys with Double = js.native
  /* 561 */ val AMRevokePurchaseResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMRevokePurchaseResponse with Double = js.native
  /* 4326 */ val AMRollbackGiftTransfer: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMRollbackGiftTransfer with Double = js.native
  /* 4327 */ val AMRollbackGiftTransferResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMRollbackGiftTransferResponse with Double = js.native
  /* 4219 */ val AMRouteFriendMsg: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMRouteFriendMsg with Double = js.native
  /* 4009 */ val AMRouteToClients: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMRouteToClients with Double = js.native
  /* 4412 */ val AMSendAccountInfoUpdate: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSendAccountInfoUpdate with Double = js.native
  /* 4343 */ val AMSendEmail: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSendEmail with Double = js.native
  /* 4152 */ val AMSendQueuedEmails: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSendQueuedEmails with Double = js.native
  /* 508 */ val AMSendSystemIMToUser: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSendSystemIMToUser with Double = js.native
  /* 4126 */ val AMServiceModulesCache: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMServiceModulesCache with Double = js.native
  /* 4127 */ val AMServiceModulesCall: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMServiceModulesCall with Double = js.native
  /* 4128 */ val AMServiceModulesCallResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMServiceModulesCallResponse with Double = js.native
  /* 4045 */ val AMSessionInfoRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSessionInfoRequest with Double = js.native
  /* 4046 */ val AMSessionInfoResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSessionInfoResponse with Double = js.native
  /* 4363 */ val AMSessionQuery: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSessionQuery with Double = js.native
  /* 4364 */ val AMSessionQueryResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSessionQueryResponse with Double = js.native
  /* 4064 */ val AMSetAccountDetails: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetAccountDetails with Double = js.native
  /* 584 */ val AMSetAccountFlags: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetAccountFlags with Double = js.native
  /* 4071 */ val AMSetAccountLinks: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetAccountLinks with Double = js.native
  /* 4072 */ val AMSetAccountLinksResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetAccountLinksResponse with Double = js.native
  /* 519 */ val AMSetAccountTrustedRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetAccountTrustedRequest with Double = js.native
  /* 591 */ val AMSetAvatar: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetAvatar with Double = js.native
  /* 4068 */ val AMSetClanDetails: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetClanDetails with Double = js.native
  /* 4354 */ val AMSetClanName: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetClanName with Double = js.native
  /* 4355 */ val AMSetClanNameResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetClanNameResponse with Double = js.native
  /* 4056 */ val AMSetClanPOTW: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetClanPOTW with Double = js.native
  /* 4057 */ val AMSetClanPOTWResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetClanPOTWResponse with Double = js.native
  /* 4043 */ val AMSetClanPermissionBits: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetClanPermissionBits with Double = js.native
  /* 4044 */ val AMSetClanPermissionBitsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetClanPermissionBitsResponse with Double = js.native
  /* 4021 */ val AMSetClanPermissionSettings: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetClanPermissionSettings with Double = js.native
  /* 4022 */ val AMSetClanPermissionSettingsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetClanPermissionSettingsResponse with Double = js.native
  /* 4052 */ val AMSetClanRank: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetClanRank with Double = js.native
  /* 4053 */ val AMSetClanRankResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetClanRankResponse with Double = js.native
  /* 4114 */ val AMSetCommunityProfileSettings: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetCommunityProfileSettings with Double = js.native
  /* 4115 */ val AMSetCommunityProfileSettingsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetCommunityProfileSettingsResponse with Double = js.native
  /* 4063 */ val AMSetCommunityState: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetCommunityState with Double = js.native
  /* 4268 */ val AMSetDRMTestConfig: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetDRMTestConfig with Double = js.native
  /* 4123 */ val AMSetFriendRelationshipNone: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetFriendRelationshipNone with Double = js.native
  /* 4096 */ val AMSetIgnored: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetIgnored with Double = js.native
  /* 4122 */ val AMSetIgnoredResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetIgnoredResponse with Double = js.native
  /* 4153 */ val AMSetLicenseFlags: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetLicenseFlags with Double = js.native
  /* 590 */ val AMSetPersonaName: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetPersonaName with Double = js.native
  /* 4255 */ val AMSetPreApproval: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetPreApproval with Double = js.native
  /* 4256 */ val AMSetPreApprovalResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetPreApprovalResponse with Double = js.native
  /* 4005 */ val AMSetProfileURL: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetProfileURL with Double = js.native
  /* 4350 */ val AMSetUserGiftUnowned: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetUserGiftUnowned with Double = js.native
  /* 4351 */ val AMSetUserGiftUnownedResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetUserGiftUnownedResponse with Double = js.native
  /* 4149 */ val AMSetUserNewsSubscriptions: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSetUserNewsSubscriptions with Double = js.native
  /* 4404 */ val AMSmart2PayPayment: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSmart2PayPayment with Double = js.native
  /* 4405 */ val AMSmart2PayPaymentResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSmart2PayPaymentResponse with Double = js.native
  /* 4181 */ val AMStoreCancelPurchase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMStoreCancelPurchase with Double = js.native
  /* 4180 */ val AMStoreCompletePurchase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMStoreCompletePurchase with Double = js.native
  /* 4178 */ val AMStoreGetFinalPrice: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMStoreGetFinalPrice with Double = js.native
  /* 4179 */ val AMStoreGetFinalPriceResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMStoreGetFinalPriceResponse with Double = js.native
  /* 4176 */ val AMStoreInitPurchase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMStoreInitPurchase with Double = js.native
  /* 4177 */ val AMStoreInitPurchaseResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMStoreInitPurchaseResponse with Double = js.native
  /* 4182 */ val AMStorePurchaseResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMStorePurchaseResponse with Double = js.native
  /* 4236 */ val AMStoreUserStats: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMStoreUserStats with Double = js.native
  /* 4312 */ val AMStoreUserStatsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMStoreUserStatsResponse with Double = js.native
  /* 4291 */ val AMSubscribeToPersonaFeed: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSubscribeToPersonaFeed with Double = js.native
  /* 4195 */ val AMSupportChangeEmail: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSupportChangeEmail with Double = js.native
  /* 4194 */ val AMSupportChangePassword: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSupportChangePassword with Double = js.native
  /* 4196 */ val AMSupportChangeSecretQA: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSupportChangeSecretQA with Double = js.native
  /* 4199 */ val AMSupportEnableOrDisable: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSupportEnableOrDisable with Double = js.native
  /* 4209 */ val AMSupportIsAccountEnabled: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSupportIsAccountEnabled with Double = js.native
  /* 4210 */ val AMSupportIsAccountEnabledResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSupportIsAccountEnabledResponse with Double = js.native
  /* 4212 */ val AMSupportKickSession: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSupportKickSession with Double = js.native
  /* 4307 */ val AMSupportRemoveAccountSecurity: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSupportRemoveAccountSecurity with Double = js.native
  /* 4348 */ val AMSwapKioskDeposit: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSwapKioskDeposit with Double = js.native
  /* 4349 */ val AMSwapKioskDepositResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMSwapKioskDepositResponse with Double = js.native
  /* 4220 */ val AMTicketAuthRequestOrResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMTicketAuthRequestOrResponse with Double = js.native
  /* 5812 */ val AMToMDSGetDepotDecryptionKey: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMToMDSGetDepotDecryptionKey with Double = js.native
  /* 4133 */ val AMTrackFailedAuthByIP: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMTrackFailedAuthByIP with Double = js.native
  /* 4320 */ val AMTransferLockedGifts: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMTransferLockedGifts with Double = js.native
  /* 4321 */ val AMTransferLockedGiftsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMTransferLockedGiftsResponse with Double = js.native
  /* 4402 */ val AMTwoFactorRecoverAuthenticatorRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMTwoFactorRecoverAuthenticatorRequest with Double = js.native
  /* 4403 */ val AMTwoFactorRecoverAuthenticatorResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMTwoFactorRecoverAuthenticatorResponse with Double = js.native
  /* 4067 */ val AMUnBanFromChat: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMUnBanFromChat with Double = js.native
  /* 4186 */ val AMUpdateBillingAddress: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMUpdateBillingAddress with Double = js.native
  /* 4187 */ val AMUpdateBillingAddressResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMUpdateBillingAddressResponse with Double = js.native
  /* 4003 */ val AMUpdateChatMetadata: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMUpdateChatMetadata with Double = js.native
  /* 4029 */ val AMUpdateClanAnnouncement: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMUpdateClanAnnouncement with Double = js.native
  /* 4030 */ val AMUpdateClanAnnouncementResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMUpdateClanAnnouncementResponse with Double = js.native
  /* 4015 */ val AMUpdateClanEvent: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMUpdateClanEvent with Double = js.native
  /* 4016 */ val AMUpdateClanEventResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMUpdateClanEventResponse with Double = js.native
  /* 4198 */ val AMUpdateGSPlayStats: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMUpdateGSPlayStats with Double = js.native
  /* 4275 */ val AMUpdatePersonaStateCache: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMUpdatePersonaStateCache with Double = js.native
  /* 4305 */ val AMUpdateProviderStatus: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMUpdateProviderStatus with Double = js.native
  /* 504 */ val AMUpdateUserBanRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMUpdateUserBanRequest with Double = js.native
  /* 4110 */ val AMUserClanList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMUserClanList with Double = js.native
  /* 4111 */ val AMUserClanListResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMUserClanListResponse with Double = js.native
  /* 4286 */ val AMVACStatusUpdate: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMVACStatusUpdate with Double = js.native
  /* 4131 */ val AMValidateCaptchaDataForIP: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMValidateCaptchaDataForIP with Double = js.native
  /* 4132 */ val AMValidateCaptchaDataForIPResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMValidateCaptchaDataForIPResponse with Double = js.native
  /* 4231 */ val AMValidateEmailLink: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMValidateEmailLink with Double = js.native
  /* 4232 */ val AMValidateEmailLinkResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMValidateEmailLinkResponse with Double = js.native
  /* 4406 */ val AMValidatePasswordResetCodeAndSendSmsRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMValidatePasswordResetCodeAndSendSmsRequest with Double = js.native
  /* 4407 */ val AMValidatePasswordResetCodeAndSendSmsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMValidatePasswordResetCodeAndSendSmsResponse with Double = js.native
  /* 4047 */ val AMValidateWGToken: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMValidateWGToken with Double = js.native
  /* 4062 */ val AMValidateWGTokenResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMValidateWGTokenResponse with Double = js.native
  /* 552 */ val AMVerfiyUser: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMVerfiyUser with Double = js.native
  /* 4222 */ val AMVerifyDepotManagementRights: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMVerifyDepotManagementRights with Double = js.native
  /* 4223 */ val AMVerifyDepotManagementRightsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMVerifyDepotManagementRightsResponse with Double = js.native
  /* 4095 */ val AMWipeFriendsList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMWipeFriendsList with Double = js.native
  /* 4142 */ val AMWriteNews: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMWriteNews with Double = js.native
  /* 4344 */ val AMXsollaPayment: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMXsollaPayment with Double = js.native
  /* 4345 */ val AMXsollaPaymentResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AMXsollaPaymentResponse with Double = js.native
  /* 1519 */ val ATSCSPerfTestResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ATSCSPerfTestResponse with Double = js.native
  /* 1518 */ val ATSCSPerfTestTask: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ATSCSPerfTestTask with Double = js.native
  /* 1508 */ val ATSCallTest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ATSCallTest with Double = js.native
  /* 1509 */ val ATSCallTestReply: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ATSCallTestReply with Double = js.native
  /* 1506 */ val ATSCycleTCM: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ATSCycleTCM with Double = js.native
  /* 1516 */ val ATSExternalStressActionResult: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ATSExternalStressActionResult with Double = js.native
  /* 1512 */ val ATSExternalStressJobQueued: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ATSExternalStressJobQueued with Double = js.native
  /* 1513 */ val ATSExternalStressJobRunning: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ATSExternalStressJobRunning with Double = js.native
  /* 1511 */ val ATSExternalStressJobStart: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ATSExternalStressJobStart with Double = js.native
  /* 1515 */ val ATSExternalStressJobStopAll: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ATSExternalStressJobStopAll with Double = js.native
  /* 1514 */ val ATSExternalStressJobStopped: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ATSExternalStressJobStopped with Double = js.native
  /* 1507 */ val ATSInitDRMSStressTest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ATSInitDRMSStressTest with Double = js.native
  /* 1503 */ val ATSRunFailServerTest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ATSRunFailServerTest with Double = js.native
  /* 1510 */ val ATSStartExternalStress: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ATSStartExternalStress with Double = js.native
  /* 1501 */ val ATSStartStressTest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ATSStartStressTest with Double = js.native
  /* 1517 */ val ATSStarted: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ATSStarted with Double = js.native
  /* 1502 */ val ATSStopStressTest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ATSStopStressTest with Double = js.native
  /* 1505 */ val ATSUFSPerfTestResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ATSUFSPerfTestResponse with Double = js.native
  /* 1504 */ val ATSUFSPerfTestTask: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ATSUFSPerfTestTask with Double = js.native
  /* 1000 */ val AdminCmd: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AdminCmd with Double = js.native
  /* 1004 */ val AdminCmdResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AdminCmdResponse with Double = js.native
  /* 1020 */ val AdminConsoleTitle: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AdminConsoleTitle with Double = js.native
  /* 1024 */ val AdminGCCommand: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AdminGCCommand with Double = js.native
  /* 1025 */ val AdminGCGetCommandList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AdminGCGetCommandList with Double = js.native
  /* 1026 */ val AdminGCGetCommandListResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AdminGCGetCommandListResponse with Double = js.native
  /* 1023 */ val AdminGCSpew: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AdminGCSpew with Double = js.native
  /* 1006 */ val AdminLogEvent: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AdminLogEvent with Double = js.native
  /* 1005 */ val AdminLogListenRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AdminLogListenRequest with Double = js.native
  /* 1028 */ val AdminMsgSpew: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AdminMsgSpew with Double = js.native
  /* 1017 */ val AdminPwLogon: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AdminPwLogon with Double = js.native
  /* 1018 */ val AdminPwLogonResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AdminPwLogonResponse with Double = js.native
  /* 1019 */ val AdminSpew: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AdminSpew with Double = js.native
  /* 115 */ val Alert: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.Alert with Double = js.native
  /* 550 */ val AllowUserToPlayQuery: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AllowUserToPlayQuery with Double = js.native
  /* 551 */ val AllowUserToPlayResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AllowUserToPlayResponse with Double = js.native
  /* 200 */ val AssignSysID: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.AssignSysID with Double = js.native
  /* 3619 */ val BRPCheckActivationCodes: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPCheckActivationCodes with Double = js.native
  /* 3620 */ val BRPCheckActivationCodesResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPCheckActivationCodesResponse with Double = js.native
  /* 3610 */ val BRPCheckFinanceCloseOutDate: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPCheckFinanceCloseOutDate with Double = js.native
  /* 3626 */ val BRPCheckSettlementReports: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPCheckSettlementReports with Double = js.native
  /* 3607 */ val BRPCommitGC: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPCommitGC with Double = js.native
  /* 3608 */ val BRPCommitGCResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPCommitGCResponse with Double = js.native
  /* 3621 */ val BRPCommitWP: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPCommitWP with Double = js.native
  /* 3622 */ val BRPCommitWPResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPCommitWPResponse with Double = js.native
  /* 3615 */ val BRPConvertToCurrentKeys: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPConvertToCurrentKeys with Double = js.native
  /* 3616 */ val BRPConvertToCurrentKeysResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPConvertToCurrentKeysResponse with Double = js.native
  /* 3609 */ val BRPFindHungTransactions: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPFindHungTransactions with Double = js.native
  /* 3628 */ val BRPPostTaxToAvalara: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPPostTaxToAvalara with Double = js.native
  /* 3629 */ val BRPPostTransactionTax: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPPostTransactionTax with Double = js.native
  /* 3630 */ val BRPPostTransactionTaxResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPPostTransactionTaxResponse with Double = js.native
  /* 3603 */ val BRPProcessGCReports: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPProcessGCReports with Double = js.native
  /* 3631 */ val BRPProcessIMReports: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPProcessIMReports with Double = js.native
  /* 3611 */ val BRPProcessLicenses: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPProcessLicenses with Double = js.native
  /* 3612 */ val BRPProcessLicensesResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPProcessLicensesResponse with Double = js.native
  /* 3604 */ val BRPProcessPPReports: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPProcessPPReports with Double = js.native
  /* 3625 */ val BRPProcessPartnerPayments: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPProcessPartnerPayments with Double = js.native
  /* 3624 */ val BRPProcessPaymentRules: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPProcessPaymentRules with Double = js.native
  /* 3602 */ val BRPProcessUSBankReports: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPProcessUSBankReports with Double = js.native
  /* 3623 */ val BRPProcessWPReports: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPProcessWPReports with Double = js.native
  /* 3617 */ val BRPPruneCardUsageStats: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPPruneCardUsageStats with Double = js.native
  /* 3618 */ val BRPPruneCardUsageStatsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPPruneCardUsageStatsResponse with Double = js.native
  /* 3613 */ val BRPRemoveExpiredPaymentData: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPRemoveExpiredPaymentData with Double = js.native
  /* 3614 */ val BRPRemoveExpiredPaymentDataResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPRemoveExpiredPaymentDataResponse with Double = js.native
  /* 3606 */ val BRPSettleCB: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPSettleCB with Double = js.native
  /* 3605 */ val BRPSettleNOVA: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPSettleNOVA with Double = js.native
  /* 3601 */ val BRPStartShippingJobs: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BRPStartShippingJobs with Double = js.native
  /* 1407 */ val BSBannedRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSBannedRequest with Double = js.native
  /* 1494 */ val BSBoaCompraConfirmProductDelivery: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSBoaCompraConfirmProductDelivery with Double = js.native
  /* 1495 */ val BSBoaCompraConfirmProductDeliveryResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSBoaCompraConfirmProductDeliveryResponse with Double = js.native
  /* 1416 */ val BSChaseRFRRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSChaseRFRRequest with Double = js.native
  /* 1456 */ val BSCheckJobRunning: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSCheckJobRunning with Double = js.native
  /* 1457 */ val BSCheckJobRunningResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSCheckJobRunningResponse with Double = js.native
  /* 1425 */ val BSCommitGCTxn: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSCommitGCTxn with Double = js.native
  /* 1498 */ val BSCommitWPTxn: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSCommitWPTxn with Double = js.native
  /* 1474 */ val BSCompletePurchase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSCompletePurchase with Double = js.native
  /* 1475 */ val BSCompletePurchaseResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSCompletePurchaseResponse with Double = js.native
  /* 1470 */ val BSConvertToCurrentKeys: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSConvertToCurrentKeys with Double = js.native
  /* 1471 */ val BSConvertToCurrentKeysResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSConvertToCurrentKeysResponse with Double = js.native
  /* 1496 */ val BSGenerateBoaCompraMD5: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSGenerateBoaCompraMD5 with Double = js.native
  /* 1497 */ val BSGenerateBoaCompraMD5Response: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSGenerateBoaCompraMD5Response with Double = js.native
  /* 1492 */ val BSGenerateMoPayMD5: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSGenerateMoPayMD5 with Double = js.native
  /* 1493 */ val BSGenerateMoPayMD5Response: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSGenerateMoPayMD5Response with Double = js.native
  /* 1462 */ val BSGetBillingAddress: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSGetBillingAddress with Double = js.native
  /* 1463 */ val BSGetBillingAddressResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSGetBillingAddressResponse with Double = js.native
  /* 1464 */ val BSGetCreditCardInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSGetCreditCardInfo with Double = js.native
  /* 1465 */ val BSGetCreditCardInfoResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSGetCreditCardInfoResponse with Double = js.native
  /* 1415 */ val BSGetEvents: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSGetEvents with Double = js.native
  /* 1410 */ val BSGetPayPalUserInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSGetPayPalUserInfo with Double = js.native
  /* 1411 */ val BSGetPayPalUserInfoResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSGetPayPalUserInfoResponse with Double = js.native
  /* 1454 */ val BSGetProPackOrderStatus: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSGetProPackOrderStatus with Double = js.native
  /* 1455 */ val BSGetProPackOrderStatusResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSGetProPackOrderStatusResponse with Double = js.native
  /* 1421 */ val BSInitGCBankXferTxn: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSInitGCBankXferTxn with Double = js.native
  /* 1422 */ val BSInitGCBankXferTxnResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSInitGCBankXferTxnResponse with Double = js.native
  /* 1408 */ val BSInitPayPalTxn: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSInitPayPalTxn with Double = js.native
  /* 1409 */ val BSInitPayPalTxnResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSInitPayPalTxnResponse with Double = js.native
  /* 1472 */ val BSInitPurchase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSInitPurchase with Double = js.native
  /* 1473 */ val BSInitPurchaseResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSInitPurchaseResponse with Double = js.native
  /* 1490 */ val BSMoPayConfirmProductDelivery: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSMoPayConfirmProductDelivery with Double = js.native
  /* 1491 */ val BSMoPayConfirmProductDeliveryResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSMoPayConfirmProductDeliveryResponse with Double = js.native
  /* 1417 */ val BSPaymentInstrBan: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSPaymentInstrBan with Double = js.native
  /* 1418 */ val BSPaymentInstrBanResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSPaymentInstrBanResponse with Double = js.native
  /* 1419 */ val BSProcessGCReports: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSProcessGCReports with Double = js.native
  /* 1420 */ val BSProcessPPReports: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSProcessPPReports with Double = js.native
  /* 1436 */ val BSProcessUSBankReports: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSProcessUSBankReports with Double = js.native
  /* 1476 */ val BSPruneCardUsageStats: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSPruneCardUsageStats with Double = js.native
  /* 1477 */ val BSPruneCardUsageStatsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSPruneCardUsageStatsResponse with Double = js.native
  /* 1402 */ val BSPurchaseResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSPurchaseResponse with Double = js.native
  /* 1437 */ val BSPurchaseRunFraudChecks: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSPurchaseRunFraudChecks with Double = js.native
  /* 1438 */ val BSPurchaseRunFraudChecksResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSPurchaseRunFraudChecksResponse with Double = js.native
  /* 1401 */ val BSPurchaseStart: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSPurchaseStart with Double = js.native
  /* 1448 */ val BSQiwiWalletInvoice: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSQiwiWalletInvoice with Double = js.native
  /* 1449 */ val BSQiwiWalletInvoiceResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSQiwiWalletInvoiceResponse with Double = js.native
  /* 1440 */ val BSQueryBankInformation: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSQueryBankInformation with Double = js.native
  /* 1441 */ val BSQueryBankInformationResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSQueryBankInformationResponse with Double = js.native
  /* 1428 */ val BSQueryCBOrderStatus: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSQueryCBOrderStatus with Double = js.native
  /* 1429 */ val BSQueryCBOrderStatusResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSQueryCBOrderStatusResponse with Double = js.native
  /* 1484 */ val BSQueryFindCreditCard: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSQueryFindCreditCard with Double = js.native
  /* 1485 */ val BSQueryFindCreditCardResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSQueryFindCreditCardResponse with Double = js.native
  /* 1423 */ val BSQueryGCBankXferTxn: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSQueryGCBankXferTxn with Double = js.native
  /* 1424 */ val BSQueryGCBankXferTxnResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSQueryGCBankXferTxnResponse with Double = js.native
  /* 1432 */ val BSQueryPaymentInstResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSQueryPaymentInstResponse with Double = js.native
  /* 1431 */ val BSQueryPaymentInstUsage: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSQueryPaymentInstUsage with Double = js.native
  /* 1426 */ val BSQueryTransactionStatus: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSQueryTransactionStatus with Double = js.native
  /* 1427 */ val BSQueryTransactionStatusResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSQueryTransactionStatusResponse with Double = js.native
  /* 1433 */ val BSQueryTxnExtendedInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSQueryTxnExtendedInfo with Double = js.native
  /* 1434 */ val BSQueryTxnExtendedInfoResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSQueryTxnExtendedInfoResponse with Double = js.native
  /* 1413 */ val BSRefundTxn: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSRefundTxn with Double = js.native
  /* 1414 */ val BSRefundTxnResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSRefundTxnResponse with Double = js.native
  /* 1468 */ val BSRemoveExpiredPaymentData: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSRemoveExpiredPaymentData with Double = js.native
  /* 1469 */ val BSRemoveExpiredPaymentDataResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSRemoveExpiredPaymentDataResponse with Double = js.native
  /* 1458 */ val BSResetPackagePurchaseRateLimit: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSResetPackagePurchaseRateLimit with Double = js.native
  /* 1459 */ val BSResetPackagePurchaseRateLimitResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSResetPackagePurchaseRateLimitResponse with Double = js.native
  /* 1482 */ val BSReverseRedeemPOSAKey: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSReverseRedeemPOSAKey with Double = js.native
  /* 1483 */ val BSReverseRedeemPOSAKeyResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSReverseRedeemPOSAKeyResponse with Double = js.native
  /* 1430 */ val BSRunRedFlagReport: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSRunRedFlagReport with Double = js.native
  /* 1452 */ val BSSendShippingRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSSendShippingRequest with Double = js.native
  /* 1453 */ val BSSendShippingRequestResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSSendShippingRequestResponse with Double = js.native
  /* 1406 */ val BSSettleComplete: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSSettleComplete with Double = js.native
  /* 1404 */ val BSSettleNOVA: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSSettleNOVA with Double = js.native
  /* 1439 */ val BSStartShippingJobs: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSStartShippingJobs with Double = js.native
  /* 1486 */ val BSStatusInquiryPOSAKey: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSStatusInquiryPOSAKey with Double = js.native
  /* 1487 */ val BSStatusInquiryPOSAKeyResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSStatusInquiryPOSAKeyResponse with Double = js.native
  /* 1478 */ val BSStoreBankInformation: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSStoreBankInformation with Double = js.native
  /* 1479 */ val BSStoreBankInformationResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSStoreBankInformationResponse with Double = js.native
  /* 1435 */ val BSUpdateConversionRates: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSUpdateConversionRates with Double = js.native
  /* 1450 */ val BSUpdateInventoryFromProPack: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSUpdateInventoryFromProPack with Double = js.native
  /* 1451 */ val BSUpdateInventoryFromProPackResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSUpdateInventoryFromProPackResponse with Double = js.native
  /* 1460 */ val BSUpdatePaymentData: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSUpdatePaymentData with Double = js.native
  /* 1461 */ val BSUpdatePaymentDataResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSUpdatePaymentDataResponse with Double = js.native
  /* 1488 */ val BSValidateMoPaySignature: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSValidateMoPaySignature with Double = js.native
  /* 1489 */ val BSValidateMoPaySignatureResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSValidateMoPaySignatureResponse with Double = js.native
  /* 1445 */ val BSValidateXsollaSignature: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSValidateXsollaSignature with Double = js.native
  /* 1446 */ val BSValidateXsollaSignatureResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSValidateXsollaSignatureResponse with Double = js.native
  /* 1480 */ val BSVerifyPOSAKey: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSVerifyPOSAKey with Double = js.native
  /* 1481 */ val BSVerifyPOSAKeyResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BSVerifyPOSAKeyResponse with Double = js.native
  /* 8401 */ val BackpackAddToCurrency: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BackpackAddToCurrency with Double = js.native
  /* 8402 */ val BackpackAddToCurrencyResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BackpackAddToCurrencyResponse with Double = js.native
  /* 8400 */ val BackpackBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BackpackBase with Double = js.native
  /* 7805 */ val BadLoginIPList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BadLoginIPList with Double = js.native
  /* 400 */ val BaseAIS: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseAIS with Double = js.native
  /* 500 */ val BaseAM: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseAM with Double = js.native
  /* 4000 */ val BaseAMRange2: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseAMRange2 with Double = js.native
  /* 1500 */ val BaseATS: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseATS with Double = js.native
  /* 1000 */ val BaseAdmin: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseAdmin with Double = js.native
  /* 3600 */ val BaseBRP: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseBRP with Double = js.native
  /* 1400 */ val BaseBS: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseBS with Double = js.native
  /* 3150 */ val BaseCCSRange: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseCCSRange with Double = js.native
  /* 1700 */ val BaseCM: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseCM with Double = js.native
  /* 650 */ val BaseCS: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseCS with Double = js.native
  /* 1300 */ val BaseChannelAuth: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseChannelAuth with Double = js.native
  /* 700 */ val BaseClient: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseClient with Double = js.native
  /* 5400 */ val BaseClient2: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseClient2 with Double = js.native
  /* 9800 */ val BaseClient3: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseClient3 with Double = js.native
  /* 5600 */ val BaseDFS: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseDFS with Double = js.native
  /* 1600 */ val BaseDP: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseDP with Double = js.native
  /* 625 */ val BaseDRMS: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseDRMS with Double = js.native
  /* 1800 */ val BaseDSS: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseDSS with Double = js.native
  /* 1900 */ val BaseEPM: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseEPM with Double = js.native
  /* 1100 */ val BaseFBS: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseFBS with Double = js.native
  /* 3100 */ val BaseFTSRange: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseFTSRange with Double = js.native
  /* 1200 */ val BaseFileXfer: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseFileXfer with Double = js.native
  /* 2200 */ val BaseGC: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseGC with Double = js.native
  /* 300 */ val BaseGM: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseGM with Double = js.native
  /* 900 */ val BaseGameServer: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseGameServer with Double = js.native
  /* 100 */ val BaseGeneral: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseGeneral with Double = js.native
  /* 3200 */ val BaseLBSRange: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseLBSRange with Double = js.native
  /* 5800 */ val BaseMDS: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseMDS with Double = js.native
  /* 3400 */ val BaseOGS: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseOGS with Double = js.native
  /* 2500 */ val BaseP2P: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseP2P with Double = js.native
  /* 5000 */ val BasePSRange: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BasePSRange with Double = js.native
  /* 2900 */ val BaseSM: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseSM with Double = js.native
  /* 200 */ val BaseShell: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseShell with Double = js.native
  /* 3000 */ val BaseTest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseTest with Double = js.native
  /* 5200 */ val BaseUFSRange: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseUFSRange with Double = js.native
  /* 600 */ val BaseVS: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BaseVS with Double = js.native
  /* 8700 */ val BoxMonitorBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BoxMonitorBase with Double = js.native
  /* 8700 */ val BoxMonitorReportRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BoxMonitorReportRequest with Double = js.native
  /* 8701 */ val BoxMonitorReportResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.BoxMonitorReportResponse with Double = js.native
  /* 3153 */ val CCSAddComment: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CCSAddComment with Double = js.native
  /* 3154 */ val CCSAddCommentResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CCSAddCommentResponse with Double = js.native
  /* 3161 */ val CCSDeleteAllCommentsByAuthor: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CCSDeleteAllCommentsByAuthor with Double = js.native
  /* 3162 */ val CCSDeleteAllCommentsByAuthorResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CCSDeleteAllCommentsByAuthorResponse with Double = js.native
  /* 3155 */ val CCSDeleteComment: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CCSDeleteComment with Double = js.native
  /* 3156 */ val CCSDeleteCommentResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CCSDeleteCommentResponse with Double = js.native
  /* 3151 */ val CCSGetComments: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CCSGetComments with Double = js.native
  /* 3159 */ val CCSGetCommentsForNews: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CCSGetCommentsForNews with Double = js.native
  /* 3160 */ val CCSGetCommentsForNewsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CCSGetCommentsForNewsResponse with Double = js.native
  /* 3152 */ val CCSGetCommentsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CCSGetCommentsResponse with Double = js.native
  /* 3158 */ val CCSNotifyCommentCount: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CCSNotifyCommentCount with Double = js.native
  /* 3157 */ val CCSPreloadComments: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CCSPreloadComments with Double = js.native
  /* 7602 */ val CEGPropStatusDRMSRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CEGPropStatusDRMSRequest with Double = js.native
  /* 7603 */ val CEGPropStatusDRMSResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CEGPropStatusDRMSResponse with Double = js.native
  /* 7600 */ val CEGVersionSetEnableDisableRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CEGVersionSetEnableDisableRequest with Double = js.native
  /* 7601 */ val CEGVersionSetEnableDisableResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CEGVersionSetEnableDisableResponse with Double = js.native
  /* 7604 */ val CEGWhackFailureReportRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CEGWhackFailureReportRequest with Double = js.native
  /* 7605 */ val CEGWhackFailureReportResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CEGWhackFailureReportResponse with Double = js.native
  /* 1703 */ val CMAppInfoResponseDeprecated: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CMAppInfoResponseDeprecated with Double = js.native
  /* 1701 */ val CMSetAllowState: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CMSetAllowState with Double = js.native
  /* 1702 */ val CMSpewAllowState: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CMSpewAllowState with Double = js.native
  /* 8500 */ val CREBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CREBase with Double = js.native
  /* 8511 */ val CREEnumeratePublishedFiles: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CREEnumeratePublishedFiles with Double = js.native
  /* 8512 */ val CREEnumeratePublishedFilesResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CREEnumeratePublishedFilesResponse with Double = js.native
  /* 8509 */ val CREGetUserPublishedItemVoteDetails: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CREGetUserPublishedItemVoteDetails with Double = js.native
  /* 8510 */ val CREGetUserPublishedItemVoteDetailsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CREGetUserPublishedItemVoteDetailsResponse with Double = js.native
  /* 8503 */ val CREItemVoteSummary: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CREItemVoteSummary with Double = js.native
  /* 8504 */ val CREItemVoteSummaryResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CREItemVoteSummaryResponse with Double = js.native
  /* 8513 */ val CREPublishedFileVoteAdded: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CREPublishedFileVoteAdded with Double = js.native
  /* 8501 */ val CRERankByTrend: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CRERankByTrend with Double = js.native
  /* 8502 */ val CRERankByTrendResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CRERankByTrendResponse with Double = js.native
  /* 8505 */ val CRERankByVote: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CRERankByVote with Double = js.native
  /* 8506 */ val CRERankByVoteResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CRERankByVoteResponse with Double = js.native
  /* 8507 */ val CREUpdateUserPublishedItemVote: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CREUpdateUserPublishedItemVote with Double = js.native
  /* 8508 */ val CREUpdateUserPublishedItemVoteResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CREUpdateUserPublishedItemVoteResponse with Double = js.native
  /* 6200 */ val CSBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CSBase with Double = js.native
  /* 6201 */ val CSPing: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CSPing with Double = js.native
  /* 6202 */ val CSPingResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CSPingResponse with Double = js.native
  /* 787 */ val CSUserContentApprove: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CSUserContentApprove with Double = js.native
  /* 788 */ val CSUserContentDeny: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CSUserContentDeny with Double = js.native
  /* 652 */ val CSUserContentRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CSUserContentRequest with Double = js.native
  /* 1300 */ val ChannelAuthChallenge: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ChannelAuthChallenge with Double = js.native
  /* 1301 */ val ChannelAuthResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ChannelAuthResponse with Double = js.native
  /* 1302 */ val ChannelAuthResult: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ChannelAuthResult with Double = js.native
  /* 1303 */ val ChannelEncryptRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ChannelEncryptRequest with Double = js.native
  /* 1304 */ val ChannelEncryptResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ChannelEncryptResponse with Double = js.native
  /* 1305 */ val ChannelEncryptResult: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ChannelEncryptResult with Double = js.native
  /* 5531 */ val ClientAMGetClanOfficers: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAMGetClanOfficers with Double = js.native
  /* 5532 */ val ClientAMGetClanOfficersResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAMGetClanOfficersResponse with Double = js.native
  /* 5570 */ val ClientAMGetPersonaNameHistory: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAMGetPersonaNameHistory with Double = js.native
  /* 5571 */ val ClientAMGetPersonaNameHistoryResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAMGetPersonaNameHistoryResponse with Double = js.native
  /* 768 */ val ClientAccountInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAccountInfo with Double = js.native
  /* 740 */ val ClientAckGuestPass: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAckGuestPass with Double = js.native
  /* 796 */ val ClientAckGuestPassResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAckGuestPassResponse with Double = js.native
  /* 735 */ val ClientAckMessageByGID: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAckMessageByGID with Double = js.native
  /* 737 */ val ClientAckPurchaseReceipt: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAckPurchaseReceipt with Double = js.native
  /* 709 */ val ClientAckVACBan: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAckVACBan with Double = js.native
  /* 732 */ val ClientAckVACBan2: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAckVACBan2 with Double = js.native
  /* 745 */ val ClientAcknowledgeClanInvite: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAcknowledgeClanInvite with Double = js.native
  /* 5468 */ val ClientActivateOEMLicense: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientActivateOEMLicense with Double = js.native
  /* 791 */ val ClientAddFriend: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAddFriend with Double = js.native
  /* 792 */ val ClientAddFriendResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAddFriendResponse with Double = js.native
  /* 702 */ val ClientAnonLogOn_Deprecated: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAnonLogOn_Deprecated with Double = js.native
  /* 5409 */ val ClientAnonUserLogOn_Deprecated: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAnonUserLogOn_Deprecated with Double = js.native
  /* 867 */ val ClientAppInfoChanges: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAppInfoChanges with Double = js.native
  /* 840 */ val ClientAppInfoRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAppInfoRequest with Double = js.native
  /* 841 */ val ClientAppInfoResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAppInfoResponse with Double = js.native
  /* 866 */ val ClientAppInfoUpdate: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAppInfoUpdate with Double = js.native
  /* 5507 */ val ClientAppMinutesPlayedData: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAppMinutesPlayedData with Double = js.native
  /* 747 */ val ClientAppUsageEvent: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAppUsageEvent with Double = js.native
  /* 5432 */ val ClientAuthList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAuthList with Double = js.native
  /* 5575 */ val ClientAuthListAck: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAuthListAck with Double = js.native
  /* 5428 */ val ClientAuthList_Deprecated: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAuthList_Deprecated with Double = js.native
  /* 6502 */ val ClientAuthorizeLocalDevice: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAuthorizeLocalDevice with Double = js.native
  /* 6509 */ val ClientAuthorizeLocalDeviceNotification: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAuthorizeLocalDeviceNotification with Double = js.native
  /* 6501 */ val ClientAuthorizeLocalDeviceRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAuthorizeLocalDeviceRequest with Double = js.native
  /* 6502 */ val ClientAuthorizeLocalDeviceResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientAuthorizeLocalDeviceResponse with Double = js.native
  /* 9700 */ val ClientBroadcastBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientBroadcastBase with Double = js.native
  /* 9702 */ val ClientBroadcastDisconnect: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientBroadcastDisconnect with Double = js.native
  /* 9701 */ val ClientBroadcastFrames: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientBroadcastFrames with Double = js.native
  /* 9700 */ val ClientBroadcastInit: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientBroadcastInit with Double = js.native
  /* 9703 */ val ClientBroadcastScreenshot: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientBroadcastScreenshot with Double = js.native
  /* 9704 */ val ClientBroadcastUploadConfig: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientBroadcastUploadConfig with Double = js.native
  /* 783 */ val ClientCMList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientCMList with Double = js.native
  /* 729 */ val ClientCancelLicense: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientCancelLicense with Double = js.native
  /* 781 */ val ClientCancelLicenseResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientCancelLicenseResponse with Double = js.native
  /* 716 */ val ClientChangeStatus: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientChangeStatus with Double = js.native
  /* 5579 */ val ClientChangeSteamGuardOptions: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientChangeSteamGuardOptions with Double = js.native
  /* 5580 */ val ClientChangeSteamGuardOptionsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientChangeSteamGuardOptionsResponse with Double = js.native
  /* 597 */ val ClientChatAction: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientChatAction with Double = js.native
  /* 814 */ val ClientChatActionResult: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientChatActionResult with Double = js.native
  /* 5426 */ val ClientChatDeclined: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientChatDeclined with Double = js.native
  /* 807 */ val ClientChatEnter: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientChatEnter with Double = js.native
  /* 800 */ val ClientChatInvite: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientChatInvite with Double = js.native
  /* 802 */ val ClientChatMemberInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientChatMemberInfo with Double = js.native
  /* 799 */ val ClientChatMsg: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientChatMsg with Double = js.native
  /* 4026 */ val ClientChatRoomInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientChatRoomInfo with Double = js.native
  /* 5450 */ val ClientCheckAppBetaPassword: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientCheckAppBetaPassword with Double = js.native
  /* 5451 */ val ClientCheckAppBetaPasswordResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientCheckAppBetaPasswordResponse with Double = js.native
  /* 5533 */ val ClientCheckFileSignature: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientCheckFileSignature with Double = js.native
  /* 5534 */ val ClientCheckFileSignatureResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientCheckFileSignatureResponse with Double = js.native
  /* 845 */ val ClientCheckPassword: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientCheckPassword with Double = js.native
  /* 848 */ val ClientCheckPasswordResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientCheckPasswordResponse with Double = js.native
  /* 822 */ val ClientClanState: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientClanState with Double = js.native
  /* 5582 */ val ClientCommentNotifications: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientCommentNotifications with Double = js.native
  /* 9600 */ val ClientConcurrentSessionsBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientConcurrentSessionsBase with Double = js.native
  /* 710 */ val ClientConnectionStats: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientConnectionStats with Double = js.native
  /* 731 */ val ClientContentServerLogOn_Deprecated: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientContentServerLogOn_Deprecated with Double = js.native
  /* 5406 */ val ClientCreateAccount2: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientCreateAccount2 with Double = js.native
  /* 5462 */ val ClientCreateAccount3: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientCreateAccount3 with Double = js.native
  /* 5590 */ val ClientCreateAccountProto: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientCreateAccountProto with Double = js.native
  /* 5591 */ val ClientCreateAccountProtoResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientCreateAccountProtoResponse with Double = js.native
  /* 5403 */ val ClientCreateAccountResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientCreateAccountResponse with Double = js.native
  /* 761 */ val ClientCreateAcctResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientCreateAcctResponse with Double = js.native
  /* 809 */ val ClientCreateChat: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientCreateChat with Double = js.native
  /* 810 */ val ClientCreateChatResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientCreateChatResponse with Double = js.native
  /* 5597 */ val ClientCurrentUIMode: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientCurrentUIMode with Double = js.native
  /* 5605 */ val ClientDFSAuthenticateRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientDFSAuthenticateRequest with Double = js.native
  /* 5606 */ val ClientDFSAuthenticateResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientDFSAuthenticateResponse with Double = js.native
  /* 5617 */ val ClientDFSDownloadStatus: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientDFSDownloadStatus with Double = js.native
  /* 5607 */ val ClientDFSEndSession: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientDFSEndSession with Double = js.native
  /* 1620 */ val ClientDPCheckSpecialSurvey: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientDPCheckSpecialSurvey with Double = js.native
  /* 1621 */ val ClientDPCheckSpecialSurveyResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientDPCheckSpecialSurveyResponse with Double = js.native
  /* 1630 */ val ClientDPContentStatsReport: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientDPContentStatsReport with Double = js.native
  /* 1622 */ val ClientDPSendSpecialSurveyResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientDPSendSpecialSurveyResponse with Double = js.native
  /* 1623 */ val ClientDPSendSpecialSurveyResponseReply: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientDPSendSpecialSurveyResponseReply with Double = js.native
  /* 1627 */ val ClientDPSteam2AppStarted: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientDPSteam2AppStarted with Double = js.native
  /* 1625 */ val ClientDPUpdateAppJobReport: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientDPUpdateAppJobReport with Double = js.native
  /* 896 */ val ClientDRMBlobRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientDRMBlobRequest with Double = js.native
  /* 897 */ val ClientDRMBlobResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientDRMBlobResponse with Double = js.native
  /* 5485 */ val ClientDRMDownloadRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientDRMDownloadRequest with Double = js.native
  /* 5574 */ val ClientDRMDownloadRequestWithCrashData: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientDRMDownloadRequestWithCrashData with Double = js.native
  /* 5486 */ val ClientDRMDownloadResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientDRMDownloadResponse with Double = js.native
  /* 5487 */ val ClientDRMFinalResult: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientDRMFinalResult with Double = js.native
  /* 851 */ val ClientDRMProblemReport: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientDRMProblemReport with Double = js.native
  /* 5495 */ val ClientDRMTest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientDRMTest with Double = js.native
  /* 5496 */ val ClientDRMTestResult: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientDRMTestResult with Double = js.native
  /* 6504 */ val ClientDeauthorizeDevice: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientDeauthorizeDevice with Double = js.native
  /* 6503 */ val ClientDeauthorizeDeviceRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientDeauthorizeDeviceRequest with Double = js.native
  /* 5511 */ val ClientDeregisterWithServer: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientDeregisterWithServer with Double = js.native
  /* 5445 */ val ClientDisableTestLicense: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientDisableTestLicense with Double = js.native
  /* 5446 */ val ClientDisableTestLicenseResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientDisableTestLicenseResponse with Double = js.native
  /* 5548 */ val ClientDownloadRateStatistics: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientDownloadRateStatistics with Double = js.native
  /* 5456 */ val ClientEmailAddrInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientEmailAddrInfo with Double = js.native
  /* 5458 */ val ClientEmailChange3: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientEmailChange3 with Double = js.native
  /* 5544 */ val ClientEmailChange4: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientEmailChange4 with Double = js.native
  /* 891 */ val ClientEmailChangeResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientEmailChangeResponse with Double = js.native
  /* 5545 */ val ClientEmailChangeResponse4: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientEmailChangeResponse4 with Double = js.native
  /* 9331 */ val ClientEmoticonList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientEmoticonList with Double = js.native
  /* 5443 */ val ClientEnableTestLicense: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientEnableTestLicense with Double = js.native
  /* 5444 */ val ClientEnableTestLicenseResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientEnableTestLicenseResponse with Double = js.native
  /* 784 */ val ClientEncryptPct: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientEncryptPct with Double = js.native
  /* 7519 */ val ClientFSEnumerateFollowingList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientFSEnumerateFollowingList with Double = js.native
  /* 7520 */ val ClientFSEnumerateFollowingListResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientFSEnumerateFollowingListResponse with Double = js.native
  /* 7515 */ val ClientFSGetFollowerCount: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientFSGetFollowerCount with Double = js.native
  /* 7516 */ val ClientFSGetFollowerCountResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientFSGetFollowerCountResponse with Double = js.native
  /* 7525 */ val ClientFSGetFriendMessageHistory: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientFSGetFriendMessageHistory with Double = js.native
  /* 7527 */ val ClientFSGetFriendMessageHistoryForOfflineMessages: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientFSGetFriendMessageHistoryForOfflineMessages with Double = js.native
  /* 7526 */ val ClientFSGetFriendMessageHistoryResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientFSGetFriendMessageHistoryResponse with Double = js.native
  /* 7528 */ val ClientFSGetFriendsSteamLevels: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientFSGetFriendsSteamLevels with Double = js.native
  /* 7529 */ val ClientFSGetFriendsSteamLevelsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientFSGetFriendsSteamLevelsResponse with Double = js.native
  /* 7517 */ val ClientFSGetIsFollowing: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientFSGetIsFollowing with Double = js.native
  /* 7518 */ val ClientFSGetIsFollowingResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientFSGetIsFollowingResponse with Double = js.native
  /* 7523 */ val ClientFSOfflineMessageNotification: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientFSOfflineMessageNotification with Double = js.native
  /* 7524 */ val ClientFSRequestOfflineMessageCount: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientFSRequestOfflineMessageCount with Double = js.native
  /* 786 */ val ClientFavoritesList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientFavoritesList with Double = js.native
  /* 5412 */ val ClientFileToDownload: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientFileToDownload with Double = js.native
  /* 5413 */ val ClientFileToDownloadResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientFileToDownloadResponse with Double = js.native
  /* 718 */ val ClientFriendMsg: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientFriendMsg with Double = js.native
  /* 5578 */ val ClientFriendMsgEchoToSender: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientFriendMsgEchoToSender with Double = js.native
  /* 5427 */ val ClientFriendMsgIncoming: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientFriendMsgIncoming with Double = js.native
  /* 5535 */ val ClientFriendProfileInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientFriendProfileInfo with Double = js.native
  /* 5536 */ val ClientFriendProfileInfoResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientFriendProfileInfoResponse with Double = js.native
  /* 808 */ val ClientFriendRemovedFromSource: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientFriendRemovedFromSource with Double = js.native
  /* 5596 */ val ClientFriendUserStatusPublished: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientFriendUserStatusPublished with Double = js.native
  /* 5553 */ val ClientFriendsGroupsList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientFriendsGroupsList with Double = js.native
  /* 767 */ val ClientFriendsList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientFriendsList with Double = js.native
  /* 5453 */ val ClientFromGC: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientFromGC with Double = js.native
  /* 5503 */ val ClientGCMsgFailed: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGCMsgFailed with Double = js.native
  /* 6403 */ val ClientGMSServerQuery: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGMSServerQuery with Double = js.native
  /* 773 */ val ClientGameConnectDeny: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGameConnectDeny with Double = js.native
  /* 779 */ val ClientGameConnectTokens: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGameConnectTokens with Double = js.native
  /* 719 */ val ClientGameConnect_obsolete: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGameConnect_obsolete with Double = js.native
  /* 721 */ val ClientGameEnded_obsolete: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGameEnded_obsolete with Double = js.native
  /* 742 */ val ClientGamesPlayed: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGamesPlayed with Double = js.native
  /* 720 */ val ClientGamesPlayed2_obsolete: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGamesPlayed2_obsolete with Double = js.native
  /* 738 */ val ClientGamesPlayed3_obsolete: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGamesPlayed3_obsolete with Double = js.native
  /* 715 */ val ClientGamesPlayedNoDataBlob: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGamesPlayedNoDataBlob with Double = js.native
  /* 5410 */ val ClientGamesPlayedWithDataBlob: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGamesPlayedWithDataBlob with Double = js.native
  /* 705 */ val ClientGamesPlayed_obsolete: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGamesPlayed_obsolete with Double = js.native
  /* 5441 */ val ClientGetAppBetaPasswords: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetAppBetaPasswords with Double = js.native
  /* 5442 */ val ClientGetAppBetaPasswordsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetAppBetaPasswordsResponse with Double = js.native
  /* 857 */ val ClientGetAppOwnershipTicket: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetAppOwnershipTicket with Double = js.native
  /* 858 */ val ClientGetAppOwnershipTicketResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetAppOwnershipTicketResponse with Double = js.native
  /* 6506 */ val ClientGetAuthorizedDevices: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetAuthorizedDevices with Double = js.native
  /* 6507 */ val ClientGetAuthorizedDevicesResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetAuthorizedDevicesResponse with Double = js.native
  /* 5546 */ val ClientGetCDNAuthToken: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetCDNAuthToken with Double = js.native
  /* 5547 */ val ClientGetCDNAuthTokenResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetCDNAuthTokenResponse with Double = js.native
  /* 5554 */ val ClientGetClanActivityCounts: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetClanActivityCounts with Double = js.native
  /* 5555 */ val ClientGetClanActivityCountsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetClanActivityCountsResponse with Double = js.native
  /* 5518 */ val ClientGetClientAppList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetClientAppList with Double = js.native
  /* 5519 */ val ClientGetClientAppListResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetClientAppListResponse with Double = js.native
  /* 5515 */ val ClientGetClientDetails: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetClientDetails with Double = js.native
  /* 5516 */ val ClientGetClientDetailsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetClientDetailsResponse with Double = js.native
  /* 5438 */ val ClientGetDepotDecryptionKey: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetDepotDecryptionKey with Double = js.native
  /* 5439 */ val ClientGetDepotDecryptionKeyResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetDepotDecryptionKeyResponse with Double = js.native
  /* 9330 */ val ClientGetEmoticonList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetEmoticonList with Double = js.native
  /* 722 */ val ClientGetFinalPrice: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetFinalPrice with Double = js.native
  /* 775 */ val ClientGetFinalPriceResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetFinalPriceResponse with Double = js.native
  /* 5488 */ val ClientGetFriendsWhoPlayGame: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetFriendsWhoPlayGame with Double = js.native
  /* 5489 */ val ClientGetFriendsWhoPlayGameResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetFriendsWhoPlayGameResponse with Double = js.native
  /* 748 */ val ClientGetGiftTargetList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetGiftTargetList with Double = js.native
  /* 749 */ val ClientGetGiftTargetListResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetGiftTargetListResponse with Double = js.native
  /* 730 */ val ClientGetLegacyGameKey: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetLegacyGameKey with Double = js.native
  /* 785 */ val ClientGetLegacyGameKeyResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetLegacyGameKeyResponse with Double = js.native
  /* 728 */ val ClientGetLicenses: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetLicenses with Double = js.native
  /* 860 */ val ClientGetLobbyListResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetLobbyListResponse with Double = js.native
  /* 861 */ val ClientGetLobbyMetadata: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetLobbyMetadata with Double = js.native
  /* 862 */ val ClientGetLobbyMetadataResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetLobbyMetadataResponse with Double = js.native
  /* 5508 */ val ClientGetMicroTxnInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetMicroTxnInfo with Double = js.native
  /* 5509 */ val ClientGetMicroTxnInfoResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetMicroTxnInfoResponse with Double = js.native
  /* 5436 */ val ClientGetNumberOfCurrentPlayers: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetNumberOfCurrentPlayers with Double = js.native
  /* 5592 */ val ClientGetNumberOfCurrentPlayersDP: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetNumberOfCurrentPlayersDP with Double = js.native
  /* 5593 */ val ClientGetNumberOfCurrentPlayersDPResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetNumberOfCurrentPlayersDPResponse with Double = js.native
  /* 5437 */ val ClientGetNumberOfCurrentPlayersResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetNumberOfCurrentPlayersResponse with Double = js.native
  /* 736 */ val ClientGetPurchaseReceipts: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetPurchaseReceipts with Double = js.native
  /* 818 */ val ClientGetUserStats: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetUserStats with Double = js.native
  /* 819 */ val ClientGetUserStatsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientGetUserStatsResponse with Double = js.native
  /* 703 */ val ClientHeartBeat: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientHeartBeat with Double = js.native
  /* 5552 */ val ClientHideFriend: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientHideFriend with Double = js.native
  /* 708 */ val ClientInformOfCreateAccount: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientInformOfCreateAccount with Double = js.native
  /* 5407 */ val ClientInformOfResetForgottenPassword: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientInformOfResetForgottenPassword with Double = js.native
  /* 5408 */ val ClientInformOfResetForgottenPasswordResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientInformOfResetForgottenPasswordResponse with Double = js.native
  /* 711 */ val ClientInitPurchase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientInitPurchase with Double = js.native
  /* 789 */ val ClientInitPurchaseResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientInitPurchaseResponse with Double = js.native
  /* 5520 */ val ClientInstallClientApp: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientInstallClientApp with Double = js.native
  /* 5521 */ val ClientInstallClientAppResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientInstallClientAppResponse with Double = js.native
  /* 793 */ val ClientInviteFriend: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientInviteFriend with Double = js.native
  /* 794 */ val ClientInviteFriendResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientInviteFriendResponse with Double = js.native
  /* 744 */ val ClientInviteUserToClan: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientInviteUserToClan with Double = js.native
  /* 5430 */ val ClientIsLimitedAccount: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientIsLimitedAccount with Double = js.native
  /* 5576 */ val ClientItemAnnouncements: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientItemAnnouncements with Double = js.native
  /* 801 */ val ClientJoinChat: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientJoinChat with Double = js.native
  /* 9601 */ val ClientKickPlayingSession: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientKickPlayingSession with Double = js.native
  /* 5416 */ val ClientLBSFindOrCreateLB: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientLBSFindOrCreateLB with Double = js.native
  /* 5417 */ val ClientLBSFindOrCreateLBResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientLBSFindOrCreateLBResponse with Double = js.native
  /* 5418 */ val ClientLBSGetLBEntries: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientLBSGetLBEntries with Double = js.native
  /* 5419 */ val ClientLBSGetLBEntriesResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientLBSGetLBEntriesResponse with Double = js.native
  /* 5414 */ val ClientLBSSetScore: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientLBSSetScore with Double = js.native
  /* 5415 */ val ClientLBSSetScoreResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientLBSSetScoreResponse with Double = js.native
  /* 5529 */ val ClientLBSSetUGC: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientLBSSetUGC with Double = js.native
  /* 5530 */ val ClientLBSSetUGCResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientLBSSetUGCResponse with Double = js.native
  /* 780 */ val ClientLicenseList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientLicenseList with Double = js.native
  /* 706 */ val ClientLogOff: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientLogOff with Double = js.native
  /* 751 */ val ClientLogOnResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientLogOnResponse with Double = js.native
  /* 803 */ val ClientLogOnWithCredentials_Deprecated: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientLogOnWithCredentials_Deprecated with Double = js.native
  /* 5465 */ val ClientLogOnWithHash_Deprecated: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientLogOnWithHash_Deprecated with Double = js.native
  /* 701 */ val ClientLogOn_Deprecated: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientLogOn_Deprecated with Double = js.native
  /* 757 */ val ClientLoggedOff: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientLoggedOff with Double = js.native
  /* 5514 */ val ClientLogon: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientLogon with Double = js.native
  /* 5559 */ val ClientLogonGameServer: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientLogonGameServer with Double = js.native
  /* 898 */ val ClientLookupKey: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientLookupKey with Double = js.native
  /* 899 */ val ClientLookupKeyResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientLookupKeyResponse with Double = js.native
  /* 5818 */ val ClientMDSGetDepotManifest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMDSGetDepotManifest with Double = js.native
  /* 5820 */ val ClientMDSGetDepotManifestChunk: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMDSGetDepotManifestChunk with Double = js.native
  /* 5819 */ val ClientMDSGetDepotManifestResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMDSGetDepotManifestResponse with Double = js.native
  /* 5842 */ val ClientMDSGetPrevDepotBuild: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMDSGetPrevDepotBuild with Double = js.native
  /* 5843 */ val ClientMDSGetPrevDepotBuildResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMDSGetPrevDepotBuildResponse with Double = js.native
  /* 5806 */ val ClientMDSHeartbeat: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMDSHeartbeat with Double = js.native
  /* 5809 */ val ClientMDSInitDepotBuildRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMDSInitDepotBuildRequest with Double = js.native
  /* 5810 */ val ClientMDSInitDepotBuildResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMDSInitDepotBuildResponse with Double = js.native
  /* 5816 */ val ClientMDSInitWorkshopBuildRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMDSInitWorkshopBuildRequest with Double = js.native
  /* 5817 */ val ClientMDSInitWorkshopBuildResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMDSInitWorkshopBuildResponse with Double = js.native
  /* 5801 */ val ClientMDSLoginRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMDSLoginRequest with Double = js.native
  /* 5802 */ val ClientMDSLoginResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMDSLoginResponse with Double = js.native
  /* 5838 */ val ClientMDSRegisterAppBuild: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMDSRegisterAppBuild with Double = js.native
  /* 5839 */ val ClientMDSRegisterAppBuildResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMDSRegisterAppBuildResponse with Double = js.native
  /* 5840 */ val ClientMDSSetAppBuildLive: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMDSSetAppBuildLive with Double = js.native
  /* 5841 */ val ClientMDSSetAppBuildLiveResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMDSSetAppBuildLiveResponse with Double = js.native
  /* 5845 */ val ClientMDSSignInstallScript: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMDSSignInstallScript with Double = js.native
  /* 5846 */ val ClientMDSSignInstallScriptResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMDSSignInstallScriptResponse with Double = js.native
  /* 5805 */ val ClientMDSTransmitManifestDataChunk: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMDSTransmitManifestDataChunk with Double = js.native
  /* 5807 */ val ClientMDSUploadDepotChunks: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMDSUploadDepotChunks with Double = js.native
  /* 5808 */ val ClientMDSUploadDepotChunksResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMDSUploadDepotChunksResponse with Double = js.native
  /* 5803 */ val ClientMDSUploadManifestRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMDSUploadManifestRequest with Double = js.native
  /* 5804 */ val ClientMDSUploadManifestResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMDSUploadManifestResponse with Double = js.native
  /* 5823 */ val ClientMDSUploadRateTest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMDSUploadRateTest with Double = js.native
  /* 5824 */ val ClientMDSUploadRateTestResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMDSUploadRateTestResponse with Double = js.native
  /* 6601 */ val ClientMMSCreateLobby: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMMSCreateLobby with Double = js.native
  /* 6602 */ val ClientMMSCreateLobbyResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMMSCreateLobbyResponse with Double = js.native
  /* 6622 */ val ClientMMSFlushFrenemyListCache: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMMSFlushFrenemyListCache with Double = js.native
  /* 6623 */ val ClientMMSFlushFrenemyListCacheResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMMSFlushFrenemyListCacheResponse with Double = js.native
  /* 6611 */ val ClientMMSGetLobbyData: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMMSGetLobbyData with Double = js.native
  /* 6607 */ val ClientMMSGetLobbyList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMMSGetLobbyList with Double = js.native
  /* 6608 */ val ClientMMSGetLobbyListResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMMSGetLobbyListResponse with Double = js.native
  /* 6621 */ val ClientMMSInviteToLobby: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMMSInviteToLobby with Double = js.native
  /* 6603 */ val ClientMMSJoinLobby: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMMSJoinLobby with Double = js.native
  /* 6604 */ val ClientMMSJoinLobbyResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMMSJoinLobbyResponse with Double = js.native
  /* 6605 */ val ClientMMSLeaveLobby: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMMSLeaveLobby with Double = js.native
  /* 6606 */ val ClientMMSLeaveLobbyResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMMSLeaveLobbyResponse with Double = js.native
  /* 6614 */ val ClientMMSLobbyChatMsg: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMMSLobbyChatMsg with Double = js.native
  /* 6612 */ val ClientMMSLobbyData: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMMSLobbyData with Double = js.native
  /* 6618 */ val ClientMMSLobbyGameServerSet: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMMSLobbyGameServerSet with Double = js.native
  /* 6613 */ val ClientMMSSendLobbyChatMsg: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMMSSendLobbyChatMsg with Double = js.native
  /* 6609 */ val ClientMMSSetLobbyData: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMMSSetLobbyData with Double = js.native
  /* 6610 */ val ClientMMSSetLobbyDataResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMMSSetLobbyDataResponse with Double = js.native
  /* 6617 */ val ClientMMSSetLobbyGameServer: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMMSSetLobbyGameServer with Double = js.native
  /* 6624 */ val ClientMMSSetLobbyLinked: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMMSSetLobbyLinked with Double = js.native
  /* 6615 */ val ClientMMSSetLobbyOwner: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMMSSetLobbyOwner with Double = js.native
  /* 6616 */ val ClientMMSSetLobbyOwnerResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMMSSetLobbyOwnerResponse with Double = js.native
  /* 6619 */ val ClientMMSUserJoinedLobby: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMMSUserJoinedLobby with Double = js.native
  /* 6620 */ val ClientMMSUserLeftLobby: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMMSUserLeftLobby with Double = js.native
  /* 5420 */ val ClientMarketingMessageUpdate: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMarketingMessageUpdate with Double = js.native
  /* 5510 */ val ClientMarketingMessageUpdate2: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMarketingMessageUpdate2 with Double = js.native
  /* 5504 */ val ClientMicroTxnAuthRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMicroTxnAuthRequest with Double = js.native
  /* 5505 */ val ClientMicroTxnAuthorize: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMicroTxnAuthorize with Double = js.native
  /* 5506 */ val ClientMicroTxnAuthorizeResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientMicroTxnAuthorizeResponse with Double = js.native
  /* 765 */ val ClientNOP: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientNOP with Double = js.native
  /* 839 */ val ClientNatTraversalStatEvent: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientNatTraversalStatEvent with Double = js.native
  /* 5463 */ val ClientNewLoginKey: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientNewLoginKey with Double = js.native
  /* 5464 */ val ClientNewLoginKeyAccepted: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientNewLoginKeyAccepted with Double = js.native
  /* 771 */ val ClientNewsUpdate: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientNewsUpdate with Double = js.native
  /* 707 */ val ClientNoUDPConnectivity: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientNoUDPConnectivity with Double = js.native
  /* 756 */ val ClientNotLoggedOnDeprecated: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientNotLoggedOnDeprecated with Double = js.native
  /* 5490 */ val ClientOGSBeginSession: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientOGSBeginSession with Double = js.native
  /* 5491 */ val ClientOGSBeginSessionResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientOGSBeginSessionResponse with Double = js.native
  /* 5492 */ val ClientOGSEndSession: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientOGSEndSession with Double = js.native
  /* 5493 */ val ClientOGSEndSessionResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientOGSEndSessionResponse with Double = js.native
  /* 5581 */ val ClientOGSGameServerPingSample: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientOGSGameServerPingSample with Double = js.native
  /* 5557 */ val ClientOGSReportBug: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientOGSReportBug with Double = js.native
  /* 5556 */ val ClientOGSReportString: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientOGSReportString with Double = js.native
  /* 5494 */ val ClientOGSWriteRow: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientOGSWriteRow with Double = js.native
  /* 5435 */ val ClientP2PConnectionFailInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientP2PConnectionFailInfo with Double = js.native
  /* 5434 */ val ClientP2PConnectionInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientP2PConnectionInfo with Double = js.native
  /* 813 */ val ClientP2PIntroducerMessage: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientP2PIntroducerMessage with Double = js.native
  /* 8905 */ val ClientPICSAccessTokenRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientPICSAccessTokenRequest with Double = js.native
  /* 8906 */ val ClientPICSAccessTokenResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientPICSAccessTokenResponse with Double = js.native
  /* 8901 */ val ClientPICSChangesSinceRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientPICSChangesSinceRequest with Double = js.native
  /* 8902 */ val ClientPICSChangesSinceResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientPICSChangesSinceResponse with Double = js.native
  /* 8903 */ val ClientPICSProductInfoRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientPICSProductInfoRequest with Double = js.native
  /* 8904 */ val ClientPICSProductInfoResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientPICSProductInfoResponse with Double = js.native
  /* 833 */ val ClientPackageInfoRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientPackageInfoRequest with Double = js.native
  /* 834 */ val ClientPackageInfoResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientPackageInfoResponse with Double = js.native
  /* 148 */ val ClientPackageVersions: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientPackageVersions with Double = js.native
  /* 5457 */ val ClientPasswordChange3: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientPasswordChange3 with Double = js.native
  /* 805 */ val ClientPasswordChangeResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientPasswordChangeResponse with Double = js.native
  /* 5584 */ val ClientPersonaChangeResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientPersonaChangeResponse with Double = js.native
  /* 766 */ val ClientPersonaState: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientPersonaState with Double = js.native
  /* 5459 */ val ClientPersonalQAChange3: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientPersonalQAChange3 with Double = js.native
  /* 764 */ val ClientPing: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientPing with Double = js.native
  /* 712 */ val ClientPingResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientPingResponse with Double = js.native
  /* 5587 */ val ClientPlayerNicknameList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientPlayerNicknameList with Double = js.native
  /* 9600 */ val ClientPlayingSessionState: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientPlayingSessionState with Double = js.native
  /* 763 */ val ClientPurchaseResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientPurchaseResponse with Double = js.native
  /* 746 */ val ClientPurchaseWithMachineID: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientPurchaseWithMachineID with Double = js.native
  /* 5539 */ val ClientReadMachineAuth: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientReadMachineAuth with Double = js.native
  /* 5540 */ val ClientReadMachineAuthResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientReadMachineAuthResponse with Double = js.native
  /* 741 */ val ClientRedeemGuestPass: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRedeemGuestPass with Double = js.native
  /* 797 */ val ClientRedeemGuestPassResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRedeemGuestPassResponse with Double = js.native
  /* 5502 */ val ClientRegisterAuthTicketWithCM: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRegisterAuthTicketWithCM with Double = js.native
  /* 743 */ val ClientRegisterKey: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRegisterKey with Double = js.native
  /* 5469 */ val ClientRegisterOEMMachine: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRegisterOEMMachine with Double = js.native
  /* 5470 */ val ClientRegisterOEMMachineResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRegisterOEMMachineResponse with Double = js.native
  /* 714 */ val ClientRemoveFriend: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRemoveFriend with Double = js.native
  /* 5517 */ val ClientReportOverlayDetourFailure: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientReportOverlayDetourFailure with Double = js.native
  /* 5549 */ val ClientRequestAccountData: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRequestAccountData with Double = js.native
  /* 5550 */ val ClientRequestAccountDataResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRequestAccountDataResponse with Double = js.native
  /* 5431 */ val ClientRequestAuthList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRequestAuthList with Double = js.native
  /* 5454 */ val ClientRequestChangeMail: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRequestChangeMail with Double = js.native
  /* 5455 */ val ClientRequestChangeMailResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRequestChangeMailResponse with Double = js.native
  /* 5583 */ val ClientRequestCommentNotifications: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRequestCommentNotifications with Double = js.native
  /* 5526 */ val ClientRequestEncryptedAppTicket: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRequestEncryptedAppTicket with Double = js.native
  /* 5527 */ val ClientRequestEncryptedAppTicketResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRequestEncryptedAppTicketResponse with Double = js.native
  /* 5401 */ val ClientRequestForgottenPasswordEmail: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRequestForgottenPasswordEmail with Double = js.native
  /* 5461 */ val ClientRequestForgottenPasswordEmail3: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRequestForgottenPasswordEmail3 with Double = js.native
  /* 5402 */ val ClientRequestForgottenPasswordEmailResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRequestForgottenPasswordEmailResponse with Double = js.native
  /* 5572 */ val ClientRequestFreeLicense: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRequestFreeLicense with Double = js.native
  /* 5573 */ val ClientRequestFreeLicenseResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRequestFreeLicenseResponse with Double = js.native
  /* 815 */ val ClientRequestFriendData: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRequestFriendData with Double = js.native
  /* 554 */ val ClientRequestFriendship: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRequestFriendship with Double = js.native
  /* 5577 */ val ClientRequestItemAnnouncements: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRequestItemAnnouncements with Double = js.native
  /* 5541 */ val ClientRequestMachineAuth: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRequestMachineAuth with Double = js.native
  /* 5542 */ val ClientRequestMachineAuthResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRequestMachineAuthResponse with Double = js.native
  /* 5590 */ val ClientRequestOAuthTokenForApp: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRequestOAuthTokenForApp with Double = js.native
  /* 5591 */ val ClientRequestOAuthTokenForAppResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRequestOAuthTokenForAppResponse with Double = js.native
  /* 5448 */ val ClientRequestValidationMail: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRequestValidationMail with Double = js.native
  /* 5449 */ val ClientRequestValidationMailResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRequestValidationMailResponse with Double = js.native
  /* 5585 */ val ClientRequestWebAPIAuthenticateUserNonce: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRequestWebAPIAuthenticateUserNonce with Double = js.native
  /* 5586 */ val ClientRequestWebAPIAuthenticateUserNonceResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRequestWebAPIAuthenticateUserNonceResponse with Double = js.native
  /* 5480 */ val ClientRequestedClientStats: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRequestedClientStats with Double = js.native
  /* 5404 */ val ClientResetForgottenPassword: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientResetForgottenPassword with Double = js.native
  /* 5460 */ val ClientResetForgottenPassword3: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientResetForgottenPassword3 with Double = js.native
  /* 5551 */ val ClientResetForgottenPassword4: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientResetForgottenPassword4 with Double = js.native
  /* 5405 */ val ClientResetForgottenPasswordResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientResetForgottenPasswordResponse with Double = js.native
  /* 846 */ val ClientResetPassword: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientResetPassword with Double = js.native
  /* 849 */ val ClientResetPasswordResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientResetPasswordResponse with Double = js.native
  /* 7503 */ val ClientRichPresenceInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRichPresenceInfo with Double = js.native
  /* 7502 */ val ClientRichPresenceRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRichPresenceRequest with Double = js.native
  /* 7501 */ val ClientRichPresenceUpload: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientRichPresenceUpload with Double = js.native
  /* 5543 */ val ClientScreenshotsChanged: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientScreenshotsChanged with Double = js.native
  /* 892 */ val ClientSecretQAChangeResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientSecretQAChangeResponse with Double = js.native
  /* 739 */ val ClientSendGuestPass: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientSendGuestPass with Double = js.native
  /* 795 */ val ClientSendGuestPassResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientSendGuestPassResponse with Double = js.native
  /* 5558 */ val ClientSentLogs: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientSentLogs with Double = js.native
  /* 880 */ val ClientServerList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientServerList with Double = js.native
  /* 5500 */ val ClientServerUnavailable: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientServerUnavailable with Double = js.native
  /* 5501 */ val ClientServersAvailable: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientServersAvailable with Double = js.native
  /* 831 */ val ClientServiceCall: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientServiceCall with Double = js.native
  /* 832 */ val ClientServiceCallResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientServiceCallResponse with Double = js.native
  /* 5594 */ val ClientServiceMethod: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientServiceMethod with Double = js.native
  /* 5595 */ val ClientServiceMethodResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientServiceMethodResponse with Double = js.native
  /* 830 */ val ClientServiceModule: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientServiceModule with Double = js.native
  /* 136 */ val ClientSessionEnd: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientSessionEnd with Double = js.native
  /* 135 */ val ClientSessionStart: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientSessionStart with Double = js.native
  /* 850 */ val ClientSessionToken: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientSessionToken with Double = js.native
  /* 137 */ val ClientSessionUpdate: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientSessionUpdate with Double = js.native
  /* 137 */ val ClientSessionUpdateAuthTicket: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientSessionUpdateAuthTicket with Double = js.native
  /* 5524 */ val ClientSetClientAppUpdateState: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientSetClientAppUpdateState with Double = js.native
  /* 5525 */ val ClientSetClientAppUpdateStateResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientSetClientAppUpdateStateResponse with Double = js.native
  /* 755 */ val ClientSetHeartbeatRate: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientSetHeartbeatRate with Double = js.native
  /* 855 */ val ClientSetIgnoreFriend: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientSetIgnoreFriend with Double = js.native
  /* 856 */ val ClientSetIgnoreFriendResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientSetIgnoreFriendResponse with Double = js.native
  /* 9400 */ val ClientSharedLibraryBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientSharedLibraryBase with Double = js.native
  /* 9405 */ val ClientSharedLibraryLockStatus: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientSharedLibraryLockStatus with Double = js.native
  /* 9406 */ val ClientSharedLibraryStopPlaying: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientSharedLibraryStopPlaying with Double = js.native
  /* 9403 */ val ClientSharedLicensesLockStatus: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientSharedLicensesLockStatus with Double = js.native
  /* 9404 */ val ClientSharedLicensesStopPlaying: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientSharedLicensesStopPlaying with Double = js.native
  /* 5433 */ val ClientStat: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientStat with Double = js.native
  /* 5482 */ val ClientStat2: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientStat2 with Double = js.native
  /* 5481 */ val ClientStat2Int32: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientStat2Int32 with Double = js.native
  /* 5467 */ val ClientStatsUpdated: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientStatsUpdated with Double = js.native
  /* 842 */ val ClientSteamUsageEvent: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientSteamUsageEvent with Double = js.native
  /* 820 */ val ClientStoreUserStats: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientStoreUserStats with Double = js.native
  /* 5466 */ val ClientStoreUserStats2: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientStoreUserStats2 with Double = js.native
  /* 821 */ val ClientStoreUserStatsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientStoreUserStatsResponse with Double = js.native
  /* 5512 */ val ClientSubscribeToPersonaFeed: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientSubscribeToPersonaFeed with Double = js.native
  /* 726 */ val ClientSystemIM: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientSystemIM with Double = js.native
  /* 727 */ val ClientSystemIMAck: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientSystemIMAck with Double = js.native
  /* 5429 */ val ClientTicketAuthComplete: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientTicketAuthComplete with Double = js.native
  /* 5452 */ val ClientToGC: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientToGC with Double = js.native
  /* 7301 */ val ClientUCMAddScreenshot: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMAddScreenshot with Double = js.native
  /* 7302 */ val ClientUCMAddScreenshotResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMAddScreenshotResponse with Double = js.native
  /* 7315 */ val ClientUCMDeletePublishedFile: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMDeletePublishedFile with Double = js.native
  /* 7316 */ val ClientUCMDeletePublishedFileResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMDeletePublishedFileResponse with Double = js.native
  /* 7309 */ val ClientUCMDeleteScreenshot: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMDeleteScreenshot with Double = js.native
  /* 7310 */ val ClientUCMDeleteScreenshotResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMDeleteScreenshotResponse with Double = js.native
  /* 7366 */ val ClientUCMEnumeratePublishedFilesByUserAction: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMEnumeratePublishedFilesByUserAction with Double = js.native
  /* 7367 */ val ClientUCMEnumeratePublishedFilesByUserActionResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMEnumeratePublishedFilesByUserActionResponse with Double = js.native
  /* 7317 */ val ClientUCMEnumerateUserPublishedFiles: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMEnumerateUserPublishedFiles with Double = js.native
  /* 7318 */ val ClientUCMEnumerateUserPublishedFilesResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMEnumerateUserPublishedFilesResponse with Double = js.native
  /* 7321 */ val ClientUCMEnumerateUserSubscribedFiles: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMEnumerateUserSubscribedFiles with Double = js.native
  /* 7322 */ val ClientUCMEnumerateUserSubscribedFilesResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMEnumerateUserSubscribedFilesResponse with Double = js.native
  /* 7378 */ val ClientUCMEnumerateUserSubscribedFilesWithUpdates: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMEnumerateUserSubscribedFilesWithUpdates with Double = js.native
  /* 7379 */ val ClientUCMEnumerateUserSubscribedFilesWithUpdatesResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMEnumerateUserSubscribedFilesWithUpdatesResponse with Double = js.native
  /* 7313 */ val ClientUCMGetPublishedFileDetails: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMGetPublishedFileDetails with Double = js.native
  /* 7314 */ val ClientUCMGetPublishedFileDetailsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMGetPublishedFileDetailsResponse with Double = js.native
  /* 7360 */ val ClientUCMGetPublishedFilesForUser: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMGetPublishedFilesForUser with Double = js.native
  /* 7361 */ val ClientUCMGetPublishedFilesForUserResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMGetPublishedFilesForUserResponse with Double = js.native
  /* 7311 */ val ClientUCMPublishFile: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMPublishFile with Double = js.native
  /* 7312 */ val ClientUCMPublishFileResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMPublishFileResponse with Double = js.native
  /* 7368 */ val ClientUCMPublishedFileDeleted: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMPublishedFileDeleted with Double = js.native
  /* 7347 */ val ClientUCMPublishedFileSubscribed: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMPublishedFileSubscribed with Double = js.native
  /* 7348 */ val ClientUCMPublishedFileUnsubscribed: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMPublishedFileUnsubscribed with Double = js.native
  /* 7364 */ val ClientUCMSetUserPublishedFileAction: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMSetUserPublishedFileAction with Double = js.native
  /* 7365 */ val ClientUCMSetUserPublishedFileActionResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMSetUserPublishedFileActionResponse with Double = js.native
  /* 7319 */ val ClientUCMSubscribePublishedFile: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMSubscribePublishedFile with Double = js.native
  /* 7320 */ val ClientUCMSubscribePublishedFileResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMSubscribePublishedFileResponse with Double = js.native
  /* 7323 */ val ClientUCMUnsubscribePublishedFile: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMUnsubscribePublishedFile with Double = js.native
  /* 7324 */ val ClientUCMUnsubscribePublishedFileResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMUnsubscribePublishedFileResponse with Double = js.native
  /* 7325 */ val ClientUCMUpdatePublishedFile: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMUpdatePublishedFile with Double = js.native
  /* 7326 */ val ClientUCMUpdatePublishedFileResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUCMUpdatePublishedFileResponse with Double = js.native
  /* 7005 */ val ClientUDSInviteToGame: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUDSInviteToGame with Double = js.native
  /* 7002 */ val ClientUDSP2PSessionEnded: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUDSP2PSessionEnded with Double = js.native
  /* 7001 */ val ClientUDSP2PSessionStarted: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUDSP2PSessionStarted with Double = js.native
  /* 5219 */ val ClientUFSDeleteFileRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUFSDeleteFileRequest with Double = js.native
  /* 5220 */ val ClientUFSDeleteFileResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUFSDeleteFileResponse with Double = js.native
  /* 5212 */ val ClientUFSDownloadChunk: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUFSDownloadChunk with Double = js.native
  /* 5210 */ val ClientUFSDownloadRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUFSDownloadRequest with Double = js.native
  /* 5211 */ val ClientUFSDownloadResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUFSDownloadResponse with Double = js.native
  /* 5206 */ val ClientUFSGetFileListForApp: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUFSGetFileListForApp with Double = js.native
  /* 5207 */ val ClientUFSGetFileListForAppResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUFSGetFileListForAppResponse with Double = js.native
  /* 5230 */ val ClientUFSGetSingleFileInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUFSGetSingleFileInfo with Double = js.native
  /* 5231 */ val ClientUFSGetSingleFileInfoResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUFSGetSingleFileInfoResponse with Double = js.native
  /* 5226 */ val ClientUFSGetUGCDetails: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUFSGetUGCDetails with Double = js.native
  /* 5227 */ val ClientUFSGetUGCDetailsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUFSGetUGCDetailsResponse with Double = js.native
  /* 5213 */ val ClientUFSLoginRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUFSLoginRequest with Double = js.native
  /* 5214 */ val ClientUFSLoginResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUFSLoginResponse with Double = js.native
  /* 5232 */ val ClientUFSShareFile: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUFSShareFile with Double = js.native
  /* 5233 */ val ClientUFSShareFileResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUFSShareFileResponse with Double = js.native
  /* 5216 */ val ClientUFSTransferHeartbeat: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUFSTransferHeartbeat with Double = js.native
  /* 5204 */ val ClientUFSUploadFileChunk: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUFSUploadFileChunk with Double = js.native
  /* 5205 */ val ClientUFSUploadFileFinished: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUFSUploadFileFinished with Double = js.native
  /* 5202 */ val ClientUFSUploadFileRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUFSUploadFileRequest with Double = js.native
  /* 5203 */ val ClientUFSUploadFileResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUFSUploadFileResponse with Double = js.native
  /* 7901 */ val ClientUGSGetGlobalStats: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUGSGetGlobalStats with Double = js.native
  /* 7902 */ val ClientUGSGetGlobalStatsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUGSGetGlobalStatsResponse with Double = js.native
  /* 5522 */ val ClientUninstallClientApp: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUninstallClientApp with Double = js.native
  /* 5523 */ val ClientUninstallClientAppResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUninstallClientAppResponse with Double = js.native
  /* 9507 */ val ClientUnlockStreaming: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUnlockStreaming with Double = js.native
  /* 9508 */ val ClientUnlockStreamingResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUnlockStreamingResponse with Double = js.native
  /* 811 */ val ClientUpdateChatMetadata: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUpdateChatMetadata with Double = js.native
  /* 798 */ val ClientUpdateGuestPassesList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUpdateGuestPassesList with Double = js.native
  /* 5537 */ val ClientUpdateMachineAuth: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUpdateMachineAuth with Double = js.native
  /* 5538 */ val ClientUpdateMachineAuthResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUpdateMachineAuthResponse with Double = js.native
  /* 5411 */ val ClientUpdateUserGameInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUpdateUserGameInfo with Double = js.native
  /* 6505 */ val ClientUseLocalDeviceAuthorizations: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUseLocalDeviceAuthorizations with Double = js.native
  /* 5599 */ val ClientUserNotifications: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientUserNotifications with Double = js.native
  /* 782 */ val ClientVACBanStatus: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientVACBanStatus with Double = js.native
  /* 753 */ val ClientVACChallenge: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientVACChallenge with Double = js.native
  /* 704 */ val ClientVACResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientVACResponse with Double = js.native
  /* 863 */ val ClientVTTCert: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientVTTCert with Double = js.native
  /* 770 */ val ClientVacStatusQuery: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientVacStatusQuery with Double = js.native
  /* 717 */ val ClientVacStatusResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientVacStatusResponse with Double = js.native
  /* 5598 */ val ClientVanityURLChangedNotification: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientVanityURLChangedNotification with Double = js.native
  /* 5483 */ val ClientVerifyPassword: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientVerifyPassword with Double = js.native
  /* 5484 */ val ClientVerifyPasswordResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientVerifyPasswordResponse with Double = js.native
  /* 9800 */ val ClientVoiceCallPreAuthorize: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientVoiceCallPreAuthorize with Double = js.native
  /* 9801 */ val ClientVoiceCallPreAuthorizeResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientVoiceCallPreAuthorizeResponse with Double = js.native
  /* 5528 */ val ClientWalletInfoUpdate: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientWalletInfoUpdate with Double = js.native
  /* 7382 */ val ClientWorkshopItemChangesRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientWorkshopItemChangesRequest with Double = js.native
  /* 7383 */ val ClientWorkshopItemChangesResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientWorkshopItemChangesResponse with Double = js.native
  /* 7384 */ val ClientWorkshopItemInfoRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientWorkshopItemInfoRequest with Double = js.native
  /* 7385 */ val ClientWorkshopItemInfoResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ClientWorkshopItemInfoResponse with Double = js.native
  /* 4140 */ val CommunityAddFriendNews: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CommunityAddFriendNews with Double = js.native
  /* 4155 */ val CommunityDeleteUserNews: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CommunityDeleteUserNews with Double = js.native
  /* 4173 */ val CommunityGetUserFriendNews: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.CommunityGetUserFriendNews with Double = js.native
  /* 227 */ val ContentDescriptionUpdate: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ContentDescriptionUpdate with Double = js.native
  /* 5611 */ val DFSAcceptedResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DFSAcceptedResponse with Double = js.native
  /* 5603 */ val DFSConnection: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DFSConnection with Double = js.native
  /* 5604 */ val DFSConnectionReply: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DFSConnectionReply with Double = js.native
  /* 5601 */ val DFSGetFile: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DFSGetFile with Double = js.native
  /* 5610 */ val DFSGetFileFromServer: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DFSGetFileFromServer with Double = js.native
  /* 5602 */ val DFSInstallLocalFile: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DFSInstallLocalFile with Double = js.native
  /* 5608 */ val DFSPurgeFile: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DFSPurgeFile with Double = js.native
  /* 5613 */ val DFSRecvTransmitFile: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DFSRecvTransmitFile with Double = js.native
  /* 5612 */ val DFSRequestPingback: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DFSRequestPingback with Double = js.native
  /* 5615 */ val DFSRequestPingback2: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DFSRequestPingback2 with Double = js.native
  /* 5616 */ val DFSResponsePingback2: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DFSResponsePingback2 with Double = js.native
  /* 5609 */ val DFSRouteFile: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DFSRouteFile with Double = js.native
  /* 5620 */ val DFSRouteFileResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DFSRouteFileResponse with Double = js.native
  /* 5614 */ val DFSSendTransmitFile: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DFSSendTransmitFile with Double = js.native
  /* 5618 */ val DFSStartTransfer: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DFSStartTransfer with Double = js.native
  /* 5619 */ val DFSTransferComplete: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DFSTransferComplete with Double = js.native
  /* 1614 */ val DPAccountCreationStats: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DPAccountCreationStats with Double = js.native
  /* 1613 */ val DPAchievementStats: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DPAchievementStats with Double = js.native
  /* 1607 */ val DPBlockingStats: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DPBlockingStats with Double = js.native
  /* 1612 */ val DPCloudStats: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DPCloudStats with Double = js.native
  /* 1618 */ val DPDownloadRateStatistics: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DPDownloadRateStatistics with Double = js.native
  /* 1619 */ val DPFacebookStatistics: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DPFacebookStatistics with Double = js.native
  /* 1602 */ val DPGamePlayedStats: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DPGamePlayedStats with Double = js.native
  /* 1617 */ val DPGameServersPlayersStats: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DPGameServersPlayersStats with Double = js.native
  /* 1615 */ val DPGetPlayerCount: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DPGetPlayerCount with Double = js.native
  /* 1616 */ val DPGetPlayerCountResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DPGetPlayerCountResponse with Double = js.native
  /* 1608 */ val DPNatTraversalStats: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DPNatTraversalStats with Double = js.native
  /* 1628 */ val DPPartnerMicroTxns: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DPPartnerMicroTxns with Double = js.native
  /* 1629 */ val DPPartnerMicroTxnsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DPPartnerMicroTxnsResponse with Double = js.native
  /* 1601 */ val DPSetPublishingState: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DPSetPublishingState with Double = js.native
  /* 1609 */ val DPSteamUsageEvent: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DPSteamUsageEvent with Double = js.native
  /* 1624 */ val DPStoreSaleStatistics: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DPStoreSaleStatistics with Double = js.native
  /* 1604 */ val DPStreamingUniquePlayersStat: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DPStreamingUniquePlayersStat with Double = js.native
  /* 1603 */ val DPUniquePlayersStat: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DPUniquePlayersStat with Double = js.native
  /* 1626 */ val DPUpdateContentEvent: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DPUpdateContentEvent with Double = js.native
  /* 1631 */ val DPVRUniquePlayersStat: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DPVRUniquePlayersStat with Double = js.native
  /* 1606 */ val DPVacBanStats: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DPVacBanStats with Double = js.native
  /* 1611 */ val DPVacCafeBanStats: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DPVacCafeBanStats with Double = js.native
  /* 1610 */ val DPVacCertBanStats: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DPVacCertBanStats with Double = js.native
  /* 1605 */ val DPVacInfractionStats: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DPVacInfractionStats with Double = js.native
  /* 640 */ val DRMAdminUpdate: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMAdminUpdate with Double = js.native
  /* 641 */ val DRMAdminUpdateResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMAdminUpdateResponse with Double = js.native
  /* 628 */ val DRMBuildBlobRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMBuildBlobRequest with Double = js.native
  /* 629 */ val DRMBuildBlobResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMBuildBlobResponse with Double = js.native
  /* 637 */ val DRMDetailsReportRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMDetailsReportRequest with Double = js.native
  /* 638 */ val DRMDetailsReportResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMDetailsReportResponse with Double = js.native
  /* 645 */ val DRMEmptyGuidCache: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMEmptyGuidCache with Double = js.native
  /* 646 */ val DRMEmptyGuidCacheResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMEmptyGuidCacheResponse with Double = js.native
  /* 639 */ val DRMProcessFile: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMProcessFile with Double = js.native
  /* 644 */ val DRMProcessFileResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMProcessFileResponse with Double = js.native
  /* 7600 */ val DRMRange2: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMRange2 with Double = js.native
  /* 630 */ val DRMResolveGuidRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMResolveGuidRequest with Double = js.native
  /* 631 */ val DRMResolveGuidResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMResolveGuidResponse with Double = js.native
  /* 7606 */ val DRMSFetchVersionSet: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMSFetchVersionSet with Double = js.native
  /* 7607 */ val DRMSFetchVersionSetResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMSFetchVersionSetResponse with Double = js.native
  /* 635 */ val DRMStabilityReport: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMStabilityReport with Double = js.native
  /* 636 */ val DRMStabilityReportResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMStabilityReportResponse with Double = js.native
  /* 642 */ val DRMSync: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMSync with Double = js.native
  /* 643 */ val DRMSyncResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMSyncResponse with Double = js.native
  /* 633 */ val DRMVariabilityReport: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMVariabilityReport with Double = js.native
  /* 634 */ val DRMVariabilityReportResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMVariabilityReportResponse with Double = js.native
  /* 9100 */ val DRMWorkerProcess: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcess with Double = js.native
  /* 9128 */ val DRMWorkerProcessAnalyzeFileRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessAnalyzeFileRequest with Double = js.native
  /* 9129 */ val DRMWorkerProcessAnalyzeFileResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessAnalyzeFileResponse with Double = js.native
  /* 9116 */ val DRMWorkerProcessBackfillOriginalRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessBackfillOriginalRequest with Double = js.native
  /* 9117 */ val DRMWorkerProcessBackfillOriginalResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessBackfillOriginalResponse with Double = js.native
  /* 9100 */ val DRMWorkerProcessDRMAndSign: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessDRMAndSign with Double = js.native
  /* 9101 */ val DRMWorkerProcessDRMAndSignResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessDRMAndSignResponse with Double = js.native
  /* 9114 */ val DRMWorkerProcessDescribeSecretRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessDescribeSecretRequest with Double = js.native
  /* 9115 */ val DRMWorkerProcessDescribeSecretResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessDescribeSecretResponse with Double = js.native
  /* 9126 */ val DRMWorkerProcessEvaluateCrashRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessEvaluateCrashRequest with Double = js.native
  /* 9127 */ val DRMWorkerProcessEvaluateCrashResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessEvaluateCrashResponse with Double = js.native
  /* 9112 */ val DRMWorkerProcessExamineBlobRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessExamineBlobRequest with Double = js.native
  /* 9113 */ val DRMWorkerProcessExamineBlobResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessExamineBlobResponse with Double = js.native
  /* 9124 */ val DRMWorkerProcessGetBlobRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessGetBlobRequest with Double = js.native
  /* 9125 */ val DRMWorkerProcessGetBlobResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessGetBlobResponse with Double = js.native
  /* 9108 */ val DRMWorkerProcessGetDRMGuidsFromFileRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessGetDRMGuidsFromFileRequest with Double = js.native
  /* 9109 */ val DRMWorkerProcessGetDRMGuidsFromFileResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessGetDRMGuidsFromFileResponse with Double = js.native
  /* 9132 */ val DRMWorkerProcessInstallAllRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessInstallAllRequest with Double = js.native
  /* 9133 */ val DRMWorkerProcessInstallAllResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessInstallAllResponse with Double = js.native
  /* 9104 */ val DRMWorkerProcessInstallDRMDLLRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessInstallDRMDLLRequest with Double = js.native
  /* 9105 */ val DRMWorkerProcessInstallDRMDLLResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessInstallDRMDLLResponse with Double = js.native
  /* 9110 */ val DRMWorkerProcessInstallProcessedFilesRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessInstallProcessedFilesRequest with Double = js.native
  /* 9111 */ val DRMWorkerProcessInstallProcessedFilesResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessInstallProcessedFilesResponse with Double = js.native
  /* 9106 */ val DRMWorkerProcessSecretIdStringRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessSecretIdStringRequest with Double = js.native
  /* 9107 */ val DRMWorkerProcessSecretIdStringResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessSecretIdStringResponse with Double = js.native
  /* 9122 */ val DRMWorkerProcessSplitAndInstallRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessSplitAndInstallRequest with Double = js.native
  /* 9123 */ val DRMWorkerProcessSplitAndInstallResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessSplitAndInstallResponse with Double = js.native
  /* 9102 */ val DRMWorkerProcessSteamworksInfoRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessSteamworksInfoRequest with Double = js.native
  /* 9103 */ val DRMWorkerProcessSteamworksInfoResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessSteamworksInfoResponse with Double = js.native
  /* 9130 */ val DRMWorkerProcessUnpackBlobRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessUnpackBlobRequest with Double = js.native
  /* 9131 */ val DRMWorkerProcessUnpackBlobResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessUnpackBlobResponse with Double = js.native
  /* 9118 */ val DRMWorkerProcessValidateDRMDLLRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessValidateDRMDLLRequest with Double = js.native
  /* 9119 */ val DRMWorkerProcessValidateDRMDLLResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessValidateDRMDLLResponse with Double = js.native
  /* 9120 */ val DRMWorkerProcessValidateFileRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessValidateFileRequest with Double = js.native
  /* 9121 */ val DRMWorkerProcessValidateFileResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DRMWorkerProcessValidateFileResponse with Double = js.native
  /* 1802 */ val DSSCurrentFileList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DSSCurrentFileList with Double = js.native
  /* 1801 */ val DSSNewFile: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DSSNewFile with Double = js.native
  /* 1803 */ val DSSSynchList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DSSSynchList with Double = js.native
  /* 1804 */ val DSSSynchListResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DSSSynchListResponse with Double = js.native
  /* 1805 */ val DSSSynchSubscribe: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DSSSynchSubscribe with Double = js.native
  /* 1806 */ val DSSSynchUnsubscribe: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DSSSynchUnsubscribe with Double = js.native
  /* 113 */ val DestJobFailed: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DestJobFailed with Double = js.native
  /* 6500 */ val DeviceAuthorizationBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DeviceAuthorizationBase with Double = js.native
  /* 202 */ val DirRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DirRequest with Double = js.native
  /* 203 */ val DirResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.DirResponse with Double = js.native
  /* 1903 */ val EPMRestartProcess: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.EPMRestartProcess with Double = js.native
  /* 1901 */ val EPMStartProcess: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.EPMStartProcess with Double = js.native
  /* 1902 */ val EPMStopProcess: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.EPMStopProcess with Double = js.native
  /* 7700 */ val EconBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.EconBase with Double = js.native
  /* 7711 */ val EconCDKeyProcessTransaction: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.EconCDKeyProcessTransaction with Double = js.native
  /* 7712 */ val EconCDKeyProcessTransactionResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.EconCDKeyProcessTransactionResponse with Double = js.native
  /* 7707 */ val EconFlushInventoryCache: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.EconFlushInventoryCache with Double = js.native
  /* 7708 */ val EconFlushInventoryCacheResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.EconFlushInventoryCacheResponse with Double = js.native
  /* 7713 */ val EconGetErrorLogs: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.EconGetErrorLogs with Double = js.native
  /* 7714 */ val EconGetErrorLogsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.EconGetErrorLogsResponse with Double = js.native
  /* 7706 */ val EconTrading_CancelTradeRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.EconTrading_CancelTradeRequest with Double = js.native
  /* 7702 */ val EconTrading_InitiateTradeProposed: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.EconTrading_InitiateTradeProposed with Double = js.native
  /* 7701 */ val EconTrading_InitiateTradeRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.EconTrading_InitiateTradeRequest with Double = js.native
  /* 7703 */ val EconTrading_InitiateTradeResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.EconTrading_InitiateTradeResponse with Double = js.native
  /* 7704 */ val EconTrading_InitiateTradeResult: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.EconTrading_InitiateTradeResult with Double = js.native
  /* 7705 */ val EconTrading_StartSession: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.EconTrading_StartSession with Double = js.native
  /* 201 */ val Exit: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.Exit with Double = js.native
  /* 308 */ val ExitShell: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ExitShell with Double = js.native
  /* 307 */ val ExitShells: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ExitShells with Double = js.native
  /* 1119 */ val FBSApplyAccountCred: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSApplyAccountCred with Double = js.native
  /* 1120 */ val FBSApplyAccountCredResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSApplyAccountCredResponse with Double = js.native
  /* 1108 */ val FBSApplyOSUpdates: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSApplyOSUpdates with Double = js.native
  /* 1130 */ val FBSBootstrapperGetPackageChunk: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSBootstrapperGetPackageChunk with Double = js.native
  /* 1131 */ val FBSBootstrapperGetPackageChunkResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSBootstrapperGetPackageChunkResponse with Double = js.native
  /* 1128 */ val FBSBootstrapperPackageRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSBootstrapperPackageRequest with Double = js.native
  /* 1129 */ val FBSBootstrapperPackageResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSBootstrapperPackageResponse with Double = js.native
  /* 1132 */ val FBSBootstrapperPackageTransferProgress: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSBootstrapperPackageTransferProgress with Double = js.native
  /* 1027 */ val FBSConnectionData: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSConnectionData with Double = js.native
  /* 1114 */ val FBSDeployHotFixPackage: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSDeployHotFixPackage with Double = js.native
  /* 1115 */ val FBSDeployHotFixResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSDeployHotFixResponse with Double = js.native
  /* 1104 */ val FBSDeployPackage: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSDeployPackage with Double = js.native
  /* 1105 */ val FBSDeployResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSDeployResponse with Double = js.native
  /* 1116 */ val FBSDownloadHotFix: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSDownloadHotFix with Double = js.native
  /* 1117 */ val FBSDownloadHotFixResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSDownloadHotFixResponse with Double = js.native
  /* 1103 */ val FBSForceBounce: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSForceBounce with Double = js.native
  /* 1102 */ val FBSForceRefresh: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSForceRefresh with Double = js.native
  /* 1126 */ val FBSInfoFromBootstrapper: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSInfoFromBootstrapper with Double = js.native
  /* 1112 */ val FBSMinidumpServer: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSMinidumpServer with Double = js.native
  /* 1123 */ val FBSQueryGMForRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSQueryGMForRequest with Double = js.native
  /* 1124 */ val FBSQueryGMResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSQueryGMResponse with Double = js.native
  /* 1110 */ val FBSRebootBox: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSRebootBox with Double = js.native
  /* 1127 */ val FBSRebootBoxResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSRebootBoxResponse with Double = js.native
  /* 1100 */ val FBSReqVersion: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSReqVersion with Double = js.native
  /* 1133 */ val FBSRestartBootstrapper: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSRestartBootstrapper with Double = js.native
  /* 1109 */ val FBSRunCMDScript: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSRunCMDScript with Double = js.native
  /* 1111 */ val FBSSetBigBrotherMode: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSSetBigBrotherMode with Double = js.native
  /* 1121 */ val FBSSetShellCount: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSSetShellCount with Double = js.native
  /* 1113 */ val FBSSetShellCount_obsolete: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSSetShellCount_obsolete with Double = js.native
  /* 1107 */ val FBSSetState: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSSetState with Double = js.native
  /* 1122 */ val FBSTerminateShell: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSTerminateShell with Double = js.native
  /* 1125 */ val FBSTerminateZombies: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSTerminateZombies with Double = js.native
  /* 1106 */ val FBSUpdateBootstrapper: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSUpdateBootstrapper with Double = js.native
  /* 1118 */ val FBSUpdateTargetConfigFile: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSUpdateTargetConfigFile with Double = js.native
  /* 1101 */ val FBSVersionInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FBSVersionInfo with Double = js.native
  /* 7510 */ val FSAddOrRemoveFollower: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FSAddOrRemoveFollower with Double = js.native
  /* 7511 */ val FSAddOrRemoveFollowerResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FSAddOrRemoveFollowerResponse with Double = js.native
  /* 7500 */ val FSBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FSBase with Double = js.native
  /* 7513 */ val FSCommentNotification: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FSCommentNotification with Double = js.native
  /* 7514 */ val FSCommentNotificationViewed: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FSCommentNotificationViewed with Double = js.native
  /* 7506 */ val FSComputeFrenematrix: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FSComputeFrenematrix with Double = js.native
  /* 7507 */ val FSComputeFrenematrixResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FSComputeFrenematrixResponse with Double = js.native
  /* 7521 */ val FSGetPendingNotificationCount: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FSGetPendingNotificationCount with Double = js.native
  /* 7522 */ val FSGetPendingNotificationCountResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FSGetPendingNotificationCountResponse with Double = js.native
  /* 7508 */ val FSPlayStatusNotification: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FSPlayStatusNotification with Double = js.native
  /* 7509 */ val FSPublishPersonaStatus: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FSPublishPersonaStatus with Double = js.native
  /* 7530 */ val FSRequestFriendData: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FSRequestFriendData with Double = js.native
  /* 7504 */ val FSRichPresenceRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FSRichPresenceRequest with Double = js.native
  /* 7505 */ val FSRichPresenceResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FSRichPresenceResponse with Double = js.native
  /* 7512 */ val FSUpdateFollowingList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FSUpdateFollowingList with Double = js.native
  /* 3103 */ val FTSBrowseClans: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FTSBrowseClans with Double = js.native
  /* 3104 */ val FTSBrowseClansResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FTSBrowseClansResponse with Double = js.native
  /* 3109 */ val FTSClanDeleted: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FTSClanDeleted with Double = js.native
  /* 3101 */ val FTSGetBrowseCounts: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FTSGetBrowseCounts with Double = js.native
  /* 3102 */ val FTSGetBrowseCountsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FTSGetBrowseCountsResponse with Double = js.native
  /* 3114 */ val FTSGetGSPlayStats: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FTSGetGSPlayStats with Double = js.native
  /* 3116 */ val FTSGetGSPlayStatsForServer: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FTSGetGSPlayStatsForServer with Double = js.native
  /* 3117 */ val FTSGetGSPlayStatsForServerResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FTSGetGSPlayStatsForServerResponse with Double = js.native
  /* 3115 */ val FTSGetGSPlayStatsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FTSGetGSPlayStatsResponse with Double = js.native
  /* 3118 */ val FTSReportIPUpdates: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FTSReportIPUpdates with Double = js.native
  /* 3110 */ val FTSSearch: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FTSSearch with Double = js.native
  /* 3105 */ val FTSSearchClansByLocation: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FTSSearchClansByLocation with Double = js.native
  /* 3106 */ val FTSSearchClansByLocationResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FTSSearchClansByLocationResponse with Double = js.native
  /* 3107 */ val FTSSearchPlayersByLocation: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FTSSearchPlayersByLocation with Double = js.native
  /* 3108 */ val FTSSearchPlayersByLocationResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FTSSearchPlayersByLocationResponse with Double = js.native
  /* 3111 */ val FTSSearchResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FTSSearchResponse with Double = js.native
  /* 3112 */ val FTSSearchStatus: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FTSSearchStatus with Double = js.native
  /* 3113 */ val FTSSearchStatusResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FTSSearchStatusResponse with Double = js.native
  /* 3000 */ val FailServer: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FailServer with Double = js.native
  /* 1202 */ val FileXferData: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FileXferData with Double = js.native
  /* 1204 */ val FileXferDataAck: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FileXferDataAck with Double = js.native
  /* 1203 */ val FileXferEnd: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FileXferEnd with Double = js.native
  /* 1200 */ val FileXferRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FileXferRequest with Double = js.native
  /* 1201 */ val FileXferResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.FileXferResponse with Double = js.native
  /* 2212 */ val GCAchievementAwarded: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCAchievementAwarded with Double = js.native
  /* 2204 */ val GCCmdBounce: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCCmdBounce with Double = js.native
  /* 2207 */ val GCCmdDeploy: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCCmdDeploy with Double = js.native
  /* 2208 */ val GCCmdDeployResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCCmdDeployResponse with Double = js.native
  /* 2206 */ val GCCmdDown: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCCmdDown with Double = js.native
  /* 2205 */ val GCCmdForceBounce: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCCmdForceBounce with Double = js.native
  /* 2203 */ val GCCmdRevive: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCCmdRevive with Double = js.native
  /* 2216 */ val GCCmdStatus: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCCmdStatus with Double = js.native
  /* 2209 */ val GCCmdSwitch: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCCmdSwitch with Double = js.native
  /* 2218 */ val GCGetAccountDetails: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCGetAccountDetails with Double = js.native
  /* 2218 */ val GCGetAccountDetails_DEPRECATED: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCGetAccountDetails_DEPRECATED with Double = js.native
  /* 2220 */ val GCGetEmailTemplate: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCGetEmailTemplate with Double = js.native
  /* 2221 */ val GCGetEmailTemplateResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCGetEmailTemplateResponse with Double = js.native
  /* 2234 */ val GCHAccountLockStatusChange: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCHAccountLockStatusChange with Double = js.native
  /* 2236 */ val GCHAccountPhoneNumberChange: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCHAccountPhoneNumberChange with Double = js.native
  /* 2233 */ val GCHAccountTradeBanStatusChange: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCHAccountTradeBanStatusChange with Double = js.native
  /* 2237 */ val GCHAccountTwoFactorChange: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCHAccountTwoFactorChange with Double = js.native
  /* 2228 */ val GCHAccountVacStatusChange: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCHAccountVacStatusChange with Double = js.native
  /* 2231 */ val GCHKillGC: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCHKillGC with Double = js.native
  /* 2232 */ val GCHKillGCResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCHKillGCResponse with Double = js.native
  /* 2222 */ val GCHRelay: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCHRelay with Double = js.native
  /* 2223 */ val GCHRelayClientToIS: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCHRelayClientToIS with Double = js.native
  /* 2223 */ val GCHRelayToClient: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCHRelayToClient with Double = js.native
  /* 2226 */ val GCHRequestStatus: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCHRequestStatus with Double = js.native
  /* 2227 */ val GCHRequestStatusResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCHRequestStatusResponse with Double = js.native
  /* 2225 */ val GCHRequestUpdateSession: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCHRequestUpdateSession with Double = js.native
  /* 2229 */ val GCHSpawnGC: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCHSpawnGC with Double = js.native
  /* 2230 */ val GCHSpawnGCResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCHSpawnGCResponse with Double = js.native
  /* 2224 */ val GCHUpdateSession: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCHUpdateSession with Double = js.native
  /* 2235 */ val GCHVacVerificationChange: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCHVacVerificationChange with Double = js.native
  /* 2219 */ val GCInterAppMessage: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCInterAppMessage with Double = js.native
  /* 2217 */ val GCRegisterWebInterfaces: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCRegisterWebInterfaces with Double = js.native
  /* 2217 */ val GCRegisterWebInterfaces_Deprecated: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCRegisterWebInterfaces_Deprecated with Double = js.native
  /* 2200 */ val GCSendClient: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCSendClient with Double = js.native
  /* 2213 */ val GCSystemMessage: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCSystemMessage with Double = js.native
  /* 2211 */ val GCUpdateGSState: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCUpdateGSState with Double = js.native
  /* 2202 */ val GCUpdatePlayedState: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCUpdatePlayedState with Double = js.native
  /* 2214 */ val GCValidateSession: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCValidateSession with Double = js.native
  /* 2215 */ val GCValidateSessionResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GCValidateSessionResponse with Double = js.native
  /* 333 */ val GMConvertUserWallets: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GMConvertUserWallets with Double = js.native
  /* 320 */ val GMDRMSync: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GMDRMSync with Double = js.native
  /* 331 */ val GMGetServiceMethodRouting: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GMGetServiceMethodRouting with Double = js.native
  /* 332 */ val GMGetServiceMethodRoutingResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GMGetServiceMethodRoutingResponse with Double = js.native
  /* 325 */ val GMLoadActivationCodes: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GMLoadActivationCodes with Double = js.native
  /* 326 */ val GMQueueForFBS: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GMQueueForFBS with Double = js.native
  /* 319 */ val GMReportPHPError: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GMReportPHPError with Double = js.native
  /* 6400 */ val GMSBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GMSBase with Double = js.native
  /* 6404 */ val GMSClientServerQueryResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GMSClientServerQueryResponse with Double = js.native
  /* 6401 */ val GMSGameServerReplicate: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GMSGameServerReplicate with Double = js.native
  /* 327 */ val GMSchemaConversionResults: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GMSchemaConversionResults with Double = js.native
  /* 328 */ val GMSchemaConversionResultsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GMSchemaConversionResultsResponse with Double = js.native
  /* 324 */ val GMWriteConfigToSQL: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GMWriteConfigToSQL with Double = js.native
  /* 329 */ val GMWriteShellFailureToSQL: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GMWriteShellFailureToSQL with Double = js.native
  /* 330 */ val GMWriteStatsToSOS: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GMWriteStatsToSOS with Double = js.native
  /* 758 */ val GSApprove: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GSApprove with Double = js.native
  /* 938 */ val GSAssociateWithClan: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GSAssociateWithClan with Double = js.native
  /* 939 */ val GSAssociateWithClanResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GSAssociateWithClanResponse with Double = js.native
  /* 940 */ val GSComputeNewPlayerCompatibility: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GSComputeNewPlayerCompatibility with Double = js.native
  /* 941 */ val GSComputeNewPlayerCompatibilityResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GSComputeNewPlayerCompatibilityResponse with Double = js.native
  /* 759 */ val GSDeny: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GSDeny with Double = js.native
  /* 901 */ val GSDisconnectNotice: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GSDisconnectNotice with Double = js.native
  /* 918 */ val GSGetPlayStats: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GSGetPlayStats with Double = js.native
  /* 919 */ val GSGetPlayStatsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GSGetPlayStatsResponse with Double = js.native
  /* 936 */ val GSGetReputation: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GSGetReputation with Double = js.native
  /* 937 */ val GSGetReputationResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GSGetReputationResponse with Double = js.native
  /* 910 */ val GSGetUserAchievementStatus: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GSGetUserAchievementStatus with Double = js.native
  /* 911 */ val GSGetUserAchievementStatusResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GSGetUserAchievementStatusResponse with Double = js.native
  /* 920 */ val GSGetUserGroupStatus: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GSGetUserGroupStatus with Double = js.native
  /* 923 */ val GSGetUserGroupStatusResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GSGetUserGroupStatusResponse with Double = js.native
  /* 760 */ val GSKick: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GSKick with Double = js.native
  /* 5440 */ val GSPerformHardwareSurvey: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GSPerformHardwareSurvey with Double = js.native
  /* 909 */ val GSPlayerList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GSPlayerList with Double = js.native
  /* 908 */ val GSServerType: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GSServerType with Double = js.native
  /* 903 */ val GSStatus: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GSStatus with Double = js.native
  /* 906 */ val GSStatus2: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GSStatus2 with Double = js.native
  /* 774 */ val GSStatusReply: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GSStatusReply with Double = js.native
  /* 907 */ val GSStatusUpdate_Unused: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GSStatusUpdate_Unused with Double = js.native
  /* 905 */ val GSUserPlaying: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GSUserPlaying with Double = js.native
  /* 6407 */ val GameServerOutOfDate: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GameServerOutOfDate with Double = js.native
  /* 100 */ val GenericReply: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GenericReply with Double = js.native
  /* 4393 */ val GetUserIPCountry: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GetUserIPCountry with Double = js.native
  /* 4394 */ val GetUserIPCountryResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GetUserIPCountryResponse with Double = js.native
  /* 309 */ val GracefulExitShell: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.GracefulExitShell with Double = js.native
  /* 300 */ val Heartbeat: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.Heartbeat with Double = js.native
  /* 124 */ val HubConnect: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.HubConnect with Double = js.native
  /* 2222 */ val ISRelayToGCH: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ISRelayToGCH with Double = js.native
  /* 0 */ val Invalid: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.Invalid with Double = js.native
  /* 145 */ val InvalidateDBOCacheItems: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.InvalidateDBOCacheItems with Double = js.native
  /* 123 */ val JobHeartbeat: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.JobHeartbeat with Double = js.native
  /* 3001 */ val JobHeartbeatTest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.JobHeartbeatTest with Double = js.native
  /* 3002 */ val JobHeartbeatTestResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.JobHeartbeatTestResponse with Double = js.native
  /* 7201 */ val KGSAllocateKeyRange: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.KGSAllocateKeyRange with Double = js.native
  /* 7202 */ val KGSAllocateKeyRangeResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.KGSAllocateKeyRangeResponse with Double = js.native
  /* 7200 */ val KGSBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.KGSBase with Double = js.native
  /* 7207 */ val KGSGenerateGameStopWCKeys: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.KGSGenerateGameStopWCKeys with Double = js.native
  /* 7208 */ val KGSGenerateGameStopWCKeysResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.KGSGenerateGameStopWCKeysResponse with Double = js.native
  /* 7203 */ val KGSGenerateKeys: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.KGSGenerateKeys with Double = js.native
  /* 7204 */ val KGSGenerateKeysResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.KGSGenerateKeysResponse with Double = js.native
  /* 7205 */ val KGSRemapKeys: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.KGSRemapKeys with Double = js.native
  /* 7206 */ val KGSRemapKeysResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.KGSRemapKeysResponse with Double = js.native
  /* 132 */ val KeepAlive: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.KeepAlive with Double = js.native
  /* 3210 */ val LBSDeleteLB: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.LBSDeleteLB with Double = js.native
  /* 3211 */ val LBSDeleteLBEntry: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.LBSDeleteLBEntry with Double = js.native
  /* 3214 */ val LBSDeleteLBResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.LBSDeleteLBResponse with Double = js.native
  /* 3203 */ val LBSFindOrCreateLB: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.LBSFindOrCreateLB with Double = js.native
  /* 3204 */ val LBSFindOrCreateLBResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.LBSFindOrCreateLBResponse with Double = js.native
  /* 3205 */ val LBSGetLBEntries: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.LBSGetLBEntries with Double = js.native
  /* 3206 */ val LBSGetLBEntriesResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.LBSGetLBEntriesResponse with Double = js.native
  /* 3207 */ val LBSGetLBList: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.LBSGetLBList with Double = js.native
  /* 3208 */ val LBSGetLBListResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.LBSGetLBListResponse with Double = js.native
  /* 3212 */ val LBSResetLB: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.LBSResetLB with Double = js.native
  /* 3213 */ val LBSResetLBResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.LBSResetLBResponse with Double = js.native
  /* 3209 */ val LBSSetLBDetails: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.LBSSetLBDetails with Double = js.native
  /* 3201 */ val LBSSetScore: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.LBSSetScore with Double = js.native
  /* 3202 */ val LBSSetScoreResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.LBSSetScoreResponse with Double = js.native
  /* 316 */ val LicenseProcessingComplete: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.LicenseProcessingComplete with Double = js.native
  /* 143 */ val LoadDBOCacheItem: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.LoadDBOCacheItem with Double = js.native
  /* 144 */ val LoadDBOCacheItemResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.LoadDBOCacheItemResponse with Double = js.native
  /* 1009 */ val LogSearchCancel: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.LogSearchCancel with Double = js.native
  /* 1007 */ val LogSearchRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.LogSearchRequest with Double = js.native
  /* 1008 */ val LogSearchResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.LogSearchResponse with Double = js.native
  /* 8800 */ val LogsinkBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.LogsinkBase with Double = js.native
  /* 8800 */ val LogsinkWriteReport: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.LogsinkWriteReport with Double = js.native
  /* 5828 */ val MDSContentServerConfig: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.MDSContentServerConfig with Double = js.native
  /* 5827 */ val MDSContentServerConfigRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.MDSContentServerConfigRequest with Double = js.native
  /* 5826 */ val MDSContentServerStatsBroadcast: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.MDSContentServerStatsBroadcast with Double = js.native
  /* 5825 */ val MDSDownloadDepotChunksAck: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.MDSDownloadDepotChunksAck with Double = js.native
  /* 5832 */ val MDSGetDepotChunk: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.MDSGetDepotChunk with Double = js.native
  /* 5834 */ val MDSGetDepotChunkChunk: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.MDSGetDepotChunkChunk with Double = js.native
  /* 5833 */ val MDSGetDepotChunkResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.MDSGetDepotChunkResponse with Double = js.native
  /* 5829 */ val MDSGetDepotManifest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.MDSGetDepotManifest with Double = js.native
  /* 5831 */ val MDSGetDepotManifestChunk: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.MDSGetDepotManifestChunk with Double = js.native
  /* 5830 */ val MDSGetDepotManifestResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.MDSGetDepotManifestResponse with Double = js.native
  /* 5836 */ val MDSGetServerListForUser: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.MDSGetServerListForUser with Double = js.native
  /* 5837 */ val MDSGetServerListForUserResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.MDSGetServerListForUserResponse with Double = js.native
  /* 5814 */ val MDSGetVersionsForDepot: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.MDSGetVersionsForDepot with Double = js.native
  /* 5815 */ val MDSGetVersionsForDepotResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.MDSGetVersionsForDepotResponse with Double = js.native
  /* 5847 */ val MDSMigrateChunk: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.MDSMigrateChunk with Double = js.native
  /* 5848 */ val MDSMigrateChunkResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.MDSMigrateChunkResponse with Double = js.native
  /* 5816 */ val MDSSetPublicVersionForDepot: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.MDSSetPublicVersionForDepot with Double = js.native
  /* 5817 */ val MDSSetPublicVersionForDepotResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.MDSSetPublicVersionForDepotResponse with Double = js.native
  /* 5813 */ val MDSToAMGetDepotDecryptionKeyResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.MDSToAMGetDepotDecryptionKeyResponse with Double = js.native
  /* 5844 */ val MDSToCSFlushChunk: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.MDSToCSFlushChunk with Double = js.native
  /* 5835 */ val MDSUpdateContentServerConfig: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.MDSUpdateContentServerConfig with Double = js.native
  /* 6600 */ val MMSBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.MMSBase with Double = js.native
  /* 7100 */ val MPASBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.MPASBase with Double = js.native
  /* 7101 */ val MPASVacBanReset: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.MPASVacBanReset with Double = js.native
  /* 4216 */ val MarketingMessageUpdate: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.MarketingMessageUpdate with Double = js.native
  /* 1 */ val Multi: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.Multi with Double = js.native
  /* 6800 */ val NonStdMsgBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.NonStdMsgBase with Double = js.native
  /* 6806 */ val NonStdMsgChase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.NonStdMsgChase with Double = js.native
  /* 6807 */ val NonStdMsgDFSTransfer: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.NonStdMsgDFSTransfer with Double = js.native
  /* 6803 */ val NonStdMsgHTTPClient: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.NonStdMsgHTTPClient with Double = js.native
  /* 6802 */ val NonStdMsgHTTPServer: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.NonStdMsgHTTPServer with Double = js.native
  /* 6811 */ val NonStdMsgLogsink: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.NonStdMsgLogsink with Double = js.native
  /* 6801 */ val NonStdMsgMemcached: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.NonStdMsgMemcached with Double = js.native
  /* 6805 */ val NonStdMsgPHPSimulator: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.NonStdMsgPHPSimulator with Double = js.native
  /* 6813 */ val NonStdMsgRTMPServer: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.NonStdMsgRTMPServer with Double = js.native
  /* 6812 */ val NonStdMsgSteam2Emulator: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.NonStdMsgSteam2Emulator with Double = js.native
  /* 6810 */ val NonStdMsgSyslog: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.NonStdMsgSyslog with Double = js.native
  /* 6808 */ val NonStdMsgTests: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.NonStdMsgTests with Double = js.native
  /* 6809 */ val NonStdMsgUMQpipeAAPL: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.NonStdMsgUMQpipeAAPL with Double = js.native
  /* 6804 */ val NonStdMsgWGResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.NonStdMsgWGResponse with Double = js.native
  /* 4395 */ val NotificationOfSuspiciousActivity: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.NotificationOfSuspiciousActivity with Double = js.native
  /* 314 */ val NotifyWatchdog: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.NotifyWatchdog with Double = js.native
  /* 3401 */ val OGSBeginSession: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.OGSBeginSession with Double = js.native
  /* 3402 */ val OGSBeginSessionResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.OGSBeginSessionResponse with Double = js.native
  /* 3403 */ val OGSEndSession: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.OGSEndSession with Double = js.native
  /* 3404 */ val OGSEndSessionResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.OGSEndSessionResponse with Double = js.native
  /* 3406 */ val OGSWriteAppSessionRow: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.OGSWriteAppSessionRow with Double = js.native
  /* 2502 */ val P2PIntroducerMessage: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.P2PIntroducerMessage with Double = js.native
  /* 8900 */ val PICSBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.PICSBase with Double = js.native
  /* 5005 */ val PSAddPackageToShoppingCart: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.PSAddPackageToShoppingCart with Double = js.native
  /* 5006 */ val PSAddPackageToShoppingCartResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.PSAddPackageToShoppingCartResponse with Double = js.native
  /* 5011 */ val PSAddWalletCreditToShoppingCart: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.PSAddWalletCreditToShoppingCart with Double = js.native
  /* 5012 */ val PSAddWalletCreditToShoppingCartResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.PSAddWalletCreditToShoppingCartResponse with Double = js.native
  /* 5001 */ val PSCreateShoppingCart: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.PSCreateShoppingCart with Double = js.native
  /* 5002 */ val PSCreateShoppingCartResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.PSCreateShoppingCartResponse with Double = js.native
  /* 5009 */ val PSGetShoppingCartContents: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.PSGetShoppingCartContents with Double = js.native
  /* 5010 */ val PSGetShoppingCartContentsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.PSGetShoppingCartContentsResponse with Double = js.native
  /* 5003 */ val PSIsValidShoppingCart: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.PSIsValidShoppingCart with Double = js.native
  /* 5004 */ val PSIsValidShoppingCartResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.PSIsValidShoppingCartResponse with Double = js.native
  /* 5007 */ val PSRemoveLineItemFromShoppingCart: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.PSRemoveLineItemFromShoppingCart with Double = js.native
  /* 5008 */ val PSRemoveLineItemFromShoppingCartResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.PSRemoveLineItemFromShoppingCartResponse with Double = js.native
  /* 321 */ val PhysicalBoxInventory: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.PhysicalBoxInventory with Double = js.native
  /* 139 */ val Ping: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.Ping with Double = js.native
  /* 140 */ val PingResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.PingResponse with Double = js.native
  /* 226 */ val PrepareToExit: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.PrepareToExit with Double = js.native
  /* 2 */ val ProtobufWrapped: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ProtobufWrapped with Double = js.native
  /* 234 */ val ProvideWindowsEventLogEntries: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ProvideWindowsEventLogEntries with Double = js.native
  /* 9300 */ val QuestServerBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.QuestServerBase with Double = js.native
  /* 318 */ val QueuedEmailsComplete: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.QueuedEmailsComplete with Double = js.native
  /* 7803 */ val RMDeleteMemcachedKeys: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.RMDeleteMemcachedKeys with Double = js.native
  /* 7806 */ val RMMsgTraceAddTrigger: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.RMMsgTraceAddTrigger with Double = js.native
  /* 7808 */ val RMMsgTraceEvent: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.RMMsgTraceEvent with Double = js.native
  /* 7807 */ val RMMsgTraceRemoveTrigger: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.RMMsgTraceRemoveTrigger with Double = js.native
  /* 7800 */ val RMRange: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.RMRange with Double = js.native
  /* 7804 */ val RMRemoteInvoke: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.RMRemoteInvoke with Double = js.native
  /* 7800 */ val RMTestVerisignOTP: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.RMTestVerisignOTP with Double = js.native
  /* 7801 */ val RMTestVerisignOTPResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.RMTestVerisignOTPResponse with Double = js.native
  /* 9509 */ val RemoteClientAcceptEULA: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.RemoteClientAcceptEULA with Double = js.native
  /* 9502 */ val RemoteClientAppStatus: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.RemoteClientAppStatus with Double = js.native
  /* 9500 */ val RemoteClientAuth: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.RemoteClientAuth with Double = js.native
  /* 9501 */ val RemoteClientAuthResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.RemoteClientAuthResponse with Double = js.native
  /* 9500 */ val RemoteClientBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.RemoteClientBase with Double = js.native
  /* 9510 */ val RemoteClientGetControllerConfig: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.RemoteClientGetControllerConfig with Double = js.native
  /* 9511 */ val RemoteClientGetControllerConfigResposne: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.RemoteClientGetControllerConfigResposne with Double = js.native
  /* 9505 */ val RemoteClientPing: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.RemoteClientPing with Double = js.native
  /* 9506 */ val RemoteClientPingResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.RemoteClientPingResponse with Double = js.native
  /* 9503 */ val RemoteClientStartStream: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.RemoteClientStartStream with Double = js.native
  /* 9504 */ val RemoteClientStartStreamResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.RemoteClientStartStreamResponse with Double = js.native
  /* 9512 */ val RemoteClientStreamingEnabled: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.RemoteClientStreamingEnabled with Double = js.native
  /* 128 */ val RemoteSysID: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.RemoteSysID with Double = js.native
  /* 600 */ val ReqChallenge: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ReqChallenge with Double = js.native
  /* 602 */ val ReqChallengeTest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ReqChallengeTest with Double = js.native
  /* 142 */ val RequestFullStatsBlock: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.RequestFullStatsBlock with Double = js.native
  /* 1014 */ val RequestStatHistory: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.RequestStatHistory with Double = js.native
  /* 233 */ val RequestWindowsEventLogEntries: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.RequestWindowsEventLogEntries with Double = js.native
  /* 127 */ val RouteMessage: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.RouteMessage with Double = js.native
  /* 120 */ val SCIDRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.SCIDRequest with Double = js.native
  /* 121 */ val SCIDResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.SCIDResponse with Double = js.native
  /* 9400 */ val SLCBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.SLCBase with Double = js.native
  /* 9407 */ val SLCOwnerLibraryChanged: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.SLCOwnerLibraryChanged with Double = js.native
  /* 9401 */ val SLCRequestUserSessionStatus: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.SLCRequestUserSessionStatus with Double = js.native
  /* 9408 */ val SLCSharedLibraryChanged: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.SLCSharedLibraryChanged with Double = js.native
  /* 9402 */ val SLCSharedLicensesLockStatus: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.SLCSharedLicensesLockStatus with Double = js.native
  /* 9400 */ val SLCUserSessionStatus: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.SLCUserSessionStatus with Double = js.native
  /* 2902 */ val SMExpensiveReport: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.SMExpensiveReport with Double = js.native
  /* 2904 */ val SMFishingReport: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.SMFishingReport with Double = js.native
  /* 2907 */ val SMGetSchemaConversionResults: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.SMGetSchemaConversionResults with Double = js.native
  /* 2908 */ val SMGetSchemaConversionResultsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.SMGetSchemaConversionResultsResponse with Double = js.native
  /* 2903 */ val SMHourlyReport: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.SMHourlyReport with Double = js.native
  /* 2906 */ val SMMonitorSpace: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.SMMonitorSpace with Double = js.native
  /* 2905 */ val SMPartitionRenames: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.SMPartitionRenames with Double = js.native
  /* 8600 */ val SecretsBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.SecretsBase with Double = js.native
  /* 8601 */ val SecretsCredentialPairResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.SecretsCredentialPairResponse with Double = js.native
  /* 8600 */ val SecretsRequestCredentialPair: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.SecretsRequestCredentialPair with Double = js.native
  /* 8602 */ val SecretsRequestServerIdentity: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.SecretsRequestServerIdentity with Double = js.native
  /* 8603 */ val SecretsServerIdentityResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.SecretsServerIdentityResponse with Double = js.native
  /* 8604 */ val SecretsUpdateServerIdentities: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.SecretsUpdateServerIdentities with Double = js.native
  /* 146 */ val ServiceMethod: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ServiceMethod with Double = js.native
  /* 147 */ val ServiceMethodResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ServiceMethodResponse with Double = js.native
  /* 317 */ val SetTestFlag: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.SetTestFlag with Double = js.native
  /* 237 */ val ShellCheckWindowsUpdates: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ShellCheckWindowsUpdates with Double = js.native
  /* 238 */ val ShellCheckWindowsUpdatesResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ShellCheckWindowsUpdatesResponse with Double = js.native
  /* 230 */ val ShellConfigInfoUpdate: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ShellConfigInfoUpdate with Double = js.native
  /* 301 */ val ShellFailed: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ShellFailed with Double = js.native
  /* 239 */ val ShellFlushUserLicenseCache: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ShellFlushUserLicenseCache with Double = js.native
  /* 235 */ val ShellSearchLogs: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ShellSearchLogs with Double = js.native
  /* 236 */ val ShellSearchLogsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ShellSearchLogsResponse with Double = js.native
  /* 1015 */ val StatHistory: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.StatHistory with Double = js.native
  /* 141 */ val Stats: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.Stats with Double = js.native
  /* 138 */ val StatsDeprecated: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.StatsDeprecated with Double = js.native
  /* 8000 */ val StoreBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.StoreBase with Double = js.native
  /* 8000 */ val StoreUpdateRecommendationCount: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.StoreUpdateRecommendationCount with Double = js.native
  /* 126 */ val Subscribe: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.Subscribe with Double = js.native
  /* 323 */ val TestInitDB: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.TestInitDB with Double = js.native
  /* 228 */ val TestResetServer: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.TestResetServer with Double = js.native
  /* 9200 */ val TestWorkerProcess: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.TestWorkerProcess with Double = js.native
  /* 9200 */ val TestWorkerProcessLoadUnloadModuleRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.TestWorkerProcessLoadUnloadModuleRequest with Double = js.native
  /* 9201 */ val TestWorkerProcessLoadUnloadModuleResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.TestWorkerProcessLoadUnloadModuleResponse with Double = js.native
  /* 9202 */ val TestWorkerProcessServiceModuleCallRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.TestWorkerProcessServiceModuleCallRequest with Double = js.native
  /* 9203 */ val TestWorkerProcessServiceModuleCallResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.TestWorkerProcessServiceModuleCallResponse with Double = js.native
  /* 149 */ val TimestampRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.TimestampRequest with Double = js.native
  /* 150 */ val TimestampResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.TimestampResponse with Double = js.native
  /* 7335 */ val UCMAddTaggedScreenshot: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMAddTaggedScreenshot with Double = js.native
  /* 7300 */ val UCMBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMBase with Double = js.native
  /* 7372 */ val UCMDeleteOldScreenshot: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMDeleteOldScreenshot with Double = js.native
  /* 7373 */ val UCMDeleteOldScreenshotResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMDeleteOldScreenshotResponse with Double = js.native
  /* 7374 */ val UCMDeleteOldVideo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMDeleteOldVideo with Double = js.native
  /* 7375 */ val UCMDeleteOldVideoResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMDeleteOldVideoResponse with Double = js.native
  /* 7329 */ val UCMDeletePublishedFile: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMDeletePublishedFile with Double = js.native
  /* 7330 */ val UCMDeletePublishedFileResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMDeletePublishedFileResponse with Double = js.native
  /* 7371 */ val UCMFixStatsPublishedFile: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMFixStatsPublishedFile with Double = js.native
  /* 7362 */ val UCMGetPublishedFilesForUser: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMGetPublishedFilesForUser with Double = js.native
  /* 7363 */ val UCMGetPublishedFilesForUserResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMGetPublishedFilesForUserResponse with Double = js.native
  /* 7369 */ val UCMGetUserSubscribedFiles: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMGetUserSubscribedFiles with Double = js.native
  /* 7370 */ val UCMGetUserSubscribedFilesResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMGetUserSubscribedFilesResponse with Double = js.native
  /* 7351 */ val UCMPublishFile: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMPublishFile with Double = js.native
  /* 7352 */ val UCMPublishFileResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMPublishFileResponse with Double = js.native
  /* 7353 */ val UCMPublishedFileChildAdd: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFileChildAdd with Double = js.native
  /* 7354 */ val UCMPublishedFileChildAddResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFileChildAddResponse with Double = js.native
  /* 7357 */ val UCMPublishedFileChildChangeSortOrder: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFileChildChangeSortOrder with Double = js.native
  /* 7358 */ val UCMPublishedFileChildChangeSortOrderResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFileChildChangeSortOrderResponse with Double = js.native
  /* 7355 */ val UCMPublishedFileChildRemove: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFileChildRemove with Double = js.native
  /* 7356 */ val UCMPublishedFileChildRemoveResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFileChildRemoveResponse with Double = js.native
  /* 7380 */ val UCMPublishedFileContentUpdated: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFileContentUpdated with Double = js.native
  /* 7359 */ val UCMPublishedFileParentChanged: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFileParentChanged with Double = js.native
  /* 7341 */ val UCMPublishedFilePreviewAdd: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFilePreviewAdd with Double = js.native
  /* 7342 */ val UCMPublishedFilePreviewAddResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFilePreviewAddResponse with Double = js.native
  /* 7345 */ val UCMPublishedFilePreviewChangeSortOrder: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFilePreviewChangeSortOrder with Double = js.native
  /* 7346 */ val UCMPublishedFilePreviewChangeSortOrderResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFilePreviewChangeSortOrderResponse with Double = js.native
  /* 7343 */ val UCMPublishedFilePreviewRemove: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFilePreviewRemove with Double = js.native
  /* 7344 */ val UCMPublishedFilePreviewRemoveResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFilePreviewRemoveResponse with Double = js.native
  /* 7339 */ val UCMPublishedFileReported: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFileReported with Double = js.native
  /* 7349 */ val UCMPublishedFileSubscribed: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFileSubscribed with Double = js.native
  /* 7350 */ val UCMPublishedFileUnsubscribed: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFileUnsubscribed with Double = js.native
  /* 7381 */ val UCMPublishedFileUpdated: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMPublishedFileUpdated with Double = js.native
  /* 7337 */ val UCMReloadPublishedFile: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMReloadPublishedFile with Double = js.native
  /* 7338 */ val UCMReloadUserFileListCaches: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMReloadUserFileListCaches with Double = js.native
  /* 7336 */ val UCMRemoveTaggedScreenshot: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMRemoveTaggedScreenshot with Double = js.native
  /* 7307 */ val UCMResetCommunityContent: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMResetCommunityContent with Double = js.native
  /* 7308 */ val UCMResetCommunityContentResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMResetCommunityContentResponse with Double = js.native
  /* 7376 */ val UCMUpdateOldScreenshotPrivacy: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMUpdateOldScreenshotPrivacy with Double = js.native
  /* 7377 */ val UCMUpdateOldScreenshotPrivacyResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMUpdateOldScreenshotPrivacyResponse with Double = js.native
  /* 7327 */ val UCMUpdatePublishedFile: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMUpdatePublishedFile with Double = js.native
  /* 7332 */ val UCMUpdatePublishedFileBan: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMUpdatePublishedFileBan with Double = js.native
  /* 7333 */ val UCMUpdatePublishedFileBanResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMUpdatePublishedFileBanResponse with Double = js.native
  /* 7340 */ val UCMUpdatePublishedFileIncompatibleStatus: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMUpdatePublishedFileIncompatibleStatus with Double = js.native
  /* 7328 */ val UCMUpdatePublishedFileResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMUpdatePublishedFileResponse with Double = js.native
  /* 7331 */ val UCMUpdatePublishedFileStat: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMUpdatePublishedFileStat with Double = js.native
  /* 7334 */ val UCMUpdateTaggedScreenshot: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMUpdateTaggedScreenshot with Double = js.native
  /* 7303 */ val UCMValidateObjectExists: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMValidateObjectExists with Double = js.native
  /* 7304 */ val UCMValidateObjectExistsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UCMValidateObjectExistsResponse with Double = js.native
  /* 7000 */ val UDSBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UDSBase with Double = js.native
  /* 7006 */ val UDSFindSession: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UDSFindSession with Double = js.native
  /* 7007 */ val UDSFindSessionResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UDSFindSessionResponse with Double = js.native
  /* 7006 */ val UDSHasSession: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UDSHasSession with Double = js.native
  /* 7007 */ val UDSHasSessionResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UDSHasSessionResponse with Double = js.native
  /* 7003 */ val UDSRenderUserAuth: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UDSRenderUserAuth with Double = js.native
  /* 7004 */ val UDSRenderUserAuthResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UDSRenderUserAuthResponse with Double = js.native
  /* 5223 */ val UFSDownloadChunk: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSDownloadChunk with Double = js.native
  /* 5246 */ val UFSDownloadChunkRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSDownloadChunkRequest with Double = js.native
  /* 5247 */ val UFSDownloadChunkResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSDownloadChunkResponse with Double = js.native
  /* 5248 */ val UFSDownloadFinishRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSDownloadFinishRequest with Double = js.native
  /* 5249 */ val UFSDownloadFinishResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSDownloadFinishResponse with Double = js.native
  /* 5221 */ val UFSDownloadRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSDownloadRequest with Double = js.native
  /* 5222 */ val UFSDownloadResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSDownloadResponse with Double = js.native
  /* 5244 */ val UFSDownloadStartRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSDownloadStartRequest with Double = js.native
  /* 5245 */ val UFSDownloadStartResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSDownloadStartResponse with Double = js.native
  /* 5250 */ val UFSFlushURLCache: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSFlushURLCache with Double = js.native
  /* 5240 */ val UFSGetUGCURLs: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSGetUGCURLs with Double = js.native
  /* 5241 */ val UFSGetUGCURLsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSGetUGCURLsResponse with Double = js.native
  /* 5242 */ val UFSHttpUploadFileFinishRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSHttpUploadFileFinishRequest with Double = js.native
  /* 5243 */ val UFSHttpUploadFileFinishResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSHttpUploadFileFinishResponse with Double = js.native
  /* 5238 */ val UFSMigrateFile: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSMigrateFile with Double = js.native
  /* 5253 */ val UFSMigrateFileAppID: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSMigrateFileAppID with Double = js.native
  /* 5254 */ val UFSMigrateFileAppIDResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSMigrateFileAppIDResponse with Double = js.native
  /* 5239 */ val UFSMigrateFileResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSMigrateFileResponse with Double = js.native
  /* 5234 */ val UFSReloadAccount: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSReloadAccount with Double = js.native
  /* 5235 */ val UFSReloadAccountResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSReloadAccountResponse with Double = js.native
  /* 5215 */ val UFSReloadPartitionInfo: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSReloadPartitionInfo with Double = js.native
  /* 5217 */ val UFSSynchronizeFile: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSSynchronizeFile with Double = js.native
  /* 5218 */ val UFSSynchronizeFileResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSSynchronizeFileResponse with Double = js.native
  /* 5228 */ val UFSUpdateFileFlags: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSUpdateFileFlags with Double = js.native
  /* 5229 */ val UFSUpdateFileFlagsResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSUpdateFileFlagsResponse with Double = js.native
  /* 5236 */ val UFSUpdateRecordBatched: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSUpdateRecordBatched with Double = js.native
  /* 5237 */ val UFSUpdateRecordBatchedResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSUpdateRecordBatchedResponse with Double = js.native
  /* 5251 */ val UFSUploadCommit: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSUploadCommit with Double = js.native
  /* 5252 */ val UFSUploadCommitResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UFSUploadCommitResponse with Double = js.native
  /* 7900 */ val UGSBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UGSBase with Double = js.native
  /* 7900 */ val UGSUpdateGlobalStats: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UGSUpdateGlobalStats with Double = js.native
  /* 8108 */ val UMQ2AM_ClientMsgBatch: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UMQ2AM_ClientMsgBatch with Double = js.native
  /* 8100 */ val UMQBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UMQBase with Double = js.native
  /* 8110 */ val UMQEnqueueMobileAnnouncements: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UMQEnqueueMobileAnnouncements with Double = js.native
  /* 8109 */ val UMQEnqueueMobileSalePromotions: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UMQEnqueueMobileSalePromotions with Double = js.native
  /* 8105 */ val UMQIncomingChatMessage: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UMQIncomingChatMessage with Double = js.native
  /* 8102 */ val UMQLogoffRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UMQLogoffRequest with Double = js.native
  /* 8103 */ val UMQLogoffResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UMQLogoffResponse with Double = js.native
  /* 8100 */ val UMQLogonRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UMQLogonRequest with Double = js.native
  /* 8101 */ val UMQLogonResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UMQLogonResponse with Double = js.native
  /* 8106 */ val UMQPoll: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UMQPoll with Double = js.native
  /* 8107 */ val UMQPollResults: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UMQPollResults with Double = js.native
  /* 8104 */ val UMQSendChatMessage: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UMQSendChatMessage with Double = js.native
  /* 229 */ val UniverseChanged: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UniverseChanged with Double = js.native
  /* 1010 */ val UniverseData: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UniverseData with Double = js.native
  /* 322 */ val UpdateConfigFile: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UpdateConfigFile with Double = js.native
  /* 221 */ val UpdateCreditCardRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UpdateCreditCardRequest with Double = js.native
  /* 215 */ val UpdateRecordResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UpdateRecordResponse with Double = js.native
  /* 225 */ val UpdateUserBanResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.UpdateUserBanResponse with Double = js.native
  /* 601 */ val VACResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.VACResponse with Double = js.native
  /* 605 */ val VSAddCheat: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.VSAddCheat with Double = js.native
  /* 608 */ val VSChallengeResultText: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.VSChallengeResultText with Double = js.native
  /* 607 */ val VSGetChallengeResults: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.VSGetChallengeResults with Double = js.native
  /* 611 */ val VSLoadDBFinished: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.VSLoadDBFinished with Double = js.native
  /* 604 */ val VSMarkCheat: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.VSMarkCheat with Double = js.native
  /* 606 */ val VSPurgeCodeModDB: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.VSPurgeCodeModDB with Double = js.native
  /* 609 */ val VSReportLingerer: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.VSReportLingerer with Double = js.native
  /* 610 */ val VSRequestManagedChallenge: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.VSRequestManagedChallenge with Double = js.native
  /* 130 */ val WGRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.WGRequest with Double = js.native
  /* 131 */ val WGResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.WGResponse with Double = js.native
  /* 8300 */ val WebAPIBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.WebAPIBase with Double = js.native
  /* 8304 */ val WebAPIInvalidateOAuthClientCache: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.WebAPIInvalidateOAuthClientCache with Double = js.native
  /* 8305 */ val WebAPIInvalidateOAuthTokenCache: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.WebAPIInvalidateOAuthTokenCache with Double = js.native
  /* 8302 */ val WebAPIInvalidateTokensForAccount: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.WebAPIInvalidateTokensForAccount with Double = js.native
  /* 133 */ val WebAPIJobRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.WebAPIJobRequest with Double = js.native
  /* 134 */ val WebAPIJobResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.WebAPIJobResponse with Double = js.native
  /* 8303 */ val WebAPIRegisterGCInterfaces: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.WebAPIRegisterGCInterfaces with Double = js.native
  /* 8306 */ val WebAPISetSecrets: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.WebAPISetSecrets with Double = js.native
  /* 8300 */ val WebAPIValidateOAuth2Token: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.WebAPIValidateOAuth2Token with Double = js.native
  /* 8301 */ val WebAPIValidateOAuth2TokenResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.WebAPIValidateOAuth2TokenResponse with Double = js.native
  /* 9000 */ val WorkerProcess: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.WorkerProcess with Double = js.native
  /* 9000 */ val WorkerProcessPingRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.WorkerProcessPingRequest with Double = js.native
  /* 9001 */ val WorkerProcessPingResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.WorkerProcessPingResponse with Double = js.native
  /* 9002 */ val WorkerProcessShutdown: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.WorkerProcessShutdown with Double = js.native
  /* 8200 */ val WorkshopAcceptTOSRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.WorkshopAcceptTOSRequest with Double = js.native
  /* 8201 */ val WorkshopAcceptTOSResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.WorkshopAcceptTOSResponse with Double = js.native
  /* 8200 */ val WorkshopBase: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.WorkshopBase with Double = js.native
  /* 204 */ val ZipRequest: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ZipRequest with Double = js.native
  /* 205 */ val ZipResponse: typingsSlinky.steamDashClient.steamDashClientMod.EMsg.ZipResponse with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EMsg with Double] = js.native
}


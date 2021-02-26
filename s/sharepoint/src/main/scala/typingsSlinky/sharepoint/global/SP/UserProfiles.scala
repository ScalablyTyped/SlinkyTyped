package typingsSlinky.sharepoint.global.SP

import typingsSlinky.sharepoint.SP.UserProfiles.HashTagCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UserProfiles {
  
  /** Specifies types of changes made in the user profile store. */
  @JSGlobal("SP.UserProfiles.ChangeTypes")
  @js.native
  object ChangeTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.UserProfiles.ChangeTypes with Double] = js.native
    
    /* 1 */ val add: typingsSlinky.sharepoint.SP.UserProfiles.ChangeTypes.add with Double = js.native
    
    /* 5 */ val all: typingsSlinky.sharepoint.SP.UserProfiles.ChangeTypes.all with Double = js.native
    
    /* 4 */ val metadata: typingsSlinky.sharepoint.SP.UserProfiles.ChangeTypes.metadata with Double = js.native
    
    /* 2 */ val modify: typingsSlinky.sharepoint.SP.UserProfiles.ChangeTypes.modify with Double = js.native
    
    /* 0 */ val none: typingsSlinky.sharepoint.SP.UserProfiles.ChangeTypes.none with Double = js.native
    
    /* 3 */ val remove: typingsSlinky.sharepoint.SP.UserProfiles.ChangeTypes.remove with Double = js.native
  }
  
  /** Returns information about a request to follow an item. */
  @JSGlobal("SP.UserProfiles.FollowResult")
  @js.native
  class FollowResult ()
    extends typingsSlinky.sharepoint.SP.UserProfiles.FollowResult
  
  @JSGlobal("SP.UserProfiles.FollowResultType")
  @js.native
  object FollowResultType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.UserProfiles.FollowResultType with Double] = js.native
    
    /* 4 */ val failed: typingsSlinky.sharepoint.SP.UserProfiles.FollowResultType.failed with Double = js.native
    
    /* 1 */ val followed: typingsSlinky.sharepoint.SP.UserProfiles.FollowResultType.followed with Double = js.native
    
    /* 3 */ val hitFollowLimit: typingsSlinky.sharepoint.SP.UserProfiles.FollowResultType.hitFollowLimit with Double = js.native
    
    /* 2 */ val refollowed: typingsSlinky.sharepoint.SP.UserProfiles.FollowResultType.refollowed with Double = js.native
    
    /* 0 */ val unknown: typingsSlinky.sharepoint.SP.UserProfiles.FollowResultType.unknown with Double = js.native
  }
  
  /** Provides access to followed content items. */
  @JSGlobal("SP.UserProfiles.FollowedContent")
  @js.native
  class FollowedContent protected ()
    extends typingsSlinky.sharepoint.SP.UserProfiles.FollowedContent {
    def this(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext) = this()
  }
  object FollowedContent {
    
    /* static member */
    @JSGlobal("SP.UserProfiles.FollowedContent.newObject")
    @js.native
    def newObject(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext): typingsSlinky.sharepoint.SP.UserProfiles.FollowedContent = js.native
  }
  
  @JSGlobal("SP.UserProfiles.FollowedContentExceptionType")
  @js.native
  object FollowedContentExceptionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.sharepoint.SP.UserProfiles.FollowedContentExceptionType with Double
      ] = js.native
    
    /* 5 */ val followLimitReached: typingsSlinky.sharepoint.SP.UserProfiles.FollowedContentExceptionType.followLimitReached with Double = js.native
    
    /* 8 */ val internalError: typingsSlinky.sharepoint.SP.UserProfiles.FollowedContentExceptionType.internalError with Double = js.native
    
    /* 2 */ val invalidQueryString: typingsSlinky.sharepoint.SP.UserProfiles.FollowedContentExceptionType.invalidQueryString with Double = js.native
    
    /* 3 */ val invalidSubtypeValue: typingsSlinky.sharepoint.SP.UserProfiles.FollowedContentExceptionType.invalidSubtypeValue with Double = js.native
    
    /* 0 */ val itemAlreadyExists: typingsSlinky.sharepoint.SP.UserProfiles.FollowedContentExceptionType.itemAlreadyExists with Double = js.native
    
    /* 1 */ val itemDoesNotExist: typingsSlinky.sharepoint.SP.UserProfiles.FollowedContentExceptionType.itemDoesNotExist with Double = js.native
    
    /* 4 */ val unsupportedItemType: typingsSlinky.sharepoint.SP.UserProfiles.FollowedContentExceptionType.unsupportedItemType with Double = js.native
    
    /* 7 */ val unsupportedSite: typingsSlinky.sharepoint.SP.UserProfiles.FollowedContentExceptionType.unsupportedSite with Double = js.native
    
    /* 6 */ val untrustedSource: typingsSlinky.sharepoint.SP.UserProfiles.FollowedContentExceptionType.untrustedSource with Double = js.native
  }
  
  @JSGlobal("SP.UserProfiles.FollowedContentQueryOptions")
  @js.native
  object FollowedContentQueryOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.UserProfiles.FollowedContentQueryOptions with Double] = js.native
    
    /* 6 */ val all: typingsSlinky.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.all with Double = js.native
    
    /* 5 */ val defaultOptions: typingsSlinky.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.defaultOptions with Double = js.native
    
    /* 2 */ val documents: typingsSlinky.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.documents with Double = js.native
    
    /* 3 */ val hidden: typingsSlinky.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.hidden with Double = js.native
    
    /* 4 */ val nonFeed: typingsSlinky.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.nonFeed with Double = js.native
    
    /* 1 */ val sites: typingsSlinky.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.sites with Double = js.native
    
    /* 0 */ val unset: typingsSlinky.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.unset with Double = js.native
  }
  
  /** Represents a followed content resource. */
  @JSGlobal("SP.UserProfiles.FollowedItem")
  @js.native
  class FollowedItem ()
    extends typingsSlinky.sharepoint.SP.UserProfiles.FollowedItem
  
  /** Contains additional data that can be attached to a FollowedItem object */
  @JSGlobal("SP.UserProfiles.FollowedItemData")
  @js.native
  class FollowedItemData ()
    extends typingsSlinky.sharepoint.SP.UserProfiles.FollowedItemData
  
  @JSGlobal("SP.UserProfiles.FollowedItemType")
  @js.native
  object FollowedItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.UserProfiles.FollowedItemType with Double] = js.native
    
    /* 3 */ val all: typingsSlinky.sharepoint.SP.UserProfiles.FollowedItemType.all with Double = js.native
    
    /* 1 */ val document: typingsSlinky.sharepoint.SP.UserProfiles.FollowedItemType.document with Double = js.native
    
    /* 2 */ val site: typingsSlinky.sharepoint.SP.UserProfiles.FollowedItemType.site with Double = js.native
    
    /* 0 */ val unknown: typingsSlinky.sharepoint.SP.UserProfiles.FollowedItemType.unknown with Double = js.native
  }
  
  @JSGlobal("SP.UserProfiles.FollowedStatus")
  @js.native
  object FollowedStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.UserProfiles.FollowedStatus with Double] = js.native
    
    /* 0 */ val followed: typingsSlinky.sharepoint.SP.UserProfiles.FollowedStatus.followed with Double = js.native
    
    /* 2 */ val notFollowable: typingsSlinky.sharepoint.SP.UserProfiles.FollowedStatus.notFollowable with Double = js.native
    
    /* 1 */ val notFollowed: typingsSlinky.sharepoint.SP.UserProfiles.FollowedStatus.notFollowed with Double = js.native
  }
  
  @JSGlobal("SP.UserProfiles.HashTag")
  @js.native
  class HashTag ()
    extends typingsSlinky.sharepoint.SP.UserProfiles.HashTag
  
  /** Specifies types of user-related objects that can be changed in the user profile store. */
  @JSGlobal("SP.UserProfiles.ObjectTypes")
  @js.native
  object ObjectTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.UserProfiles.ObjectTypes with Double] = js.native
    
    /* 14 */ val all: typingsSlinky.sharepoint.SP.UserProfiles.ObjectTypes.all with Double = js.native
    
    /* 3 */ val anniversary: typingsSlinky.sharepoint.SP.UserProfiles.ObjectTypes.anniversary with Double = js.native
    
    /* 7 */ val colleague: typingsSlinky.sharepoint.SP.UserProfiles.ObjectTypes.colleague with Double = js.native
    
    /* 11 */ val custom: typingsSlinky.sharepoint.SP.UserProfiles.ObjectTypes.custom with Double = js.native
    
    /* 4 */ val dlMembership: typingsSlinky.sharepoint.SP.UserProfiles.ObjectTypes.dlMembership with Double = js.native
    
    /* 2 */ val multiValueProperty: typingsSlinky.sharepoint.SP.UserProfiles.ObjectTypes.multiValueProperty with Double = js.native
    
    /* 0 */ val none: typingsSlinky.sharepoint.SP.UserProfiles.ObjectTypes.none with Double = js.native
    
    /* 13 */ val organizationMembership: typingsSlinky.sharepoint.SP.UserProfiles.ObjectTypes.organizationMembership with Double = js.native
    
    /* 12 */ val organizationProfile: typingsSlinky.sharepoint.SP.UserProfiles.ObjectTypes.organizationProfile with Double = js.native
    
    /* 8 */ val personalizationSite: typingsSlinky.sharepoint.SP.UserProfiles.ObjectTypes.personalizationSite with Double = js.native
    
    /* 6 */ val quickLink: typingsSlinky.sharepoint.SP.UserProfiles.ObjectTypes.quickLink with Double = js.native
    
    /* 1 */ val singleValueProperty: typingsSlinky.sharepoint.SP.UserProfiles.ObjectTypes.singleValueProperty with Double = js.native
    
    /* 5 */ val siteMembership: typingsSlinky.sharepoint.SP.UserProfiles.ObjectTypes.siteMembership with Double = js.native
    
    /* 9 */ val userProfile: typingsSlinky.sharepoint.SP.UserProfiles.ObjectTypes.userProfile with Double = js.native
    
    /* 10 */ val webLog: typingsSlinky.sharepoint.SP.UserProfiles.ObjectTypes.webLog with Double = js.native
  }
  
  /** Provides methods for operations related to people.
    Note: The SocialFollowingManager object is the recommended object for performing Following People and Following Content tasks.
    However, PeopleManager provides some methods that SocialFollowingManager doesn't. */
  @JSGlobal("SP.UserProfiles.PeopleManager")
  @js.native
  class PeopleManager protected ()
    extends typingsSlinky.sharepoint.SP.UserProfiles.PeopleManager {
    def this(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext) = this()
  }
  object PeopleManager {
    
    /* static member */
    @JSGlobal("SP.UserProfiles.PeopleManager.getTrendingTags")
    @js.native
    def getTrendingTags(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext): HashTagCollection = js.native
    
    /** Checks whether the first user is following the second user. */
    /* static member */
    @JSGlobal("SP.UserProfiles.PeopleManager.isFollowing")
    @js.native
    def isFollowing(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      possibleFollowerAccountName: String,
      possibleFolloweeAccountName: String
    ): typingsSlinky.sharepoint.SP.BooleanResult = js.native
  }
  
  /** Represents user properties. */
  @JSGlobal("SP.UserProfiles.PersonProperties")
  @js.native
  class PersonProperties ()
    extends typingsSlinky.sharepoint.SP.UserProfiles.PersonProperties
  
  /** Specifies the capabilities of a personal site. */
  @JSGlobal("SP.UserProfiles.PersonalSiteCapabilities")
  @js.native
  object PersonalSiteCapabilities extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteCapabilities with Double] = js.native
    
    /* 5 */ val education: typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.education with Double = js.native
    
    /* 6 */ val guest: typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.guest with Double = js.native
    
    /* 4 */ val myTasksDashboard: typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.myTasksDashboard with Double = js.native
    
    /* 0 */ val none: typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.none with Double = js.native
    
    /* 1 */ val profile: typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.profile with Double = js.native
    
    /* 2 */ val social: typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.social with Double = js.native
    
    /* 3 */ val storage: typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.storage with Double = js.native
  }
  
  /** Specifies an exception or status code for the state of a personal site instantiation. */
  @JSGlobal("SP.UserProfiles.PersonalSiteInstantiationState")
  @js.native
  object PersonalSiteInstantiationState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState with Double
      ] = js.native
    
    /* 2 */ val created: typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.created with Double = js.native
    
    /* 3 */ val deleted: typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.deleted with Double = js.native
    
    /* 1 */ val enqueued: typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.enqueued with Double = js.native
    
    /* 11 */ val errorGeneralFailure: typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorGeneralFailure with Double = js.native
    
    /* 13 */ val errorLanguageNotInstalled: typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorLanguageNotInstalled with Double = js.native
    
    /* 12 */ val errorManagedPathDoesNotExist: typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorManagedPathDoesNotExist with Double = js.native
    
    /* 14 */ val errorPartialCreate: typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorPartialCreate with Double = js.native
    
    /* 15 */ val errorPersonalSiteAlreadyExists: typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorPersonalSiteAlreadyExists with Double = js.native
    
    /* 16 */ val errorRootSiteNotPresent: typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorRootSiteNotPresent with Double = js.native
    
    /* 17 */ val errorSelfServiceSiteCreateCallFailed: typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorSelfServiceSiteCreateCallFailed with Double = js.native
    
    /* 9 */ val permissionsEmptyHostUrl: typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsEmptyHostUrl with Double = js.native
    
    /* 4 */ val permissionsGeneralFailure: typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsGeneralFailure with Double = js.native
    
    /* 10 */ val permissionsHostFailedToInitializePersonalSiteContext: typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsHostFailedToInitializePersonalSiteContext with Double = js.native
    
    /* 8 */ val permissionsNoMySitesInPeopleLight: typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsNoMySitesInPeopleLight with Double = js.native
    
    /* 7 */ val permissionsSelfServiceSiteCreationDisabled: typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsSelfServiceSiteCreationDisabled with Double = js.native
    
    /* 5 */ val permissionsUPANotGranted: typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsUPANotGranted with Double = js.native
    
    /* 6 */ val permissionsUserNotLicensed: typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsUserNotLicensed with Double = js.native
    
    /* 0 */ val uninitialized: typingsSlinky.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.uninitialized with Double = js.native
  }
  
  /** Provides an alternate entry point to user profiles rather than calling methods directly. */
  @JSGlobal("SP.UserProfiles.ProfileLoader")
  @js.native
  class ProfileLoader ()
    extends typingsSlinky.sharepoint.SP.UserProfiles.ProfileLoader
  object ProfileLoader {
    
    /* static member */
    @JSGlobal("SP.UserProfiles.ProfileLoader.getProfileLoader")
    @js.native
    def getProfileLoader(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext): typingsSlinky.sharepoint.SP.UserProfiles.ProfileLoader = js.native
  }
  
  @JSGlobal("SP.UserProfiles.SocialDataStoreExceptionCode")
  @js.native
  object SocialDataStoreExceptionCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.sharepoint.SP.UserProfiles.SocialDataStoreExceptionCode with Double
      ] = js.native
    
    /* 2 */ val cannotCreatePersonalSite: typingsSlinky.sharepoint.SP.UserProfiles.SocialDataStoreExceptionCode.cannotCreatePersonalSite with Double = js.native
    
    /* 3 */ val noSocialFeatures: typingsSlinky.sharepoint.SP.UserProfiles.SocialDataStoreExceptionCode.noSocialFeatures with Double = js.native
    
    /* 1 */ val personalSiteNotFound: typingsSlinky.sharepoint.SP.UserProfiles.SocialDataStoreExceptionCode.personalSiteNotFound with Double = js.native
    
    /* 0 */ val socialListNotFound: typingsSlinky.sharepoint.SP.UserProfiles.SocialDataStoreExceptionCode.socialListNotFound with Double = js.native
  }
  
  /** Represents a client-side user profile for a person.
    Note: The client-side UserProfile object provides methods you can use to create a personal site for the current user.
    However, it does not contain the user properties that the server-side UserProfile object contains.
    To access user properties from client-side code, use PeopleManager */
  @JSGlobal("SP.UserProfiles.UserProfile")
  @js.native
  class UserProfile ()
    extends typingsSlinky.sharepoint.SP.UserProfiles.UserProfile
  
  /** Represents a set of user profile properties for a specified user. */
  @JSGlobal("SP.UserProfiles.UserProfilePropertiesForUser")
  @js.native
  class UserProfilePropertiesForUser protected ()
    extends typingsSlinky.sharepoint.SP.UserProfiles.UserProfilePropertiesForUser {
    /** Creates new UserProfilePropertiesForUser object
      @param context Specifies the client context to use.
      @param accountName Specifies the user by account name.
      @param propertyNames Specifies an array of strings that specify the properties to retrieve. */
    def this(
      context: typingsSlinky.sharepoint.SP.ClientContext,
      accountName: String,
      propertyNames: js.Array[String]
    ) = this()
  }
}

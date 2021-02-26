package typingsSlinky.vsoNodeApi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vsoNodeApi.anon.EnumValuesLarge
import typingsSlinky.vsoNodeApi.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object profileInterfacesMod {
  
  @js.native
  sealed trait AvatarSize extends StObject
  @JSImport("vso-node-api/interfaces/ProfileInterfaces", "AvatarSize")
  @js.native
  object AvatarSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AvatarSize with Double] = js.native
    
    @js.native
    sealed trait Large extends AvatarSize
    /* 2 */ val Large: typingsSlinky.vsoNodeApi.profileInterfacesMod.AvatarSize.Large with Double = js.native
    
    @js.native
    sealed trait Medium extends AvatarSize
    /* 1 */ val Medium: typingsSlinky.vsoNodeApi.profileInterfacesMod.AvatarSize.Medium with Double = js.native
    
    @js.native
    sealed trait Small extends AvatarSize
    /* 0 */ val Small: typingsSlinky.vsoNodeApi.profileInterfacesMod.AvatarSize.Small with Double = js.native
  }
  
  object TypeInfo {
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo.AttributeDescriptor")
    @js.native
    def AttributeDescriptor: Fields = js.native
    @scala.inline
    def AttributeDescriptor_=(x: Fields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AttributeDescriptor")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo.AttributesContainer")
    @js.native
    def AttributesContainer: Fields = js.native
    @scala.inline
    def AttributesContainer_=(x: Fields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AttributesContainer")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo.Avatar")
    @js.native
    def Avatar: Fields = js.native
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo.AvatarSize")
    @js.native
    def AvatarSize: EnumValuesLarge = js.native
    @scala.inline
    def AvatarSize_=(x: EnumValuesLarge): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AvatarSize")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Avatar_=(x: Fields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Avatar")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo.CoreProfileAttribute")
    @js.native
    def CoreProfileAttribute: Fields = js.native
    @scala.inline
    def CoreProfileAttribute_=(x: Fields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CoreProfileAttribute")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo.Country")
    @js.native
    def Country: Fields = js.native
    @scala.inline
    def Country_=(x: Fields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Country")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo.CreateProfileContext")
    @js.native
    def CreateProfileContext: Fields = js.native
    @scala.inline
    def CreateProfileContext_=(x: Fields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateProfileContext")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo.GeoRegion")
    @js.native
    def GeoRegion: Fields = js.native
    @scala.inline
    def GeoRegion_=(x: Fields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GeoRegion")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo.Profile")
    @js.native
    def Profile: Fields = js.native
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo.ProfileAttribute")
    @js.native
    def ProfileAttribute: Fields = js.native
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo.ProfileAttributeBase")
    @js.native
    def ProfileAttributeBase: Fields = js.native
    @scala.inline
    def ProfileAttributeBase_=(x: Fields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProfileAttributeBase")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def ProfileAttribute_=(x: Fields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProfileAttribute")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo.ProfileRegion")
    @js.native
    def ProfileRegion: Fields = js.native
    @scala.inline
    def ProfileRegion_=(x: Fields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProfileRegion")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo.ProfileRegions")
    @js.native
    def ProfileRegions: Fields = js.native
    @scala.inline
    def ProfileRegions_=(x: Fields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProfileRegions")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Profile_=(x: Fields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Profile")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AttributeDescriptor extends StObject {
    
    var attributeName: String = js.native
    
    var containerName: String = js.native
  }
  object AttributeDescriptor {
    
    @scala.inline
    def apply(attributeName: String, containerName: String): AttributeDescriptor = {
      val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeDescriptor]
    }
    
    @scala.inline
    implicit class AttributeDescriptorMutableBuilder[Self <: AttributeDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AttributesContainer extends StObject {
    
    var attributes: StringDictionary[ProfileAttribute] = js.native
    
    var containerName: String = js.native
    
    var revision: Double = js.native
  }
  object AttributesContainer {
    
    @scala.inline
    def apply(attributes: StringDictionary[ProfileAttribute], containerName: String, revision: Double): AttributesContainer = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributesContainer]
    }
    
    @scala.inline
    implicit class AttributesContainerMutableBuilder[Self <: AttributesContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[ProfileAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Avatar extends StObject {
    
    var isAutoGenerated: Boolean = js.native
    
    var size: AvatarSize = js.native
    
    var timeStamp: js.Date = js.native
    
    var value: js.Array[Double] = js.native
  }
  object Avatar {
    
    @scala.inline
    def apply(isAutoGenerated: Boolean, size: AvatarSize, timeStamp: js.Date, value: js.Array[Double]): Avatar = {
      val __obj = js.Dynamic.literal(isAutoGenerated = isAutoGenerated.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Avatar]
    }
    
    @scala.inline
    implicit class AvatarMutableBuilder[Self <: Avatar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsAutoGenerated(value: Boolean): Self = StObject.set(x, "isAutoGenerated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: AvatarSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStamp(value: js.Date): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  type CoreProfileAttribute = ProfileAttributeBase[js.Any]
  
  @js.native
  trait Country extends StObject {
    
    var code: String = js.native
    
    var englishName: String = js.native
  }
  object Country {
    
    @scala.inline
    def apply(code: String, englishName: String): Country = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], englishName = englishName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Country]
    }
    
    @scala.inline
    implicit class CountryMutableBuilder[Self <: Country] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnglishName(value: String): Self = StObject.set(x, "englishName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CreateProfileContext extends StObject {
    
    var cIData: StringDictionary[js.Any] = js.native
    
    var contactWithOffers: Boolean = js.native
    
    var countryName: String = js.native
    
    var displayName: String = js.native
    
    var emailAddress: String = js.native
    
    var hasAccount: Boolean = js.native
    
    var language: String = js.native
    
    var phoneNumber: String = js.native
  }
  object CreateProfileContext {
    
    @scala.inline
    def apply(
      cIData: StringDictionary[js.Any],
      contactWithOffers: Boolean,
      countryName: String,
      displayName: String,
      emailAddress: String,
      hasAccount: Boolean,
      language: String,
      phoneNumber: String
    ): CreateProfileContext = {
      val __obj = js.Dynamic.literal(cIData = cIData.asInstanceOf[js.Any], contactWithOffers = contactWithOffers.asInstanceOf[js.Any], countryName = countryName.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], hasAccount = hasAccount.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateProfileContext]
    }
    
    @scala.inline
    implicit class CreateProfileContextMutableBuilder[Self <: CreateProfileContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCIData(value: StringDictionary[js.Any]): Self = StObject.set(x, "cIData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContactWithOffers(value: Boolean): Self = StObject.set(x, "contactWithOffers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryName(value: String): Self = StObject.set(x, "countryName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasAccount(value: Boolean): Self = StObject.set(x, "hasAccount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GeoRegion extends StObject {
    
    var regionCode: String = js.native
  }
  object GeoRegion {
    
    @scala.inline
    def apply(regionCode: String): GeoRegion = {
      val __obj = js.Dynamic.literal(regionCode = regionCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoRegion]
    }
    
    @scala.inline
    implicit class GeoRegionMutableBuilder[Self <: GeoRegion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Profile extends StObject {
    
    var applicationContainer: AttributesContainer = js.native
    
    var coreAttributes: StringDictionary[CoreProfileAttribute] = js.native
    
    var coreRevision: Double = js.native
    
    var id: String = js.native
    
    var revision: Double = js.native
    
    var timeStamp: js.Date = js.native
  }
  object Profile {
    
    @scala.inline
    def apply(
      applicationContainer: AttributesContainer,
      coreAttributes: StringDictionary[CoreProfileAttribute],
      coreRevision: Double,
      id: String,
      revision: Double,
      timeStamp: js.Date
    ): Profile = {
      val __obj = js.Dynamic.literal(applicationContainer = applicationContainer.asInstanceOf[js.Any], coreAttributes = coreAttributes.asInstanceOf[js.Any], coreRevision = coreRevision.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Profile]
    }
    
    @scala.inline
    implicit class ProfileMutableBuilder[Self <: Profile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationContainer(value: AttributesContainer): Self = StObject.set(x, "applicationContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoreAttributes(value: StringDictionary[CoreProfileAttribute]): Self = StObject.set(x, "coreAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoreRevision(value: Double): Self = StObject.set(x, "coreRevision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStamp(value: js.Date): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    }
  }
  
  type ProfileAttribute = ProfileAttributeBase[String]
  
  @js.native
  trait ProfileAttributeBase[T] extends StObject {
    
    var descriptor: AttributeDescriptor = js.native
    
    var revision: Double = js.native
    
    var timeStamp: js.Date = js.native
    
    var value: T = js.native
  }
  object ProfileAttributeBase {
    
    @scala.inline
    def apply[T](descriptor: AttributeDescriptor, revision: Double, timeStamp: js.Date, value: T): ProfileAttributeBase[T] = {
      val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProfileAttributeBase[T]]
    }
    
    @scala.inline
    implicit class ProfileAttributeBaseMutableBuilder[Self <: ProfileAttributeBase[_], T] (val x: Self with ProfileAttributeBase[T]) extends AnyVal {
      
      @scala.inline
      def setDescriptor(value: AttributeDescriptor): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStamp(value: js.Date): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProfileRegion extends StObject {
    
    /**
      * The two-letter code defined in ISO 3166 for the country/region.
      */
    var code: String = js.native
    
    /**
      * Localized country/region name
      */
    var name: String = js.native
  }
  object ProfileRegion {
    
    @scala.inline
    def apply(code: String, name: String): ProfileRegion = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProfileRegion]
    }
    
    @scala.inline
    implicit class ProfileRegionMutableBuilder[Self <: ProfileRegion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProfileRegions extends StObject {
    
    /**
      * List of country/region code with contact consent requirement type of notice
      */
    var noticeContactConsentRequirementRegions: js.Array[String] = js.native
    
    /**
      * List of country/region code with contact consent requirement type of opt-out
      */
    var optOutContactConsentRequirementRegions: js.Array[String] = js.native
    
    /**
      * List of country/regions
      */
    var regions: js.Array[ProfileRegion] = js.native
  }
  object ProfileRegions {
    
    @scala.inline
    def apply(
      noticeContactConsentRequirementRegions: js.Array[String],
      optOutContactConsentRequirementRegions: js.Array[String],
      regions: js.Array[ProfileRegion]
    ): ProfileRegions = {
      val __obj = js.Dynamic.literal(noticeContactConsentRequirementRegions = noticeContactConsentRequirementRegions.asInstanceOf[js.Any], optOutContactConsentRequirementRegions = optOutContactConsentRequirementRegions.asInstanceOf[js.Any], regions = regions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProfileRegions]
    }
    
    @scala.inline
    implicit class ProfileRegionsMutableBuilder[Self <: ProfileRegions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoticeContactConsentRequirementRegions(value: js.Array[String]): Self = StObject.set(x, "noticeContactConsentRequirementRegions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoticeContactConsentRequirementRegionsVarargs(value: String*): Self = StObject.set(x, "noticeContactConsentRequirementRegions", js.Array(value :_*))
      
      @scala.inline
      def setOptOutContactConsentRequirementRegions(value: js.Array[String]): Self = StObject.set(x, "optOutContactConsentRequirementRegions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptOutContactConsentRequirementRegionsVarargs(value: String*): Self = StObject.set(x, "optOutContactConsentRequirementRegions", js.Array(value :_*))
      
      @scala.inline
      def setRegions(value: js.Array[ProfileRegion]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionsVarargs(value: ProfileRegion*): Self = StObject.set(x, "regions", js.Array(value :_*))
    }
  }
}

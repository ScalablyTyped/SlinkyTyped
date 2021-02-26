package typingsSlinky.winrtUwp.Windows.Media

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.restrictionschanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes that define Family Safety settings for a Windows user. */
object ContentRestrictions {
  
  @js.native
  sealed trait ContentAccessRestrictionLevel extends StObject
  /** Specifies how the content is treated, based on the user's content settings. */
  @JSGlobal("Windows.Media.ContentRestrictions.ContentAccessRestrictionLevel")
  @js.native
  object ContentAccessRestrictionLevel extends StObject {
    
    /** Can be shown in the content catalog and consumed. */
    @js.native
    sealed trait allow extends ContentAccessRestrictionLevel
    
    /** Can be shown in the content catalog, but will be blocked by RequestContentAccessAsync . */
    @js.native
    sealed trait block extends ContentAccessRestrictionLevel
    
    /** Can't be shown in the content catalog. It's rating is higher than the user's settings, determined by MaxBrowsableAgeRating . */
    @js.native
    sealed trait hide extends ContentAccessRestrictionLevel
    
    /** (Xbox only) If multiple users are logged in and the content is blocked for at least one user, content is allowed with a warning displayed. */
    @js.native
    sealed trait warn extends ContentAccessRestrictionLevel
  }
  
  @js.native
  sealed trait RatedContentCategory extends StObject
  /** Specifies the type of a piece of content. */
  @JSGlobal("Windows.Media.ContentRestrictions.RatedContentCategory")
  @js.native
  object RatedContentCategory extends StObject {
    
    /** Apps on Windows 8.1 and Xbox. */
    @js.native
    sealed trait application extends RatedContentCategory
    
    /** Apps on Windows 8.1 and Xbox. */
    @js.native
    sealed trait game extends RatedContentCategory
    
    /** In-app content for Windows 8.1 and Xbox apps. */
    @js.native
    sealed trait general extends RatedContentCategory
    
    /** In-app content for Windows 8.1 and Xbox apps. */
    @js.native
    sealed trait movie extends RatedContentCategory
    
    /** In-app content for Windows 8.1 and Xbox apps. */
    @js.native
    sealed trait music extends RatedContentCategory
    
    /** In-app content for Windows 8.1 and Xbox apps. */
    @js.native
    sealed trait television extends RatedContentCategory
  }
  
  /** Contains information used to filter an app's content catalog. */
  @js.native
  trait ContentRestrictionsBrowsePolicy extends StObject {
    
    /** Gets the region of the user's content restrictions. */
    var geographicRegion: String = js.native
    
    /** Gets the maximum allowed age rating level to show in a content catalog. No content rated above this level should be displayed. For example, if the MaxBrowsableAgeRating is 13, MPAA:R rated movies should not be displayed. */
    var maxBrowsableAgeRating: Double = js.native
    
    /** Gets the maximum allowed rating level for content consumption. */
    var preferredAgeRating: Double = js.native
  }
  object ContentRestrictionsBrowsePolicy {
    
    @scala.inline
    def apply(geographicRegion: String, maxBrowsableAgeRating: Double, preferredAgeRating: Double): ContentRestrictionsBrowsePolicy = {
      val __obj = js.Dynamic.literal(geographicRegion = geographicRegion.asInstanceOf[js.Any], maxBrowsableAgeRating = maxBrowsableAgeRating.asInstanceOf[js.Any], preferredAgeRating = preferredAgeRating.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentRestrictionsBrowsePolicy]
    }
    
    @scala.inline
    implicit class ContentRestrictionsBrowsePolicyMutableBuilder[Self <: ContentRestrictionsBrowsePolicy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGeographicRegion(value: String): Self = StObject.set(x, "geographicRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBrowsableAgeRating(value: Double): Self = StObject.set(x, "maxBrowsableAgeRating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredAgeRating(value: Double): Self = StObject.set(x, "preferredAgeRating", value.asInstanceOf[js.Any])
    }
  }
  
  /** Contains information about a piece of content. An app creates a RatedContentDescription object, for each piece of content to be used in the GetRestrictionLevelAsync and RequestContentAccessAsync methods. */
  @js.native
  trait RatedContentDescription extends StObject {
    
    /** Specifies the type of a piece of content, defined by RatedContentCategory . */
    var category: RatedContentCategory = js.native
    
    /** The unique content ID of a piece of content, in the app's content catalog. */
    var id: String = js.native
    
    /** The thumbnail image associated with the content. */
    var image: IRandomAccessStreamReference = js.native
    
    /** Provides all existing third-party and Windows Store age ratings for a piece of content. */
    var ratings: IVector[String] = js.native
    
    /** The display title of a piece of content. */
    var title: String = js.native
  }
  object RatedContentDescription {
    
    @scala.inline
    def apply(
      category: RatedContentCategory,
      id: String,
      image: IRandomAccessStreamReference,
      ratings: IVector[String],
      title: String
    ): RatedContentDescription = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], ratings = ratings.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[RatedContentDescription]
    }
    
    @scala.inline
    implicit class RatedContentDescriptionMutableBuilder[Self <: RatedContentDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(value: RatedContentCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: IRandomAccessStreamReference): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatings(value: IVector[String]): Self = StObject.set(x, "ratings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /** Contains all behavior and functionality related to a user's Family Safety content settings. */
  @js.native
  trait RatedContentRestrictions extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_restrictionschanged(`type`: restrictionschanged, listener: EventHandler[_]): Unit = js.native
    
    /**
      * Gets information that is used filter an app's content catalog.
      * @return Returns a ContentRestrictionsBrowsePolicy object.
      */
    def getBrowsePolicyAsync(): IPromiseWithIAsyncOperation[ContentRestrictionsBrowsePolicy] = js.native
    
    /**
      * Gets the policy that applies to a piece of content, for content browsing and consumption.
      * @param RatedContentDescription The rated content info.
      * @return This method returns these values:
      */
    def getRestrictionLevelAsync(RatedContentDescription: RatedContentDescription): IPromiseWithIAsyncOperation[ContentAccessRestrictionLevel] = js.native
    
    /** An event handler to notify apps when there are changes to the user's content settings. */
    def onrestrictionschanged(ev: js.Any with WinRTEvent[_]): Unit = js.native
    /** An event handler to notify apps when there are changes to the user's content settings. */
    @JSName("onrestrictionschanged")
    var onrestrictionschanged_Original: EventHandler[_] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_restrictionschanged(`type`: restrictionschanged, listener: EventHandler[_]): Unit = js.native
    
    /**
      * Determines whether the user is allowed to consume a piece of content.
      * @param RatedContentDescription The rated content info.
      * @return Returns true, if the user can consume the content. Otherwise, returns false.
      */
    def requestContentAccessAsync(RatedContentDescription: RatedContentDescription): IPromiseWithIAsyncOperation[Boolean] = js.native
  }
}

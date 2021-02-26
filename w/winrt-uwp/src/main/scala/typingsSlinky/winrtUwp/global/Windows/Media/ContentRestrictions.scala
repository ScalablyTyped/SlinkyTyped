package typingsSlinky.winrtUwp.global.Windows.Media

import typingsSlinky.winrtUwp.Windows.Media.ContentRestrictions.RatedContentCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes that define Family Safety settings for a Windows user. */
object ContentRestrictions {
  
  /** Specifies how the content is treated, based on the user's content settings. */
  @JSGlobal("Windows.Media.ContentRestrictions.ContentAccessRestrictionLevel")
  @js.native
  object ContentAccessRestrictionLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Media.ContentRestrictions.ContentAccessRestrictionLevel with Double
      ] = js.native
    
    /* 0 */ val allow: typingsSlinky.winrtUwp.Windows.Media.ContentRestrictions.ContentAccessRestrictionLevel.allow with Double = js.native
    
    /* 2 */ val block: typingsSlinky.winrtUwp.Windows.Media.ContentRestrictions.ContentAccessRestrictionLevel.block with Double = js.native
    
    /* 3 */ val hide: typingsSlinky.winrtUwp.Windows.Media.ContentRestrictions.ContentAccessRestrictionLevel.hide with Double = js.native
    
    /* 1 */ val warn: typingsSlinky.winrtUwp.Windows.Media.ContentRestrictions.ContentAccessRestrictionLevel.warn with Double = js.native
  }
  
  /** Contains information used to filter an app's content catalog. */
  @JSGlobal("Windows.Media.ContentRestrictions.ContentRestrictionsBrowsePolicy")
  @js.native
  abstract class ContentRestrictionsBrowsePolicy ()
    extends typingsSlinky.winrtUwp.Windows.Media.ContentRestrictions.ContentRestrictionsBrowsePolicy
  
  /** Specifies the type of a piece of content. */
  @JSGlobal("Windows.Media.ContentRestrictions.RatedContentCategory")
  @js.native
  object RatedContentCategory extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Media.ContentRestrictions.RatedContentCategory with Double
      ] = js.native
    
    /* 1 */ val application: typingsSlinky.winrtUwp.Windows.Media.ContentRestrictions.RatedContentCategory.application with Double = js.native
    
    /* 2 */ val game: typingsSlinky.winrtUwp.Windows.Media.ContentRestrictions.RatedContentCategory.game with Double = js.native
    
    /* 0 */ val general: typingsSlinky.winrtUwp.Windows.Media.ContentRestrictions.RatedContentCategory.general with Double = js.native
    
    /* 3 */ val movie: typingsSlinky.winrtUwp.Windows.Media.ContentRestrictions.RatedContentCategory.movie with Double = js.native
    
    /* 5 */ val music: typingsSlinky.winrtUwp.Windows.Media.ContentRestrictions.RatedContentCategory.music with Double = js.native
    
    /* 4 */ val television: typingsSlinky.winrtUwp.Windows.Media.ContentRestrictions.RatedContentCategory.television with Double = js.native
  }
  
  /** Contains information about a piece of content. An app creates a RatedContentDescription object, for each piece of content to be used in the GetRestrictionLevelAsync and RequestContentAccessAsync methods. */
  @JSGlobal("Windows.Media.ContentRestrictions.RatedContentDescription")
  @js.native
  class RatedContentDescription protected ()
    extends typingsSlinky.winrtUwp.Windows.Media.ContentRestrictions.RatedContentDescription {
    /**
      * Initializes a new instance of the RatedContentDescription class.
      * @param id The ID of the content, as specified by the app developer.
      * @param title The title of the content.
      * @param category Specifies the type of a piece of content, defined by RatedContentCategory .
      */
    def this(id: String, title: String, category: RatedContentCategory) = this()
  }
  
  /** Contains all behavior and functionality related to a user's Family Safety content settings. */
  @JSGlobal("Windows.Media.ContentRestrictions.RatedContentRestrictions")
  @js.native
  /** Initializes a new instance of the RatedContentRestrictions class. */
  class RatedContentRestrictions ()
    extends typingsSlinky.winrtUwp.Windows.Media.ContentRestrictions.RatedContentRestrictions {
    /**
      * Initializes a new instance of the RatedContentRestrictions class, with the specified age rating the app uses, to restrict content usage.
      * @param maxAgeRating The max age rating.
      */
    def this(maxAgeRating: Double) = this()
  }
}

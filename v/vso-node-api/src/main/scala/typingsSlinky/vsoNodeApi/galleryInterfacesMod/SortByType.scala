package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SortByType extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "SortByType")
@js.native
object SortByType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SortByType with Double] = js.native
  
  /**
    * The results will be sorted as per Author defined in the VSix/Metadata. If not defined, publisher name is used This is specifically needed by VS IDE, other (new and old) clients are not encouraged to use this
    */
  @js.native
  sealed trait Author extends SortByType
  /* 11 */ val Author: typingsSlinky.vsoNodeApi.galleryInterfacesMod.SortByType.Author with Double = js.native
  
  /**
    * The results will be sorted as per Average ratings of the extensions
    */
  @js.native
  sealed trait AverageRating extends SortByType
  /* 6 */ val AverageRating: typingsSlinky.vsoNodeApi.galleryInterfacesMod.SortByType.AverageRating with Double = js.native
  
  /**
    * Results will be sorted by Install Count
    */
  @js.native
  sealed trait InstallCount extends SortByType
  /* 4 */ val InstallCount: typingsSlinky.vsoNodeApi.galleryInterfacesMod.SortByType.InstallCount with Double = js.native
  
  /**
    * The results will be sorted as per Last Updated date of the extensions with recently updated at the top
    */
  @js.native
  sealed trait LastUpdatedDate extends SortByType
  /* 1 */ val LastUpdatedDate: typingsSlinky.vsoNodeApi.galleryInterfacesMod.SortByType.LastUpdatedDate with Double = js.native
  
  /**
    * The results will be sorted as per Published date of the extensions
    */
  @js.native
  sealed trait PublishedDate extends SortByType
  /* 5 */ val PublishedDate: typingsSlinky.vsoNodeApi.galleryInterfacesMod.SortByType.PublishedDate with Double = js.native
  
  /**
    * Results will be sorted Alphabetically as per Publisher title
    */
  @js.native
  sealed trait Publisher extends SortByType
  /* 3 */ val Publisher: typingsSlinky.vsoNodeApi.galleryInterfacesMod.SortByType.Publisher with Double = js.native
  
  /**
    * The results will be sorted as per ReleaseDate of the extensions (date on which the extension first went public)
    */
  @js.native
  sealed trait ReleaseDate extends SortByType
  /* 10 */ val ReleaseDate: typingsSlinky.vsoNodeApi.galleryInterfacesMod.SortByType.ReleaseDate with Double = js.native
  
  /**
    * The results will be sorted by relevance in case search query is given, if no search query resutls will be provided as is
    */
  @js.native
  sealed trait Relevance extends SortByType
  /* 0 */ val Relevance: typingsSlinky.vsoNodeApi.galleryInterfacesMod.SortByType.Relevance with Double = js.native
  
  /**
    * Results will be sorted Alphabetically as per the title of the extension
    */
  @js.native
  sealed trait Title extends SortByType
  /* 2 */ val Title: typingsSlinky.vsoNodeApi.galleryInterfacesMod.SortByType.Title with Double = js.native
  
  /**
    * The results will be sorted as per Trending Daily Score of the extensions
    */
  @js.native
  sealed trait TrendingDaily extends SortByType
  /* 7 */ val TrendingDaily: typingsSlinky.vsoNodeApi.galleryInterfacesMod.SortByType.TrendingDaily with Double = js.native
  
  /**
    * The results will be sorted as per Trending monthly Score of the extensions
    */
  @js.native
  sealed trait TrendingMonthly extends SortByType
  /* 9 */ val TrendingMonthly: typingsSlinky.vsoNodeApi.galleryInterfacesMod.SortByType.TrendingMonthly with Double = js.native
  
  /**
    * The results will be sorted as per Trending weekly Score of the extensions
    */
  @js.native
  sealed trait TrendingWeekly extends SortByType
  /* 8 */ val TrendingWeekly: typingsSlinky.vsoNodeApi.galleryInterfacesMod.SortByType.TrendingWeekly with Double = js.native
  
  /**
    * The results will be sorted as per Weighted Rating of the extension.
    */
  @js.native
  sealed trait WeightedRating extends SortByType
  /* 12 */ val WeightedRating: typingsSlinky.vsoNodeApi.galleryInterfacesMod.SortByType.WeightedRating with Double = js.native
}

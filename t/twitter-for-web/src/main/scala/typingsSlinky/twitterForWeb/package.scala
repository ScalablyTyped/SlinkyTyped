package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object twitterForWeb {
  /**
    * Base type for TwitterTimelineWidgetOptions. TwitterTimelineWidgetOptions can
    * use all options of tweet widgets and button widgets
    */
  type TwitterTimelineWidgetBaseOptions = typingsSlinky.twitterForWeb.TwitterTweetWidgetOptions with typingsSlinky.twitterForWeb.TwitterButtonWidgetOptions
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.twitterForWeb.TwitterTimelineWidgetProfileDataSource
    - typingsSlinky.twitterForWeb.TwitterTimelineWidgetLikesDataSource
    - typingsSlinky.twitterForWeb.TwitterTimelineWidgetListDataSource
    - typingsSlinky.twitterForWeb.TwitterTimelineWidgetCollectionDataSource
    - typingsSlinky.twitterForWeb.TwitterTimelineWidgetUrlDataSource
    - java.lang.String
  */
  type TwitterTimelineWidgetDataSource = typingsSlinky.twitterForWeb._TwitterTimelineWidgetDataSource | java.lang.String
}

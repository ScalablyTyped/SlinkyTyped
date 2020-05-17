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
}

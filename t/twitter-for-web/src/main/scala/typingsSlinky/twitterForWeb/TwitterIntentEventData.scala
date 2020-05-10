package typingsSlinky.twitterForWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for a data relevants to the Web Intent just actioned.
  */
@js.native
trait TwitterIntentEventData extends js.Object {
  /**
    * The screen_name of a user;
    */
  var screen_name: js.UndefOr[String] = js.native
  /**
    * The ID of a source Tweet.
    */
  var source_tweet_id: js.UndefOr[String] = js.native
  /**
    * The ID of a Tweet.
    */
  var tweet_id: js.UndefOr[String] = js.native
  /**
    * The ID of a user.
    */
  var user_id: js.UndefOr[String] = js.native
}

object TwitterIntentEventData {
  @scala.inline
  def apply(): TwitterIntentEventData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwitterIntentEventData]
  }
  @scala.inline
  implicit class TwitterIntentEventDataOps[Self <: TwitterIntentEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScreen_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreen_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen_name")(js.undefined)
        ret
    }
    @scala.inline
    def withSource_tweet_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_tweet_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource_tweet_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_tweet_id")(js.undefined)
        ret
    }
    @scala.inline
    def withTweet_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tweet_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTweet_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tweet_id")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(js.undefined)
        ret
    }
  }
  
}


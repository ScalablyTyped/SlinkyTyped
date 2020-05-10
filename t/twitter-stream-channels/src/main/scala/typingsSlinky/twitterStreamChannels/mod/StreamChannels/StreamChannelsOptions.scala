package typingsSlinky.twitterStreamChannels.mod.StreamChannels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamChannelsOptions extends js.Object {
  var enableChannelsEvents: js.UndefOr[Boolean] = js.native
  var enableKeywordsEvents: js.UndefOr[Boolean] = js.native
  var enableRootChannelsEvent: js.UndefOr[Boolean] = js.native
  var follow: js.UndefOr[String] = js.native
  var locations: js.UndefOr[String] = js.native
  var track: js.UndefOr[js.Object] = js.native
}

object StreamChannelsOptions {
  @scala.inline
  def apply(): StreamChannelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamChannelsOptions]
  }
  @scala.inline
  implicit class StreamChannelsOptionsOps[Self <: StreamChannelsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableChannelsEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableChannelsEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableChannelsEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableChannelsEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableKeywordsEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKeywordsEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableKeywordsEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKeywordsEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRootChannelsEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRootChannelsEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRootChannelsEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRootChannelsEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withFollow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(js.undefined)
        ret
    }
    @scala.inline
    def withLocations(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(js.undefined)
        ret
    }
    @scala.inline
    def withTrack(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(js.undefined)
        ret
    }
  }
  
}


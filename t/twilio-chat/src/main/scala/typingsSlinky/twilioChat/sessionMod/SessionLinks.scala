package typingsSlinky.twilioChat.sessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionLinks extends js.Object {
  var mediaServiceUrl: String = js.native
  var myChannelsUrl: String = js.native
  var publicChannelsUrl: String = js.native
  var syncListUrl: String = js.native
  var typingUrl: String = js.native
  var usersUrl: String = js.native
}

object SessionLinks {
  @scala.inline
  def apply(
    mediaServiceUrl: String,
    myChannelsUrl: String,
    publicChannelsUrl: String,
    syncListUrl: String,
    typingUrl: String,
    usersUrl: String
  ): SessionLinks = {
    val __obj = js.Dynamic.literal(mediaServiceUrl = mediaServiceUrl.asInstanceOf[js.Any], myChannelsUrl = myChannelsUrl.asInstanceOf[js.Any], publicChannelsUrl = publicChannelsUrl.asInstanceOf[js.Any], syncListUrl = syncListUrl.asInstanceOf[js.Any], typingUrl = typingUrl.asInstanceOf[js.Any], usersUrl = usersUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionLinks]
  }
  @scala.inline
  implicit class SessionLinksOps[Self <: SessionLinks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMediaServiceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaServiceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMyChannelsUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("myChannelsUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicChannelsUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicChannelsUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyncListUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncListUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypingUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typingUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsersUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usersUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


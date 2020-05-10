package typingsSlinky.twit.mod.Twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entities extends js.Object {
  var hashtags: js.Array[HashtagEntity] = js.native
  var media: js.Array[MediaEntity] = js.native
  var urls: js.Array[UrlEntity] = js.native
  var user_mentions: js.Array[UserMentionEntity] = js.native
}

object Entities {
  @scala.inline
  def apply(
    hashtags: js.Array[HashtagEntity],
    media: js.Array[MediaEntity],
    urls: js.Array[UrlEntity],
    user_mentions: js.Array[UserMentionEntity]
  ): Entities = {
    val __obj = js.Dynamic.literal(hashtags = hashtags.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], user_mentions = user_mentions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entities]
  }
  @scala.inline
  implicit class EntitiesOps[Self <: Entities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHashtags(value: js.Array[HashtagEntity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia(value: js.Array[MediaEntity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrls(value: js.Array[UrlEntity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_mentions(value: js.Array[UserMentionEntity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_mentions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


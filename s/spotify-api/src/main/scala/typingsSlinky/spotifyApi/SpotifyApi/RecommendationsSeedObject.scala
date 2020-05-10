package typingsSlinky.spotifyApi.SpotifyApi

import typingsSlinky.spotifyApi.spotifyApiStrings.artist
import typingsSlinky.spotifyApi.spotifyApiStrings.genre
import typingsSlinky.spotifyApi.spotifyApiStrings.track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Recommendations Seed Object
  * [](https://developer.spotify.com/web-api/object-model/#recommendations-seed-object)
  */
@js.native
trait RecommendationsSeedObject extends js.Object {
  var afterFilteringSize: Double = js.native
  var afterRelinkingSize: Double = js.native
  var href: String = js.native
  var id: String = js.native
  var initialPoolSize: Double = js.native
  var `type`: artist | track | genre = js.native
}

object RecommendationsSeedObject {
  @scala.inline
  def apply(
    afterFilteringSize: Double,
    afterRelinkingSize: Double,
    href: String,
    id: String,
    initialPoolSize: Double,
    `type`: artist | track | genre
  ): RecommendationsSeedObject = {
    val __obj = js.Dynamic.literal(afterFilteringSize = afterFilteringSize.asInstanceOf[js.Any], afterRelinkingSize = afterRelinkingSize.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initialPoolSize = initialPoolSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendationsSeedObject]
  }
  @scala.inline
  implicit class RecommendationsSeedObjectOps[Self <: RecommendationsSeedObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterFilteringSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterFilteringSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterRelinkingSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRelinkingSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialPoolSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPoolSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: artist | track | genre): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


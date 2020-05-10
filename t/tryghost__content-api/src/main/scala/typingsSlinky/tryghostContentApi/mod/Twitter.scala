package typingsSlinky.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Twitter extends js.Object {
  var twitter_description: js.UndefOr[Nullable[String]] = js.native
  var twitter_image: js.UndefOr[Nullable[String]] = js.native
  var twitter_title: js.UndefOr[Nullable[String]] = js.native
}

object Twitter {
  @scala.inline
  def apply(): Twitter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Twitter]
  }
  @scala.inline
  implicit class TwitterOps[Self <: Twitter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTwitter_description(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twitter_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTwitter_description: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twitter_description")(js.undefined)
        ret
    }
    @scala.inline
    def withTwitter_descriptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twitter_description")(null)
        ret
    }
    @scala.inline
    def withTwitter_image(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twitter_image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTwitter_image: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twitter_image")(js.undefined)
        ret
    }
    @scala.inline
    def withTwitter_imageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twitter_image")(null)
        ret
    }
    @scala.inline
    def withTwitter_title(value: Nullable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twitter_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTwitter_title: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twitter_title")(js.undefined)
        ret
    }
    @scala.inline
    def withTwitter_titleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twitter_title")(null)
        ret
    }
  }
  
}


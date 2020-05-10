package typingsSlinky.shopifyPrime.blogMod

import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import typingsSlinky.shopifyPrime.blogCommentableMod.BlogCommentable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blog extends ShopifyObject {
  /**
    * Indicates whether readers can post comments to the blog and if comments are moderated or not. Possible values are:
    * "no" (default): Readers cannot post comments to blog articles.
    * "moderate": Readers can post comments to blog articles, but comments must be moderated before they appear.
    * "yes": Readers can post comments to blog articles without moderation.
    */
  var commentable: js.UndefOr[BlogCommentable] = js.native
  /**
    * The date and time the blog was created.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * Feedburner is a web feed management provider and can be enabled to provide custom RSS feeds for Shopify bloggers. This property will default to blank or null unless feedburner is enabled through the shop admin.
    * Shopify does not document the value type for this property.
    */
  var feedburner: js.UndefOr[js.Any] = js.native
  /**
    * URL to the feedburner location for blogs that have enabled feedburner through their store admin.
    */
  var feedburner_url: js.UndefOr[String] = js.native
  /**
    * A human-friendly unique string for a blog automatically generated from its title. This handle is used by the Liquid templating language to refer to the blog.
    */
  var handle: js.UndefOr[String] = js.native
  /**
    * Tags are additional short descriptors formatted as a string of comma-separated values. For example, if an article has three tags: tag1, tag2, tag3.
    */
  var tags: js.UndefOr[String] = js.native
  /**
    * States the name of the template a blog is using if it is using an alternate template. If a blog is using the default blog.liquid template, the value returned is "null".
    */
  var template_suffix: js.UndefOr[String] = js.native
  /**
    * The title of the blog.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The date and time when changes were last made to the blog's properties. Note that this is not updated when creating, modifying or deleting articles in the blog.
    */
  var updated_at: js.UndefOr[String] = js.native
}

object Blog {
  @scala.inline
  def apply(): Blog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Blog]
  }
  @scala.inline
  implicit class BlogOps[Self <: Blog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommentable(value: BlogCommentable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentable")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(js.undefined)
        ret
    }
    @scala.inline
    def withFeedburner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedburner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeedburner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedburner")(js.undefined)
        ret
    }
    @scala.inline
    def withFeedburner_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedburner_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeedburner_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedburner_url")(js.undefined)
        ret
    }
    @scala.inline
    def withHandle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate_suffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate_suffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_suffix")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(js.undefined)
        ret
    }
  }
  
}


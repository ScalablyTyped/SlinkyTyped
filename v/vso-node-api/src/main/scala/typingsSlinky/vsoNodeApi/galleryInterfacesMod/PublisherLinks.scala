package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublisherLinks extends js.Object {
  /**
    * URL for company website
    */
  var company: Link = js.native
  /**
    * URL for publisher logo if CDN is down
    */
  var fallbackLogo: Link = js.native
  /**
    * URL for publisher LinkedIn profile
    */
  var linkedIn: Link = js.native
  /**
    * CDN URL for publisher logo
    */
  var logo: Link = js.native
  /**
    * URL for publisher public profile page
    */
  var profile: Link = js.native
  /**
    * URL for source code repo
    */
  var sourceCode: Link = js.native
  /**
    * URL or email id for support
    */
  var support: Link = js.native
  /**
    * URL for Twitter handle of publisher company
    */
  var twitter: Link = js.native
}

object PublisherLinks {
  @scala.inline
  def apply(
    company: Link,
    fallbackLogo: Link,
    linkedIn: Link,
    logo: Link,
    profile: Link,
    sourceCode: Link,
    support: Link,
    twitter: Link
  ): PublisherLinks = {
    val __obj = js.Dynamic.literal(company = company.asInstanceOf[js.Any], fallbackLogo = fallbackLogo.asInstanceOf[js.Any], linkedIn = linkedIn.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], sourceCode = sourceCode.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any], twitter = twitter.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublisherLinks]
  }
  @scala.inline
  implicit class PublisherLinksOps[Self <: PublisherLinks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompany(value: Link): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFallbackLogo(value: Link): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackLogo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkedIn(value: Link): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogo(value: Link): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile(value: Link): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceCode(value: Link): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupport(value: Link): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("support")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwitter(value: Link): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twitter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


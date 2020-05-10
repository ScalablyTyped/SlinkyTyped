package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object defining which URL to crawl and how to crawl it. */
@js.native
trait SourceOptionsWebCrawl extends js.Object {
  /** When `true`, allows the crawl to interact with HTTPS sites with SSL certificates with untrusted signers. */
  var allow_untrusted_certificate: js.UndefOr[Boolean] = js.native
  /** The number of concurrent URLs to fetch. `gentle` means one URL is fetched at a time with a delay between each call. `normal` means as many as two URLs are fectched concurrently with a short delay between fetch calls. `aggressive` means that up to ten URLs are fetched concurrently with a short delay between fetch calls. */
  var crawl_speed: js.UndefOr[String] = js.native
  /** When `true`, crawls of the specified URL are limited to the host part of the **url** field. */
  var limit_to_starting_hosts: js.UndefOr[Boolean] = js.native
  /** The maximum number of hops to make from the initial URL. When a page is crawled each link on that page will also be crawled if it is within the **maximum_hops** from the initial URL. The first page crawled is 0 hops, each link crawled from the first page is 1 hop, each link crawled from those pages is 2 hops, and so on. */
  var maximum_hops: js.UndefOr[Double] = js.native
  /** When `true`, the crawler will ignore any `robots.txt` encountered by the crawler. This should only ever be done when crawling a web site the user owns. This must be be set to `true` when a **gateway_id** is specied in the **credentials**. */
  var override_robots_txt: js.UndefOr[Boolean] = js.native
  /** The maximum milliseconds to wait for a response from the web server. */
  var request_timeout: js.UndefOr[Double] = js.native
  /** The starting URL to crawl. */
  var url: String = js.native
}

object SourceOptionsWebCrawl {
  @scala.inline
  def apply(url: String): SourceOptionsWebCrawl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceOptionsWebCrawl]
  }
  @scala.inline
  implicit class SourceOptionsWebCrawlOps[Self <: SourceOptionsWebCrawl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllow_untrusted_certificate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_untrusted_certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_untrusted_certificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_untrusted_certificate")(js.undefined)
        ret
    }
    @scala.inline
    def withCrawl_speed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crawl_speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrawl_speed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crawl_speed")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit_to_starting_hosts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit_to_starting_hosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit_to_starting_hosts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit_to_starting_hosts")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximum_hops(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum_hops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximum_hops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum_hops")(js.undefined)
        ret
    }
    @scala.inline
    def withOverride_robots_txt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("override_robots_txt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverride_robots_txt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("override_robots_txt")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest_timeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest_timeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_timeout")(js.undefined)
        ret
    }
  }
  
}


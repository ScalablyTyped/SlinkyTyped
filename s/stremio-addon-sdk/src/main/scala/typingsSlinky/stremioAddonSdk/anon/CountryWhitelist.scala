package typingsSlinky.stremioAddonSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountryWhitelist extends js.Object {
  /**
    * Hints it's restricted to particular countries.
    *
    * Array of ISO 3166-1 alpha-3 country codes in lowercase in which the stream is accessible.
    */
  var countryWhitelist: js.UndefOr[js.Array[String]] = js.native
  /**
    * If defined, addons with the same behaviorHints.group will be chosen automatically for binge watching.
    *
    * This should be something that identifies the stream's nature within your addon.
    * For example, if your addon is called "gobsAddon", and the stream is 720p, the group should be "gobsAddon-720p".
    * If the next episode has a stream with the same group, stremio should select that stream implicitly.
    */
  var group: js.UndefOr[String] = js.native
  /**
    * **Not implemented yet!**
    *
    * HTTP headers to use when trying to playback url.
    * Only applies to urls.
    *
    * @readonly
    * @ignore
    */
  var headers: js.UndefOr[js.Any] = js.native
  /**
    * Applies if the protocol of the url is http(s).
    *
    * Needs to be set to true if the URL does not support https or is not an MP4 file.
    */
  var notWebReady: js.UndefOr[Boolean] = js.native
}

object CountryWhitelist {
  @scala.inline
  def apply(): CountryWhitelist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountryWhitelist]
  }
  @scala.inline
  implicit class CountryWhitelistOps[Self <: CountryWhitelist] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountryWhitelist(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryWhitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryWhitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryWhitelist")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withNotWebReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notWebReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotWebReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notWebReady")(js.undefined)
        ret
    }
  }
  
}


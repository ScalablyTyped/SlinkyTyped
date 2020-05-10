package typingsSlinky.tryghostContentApi.mod

import typingsSlinky.tryghostContentApi.tryghostContentApiStrings.canary
import typingsSlinky.tryghostContentApi.tryghostContentApiStrings.v2
import typingsSlinky.tryghostContentApi.tryghostContentApiStrings.v3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GhostContentAPIOptions extends js.Object {
  /** @default "ghost" */
  var ghostPath: js.UndefOr[String] = js.native
  /** @deprecated since version v2 */
  var host: js.UndefOr[String] = js.native
  var key: String = js.native
  var url: String = js.native
  /**
    * Version of GhostContentAPI
    *
    * Supported Versions: 'v2', 'v3', 'canary'
    */
  var version: v2 | v3 | canary = js.native
}

object GhostContentAPIOptions {
  @scala.inline
  def apply(key: String, url: String, version: v2 | v3 | canary): GhostContentAPIOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostContentAPIOptions]
  }
  @scala.inline
  implicit class GhostContentAPIOptionsOps[Self <: GhostContentAPIOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: v2 | v3 | canary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhostPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGhostPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostPath")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
  }
  
}


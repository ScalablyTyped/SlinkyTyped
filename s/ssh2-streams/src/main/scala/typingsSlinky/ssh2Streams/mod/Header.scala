package typingsSlinky.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Header extends js.Object {
  /**
    * Any text that comes after the software name/version.
    */
  var comments: String = js.native
  /**
    * (Client-only) An optional greeting message presented by the server.
    */
  var greeting: js.UndefOr[String] = js.native
  /**
    * The raw identification string sent by the remote party.
    */
  var identRaw: String = js.native
  /**
    * Contains various version information parsed from identRaw.
    */
  var versions: Versions = js.native
}

object Header {
  @scala.inline
  def apply(comments: String, identRaw: String, versions: Versions): Header = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], identRaw = identRaw.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  @scala.inline
  implicit class HeaderOps[Self <: Header] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentRaw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersions(value: Versions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGreeting(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greeting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreeting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greeting")(js.undefined)
        ret
    }
  }
  
}


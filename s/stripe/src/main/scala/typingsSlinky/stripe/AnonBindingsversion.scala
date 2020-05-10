package typingsSlinky.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBindingsversion extends js.Object {
  var bindings_version: String = js.native
  var lang: String = js.native
  var lang_version: String = js.native
  var platform: String = js.native
  var publisher: String = js.native
  var uname: String = js.native
}

object AnonBindingsversion {
  @scala.inline
  def apply(
    bindings_version: String,
    lang: String,
    lang_version: String,
    platform: String,
    publisher: String,
    uname: String
  ): AnonBindingsversion = {
    val __obj = js.Dynamic.literal(bindings_version = bindings_version.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], lang_version = lang_version.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], uname = uname.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBindingsversion]
  }
  @scala.inline
  implicit class AnonBindingsversionOps[Self <: AnonBindingsversion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindings_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLang_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisher(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uname")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


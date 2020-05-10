package typingsSlinky.squirrelly.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  @JSName("$cache")
  var $cache: js.UndefOr[Boolean] = js.native
  @JSName("$file")
  var $file: js.UndefOr[String] = js.native
  @JSName("$name")
  var $name: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$cache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$cache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$cache")(js.undefined)
        ret
    }
    @scala.inline
    def with$file(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$file: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$file")(js.undefined)
        ret
    }
    @scala.inline
    def with$name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$name")(js.undefined)
        ret
    }
  }
  
}


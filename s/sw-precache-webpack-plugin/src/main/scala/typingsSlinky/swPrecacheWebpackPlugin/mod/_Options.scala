package typingsSlinky.swPrecacheWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// workaround to override parent types
@js.native
trait _Options
  extends typingsSlinky.swPrecache.mod.Options {
  @JSName("importScripts")
  var importScripts__Options: js.UndefOr[js.Any] = js.native
}

object _Options {
  @scala.inline
  def apply(): _Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_Options]
  }
  @scala.inline
  implicit class _OptionsOps[Self <: _Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImportScripts(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importScripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportScripts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importScripts")(js.undefined)
        ret
    }
  }
  
}


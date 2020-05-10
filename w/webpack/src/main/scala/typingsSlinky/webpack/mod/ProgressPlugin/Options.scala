package typingsSlinky.webpack.mod.ProgressPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Show active modules count and one active module in progress message
    * Default: true
    */
  var activeModules: js.UndefOr[Boolean] = js.native
  /**
    * Show entries count in progress message
    * Default: false
    */
  var entries: js.UndefOr[Boolean] = js.native
  /**
    * Function that executes for every progress step
    */
  var handler: js.UndefOr[Handler] = js.native
  /**
    * Show modules count in progress message
    * Default: true
    */
  var modules: js.UndefOr[Boolean] = js.native
  /**
    * Minimum modules count to start with, only for mode = modules
    * Default: 500
    */
  var modulesCount: js.UndefOr[Double] = js.native
  /**
    * Collect profile data for progress steps
    * Default: false
    */
  var profile: js.UndefOr[Boolean | Null] = js.native
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
    def withActiveModules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeModules")(js.undefined)
        ret
    }
    @scala.inline
    def withEntries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(js.undefined)
        ret
    }
    @scala.inline
    def withHandler(value: (/* percentage */ Double, /* msg */ String, /* repeated */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.undefined)
        ret
    }
    @scala.inline
    def withModules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(js.undefined)
        ret
    }
    @scala.inline
    def withModulesCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulesCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModulesCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulesCount")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(null)
        ret
    }
  }
  
}


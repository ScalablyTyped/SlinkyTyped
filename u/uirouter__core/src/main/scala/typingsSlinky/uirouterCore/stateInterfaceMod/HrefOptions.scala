package typingsSlinky.uirouterCore.stateInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HrefOptions extends js.Object {
  /**
    * If true will generate an absolute url, e.g. `http://www.example.com/fullurl`.
    */
  var absolute: js.UndefOr[Boolean] = js.native
  /**
    * If `true` will inherit parameters from the current parameter values.
    */
  var inherit: js.UndefOr[Boolean] = js.native
  /**
    * If true, and if there is no url associated with the state provided in the
    *    first parameter, then the constructed href url will be built from the first
    *    ancestor which has a url.
    */
  var lossy: js.UndefOr[Boolean] = js.native
  /**
    * Defines what state to be "relative from"
    *
    * When a relative path is found (e.g `^` or `.bar`), defines which state to be relative from.
    */
  var relative: js.UndefOr[StateOrName] = js.native
}

object HrefOptions {
  @scala.inline
  def apply(): HrefOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HrefOptions]
  }
  @scala.inline
  implicit class HrefOptionsOps[Self <: HrefOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsolute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsolute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolute")(js.undefined)
        ret
    }
    @scala.inline
    def withInherit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInherit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(js.undefined)
        ret
    }
    @scala.inline
    def withLossy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lossy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLossy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lossy")(js.undefined)
        ret
    }
    @scala.inline
    def withRelative(value: StateOrName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative")(js.undefined)
        ret
    }
  }
  
}


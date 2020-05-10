package typingsSlinky.uifabricUtilities.classNamesFunctionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClassNamesFunctionOptions extends js.Object {
  /**
    * Disables class caching for scenarios where styleProp parts mutate frequently.
    */
  var disableCaching: js.UndefOr[Boolean] = js.native
}

object IClassNamesFunctionOptions {
  @scala.inline
  def apply(): IClassNamesFunctionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClassNamesFunctionOptions]
  }
  @scala.inline
  implicit class IClassNamesFunctionOptionsOps[Self <: IClassNamesFunctionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableCaching(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCaching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableCaching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCaching")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.sortablejs.pluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwapOptions extends js.Object {
  /**
    * Enable swap mode
    */
  var swap: js.UndefOr[Boolean] = js.native
  /**
    * Class name for swap item (if swap mode is enabled)
    */
  var swapClass: js.UndefOr[String] = js.native
}

object SwapOptions {
  @scala.inline
  def apply(): SwapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwapOptions]
  }
  @scala.inline
  implicit class SwapOptionsOps[Self <: SwapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSwap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swap")(js.undefined)
        ret
    }
    @scala.inline
    def withSwapClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwapClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapClass")(js.undefined)
        ret
    }
  }
  
}


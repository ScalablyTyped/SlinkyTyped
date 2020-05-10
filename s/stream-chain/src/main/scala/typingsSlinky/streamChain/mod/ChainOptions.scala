package typingsSlinky.streamChain.mod

import typingsSlinky.node.streamMod.DuplexOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainOptions extends DuplexOptions {
  var skipEvents: js.UndefOr[Boolean] = js.native
}

object ChainOptions {
  @scala.inline
  def apply(): ChainOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChainOptions]
  }
  @scala.inline
  implicit class ChainOptionsOps[Self <: ChainOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSkipEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipEvents")(js.undefined)
        ret
    }
  }
  
}


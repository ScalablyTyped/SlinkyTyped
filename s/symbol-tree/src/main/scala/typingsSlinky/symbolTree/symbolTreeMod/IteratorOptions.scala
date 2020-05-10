package typingsSlinky.symbolTree.symbolTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IteratorOptions extends js.Object {
  /**
  		 * Whether to iterate in reverse tree order.
  		 *
  		 * @default false
  		 */
  var reverse: js.UndefOr[Boolean] = js.native
}

object IteratorOptions {
  @scala.inline
  def apply(): IteratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IteratorOptions]
  }
  @scala.inline
  implicit class IteratorOptionsOps[Self <: IteratorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(js.undefined)
        ret
    }
  }
  
}


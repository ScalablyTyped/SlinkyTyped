package typingsSlinky.shopifyPrime.optionsBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOptions extends BasicListOptions {
  /**
    * Restricts results to those created after the given id.
    */
  var since_id: js.UndefOr[Double] = js.native
}

object ListOptions {
  @scala.inline
  def apply(): ListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOptions]
  }
  @scala.inline
  implicit class ListOptionsOps[Self <: ListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSince_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSince_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since_id")(js.undefined)
        ret
    }
  }
  
}


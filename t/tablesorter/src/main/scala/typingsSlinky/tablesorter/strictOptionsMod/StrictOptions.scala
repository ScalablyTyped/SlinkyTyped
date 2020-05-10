package typingsSlinky.tablesorter.strictOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictOptions extends js.Object {
  /**
    * A value indicatin whether only exact matching values should be included.
    */
  var exactMatch: js.UndefOr[Boolean] = js.native
}

object StrictOptions {
  @scala.inline
  def apply(): StrictOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictOptions]
  }
  @scala.inline
  implicit class StrictOptionsOps[Self <: StrictOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExactMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExactMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactMatch")(js.undefined)
        ret
    }
  }
  
}


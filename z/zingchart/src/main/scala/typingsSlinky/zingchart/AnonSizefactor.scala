package typingsSlinky.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSizefactor extends js.Object {
  /**
    * To modify the size of the chart. Provide a value in relation to 1.0 or 100%. 0.3 | 0.9 | "30%" | "90%" | ...
    */
  var `size-factor`: js.UndefOr[Double] = js.native
}

object AnonSizefactor {
  @scala.inline
  def apply(): AnonSizefactor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSizefactor]
  }
  @scala.inline
  implicit class AnonSizefactorOps[Self <: AnonSizefactor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withSize-factor`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size-factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSize-factor`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size-factor")(js.undefined)
        ret
    }
  }
  
}


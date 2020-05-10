package typingsSlinky.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdUnitId extends js.Object {
  /**
    * 广告单元 id
    */
  var adUnitId: String = js.native
}

object AnonAdUnitId {
  @scala.inline
  def apply(adUnitId: String): AnonAdUnitId = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdUnitId]
  }
  @scala.inline
  implicit class AnonAdUnitIdOps[Self <: AnonAdUnitId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdUnitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adUnitId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


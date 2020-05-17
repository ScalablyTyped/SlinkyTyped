package typingsSlinky.wxJsSdkDt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalIds extends js.Object {
  var localIds: js.Array[String] = js.native
}

object LocalIds {
  @scala.inline
  def apply(localIds: js.Array[String]): LocalIds = {
    val __obj = js.Dynamic.literal(localIds = localIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalIds]
  }
  @scala.inline
  implicit class LocalIdsOps[Self <: LocalIds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


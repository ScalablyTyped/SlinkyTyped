package typingsSlinky.vsoNodeApi.coreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityData extends js.Object {
  var identityIds: js.Array[String] = js.native
}

object IdentityData {
  @scala.inline
  def apply(identityIds: js.Array[String]): IdentityData = {
    val __obj = js.Dynamic.literal(identityIds = identityIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityData]
  }
  @scala.inline
  implicit class IdentityDataOps[Self <: IdentityData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentityIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


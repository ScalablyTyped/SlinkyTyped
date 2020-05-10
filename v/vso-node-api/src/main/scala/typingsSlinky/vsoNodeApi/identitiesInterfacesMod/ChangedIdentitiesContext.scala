package typingsSlinky.vsoNodeApi.identitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangedIdentitiesContext extends js.Object {
  /**
    * Last Group SequenceId
    */
  var groupSequenceId: Double = js.native
  /**
    * Last Identity SequenceId
    */
  var identitySequenceId: Double = js.native
}

object ChangedIdentitiesContext {
  @scala.inline
  def apply(groupSequenceId: Double, identitySequenceId: Double): ChangedIdentitiesContext = {
    val __obj = js.Dynamic.literal(groupSequenceId = groupSequenceId.asInstanceOf[js.Any], identitySequenceId = identitySequenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedIdentitiesContext]
  }
  @scala.inline
  implicit class ChangedIdentitiesContextOps[Self <: ChangedIdentitiesContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupSequenceId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSequenceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentitySequenceId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identitySequenceId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


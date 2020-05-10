package typingsSlinky.vsoNodeApi.identitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangedIdentities extends js.Object {
  /**
    * Changed Identities
    */
  var identities: js.Array[Identity] = js.native
  /**
    * Last Identity SequenceId
    */
  var sequenceContext: ChangedIdentitiesContext = js.native
}

object ChangedIdentities {
  @scala.inline
  def apply(identities: js.Array[Identity], sequenceContext: ChangedIdentitiesContext): ChangedIdentities = {
    val __obj = js.Dynamic.literal(identities = identities.asInstanceOf[js.Any], sequenceContext = sequenceContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedIdentities]
  }
  @scala.inline
  implicit class ChangedIdentitiesOps[Self <: ChangedIdentities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentities(value: js.Array[Identity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequenceContext(value: ChangedIdentitiesContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceContext")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


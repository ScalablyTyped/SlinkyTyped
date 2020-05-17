package typingsSlinky.winrtUwp.Windows.Networking.BackgroundTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A named group used to associate multiple download or upload operations. This class makes it easy for your app to create these groups and to complete downloads and uploads simultaneously, in serial, or based on priority. */
@js.native
trait BackgroundTransferGroup extends js.Object {
  /** Gets the name of the group. */
  var name: String = js.native
  /** Gets or sets the property used to specify if transfers within this group run simultaneously or in serial. Possible values are defined by BackgroundTransferBehavior . */
  var transferBehavior: BackgroundTransferBehavior = js.native
}

object BackgroundTransferGroup {
  @scala.inline
  def apply(name: String, transferBehavior: BackgroundTransferBehavior): BackgroundTransferGroup = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], transferBehavior = transferBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundTransferGroup]
  }
  @scala.inline
  implicit class BackgroundTransferGroupOps[Self <: BackgroundTransferGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransferBehavior(value: BackgroundTransferBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferBehavior")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


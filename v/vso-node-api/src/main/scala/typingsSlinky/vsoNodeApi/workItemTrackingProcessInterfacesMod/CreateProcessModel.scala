package typingsSlinky.vsoNodeApi.workItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProcessModel extends js.Object {
  /**
    * Description of the process
    */
  var description: String = js.native
  /**
    * Name of the process
    */
  var name: String = js.native
  /**
    * The ID of the parent process
    */
  var parentProcessTypeId: String = js.native
  /**
    * Reference name of the process
    */
  var referenceName: String = js.native
}

object CreateProcessModel {
  @scala.inline
  def apply(description: String, name: String, parentProcessTypeId: String, referenceName: String): CreateProcessModel = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentProcessTypeId = parentProcessTypeId.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProcessModel]
  }
  @scala.inline
  implicit class CreateProcessModelOps[Self <: CreateProcessModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentProcessTypeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentProcessTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferenceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.vsoNodeApi.workItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessProperties extends js.Object {
  /**
    * Class of the process
    */
  var `class`: ProcessClass = js.native
  /**
    * Is the process default process
    */
  var isDefault: Boolean = js.native
  /**
    * Is the process enabled
    */
  var isEnabled: Boolean = js.native
  /**
    * ID of the parent process
    */
  var parentProcessTypeId: String = js.native
  /**
    * Version of the process
    */
  var version: String = js.native
}

object ProcessProperties {
  @scala.inline
  def apply(
    `class`: ProcessClass,
    isDefault: Boolean,
    isEnabled: Boolean,
    parentProcessTypeId: String,
    version: String
  ): ProcessProperties = {
    val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], parentProcessTypeId = parentProcessTypeId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessProperties]
  }
  @scala.inline
  implicit class ProcessPropertiesOps[Self <: ProcessProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClass(value: ProcessClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentProcessTypeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentProcessTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


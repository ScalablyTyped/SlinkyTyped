package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcquisitionOptions extends js.Object {
  /**
    * Default Operation for the ItemId in this target
    */
  var defaultOperation: AcquisitionOperation = js.native
  /**
    * The item id that this options refer to
    */
  var itemId: String = js.native
  /**
    * Operations allowed for the ItemId in this target
    */
  var operations: js.Array[AcquisitionOperation] = js.native
  /**
    * Additional properties which can be added to the request.
    */
  var properties: js.Any = js.native
  /**
    * The target that this options refer to
    */
  var target: String = js.native
}

object AcquisitionOptions {
  @scala.inline
  def apply(
    defaultOperation: AcquisitionOperation,
    itemId: String,
    operations: js.Array[AcquisitionOperation],
    properties: js.Any,
    target: String
  ): AcquisitionOptions = {
    val __obj = js.Dynamic.literal(defaultOperation = defaultOperation.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcquisitionOptions]
  }
  @scala.inline
  implicit class AcquisitionOptionsOps[Self <: AcquisitionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultOperation(value: AcquisitionOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperations(value: js.Array[AcquisitionOperation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


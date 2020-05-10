package typingsSlinky.vsoNodeApi.distributedTaskCommonInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessParameters extends js.Object {
  var dataSourceBindings: js.Array[DataSourceBindingBase] = js.native
  var inputs: js.Array[TaskInputDefinitionBase] = js.native
  var sourceDefinitions: js.Array[TaskSourceDefinitionBase] = js.native
}

object ProcessParameters {
  @scala.inline
  def apply(
    dataSourceBindings: js.Array[DataSourceBindingBase],
    inputs: js.Array[TaskInputDefinitionBase],
    sourceDefinitions: js.Array[TaskSourceDefinitionBase]
  ): ProcessParameters = {
    val __obj = js.Dynamic.literal(dataSourceBindings = dataSourceBindings.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], sourceDefinitions = sourceDefinitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessParameters]
  }
  @scala.inline
  implicit class ProcessParametersOps[Self <: ProcessParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSourceBindings(value: js.Array[DataSourceBindingBase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceBindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputs(value: js.Array[TaskInputDefinitionBase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceDefinitions(value: js.Array[TaskSourceDefinitionBase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import typingsSlinky.vsoNodeApi.formInputInterfacesMod.InputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueDefinition extends js.Object {
  /**
    * Gets or sets the data source.
    */
  var dataSource: js.Array[InputValue] = js.native
  /**
    * Gets or sets the rest end point.
    */
  var endPoint: String = js.native
  /**
    * Gets or sets the result template.
    */
  var resultTemplate: String = js.native
}

object ValueDefinition {
  @scala.inline
  def apply(dataSource: js.Array[InputValue], endPoint: String, resultTemplate: String): ValueDefinition = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], endPoint = endPoint.asInstanceOf[js.Any], resultTemplate = resultTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDefinition]
  }
  @scala.inline
  implicit class ValueDefinitionOps[Self <: ValueDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSource(value: js.Array[InputValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndPoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultTemplate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointUrl extends js.Object {
  var dependsOn: DependsOn = js.native
  var displayName: String = js.native
  var helpText: String = js.native
  var isVisible: String = js.native
  var value: String = js.native
}

object EndpointUrl {
  @scala.inline
  def apply(dependsOn: DependsOn, displayName: String, helpText: String, isVisible: String, value: String): EndpointUrl = {
    val __obj = js.Dynamic.literal(dependsOn = dependsOn.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], helpText = helpText.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointUrl]
  }
  @scala.inline
  implicit class EndpointUrlOps[Self <: EndpointUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDependsOn(value: DependsOn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependsOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVisible(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


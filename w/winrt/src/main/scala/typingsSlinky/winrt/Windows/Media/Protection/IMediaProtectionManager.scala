package typingsSlinky.winrt.Windows.Media.Protection

import typingsSlinky.winrt.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMediaProtectionManager extends js.Object {
  var oncomponentloadfailed: js.Any = js.native
  var onrebootneeded: js.Any = js.native
  var onservicerequested: js.Any = js.native
  var properties: IPropertySet = js.native
}

object IMediaProtectionManager {
  @scala.inline
  def apply(
    oncomponentloadfailed: js.Any,
    onrebootneeded: js.Any,
    onservicerequested: js.Any,
    properties: IPropertySet
  ): IMediaProtectionManager = {
    val __obj = js.Dynamic.literal(oncomponentloadfailed = oncomponentloadfailed.asInstanceOf[js.Any], onrebootneeded = onrebootneeded.asInstanceOf[js.Any], onservicerequested = onservicerequested.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaProtectionManager]
  }
  @scala.inline
  implicit class IMediaProtectionManagerOps[Self <: IMediaProtectionManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOncomponentloadfailed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncomponentloadfailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnrebootneeded(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onrebootneeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnservicerequested(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onservicerequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: IPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


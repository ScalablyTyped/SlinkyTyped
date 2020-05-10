package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionStatisticUpdate extends js.Object {
  var extensionName: String = js.native
  var operation: ExtensionStatisticOperation = js.native
  var publisherName: String = js.native
  var statistic: ExtensionStatistic = js.native
}

object ExtensionStatisticUpdate {
  @scala.inline
  def apply(
    extensionName: String,
    operation: ExtensionStatisticOperation,
    publisherName: String,
    statistic: ExtensionStatistic
  ): ExtensionStatisticUpdate = {
    val __obj = js.Dynamic.literal(extensionName = extensionName.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any], statistic = statistic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionStatisticUpdate]
  }
  @scala.inline
  implicit class ExtensionStatisticUpdateOps[Self <: ExtensionStatisticUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtensionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperation(value: ExtensionStatisticOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisherName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatistic(value: ExtensionStatistic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistic")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


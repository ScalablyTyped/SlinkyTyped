package typingsSlinky.vsoNodeApi.dashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WidgetMetadataResponse extends js.Object {
  var uri: String = js.native
  var widgetMetadata: WidgetMetadata = js.native
}

object WidgetMetadataResponse {
  @scala.inline
  def apply(uri: String, widgetMetadata: WidgetMetadata): WidgetMetadataResponse = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any], widgetMetadata = widgetMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetMetadataResponse]
  }
  @scala.inline
  implicit class WidgetMetadataResponseOps[Self <: WidgetMetadataResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidgetMetadata(value: WidgetMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgetMetadata")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


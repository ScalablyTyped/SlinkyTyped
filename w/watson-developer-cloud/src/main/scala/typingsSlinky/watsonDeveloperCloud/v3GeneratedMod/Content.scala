package typingsSlinky.watsonDeveloperCloud.v3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Content. */
@js.native
trait Content extends js.Object {
  /** An array of `ContentItem` objects that provides the text that is to be analyzed. */
  var content_items: js.Array[ContentItem] = js.native
}

object Content {
  @scala.inline
  def apply(content_items: js.Array[ContentItem]): Content = {
    val __obj = js.Dynamic.literal(content_items = content_items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  @scala.inline
  implicit class ContentOps[Self <: Content] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent_items(value: js.Array[ContentItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_items")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


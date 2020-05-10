package typingsSlinky.storybookAddonA11y

import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHighlightedElementsMap extends js.Object {
  var highlightedElementsMap: Map[_, _] = js.native
}

object AnonHighlightedElementsMap {
  @scala.inline
  def apply(highlightedElementsMap: Map[_, _]): AnonHighlightedElementsMap = {
    val __obj = js.Dynamic.literal(highlightedElementsMap = highlightedElementsMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHighlightedElementsMap]
  }
  @scala.inline
  implicit class AnonHighlightedElementsMapOps[Self <: AnonHighlightedElementsMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighlightedElementsMap(value: Map[_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedElementsMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


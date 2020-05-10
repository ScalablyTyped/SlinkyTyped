package typingsSlinky.titanium.Titanium.UI.iOS

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreviewContextEventMap extends ProxyEventMap {
  var peek: PreviewContextPeekEvent = js.native
  var pop: PreviewContextPopEvent = js.native
}

object PreviewContextEventMap {
  @scala.inline
  def apply(peek: PreviewContextPeekEvent, pop: PreviewContextPopEvent): PreviewContextEventMap = {
    val __obj = js.Dynamic.literal(peek = peek.asInstanceOf[js.Any], pop = pop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewContextEventMap]
  }
  @scala.inline
  implicit class PreviewContextEventMapOps[Self <: PreviewContextEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPeek(value: PreviewContextPeekEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPop(value: PreviewContextPopEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.stormReactDiagrams.linkModelMod

import typingsSlinky.stormReactDiagrams.BaseEventLinkModelLinkMod
import typingsSlinky.stormReactDiagrams.baseModelMod.BaseModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkModelListener extends BaseModelListener {
  var sourcePortChanged: js.UndefOr[js.Function1[/* event */ BaseEventLinkModelLinkMod, Unit]] = js.native
  var targetPortChanged: js.UndefOr[js.Function1[/* event */ BaseEventLinkModelLinkMod, Unit]] = js.native
}

object LinkModelListener {
  @scala.inline
  def apply(): LinkModelListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkModelListener]
  }
  @scala.inline
  implicit class LinkModelListenerOps[Self <: LinkModelListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourcePortChanged(value: /* event */ BaseEventLinkModelLinkMod => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePortChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSourcePortChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePortChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetPortChanged(value: /* event */ BaseEventLinkModelLinkMod => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPortChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTargetPortChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPortChanged")(js.undefined)
        ret
    }
  }
  
}


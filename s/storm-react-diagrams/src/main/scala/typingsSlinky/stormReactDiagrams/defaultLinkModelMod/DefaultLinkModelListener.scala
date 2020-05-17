package typingsSlinky.stormReactDiagrams.defaultLinkModelMod

import typingsSlinky.stormReactDiagrams.anon.BaseEventDefaultLinkModel
import typingsSlinky.stormReactDiagrams.anon.BaseEventDefaultLinkModelEntity
import typingsSlinky.stormReactDiagrams.linkModelMod.LinkModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultLinkModelListener extends LinkModelListener {
  var colorChanged: js.UndefOr[js.Function1[/* event */ BaseEventDefaultLinkModel, Unit]] = js.native
  var widthChanged: js.UndefOr[js.Function1[/* event */ BaseEventDefaultLinkModelEntity, Unit]] = js.native
}

object DefaultLinkModelListener {
  @scala.inline
  def apply(): DefaultLinkModelListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultLinkModelListener]
  }
  @scala.inline
  implicit class DefaultLinkModelListenerOps[Self <: DefaultLinkModelListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorChanged(value: /* event */ BaseEventDefaultLinkModel => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColorChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthChanged(value: /* event */ BaseEventDefaultLinkModelEntity => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWidthChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthChanged")(js.undefined)
        ret
    }
  }
  
}


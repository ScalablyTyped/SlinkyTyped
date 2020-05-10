package typingsSlinky.tabris

import typingsSlinky.tabris.mod.JSXChildren
import typingsSlinky.tabris.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon7[WidgetType /* <: Widget */] extends js.Object {
  var children: js.UndefOr[JSXChildren[WidgetType]] = js.native
}

object Anon7 {
  @scala.inline
  def apply[WidgetType](): Anon7[WidgetType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Anon7[WidgetType]]
  }
  @scala.inline
  implicit class Anon7Ops[Self[widgettype] <: Anon7[widgettype], WidgetType] (val x: Self[WidgetType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[WidgetType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[WidgetType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[WidgetType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[WidgetType] with Other]
    @scala.inline
    def withChildren(value: JSXChildren[WidgetType]): Self[WidgetType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[WidgetType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
  }
  
}


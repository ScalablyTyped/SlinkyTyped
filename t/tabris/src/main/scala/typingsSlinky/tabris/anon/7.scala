package typingsSlinky.tabris.anon

import typingsSlinky.tabris.mod.JSXChildren
import typingsSlinky.tabris.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `7`[WidgetType /* <: Widget */] extends js.Object {
  var children: js.UndefOr[JSXChildren[WidgetType]] = js.native
}

object `7` {
  @scala.inline
  def apply[WidgetType](): `7`[WidgetType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`7`[WidgetType]]
  }
  @scala.inline
  implicit class `7Ops`[Self[widgettype] <: `7`[widgettype], WidgetType] (val x: Self[WidgetType]) extends AnyVal {
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


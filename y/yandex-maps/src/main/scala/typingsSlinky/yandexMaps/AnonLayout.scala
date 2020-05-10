package typingsSlinky.yandexMaps

import typingsSlinky.yandexMaps.mod.IClassConstructor
import typingsSlinky.yandexMaps.mod.ISelectableControlLayout
import typingsSlinky.yandexMaps.yandexMapsStrings.selectable
import typingsSlinky.yandexMaps.yandexMapsStrings.separator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLayout extends js.Object {
  var layout: js.UndefOr[String | IClassConstructor[ISelectableControlLayout]] = js.native
  var selectOnClick: js.UndefOr[Boolean] = js.native
  var selectableLayout: js.UndefOr[String | IClassConstructor[ISelectableControlLayout]] = js.native
  var separatorLayout: js.UndefOr[String | IClassConstructor[ISelectableControlLayout]] = js.native
  var `type`: js.UndefOr[selectable | separator] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object AnonLayout {
  @scala.inline
  def apply(): AnonLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLayout]
  }
  @scala.inline
  implicit class AnonLayoutOps[Self <: AnonLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayout(value: String | IClassConstructor[ISelectableControlLayout]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectableLayout(value: String | IClassConstructor[ISelectableControlLayout]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectableLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparatorLayout(value: String | IClassConstructor[ISelectableControlLayout]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separatorLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparatorLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separatorLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: selectable | separator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}


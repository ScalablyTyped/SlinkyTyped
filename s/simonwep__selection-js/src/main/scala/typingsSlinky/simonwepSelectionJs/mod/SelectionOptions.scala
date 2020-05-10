package typingsSlinky.simonwepSelectionJs.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionOptions extends js.Object {
  var boundaries: js.UndefOr[js.Array[String]] = js.native
  var `class`: js.UndefOr[String] = js.native
  var disableTouch: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[Mode] = js.native
  var scrollSpeedDivider: js.UndefOr[Double] = js.native
  var selectables: js.UndefOr[js.Array[String]] = js.native
  var selectionAreaContainer: js.UndefOr[String | HTMLElement | (js.Array[String | HTMLElement])] = js.native
  var singleClick: js.UndefOr[Boolean] = js.native
  var startThreshold: js.UndefOr[Double] = js.native
  var startareas: js.UndefOr[js.Array[String]] = js.native
}

object SelectionOptions {
  @scala.inline
  def apply(): SelectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionOptions]
  }
  @scala.inline
  implicit class SelectionOptionsOps[Self <: SelectionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundaries(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaries")(js.undefined)
        ret
    }
    @scala.inline
    def withClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTouch")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: Mode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollSpeedDivider(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSpeedDivider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollSpeedDivider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSpeedDivider")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectables(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectables")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionAreaContainerHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionAreaContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionAreaContainer(value: String | HTMLElement | (js.Array[String | HTMLElement])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionAreaContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionAreaContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionAreaContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withStartThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withStartareas(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startareas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartareas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startareas")(js.undefined)
        ret
    }
  }
  
}


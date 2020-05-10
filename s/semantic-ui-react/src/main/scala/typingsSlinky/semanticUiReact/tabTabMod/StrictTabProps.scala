package typingsSlinky.semanticUiReact.tabTabMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.semanticUiReact.AnonMenuItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictTabProps extends js.Object {
  /** Index of the currently active tab. */
  var activeIndex: js.UndefOr[Double | String] = js.native
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** The initial activeIndex. */
  var defaultActiveIndex: js.UndefOr[Double | String] = js.native
  /** Shorthand props for the Grid. */
  var grid: js.UndefOr[js.Any] = js.native
  /** Shorthand props for the Menu. */
  var menu: js.UndefOr[js.Any] = js.native
  /** Align vertical menu */
  var menuPosition: js.UndefOr[left | right] = js.native
  /**
    * Called on tab change.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - The proposed new Tab.Pane.
    * @param {object} data.activeIndex - The new proposed activeIndex.
    * @param {object} data.panes - Props of the new proposed active pane.
    */
  var onTabChange: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ TabProps, Unit]
  ] = js.native
  /**
    * Array of objects describing each Menu.Item and Tab.Pane:
    * {
    *   menuItem: 'Home',
    *   render: () => <Tab.Pane>Welcome!</Tab.Pane>,
    * }
    * or
    * {
    *   menuItem: 'Home',
    *   pane: 'Welcome',
    * }
    */
  var panes: js.UndefOr[js.Array[AnonMenuItem]] = js.native
  /** A Tab can render only active pane. */
  var renderActiveOnly: js.UndefOr[Boolean] = js.native
}

object StrictTabProps {
  @scala.inline
  def apply(): StrictTabProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictTabProps]
  }
  @scala.inline
  implicit class StrictTabPropsOps[Self <: StrictTabProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveIndex(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withAs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultActiveIndex(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActiveIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultActiveIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActiveIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withMenu(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuPosition(value: left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTabChange(value: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ TabProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnTabChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPanes(value: js.Array[AnonMenuItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panes")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderActiveOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderActiveOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderActiveOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderActiveOnly")(js.undefined)
        ret
    }
  }
  
}


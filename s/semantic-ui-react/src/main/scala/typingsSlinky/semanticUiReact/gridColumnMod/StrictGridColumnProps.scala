package typingsSlinky.semanticUiReact.gridColumnMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.semanticUiReact.genericMod.SemanticCOLORS
import typingsSlinky.semanticUiReact.genericMod.SemanticFLOATS
import typingsSlinky.semanticUiReact.genericMod.SemanticTEXTALIGNMENTS
import typingsSlinky.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typingsSlinky.semanticUiReact.genericMod.SemanticWIDTHS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictGridColumnProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Primary content. */
  var children: js.UndefOr[TagMod[Any]] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** A grid column can be colored. */
  var color: js.UndefOr[SemanticCOLORS] = js.native
  /** A column can specify a width for a computer. */
  var computer: js.UndefOr[SemanticWIDTHS] = js.native
  /** A column can sit flush against the left or right edge of a row. */
  var floated: js.UndefOr[SemanticFLOATS] = js.native
  /** A column can specify a width for a large screen device. */
  var largeScreen: js.UndefOr[SemanticWIDTHS] = js.native
  /** A column can specify a width for a mobile device. */
  var mobile: js.UndefOr[SemanticWIDTHS] = js.native
  /** A column can appear only for a specific device, or screen sizes. */
  var only: js.UndefOr[GridOnlyProp] = js.native
  /** An can stretch its contents to take up the entire grid or row height. */
  var stretched: js.UndefOr[Boolean] = js.native
  /** A column can specify a width for a tablet device. */
  var tablet: js.UndefOr[SemanticWIDTHS] = js.native
  /** A row can specify its text alignment. */
  var textAlign: js.UndefOr[SemanticTEXTALIGNMENTS] = js.native
  /** A column can specify its vertical alignment to have all its columns vertically centered. */
  var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.native
  /** A column can specify a width for a wide screen device. */
  var widescreen: js.UndefOr[SemanticWIDTHS] = js.native
  /** Represents width of column. */
  var width: js.UndefOr[SemanticWIDTHS] = js.native
}

object StrictGridColumnProps {
  @scala.inline
  def apply(): StrictGridColumnProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictGridColumnProps]
  }
  @scala.inline
  implicit class StrictGridColumnPropsOps[Self <: StrictGridColumnProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: SemanticCOLORS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withComputer(value: SemanticWIDTHS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computer")(js.undefined)
        ret
    }
    @scala.inline
    def withFloated(value: SemanticFLOATS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floated")(js.undefined)
        ret
    }
    @scala.inline
    def withLargeScreen(value: SemanticWIDTHS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLargeScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withMobile(value: SemanticWIDTHS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(js.undefined)
        ret
    }
    @scala.inline
    def withOnly(value: GridOnlyProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(js.undefined)
        ret
    }
    @scala.inline
    def withStretched(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStretched: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretched")(js.undefined)
        ret
    }
    @scala.inline
    def withTablet(value: SemanticWIDTHS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTablet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablet")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAlign(value: SemanticTEXTALIGNMENTS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withWidescreen(value: SemanticWIDTHS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widescreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidescreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widescreen")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: SemanticWIDTHS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}


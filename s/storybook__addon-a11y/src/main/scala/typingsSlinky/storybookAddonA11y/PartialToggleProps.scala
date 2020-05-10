package typingsSlinky.storybookAddonA11y

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.axeCore.mod.NodeResult
import typingsSlinky.std.Map
import typingsSlinky.storybookAddonA11y.a11YPanelMod.RuleType
import typingsSlinky.storybookAddonA11y.highlightToggleMod.HighlightedElementData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/addon-a11y.@storybook/addon-a11y/dist/components/Report/HighlightToggle.ToggleProps> */
@js.native
trait PartialToggleProps extends js.Object {
  var addElement: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  var elementsToHighlight: js.UndefOr[js.Array[NodeResult]] = js.native
  var highlightedElementsMap: js.UndefOr[Map[HTMLElement, HighlightedElementData]] = js.native
  var indeterminate: js.UndefOr[Boolean] = js.native
  var isToggledOn: js.UndefOr[Boolean] = js.native
  var toggleId: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[RuleType] = js.native
}

object PartialToggleProps {
  @scala.inline
  def apply(): PartialToggleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialToggleProps]
  }
  @scala.inline
  implicit class PartialTogglePropsOps[Self <: PartialToggleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddElement(value: /* data */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addElement")(js.undefined)
        ret
    }
    @scala.inline
    def withElementsToHighlight(value: js.Array[NodeResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementsToHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementsToHighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementsToHighlight")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightedElementsMap(value: Map[HTMLElement, HighlightedElementData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedElementsMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightedElementsMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedElementsMap")(js.undefined)
        ret
    }
    @scala.inline
    def withIndeterminate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indeterminate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndeterminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indeterminate")(js.undefined)
        ret
    }
    @scala.inline
    def withIsToggledOn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isToggledOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsToggledOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isToggledOn")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: RuleType): Self = {
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
  }
  
}


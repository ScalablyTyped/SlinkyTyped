package typingsSlinky.semanticUiAccordion.anon

import typingsSlinky.semanticUiAccordion.JQuery
import typingsSlinky.semanticUiAccordion.SemanticUI.Accordion.ClassNameSettings
import typingsSlinky.semanticUiAccordion.SemanticUI.Accordion.ErrorSettings
import typingsSlinky.semanticUiAccordion.SemanticUI.Accordion.SelectorSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-accordion.SemanticUI.AccordionSettings._Impl, keyof semantic-ui-accordion.SemanticUI.AccordionSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImpl extends js.Object {
  var animateChildren: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[ClassNameSettings] = js.native
  var closeNested: js.UndefOr[Boolean] = js.native
  var collapsible: js.UndefOr[Boolean] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var duration: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[String] = js.native
  var error: js.UndefOr[ErrorSettings] = js.native
  var exclusive: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var namespace: js.UndefOr[String] = js.native
  var observeChanges: js.UndefOr[Boolean] = js.native
  var on: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onClose: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onClosing: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onOpen: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onOpening: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var performance: js.UndefOr[Boolean] = js.native
  var selector: js.UndefOr[SelectorSettings] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplOps[Self <: PartialPickImplkeyofImpl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimateChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: ClassNameSettings): Self = {
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
    def withCloseNested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeNested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseNested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeNested")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsible")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: ErrorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withExclusive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusive")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withObserveChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObserveChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClosing(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClosing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpening(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpening")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnOpening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpening")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: SelectorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}


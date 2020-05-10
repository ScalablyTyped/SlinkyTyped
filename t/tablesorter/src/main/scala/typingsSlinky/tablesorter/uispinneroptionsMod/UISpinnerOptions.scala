package typingsSlinky.tablesorter.uispinneroptionsMod

import typingsSlinky.jquery.JQueryEventObject
import typingsSlinky.jqueryui.JQueryUI.SpinnerEvent
import typingsSlinky.jqueryui.JQueryUI.SpinnerUIParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/UIOptionsBase.UIOptionsBase<jqueryui.JQueryUI.SpinnerOptions> */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/IntervalOptions.IntervalOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/ControlOptions.ControlOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/DefaultValueOptions.DefaultValueOptions<number> */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/ToggleableOptions.ToggleableOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/ComparableOptions.ComparableOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/DelayableOptions.DelayableOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/StrictOptions.StrictOptions */
@js.native
trait UISpinnerOptions extends js.Object {
  /**
    * A value indicating whether to add a box for enabling/disabling the control.
    */
  var addToggle: js.UndefOr[Boolean] = js.native
  /**
    * The label of the control.
    */
  var cellText: js.UndefOr[String] = js.native
  var change: js.UndefOr[SpinnerEvent[js.Object]] = js.native
  /**
    * The compare-operators supported by the control.
    */
  var compare: js.UndefOr[String | js.Array[String]] = js.native
  var create: js.UndefOr[SpinnerEvent[js.Object]] = js.native
  var culture: js.UndefOr[String] = js.native
  /**
    * A value indicating whether the value of the filter should be set delayed.
    */
  var delayed: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether the control is initially disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * A value indicatin whether only exact matching values should be included.
    */
  var exactMatch: js.UndefOr[Boolean] = js.native
  var icons: js.UndefOr[js.Any] = js.native
  var incremental: js.UndefOr[js.Any] = js.native
  /**
    * The maximum value of the control.
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * The minimum value of the control.
    */
  var min: js.UndefOr[Double] = js.native
  var numberFormat: js.UndefOr[String] = js.native
  var page: js.UndefOr[Double] = js.native
  var spin: js.UndefOr[SpinnerEvent[SpinnerUIParam]] = js.native
  var start: js.UndefOr[SpinnerEvent[js.Object]] = js.native
  /**
    * The interval of the control.
    */
  var step: js.UndefOr[Double] = js.native
  var stop: js.UndefOr[SpinnerEvent[js.Object]] = js.native
  /**
    * The default value of the control.
    */
  var value: js.UndefOr[Double] = js.native
}

object UISpinnerOptions {
  @scala.inline
  def apply(): UISpinnerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UISpinnerOptions]
  }
  @scala.inline
  implicit class UISpinnerOptionsOps[Self <: UISpinnerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddToggle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addToggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withCellText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellText")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: (/* event */ JQueryEventObject, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withCompare(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: (/* event */ JQueryEventObject, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withCulture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("culture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCulture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("culture")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayed")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withExactMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExactMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
    @scala.inline
    def withIncremental(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incremental")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncremental: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incremental")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withSpin(value: (/* event */ JQueryEventObject, SpinnerUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSpin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spin")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: (/* event */ JQueryEventObject, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withStop(value: (/* event */ JQueryEventObject, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}


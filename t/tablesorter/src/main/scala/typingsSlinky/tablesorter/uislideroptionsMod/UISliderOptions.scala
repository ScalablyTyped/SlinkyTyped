package typingsSlinky.tablesorter.uislideroptionsMod

import typingsSlinky.jquery.JQueryEventObject
import typingsSlinky.jqueryui.JQueryUI.SliderClasses
import typingsSlinky.jqueryui.JQueryUI.SliderEvent
import typingsSlinky.jqueryui.JQueryUI.SliderUIParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent tablesorter.tablesorter/Omit.Omit<tablesorter.tablesorter/Filtering/Formatter/Options/UIOptionsBase.UIOptionsBase<jqueryui.JQueryUI.SliderOptions>, 'values'> */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/RangeOptions.RangeOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/ControlOptions.ControlOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/DefaultValueOptions.DefaultValueOptions<number> */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/ComparableOptions.ComparableOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/PreviewableOptions.PreviewableOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/DelayableOptions.DelayableOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/StrictOptions.StrictOptions */
@js.native
trait UISliderOptions extends js.Object {
  /**
    * The text indicating the whole range.
    */
  var allText: js.UndefOr[String] = js.native
  var animate: js.UndefOr[js.Any] = js.native
  /**
    * The label of the control.
    */
  var cellText: js.UndefOr[String] = js.native
  var change: js.UndefOr[SliderEvent] = js.native
  var classes: js.UndefOr[SliderClasses] = js.native
  /**
    * The compare-operators supported by the control.
    */
  var compare: js.UndefOr[String | js.Array[String]] = js.native
  var create: js.UndefOr[SliderEvent] = js.native
  /**
    * A value indicating whether the value of the filter should be set delayed.
    */
  var delayed: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * A value indicatin whether only exact matching values should be included.
    */
  var exactMatch: js.UndefOr[Boolean] = js.native
  var highlight: js.UndefOr[Boolean] = js.native
  /**
    * The maximum value of the control.
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * The minimum value of the control.
    */
  var min: js.UndefOr[Double] = js.native
  var orientation: js.UndefOr[String] = js.native
  var range: js.UndefOr[js.Any] = js.native
  var slide: js.UndefOr[SliderEvent] = js.native
  var start: js.UndefOr[SliderEvent] = js.native
  /**
    * The interval of the control.
    */
  var step: js.UndefOr[Double] = js.native
  var stop: js.UndefOr[SliderEvent] = js.native
  /**
    * The default value of the control.
    */
  var value: js.UndefOr[Double] = js.native
  /**
    * A value indicating whether the value should be visible in the table header.
    */
  var valueToHeader: js.UndefOr[Boolean] = js.native
}

object UISliderOptions {
  @scala.inline
  def apply(): UISliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UISliderOptions]
  }
  @scala.inline
  implicit class UISliderOptionsOps[Self <: UISliderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allText")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
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
    def withChange(value: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit): Self = {
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
    def withClasses(value: SliderClasses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
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
    def withCreate(value: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit): Self = {
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
    def withHighlight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(js.undefined)
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
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withSlide(value: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit): Self = {
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
    def withStop(value: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit): Self = {
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
    @scala.inline
    def withValueToHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueToHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueToHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueToHeader")(js.undefined)
        ret
    }
  }
  
}


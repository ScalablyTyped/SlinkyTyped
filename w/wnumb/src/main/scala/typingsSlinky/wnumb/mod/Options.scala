package typingsSlinky.wnumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** The number of decimals to include in the result. Limited to 7. */
  var decimals: js.UndefOr[Double] = js.native
  /**
    * Reverse the operations set in encoder.
    * Use this option to undo modifications made while encoding the value.
    * function( value ){
    *   return value / 1.32;
    * }
    */
  var decoder: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.native
  /**
    * Similar to encoder, but applied after all other formatting options are applied.
    */
  var edit: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.native
  /**
    * This is a powerful option to manually modify the slider output.
    * For example, to show a number in another currency:
    * function( value ){
    *  return value * 1.32;
    * }
    */
  var encoder: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.native
  /**
    * The decimal separator.
    * Defaults to '.' if thousand isn't already set to '.'.
    */
  var mark: js.UndefOr[String] = js.native
  /**
    * The prefix for negative values. Defaults to '-' if negativeBefore isn't set.
    */
  var negative: js.UndefOr[String] = js.native
  /**
    * The prefix for a negative number. Inserted before prefix.
    */
  var negativeBefore: js.UndefOr[String] = js.native
  /**
    * A string to prepend to the number. Use cases include prefixing with money symbols such as '$' or '€'.
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * A number to append to a number. For example: ',-'.
    */
  var suffix: js.UndefOr[String] = js.native
  /**
    * Separator for large numbers. For example: ' ' would result in a formatted number of 1 000 000.
    */
  var thousand: js.UndefOr[String] = js.native
  /**
    * Similar to decoder and the reverse for edit.
    * Applied before all other formatting options are applied.
    */
  var undo: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecimals(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimals")(js.undefined)
        ret
    }
    @scala.inline
    def withDecoder(value: /* value */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDecoder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoder")(js.undefined)
        ret
    }
    @scala.inline
    def withEdit(value: /* value */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoder(value: /* value */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEncoder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoder")(js.undefined)
        ret
    }
    @scala.inline
    def withMark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark")(js.undefined)
        ret
    }
    @scala.inline
    def withNegative(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negative")(js.undefined)
        ret
    }
    @scala.inline
    def withNegativeBefore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativeBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(js.undefined)
        ret
    }
    @scala.inline
    def withThousand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThousand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousand")(js.undefined)
        ret
    }
    @scala.inline
    def withUndo(value: /* value */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUndo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undo")(js.undefined)
        ret
    }
  }
  
}


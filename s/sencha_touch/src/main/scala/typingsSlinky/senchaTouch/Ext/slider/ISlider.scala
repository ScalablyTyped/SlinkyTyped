package typingsSlinky.senchaTouch.Ext.slider

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISlider extends IContainer {
  /** [Config Option] (Boolean) */
  var allowThumbsOverlapping: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean/Object) */
  var animation: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var animationDuration: js.UndefOr[Boolean] = js.native
  /** [Method] Sets the increment configuration
  		* @param increment Number
  		* @returns Number
  		*/
  var applyIncrement: js.UndefOr[js.Function1[/* increment */ js.UndefOr[Double], Double]] = js.native
  /** [Method] Returns the value of allowThumbsOverlapping
  		* @returns Boolean
  		*/
  var getAllowThumbsOverlapping: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of animation
  		* @returns Boolean/Object
  		*/
  var getAnimation: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of increment
  		* @returns Number
  		*/
  var getIncrement: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of maxValue
  		* @returns Number
  		*/
  var getMaxValue: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of minValue
  		* @returns Number
  		*/
  var getMinValue: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of readOnly
  		* @returns Boolean
  		*/
  var getReadOnly: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the Thumb instance bound to this Slider
  		* @param index Number The index of Thumb to return.
  		* @returns Ext.slider.Thumb The thumb instance
  		*/
  var getThumb: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], IThumb]] = js.native
  /** [Method] Returns the value of thumbConfig
  		* @returns Object
  		*/
  var getThumbConfig: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the Thumb instances bound to this Slider
  		* @returns Ext.slider.Thumb[] The thumb instances
  		*/
  var getThumbs: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of value
  		* @returns Number/Number[]
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Convenience method
  		* @returns Object
  		*/
  var getValues: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Number) */
  var increment: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** [Method] Sets the value of allowThumbsOverlapping
  		* @param allowThumbsOverlapping Boolean The new value.
  		*/
  var setAllowThumbsOverlapping: js.UndefOr[js.Function1[/* allowThumbsOverlapping */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of animation
  		* @param animation Boolean/Object The new value.
  		*/
  var setAnimation: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of increment
  		* @param increment Number The new value.
  		*/
  var setIncrement: js.UndefOr[js.Function1[/* increment */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of maxValue
  		* @param maxValue Number The new value.
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* maxValue */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of minValue
  		* @param minValue Number The new value.
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* minValue */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of readOnly
  		* @param readOnly Boolean The new value.
  		*/
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of thumbConfig
  		* @param thumbConfig Object The new value.
  		*/
  var setThumbConfig: js.UndefOr[js.Function1[/* thumbConfig */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of value
  		* @param value Number/Number[] The new value.
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Convenience method
  		* @param value Object
  		*/
  var setValues: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Object) */
  var thumbConfig: js.UndefOr[js.Any] = js.native
  /** [Method] Updates the sliders thumbs with their new value s
  		* @param newValue Object
  		* @param oldValue Object
  		*/
  var updateValue: js.UndefOr[
    js.Function2[/* newValue */ js.UndefOr[js.Any], /* oldValue */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Config Option] (Number/Number[]) */
  var value: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number/Number[]) */
  var values: js.UndefOr[js.Any] = js.native
}

object ISlider {
  @scala.inline
  def apply(): ISlider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISlider]
  }
  @scala.inline
  implicit class ISliderOps[Self <: ISlider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowThumbsOverlapping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowThumbsOverlapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowThumbsOverlapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowThumbsOverlapping")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDuration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyIncrement(value: /* increment */ js.UndefOr[Double] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyIncrement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutApplyIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyIncrement")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAllowThumbsOverlapping(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllowThumbsOverlapping")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAllowThumbsOverlapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllowThumbsOverlapping")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAnimation(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnimation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withGetIncrement(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIncrement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIncrement")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMaxValue(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMinValue(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGetReadOnly(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReadOnly")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReadOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withGetThumb(value: /* index */ js.UndefOr[Double] => IThumb): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThumb")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetThumb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThumb")(js.undefined)
        ret
    }
    @scala.inline
    def withGetThumbConfig(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThumbConfig")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetThumbConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThumbConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withGetThumbs(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThumbs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetThumbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThumbs")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValue(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValues(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValues")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValues")(js.undefined)
        ret
    }
    @scala.inline
    def withIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAllowThumbsOverlapping(value: /* allowThumbsOverlapping */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowThumbsOverlapping")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAllowThumbsOverlapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowThumbsOverlapping")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAnimation(value: /* animation */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAnimation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIncrement(value: /* increment */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIncrement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIncrement")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaxValue(value: /* maxValue */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMinValue(value: /* minValue */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetReadOnly(value: /* readOnly */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReadOnly")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReadOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSetThumbConfig(value: /* thumbConfig */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setThumbConfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetThumbConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setThumbConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSetValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetValues(value: /* value */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValues")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValues")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateValue(value: (/* newValue */ js.UndefOr[js.Any], /* oldValue */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdateValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateValue")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
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
    def withValues(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.semanticUiReact.textAreaTextAreaMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.TextareaHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictTextAreaProps extends TextareaHTMLAttributes[HTMLTextAreaElement] {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /**
    * Called on change.
    *
    * @param {SyntheticEvent} event - The React SyntheticEvent object
    * @param {object} data - All props and the event value.
    */
  @JSName("onChange")
  var onChange_StrictTextAreaProps: js.UndefOr[
    js.Function2[
      SyntheticEvent[EventTarget with HTMLTextAreaElement, Event], 
      /* data */ TextAreaProps, 
      Unit
    ]
  ] = js.native
  /**
    * Called on input.
    *
    * @param {SyntheticEvent} event - The React SyntheticEvent object
    * @param {object} data - All props and the event value.
    */
  @JSName("onInput")
  var onInput_StrictTextAreaProps: js.UndefOr[
    js.Function2[
      SyntheticEvent[EventTarget with HTMLTextAreaElement, Event], 
      /* data */ TextAreaProps, 
      Unit
    ]
  ] = js.native
  /** Indicates row count for a TextArea. */
  @JSName("rows")
  var rows_StrictTextAreaProps: js.UndefOr[Double | String] = js.native
  /** The value of the textarea. */
  @JSName("value")
  var value_StrictTextAreaProps: js.UndefOr[Double | String] = js.native
}

object StrictTextAreaProps {
  @scala.inline
  def apply(): StrictTextAreaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictTextAreaProps]
  }
  @scala.inline
  implicit class StrictTextAreaPropsOps[Self <: StrictTextAreaProps] (val x: Self) extends AnyVal {
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
    def withOnChange(
      value: (SyntheticEvent[EventTarget with HTMLTextAreaElement, Event], /* data */ TextAreaProps) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInput(
      value: (SyntheticEvent[EventTarget with HTMLTextAreaElement, Event], /* data */ TextAreaProps) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double | String): Self = {
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


package typingsSlinky.webscopeioReactTextareaAutocomplete.mod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.TextareaHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextareaProps[TItem] extends TextareaHTMLAttributes[HTMLTextAreaElement] {
  /**
    * 	When it's true autocomplete will close when use click outside.
    * @default false
    */
  var closeOnClickOutside: js.UndefOr[Boolean] = js.native
  /**
    * ClassNames of the textarea's container.
    */
  var containerClassName: js.UndefOr[String] = js.native
  /**
    * Styles of textarea's container.
    */
  var containerStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * 	ClassNames of dropdown's wrapper.
    */
  var dropdownClassName: js.UndefOr[String] = js.native
  /**
    * Styles of dropdown's wrapper.
    */
  var dropdownStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * Allows you to get React ref of the underlying textarea.
    */
  var innerRef: js.UndefOr[js.Function1[/* ref */ HTMLTextAreaElement, Unit]] = js.native
  /**
    * ClassNames of item's wrapper.
    */
  var itemClassName: js.UndefOr[String] = js.native
  /**
    * Styles of item's wrapper.
    */
  var itemStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * 	ClassNames of list's wrapper.
    */
  var listClassName: js.UndefOr[String] = js.native
  /**
    * Styles of list's wrapper.
    */
  var listStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * ClassNames of loader's wrapper.
    */
  var loaderClassName: js.UndefOr[String] = js.native
  /**
    * Styles of loader's wrapper.
    */
  var loaderStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * Gets data props which is already fetched (and displayed) suggestion.
    */
  var loadingComponent: ReactComponentClass[js.Object] = js.native
  /**
    * Number of characters that user should type for trigger a suggestion.
    * @default 1
    */
  var minChar: js.UndefOr[Double] = js.native
  /**
    * When it's true the textarea will move along with a caret as a user continues to type.
    * @default false
    */
  var movePopupAsYouType: js.UndefOr[Boolean] = js.native
  /**
    * Listener called every time the textarea's caret position is changed. The listener is called with one attribute - caret position denoted by an integer number.
    */
  var onCaretPositionChange: js.UndefOr[js.Function1[/* pos */ Double, Unit]] = js.native
  /**
    * With default implementation it will scroll the dropdown every time when the item gets out of the view.
    * @default true
    */
  var scrollToItem: js.UndefOr[
    Boolean | (js.Function2[/* container */ HTMLDivElement, /* item */ HTMLDivElement, Unit])
  ] = js.native
  /**
    * Define triggers and their corresponding behavior.
    */
  var trigger: TriggerType[TItem] = js.native
}

object TextareaProps {
  @scala.inline
  def apply[TItem](loadingComponent: ReactComponentClass[js.Object], trigger: TriggerType[TItem]): TextareaProps[TItem] = {
    val __obj = js.Dynamic.literal(loadingComponent = loadingComponent.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextareaProps[TItem]]
  }
  @scala.inline
  implicit class TextareaPropsOps[Self[titem] <: TextareaProps[titem], TItem] (val x: Self[TItem]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TItem] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TItem]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TItem] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TItem] with Other]
    @scala.inline
    def withLoadingComponent(value: ReactComponentClass[js.Object]): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrigger(value: TriggerType[TItem]): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseOnClickOutside(value: Boolean): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnClickOutside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnClickOutside: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnClickOutside")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerClassName(value: String): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerClassName: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyle(value: CSSProperties): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStyle: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownClassName(value: String): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownClassName: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownStyle(value: CSSProperties): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownStyle: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRef(value: /* ref */ HTMLTextAreaElement => Unit): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInnerRef: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(js.undefined)
        ret
    }
    @scala.inline
    def withItemClassName(value: String): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemClassName: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withItemStyle(value: CSSProperties): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemStyle: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withListClassName(value: String): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListClassName: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withListStyle(value: CSSProperties): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListStyle: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLoaderClassName(value: String): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaderClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoaderClassName: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaderClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withLoaderStyle(value: CSSProperties): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoaderStyle: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaderStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMinChar(value: Double): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinChar: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minChar")(js.undefined)
        ret
    }
    @scala.inline
    def withMovePopupAsYouType(value: Boolean): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movePopupAsYouType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovePopupAsYouType: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movePopupAsYouType")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCaretPositionChange(value: /* pos */ Double => Unit): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCaretPositionChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCaretPositionChange: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCaretPositionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToItemFunction2(value: (/* container */ HTMLDivElement, /* item */ HTMLDivElement) => Unit): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withScrollToItem(value: Boolean | (js.Function2[/* container */ HTMLDivElement, /* item */ HTMLDivElement, Unit])): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToItem: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToItem")(js.undefined)
        ret
    }
  }
  
}


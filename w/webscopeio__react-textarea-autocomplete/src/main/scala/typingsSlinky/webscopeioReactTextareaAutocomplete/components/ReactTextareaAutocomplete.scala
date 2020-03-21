package typingsSlinky.webscopeioReactTextareaAutocomplete.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.textarea.tag
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.webscopeioReactTextareaAutocomplete.mod.TextareaProps
import typingsSlinky.webscopeioReactTextareaAutocomplete.mod.TriggerType
import typingsSlinky.webscopeioReactTextareaAutocomplete.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactTextareaAutocomplete
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("@webscopeio/react-textarea-autocomplete", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, onBlur, onSelect, style, value */
  def apply[TItem /* <: String | js.Object */](
    loadingComponent: ReactComponentClass[js.Object],
    trigger: TriggerType[TItem],
    closeOnClickOutside: js.UndefOr[Boolean] = js.undefined,
    containerClassName: String = null,
    containerStyle: CSSProperties = null,
    dropdownClassName: String = null,
    dropdownStyle: CSSProperties = null,
    innerRef: /* ref */ HTMLTextAreaElement => Unit = null,
    itemClassName: String = null,
    itemStyle: CSSProperties = null,
    listClassName: String = null,
    listStyle: CSSProperties = null,
    loaderClassName: String = null,
    loaderStyle: CSSProperties = null,
    minChar: Int | Double = null,
    movePopupAsYouType: js.UndefOr[Boolean] = js.undefined,
    onCaretPositionChange: /* pos */ Double => Unit = null,
    onChange: ChangeEvent[HTMLTextAreaElement] => Unit = null,
    scrollToItem: Boolean | (js.Function2[/* container */ HTMLDivElement, /* item */ HTMLDivElement, Unit]) = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal(loadingComponent = loadingComponent.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClickOutside)) __obj.updateDynamic("closeOnClickOutside")(closeOnClickOutside.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName.asInstanceOf[js.Any])
    if (dropdownStyle != null) __obj.updateDynamic("dropdownStyle")(dropdownStyle.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(js.Any.fromFunction1(innerRef))
    if (itemClassName != null) __obj.updateDynamic("itemClassName")(itemClassName.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (listClassName != null) __obj.updateDynamic("listClassName")(listClassName.asInstanceOf[js.Any])
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle.asInstanceOf[js.Any])
    if (loaderClassName != null) __obj.updateDynamic("loaderClassName")(loaderClassName.asInstanceOf[js.Any])
    if (loaderStyle != null) __obj.updateDynamic("loaderStyle")(loaderStyle.asInstanceOf[js.Any])
    if (minChar != null) __obj.updateDynamic("minChar")(minChar.asInstanceOf[js.Any])
    if (!js.isUndefined(movePopupAsYouType)) __obj.updateDynamic("movePopupAsYouType")(movePopupAsYouType.asInstanceOf[js.Any])
    if (onCaretPositionChange != null) __obj.updateDynamic("onCaretPositionChange")(js.Any.fromFunction1(onCaretPositionChange))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (scrollToItem != null) __obj.updateDynamic("scrollToItem")(scrollToItem.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.textarea.tag.type, 
  typingsSlinky.webscopeioReactTextareaAutocomplete.mod.default[js.Any]]]
  }
  type Props = TextareaProps[js.Any]
}


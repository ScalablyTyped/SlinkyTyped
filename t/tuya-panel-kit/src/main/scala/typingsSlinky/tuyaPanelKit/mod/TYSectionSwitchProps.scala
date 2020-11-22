package typingsSlinky.tuyaPanelKit.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.AccessibilityValue
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TVParallaxProperties
import typingsSlinky.reactNative.mod.TargetedEvent
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.tuyaPanelKit.anon.ActiveSize
import typingsSlinky.tuyaPanelKit.anon.Content
import typingsSlinky.tuyaPanelKit.anon.Margin
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`no-hide-descendants`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.assertive
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.auto
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.button
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.iconfont
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.image
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.no
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.none_
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.polite
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.radiobutton_checked
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.radiobutton_unchecked
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.text
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<tuya-panel-kit.tuya-panel-kit.TYListItemProps, 'theme'> */
/* Inlined parent tuya-panel-kit.tuya-panel-kit.SwitchButtonProps */
@js.native
trait TYSectionSwitchProps extends js.Object {
  
  var Action: js.UndefOr[js.Any] = js.native
  
  var Icon: js.UndefOr[js.Any] = js.native
  
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.native
  
  var accessibilityComponentType: js.UndefOr[none_ | button | radiobutton_checked | radiobutton_unchecked] = js.native
  
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.native
  
  var accessibilityHint: js.UndefOr[String] = js.native
  
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.native
  
  var accessibilityLabel: js.UndefOr[String] = js.native
  
  var accessibilityLiveRegion: js.UndefOr[none_ | polite | assertive] = js.native
  
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.native
  
  var accessibilityState: js.UndefOr[AccessibilityState] = js.native
  
  var accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.native
  
  var accessibilityValue: js.UndefOr[AccessibilityValue] = js.native
  
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.native
  
  var accessible: js.UndefOr[Boolean] = js.native
  
  var actionDisabled: js.UndefOr[Boolean] = js.native
  
  var actionType: js.UndefOr[auto | image | iconfont | text] = js.native
  
  var activeOpacity: js.UndefOr[Double] = js.native
  
  var arrow: js.UndefOr[Boolean] = js.native
  
  var arrowColor: js.UndefOr[String] = js.native
  
  var arrowUseIcon: js.UndefOr[Boolean] = js.native
  
  var borderColor: js.UndefOr[String] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var defaultValue: js.UndefOr[Boolean] = js.native
  
  var delayLongPress: js.UndefOr[Double] = js.native
  
  var delayPressIn: js.UndefOr[Double] = js.native
  
  var delayPressOut: js.UndefOr[Double] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.native
  
  var hitSlop: js.UndefOr[Insets] = js.native
  
  var iconColor: js.UndefOr[String] = js.native
  
  var iconSize: js.UndefOr[Double] = js.native
  
  var iconType: js.UndefOr[auto | image | iconfont | text] = js.native
  
  var imageFollowIconColor: js.UndefOr[Boolean] = js.native
  
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.native
  
  var needUpdate: js.UndefOr[Boolean] = js.native
  
  var offText: js.UndefOr[String] = js.native
  
  var offTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var onAccessibilityAction: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]] = js.native
  
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onActionPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onBlur: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TargetedEvent], Unit]] = js.native
  
  var onFocus: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TargetedEvent], Unit]] = js.native
  
  var onLayout: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, Layout], Unit]] = js.native
  
  var onLongPress: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPress: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onPressIn: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onPressOut: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onText: js.UndefOr[String] = js.native
  
  var onTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var onThumbTintColor: js.UndefOr[String] = js.native
  
  var onTintColor: js.UndefOr[String | StringDictionary[String]] = js.native
  
  def onValueChange(value: Boolean): Unit = js.native
  
  var pressRetentionOffset: js.UndefOr[Insets] = js.native
  
  var size: js.UndefOr[ActiveSize] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var styles: js.UndefOr[Content] = js.native
  
  var subTitle: js.UndefOr[String] = js.native
  
  var testID: js.UndefOr[String] = js.native
  
  var theme: js.UndefOr[Margin] = js.native
  
  var thumbStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var thumbTintColor: js.UndefOr[String] = js.native
  
  var tintColor: js.UndefOr[String | StringDictionary[String]] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var touchSoundDisabled: js.UndefOr[Boolean | Null] = js.native
  
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.native
  
  var useART: js.UndefOr[Boolean] = js.native
  
  var useNativeDriver: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[Boolean] = js.native
}
object TYSectionSwitchProps {
  
  @scala.inline
  def apply(onValueChange: Boolean => Unit): TYSectionSwitchProps = {
    val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction1(onValueChange))
    __obj.asInstanceOf[TYSectionSwitchProps]
  }
  
  @scala.inline
  implicit class TYSectionSwitchPropsOps[Self <: TYSectionSwitchProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnValueChange(value: Boolean => Unit): Self = this.set("onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAction(value: js.Any): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("Action", js.undefined)
    
    @scala.inline
    def setIcon(value: js.Any): Self = this.set("Icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("Icon", js.undefined)
    
    @scala.inline
    def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = this.set("accessibilityActions", js.Array(value :_*))
    
    @scala.inline
    def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = this.set("accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityActions: Self = this.set("accessibilityActions", js.undefined)
    
    @scala.inline
    def setAccessibilityComponentType(value: none_ | button | radiobutton_checked | radiobutton_unchecked): Self = this.set("accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityComponentType: Self = this.set("accessibilityComponentType", js.undefined)
    
    @scala.inline
    def setAccessibilityElementsHidden(value: Boolean): Self = this.set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityElementsHidden: Self = this.set("accessibilityElementsHidden", js.undefined)
    
    @scala.inline
    def setAccessibilityHint(value: String): Self = this.set("accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityHint: Self = this.set("accessibilityHint", js.undefined)
    
    @scala.inline
    def setAccessibilityIgnoresInvertColors(value: Boolean): Self = this.set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityIgnoresInvertColors: Self = this.set("accessibilityIgnoresInvertColors", js.undefined)
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityLiveRegion(value: none_ | polite | assertive): Self = this.set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLiveRegion: Self = this.set("accessibilityLiveRegion", js.undefined)
    
    @scala.inline
    def setAccessibilityRole(value: AccessibilityRole): Self = this.set("accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityRole: Self = this.set("accessibilityRole", js.undefined)
    
    @scala.inline
    def setAccessibilityState(value: AccessibilityState): Self = this.set("accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityState: Self = this.set("accessibilityState", js.undefined)
    
    @scala.inline
    def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = this.set("accessibilityTraits", js.Array(value :_*))
    
    @scala.inline
    def setAccessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): Self = this.set("accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityTraits: Self = this.set("accessibilityTraits", js.undefined)
    
    @scala.inline
    def setAccessibilityValue(value: AccessibilityValue): Self = this.set("accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityValue: Self = this.set("accessibilityValue", js.undefined)
    
    @scala.inline
    def setAccessibilityViewIsModal(value: Boolean): Self = this.set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityViewIsModal: Self = this.set("accessibilityViewIsModal", js.undefined)
    
    @scala.inline
    def setAccessible(value: Boolean): Self = this.set("accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessible: Self = this.set("accessible", js.undefined)
    
    @scala.inline
    def setActionDisabled(value: Boolean): Self = this.set("actionDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionDisabled: Self = this.set("actionDisabled", js.undefined)
    
    @scala.inline
    def setActionType(value: auto | image | iconfont | text): Self = this.set("actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionType: Self = this.set("actionType", js.undefined)
    
    @scala.inline
    def setActiveOpacity(value: Double): Self = this.set("activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveOpacity: Self = this.set("activeOpacity", js.undefined)
    
    @scala.inline
    def setArrow(value: Boolean): Self = this.set("arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrow: Self = this.set("arrow", js.undefined)
    
    @scala.inline
    def setArrowColor(value: String): Self = this.set("arrowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowColor: Self = this.set("arrowColor", js.undefined)
    
    @scala.inline
    def setArrowUseIcon(value: Boolean): Self = this.set("arrowUseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowUseIcon: Self = this.set("arrowUseIcon", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: Boolean): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDelayLongPress(value: Double): Self = this.set("delayLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayLongPress: Self = this.set("delayLongPress", js.undefined)
    
    @scala.inline
    def setDelayPressIn(value: Double): Self = this.set("delayPressIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayPressIn: Self = this.set("delayPressIn", js.undefined)
    
    @scala.inline
    def setDelayPressOut(value: Double): Self = this.set("delayPressOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayPressOut: Self = this.set("delayPressOut", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setHasTVPreferredFocus(value: Boolean): Self = this.set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasTVPreferredFocus: Self = this.set("hasTVPreferredFocus", js.undefined)
    
    @scala.inline
    def setHitSlop(value: Insets): Self = this.set("hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitSlop: Self = this.set("hitSlop", js.undefined)
    
    @scala.inline
    def setIconColor(value: String): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconColor: Self = this.set("iconColor", js.undefined)
    
    @scala.inline
    def setIconSize(value: Double): Self = this.set("iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconSize: Self = this.set("iconSize", js.undefined)
    
    @scala.inline
    def setIconType(value: auto | image | iconfont | text): Self = this.set("iconType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconType: Self = this.set("iconType", js.undefined)
    
    @scala.inline
    def setImageFollowIconColor(value: Boolean): Self = this.set("imageFollowIconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageFollowIconColor: Self = this.set("imageFollowIconColor", js.undefined)
    
    @scala.inline
    def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = this.set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportantForAccessibility: Self = this.set("importantForAccessibility", js.undefined)
    
    @scala.inline
    def setNeedUpdate(value: Boolean): Self = this.set("needUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedUpdate: Self = this.set("needUpdate", js.undefined)
    
    @scala.inline
    def setOffText(value: String): Self = this.set("offText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffText: Self = this.set("offText", js.undefined)
    
    @scala.inline
    def setOffTextStyle(value: StyleProp[TextStyle]): Self = this.set("offTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffTextStyle: Self = this.set("offTextStyle", js.undefined)
    
    @scala.inline
    def setOffTextStyleNull: Self = this.set("offTextStyle", null)
    
    @scala.inline
    def setOnAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): Self = this.set("onAccessibilityAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAccessibilityAction: Self = this.set("onAccessibilityAction", js.undefined)
    
    @scala.inline
    def setOnAccessibilityEscape(value: () => Unit): Self = this.set("onAccessibilityEscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnAccessibilityEscape: Self = this.set("onAccessibilityEscape", js.undefined)
    
    @scala.inline
    def setOnAccessibilityTap(value: () => Unit): Self = this.set("onAccessibilityTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnAccessibilityTap: Self = this.set("onAccessibilityTap", js.undefined)
    
    @scala.inline
    def setOnActionPress(value: () => Unit): Self = this.set("onActionPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnActionPress: Self = this.set("onActionPress", js.undefined)
    
    @scala.inline
    def setOnBlur(value: SyntheticEvent[NodeHandle, TargetedEvent] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnFocus(value: SyntheticEvent[NodeHandle, TargetedEvent] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnLayout(value: SyntheticEvent[NodeHandle, Layout] => Unit): Self = this.set("onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLayout: Self = this.set("onLayout", js.undefined)
    
    @scala.inline
    def setOnLongPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onLongPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLongPress: Self = this.set("onLongPress", js.undefined)
    
    @scala.inline
    def setOnMagicTap(value: () => Unit): Self = this.set("onMagicTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnMagicTap: Self = this.set("onMagicTap", js.undefined)
    
    @scala.inline
    def setOnPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    
    @scala.inline
    def setOnPressIn(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onPressIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPressIn: Self = this.set("onPressIn", js.undefined)
    
    @scala.inline
    def setOnPressOut(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onPressOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPressOut: Self = this.set("onPressOut", js.undefined)
    
    @scala.inline
    def setOnText(value: String): Self = this.set("onText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnText: Self = this.set("onText", js.undefined)
    
    @scala.inline
    def setOnTextStyle(value: StyleProp[TextStyle]): Self = this.set("onTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTextStyle: Self = this.set("onTextStyle", js.undefined)
    
    @scala.inline
    def setOnTextStyleNull: Self = this.set("onTextStyle", null)
    
    @scala.inline
    def setOnThumbTintColor(value: String): Self = this.set("onThumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnThumbTintColor: Self = this.set("onThumbTintColor", js.undefined)
    
    @scala.inline
    def setOnTintColor(value: String | StringDictionary[String]): Self = this.set("onTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTintColor: Self = this.set("onTintColor", js.undefined)
    
    @scala.inline
    def setPressRetentionOffset(value: Insets): Self = this.set("pressRetentionOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePressRetentionOffset: Self = this.set("pressRetentionOffset", js.undefined)
    
    @scala.inline
    def setSize(value: ActiveSize): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setStyles(value: Content): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setSubTitle(value: String): Self = this.set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubTitle: Self = this.set("subTitle", js.undefined)
    
    @scala.inline
    def setTestID(value: String): Self = this.set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
    
    @scala.inline
    def setTheme(value: Margin): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setThumbStyle(value: StyleProp[ViewStyle]): Self = this.set("thumbStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbStyle: Self = this.set("thumbStyle", js.undefined)
    
    @scala.inline
    def setThumbStyleNull: Self = this.set("thumbStyle", null)
    
    @scala.inline
    def setThumbTintColor(value: String): Self = this.set("thumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbTintColor: Self = this.set("thumbTintColor", js.undefined)
    
    @scala.inline
    def setTintColor(value: String | StringDictionary[String]): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTouchSoundDisabled(value: Boolean): Self = this.set("touchSoundDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchSoundDisabled: Self = this.set("touchSoundDisabled", js.undefined)
    
    @scala.inline
    def setTouchSoundDisabledNull: Self = this.set("touchSoundDisabled", null)
    
    @scala.inline
    def setTvParallaxProperties(value: TVParallaxProperties): Self = this.set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxProperties: Self = this.set("tvParallaxProperties", js.undefined)
    
    @scala.inline
    def setUseART(value: Boolean): Self = this.set("useART", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseART: Self = this.set("useART", js.undefined)
    
    @scala.inline
    def setUseNativeDriver(value: Boolean): Self = this.set("useNativeDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNativeDriver: Self = this.set("useNativeDriver", js.undefined)
    
    @scala.inline
    def setValue(value: Boolean): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}

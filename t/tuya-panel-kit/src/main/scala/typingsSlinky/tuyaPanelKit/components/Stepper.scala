package typingsSlinky.tuyaPanelKit.components

import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
import typingsSlinky.reactNative.anon.Start
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.AccessibilityValue
import typingsSlinky.reactNative.mod.ColorValue
import typingsSlinky.reactNative.mod.DataDetectorTypes
import typingsSlinky.reactNative.mod.DocumentSelectionState
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.KeyboardTypeOptions
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.ReturnKeyTypeOptions
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TVParallaxProperties
import typingsSlinky.reactNative.mod.TextInputChangeEventData
import typingsSlinky.reactNative.mod.TextInputContentSizeChangeEventData
import typingsSlinky.reactNative.mod.TextInputEndEditingEventData
import typingsSlinky.reactNative.mod.TextInputFocusEventData
import typingsSlinky.reactNative.mod.TextInputKeyPressEventData
import typingsSlinky.reactNative.mod.TextInputScrollEventData
import typingsSlinky.reactNative.mod.TextInputSelectionChangeEventData
import typingsSlinky.reactNative.mod.TextInputSubmitEditingEventData
import typingsSlinky.reactNative.mod.TextInputTextInputEventData
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.tuyaPanelKit.mod.StepperProps
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.URL
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`box-none`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`box-only`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`cc-csc`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`cc-exp-month`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`cc-exp-year`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`cc-exp`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`cc-number`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`no-hide-descendants`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`postal-code`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`street-address`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`unless-editing`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`while-editing`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.addressCity
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.addressCityAndState
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.addressState
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.always
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.assertive
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.auto
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.balanced
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.button
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.center
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.characters
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.countryName
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.creditCardNumber
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.dark
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.default
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.ellipse
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.email
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.emailAddress
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.familyName
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.fullStreetAddress
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.givenName
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.highQuality
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.jobTitle
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.light
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.location
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.middleName
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.name
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.namePrefix
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.nameSuffix
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.never
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.newPassword
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.nickname
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.no
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.noExcludeDescendants
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.none_
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.off
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.oneTimeCode
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.organizationName
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.password
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.polite
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.postalCode
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.radiobutton_checked
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.radiobutton_unchecked
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.sentences
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.simple
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.streetAddressLine1
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.streetAddressLine2
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.sublocality
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.tel
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.telephoneNumber
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.top
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.triangle
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.username
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.words
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.yes
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.yesExcludeDescendants
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Stepper {
  
  @JSImport("tuya-panel-kit", "Stepper")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.tuyaPanelKit.mod.Stepper] {
    
    @scala.inline
    def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityActionsVarargs(value: AccessibilityActionInfo*): this.type = set("accessibilityActions", js.Array(value :_*))
    
    @scala.inline
    def accessibilityComponentType(value: none_ | button | radiobutton_checked | radiobutton_unchecked): this.type = set("accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityElementsHidden(value: Boolean): this.type = set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityHint(value: String): this.type = set("accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityIgnoresInvertColors(value: Boolean): this.type = set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityLiveRegion(value: none_ | polite | assertive): this.type = set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityRole(value: AccessibilityRole): this.type = set("accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityState(value: AccessibilityState): this.type = set("accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): this.type = set("accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityTraitsVarargs(value: AccessibilityTrait*): this.type = set("accessibilityTraits", js.Array(value :_*))
    
    @scala.inline
    def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowFontScaling(value: Boolean): this.type = set("allowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoCapitalize(value: none_ | sentences | words | characters): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoCompleteType(
      value: `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off
    ): this.type = set("autoCompleteType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoCorrect(value: Boolean): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def blurOnSubmit(value: Boolean): this.type = set("blurOnSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonStyle(value: StyleProp[ViewStyle]): this.type = set("buttonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonStyleNull: this.type = set("buttonStyle", null)
    
    @scala.inline
    def buttonType(value: ellipse | triangle): this.type = set("buttonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def caretHidden(value: Boolean): this.type = set("caretHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clearButtonMode(value: never | `while-editing` | `unless-editing` | always): this.type = set("clearButtonMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clearTextOnFocus(value: Boolean): this.type = set("clearTextOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contextMenuHidden(value: Boolean): this.type = set("contextMenuHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataDetectorTypes(value: DataDetectorTypes | js.Array[DataDetectorTypes]): this.type = set("dataDetectorTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataDetectorTypesVarargs(value: DataDetectorTypes*): this.type = set("dataDetectorTypes", js.Array(value :_*))
    
    @scala.inline
    def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableFullscreenUI(value: Boolean): this.type = set("disableFullscreenUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def editable(value: Boolean): this.type = set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ellipseIconColor(value: String): this.type = set("ellipseIconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enablesReturnKeyAutomatically(value: Boolean): this.type = set("enablesReturnKeyAutomatically", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getTextInputRef(value: /* TextInputRef */ js.Object => Unit): this.type = set("getTextInputRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconMinusPath(value: String): this.type = set("iconMinusPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconPlusPath(value: String): this.type = set("iconPlusPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def importantForAutofill(value: auto | no | noExcludeDescendants | yes | yesExcludeDescendants): this.type = set("importantForAutofill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inlineImageLeft(value: String): this.type = set("inlineImageLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inlineImagePadding(value: Double): this.type = set("inlineImagePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputAccessoryViewID(value: String): this.type = set("inputAccessoryViewID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputStyle(value: StyleProp[ViewStyle]): this.type = set("inputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputStyleNull: this.type = set("inputStyle", null)
    
    @scala.inline
    def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyboardAppearance(value: default | light | dark): this.type = set("keyboardAppearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyboardType(value: KeyboardTypeOptions): this.type = set("keyboardType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxFontSizeMultiplier(value: Double): this.type = set("maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxFontSizeMultiplierNull: this.type = set("maxFontSizeMultiplier", null)
    
    @scala.inline
    def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def multiline(value: Boolean): this.type = set("multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def numberOfLines(value: Double): this.type = set("numberOfLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): this.type = set("onAccessibilityAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAccessibilityEscape(value: () => Unit): this.type = set("onAccessibilityEscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def onAccessibilityTap(value: () => Unit): this.type = set("onAccessibilityTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def onBlur(value: SyntheticEvent[NodeHandle, TextInputFocusEventData] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: SyntheticEvent[NodeHandle, TextInputChangeEventData] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChangeText(value: /* text */ String => Unit): this.type = set("onChangeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def onContentSizeChange(value: SyntheticEvent[NodeHandle, TextInputContentSizeChangeEventData] => Unit): this.type = set("onContentSizeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEndEditing(value: SyntheticEvent[NodeHandle, TextInputEndEditingEventData] => Unit): this.type = set("onEndEditing", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: SyntheticEvent[NodeHandle, TextInputFocusEventData] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyPress(value: SyntheticEvent[NodeHandle, TextInputKeyPressEventData] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLayout(value: SyntheticEvent[NodeHandle, Layout] => Unit): this.type = set("onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMagicTap(value: () => Unit): this.type = set("onMagicTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def onMoveShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMoveShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderGrant(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderGrant", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderReject(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderReject", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderRelease(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderTerminate(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderTerminate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderTerminationRequest(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def onScroll(value: SyntheticEvent[NodeHandle, TextInputScrollEventData] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelectionChange(value: SyntheticEvent[NodeHandle, TextInputSelectionChangeEventData] => Unit): this.type = set("onSelectionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStartShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStartShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSubmitEditing(value: SyntheticEvent[NodeHandle, TextInputSubmitEditingEventData] => Unit): this.type = set("onSubmitEditing", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTextInput(value: SyntheticEvent[NodeHandle, TextInputTextInputEventData] => Unit): this.type = set("onTextInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchCancel(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEndCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchEndCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onValueChange(value: /* value */ Double => Unit): this.type = set("onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def passwordRules(value: String): this.type = set("passwordRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def passwordRulesNull: this.type = set("passwordRules", null)
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholderTextColor(value: ColorValue): this.type = set("placeholderTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pointerEvents(value: `box-none` | none_ | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rejectResponderTermination(value: Boolean): this.type = set("rejectResponderTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rejectResponderTerminationNull: this.type = set("rejectResponderTermination", null)
    
    @scala.inline
    def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def returnKeyLabel(value: String): this.type = set("returnKeyLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def returnKeyType(value: ReturnKeyTypeOptions): this.type = set("returnKeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollEnabled(value: Boolean): this.type = set("scrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def secureTextEntry(value: Boolean): this.type = set("secureTextEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectTextOnFocus(value: Boolean): this.type = set("selectTextOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selection(value: Start): this.type = set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectionColor(value: String): this.type = set("selectionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectionState(value: DocumentSelectionState): this.type = set("selectionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showSoftInputOnFocus(value: Boolean): this.type = set("showSoftInputOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def spellCheck(value: Boolean): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stepValue(value: Double): this.type = set("stepValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textAlignVertical(value: auto | top | bottom | center): this.type = set("textAlignVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textBreakStrategy(value: simple | highQuality | balanced): this.type = set("textBreakStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textContentType(
      value: none_ | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
    ): this.type = set("textContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def triangleIconColor(value: String): this.type = set("triangleIconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def underlineColorAndroid(value: ColorValue): this.type = set("underlineColorAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Stepper.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StepperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

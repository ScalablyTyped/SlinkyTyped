package typingsSlinky.tabris.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tabris.mod.AnimationOptions
import typingsSlinky.tabris.mod.Bounds
import typingsSlinky.tabris.mod.BoxDimensions
import typingsSlinky.tabris.mod.ChangeListeners
import typingsSlinky.tabris.mod.ColorValue
import typingsSlinky.tabris.mod.Composite
import typingsSlinky.tabris.mod.ConstraintValue
import typingsSlinky.tabris.mod.Dimension
import typingsSlinky.tabris.mod.EventObject
import typingsSlinky.tabris.mod.FontValue
import typingsSlinky.tabris.mod.ImageValue
import typingsSlinky.tabris.mod.JSXAttributes
import typingsSlinky.tabris.mod.LayoutDataValue
import typingsSlinky.tabris.mod.LinearGradientValue
import typingsSlinky.tabris.mod.Listeners
import typingsSlinky.tabris.mod.NativeObject
import typingsSlinky.tabris.mod.Omit
import typingsSlinky.tabris.mod.Properties
import typingsSlinky.tabris.mod.Selector
import typingsSlinky.tabris.mod.SiblingReferenceValue
import typingsSlinky.tabris.mod.TextInput
import typingsSlinky.tabris.mod.TextInputAcceptEvent
import typingsSlinky.tabris.mod.TextInputInputEvent
import typingsSlinky.tabris.mod.TextInputSelectEvent
import typingsSlinky.tabris.mod.Transformation
import typingsSlinky.tabris.mod.Widget
import typingsSlinky.tabris.mod.WidgetCollection
import typingsSlinky.tabris.mod.WidgetLongPressEvent
import typingsSlinky.tabris.mod.WidgetPanEvent
import typingsSlinky.tabris.mod.WidgetResizeEvent
import typingsSlinky.tabris.mod.WidgetSwipeEvent
import typingsSlinky.tabris.mod.WidgetTapEvent
import typingsSlinky.tabris.mod.WidgetTouchEvent
import typingsSlinky.tabris.tabrisBooleans.`false`
import typingsSlinky.tabris.tabrisBooleans.`true`
import typingsSlinky.tabris.tabrisStrings.`class`
import typingsSlinky.tabris.tabrisStrings.alignment
import typingsSlinky.tabris.tabrisStrings.all
import typingsSlinky.tabris.tabrisStrings.ascii
import typingsSlinky.tabris.tabrisStrings.auto
import typingsSlinky.tabris.tabrisStrings.autoCapitalize
import typingsSlinky.tabris.tabrisStrings.autoCorrect
import typingsSlinky.tabris.tabrisStrings.background
import typingsSlinky.tabris.tabrisStrings.baseline
import typingsSlinky.tabris.tabrisStrings.borderColor
import typingsSlinky.tabris.tabrisStrings.bottom
import typingsSlinky.tabris.tabrisStrings.bounds
import typingsSlinky.tabris.tabrisStrings.centerX
import typingsSlinky.tabris.tabrisStrings.centerY
import typingsSlinky.tabris.tabrisStrings.classList
import typingsSlinky.tabris.tabrisStrings.cornerRadius
import typingsSlinky.tabris.tabrisStrings.cursorColor
import typingsSlinky.tabris.tabrisStrings.decimal
import typingsSlinky.tabris.tabrisStrings.default
import typingsSlinky.tabris.tabrisStrings.done
import typingsSlinky.tabris.tabrisStrings.editable
import typingsSlinky.tabris.tabrisStrings.elevation
import typingsSlinky.tabris.tabrisStrings.email
import typingsSlinky.tabris.tabrisStrings.enabled
import typingsSlinky.tabris.tabrisStrings.enterKeyType
import typingsSlinky.tabris.tabrisStrings.excludeFromLayout
import typingsSlinky.tabris.tabrisStrings.fill
import typingsSlinky.tabris.tabrisStrings.floatMessage
import typingsSlinky.tabris.tabrisStrings.focused
import typingsSlinky.tabris.tabrisStrings.font
import typingsSlinky.tabris.tabrisStrings.go
import typingsSlinky.tabris.tabrisStrings.height
import typingsSlinky.tabris.tabrisStrings.highlightOnTouch
import typingsSlinky.tabris.tabrisStrings.id
import typingsSlinky.tabris.tabrisStrings.keepFocus
import typingsSlinky.tabris.tabrisStrings.keyboard
import typingsSlinky.tabris.tabrisStrings.keyboardAppearanceMode
import typingsSlinky.tabris.tabrisStrings.layoutData
import typingsSlinky.tabris.tabrisStrings.left
import typingsSlinky.tabris.tabrisStrings.maxChars
import typingsSlinky.tabris.tabrisStrings.message
import typingsSlinky.tabris.tabrisStrings.messageColor
import typingsSlinky.tabris.tabrisStrings.multiline
import typingsSlinky.tabris.tabrisStrings.never
import typingsSlinky.tabris.tabrisStrings.next
import typingsSlinky.tabris.tabrisStrings.none
import typingsSlinky.tabris.tabrisStrings.number
import typingsSlinky.tabris.tabrisStrings.numbersAndPunctuation
import typingsSlinky.tabris.tabrisStrings.onfocus
import typingsSlinky.tabris.tabrisStrings.ontouch
import typingsSlinky.tabris.tabrisStrings.opacity
import typingsSlinky.tabris.tabrisStrings.outline
import typingsSlinky.tabris.tabrisStrings.password
import typingsSlinky.tabris.tabrisStrings.phone
import typingsSlinky.tabris.tabrisStrings.revealPassword
import typingsSlinky.tabris.tabrisStrings.right
import typingsSlinky.tabris.tabrisStrings.search
import typingsSlinky.tabris.tabrisStrings.selection
import typingsSlinky.tabris.tabrisStrings.send
import typingsSlinky.tabris.tabrisStrings.sentence
import typingsSlinky.tabris.tabrisStrings.set
import typingsSlinky.tabris.tabrisStrings.text
import typingsSlinky.tabris.tabrisStrings.textColor
import typingsSlinky.tabris.tabrisStrings.top
import typingsSlinky.tabris.tabrisStrings.transform
import typingsSlinky.tabris.tabrisStrings.underline
import typingsSlinky.tabris.tabrisStrings.url
import typingsSlinky.tabris.tabrisStrings.visible
import typingsSlinky.tabris.tabrisStrings.width
import typingsSlinky.tabris.tabrisStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined tabris.tabris.Omit<tabris.tabris.TextInput, 'set'> */
@js.native
trait OmitTextInputset extends js.Object {
  @JSName("$getPropertyGetter")
  var $getPropertyGetter_Original: js.Function1[/* propertyName */ String, _] = js.native
  @JSName("$getPropertySetter")
  var $getPropertySetter_Original: js.Function1[/* propertyName */ String, _] = js.native
  @JSName("$getProperty")
  var $getProperty_Original: js.Function1[/* name */ String, _] = js.native
  @JSName("$props")
  var $props: js.Any = js.native
  @JSName("$setProperty")
  var $setProperty_Original: js.Function2[/* name */ String, /* value */ js.Any, Unit] = js.native
  @JSName("$trigger")
  var $trigger_Original: js.Function2[/* eventType */ String, /* eventData */ js.UndefOr[js.Object], Unit] = js.native
  @JSName("_checkDisposed")
  var _checkDisposed_Original: js.Function0[Unit] = js.native
  @JSName("_decodeProperty")
  var _decodeProperty_Original: js.Function2[/* propertyName */ String, /* value */ js.Any, _] = js.native
  @JSName("_dispose")
  var _dispose_Original: js.Function1[/* skipNative */ js.UndefOr[Boolean], Unit] = js.native
  @JSName("_encodeProperty")
  var _encodeProperty_Original: js.Function2[/* propertyName */ String, /* value */ js.Any, _] = js.native
  @JSName("_getDefaultPropertyValue")
  var _getDefaultPropertyValue_Original: js.Function1[/* propertyName */ String, Unit] = js.native
  @JSName("_getStoredProperty")
  var _getStoredProperty_Original: js.Function1[/* propertyName */ String, _] = js.native
  @JSName("_getTypeDef")
  var _getTypeDef_Original: js.Function1[/* propertyName */ String, _] = js.native
  @JSName("_getXMLAttributes")
  var _getXMLAttributes_Original: js.Function0[js.Array[js.Tuple2[String, _]]] = js.native
  @JSName("_getXMLContent")
  var _getXMLContent_Original: js.Function0[js.Array[String]] = js.native
  @JSName("_getXMLElementName")
  var _getXMLElementName_Original: js.Function0[String] = js.native
  @JSName("_getXMLFooter")
  var _getXMLFooter_Original: js.Function1[/* hasChild */ Boolean, String] = js.native
  @JSName("_getXMLHeader")
  var _getXMLHeader_Original: js.Function1[/* hasChild */ Boolean, String] = js.native
  var _isDisposed: js.UndefOr[`true`] = js.native
  @JSName("_isListening")
  var _isListening_Original: js.Function1[/* eventType */ String, Boolean] = js.native
  @JSName("_listen")
  var _listen_Original: js.Function2[/* eventName */ String, /* listening */ Boolean, Unit] = js.native
  @JSName("_nativeCall")
  var _nativeCall_Original: js.Function2[/* methodName */ String, /* parameters */ js.Object, _] = js.native
  @JSName("_nativeCreate")
  var _nativeCreate_Original: js.Function1[/* param */ js.UndefOr[StringDictionary[js.Any]], Unit] = js.native
  @JSName("_nativeGet")
  var _nativeGet_Original: js.Function1[/* propertyName */ String, _] = js.native
  @JSName("_nativeListen")
  var _nativeListen_Original: js.Function1[/* eventType */ String, Unit] = js.native
  @JSName("_nativeSet")
  var _nativeSet_Original: js.Function2[/* propertyName */ String, /* value */ js.Any, Unit] = js.native
  var _nativeType: String = js.native
  @JSName("_onoff")
  var _onoff_Original: js.Function3[/* eventType */ String, /* listening */ Boolean, /* listener */ js.Function, Unit] = js.native
  @JSName("_register")
  var _register_Original: js.Function0[Unit] = js.native
  @JSName("_release")
  var _release_Original: js.Function0[Unit] = js.native
  @JSName("_reorderProperties")
  var _reorderProperties_Original: js.Function1[/* propertyNames */ js.Array[String], js.Array[String]] = js.native
  @JSName("_setParent")
  var _setParent_Original: js.Function2[/* parent */ Composite[Widget], /* index */ js.UndefOr[Double], Unit] = js.native
  @JSName("_storeProperty")
  var _storeProperty_Original: js.Function2[/* propertyName */ String, /* encodedValue */ js.Any, Unit] = js.native
  @JSName("_triggerChangeEvent")
  var _triggerChangeEvent_Original: js.Function2[/* propertyName */ String, /* newEncodedValue */ js.Any, Unit] = js.native
  @JSName("_trigger")
  var _trigger_Original: js.Function2[/* eventType */ String, /* eventData */ js.UndefOr[js.Object], Boolean] = js.native
  @JSName("_wasSet")
  var _wasSet_Original: js.Function1[/* propertyName */ String, Boolean] = js.native
  var absoluteBounds: Bounds = js.native
  var alignment: centerX | left | right = js.native
  @JSName("animate")
  var animate_Original: js.Function2[/* properties */ Opacity, /* options */ AnimationOptions, js.Promise[Unit]] = js.native
  @JSName("appendTo")
  var appendTo_Original: js.Function1[/* parent */ Composite[Widget], TextInput] = js.native
  var autoCapitalize: all | `false` | none | sentence | `true` | word = js.native
  var autoCorrect: Boolean = js.native
  var background: LinearGradientValue | ColorValue | ImageValue = js.native
  var baseline: SiblingReferenceValue | auto | `true` = js.native
  var borderColor: ColorValue = js.native
  var bottom: ConstraintValue = js.native
  var bounds: Bounds = js.native
  var centerX: typingsSlinky.tabris.mod.Offset | auto | `true` = js.native
  var centerY: typingsSlinky.tabris.mod.Offset | auto | `true` = js.native
  var cid: String = js.native
  var `class`: String = js.native
  var classList: js.Array[String] = js.native
  @JSName("constructor")
  var constructor_Original: js.Function1[/* properties */ js.UndefOr[Properties[TextInput, Omit[TextInput, set]]], js.Any] = js.native
  var cornerRadius: Double = js.native
  var cursorColor: ColorValue = js.native
  var data: StringDictionary[js.Any] = js.native
  var defineChangeEvent: js.UndefOr[js.Any] = js.native
  var defineEvent: js.UndefOr[js.Any] = js.native
  var defineEvents: js.UndefOr[js.Any] = js.native
  var defineProperties: js.UndefOr[js.Any] = js.native
  var defineProperty: js.UndefOr[js.Any] = js.native
  @JSName("detach")
  var detach_Original: js.Function0[TextInput] = js.native
  @JSName("dispose")
  var dispose_Original: js.Function0[Unit] = js.native
  var editable: Boolean = js.native
  var elevation: Double = js.native
  var enabled: Boolean = js.native
  var enterKeyType: default | done | go | next | search | send = js.native
  var excludeFromLayout: Boolean = js.native
  var extend: js.UndefOr[js.Any] = js.native
  var floatMessage: Boolean = js.native
  var focused: Boolean = js.native
  var font: FontValue = js.native
  var height: Dimension | auto = js.native
  var highlightOnTouch: Boolean = js.native
  var id: String = js.native
  @JSName("insertAfter")
  var insertAfter_Original: js.Function1[/* widget */ Widget, TextInput] = js.native
  @JSName("insertBefore")
  var insertBefore_Original: js.Function1[/* widget */ Widget, TextInput] = js.native
  @JSName("isDisposed")
  var isDisposed_Original: js.Function0[Boolean] = js.native
  var jsxAttributes: (JSXAttributes[TextInput, Omit[TextInput, set | typingsSlinky.tabris.tabrisStrings.jsxAttributes]]) with ChildrenString = js.native
  var keepFocus: Boolean = js.native
  var keyboard: ascii | decimal | default | email | number | numbersAndPunctuation | phone | url = js.native
  var keyboardAppearanceMode: never | ontouch | onfocus = js.native
  var layoutData: LayoutDataValue = js.native
  var left: ConstraintValue = js.native
  var maxChars: Double = js.native
  var message: String = js.native
  var messageColor: ColorValue = js.native
  @JSName("off")
  var off_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], 
    /* context */ js.UndefOr[js.Object], 
    TextInput
  ] = js.native
  var onAccept: Listeners[TextInputAcceptEvent[TextInput]] = js.native
  var onAlignmentChanged: ChangeListeners[TextInput, alignment] = js.native
  var onAutoCapitalizeChanged: ChangeListeners[TextInput, autoCapitalize] = js.native
  var onAutoCorrectChanged: ChangeListeners[TextInput, autoCorrect] = js.native
  var onBackgroundChanged: ChangeListeners[TextInput, background] = js.native
  var onBaselineChanged: ChangeListeners[TextInput, baseline] = js.native
  var onBlur: Listeners[EventObject[TextInput]] = js.native
  var onBorderColorChanged: ChangeListeners[TextInput, borderColor] = js.native
  var onBottomChanged: ChangeListeners[TextInput, bottom] = js.native
  var onBoundsChanged: ChangeListeners[TextInput, bounds] = js.native
  var onCenterXChanged: ChangeListeners[TextInput, centerX] = js.native
  var onCenterYChanged: ChangeListeners[TextInput, centerY] = js.native
  var onClassChanged: ChangeListeners[TextInput, `class`] = js.native
  var onClassListChanged: ChangeListeners[TextInput, classList] = js.native
  var onCornerRadiusChanged: ChangeListeners[TextInput, cornerRadius] = js.native
  var onCursorColorChanged: ChangeListeners[TextInput, cursorColor] = js.native
  var onDispose: Listeners[EventObject[TextInput]] = js.native
  var onEditableChanged: ChangeListeners[TextInput, editable] = js.native
  var onElevationChanged: ChangeListeners[TextInput, elevation] = js.native
  var onEnabledChanged: ChangeListeners[TextInput, enabled] = js.native
  var onEnterKeyTypeChanged: ChangeListeners[TextInput, enterKeyType] = js.native
  var onExcludeFromLayoutChanged: ChangeListeners[TextInput, excludeFromLayout] = js.native
  var onFloatMessageChanged: ChangeListeners[TextInput, floatMessage] = js.native
  var onFocus: Listeners[EventObject[TextInput]] = js.native
  var onFocusedChanged: ChangeListeners[TextInput, focused] = js.native
  var onFontChanged: ChangeListeners[TextInput, font] = js.native
  var onHeightChanged: ChangeListeners[TextInput, height] = js.native
  var onHighlightOnTouchChanged: ChangeListeners[TextInput, highlightOnTouch] = js.native
  var onIdChanged: ChangeListeners[TextInput, id] = js.native
  var onInput: Listeners[TextInputInputEvent[TextInput]] = js.native
  var onKeepFocusChanged: ChangeListeners[TextInput, keepFocus] = js.native
  var onKeyboardAppearanceModeChanged: ChangeListeners[TextInput, keyboardAppearanceMode] = js.native
  var onKeyboardChanged: ChangeListeners[TextInput, keyboard] = js.native
  var onLayoutDataChanged: ChangeListeners[TextInput, layoutData] = js.native
  var onLeftChanged: ChangeListeners[TextInput, left] = js.native
  var onLongPress: Listeners[WidgetLongPressEvent[TextInput]] = js.native
  var onMaxCharsChanged: ChangeListeners[TextInput, maxChars] = js.native
  var onMessageChanged: ChangeListeners[TextInput, message] = js.native
  var onMessageColorChanged: ChangeListeners[TextInput, messageColor] = js.native
  var onOpacityChanged: ChangeListeners[TextInput, opacity] = js.native
  var onPan: Listeners[WidgetPanEvent[TextInput]] = js.native
  var onPanDown: Listeners[WidgetPanEvent[TextInput]] = js.native
  var onPanHorizontal: Listeners[WidgetPanEvent[TextInput]] = js.native
  var onPanLeft: Listeners[WidgetPanEvent[TextInput]] = js.native
  var onPanRight: Listeners[WidgetPanEvent[TextInput]] = js.native
  var onPanUp: Listeners[WidgetPanEvent[TextInput]] = js.native
  var onPanVertical: Listeners[WidgetPanEvent[TextInput]] = js.native
  var onResize: Listeners[WidgetResizeEvent[TextInput]] = js.native
  var onRevealPasswordChanged: ChangeListeners[TextInput, revealPassword] = js.native
  var onRightChanged: ChangeListeners[TextInput, right] = js.native
  var onSelect: Listeners[TextInputSelectEvent[TextInput]] = js.native
  var onSelectionChanged: ChangeListeners[TextInput, selection] = js.native
  var onSwipeDown: Listeners[WidgetSwipeEvent[TextInput]] = js.native
  var onSwipeLeft: Listeners[WidgetSwipeEvent[TextInput]] = js.native
  var onSwipeRight: Listeners[WidgetSwipeEvent[TextInput]] = js.native
  var onSwipeUp: Listeners[WidgetSwipeEvent[TextInput]] = js.native
  var onTap: Listeners[WidgetTapEvent[TextInput]] = js.native
  var onTextChanged: ChangeListeners[TextInput, text] = js.native
  var onTextColorChanged: ChangeListeners[TextInput, textColor] = js.native
  var onTopChanged: ChangeListeners[TextInput, top] = js.native
  var onTouchCancel: Listeners[WidgetTouchEvent[TextInput]] = js.native
  var onTouchEnd: Listeners[WidgetTouchEvent[TextInput]] = js.native
  var onTouchMove: Listeners[WidgetTouchEvent[TextInput]] = js.native
  var onTouchStart: Listeners[WidgetTouchEvent[TextInput]] = js.native
  var onTransformChanged: ChangeListeners[TextInput, transform] = js.native
  var onVisibleChanged: ChangeListeners[TextInput, visible] = js.native
  var onWidthChanged: ChangeListeners[TextInput, width] = js.native
  @JSName("on")
  var on_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], _], 
    /* context */ js.UndefOr[js.Object], 
    TextInput
  ] = js.native
  @JSName("once")
  var once_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], _], 
    /* context */ js.UndefOr[js.Object], 
    TextInput
  ] = js.native
  var opacity: Double = js.native
  var padding: js.UndefOr[BoxDimensions] = js.native
  @JSName("parent")
  var parent_Original: js.Function0[Composite[Widget]] = js.native
  var revealPassword: Boolean = js.native
  var right: ConstraintValue = js.native
  var selection: js.Array[Double] = js.native
  @JSName("siblings")
  var siblings_Original: js.Function1[/* selector */ js.UndefOr[Selector[Widget, Widget]], WidgetCollection[Widget]] = js.native
  var style: default | fill | none | outline | underline = js.native
  var text: String = js.native
  var textColor: ColorValue = js.native
  var top: ConstraintValue = js.native
  var transform: Transformation = js.native
  @JSName("triggerAsync")
  var triggerAsync_Original: js.Function1[/* type */ String, js.Promise[TextInput]] = js.native
  @JSName("trigger")
  var trigger_Original: js.Function1[/* type */ String, TextInput] = js.native
  var `type`: default | multiline | password | search = js.native
  var visible: Boolean = js.native
  var width: Dimension | auto = js.native
  @JSName("$getProperty")
  def $getProperty(name: String): js.Any = js.native
  @JSName("$getPropertyGetter")
  def $getPropertyGetter(propertyName: String): js.Any = js.native
  @JSName("$getPropertySetter")
  def $getPropertySetter(propertyName: String): js.Any = js.native
  @JSName("$setProperty")
  def $setProperty(name: String, value: js.Any): Unit = js.native
  @JSName("$trigger")
  def $trigger(eventType: String): Unit = js.native
  @JSName("$trigger")
  def $trigger(eventType: String, eventData: js.Object): Unit = js.native
  def _checkDisposed(): Unit = js.native
  def _decodeProperty(propertyName: String, value: js.Any): js.Any = js.native
  def _dispose(): Unit = js.native
  def _dispose(skipNative: Boolean): Unit = js.native
  def _encodeProperty(propertyName: String, value: js.Any): js.Any = js.native
  def _getDefaultPropertyValue(propertyName: String): Unit = js.native
  def _getStoredProperty(propertyName: String): js.Any = js.native
  def _getTypeDef(propertyName: String): js.Any = js.native
  def _getXMLAttributes(): js.Array[js.Tuple2[String, _]] = js.native
  def _getXMLContent(): js.Array[String] = js.native
  def _getXMLElementName(): String = js.native
  def _getXMLFooter(hasChild: Boolean): String = js.native
  def _getXMLHeader(hasChild: Boolean): String = js.native
  def _isListening(eventType: String): Boolean = js.native
  def _listen(eventName: String, listening: Boolean): Unit = js.native
  def _nativeCall(methodName: String, parameters: js.Object): js.Any = js.native
  def _nativeCreate(): Unit = js.native
  def _nativeCreate(param: StringDictionary[js.Any]): Unit = js.native
  def _nativeGet(propertyName: String): js.Any = js.native
  def _nativeListen(eventType: String): Unit = js.native
  def _nativeSet(propertyName: String, value: js.Any): Unit = js.native
  def _onoff(eventType: String, listening: Boolean, listener: js.Function): Unit = js.native
  def _register(): Unit = js.native
  def _release(): Unit = js.native
  def _reorderProperties(propertyNames: js.Array[String]): js.Array[String] = js.native
  def _setParent(parent: Composite[Widget]): Unit = js.native
  def _setParent(parent: Composite[Widget], index: Double): Unit = js.native
  def _storeProperty(propertyName: String, encodedValue: js.Any): Unit = js.native
  def _trigger(eventType: String): Boolean = js.native
  def _trigger(eventType: String, eventData: js.Object): Boolean = js.native
  def _triggerChangeEvent(propertyName: String, newEncodedValue: js.Any): Unit = js.native
  def _wasSet(propertyName: String): Boolean = js.native
  def animate(properties: Opacity, options: AnimationOptions): js.Promise[Unit] = js.native
  def appendTo(parent: Composite[Widget]): TextInput = js.native
  def detach(): TextInput = js.native
  def dispose(): Unit = js.native
  def insertAfter(widget: Widget): TextInput = js.native
  def insertBefore(widget: Widget): TextInput = js.native
  def isDisposed(): Boolean = js.native
  def off(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], Unit]): TextInput = js.native
  def off(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], Unit],
    context: js.Object
  ): TextInput = js.native
  def on(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], _]): TextInput = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], _],
    context: js.Object
  ): TextInput = js.native
  def once(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], _]): TextInput = js.native
  def once(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], _],
    context: js.Object
  ): TextInput = js.native
  def parent(): Composite[Widget] = js.native
  def siblings[Result /* <: Widget */](): WidgetCollection[Result] = js.native
  def siblings[Result /* <: Widget */](selector: Selector[Widget, Result]): WidgetCollection[Result] = js.native
  def trigger(`type`: String): TextInput = js.native
  def triggerAsync(`type`: String): js.Promise[TextInput] = js.native
}


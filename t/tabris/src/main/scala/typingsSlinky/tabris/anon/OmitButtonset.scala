package typingsSlinky.tabris.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tabris.mod.AnimationOptions
import typingsSlinky.tabris.mod.Bounds
import typingsSlinky.tabris.mod.BoxDimensions
import typingsSlinky.tabris.mod.Button
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
import typingsSlinky.tabris.mod.Transformation
import typingsSlinky.tabris.mod.Widget
import typingsSlinky.tabris.mod.WidgetCollection
import typingsSlinky.tabris.mod.WidgetLongPressEvent
import typingsSlinky.tabris.mod.WidgetPanEvent
import typingsSlinky.tabris.mod.WidgetResizeEvent
import typingsSlinky.tabris.mod.WidgetSwipeEvent
import typingsSlinky.tabris.mod.WidgetTapEvent
import typingsSlinky.tabris.mod.WidgetTouchEvent
import typingsSlinky.tabris.tabrisBooleans.`true`
import typingsSlinky.tabris.tabrisStrings.`class`
import typingsSlinky.tabris.tabrisStrings.alignment
import typingsSlinky.tabris.tabrisStrings.all
import typingsSlinky.tabris.tabrisStrings.auto
import typingsSlinky.tabris.tabrisStrings.autoCapitalize
import typingsSlinky.tabris.tabrisStrings.background
import typingsSlinky.tabris.tabrisStrings.baseline
import typingsSlinky.tabris.tabrisStrings.bottom
import typingsSlinky.tabris.tabrisStrings.bounds
import typingsSlinky.tabris.tabrisStrings.centerX
import typingsSlinky.tabris.tabrisStrings.centerY
import typingsSlinky.tabris.tabrisStrings.classList
import typingsSlinky.tabris.tabrisStrings.cornerRadius
import typingsSlinky.tabris.tabrisStrings.default
import typingsSlinky.tabris.tabrisStrings.elevate
import typingsSlinky.tabris.tabrisStrings.elevation
import typingsSlinky.tabris.tabrisStrings.enabled
import typingsSlinky.tabris.tabrisStrings.excludeFromLayout
import typingsSlinky.tabris.tabrisStrings.flat
import typingsSlinky.tabris.tabrisStrings.font
import typingsSlinky.tabris.tabrisStrings.height
import typingsSlinky.tabris.tabrisStrings.highlightOnTouch
import typingsSlinky.tabris.tabrisStrings.id
import typingsSlinky.tabris.tabrisStrings.image
import typingsSlinky.tabris.tabrisStrings.imageTintColor
import typingsSlinky.tabris.tabrisStrings.layoutData
import typingsSlinky.tabris.tabrisStrings.left
import typingsSlinky.tabris.tabrisStrings.none
import typingsSlinky.tabris.tabrisStrings.opacity
import typingsSlinky.tabris.tabrisStrings.outline
import typingsSlinky.tabris.tabrisStrings.right
import typingsSlinky.tabris.tabrisStrings.set
import typingsSlinky.tabris.tabrisStrings.strokeColor
import typingsSlinky.tabris.tabrisStrings.strokeWidth
import typingsSlinky.tabris.tabrisStrings.text
import typingsSlinky.tabris.tabrisStrings.textColor
import typingsSlinky.tabris.tabrisStrings.top
import typingsSlinky.tabris.tabrisStrings.transform
import typingsSlinky.tabris.tabrisStrings.visible
import typingsSlinky.tabris.tabrisStrings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined tabris.tabris.Omit<tabris.tabris.Button, 'set'> */
@js.native
trait OmitButtonset extends js.Object {
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
  var appendTo_Original: js.Function1[/* parent */ Composite[Widget], Button] = js.native
  var autoCapitalize: default | none | all = js.native
  var background: LinearGradientValue | ColorValue | ImageValue = js.native
  var baseline: SiblingReferenceValue | auto | `true` = js.native
  var bottom: ConstraintValue = js.native
  var bounds: Bounds = js.native
  var centerX: typingsSlinky.tabris.mod.Offset | auto | `true` = js.native
  var centerY: typingsSlinky.tabris.mod.Offset | auto | `true` = js.native
  var cid: String = js.native
  var `class`: String = js.native
  var classList: js.Array[String] = js.native
  @JSName("constructor")
  var constructor_Original: js.Function1[/* properties */ js.UndefOr[Properties[Button, Omit[Button, set]]], js.Any] = js.native
  var cornerRadius: Double = js.native
  var data: StringDictionary[js.Any] = js.native
  var defineChangeEvent: js.UndefOr[js.Any] = js.native
  var defineEvent: js.UndefOr[js.Any] = js.native
  var defineEvents: js.UndefOr[js.Any] = js.native
  var defineProperties: js.UndefOr[js.Any] = js.native
  var defineProperty: js.UndefOr[js.Any] = js.native
  @JSName("detach")
  var detach_Original: js.Function0[Button] = js.native
  @JSName("dispose")
  var dispose_Original: js.Function0[Unit] = js.native
  var elevation: Double = js.native
  var enabled: Boolean = js.native
  var excludeFromLayout: Boolean = js.native
  var extend: js.UndefOr[js.Any] = js.native
  var font: FontValue = js.native
  var height: Dimension | auto = js.native
  var highlightOnTouch: Boolean = js.native
  var id: String = js.native
  var image: ImageValue = js.native
  var imageTintColor: ColorValue = js.native
  @JSName("insertAfter")
  var insertAfter_Original: js.Function1[/* widget */ Widget, Button] = js.native
  @JSName("insertBefore")
  var insertBefore_Original: js.Function1[/* widget */ Widget, Button] = js.native
  @JSName("isDisposed")
  var isDisposed_Original: js.Function0[Boolean] = js.native
  var jsxAttributes: (JSXAttributes[Button, Omit[Button, set | typingsSlinky.tabris.tabrisStrings.jsxAttributes]]) with ChildrenString = js.native
  var layoutData: LayoutDataValue = js.native
  var left: ConstraintValue = js.native
  @JSName("off")
  var off_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], 
    /* context */ js.UndefOr[js.Object], 
    Button
  ] = js.native
  var onAlignmentChanged: ChangeListeners[Button, alignment] = js.native
  var onAutoCapitalizeChanged: ChangeListeners[Button, autoCapitalize] = js.native
  var onBackgroundChanged: ChangeListeners[Button, background] = js.native
  var onBaselineChanged: ChangeListeners[Button, baseline] = js.native
  var onBottomChanged: ChangeListeners[Button, bottom] = js.native
  var onBoundsChanged: ChangeListeners[Button, bounds] = js.native
  var onCenterXChanged: ChangeListeners[Button, centerX] = js.native
  var onCenterYChanged: ChangeListeners[Button, centerY] = js.native
  var onClassChanged: ChangeListeners[Button, `class`] = js.native
  var onClassListChanged: ChangeListeners[Button, classList] = js.native
  var onCornerRadiusChanged: ChangeListeners[Button, cornerRadius] = js.native
  var onDispose: Listeners[EventObject[Button]] = js.native
  var onElevationChanged: ChangeListeners[Button, elevation] = js.native
  var onEnabledChanged: ChangeListeners[Button, enabled] = js.native
  var onExcludeFromLayoutChanged: ChangeListeners[Button, excludeFromLayout] = js.native
  var onFontChanged: ChangeListeners[Button, font] = js.native
  var onHeightChanged: ChangeListeners[Button, height] = js.native
  var onHighlightOnTouchChanged: ChangeListeners[Button, highlightOnTouch] = js.native
  var onIdChanged: ChangeListeners[Button, id] = js.native
  var onImageChanged: ChangeListeners[Button, image] = js.native
  var onImageTintColorChanged: ChangeListeners[Button, imageTintColor] = js.native
  var onLayoutDataChanged: ChangeListeners[Button, layoutData] = js.native
  var onLeftChanged: ChangeListeners[Button, left] = js.native
  var onLongPress: Listeners[WidgetLongPressEvent[Button]] = js.native
  var onOpacityChanged: ChangeListeners[Button, opacity] = js.native
  var onPan: Listeners[WidgetPanEvent[Button]] = js.native
  var onPanDown: Listeners[WidgetPanEvent[Button]] = js.native
  var onPanHorizontal: Listeners[WidgetPanEvent[Button]] = js.native
  var onPanLeft: Listeners[WidgetPanEvent[Button]] = js.native
  var onPanRight: Listeners[WidgetPanEvent[Button]] = js.native
  var onPanUp: Listeners[WidgetPanEvent[Button]] = js.native
  var onPanVertical: Listeners[WidgetPanEvent[Button]] = js.native
  var onResize: Listeners[WidgetResizeEvent[Button]] = js.native
  var onRightChanged: ChangeListeners[Button, right] = js.native
  var onSelect: Listeners[EventObject[Button]] = js.native
  var onStrokeColorChanged: ChangeListeners[Button, strokeColor] = js.native
  var onStrokeWidthChanged: ChangeListeners[Button, strokeWidth] = js.native
  var onSwipeDown: Listeners[WidgetSwipeEvent[Button]] = js.native
  var onSwipeLeft: Listeners[WidgetSwipeEvent[Button]] = js.native
  var onSwipeRight: Listeners[WidgetSwipeEvent[Button]] = js.native
  var onSwipeUp: Listeners[WidgetSwipeEvent[Button]] = js.native
  var onTap: Listeners[WidgetTapEvent[Button]] = js.native
  var onTextChanged: ChangeListeners[Button, text] = js.native
  var onTextColorChanged: ChangeListeners[Button, textColor] = js.native
  var onTopChanged: ChangeListeners[Button, top] = js.native
  var onTouchCancel: Listeners[WidgetTouchEvent[Button]] = js.native
  var onTouchEnd: Listeners[WidgetTouchEvent[Button]] = js.native
  var onTouchMove: Listeners[WidgetTouchEvent[Button]] = js.native
  var onTouchStart: Listeners[WidgetTouchEvent[Button]] = js.native
  var onTransformChanged: ChangeListeners[Button, transform] = js.native
  var onVisibleChanged: ChangeListeners[Button, visible] = js.native
  var onWidthChanged: ChangeListeners[Button, width] = js.native
  @JSName("on")
  var on_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], _], 
    /* context */ js.UndefOr[js.Object], 
    Button
  ] = js.native
  @JSName("once")
  var once_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], _], 
    /* context */ js.UndefOr[js.Object], 
    Button
  ] = js.native
  var opacity: Double = js.native
  var padding: js.UndefOr[BoxDimensions] = js.native
  @JSName("parent")
  var parent_Original: js.Function0[Composite[Widget]] = js.native
  var right: ConstraintValue = js.native
  @JSName("siblings")
  var siblings_Original: js.Function1[/* selector */ js.UndefOr[Selector[Widget, Widget]], WidgetCollection[Widget]] = js.native
  var strokeColor: ColorValue = js.native
  var strokeWidth: js.UndefOr[Double] = js.native
  var style: default | elevate | flat | outline | text = js.native
  var text: String = js.native
  var textColor: ColorValue = js.native
  var top: ConstraintValue = js.native
  var transform: Transformation = js.native
  @JSName("triggerAsync")
  var triggerAsync_Original: js.Function1[/* type */ String, js.Promise[Button]] = js.native
  @JSName("trigger")
  var trigger_Original: js.Function1[/* type */ String, Button] = js.native
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
  def appendTo(parent: Composite[Widget]): Button = js.native
  def detach(): Button = js.native
  def dispose(): Unit = js.native
  def insertAfter(widget: Widget): Button = js.native
  def insertBefore(widget: Widget): Button = js.native
  def isDisposed(): Boolean = js.native
  def off(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], Unit]): Button = js.native
  def off(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], Unit],
    context: js.Object
  ): Button = js.native
  def on(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], _]): Button = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], _],
    context: js.Object
  ): Button = js.native
  def once(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], _]): Button = js.native
  def once(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], _],
    context: js.Object
  ): Button = js.native
  def parent(): Composite[Widget] = js.native
  def siblings[Result /* <: Widget */](): WidgetCollection[Result] = js.native
  def siblings[Result /* <: Widget */](selector: Selector[Widget, Result]): WidgetCollection[Result] = js.native
  def trigger(`type`: String): Button = js.native
  def triggerAsync(`type`: String): js.Promise[Button] = js.native
}


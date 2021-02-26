package typingsSlinky.tuyaPanelKit.mod

import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.anon.AutoscrollToTopThreshold
import typingsSlinky.reactNative.anon.AverageItemLength
import typingsSlinky.reactNative.anon.Changed
import typingsSlinky.reactNative.anon.DistanceFromEnd
import typingsSlinky.reactNative.anon.Index
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.AccessibilityValue
import typingsSlinky.reactNative.mod.ColorValue
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.NativeScrollEvent
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.PointPropType
import typingsSlinky.reactNative.mod.ScrollViewProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TVParallaxProperties
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNative.mod.ViewabilityConfigCallbackPair
import typingsSlinky.reactNative.mod.ViewabilityConfigCallbackPairs
import typingsSlinky.tuyaPanelKit.anon.BackIconColor
import typingsSlinky.tuyaPanelKit.anon.Container
import typingsSlinky.tuyaPanelKit.anon.`21`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.Fade
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.PullUp
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.ScaleFadeIn
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.ScalePullDown
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`box-none`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`box-only`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`landscape-left`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`landscape-right`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`no-hide-descendants`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`on-drag`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`portrait-upside-down`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.always
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.assertive
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.auto
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.automatic
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.black
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.both
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.button
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.center
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.default
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.end
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.fade_
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.fast
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.formSheet
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.fullScreen
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.handled
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.interactive
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.landscape
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.never
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.no
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.none_
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.normal
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.overFullScreen
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.pageSheet
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.polite
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.portrait
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.radio
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.radiobutton_checked
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.radiobutton_unchecked
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.scrollableAxes
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.singleCancel
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.singleConfirm
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.start
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.switch
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.top
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.white
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent tuya-panel-kit.tuya-panel-kit.PopupProps */
/* Inlined parent std.Omit<tuya-panel-kit.tuya-panel-kit.TYFlatListProps<{}>, 'renderItem' | 'data'> */
@js.native
trait PopUpListProps extends StObject {
  
  var CellRendererComponent: js.UndefOr[ReactComponentClass[_]] = js.native
  
  var ItemSeparatorComponent: js.UndefOr[ReactComponentClass[_] | Null] = js.native
  
  var ListEmptyComponent: js.UndefOr[ReactComponentClass[_] | ReactElement | Null] = js.native
  
  var ListFooterComponent: js.UndefOr[ReactComponentClass[_] | ReactElement | Null] = js.native
  
  var ListFooterComponentStyle: js.UndefOr[ViewStyle | Null] = js.native
  
  var ListHeaderComponent: js.UndefOr[ReactComponentClass[_] | ReactElement | Null] = js.native
  
  var ListHeaderComponentStyle: js.UndefOr[ViewStyle | Null] = js.native
  
  var _onDataChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[String | js.Array[String]], Unit]] = js.native
  
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
  
  var activeIdx: js.UndefOr[Double] = js.native
  
  var alignContainer: js.UndefOr[top | center | bottom] = js.native
  
  var alwaysBounceHorizontal: js.UndefOr[Boolean] = js.native
  
  var alwaysBounceVertical: js.UndefOr[Boolean] = js.native
  
  var animated: js.UndefOr[Boolean] = js.native
  
  var animationType: js.UndefOr[fade_ | none_] = js.native
  
  var automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.native
  
  var backIconColor: js.UndefOr[String] = js.native
  
  var backText: js.UndefOr[String] = js.native
  
  var bounces: js.UndefOr[Boolean] = js.native
  
  var bouncesZoom: js.UndefOr[Boolean] = js.native
  
  var canCancelContentTouches: js.UndefOr[Boolean] = js.native
  
  var cancelText: js.UndefOr[String] = js.native
  
  var cancelTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var centerContent: js.UndefOr[Boolean] = js.native
  
  var collapsable: js.UndefOr[Boolean] = js.native
  
  var columnWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var confirmText: js.UndefOr[String] = js.native
  
  var confirmTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var contentCenter: js.UndefOr[Boolean] = js.native
  
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var contentInset: js.UndefOr[Insets] = js.native
  
  var contentInsetAdjustmentBehavior: js.UndefOr[automatic | scrollableAxes | never | always] = js.native
  
  var contentOffset: js.UndefOr[PointPropType] = js.native
  
  var dataSource: js.UndefOr[js.Array[ListDate]] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var decelerationRate: js.UndefOr[fast | normal | Double] = js.native
  
  var directionalLockEnabled: js.UndefOr[Boolean] = js.native
  
  var disableIntervalMomentum: js.UndefOr[Boolean] = js.native
  
  var disableScrollViewPanResponder: js.UndefOr[Boolean] = js.native
  
  var disableVirtualization: js.UndefOr[Boolean] = js.native
  
  var endFillColor: js.UndefOr[ColorValue] = js.native
  
  var extraData: js.UndefOr[js.Any] = js.native
  
  var fadingEdgeLength: js.UndefOr[Double] = js.native
  
  var flatListRef: js.UndefOr[js.Function0[Unit]] = js.native
  
  var focusable: js.UndefOr[Boolean] = js.native
  
  var footer: js.UndefOr[ReactElement] = js.native
  
  var footerType: js.UndefOr[both | singleConfirm | singleCancel] = js.native
  
  var footerWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var getItem: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, js.Object]] = js.native
  
  var getItemCount: js.UndefOr[js.Function1[/* data */ js.Any, Double]] = js.native
  
  var getItemLayout: js.UndefOr[
    js.Function2[/* data */ js.UndefOr[js.Array[js.Object] | Null], /* index */ Double, Index]
  ] = js.native
  
  var hardwareAccelerated: js.UndefOr[Boolean] = js.native
  
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.native
  
  var hitSlop: js.UndefOr[Insets] = js.native
  
  var horizontal: js.UndefOr[Boolean | Null] = js.native
  
  var iconTintColor: js.UndefOr[String] = js.native
  
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.native
  
  var indicatorStyle: js.UndefOr[default | black | white] = js.native
  
  var initialNumToRender: js.UndefOr[Double] = js.native
  
  var initialScrollIndex: js.UndefOr[Double | Null] = js.native
  
  var invertStickyHeaders: js.UndefOr[Boolean] = js.native
  
  var inverted: js.UndefOr[Boolean | Null] = js.native
  
  var isAlign: js.UndefOr[Boolean] = js.native
  
  var isTVSelectable: js.UndefOr[Boolean] = js.native
  
  var keyExtractor: js.UndefOr[js.Function2[/* item */ js.Object, /* index */ Double, String]] = js.native
  
  var keyboardDismissMode: js.UndefOr[none_ | interactive | `on-drag`] = js.native
  
  var keyboardShouldPersistTaps: js.UndefOr[Boolean | always | never | handled] = js.native
  
  var legacyImplementation: js.UndefOr[Boolean] = js.native
  
  var listItemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var listKey: js.UndefOr[String] = js.native
  
  var listWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var maintainVisibleContentPosition: js.UndefOr[Null | AutoscrollToTopThreshold] = js.native
  
  var mask: js.UndefOr[Boolean] = js.native
  
  var maskStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var maxItemNum: js.UndefOr[Double] = js.native
  
  var maxToRenderPerBatch: js.UndefOr[Double] = js.native
  
  var maximumZoomScale: js.UndefOr[Double] = js.native
  
  var minimumZoomScale: js.UndefOr[Double] = js.native
  
  var modalChildStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var motionConfig: js.UndefOr[
    MotionScaleFadeInProps | MotionFadeProps | MotionPullUpProps | MotionScalePullDownProps
  ] = js.native
  
  var motionType: js.UndefOr[none_ | ScaleFadeIn | Fade | PullUp | ScalePullDown] = js.native
  
  var nativeID: js.UndefOr[String] = js.native
  
  var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.native
  
  var nestedScrollEnabled: js.UndefOr[Boolean] = js.native
  
  var numColumns: js.UndefOr[Double] = js.native
  
  var onAccessibilityAction: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]] = js.native
  
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onBack: js.UndefOr[js.Function1[/* args */ `21`, Unit]] = js.native
  
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onConfirm: js.UndefOr[js.Function2[/* data */ js.Any, /* args */ `21`, Unit]] = js.native
  
  var onContentSizeChange: js.UndefOr[js.Function2[/* w */ Double, /* h */ Double, Unit]] = js.native
  
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onEndReached: js.UndefOr[(js.Function1[/* info */ DistanceFromEnd, Unit]) | Null] = js.native
  
  var onEndReachedThreshold: js.UndefOr[Double | Null] = js.native
  
  var onLayout: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, Layout], Unit]] = js.native
  
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onMaskPress: js.UndefOr[js.Function1[/* args */ `21`, Unit]] = js.native
  
  var onMomentumScrollBegin: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeScrollEvent], Unit]] = js.native
  
  var onMomentumScrollEnd: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeScrollEvent], Unit]] = js.native
  
  var onMoveShouldSetResponder: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
  
  var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
  
  var onOrientationChange: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, _], Unit]] = js.native
  
  var onRefresh: js.UndefOr[js.Function0[Unit] | Null] = js.native
  
  var onRequestClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onResponderEnd: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onResponderGrant: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onResponderMove: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onResponderReject: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onResponderRelease: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onResponderStart: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onResponderTerminate: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onResponderTerminationRequest: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
  
  var onScroll: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeScrollEvent], Unit]] = js.native
  
  var onScrollAnimationEnd: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onScrollBeginDrag: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeScrollEvent], Unit]] = js.native
  
  var onScrollEndDrag: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeScrollEvent], Unit]] = js.native
  
  var onScrollToIndexFailed: js.UndefOr[js.Function1[/* info */ AverageItemLength, Unit]] = js.native
  
  var onScrollToTop: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeScrollEvent], Unit]] = js.native
  
  var onSelect: js.UndefOr[
    js.Function2[/* value */ String | Double, /* sValue */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  var onShow: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, _], Unit]] = js.native
  
  var onStartShouldSetResponder: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
  
  var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
  
  var onSwitchValueChange: js.UndefOr[js.Function1[/* value */ Boolean, Unit]] = js.native
  
  var onTouchCancel: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onTouchEnd: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onTouchEndCapture: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onTouchMove: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onTouchStart: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onViewableItemsChanged: js.UndefOr[(js.Function1[/* info */ Changed, Unit]) | Null] = js.native
  
  var onlyLastModalVisible: js.UndefOr[Boolean] = js.native
  
  var overScrollMode: js.UndefOr[auto | always | never] = js.native
  
  var pagingEnabled: js.UndefOr[Boolean] = js.native
  
  var persistentScrollbar: js.UndefOr[Boolean] = js.native
  
  var pinchGestureEnabled: js.UndefOr[Boolean] = js.native
  
  var pointerEvents: js.UndefOr[`box-none` | none_ | `box-only` | auto] = js.native
  
  var presentationStyle: js.UndefOr[fullScreen | pageSheet | formSheet | overFullScreen] = js.native
  
  var progressViewOffset: js.UndefOr[Double] = js.native
  
  var refreshControl: js.UndefOr[ReactElement] = js.native
  
  var refreshing: js.UndefOr[Boolean | Null] = js.native
  
  var removeClippedSubviews: js.UndefOr[Boolean] = js.native
  
  var renderScrollComponent: js.UndefOr[js.Function1[/* props */ ScrollViewProps, ReactElement]] = js.native
  
  var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.native
  
  var scrollEnabled: js.UndefOr[Boolean] = js.native
  
  var scrollEventThrottle: js.UndefOr[Double] = js.native
  
  var scrollIndicatorInsets: js.UndefOr[Insets] = js.native
  
  var scrollPerfTag: js.UndefOr[String] = js.native
  
  var scrollToOverflowEnabled: js.UndefOr[Boolean] = js.native
  
  var scrollsToTop: js.UndefOr[Boolean] = js.native
  
  var selectedIcon: js.UndefOr[ReactElement] = js.native
  
  var separatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var shouldRasterizeIOS: js.UndefOr[Boolean] = js.native
  
  var showBack: js.UndefOr[Boolean] = js.native
  
  var showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.native
  
  var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.native
  
  var snapToAlignment: js.UndefOr[start | center | end] = js.native
  
  var snapToEnd: js.UndefOr[Boolean] = js.native
  
  var snapToInterval: js.UndefOr[Double] = js.native
  
  var snapToOffsets: js.UndefOr[js.Array[Double]] = js.native
  
  var snapToStart: js.UndefOr[Boolean] = js.native
  
  var statusBarTranslucent: js.UndefOr[Boolean] = js.native
  
  var stickyHeaderIndices: js.UndefOr[js.Array[Double]] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var styles: js.UndefOr[Container] = js.native
  
  var subTitle: js.UndefOr[String] = js.native
  
  var supportedOrientations: js.UndefOr[
    js.Array[
      portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
    ]
  ] = js.native
  
  var switchValue: js.UndefOr[Boolean] = js.native
  
  var testID: js.UndefOr[String] = js.native
  
  var theme: js.UndefOr[BackIconColor] = js.native
  
  var title: js.UndefOr[String | js.Array[String] | ReactElement] = js.native
  
  var titleTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var titleWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var transparent: js.UndefOr[Boolean] = js.native
  
  var tvParallaxMagnification: js.UndefOr[Double] = js.native
  
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.native
  
  var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.native
  
  var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.native
  
  var tvParallaxTiltAngle: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[radio | switch] = js.native
  
  var updateCellsBatchingPeriod: js.UndefOr[Double] = js.native
  
  var useART: js.UndefOr[Boolean] = js.native
  
  var useKeyboardView: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[String | Double | (js.Array[Double | String])] = js.native
  
  var viewabilityConfig: js.UndefOr[js.Any] = js.native
  
  var viewabilityConfigCallbackPairs: js.UndefOr[ViewabilityConfigCallbackPairs] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var windowSize: js.UndefOr[Double] = js.native
  
  var wrapperStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var zoomScale: js.UndefOr[Double] = js.native
}
object PopUpListProps {
  
  @scala.inline
  def apply(): PopUpListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopUpListProps]
  }
  
  @scala.inline
  implicit class PopUpListPropsMutableBuilder[Self <: PopUpListProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
    
    @scala.inline
    def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value :_*))
    
    @scala.inline
    def setAccessibilityComponentType(value: none_ | button | radiobutton_checked | radiobutton_unchecked): Self = StObject.set(x, "accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityComponentTypeUndefined: Self = StObject.set(x, "accessibilityComponentType", js.undefined)
    
    @scala.inline
    def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
    
    @scala.inline
    def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
    
    @scala.inline
    def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityLiveRegion(value: none_ | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
    
    @scala.inline
    def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
    
    @scala.inline
    def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    @scala.inline
    def setAccessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): Self = StObject.set(x, "accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityTraitsUndefined: Self = StObject.set(x, "accessibilityTraits", js.undefined)
    
    @scala.inline
    def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = StObject.set(x, "accessibilityTraits", js.Array(value :_*))
    
    @scala.inline
    def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
    
    @scala.inline
    def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
    
    @scala.inline
    def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    @scala.inline
    def setActiveIdx(value: Double): Self = StObject.set(x, "activeIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveIdxUndefined: Self = StObject.set(x, "activeIdx", js.undefined)
    
    @scala.inline
    def setAlignContainer(value: top | center | bottom): Self = StObject.set(x, "alignContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignContainerUndefined: Self = StObject.set(x, "alignContainer", js.undefined)
    
    @scala.inline
    def setAlwaysBounceHorizontal(value: Boolean): Self = StObject.set(x, "alwaysBounceHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysBounceHorizontalUndefined: Self = StObject.set(x, "alwaysBounceHorizontal", js.undefined)
    
    @scala.inline
    def setAlwaysBounceVertical(value: Boolean): Self = StObject.set(x, "alwaysBounceVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysBounceVerticalUndefined: Self = StObject.set(x, "alwaysBounceVertical", js.undefined)
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setAnimationType(value: fade_ | none_): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
    
    @scala.inline
    def setAutomaticallyAdjustContentInsets(value: Boolean): Self = StObject.set(x, "automaticallyAdjustContentInsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticallyAdjustContentInsetsUndefined: Self = StObject.set(x, "automaticallyAdjustContentInsets", js.undefined)
    
    @scala.inline
    def setBackIconColor(value: String): Self = StObject.set(x, "backIconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackIconColorUndefined: Self = StObject.set(x, "backIconColor", js.undefined)
    
    @scala.inline
    def setBackText(value: String): Self = StObject.set(x, "backText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackTextUndefined: Self = StObject.set(x, "backText", js.undefined)
    
    @scala.inline
    def setBounces(value: Boolean): Self = StObject.set(x, "bounces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBouncesUndefined: Self = StObject.set(x, "bounces", js.undefined)
    
    @scala.inline
    def setBouncesZoom(value: Boolean): Self = StObject.set(x, "bouncesZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBouncesZoomUndefined: Self = StObject.set(x, "bouncesZoom", js.undefined)
    
    @scala.inline
    def setCanCancelContentTouches(value: Boolean): Self = StObject.set(x, "canCancelContentTouches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanCancelContentTouchesUndefined: Self = StObject.set(x, "canCancelContentTouches", js.undefined)
    
    @scala.inline
    def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "cancelTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelTextStyleNull: Self = StObject.set(x, "cancelTextStyle", null)
    
    @scala.inline
    def setCancelTextStyleUndefined: Self = StObject.set(x, "cancelTextStyle", js.undefined)
    
    @scala.inline
    def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    @scala.inline
    def setCellRendererComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "CellRendererComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellRendererComponentComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "CellRendererComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellRendererComponentFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "CellRendererComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellRendererComponentUndefined: Self = StObject.set(x, "CellRendererComponent", js.undefined)
    
    @scala.inline
    def setCenterContent(value: Boolean): Self = StObject.set(x, "centerContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterContentUndefined: Self = StObject.set(x, "centerContent", js.undefined)
    
    @scala.inline
    def setCollapsable(value: Boolean): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
    
    @scala.inline
    def setColumnWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "columnWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnWrapperStyleNull: Self = StObject.set(x, "columnWrapperStyle", null)
    
    @scala.inline
    def setColumnWrapperStyleUndefined: Self = StObject.set(x, "columnWrapperStyle", js.undefined)
    
    @scala.inline
    def setConfirmText(value: String): Self = StObject.set(x, "confirmText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "confirmTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmTextStyleNull: Self = StObject.set(x, "confirmTextStyle", null)
    
    @scala.inline
    def setConfirmTextStyleUndefined: Self = StObject.set(x, "confirmTextStyle", js.undefined)
    
    @scala.inline
    def setConfirmTextUndefined: Self = StObject.set(x, "confirmText", js.undefined)
    
    @scala.inline
    def setContentCenter(value: Boolean): Self = StObject.set(x, "contentCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentCenterUndefined: Self = StObject.set(x, "contentCenter", js.undefined)
    
    @scala.inline
    def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentContainerStyleNull: Self = StObject.set(x, "contentContainerStyle", null)
    
    @scala.inline
    def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
    
    @scala.inline
    def setContentInset(value: Insets): Self = StObject.set(x, "contentInset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentInsetAdjustmentBehavior(value: automatic | scrollableAxes | never | always): Self = StObject.set(x, "contentInsetAdjustmentBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentInsetAdjustmentBehaviorUndefined: Self = StObject.set(x, "contentInsetAdjustmentBehavior", js.undefined)
    
    @scala.inline
    def setContentInsetUndefined: Self = StObject.set(x, "contentInset", js.undefined)
    
    @scala.inline
    def setContentOffset(value: PointPropType): Self = StObject.set(x, "contentOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentOffsetUndefined: Self = StObject.set(x, "contentOffset", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Array[ListDate]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: ListDate*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setDecelerationRate(value: fast | normal | Double): Self = StObject.set(x, "decelerationRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecelerationRateUndefined: Self = StObject.set(x, "decelerationRate", js.undefined)
    
    @scala.inline
    def setDirectionalLockEnabled(value: Boolean): Self = StObject.set(x, "directionalLockEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionalLockEnabledUndefined: Self = StObject.set(x, "directionalLockEnabled", js.undefined)
    
    @scala.inline
    def setDisableIntervalMomentum(value: Boolean): Self = StObject.set(x, "disableIntervalMomentum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableIntervalMomentumUndefined: Self = StObject.set(x, "disableIntervalMomentum", js.undefined)
    
    @scala.inline
    def setDisableScrollViewPanResponder(value: Boolean): Self = StObject.set(x, "disableScrollViewPanResponder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableScrollViewPanResponderUndefined: Self = StObject.set(x, "disableScrollViewPanResponder", js.undefined)
    
    @scala.inline
    def setDisableVirtualization(value: Boolean): Self = StObject.set(x, "disableVirtualization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableVirtualizationUndefined: Self = StObject.set(x, "disableVirtualization", js.undefined)
    
    @scala.inline
    def setEndFillColor(value: ColorValue): Self = StObject.set(x, "endFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndFillColorUndefined: Self = StObject.set(x, "endFillColor", js.undefined)
    
    @scala.inline
    def setExtraData(value: js.Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
    
    @scala.inline
    def setFadingEdgeLength(value: Double): Self = StObject.set(x, "fadingEdgeLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadingEdgeLengthUndefined: Self = StObject.set(x, "fadingEdgeLength", js.undefined)
    
    @scala.inline
    def setFlatListRef(value: () => Unit): Self = StObject.set(x, "flatListRef", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlatListRefUndefined: Self = StObject.set(x, "flatListRef", js.undefined)
    
    @scala.inline
    def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    @scala.inline
    def setFooter(value: ReactElement): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterReactElement(value: ReactElement): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterType(value: both | singleConfirm | singleCancel): Self = StObject.set(x, "footerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterTypeUndefined: Self = StObject.set(x, "footerType", js.undefined)
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setFooterWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "footerWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterWrapperStyleNull: Self = StObject.set(x, "footerWrapperStyle", null)
    
    @scala.inline
    def setFooterWrapperStyleUndefined: Self = StObject.set(x, "footerWrapperStyle", js.undefined)
    
    @scala.inline
    def setGetItem(value: (/* data */ js.Any, /* index */ Double) => js.Object): Self = StObject.set(x, "getItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetItemCount(value: /* data */ js.Any => Double): Self = StObject.set(x, "getItemCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemCountUndefined: Self = StObject.set(x, "getItemCount", js.undefined)
    
    @scala.inline
    def setGetItemLayout(value: (/* data */ js.UndefOr[js.Array[js.Object] | Null], /* index */ Double) => Index): Self = StObject.set(x, "getItemLayout", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetItemLayoutUndefined: Self = StObject.set(x, "getItemLayout", js.undefined)
    
    @scala.inline
    def setGetItemUndefined: Self = StObject.set(x, "getItem", js.undefined)
    
    @scala.inline
    def setHardwareAccelerated(value: Boolean): Self = StObject.set(x, "hardwareAccelerated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardwareAcceleratedUndefined: Self = StObject.set(x, "hardwareAccelerated", js.undefined)
    
    @scala.inline
    def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
    
    @scala.inline
    def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalNull: Self = StObject.set(x, "horizontal", null)
    
    @scala.inline
    def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    @scala.inline
    def setIconTintColor(value: String): Self = StObject.set(x, "iconTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconTintColorUndefined: Self = StObject.set(x, "iconTintColor", js.undefined)
    
    @scala.inline
    def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    @scala.inline
    def setIndicatorStyle(value: default | black | white): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
    
    @scala.inline
    def setInitialNumToRender(value: Double): Self = StObject.set(x, "initialNumToRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialNumToRenderUndefined: Self = StObject.set(x, "initialNumToRender", js.undefined)
    
    @scala.inline
    def setInitialScrollIndex(value: Double): Self = StObject.set(x, "initialScrollIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialScrollIndexNull: Self = StObject.set(x, "initialScrollIndex", null)
    
    @scala.inline
    def setInitialScrollIndexUndefined: Self = StObject.set(x, "initialScrollIndex", js.undefined)
    
    @scala.inline
    def setInvertStickyHeaders(value: Boolean): Self = StObject.set(x, "invertStickyHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertStickyHeadersUndefined: Self = StObject.set(x, "invertStickyHeaders", js.undefined)
    
    @scala.inline
    def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertedNull: Self = StObject.set(x, "inverted", null)
    
    @scala.inline
    def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
    
    @scala.inline
    def setIsAlign(value: Boolean): Self = StObject.set(x, "isAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAlignUndefined: Self = StObject.set(x, "isAlign", js.undefined)
    
    @scala.inline
    def setIsTVSelectable(value: Boolean): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
    
    @scala.inline
    def setItemSeparatorComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "ItemSeparatorComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSeparatorComponentComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "ItemSeparatorComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSeparatorComponentFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "ItemSeparatorComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSeparatorComponentNull: Self = StObject.set(x, "ItemSeparatorComponent", null)
    
    @scala.inline
    def setItemSeparatorComponentUndefined: Self = StObject.set(x, "ItemSeparatorComponent", js.undefined)
    
    @scala.inline
    def setKeyExtractor(value: (/* item */ js.Object, /* index */ Double) => String): Self = StObject.set(x, "keyExtractor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setKeyExtractorUndefined: Self = StObject.set(x, "keyExtractor", js.undefined)
    
    @scala.inline
    def setKeyboardDismissMode(value: none_ | interactive | `on-drag`): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
    
    @scala.inline
    def setKeyboardShouldPersistTaps(value: Boolean | always | never | handled): Self = StObject.set(x, "keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardShouldPersistTapsUndefined: Self = StObject.set(x, "keyboardShouldPersistTaps", js.undefined)
    
    @scala.inline
    def setLegacyImplementation(value: Boolean): Self = StObject.set(x, "legacyImplementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegacyImplementationUndefined: Self = StObject.set(x, "legacyImplementation", js.undefined)
    
    @scala.inline
    def setListEmptyComponent(value: ReactComponentClass[_] | ReactElement): Self = StObject.set(x, "ListEmptyComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListEmptyComponentComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "ListEmptyComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListEmptyComponentFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "ListEmptyComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListEmptyComponentNull: Self = StObject.set(x, "ListEmptyComponent", null)
    
    @scala.inline
    def setListEmptyComponentReactElement(value: ReactElement): Self = StObject.set(x, "ListEmptyComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListEmptyComponentUndefined: Self = StObject.set(x, "ListEmptyComponent", js.undefined)
    
    @scala.inline
    def setListFooterComponent(value: ReactComponentClass[_] | ReactElement): Self = StObject.set(x, "ListFooterComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListFooterComponentComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "ListFooterComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListFooterComponentFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "ListFooterComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListFooterComponentNull: Self = StObject.set(x, "ListFooterComponent", null)
    
    @scala.inline
    def setListFooterComponentReactElement(value: ReactElement): Self = StObject.set(x, "ListFooterComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListFooterComponentStyle(value: ViewStyle): Self = StObject.set(x, "ListFooterComponentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListFooterComponentStyleNull: Self = StObject.set(x, "ListFooterComponentStyle", null)
    
    @scala.inline
    def setListFooterComponentStyleUndefined: Self = StObject.set(x, "ListFooterComponentStyle", js.undefined)
    
    @scala.inline
    def setListFooterComponentUndefined: Self = StObject.set(x, "ListFooterComponent", js.undefined)
    
    @scala.inline
    def setListHeaderComponent(value: ReactComponentClass[_] | ReactElement): Self = StObject.set(x, "ListHeaderComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListHeaderComponentComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "ListHeaderComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListHeaderComponentFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "ListHeaderComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListHeaderComponentNull: Self = StObject.set(x, "ListHeaderComponent", null)
    
    @scala.inline
    def setListHeaderComponentReactElement(value: ReactElement): Self = StObject.set(x, "ListHeaderComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListHeaderComponentStyle(value: ViewStyle): Self = StObject.set(x, "ListHeaderComponentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListHeaderComponentStyleNull: Self = StObject.set(x, "ListHeaderComponentStyle", null)
    
    @scala.inline
    def setListHeaderComponentStyleUndefined: Self = StObject.set(x, "ListHeaderComponentStyle", js.undefined)
    
    @scala.inline
    def setListHeaderComponentUndefined: Self = StObject.set(x, "ListHeaderComponent", js.undefined)
    
    @scala.inline
    def setListItemStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "listItemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListItemStyleNull: Self = StObject.set(x, "listItemStyle", null)
    
    @scala.inline
    def setListItemStyleUndefined: Self = StObject.set(x, "listItemStyle", js.undefined)
    
    @scala.inline
    def setListKey(value: String): Self = StObject.set(x, "listKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListKeyUndefined: Self = StObject.set(x, "listKey", js.undefined)
    
    @scala.inline
    def setListWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "listWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListWrapperStyleNull: Self = StObject.set(x, "listWrapperStyle", null)
    
    @scala.inline
    def setListWrapperStyleUndefined: Self = StObject.set(x, "listWrapperStyle", js.undefined)
    
    @scala.inline
    def setMaintainVisibleContentPosition(value: AutoscrollToTopThreshold): Self = StObject.set(x, "maintainVisibleContentPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintainVisibleContentPositionNull: Self = StObject.set(x, "maintainVisibleContentPosition", null)
    
    @scala.inline
    def setMaintainVisibleContentPositionUndefined: Self = StObject.set(x, "maintainVisibleContentPosition", js.undefined)
    
    @scala.inline
    def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskStyleNull: Self = StObject.set(x, "maskStyle", null)
    
    @scala.inline
    def setMaskStyleUndefined: Self = StObject.set(x, "maskStyle", js.undefined)
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    @scala.inline
    def setMaxItemNum(value: Double): Self = StObject.set(x, "maxItemNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemNumUndefined: Self = StObject.set(x, "maxItemNum", js.undefined)
    
    @scala.inline
    def setMaxToRenderPerBatch(value: Double): Self = StObject.set(x, "maxToRenderPerBatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxToRenderPerBatchUndefined: Self = StObject.set(x, "maxToRenderPerBatch", js.undefined)
    
    @scala.inline
    def setMaximumZoomScale(value: Double): Self = StObject.set(x, "maximumZoomScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumZoomScaleUndefined: Self = StObject.set(x, "maximumZoomScale", js.undefined)
    
    @scala.inline
    def setMinimumZoomScale(value: Double): Self = StObject.set(x, "minimumZoomScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumZoomScaleUndefined: Self = StObject.set(x, "minimumZoomScale", js.undefined)
    
    @scala.inline
    def setModalChildStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "modalChildStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalChildStyleNull: Self = StObject.set(x, "modalChildStyle", null)
    
    @scala.inline
    def setModalChildStyleUndefined: Self = StObject.set(x, "modalChildStyle", js.undefined)
    
    @scala.inline
    def setMotionConfig(value: MotionScaleFadeInProps | MotionFadeProps | MotionPullUpProps | MotionScalePullDownProps): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
    
    @scala.inline
    def setMotionType(value: none_ | ScaleFadeIn | Fade | PullUp | ScalePullDown): Self = StObject.set(x, "motionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotionTypeUndefined: Self = StObject.set(x, "motionType", js.undefined)
    
    @scala.inline
    def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    @scala.inline
    def setNeedsOffscreenAlphaCompositing(value: Boolean): Self = StObject.set(x, "needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedsOffscreenAlphaCompositingUndefined: Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.undefined)
    
    @scala.inline
    def setNestedScrollEnabled(value: Boolean): Self = StObject.set(x, "nestedScrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedScrollEnabledUndefined: Self = StObject.set(x, "nestedScrollEnabled", js.undefined)
    
    @scala.inline
    def setNumColumns(value: Double): Self = StObject.set(x, "numColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumColumnsUndefined: Self = StObject.set(x, "numColumns", js.undefined)
    
    @scala.inline
    def setOnAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    @scala.inline
    def setOnAccessibilityEscape(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    @scala.inline
    def setOnAccessibilityTap(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
    @scala.inline
    def setOnBack(value: /* args */ `21` => Unit): Self = StObject.set(x, "onBack", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBackUndefined: Self = StObject.set(x, "onBack", js.undefined)
    
    @scala.inline
    def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    @scala.inline
    def setOnConfirm(value: (/* data */ js.Any, /* args */ `21`) => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
    
    @scala.inline
    def setOnContentSizeChange(value: (/* w */ Double, /* h */ Double) => Unit): Self = StObject.set(x, "onContentSizeChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnContentSizeChangeUndefined: Self = StObject.set(x, "onContentSizeChange", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
    
    @scala.inline
    def setOnEndReached(value: /* info */ DistanceFromEnd => Unit): Self = StObject.set(x, "onEndReached", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEndReachedNull: Self = StObject.set(x, "onEndReached", null)
    
    @scala.inline
    def setOnEndReachedThreshold(value: Double): Self = StObject.set(x, "onEndReachedThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEndReachedThresholdNull: Self = StObject.set(x, "onEndReachedThreshold", null)
    
    @scala.inline
    def setOnEndReachedThresholdUndefined: Self = StObject.set(x, "onEndReachedThreshold", js.undefined)
    
    @scala.inline
    def setOnEndReachedUndefined: Self = StObject.set(x, "onEndReached", js.undefined)
    
    @scala.inline
    def setOnLayout(value: SyntheticEvent[NodeHandle, Layout] => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    @scala.inline
    def setOnMagicTap(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    @scala.inline
    def setOnMaskPress(value: /* args */ `21` => Unit): Self = StObject.set(x, "onMaskPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMaskPressUndefined: Self = StObject.set(x, "onMaskPress", js.undefined)
    
    @scala.inline
    def setOnMomentumScrollBegin(value: SyntheticEvent[NodeHandle, NativeScrollEvent] => Unit): Self = StObject.set(x, "onMomentumScrollBegin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMomentumScrollBeginUndefined: Self = StObject.set(x, "onMomentumScrollBegin", js.undefined)
    
    @scala.inline
    def setOnMomentumScrollEnd(value: SyntheticEvent[NodeHandle, NativeScrollEvent] => Unit): Self = StObject.set(x, "onMomentumScrollEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMomentumScrollEndUndefined: Self = StObject.set(x, "onMomentumScrollEnd", js.undefined)
    
    @scala.inline
    def setOnMoveShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMoveShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
    
    @scala.inline
    def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
    
    @scala.inline
    def setOnOrientationChange(value: SyntheticEvent[NodeHandle, _] => Unit): Self = StObject.set(x, "onOrientationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOrientationChangeUndefined: Self = StObject.set(x, "onOrientationChange", js.undefined)
    
    @scala.inline
    def setOnRefresh(value: () => Unit): Self = StObject.set(x, "onRefresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnRefreshNull: Self = StObject.set(x, "onRefresh", null)
    
    @scala.inline
    def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
    
    @scala.inline
    def setOnRequestClose(value: () => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnRequestCloseUndefined: Self = StObject.set(x, "onRequestClose", js.undefined)
    
    @scala.inline
    def setOnResponderEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
    
    @scala.inline
    def setOnResponderGrant(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderGrant", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
    
    @scala.inline
    def setOnResponderMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
    
    @scala.inline
    def setOnResponderReject(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderReject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
    
    @scala.inline
    def setOnResponderRelease(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
    
    @scala.inline
    def setOnResponderStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
    
    @scala.inline
    def setOnResponderTerminate(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderTerminate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
    
    @scala.inline
    def setOnResponderTerminationRequest(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
    
    @scala.inline
    def setOnScroll(value: SyntheticEvent[NodeHandle, NativeScrollEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollAnimationEnd(value: () => Unit): Self = StObject.set(x, "onScrollAnimationEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnScrollAnimationEndUndefined: Self = StObject.set(x, "onScrollAnimationEnd", js.undefined)
    
    @scala.inline
    def setOnScrollBeginDrag(value: SyntheticEvent[NodeHandle, NativeScrollEvent] => Unit): Self = StObject.set(x, "onScrollBeginDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollBeginDragUndefined: Self = StObject.set(x, "onScrollBeginDrag", js.undefined)
    
    @scala.inline
    def setOnScrollEndDrag(value: SyntheticEvent[NodeHandle, NativeScrollEvent] => Unit): Self = StObject.set(x, "onScrollEndDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollEndDragUndefined: Self = StObject.set(x, "onScrollEndDrag", js.undefined)
    
    @scala.inline
    def setOnScrollToIndexFailed(value: /* info */ AverageItemLength => Unit): Self = StObject.set(x, "onScrollToIndexFailed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollToIndexFailedUndefined: Self = StObject.set(x, "onScrollToIndexFailed", js.undefined)
    
    @scala.inline
    def setOnScrollToTop(value: SyntheticEvent[NodeHandle, NativeScrollEvent] => Unit): Self = StObject.set(x, "onScrollToTop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollToTopUndefined: Self = StObject.set(x, "onScrollToTop", js.undefined)
    
    @scala.inline
    def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    @scala.inline
    def setOnSelect(value: (/* value */ String | Double, /* sValue */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setOnShow(value: SyntheticEvent[NodeHandle, _] => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setOnStartShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStartShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
    
    @scala.inline
    def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
    
    @scala.inline
    def setOnSwitchValueChange(value: /* value */ Boolean => Unit): Self = StObject.set(x, "onSwitchValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSwitchValueChangeUndefined: Self = StObject.set(x, "onSwitchValueChange", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchEndCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
    
    @scala.inline
    def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    @scala.inline
    def setOnViewableItemsChanged(value: /* info */ Changed => Unit): Self = StObject.set(x, "onViewableItemsChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnViewableItemsChangedNull: Self = StObject.set(x, "onViewableItemsChanged", null)
    
    @scala.inline
    def setOnViewableItemsChangedUndefined: Self = StObject.set(x, "onViewableItemsChanged", js.undefined)
    
    @scala.inline
    def setOnlyLastModalVisible(value: Boolean): Self = StObject.set(x, "onlyLastModalVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyLastModalVisibleUndefined: Self = StObject.set(x, "onlyLastModalVisible", js.undefined)
    
    @scala.inline
    def setOverScrollMode(value: auto | always | never): Self = StObject.set(x, "overScrollMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverScrollModeUndefined: Self = StObject.set(x, "overScrollMode", js.undefined)
    
    @scala.inline
    def setPagingEnabled(value: Boolean): Self = StObject.set(x, "pagingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagingEnabledUndefined: Self = StObject.set(x, "pagingEnabled", js.undefined)
    
    @scala.inline
    def setPersistentScrollbar(value: Boolean): Self = StObject.set(x, "persistentScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentScrollbarUndefined: Self = StObject.set(x, "persistentScrollbar", js.undefined)
    
    @scala.inline
    def setPinchGestureEnabled(value: Boolean): Self = StObject.set(x, "pinchGestureEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinchGestureEnabledUndefined: Self = StObject.set(x, "pinchGestureEnabled", js.undefined)
    
    @scala.inline
    def setPointerEvents(value: `box-none` | none_ | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    @scala.inline
    def setPresentationStyle(value: fullScreen | pageSheet | formSheet | overFullScreen): Self = StObject.set(x, "presentationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresentationStyleUndefined: Self = StObject.set(x, "presentationStyle", js.undefined)
    
    @scala.inline
    def setProgressViewOffset(value: Double): Self = StObject.set(x, "progressViewOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressViewOffsetUndefined: Self = StObject.set(x, "progressViewOffset", js.undefined)
    
    @scala.inline
    def setRefreshControl(value: ReactElement): Self = StObject.set(x, "refreshControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshControlUndefined: Self = StObject.set(x, "refreshControl", js.undefined)
    
    @scala.inline
    def setRefreshing(value: Boolean): Self = StObject.set(x, "refreshing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshingNull: Self = StObject.set(x, "refreshing", null)
    
    @scala.inline
    def setRefreshingUndefined: Self = StObject.set(x, "refreshing", js.undefined)
    
    @scala.inline
    def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
    
    @scala.inline
    def setRenderScrollComponent(value: /* props */ ScrollViewProps => ReactElement): Self = StObject.set(x, "renderScrollComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderScrollComponentUndefined: Self = StObject.set(x, "renderScrollComponent", js.undefined)
    
    @scala.inline
    def setRenderToHardwareTextureAndroid(value: Boolean): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
    
    @scala.inline
    def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
    
    @scala.inline
    def setScrollEventThrottle(value: Double): Self = StObject.set(x, "scrollEventThrottle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollEventThrottleUndefined: Self = StObject.set(x, "scrollEventThrottle", js.undefined)
    
    @scala.inline
    def setScrollIndicatorInsets(value: Insets): Self = StObject.set(x, "scrollIndicatorInsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollIndicatorInsetsUndefined: Self = StObject.set(x, "scrollIndicatorInsets", js.undefined)
    
    @scala.inline
    def setScrollPerfTag(value: String): Self = StObject.set(x, "scrollPerfTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPerfTagUndefined: Self = StObject.set(x, "scrollPerfTag", js.undefined)
    
    @scala.inline
    def setScrollToOverflowEnabled(value: Boolean): Self = StObject.set(x, "scrollToOverflowEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToOverflowEnabledUndefined: Self = StObject.set(x, "scrollToOverflowEnabled", js.undefined)
    
    @scala.inline
    def setScrollsToTop(value: Boolean): Self = StObject.set(x, "scrollsToTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollsToTopUndefined: Self = StObject.set(x, "scrollsToTop", js.undefined)
    
    @scala.inline
    def setSelectedIcon(value: ReactElement): Self = StObject.set(x, "selectedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIconReactElement(value: ReactElement): Self = StObject.set(x, "selectedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIconUndefined: Self = StObject.set(x, "selectedIcon", js.undefined)
    
    @scala.inline
    def setSeparatorStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "separatorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorStyleNull: Self = StObject.set(x, "separatorStyle", null)
    
    @scala.inline
    def setSeparatorStyleUndefined: Self = StObject.set(x, "separatorStyle", js.undefined)
    
    @scala.inline
    def setShouldRasterizeIOS(value: Boolean): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
    
    @scala.inline
    def setShowBack(value: Boolean): Self = StObject.set(x, "showBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBackUndefined: Self = StObject.set(x, "showBack", js.undefined)
    
    @scala.inline
    def setShowsHorizontalScrollIndicator(value: Boolean): Self = StObject.set(x, "showsHorizontalScrollIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsHorizontalScrollIndicatorUndefined: Self = StObject.set(x, "showsHorizontalScrollIndicator", js.undefined)
    
    @scala.inline
    def setShowsVerticalScrollIndicator(value: Boolean): Self = StObject.set(x, "showsVerticalScrollIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsVerticalScrollIndicatorUndefined: Self = StObject.set(x, "showsVerticalScrollIndicator", js.undefined)
    
    @scala.inline
    def setSnapToAlignment(value: start | center | end): Self = StObject.set(x, "snapToAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapToAlignmentUndefined: Self = StObject.set(x, "snapToAlignment", js.undefined)
    
    @scala.inline
    def setSnapToEnd(value: Boolean): Self = StObject.set(x, "snapToEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapToEndUndefined: Self = StObject.set(x, "snapToEnd", js.undefined)
    
    @scala.inline
    def setSnapToInterval(value: Double): Self = StObject.set(x, "snapToInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapToIntervalUndefined: Self = StObject.set(x, "snapToInterval", js.undefined)
    
    @scala.inline
    def setSnapToOffsets(value: js.Array[Double]): Self = StObject.set(x, "snapToOffsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapToOffsetsUndefined: Self = StObject.set(x, "snapToOffsets", js.undefined)
    
    @scala.inline
    def setSnapToOffsetsVarargs(value: Double*): Self = StObject.set(x, "snapToOffsets", js.Array(value :_*))
    
    @scala.inline
    def setSnapToStart(value: Boolean): Self = StObject.set(x, "snapToStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapToStartUndefined: Self = StObject.set(x, "snapToStart", js.undefined)
    
    @scala.inline
    def setStatusBarTranslucent(value: Boolean): Self = StObject.set(x, "statusBarTranslucent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBarTranslucentUndefined: Self = StObject.set(x, "statusBarTranslucent", js.undefined)
    
    @scala.inline
    def setStickyHeaderIndices(value: js.Array[Double]): Self = StObject.set(x, "stickyHeaderIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickyHeaderIndicesUndefined: Self = StObject.set(x, "stickyHeaderIndices", js.undefined)
    
    @scala.inline
    def setStickyHeaderIndicesVarargs(value: Double*): Self = StObject.set(x, "stickyHeaderIndices", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setStyles(value: Container): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setSubTitle(value: String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
    
    @scala.inline
    def setSupportedOrientations(
      value: js.Array[
          portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
        ]
    ): Self = StObject.set(x, "supportedOrientations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedOrientationsUndefined: Self = StObject.set(x, "supportedOrientations", js.undefined)
    
    @scala.inline
    def setSupportedOrientationsVarargs(value: (portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`)*): Self = StObject.set(x, "supportedOrientations", js.Array(value :_*))
    
    @scala.inline
    def setSwitchValue(value: Boolean): Self = StObject.set(x, "switchValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchValueUndefined: Self = StObject.set(x, "switchValue", js.undefined)
    
    @scala.inline
    def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    @scala.inline
    def setTheme(value: BackIconColor): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTitle(value: String | js.Array[String] | ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTextStyleNull: Self = StObject.set(x, "titleTextStyle", null)
    
    @scala.inline
    def setTitleTextStyleUndefined: Self = StObject.set(x, "titleTextStyle", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value :_*))
    
    @scala.inline
    def setTitleWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "titleWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleWrapperStyleNull: Self = StObject.set(x, "titleWrapperStyle", null)
    
    @scala.inline
    def setTitleWrapperStyleUndefined: Self = StObject.set(x, "titleWrapperStyle", js.undefined)
    
    @scala.inline
    def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    @scala.inline
    def setTvParallaxMagnification(value: Double): Self = StObject.set(x, "tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvParallaxMagnificationUndefined: Self = StObject.set(x, "tvParallaxMagnification", js.undefined)
    
    @scala.inline
    def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
    
    @scala.inline
    def setTvParallaxShiftDistanceX(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvParallaxShiftDistanceXUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceX", js.undefined)
    
    @scala.inline
    def setTvParallaxShiftDistanceY(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvParallaxShiftDistanceYUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceY", js.undefined)
    
    @scala.inline
    def setTvParallaxTiltAngle(value: Double): Self = StObject.set(x, "tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvParallaxTiltAngleUndefined: Self = StObject.set(x, "tvParallaxTiltAngle", js.undefined)
    
    @scala.inline
    def setType(value: radio | switch): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUpdateCellsBatchingPeriod(value: Double): Self = StObject.set(x, "updateCellsBatchingPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateCellsBatchingPeriodUndefined: Self = StObject.set(x, "updateCellsBatchingPeriod", js.undefined)
    
    @scala.inline
    def setUseART(value: Boolean): Self = StObject.set(x, "useART", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseARTUndefined: Self = StObject.set(x, "useART", js.undefined)
    
    @scala.inline
    def setUseKeyboardView(value: Boolean): Self = StObject.set(x, "useKeyboardView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseKeyboardViewUndefined: Self = StObject.set(x, "useKeyboardView", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double | (js.Array[Double | String])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: (Double | String)*): Self = StObject.set(x, "value", js.Array(value :_*))
    
    @scala.inline
    def setViewabilityConfig(value: js.Any): Self = StObject.set(x, "viewabilityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewabilityConfigCallbackPairs(value: ViewabilityConfigCallbackPairs): Self = StObject.set(x, "viewabilityConfigCallbackPairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewabilityConfigCallbackPairsUndefined: Self = StObject.set(x, "viewabilityConfigCallbackPairs", js.undefined)
    
    @scala.inline
    def setViewabilityConfigCallbackPairsVarargs(value: ViewabilityConfigCallbackPair*): Self = StObject.set(x, "viewabilityConfigCallbackPairs", js.Array(value :_*))
    
    @scala.inline
    def setViewabilityConfigUndefined: Self = StObject.set(x, "viewabilityConfig", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWindowSize(value: Double): Self = StObject.set(x, "windowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowSizeUndefined: Self = StObject.set(x, "windowSize", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    @scala.inline
    def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
    
    @scala.inline
    def setZoomScale(value: Double): Self = StObject.set(x, "zoomScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomScaleUndefined: Self = StObject.set(x, "zoomScale", js.undefined)
    
    @scala.inline
    def set_onDataChange(value: /* value */ js.UndefOr[String | js.Array[String]] => Unit): Self = StObject.set(x, "_onDataChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_onDataChangeUndefined: Self = StObject.set(x, "_onDataChange", js.undefined)
  }
}

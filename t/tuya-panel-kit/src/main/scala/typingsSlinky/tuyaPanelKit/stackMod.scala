package typingsSlinky.tuyaPanelKit

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactNativeGestureHandler.mod.PanGestureHandler
import typingsSlinky.std.Record
import typingsSlinky.tuyaPanelKit.anon.ClosingRouteKeys
import typingsSlinky.tuyaPanelKit.anon.OpeningRouteKeys
import typingsSlinky.tuyaPanelKit.anon.ReadonlyProps
import typingsSlinky.tuyaPanelKit.anon.ReadonlyState
import typingsSlinky.tuyaPanelKit.headerBackButtonMod.Props
import typingsSlinky.tuyaPanelKit.stackRouterMod.StackNavigationState
import typingsSlinky.tuyaPanelKit.stackTypesMod.StackCardInterpolatedStyle
import typingsSlinky.tuyaPanelKit.stackTypesMod.StackCardInterpolationProps
import typingsSlinky.tuyaPanelKit.stackTypesMod.StackHeaderInterpolatedStyle
import typingsSlinky.tuyaPanelKit.stackTypesMod.StackHeaderInterpolationProps
import typingsSlinky.tuyaPanelKit.stackTypesMod.StackHeaderProps
import typingsSlinky.tuyaPanelKit.stackTypesMod.StackNavigationEventMap
import typingsSlinky.tuyaPanelKit.stackTypesMod.StackNavigationOptions
import typingsSlinky.tuyaPanelKit.stackTypesMod.TransitionPreset
import typingsSlinky.tuyaPanelKit.stackTypesMod.TransitionSpec
import typingsSlinky.tuyaPanelKit.stackViewMod.default
import typingsSlinky.tuyaPanelKit.typesMod.TypedNavigator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit/@react-navigation/stack", JSImport.Namespace)
@js.native
object stackMod extends js.Object {
  
  val Assets: js.Array[js.Any] = js.native
  
  val CardAnimationContext: Context[js.UndefOr[StackCardInterpolationProps]] = js.native
  
  val GestureHandlerRefContext: Context[Ref[PanGestureHandler]] = js.native
  
  val Header: ReactComponentClass[StackHeaderProps] = js.native
  
  def HeaderBackButton(
    hasDisabledAllowFontScalingBackImageLabelLabelStyleLabelVisibleOnLabelLayoutOnPressPressColorAndroidScreenLayoutTintColorTitleLayoutTruncatedLabelAccessibilityLabelStyle: Props
  ): ReactElement = js.native
  
  def HeaderBackground(hasStyleRest: typingsSlinky.tuyaPanelKit.headerBackgroundMod.Props): ReactElement = js.native
  
  val HeaderHeightContext: Context[js.UndefOr[Double]] = js.native
  
  def HeaderTitle(hasTintColorStyleRest: typingsSlinky.tuyaPanelKit.headerTitleMod.Props): ReactElement = js.native
  
  // tslint:disable-next-line max-line-length prefer-declare-function no-unnecessary-generics
  def createStackNavigator[ParamList /* <: Record[String, js.UndefOr[js.Object]] */](): TypedNavigator[
    ParamList, 
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    StackNavigationOptions, 
    StackNavigationEventMap, 
    js.Function1[
      /* hasInitialRouteNameChildrenScreenOptionsRest */ typingsSlinky.tuyaPanelKit.createStackNavigatorMod.Props, 
      ReactElement
    ]
  ] = js.native
  
  def useCardAnimation(): StackCardInterpolationProps = js.native
  
  def useGestureHandlerRef(): Ref[PanGestureHandler] = js.native
  
  def useHeaderHeight(): Double = js.native
  
  @js.native
  object CardStyleInterpolators extends js.Object {
    
    def forFadeFromBottomAndroid(hasCurrentInvertedLayoutsClosing: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    
    def forHorizontalIOS(hasCurrentNextInvertedLayouts: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    
    def forModalPresentationIOS(hasIndexCurrentNextInvertedLayoutsInsets: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    
    def forNoAnimation(): StackCardInterpolatedStyle = js.native
    
    def forRevealFromBottomAndroid(hasCurrentNextInvertedLayouts: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    
    def forScaleFromCenterAndroid(hasCurrentNextClosing: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    
    def forVerticalIOS(hasCurrentInvertedLayouts: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
  }
  
  @js.native
  object HeaderStyleInterpolators extends js.Object {
    
    def forFade(hasCurrentNext: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    
    def forNoAnimation(): StackHeaderInterpolatedStyle = js.native
    
    def forSlideLeft(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    
    def forSlideRight(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    
    def forSlideUp(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    
    def forUIKit(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
  }
  
  @js.native
  class StackView () extends default
  /* static members */
  @js.native
  object StackView extends js.Object {
    
    def getDerivedStateFromProps(props: ReadonlyProps, state: ReadonlyState): ClosingRouteKeys | OpeningRouteKeys = js.native
  }
  
  @js.native
  object TransitionPresets extends js.Object {
    
    val DefaultTransition: TransitionPreset = js.native
    
    val FadeFromBottomAndroid: TransitionPreset = js.native
    
    val ModalPresentationIOS: TransitionPreset = js.native
    
    val ModalSlideFromBottomIOS: TransitionPreset = js.native
    
    val ModalTransition: TransitionPreset = js.native
    
    val RevealFromBottomAndroid: TransitionPreset = js.native
    
    val ScaleFromCenterAndroid: TransitionPreset = js.native
    
    val SlideFromRightIOS: TransitionPreset = js.native
  }
  
  @js.native
  object TransitionSpecs extends js.Object {
    
    val FadeInFromBottomAndroidSpec: TransitionSpec = js.native
    
    val FadeOutToBottomAndroidSpec: TransitionSpec = js.native
    
    val RevealFromBottomAndroidSpec: TransitionSpec = js.native
    
    val ScaleFromCenterAndroidSpec: TransitionSpec = js.native
    
    val TransitionIOSSpec: TransitionSpec = js.native
  }
}

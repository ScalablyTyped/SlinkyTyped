package typingsSlinky.styledComponents

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentPropsWithRef
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.reactNative.mod.ActivityIndicator
import typingsSlinky.reactNative.mod.Slider
import typingsSlinky.reactNative.mod.Switch
import typingsSlinky.styledComponents.anon.ReadonlyButtonProps
import typingsSlinky.styledComponents.anon.ReadonlyFlatListPropsany
import typingsSlinky.styledComponents.anon.ReadonlyModalProps
import typingsSlinky.styledComponents.anon.ReadonlyNavigatorIOSProps
import typingsSlinky.styledComponents.anon.ReadonlySectionListPropsa
import typingsSlinky.styledComponents.anon.ReadonlySwitchIOSProps
import typingsSlinky.styledComponents.anon.TypeofImage
import typingsSlinky.styledComponents.anon.TypeofListView
import typingsSlinky.styledComponents.anon.TypeofPicker
import typingsSlinky.styledComponents.anon.TypeofPickerIOS
import typingsSlinky.styledComponents.anon.TypeofRefreshControl
import typingsSlinky.styledComponents.anon.TypeofStatusBar
import typingsSlinky.styledComponents.anon.TypeofSwipeableListView
import typingsSlinky.styledComponents.anon.TypeofTabBarIOS
import typingsSlinky.styledComponents.anon.TypeofTextInput
import typingsSlinky.styledComponents.anon.TypeofTouchableNativeFeed
import typingsSlinky.styledComponents.anon.TypeofView
import typingsSlinky.styledComponents.styledComponentsMod.DefaultTheme
import typingsSlinky.styledComponents.styledComponentsMod.ThemeProviderProps
import typingsSlinky.styledComponents.styledComponentsMod.ThemedCssFunction
import typingsSlinky.styledComponents.styledComponentsMod.ThemedStyledFunction
import typingsSlinky.styledComponents.styledComponentsMod.WithOptionalTheme
import typingsSlinky.styledComponents.styledComponentsMod.WithThemeFnInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeMod extends Shortcut {
  
  @JSImport("styled-components/native", JSImport.Default)
  @js.native
  val default: ReactNativeStyledInterface[DefaultTheme] = js.native
  
  @JSImport("styled-components/native", "ThemeConsumer")
  @js.native
  val ThemeConsumer: ReactComponentClass[
    ConsumerProps[typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]]
  ] = js.native
  
  @JSImport("styled-components/native", "ThemeContext")
  @js.native
  val ThemeContext: Context[typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("styled-components/native", "ThemeProvider")
  @js.native
  class ThemeProvider protected ()
    extends Component[
          ThemeProviderProps[
            typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]], 
            typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]]
          ], 
          js.Object, 
          js.Any
        ] {
    def this(props: ThemeProviderProps[
            typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]], 
            typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]]
          ]) = this()
    def this(
      props: ThemeProviderProps[
            typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]], 
            typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]]
          ],
      context: js.Any
    ) = this()
  }
  @JSImport("styled-components/native", "ThemeProvider")
  @js.native
  val ThemeProvider: ReactComponentClass[
    ThemeProviderProps[
      typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]], 
      typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]]
    ]
  ] = js.native
  
  @JSImport("styled-components/native", "css")
  @js.native
  val css: ThemedCssFunction[DefaultTheme] = js.native
  
  @JSImport("styled-components/native", "isStyledComponent")
  @js.native
  def isStyledComponent(target: js.Any): /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean = js.native
  
  @JSImport("styled-components/native", "useTheme")
  @js.native
  def useTheme(): DefaultTheme = js.native
  
  @JSImport("styled-components/native", "withTheme")
  @js.native
  val withTheme: WithThemeFnInterface[DefaultTheme] = js.native
  
  type AnyIfEmpty[T /* <: js.Object */] = T
  
  @js.native
  trait ReactNativeStyledInterface[T /* <: js.Object */] extends ReactNativeThemedBaseStyledInterface[AnyIfEmpty[T]] {
    
    var ActivityIndicator: ReactNativeThemedStyledFunction[Instantiable0[typingsSlinky.reactNative.mod.ActivityIndicator], T] = js.native
    
    var ActivityIndicatorIOS: ReactNativeThemedStyledFunction[Instantiable0[ActivityIndicator], T] = js.native
    
    var Button: ReactNativeThemedStyledFunction[
        Instantiable1[/* props */ ReadonlyButtonProps, typingsSlinky.reactNative.mod.Button], 
        T
      ] = js.native
    
    var DatePickerIOS: ReactNativeThemedStyledFunction[Instantiable0[typingsSlinky.reactNative.mod.DatePickerIOS], T] = js.native
    
    var DrawerLayoutAndroid: ReactNativeThemedStyledFunction[Instantiable0[typingsSlinky.reactNative.mod.DrawerLayoutAndroid], T] = js.native
    
    var FlatList: ReactNativeThemedStyledFunction[
        Instantiable1[
          /* props */ ReadonlyFlatListPropsany, 
          typingsSlinky.reactNative.mod.FlatList[js.Object]
        ], 
        T
      ] = js.native
    
    var Image: ReactNativeThemedStyledFunction[TypeofImage, T] = js.native
    
    var ImageBackground: ReactNativeThemedStyledFunction[Instantiable0[typingsSlinky.reactNative.mod.ImageBackground], T] = js.native
    
    var KeyboardAvoidingView: ReactNativeThemedStyledFunction[Instantiable0[typingsSlinky.reactNative.mod.KeyboardAvoidingView], T] = js.native
    
    var ListView: ReactNativeThemedStyledFunction[TypeofListView, T] = js.native
    
    var Modal: ReactNativeThemedStyledFunction[
        Instantiable1[/* props */ ReadonlyModalProps, typingsSlinky.reactNative.mod.Modal], 
        T
      ] = js.native
    
    var NavigatorIOS: ReactNativeThemedStyledFunction[
        Instantiable1[/* props */ ReadonlyNavigatorIOSProps, typingsSlinky.reactNative.mod.NavigatorIOS], 
        T
      ] = js.native
    
    var Picker: ReactNativeThemedStyledFunction[TypeofPicker, T] = js.native
    
    var PickerIOS: ReactNativeThemedStyledFunction[TypeofPickerIOS, T] = js.native
    
    var ProgressBarAndroid: ReactNativeThemedStyledFunction[Instantiable0[typingsSlinky.reactNative.mod.ProgressBarAndroid], T] = js.native
    
    var ProgressViewIOS: ReactNativeThemedStyledFunction[Instantiable0[typingsSlinky.reactNative.mod.ProgressViewIOS], T] = js.native
    
    var RecyclerViewBackedScrollView: ReactNativeThemedStyledFunction[Instantiable0[typingsSlinky.reactNative.mod.RecyclerViewBackedScrollView], T] = js.native
    
    var RefreshControl: ReactNativeThemedStyledFunction[TypeofRefreshControl, T] = js.native
    
    var SafeAreaView: ReactNativeThemedStyledFunction[Instantiable0[typingsSlinky.reactNative.mod.SafeAreaView], T] = js.native
    
    var ScrollView: ReactNativeThemedStyledFunction[Instantiable0[typingsSlinky.reactNative.mod.ScrollView], T] = js.native
    
    var SectionList: ReactNativeThemedStyledFunction[
        Instantiable1[
          /* props */ ReadonlySectionListPropsa, 
          typingsSlinky.reactNative.mod.SectionList[js.Object, js.Object]
        ], 
        T
      ] = js.native
    
    var SegmentedControlIOS: ReactNativeThemedStyledFunction[Instantiable0[typingsSlinky.reactNative.mod.SegmentedControlIOS], T] = js.native
    
    var Slider: ReactNativeThemedStyledFunction[Instantiable0[typingsSlinky.reactNative.mod.Slider], T] = js.native
    
    var SliderIOS: ReactNativeThemedStyledFunction[Instantiable0[Slider], T] = js.native
    
    var SnapshotViewIOS: ReactNativeThemedStyledFunction[Instantiable0[typingsSlinky.reactNative.mod.SnapshotViewIOS], T] = js.native
    
    var StatusBar: ReactNativeThemedStyledFunction[TypeofStatusBar, T] = js.native
    
    var SwipeableListView: ReactNativeThemedStyledFunction[TypeofSwipeableListView, T] = js.native
    
    var Switch: ReactNativeThemedStyledFunction[Instantiable0[typingsSlinky.reactNative.mod.Switch], T] = js.native
    
    var SwitchAndroid: ReactNativeThemedStyledFunction[Instantiable0[Switch], T] = js.native
    
    var SwitchIOS: ReactNativeThemedStyledFunction[
        Instantiable1[/* props */ ReadonlySwitchIOSProps, typingsSlinky.reactNative.mod.SwitchIOS], 
        T
      ] = js.native
    
    var TabBarIOS: ReactNativeThemedStyledFunction[TypeofTabBarIOS, T] = js.native
    
    var Text: ReactNativeThemedStyledFunction[Instantiable0[typingsSlinky.reactNative.mod.Text], T] = js.native
    
    var TextInput: ReactNativeThemedStyledFunction[TypeofTextInput, T] = js.native
    
    var ToolbarAndroid: ReactNativeThemedStyledFunction[Instantiable0[typingsSlinky.reactNative.mod.ToolbarAndroid], T] = js.native
    
    var TouchableHighlight: ReactNativeThemedStyledFunction[Instantiable0[typingsSlinky.reactNative.mod.TouchableHighlight], T] = js.native
    
    var TouchableNativeFeedback: ReactNativeThemedStyledFunction[TypeofTouchableNativeFeed, T] = js.native
    
    var TouchableOpacity: ReactNativeThemedStyledFunction[Instantiable0[typingsSlinky.reactNative.mod.TouchableOpacity], T] = js.native
    
    var TouchableWithoutFeedback: ReactNativeThemedStyledFunction[Instantiable0[typingsSlinky.reactNative.mod.TouchableWithoutFeedback], T] = js.native
    
    var View: ReactNativeThemedStyledFunction[TypeofView, T] = js.native
    
    var ViewPagerAndroid: ReactNativeThemedStyledFunction[Instantiable0[typingsSlinky.reactNative.mod.ViewPagerAndroid], T] = js.native
  }
  
  // Copied over from "ThemedBaseStyledInterface" in index.d.ts in order to remove DOM element typings
  @js.native
  trait ReactNativeThemedBaseStyledInterface[T /* <: js.Object */] extends StObject {
    
    def apply[C /* <: ReactComponentClass[_] */](
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: C
    ): ThemedStyledFunction[C, T, js.Object, scala.Nothing] = js.native
  }
  
  @js.native
  trait ReactNativeThemedStyledComponentsModule[T /* <: js.Object */, U /* <: js.Object */] extends StObject {
    
    var default: ReactNativeStyledInterface[T] = js.native
    
    var ThemeConsumer: ReactComponentClass[ConsumerProps[T]] = js.native
    
    var ThemeContext: Context[T] = js.native
    
    var ThemeProvider: ReactComponentClass[
        ThemeProviderProps[
          typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[T], 
          typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[U]
        ]
      ] = js.native
    
    var css: ThemedCssFunction[T] = js.native
    
    // This could be made to assert `target is StyledComponent<any, T>` instead, but that feels not type safe
    var isStyledComponent: js.Function1[
        /* target */ js.Any, 
        /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean
      ] = js.native
    
    def useTheme(): T = js.native
    
    var withTheme: WithThemeFnInterface[T] = js.native
  }
  object ReactNativeThemedStyledComponentsModule {
    
    @scala.inline
    def apply[T /* <: js.Object */, U /* <: js.Object */](
      ThemeConsumer: ReactComponentClass[ConsumerProps[T]],
      ThemeContext: Context[T],
      ThemeProvider: ReactComponentClass[
          ThemeProviderProps[
            typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[T], 
            typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[U]
          ]
        ],
      css: ThemedCssFunction[T],
      default: ReactNativeStyledInterface[T],
      isStyledComponent: /* target */ js.Any => /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean,
      useTheme: () => T,
      withTheme: /* component */ ReactComponentClass[js.Any] => ForwardRefExoticComponent[
          WithOptionalTheme[
            ComponentPropsWithRef[ReactComponentClass[js.Any]], 
            typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[T]
          ]
        ]
    ): ReactNativeThemedStyledComponentsModule[T, U] = {
      val __obj = js.Dynamic.literal(ThemeConsumer = ThemeConsumer.asInstanceOf[js.Any], ThemeContext = ThemeContext.asInstanceOf[js.Any], ThemeProvider = ThemeProvider.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], isStyledComponent = js.Any.fromFunction1(isStyledComponent), useTheme = js.Any.fromFunction0(useTheme), withTheme = js.Any.fromFunction1(withTheme))
      __obj.asInstanceOf[ReactNativeThemedStyledComponentsModule[T, U]]
    }
    
    @scala.inline
    implicit class ReactNativeThemedStyledComponentsModuleMutableBuilder[Self <: ReactNativeThemedStyledComponentsModule[_, _], T /* <: js.Object */, U /* <: js.Object */] (val x: Self with (ReactNativeThemedStyledComponentsModule[T, U])) extends AnyVal {
      
      @scala.inline
      def setCss(value: ThemedCssFunction[T]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault(value: ReactNativeStyledInterface[T]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStyledComponent(
        value: /* target */ js.Any => /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean
      ): Self = StObject.set(x, "isStyledComponent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setThemeConsumer(value: ReactComponentClass[ConsumerProps[T]]): Self = StObject.set(x, "ThemeConsumer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeContext(value: Context[T]): Self = StObject.set(x, "ThemeContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeProvider(
        value: ReactComponentClass[
              ThemeProviderProps[
                typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[T], 
                typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[U]
              ]
            ]
      ): Self = StObject.set(x, "ThemeProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTheme(value: () => T): Self = StObject.set(x, "useTheme", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWithTheme(
        value: /* component */ ReactComponentClass[js.Any] => ForwardRefExoticComponent[
              WithOptionalTheme[
                ComponentPropsWithRef[ReactComponentClass[js.Any]], 
                typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[T]
              ]
            ]
      ): Self = StObject.set(x, "withTheme", js.Any.fromFunction1(value))
    }
  }
  
  type ReactNativeThemedStyledFunction[C /* <: ReactComponentClass[_] */, T /* <: js.Object */] = ThemedStyledFunction[C, T, js.Object, scala.Nothing]
  
  type ReactNativeThemedStyledInterface[T /* <: js.Object */] = ReactNativeThemedBaseStyledInterface[AnyIfEmpty[T]]
  
  type _To = ReactNativeStyledInterface[DefaultTheme]
  
  /* This means you don't have to write `default`, but can instead just say `nativeMod.foo` */
  override def _to: ReactNativeStyledInterface[DefaultTheme] = default
}

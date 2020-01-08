package typingsSlinky.styledDashComponents

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.Consumer
import typingsSlinky.react.reactMod.Context
import typingsSlinky.std.TemplateStringsArray
import typingsSlinky.styledDashComponents.styledDashComponentsMod.AnyIfEmpty
import typingsSlinky.styledDashComponents.styledDashComponentsMod.CSSKeyframes
import typingsSlinky.styledDashComponents.styledDashComponentsMod.CSSObject
import typingsSlinky.styledDashComponents.styledDashComponentsMod.DefaultTheme
import typingsSlinky.styledDashComponents.styledDashComponentsMod.Interpolation
import typingsSlinky.styledDashComponents.styledDashComponentsMod.InterpolationFunction
import typingsSlinky.styledDashComponents.styledDashComponentsMod.Keyframes
import typingsSlinky.styledDashComponents.styledDashComponentsMod.SimpleInterpolation
import typingsSlinky.styledDashComponents.styledDashComponentsMod.StyleSheetManagerProps
import typingsSlinky.styledDashComponents.styledDashComponentsMod.StyledInterface
import typingsSlinky.styledDashComponents.styledDashComponentsMod.ThemeProviderComponent
import typingsSlinky.styledDashComponents.styledDashComponentsMod.ThemeProviderProps
import typingsSlinky.styledDashComponents.styledDashComponentsMod.ThemedCssFunction
import typingsSlinky.styledDashComponents.styledDashComponentsMod.ThemedGlobalStyledClassProps
import typingsSlinky.styledDashComponents.styledDashComponentsMod.ThemedStyledProps
import typingsSlinky.styledDashComponents.styledDashComponentsMod.WithThemeFnInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-components/macro", JSImport.Namespace)
@js.native
object macroMod extends js.Object {
  @js.native
  class ServerStyleSheet ()
    extends typingsSlinky.styledDashComponents.styledDashComponentsMod.ServerStyleSheet
  
  @js.native
  class StyleSheetManager ()
    extends Component[StyleSheetManagerProps, js.Object, js.Any]
  
  @js.native
  class ThemeProvider protected ()
    extends Component[
          ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]], 
          ComponentState, 
          js.Any
        ] {
    def this(props: ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]]) = this()
    def this(
      props: ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]],
      context: js.Any
    ) = this()
  }
  
  val ThemeConsumer: Consumer[AnyIfEmpty[DefaultTheme]] = js.native
  val ThemeContext: Context[AnyIfEmpty[DefaultTheme]] = js.native
  val css: ThemedCssFunction[DefaultTheme] = js.native
  val default: StyledInterface = js.native
  val withTheme: WithThemeFnInterface[DefaultTheme] = js.native
  def createGlobalStyle[P /* <: js.Object */](first: TemplateStringsArray, interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*): ReactComponentClass[ThemedGlobalStyledClassProps[P, DefaultTheme]] = js.native
  def createGlobalStyle[P /* <: js.Object */](first: CSSObject, interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*): ReactComponentClass[ThemedGlobalStyledClassProps[P, DefaultTheme]] = js.native
  def createGlobalStyle[P /* <: js.Object */](
    first: InterpolationFunction[ThemedStyledProps[P, DefaultTheme]],
    interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*
  ): ReactComponentClass[ThemedGlobalStyledClassProps[P, DefaultTheme]] = js.native
  def isStyledComponent(target: js.Any): /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean = js.native
  def keyframes(strings: TemplateStringsArray, interpolations: SimpleInterpolation*): Keyframes = js.native
  def keyframes(strings: CSSKeyframes, interpolations: SimpleInterpolation*): Keyframes = js.native
  @js.native
  object ThemeProvider extends TopLevel[ThemeProviderComponent[AnyIfEmpty[DefaultTheme], AnyIfEmpty[DefaultTheme]]]
  
}


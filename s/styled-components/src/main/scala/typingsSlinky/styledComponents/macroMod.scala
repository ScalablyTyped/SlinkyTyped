package typingsSlinky.styledComponents

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.react.mod.Context
import typingsSlinky.std.TemplateStringsArray
import typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty
import typingsSlinky.styledComponents.styledComponentsMod.CSSKeyframes
import typingsSlinky.styledComponents.styledComponentsMod.CSSObject
import typingsSlinky.styledComponents.styledComponentsMod.DefaultTheme
import typingsSlinky.styledComponents.styledComponentsMod.Interpolation
import typingsSlinky.styledComponents.styledComponentsMod.InterpolationFunction
import typingsSlinky.styledComponents.styledComponentsMod.Keyframes_
import typingsSlinky.styledComponents.styledComponentsMod.SimpleInterpolation
import typingsSlinky.styledComponents.styledComponentsMod.StyleSheetManagerProps
import typingsSlinky.styledComponents.styledComponentsMod.StyledInterface
import typingsSlinky.styledComponents.styledComponentsMod.ThemeProviderComponent
import typingsSlinky.styledComponents.styledComponentsMod.ThemeProviderProps
import typingsSlinky.styledComponents.styledComponentsMod.ThemedCssFunction
import typingsSlinky.styledComponents.styledComponentsMod.ThemedGlobalStyledClassProps
import typingsSlinky.styledComponents.styledComponentsMod.ThemedStyledProps
import typingsSlinky.styledComponents.styledComponentsMod.WithThemeFnInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-components/macro", JSImport.Namespace)
@js.native
object macroMod extends js.Object {
  @js.native
  class ServerStyleSheet ()
    extends typingsSlinky.styledComponents.styledComponentsMod.ServerStyleSheet
  
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
  
  val ThemeConsumer: ReactComponentClass[ConsumerProps[AnyIfEmpty[DefaultTheme]]] = js.native
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
  def keyframes(strings: TemplateStringsArray, interpolations: SimpleInterpolation*): Keyframes_ = js.native
  def keyframes(strings: CSSKeyframes, interpolations: SimpleInterpolation*): Keyframes_ = js.native
  def useTheme(): DefaultTheme = js.native
  @js.native
  object ThemeProvider extends TopLevel[ThemeProviderComponent[AnyIfEmpty[DefaultTheme], AnyIfEmpty[DefaultTheme]]]
  
}


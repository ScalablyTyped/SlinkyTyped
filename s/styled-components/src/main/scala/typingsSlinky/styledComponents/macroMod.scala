package typingsSlinky.styledComponents

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
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
import typingsSlinky.styledComponents.styledComponentsMod.ThemeProviderProps
import typingsSlinky.styledComponents.styledComponentsMod.ThemedCssFunction
import typingsSlinky.styledComponents.styledComponentsMod.ThemedGlobalStyledClassProps
import typingsSlinky.styledComponents.styledComponentsMod.ThemedStyledProps
import typingsSlinky.styledComponents.styledComponentsMod.WithThemeFnInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object macroMod extends Shortcut {
  
  @JSImport("styled-components/macro", JSImport.Default)
  @js.native
  val default: StyledInterface = js.native
  
  @JSImport("styled-components/macro", "ServerStyleSheet")
  @js.native
  class ServerStyleSheet ()
    extends typingsSlinky.styledComponents.styledComponentsMod.ServerStyleSheet
  
  @JSImport("styled-components/macro", "StyleSheetManager")
  @js.native
  class StyleSheetManager protected ()
    extends typingsSlinky.styledComponents.styledComponentsMod.StyleSheetManager {
    def this(props: StyleSheetManagerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StyleSheetManagerProps, context: js.Any) = this()
  }
  
  @JSImport("styled-components/macro", "ThemeConsumer")
  @js.native
  val ThemeConsumer: ReactComponentClass[ConsumerProps[AnyIfEmpty[DefaultTheme]]] = js.native
  
  @JSImport("styled-components/macro", "ThemeContext")
  @js.native
  val ThemeContext: Context[AnyIfEmpty[DefaultTheme]] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("styled-components/macro", "ThemeProvider")
  @js.native
  class ThemeProvider protected ()
    extends Component[
          ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]], 
          js.Object, 
          js.Any
        ] {
    def this(props: ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]]) = this()
    def this(
      props: ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]],
      context: js.Any
    ) = this()
  }
  @JSImport("styled-components/macro", "ThemeProvider")
  @js.native
  val ThemeProvider: ReactComponentClass[
    ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]]
  ] = js.native
  
  @JSImport("styled-components/macro", "createGlobalStyle")
  @js.native
  def createGlobalStyle[P /* <: js.Object */](first: TemplateStringsArray, interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*): ReactComponentClass[ThemedGlobalStyledClassProps[P, DefaultTheme]] = js.native
  @JSImport("styled-components/macro", "createGlobalStyle")
  @js.native
  def createGlobalStyle[P /* <: js.Object */](first: CSSObject, interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*): ReactComponentClass[ThemedGlobalStyledClassProps[P, DefaultTheme]] = js.native
  @JSImport("styled-components/macro", "createGlobalStyle")
  @js.native
  def createGlobalStyle[P /* <: js.Object */](
    first: InterpolationFunction[ThemedStyledProps[P, DefaultTheme]],
    interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*
  ): ReactComponentClass[ThemedGlobalStyledClassProps[P, DefaultTheme]] = js.native
  
  @JSImport("styled-components/macro", "css")
  @js.native
  val css: ThemedCssFunction[DefaultTheme] = js.native
  
  @JSImport("styled-components/macro", "isStyledComponent")
  @js.native
  def isStyledComponent(target: js.Any): /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean = js.native
  
  @JSImport("styled-components/macro", "keyframes")
  @js.native
  def keyframes(strings: TemplateStringsArray, interpolations: SimpleInterpolation*): Keyframes_ = js.native
  @JSImport("styled-components/macro", "keyframes")
  @js.native
  def keyframes(strings: CSSKeyframes, interpolations: SimpleInterpolation*): Keyframes_ = js.native
  
  @JSImport("styled-components/macro", "useTheme")
  @js.native
  def useTheme(): DefaultTheme = js.native
  
  @JSImport("styled-components/macro", "withTheme")
  @js.native
  val withTheme: WithThemeFnInterface[DefaultTheme] = js.native
  
  type _To = StyledInterface
  
  /* This means you don't have to write `default`, but can instead just say `macroMod.foo` */
  override def _to: StyledInterface = default
}

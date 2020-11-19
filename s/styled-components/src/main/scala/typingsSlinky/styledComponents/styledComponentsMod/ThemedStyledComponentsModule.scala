package typingsSlinky.styledComponents.styledComponentsMod

import org.scalablytyped.runtime.Instantiable0
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.react.mod.Context
import typingsSlinky.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemedStyledComponentsModule[T /* <: js.Object */, U /* <: js.Object */] extends js.Object {
  
  var ServerStyleSheet: Instantiable0[typingsSlinky.styledComponents.styledComponentsMod.ServerStyleSheet] = js.native
  
  var StyleSheetManager: Instantiable0[typingsSlinky.styledComponents.styledComponentsMod.StyleSheetManager] = js.native
  
  var ThemeConsumer: ReactComponentClass[ConsumerProps[T]] = js.native
  
  var ThemeContext: Context[T] = js.native
  
  var ThemeProvider: ReactComponentClass[ThemeProviderProps[AnyIfEmpty[T], AnyIfEmpty[U]]] = js.native
  
  def createGlobalStyle[P /* <: js.Object */](first: TemplateStringsArray, interpolations: (Interpolation[ThemedStyledProps[P, T]])*): ReactComponentClass[ThemedGlobalStyledClassProps[P, T]] = js.native
  def createGlobalStyle[P /* <: js.Object */](first: CSSObject, interpolations: (Interpolation[ThemedStyledProps[P, T]])*): ReactComponentClass[ThemedGlobalStyledClassProps[P, T]] = js.native
  def createGlobalStyle[P /* <: js.Object */](
    first: InterpolationFunction[ThemedStyledProps[P, T]],
    interpolations: (Interpolation[ThemedStyledProps[P, T]])*
  ): ReactComponentClass[ThemedGlobalStyledClassProps[P, T]] = js.native
  
  var css: ThemedCssFunction[T] = js.native
  
  var default: ThemedStyledInterface[T] = js.native
  
  // This could be made to assert `target is StyledComponent<any, T>` instead, but that feels not type safe
  var isStyledComponent: js.Function1[
    /* target */ js.Any, 
    /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean
  ] = js.native
  
  // unfortunately keyframes can't interpolate props from the theme
  def keyframes(strings: TemplateStringsArray, interpolations: SimpleInterpolation*): Keyframes_ = js.native
  def keyframes(strings: CSSKeyframes, interpolations: SimpleInterpolation*): Keyframes_ = js.native
  
  def useTheme(): T = js.native
  
  var withTheme: WithThemeFnInterface[T] = js.native
}

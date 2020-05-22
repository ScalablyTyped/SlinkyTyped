package typingsSlinky.styledComponents.nativeMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentPropsWithRef
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.styledComponents.styledComponentsMod.ThemeProviderProps
import typingsSlinky.styledComponents.styledComponentsMod.ThemedCssFunction
import typingsSlinky.styledComponents.styledComponentsMod.WithOptionalTheme
import typingsSlinky.styledComponents.styledComponentsMod.WithThemeFnInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactNativeThemedStyledComponentsModule[T /* <: js.Object */, U /* <: js.Object */] extends js.Object {
  var ThemeConsumer: ReactComponentClass[ConsumerProps[T]]
  var ThemeContext: Context[T]
  var ThemeProvider: ReactComponentClass[
    ThemeProviderProps[
      typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[T], 
      typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[U]
    ]
  ]
  var css: ThemedCssFunction[T]
  var default: ReactNativeStyledInterface[T]
  // This could be made to assert `target is StyledComponent<any, T>` instead, but that feels not type safe
  var isStyledComponent: js.Function1[
    /* target */ js.Any, 
    /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean
  ]
  var withTheme: WithThemeFnInterface[T]
  def useTheme(): T
}

object ReactNativeThemedStyledComponentsModule {
  @scala.inline
  def apply[T, U](
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
}


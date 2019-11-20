package typingsSlinky.styledDashComponents.nativeMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.Consumer
import typingsSlinky.react.reactMod.Context
import typingsSlinky.react.reactMod.ForwardRefExoticComponent
import typingsSlinky.styledDashComponents.WithOptionalThemeComponentPropsWithRefCT
import typingsSlinky.styledDashComponents.styledDashComponentsMod.ThemeProviderProps
import typingsSlinky.styledDashComponents.styledDashComponentsMod.ThemedCssFunction
import typingsSlinky.styledDashComponents.styledDashComponentsMod.WithThemeFnInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactNativeThemedStyledComponentsModule[T /* <: js.Object */, U /* <: js.Object */] extends js.Object {
  var ThemeConsumer: Consumer[T]
  var ThemeContext: Context[T]
  var ThemeProvider: ReactComponentClass[
    ThemeProviderProps[
      typingsSlinky.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[T], 
      typingsSlinky.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[U]
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
}

object ReactNativeThemedStyledComponentsModule {
  @scala.inline
  def apply[T /* <: js.Object */, U /* <: js.Object */](
    ThemeConsumer: Consumer[T],
    ThemeContext: Context[T],
    ThemeProvider: ReactComponentClass[
      ThemeProviderProps[
        typingsSlinky.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[T], 
        typingsSlinky.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[U]
      ]
    ],
    css: ThemedCssFunction[T],
    default: ReactNativeStyledInterface[T],
    isStyledComponent: /* target */ js.Any => /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean,
    withTheme: /* component */ ReactComponentClass[js.Any] => ForwardRefExoticComponent[
      WithOptionalThemeComponentPropsWithRefCT[typingsSlinky.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[T]]
    ]
  ): ReactNativeThemedStyledComponentsModule[T, U] = {
    val __obj = js.Dynamic.literal(ThemeConsumer = ThemeConsumer.asInstanceOf[js.Any], ThemeContext = ThemeContext.asInstanceOf[js.Any], ThemeProvider = ThemeProvider.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], isStyledComponent = js.Any.fromFunction1(isStyledComponent), withTheme = js.Any.fromFunction1(withTheme))
  
    __obj.asInstanceOf[ReactNativeThemedStyledComponentsModule[T, U]]
  }
}


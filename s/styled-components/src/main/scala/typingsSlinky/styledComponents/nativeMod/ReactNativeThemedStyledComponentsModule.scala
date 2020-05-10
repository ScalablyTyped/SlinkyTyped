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

@js.native
trait ReactNativeThemedStyledComponentsModule[T /* <: js.Object */, U /* <: js.Object */] extends js.Object {
  var ThemeConsumer: ReactComponentClass[ConsumerProps[T]] = js.native
  var ThemeContext: Context[T] = js.native
  var ThemeProvider: ReactComponentClass[
    ThemeProviderProps[
      typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[T], 
      typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[U]
    ]
  ] = js.native
  var css: ThemedCssFunction[T] = js.native
  var default: ReactNativeStyledInterface[T] = js.native
  // This could be made to assert `target is StyledComponent<any, T>` instead, but that feels not type safe
  var isStyledComponent: js.Function1[
    /* target */ js.Any, 
    /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean
  ] = js.native
  var withTheme: WithThemeFnInterface[T] = js.native
  def useTheme(): T = js.native
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
  @scala.inline
  implicit class ReactNativeThemedStyledComponentsModuleOps[Self[t, u] <: ReactNativeThemedStyledComponentsModule[t, u], T, U] (val x: Self[T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U]) with Other]
    @scala.inline
    def withThemeConsumer(value: ReactComponentClass[ConsumerProps[T]]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThemeConsumer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThemeContext(value: Context[T]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThemeContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThemeProvider(
      value: ReactComponentClass[
          ThemeProviderProps[
            typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[T], 
            typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[U]
          ]
        ]
    ): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThemeProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCss(value: ThemedCssFunction[T]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault(value: ReactNativeStyledInterface[T]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsStyledComponent(
      value: /* target */ js.Any => /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean
    ): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStyledComponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUseTheme(value: () => T): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTheme")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWithTheme(
      value: /* component */ ReactComponentClass[js.Any] => ForwardRefExoticComponent[
          WithOptionalTheme[
            ComponentPropsWithRef[ReactComponentClass[js.Any]], 
            typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[T]
          ]
        ]
    ): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withTheme")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


package typingsSlinky.styledComponents

import typingsSlinky.react.mod.WeakValidationMap
import typingsSlinky.std.Partial
import typingsSlinky.styledComponents.styledComponentsMod.AnyStyledComponent
import typingsSlinky.styledComponents.styledComponentsMod.StyledComponent
import typingsSlinky.styledComponents.styledComponentsMod.StyledComponentInnerAttrs
import typingsSlinky.styledComponents.styledComponentsMod.StyledComponentInnerComponent
import typingsSlinky.styledComponents.styledComponentsMod.StyledComponentInnerOtherProps
import typingsSlinky.styledComponents.styledComponentsMod.StyledComponentInterpolation
import typingsSlinky.styledComponents.styledComponentsMod.StyledComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<styled-components.styled-components.StyledComponentBase<any, any, any, any>, keyof styled-components.styled-components.StyledComponentBase<any, any, {}, never>> */
@js.native
trait PickStyledComponentBasean extends StyledComponentInterpolation {
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol = js.native
  var defaultProps: js.UndefOr[Partial[StyledComponentProps[_, _, _, _]]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMap[StyledComponentProps[_, _, _, _]]] = js.native
  var withComponent: js.Function1[
    /* component */ AnyStyledComponent, 
    StyledComponent[
      StyledComponentInnerComponent[AnyStyledComponent], 
      _, 
      js.Any with StyledComponentInnerOtherProps[AnyStyledComponent], 
      _ | StyledComponentInnerAttrs[AnyStyledComponent]
    ]
  ] = js.native
}


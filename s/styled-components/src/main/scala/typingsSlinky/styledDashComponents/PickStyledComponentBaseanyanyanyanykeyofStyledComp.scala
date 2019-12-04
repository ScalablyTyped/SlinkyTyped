package typingsSlinky.styledDashComponents

import typingsSlinky.react.reactMod.WeakValidationMap
import typingsSlinky.std.Partial
import typingsSlinky.styledDashComponents.styledDashComponentsMod.AnyStyledComponent
import typingsSlinky.styledDashComponents.styledDashComponentsMod.StyledComponent
import typingsSlinky.styledDashComponents.styledDashComponentsMod.StyledComponentInnerAttrs
import typingsSlinky.styledDashComponents.styledDashComponentsMod.StyledComponentInnerComponent
import typingsSlinky.styledDashComponents.styledDashComponentsMod.StyledComponentInnerOtherProps
import typingsSlinky.styledDashComponents.styledDashComponentsMod.StyledComponentInterpolation
import typingsSlinky.styledDashComponents.styledDashComponentsMod.StyledComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<styled-components.styled-components.StyledComponentBase<any, any, any, any>, keyof styled-components.styled-components.StyledComponentBase<any, any, {}, never>> */
@js.native
trait PickStyledComponentBaseanyanyanyanykeyofStyledComp extends StyledComponentInterpolation {
  @JSName("$$typeof")
  var $$typeof: js.Symbol = js.native
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


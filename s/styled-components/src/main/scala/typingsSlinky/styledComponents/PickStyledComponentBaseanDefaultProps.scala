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

/* Inlined std.Pick<styled-components.styled-components.StyledComponentBase<any, any, any, never>, keyof styled-components.styled-components.StyledComponentBase<any, any, {}, never>> */
@js.native
trait PickStyledComponentBaseanDefaultProps extends StyledComponentInterpolation {
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol = js.native
  var defaultProps: js.UndefOr[Partial[StyledComponentProps[_, _, _, scala.Nothing]]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMap[StyledComponentProps[_, _, _, scala.Nothing]]] = js.native
  var withComponent: js.Function1[
    /* component */ AnyStyledComponent, 
    StyledComponent[
      StyledComponentInnerComponent[AnyStyledComponent], 
      _, 
      js.Any with StyledComponentInnerOtherProps[AnyStyledComponent], 
      scala.Nothing | StyledComponentInnerAttrs[AnyStyledComponent]
    ]
  ] = js.native
}

object PickStyledComponentBaseanDefaultProps {
  @scala.inline
  def apply(
    DollarDollartypeof: js.Symbol,
    withComponent: /* component */ AnyStyledComponent => StyledComponent[
      StyledComponentInnerComponent[AnyStyledComponent], 
      _, 
      js.Any with StyledComponentInnerOtherProps[AnyStyledComponent], 
      scala.Nothing | StyledComponentInnerAttrs[AnyStyledComponent]
    ]
  ): PickStyledComponentBaseanDefaultProps = {
    val __obj = js.Dynamic.literal(withComponent = js.Any.fromFunction1(withComponent))
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickStyledComponentBaseanDefaultProps]
  }
  @scala.inline
  implicit class PickStyledComponentBaseanDefaultPropsOps[Self <: PickStyledComponentBaseanDefaultProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDollarDollartypeof(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$$typeof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWithComponent(
      value: /* component */ AnyStyledComponent => StyledComponent[
          StyledComponentInnerComponent[AnyStyledComponent], 
          _, 
          js.Any with StyledComponentInnerOtherProps[AnyStyledComponent], 
          scala.Nothing | StyledComponentInnerAttrs[AnyStyledComponent]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withComponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDefaultProps(value: Partial[StyledComponentProps[_, _, _, scala.Nothing]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withPropTypes(value: WeakValidationMap[StyledComponentProps[_, _, _, scala.Nothing]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(js.undefined)
        ret
    }
  }
  
}


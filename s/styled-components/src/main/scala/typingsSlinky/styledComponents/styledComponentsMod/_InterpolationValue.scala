package typingsSlinky.styledComponents.styledComponentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _InterpolationValue
  extends _Interpolation[js.Any]
     with _SimpleInterpolation
object _InterpolationValue {
  
  @scala.inline
  def CSSObject(): typingsSlinky.styledComponents.styledComponentsMod.CSSObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsSlinky.styledComponents.styledComponentsMod.CSSObject]
  }
  
  @scala.inline
  def Keyframes_(getName: () => String): typingsSlinky.styledComponents.styledComponentsMod.Keyframes_ = {
    val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName))
    __obj.asInstanceOf[typingsSlinky.styledComponents.styledComponentsMod.Keyframes_]
  }
  
  @scala.inline
  def PickStyledComponentBasean(
    DollarDollartypeof: js.Symbol,
    withComponent: /* component */ AnyStyledComponent => StyledComponent[
      StyledComponentInnerComponent[AnyStyledComponent], 
      _, 
      js.Any with StyledComponentInnerOtherProps[AnyStyledComponent], 
      _ | StyledComponentInnerAttrs[AnyStyledComponent]
    ]
  ): typingsSlinky.styledComponents.anon.PickStyledComponentBasean = {
    val __obj = js.Dynamic.literal(withComponent = js.Any.fromFunction1(withComponent))
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.styledComponents.anon.PickStyledComponentBasean]
  }
  
  @scala.inline
  def PickStyledComponentBaseanDefaultProps(
    DollarDollartypeof: js.Symbol,
    withComponent: /* component */ AnyStyledComponent => StyledComponent[
      StyledComponentInnerComponent[AnyStyledComponent], 
      _, 
      js.Any with StyledComponentInnerOtherProps[AnyStyledComponent], 
      scala.Nothing | StyledComponentInnerAttrs[AnyStyledComponent]
    ]
  ): typingsSlinky.styledComponents.anon.PickStyledComponentBaseanDefaultProps = {
    val __obj = js.Dynamic.literal(withComponent = js.Any.fromFunction1(withComponent))
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.styledComponents.anon.PickStyledComponentBaseanDefaultProps]
  }
}

package typingsSlinky.styledComponents.styledComponentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// remove the call signature from StyledComponent so Interpolation can still infer InterpolationFunction
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.styledComponents.anon.PickStyledComponentBasean
  - typingsSlinky.styledComponents.anon.PickStyledComponentBaseanDefaultProps
*/
trait StyledComponentInterpolation extends _InterpolationValue
object StyledComponentInterpolation {
  
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

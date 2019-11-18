package typingsSlinky.styledDashComponents.nativeMod

import typingsSlinky.styledDashComponents.styledDashComponentsMod.AnyStyledComponent
import typingsSlinky.styledDashComponents.styledDashComponentsMod.StyledComponentInnerAttrs
import typingsSlinky.styledDashComponents.styledDashComponentsMod.StyledComponentInnerComponent
import typingsSlinky.styledDashComponents.styledDashComponentsMod.StyledComponentInnerOtherProps
import typingsSlinky.styledDashComponents.styledDashComponentsMod.ThemedStyledFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Copied over from "ThemedBaseStyledInterface" in index.d.ts in order to remove DOM element typings
@js.native
trait ReactNativeThemedBaseStyledInterface[T /* <: js.Object */] extends js.Object {
  def apply[C /* <: AnyStyledComponent */](component: C): ThemedStyledFunction[
    StyledComponentInnerComponent[C], 
    T, 
    StyledComponentInnerOtherProps[C], 
    StyledComponentInnerAttrs[C]
  ] = js.native
}


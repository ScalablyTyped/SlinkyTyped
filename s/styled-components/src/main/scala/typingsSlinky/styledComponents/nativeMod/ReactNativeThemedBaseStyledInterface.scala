package typingsSlinky.styledComponents.nativeMod

import typingsSlinky.styledComponents.styledComponentsMod.AnyStyledComponent
import typingsSlinky.styledComponents.styledComponentsMod.StyledComponentInnerAttrs
import typingsSlinky.styledComponents.styledComponentsMod.StyledComponentInnerComponent
import typingsSlinky.styledComponents.styledComponentsMod.StyledComponentInnerOtherProps
import typingsSlinky.styledComponents.styledComponentsMod.ThemedStyledFunction
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


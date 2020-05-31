package typingsSlinky.styledComponents.styledComponentsMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentPropsWithRef
import typingsSlinky.react.mod.ForwardRefExoticComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-components", "withTheme")
@js.native
object withTheme extends js.Object {
  def apply[C /* <: ReactComponentClass[_] */](
    // this check is roundabout because the extends clause above would
  // not allow any component that accepts _more_ than theme as a prop
  component: C
  ): ForwardRefExoticComponent[WithOptionalTheme[ComponentPropsWithRef[C], AnyIfEmpty[DefaultTheme]]] = js.native
}


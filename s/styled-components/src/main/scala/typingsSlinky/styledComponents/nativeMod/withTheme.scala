package typingsSlinky.styledComponents.nativeMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentPropsWithRef
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.styledComponents.styledComponentsMod.DefaultTheme
import typingsSlinky.styledComponents.styledComponentsMod.WithOptionalTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-components/native", "withTheme")
@js.native
object withTheme extends js.Object {
  def apply[C /* <: ReactComponentClass[_] */](
    // this check is roundabout because the extends clause above would
  // not allow any component that accepts _more_ than theme as a prop
  component: C
  ): ForwardRefExoticComponent[
    WithOptionalTheme[
      ComponentPropsWithRef[C], 
      typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]
    ]
  ] = js.native
}


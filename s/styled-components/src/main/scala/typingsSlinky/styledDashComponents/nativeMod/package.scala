package typingsSlinky.styledDashComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nativeMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.styledDashComponents.styledDashComponentsMod.ThemedStyledFunction

  type AnyIfEmpty[T /* <: js.Object */] = T
  type ReactNativeThemedStyledFunction[C /* <: ReactComponentClass[_] */, T /* <: js.Object */] = ThemedStyledFunction[C, T, js.Object, scala.Nothing]
  type ReactNativeThemedStyledInterface[T /* <: js.Object */] = ReactNativeThemedBaseStyledInterface[AnyIfEmpty[T]]
}

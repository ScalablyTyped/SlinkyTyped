package typingsSlinky.storybookTheming.mod

import slinky.core.ReactComponentClass
import typingsSlinky.emotionTheming.helperMod.AddOptionalTo
import typingsSlinky.emotionTheming.helperMod.PropsOf
import typingsSlinky.storybookTheming.storybookThemingStrings.theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/theming", "withTheme")
@js.native
object withTheme extends js.Object {
  def apply[C /* <: ReactComponentClass[_] */](component: C): ReactComponentClass[AddOptionalTo[PropsOf[C], theme]] = js.native
}


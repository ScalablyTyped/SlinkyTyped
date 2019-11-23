package typingsSlinky.atStorybookTheming.atStorybookThemingMod

import slinky.core.ReactComponentClass
import typingsSlinky.atStorybookTheming.atStorybookThemingStrings.theme
import typingsSlinky.emotionDashTheming.typesHelperMod.AddOptionalTo
import typingsSlinky.emotionDashTheming.typesHelperMod.PropsOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/theming", "withTheme")
@js.native
object withTheme extends js.Object {
  def apply[C /* <: ReactComponentClass[_] */](component: C): ReactComponentClass[AddOptionalTo[PropsOf[C], theme]] = js.native
}


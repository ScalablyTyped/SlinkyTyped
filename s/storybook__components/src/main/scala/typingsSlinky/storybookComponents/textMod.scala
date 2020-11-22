package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import typingsSlinky.storybookComponents.controlsTypesMod.ControlProps
import typingsSlinky.storybookComponents.controlsTypesMod.TextConfig
import typingsSlinky.storybookComponents.controlsTypesMod.TextValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/controls/Text", JSImport.Namespace)
@js.native
object textMod extends js.Object {
  
  val TextControl: ReactComponentClass[TextProps] = js.native
  
  type TextProps = ControlProps[js.UndefOr[TextValue]] with TextConfig
}

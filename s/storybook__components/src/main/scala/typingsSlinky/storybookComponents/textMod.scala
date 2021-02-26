package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import typingsSlinky.storybookComponents.controlsTypesMod.ControlProps
import typingsSlinky.storybookComponents.controlsTypesMod.TextConfig
import typingsSlinky.storybookComponents.controlsTypesMod.TextValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  @JSImport("@storybook/components/dist/controls/Text", "TextControl")
  @js.native
  val TextControl: ReactComponentClass[TextProps] = js.native
  
  type TextProps = ControlProps[js.UndefOr[TextValue]] with TextConfig
}

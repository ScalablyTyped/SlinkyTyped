package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import typingsSlinky.storybookComponents.controlsTypesMod.ColorConfig
import typingsSlinky.storybookComponents.controlsTypesMod.ColorValue
import typingsSlinky.storybookComponents.controlsTypesMod.ControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/controls/Color", JSImport.Namespace)
@js.native
object colorMod extends js.Object {
  
  val ColorControl: ReactComponentClass[ColorProps] = js.native
  
  type ColorProps = ControlProps[ColorValue] with ColorConfig
}

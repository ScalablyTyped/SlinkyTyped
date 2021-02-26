package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import typingsSlinky.storybookComponents.controlsTypesMod.ColorConfig
import typingsSlinky.storybookComponents.controlsTypesMod.ColorValue
import typingsSlinky.storybookComponents.controlsTypesMod.ControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod {
  
  @JSImport("@storybook/components/dist/controls/Color", "ColorControl")
  @js.native
  val ColorControl: ReactComponentClass[ColorProps] = js.native
  
  type ColorProps = ControlProps[ColorValue] with ColorConfig
}

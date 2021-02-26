package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import typingsSlinky.storybookComponents.controlsTypesMod.ControlProps
import typingsSlinky.storybookComponents.controlsTypesMod.NumberValue
import typingsSlinky.storybookComponents.controlsTypesMod.RangeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeMod {
  
  @JSImport("@storybook/components/dist/controls/Range", "RangeControl")
  @js.native
  val RangeControl: ReactComponentClass[RangeProps] = js.native
  
  type RangeProps = (ControlProps[NumberValue | Null]) with RangeConfig
}

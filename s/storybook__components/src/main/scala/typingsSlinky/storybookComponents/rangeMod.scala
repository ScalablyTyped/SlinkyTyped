package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import typingsSlinky.storybookComponents.controlsTypesMod.ControlProps
import typingsSlinky.storybookComponents.controlsTypesMod.NumberValue
import typingsSlinky.storybookComponents.controlsTypesMod.RangeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/controls/Range", JSImport.Namespace)
@js.native
object rangeMod extends js.Object {
  
  val RangeControl: ReactComponentClass[RangeProps] = js.native
  
  type RangeProps = (ControlProps[NumberValue | Null]) with RangeConfig
}

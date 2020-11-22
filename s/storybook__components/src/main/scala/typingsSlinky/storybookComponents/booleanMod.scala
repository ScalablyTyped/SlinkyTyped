package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import typingsSlinky.storybookComponents.controlsTypesMod.BooleanConfig
import typingsSlinky.storybookComponents.controlsTypesMod.BooleanValue
import typingsSlinky.storybookComponents.controlsTypesMod.ControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/controls/Boolean", JSImport.Namespace)
@js.native
object booleanMod extends js.Object {
  
  val BooleanControl: ReactComponentClass[BooleanProps] = js.native
  
  type BooleanProps = ControlProps[BooleanValue] with BooleanConfig
}

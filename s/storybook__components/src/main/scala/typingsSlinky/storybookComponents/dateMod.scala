package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import typingsSlinky.storybookComponents.controlsTypesMod.ControlProps
import typingsSlinky.storybookComponents.controlsTypesMod.DateConfig
import typingsSlinky.storybookComponents.controlsTypesMod.DateValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/controls/Date", JSImport.Namespace)
@js.native
object dateMod extends js.Object {
  
  val DateControl: ReactComponentClass[DateProps] = js.native
  
  type DateProps = ControlProps[DateValue] with DateConfig
}

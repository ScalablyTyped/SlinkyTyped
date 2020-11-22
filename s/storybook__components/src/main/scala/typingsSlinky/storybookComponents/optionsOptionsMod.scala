package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import typingsSlinky.storybookComponents.controlsTypesMod.ControlProps
import typingsSlinky.storybookComponents.controlsTypesMod.OptionsConfig
import typingsSlinky.storybookComponents.controlsTypesMod.OptionsSelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/controls/options/Options", JSImport.Namespace)
@js.native
object optionsOptionsMod extends js.Object {
  
  val OptionsControl: ReactComponentClass[OptionsProps] = js.native
  
  type OptionsProps = ControlProps[OptionsSelection] with OptionsConfig
}

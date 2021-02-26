package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import typingsSlinky.storybookComponents.controlsTypesMod.ControlProps
import typingsSlinky.storybookComponents.controlsTypesMod.OptionsConfig
import typingsSlinky.storybookComponents.controlsTypesMod.OptionsSelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsOptionsMod {
  
  @JSImport("@storybook/components/dist/controls/options/Options", "OptionsControl")
  @js.native
  val OptionsControl: ReactComponentClass[OptionsProps] = js.native
  
  type OptionsProps = ControlProps[OptionsSelection] with OptionsConfig
}

package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import typingsSlinky.storybookComponents.controlsTypesMod.BooleanConfig
import typingsSlinky.storybookComponents.controlsTypesMod.BooleanValue
import typingsSlinky.storybookComponents.controlsTypesMod.ControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object booleanMod {
  
  @JSImport("@storybook/components/dist/controls/Boolean", "BooleanControl")
  @js.native
  val BooleanControl: ReactComponentClass[BooleanProps] = js.native
  
  type BooleanProps = ControlProps[BooleanValue] with BooleanConfig
}

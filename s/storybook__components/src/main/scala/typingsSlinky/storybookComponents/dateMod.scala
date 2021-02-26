package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import typingsSlinky.storybookComponents.controlsTypesMod.ControlProps
import typingsSlinky.storybookComponents.controlsTypesMod.DateConfig
import typingsSlinky.storybookComponents.controlsTypesMod.DateValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMod {
  
  @JSImport("@storybook/components/dist/controls/Date", "DateControl")
  @js.native
  val DateControl: ReactComponentClass[DateProps] = js.native
  
  type DateProps = ControlProps[DateValue] with DateConfig
}

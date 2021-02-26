package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import typingsSlinky.storybookComponents.controlsTypesMod.ControlProps
import typingsSlinky.storybookComponents.controlsTypesMod.NumberConfig
import typingsSlinky.storybookComponents.controlsTypesMod.NumberValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberMod {
  
  @JSImport("@storybook/components/dist/controls/Number", "NumberControl")
  @js.native
  val NumberControl: ReactComponentClass[NumberProps] = js.native
  
  @JSImport("@storybook/components/dist/controls/Number", "format")
  @js.native
  def format(value: NumberValue): String = js.native
  
  @JSImport("@storybook/components/dist/controls/Number", "parse")
  @js.native
  def parse(value: String): Double = js.native
  
  type NumberProps = (ControlProps[NumberValue | Null]) with NumberConfig
}

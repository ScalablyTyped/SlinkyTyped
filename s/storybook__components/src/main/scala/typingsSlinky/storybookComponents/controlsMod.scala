package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import typingsSlinky.storybookComponents.arrayMod.ArrayProps
import typingsSlinky.storybookComponents.booleanMod.BooleanProps
import typingsSlinky.storybookComponents.colorMod.ColorProps
import typingsSlinky.storybookComponents.controlsTypesMod.NumberValue
import typingsSlinky.storybookComponents.dateMod.DateProps
import typingsSlinky.storybookComponents.numberMod.NumberProps
import typingsSlinky.storybookComponents.objectMod.ObjectProps
import typingsSlinky.storybookComponents.optionsOptionsMod.OptionsProps
import typingsSlinky.storybookComponents.rangeMod.RangeProps
import typingsSlinky.storybookComponents.textMod.TextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/controls", JSImport.Namespace)
@js.native
object controlsMod extends js.Object {
  
  val ArrayControl: ReactComponentClass[ArrayProps] = js.native
  
  val BooleanControl: ReactComponentClass[BooleanProps] = js.native
  
  val ColorControl: ReactComponentClass[ColorProps] = js.native
  
  val DateControl: ReactComponentClass[DateProps] = js.native
  
  val NumberControl: ReactComponentClass[NumberProps] = js.native
  
  val ObjectControl: ReactComponentClass[ObjectProps] = js.native
  
  val OptionsControl: ReactComponentClass[OptionsProps] = js.native
  
  val RangeControl: ReactComponentClass[RangeProps] = js.native
  
  val TextControl: ReactComponentClass[TextProps] = js.native
  
  def format(value: NumberValue): String = js.native
  
  def parse(value: String): Double = js.native
}

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlsMod {
  
  @JSImport("@storybook/components/dist/controls", "ArrayControl")
  @js.native
  val ArrayControl: ReactComponentClass[ArrayProps] = js.native
  
  @JSImport("@storybook/components/dist/controls", "BooleanControl")
  @js.native
  val BooleanControl: ReactComponentClass[BooleanProps] = js.native
  
  @JSImport("@storybook/components/dist/controls", "ColorControl")
  @js.native
  val ColorControl: ReactComponentClass[ColorProps] = js.native
  
  @JSImport("@storybook/components/dist/controls", "DateControl")
  @js.native
  val DateControl: ReactComponentClass[DateProps] = js.native
  
  @JSImport("@storybook/components/dist/controls", "NumberControl")
  @js.native
  val NumberControl: ReactComponentClass[NumberProps] = js.native
  
  @JSImport("@storybook/components/dist/controls", "ObjectControl")
  @js.native
  val ObjectControl: ReactComponentClass[ObjectProps] = js.native
  
  @JSImport("@storybook/components/dist/controls", "OptionsControl")
  @js.native
  val OptionsControl: ReactComponentClass[OptionsProps] = js.native
  
  @JSImport("@storybook/components/dist/controls", "RangeControl")
  @js.native
  val RangeControl: ReactComponentClass[RangeProps] = js.native
  
  @JSImport("@storybook/components/dist/controls", "TextControl")
  @js.native
  val TextControl: ReactComponentClass[TextProps] = js.native
  
  @JSImport("@storybook/components/dist/controls", "format")
  @js.native
  def format(value: NumberValue): String = js.native
  
  @JSImport("@storybook/components/dist/controls", "parse")
  @js.native
  def parse(value: String): Double = js.native
}

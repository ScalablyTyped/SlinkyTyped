package typingsSlinky.storybookComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object controlsTypesMod {
  
  type ArrayValue = js.Array[java.lang.String]
  
  type BooleanValue = scala.Boolean
  
  type ColorValue = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.storybookComponents.controlsTypesMod.ArrayConfig
    - typingsSlinky.storybookComponents.controlsTypesMod.BooleanConfig
    - typingsSlinky.storybookComponents.controlsTypesMod.ColorConfig
    - typingsSlinky.storybookComponents.controlsTypesMod.DateConfig
    - typingsSlinky.storybookComponents.controlsTypesMod.NumberConfig
    - typingsSlinky.storybookComponents.controlsTypesMod.ObjectConfig
    - typingsSlinky.storybookComponents.controlsTypesMod.OptionsConfig
    - typingsSlinky.storybookComponents.controlsTypesMod.RangeConfig
    - typingsSlinky.storybookComponents.controlsTypesMod.TextConfig
  */
  type Control = typingsSlinky.storybookComponents.controlsTypesMod._Control | typingsSlinky.storybookComponents.controlsTypesMod.RangeConfig
  
  type Controls = typingsSlinky.std.Record[java.lang.String, typingsSlinky.storybookComponents.controlsTypesMod.Control]
  
  type DateValue = js.Date | scala.Double
  
  type NumberValue = scala.Double
  
  type ObjectValue = js.Any
  
  type Options = typingsSlinky.storybookComponents.controlsTypesMod.OptionsArray | typingsSlinky.storybookComponents.controlsTypesMod.OptionsObject
  
  type OptionsArray = js.Array[js.Any]
  
  type OptionsMultiSelection = js.Array[js.Any]
  
  type OptionsObject = typingsSlinky.std.Record[java.lang.String, js.Any]
  
  type OptionsSelection = typingsSlinky.storybookComponents.controlsTypesMod.OptionsSingleSelection | typingsSlinky.storybookComponents.controlsTypesMod.OptionsMultiSelection
  
  type OptionsSingleSelection = js.Any
  
  type RangeConfig = typingsSlinky.storybookComponents.controlsTypesMod.NumberConfig
  
  type TextValue = java.lang.String
}

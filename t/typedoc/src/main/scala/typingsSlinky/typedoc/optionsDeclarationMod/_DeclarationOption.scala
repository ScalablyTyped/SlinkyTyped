package typingsSlinky.typedoc.optionsDeclarationMod

import typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.Array
import typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.Boolean
import typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.Mixed
import typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _DeclarationOption extends StObject
object _DeclarationOption {
  
  @scala.inline
  def ArrayDeclarationOption(help: String, name: String, `type`: Array): typingsSlinky.typedoc.optionsDeclarationMod.ArrayDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.optionsDeclarationMod.ArrayDeclarationOption]
  }
  
  @scala.inline
  def BooleanDeclarationOption(help: String, name: String, `type`: Boolean): typingsSlinky.typedoc.optionsDeclarationMod.BooleanDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.optionsDeclarationMod.BooleanDeclarationOption]
  }
  
  @scala.inline
  def MixedDeclarationOption(help: String, name: String, `type`: Mixed): typingsSlinky.typedoc.optionsDeclarationMod.MixedDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.optionsDeclarationMod.MixedDeclarationOption]
  }
  
  @scala.inline
  def NumberDeclarationOption(help: String, name: String, `type`: Number): typingsSlinky.typedoc.optionsDeclarationMod.NumberDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.optionsDeclarationMod.NumberDeclarationOption]
  }
  
  @scala.inline
  def StringDeclarationOption(help: String, name: String): typingsSlinky.typedoc.optionsDeclarationMod.StringDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.optionsDeclarationMod.StringDeclarationOption]
  }
}

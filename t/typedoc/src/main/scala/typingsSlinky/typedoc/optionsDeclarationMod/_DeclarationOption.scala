package typingsSlinky.typedoc.optionsDeclarationMod

import typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.Array
import typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.Boolean
import typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.Mixed
import typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _DeclarationOption extends js.Object
object _DeclarationOption {
  
  @scala.inline
  def StringDeclarationOption(help: String, name: String): _DeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[_DeclarationOption]
  }
  
  @scala.inline
  def MixedDeclarationOption(help: String, name: String, `type`: Mixed): _DeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_DeclarationOption]
  }
  
  @scala.inline
  def ArrayDeclarationOption(help: String, name: String, `type`: Array): _DeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_DeclarationOption]
  }
  
  @scala.inline
  def BooleanDeclarationOption(help: String, name: String, `type`: Boolean): _DeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_DeclarationOption]
  }
  
  @scala.inline
  def NumberDeclarationOption(help: String, name: String, `type`: Number): _DeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_DeclarationOption]
  }
}

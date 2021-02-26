package typingsSlinky.typedoc.optionsDeclarationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BooleanDeclarationOption
  extends DeclarationOptionBase
     with _DeclarationOption
     with _KeyToDeclaration[js.Any] {
  
  var defaultValue: js.UndefOr[Boolean] = js.native
  
  @JSName("type")
  var type_BooleanDeclarationOption: typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.Boolean = js.native
}
object BooleanDeclarationOption {
  
  @scala.inline
  def apply(
    help: String,
    name: String,
    `type`: typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.Boolean
  ): BooleanDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanDeclarationOption]
  }
  
  @scala.inline
  implicit class BooleanDeclarationOptionMutableBuilder[Self <: BooleanDeclarationOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: Boolean): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.typedoc.anon

import typingsSlinky.typedoc.optionsDeclarationMod.ParameterScope
import typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<typedoc.typedoc/dist/lib/utils/options/declaration.ArrayDeclarationOption> */
@js.native
trait ReadonlyArrayDeclarationO extends StObject {
  
  val defaultValue: js.UndefOr[js.Array[String]] = js.native
  
  val help: String = js.native
  
  val name: String = js.native
  
  val scope: js.UndefOr[ParameterScope] = js.native
  
  val short: js.UndefOr[String] = js.native
  
  val `type`: Array = js.native
}
object ReadonlyArrayDeclarationO {
  
  @scala.inline
  def apply(help: String, name: String, `type`: Array): ReadonlyArrayDeclarationO = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyArrayDeclarationO]
  }
  
  @scala.inline
  implicit class ReadonlyArrayDeclarationOMutableBuilder[Self <: ReadonlyArrayDeclarationO] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
    
    @scala.inline
    def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: ParameterScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
    
    @scala.inline
    def setType(value: Array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

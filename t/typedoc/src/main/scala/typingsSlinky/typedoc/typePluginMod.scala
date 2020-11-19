package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentMod.AbstractComponent
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typedoc.reflectionsMod.DeclarationReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/plugins/TypePlugin", JSImport.Namespace)
@js.native
object typePluginMod extends js.Object {
  
  @js.native
  class TypePlugin () extends AbstractComponent[Converter] {
    
    var onResolve: js.Any = js.native
    
    var onResolveEnd: js.Any = js.native
    
    var postpone: js.Any = js.native
    
    var reflections: js.Array[DeclarationReflection] = js.native
  }
}

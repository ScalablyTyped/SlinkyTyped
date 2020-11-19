package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentMod.AbstractComponent
import typingsSlinky.typedoc.converterConverterMod.Converter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/plugins/DynamicModulePlugin", JSImport.Namespace)
@js.native
object dynamicModulePluginMod extends js.Object {
  
  @js.native
  class DynamicModulePlugin () extends AbstractComponent[Converter] {
    
    var basePath: js.Any = js.native
    
    var onBegin: js.Any = js.native
    
    var onBeginResolve: js.Any = js.native
    
    var onDeclaration: js.Any = js.native
    
    var reflections: js.Any = js.native
  }
}

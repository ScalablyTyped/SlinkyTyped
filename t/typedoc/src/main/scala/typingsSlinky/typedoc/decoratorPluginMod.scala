package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentMod.AbstractComponent
import typingsSlinky.typedoc.converterConverterMod.Converter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/plugins/DecoratorPlugin", JSImport.Namespace)
@js.native
object decoratorPluginMod extends js.Object {
  
  @js.native
  class DecoratorPlugin () extends AbstractComponent[Converter] {
    
    var extractArguments: js.Any = js.native
    
    var onBegin: js.Any = js.native
    
    var onBeginResolve: js.Any = js.native
    
    var onDeclaration: js.Any = js.native
    
    var usages: js.Any = js.native
  }
}

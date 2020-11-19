package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentMod.AbstractComponent
import typingsSlinky.typedoc.converterConverterMod.Converter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/plugins/ImplementsPlugin", JSImport.Namespace)
@js.native
object implementsPluginMod extends js.Object {
  
  @js.native
  class ImplementsPlugin () extends AbstractComponent[Converter] {
    
    var analyzeClass: js.Any = js.native
    
    var copyComment: js.Any = js.native
    
    var onResolve: js.Any = js.native
  }
}

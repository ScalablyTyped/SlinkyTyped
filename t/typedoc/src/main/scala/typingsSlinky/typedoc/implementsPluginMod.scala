package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.ConverterComponent
import typingsSlinky.typedoc.converterConverterMod.Converter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object implementsPluginMod {
  
  @JSImport("typedoc/dist/lib/converter/plugins/ImplementsPlugin", "ImplementsPlugin")
  @js.native
  class ImplementsPlugin protected () extends ConverterComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    var analyzeClass: js.Any = js.native
    
    var copyComment: js.Any = js.native
    
    var onResolve: js.Any = js.native
  }
}

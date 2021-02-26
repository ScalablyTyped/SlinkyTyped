package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.ConverterComponent
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typedoc.reflectionsMod.DeclarationReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typePluginMod {
  
  @JSImport("typedoc/dist/lib/converter/plugins/TypePlugin", "TypePlugin")
  @js.native
  class TypePlugin protected () extends ConverterComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    var onResolve: js.Any = js.native
    
    var onResolveEnd: js.Any = js.native
    
    var postpone: js.Any = js.native
    
    var reflections: js.Array[DeclarationReflection] = js.native
  }
}

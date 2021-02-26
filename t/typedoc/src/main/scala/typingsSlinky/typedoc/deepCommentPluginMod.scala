package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.ConverterComponent
import typingsSlinky.typedoc.converterConverterMod.Converter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deepCommentPluginMod {
  
  @JSImport("typedoc/dist/lib/converter/plugins/DeepCommentPlugin", "DeepCommentPlugin")
  @js.native
  class DeepCommentPlugin protected () extends ConverterComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    var onBeginResolve: js.Any = js.native
  }
}

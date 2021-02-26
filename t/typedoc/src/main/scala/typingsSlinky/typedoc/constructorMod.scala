package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.ConverterNodeComponent
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typescript.mod.ConstructorDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constructorMod {
  
  @JSImport("typedoc/dist/lib/converter/nodes/constructor", "ConstructorConverter")
  @js.native
  class ConstructorConverter protected () extends ConverterNodeComponent[ConstructorDeclaration] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    var addParameterProperty: js.Any = js.native
  }
}

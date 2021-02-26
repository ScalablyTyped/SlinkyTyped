package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.ConverterNodeComponent
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typedoc.modelsMod.Reflection
import typingsSlinky.typescript.mod.FunctionExpression
import typingsSlinky.typescript.mod.SignatureDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signatureCallMod {
  
  @JSImport("typedoc/dist/lib/converter/nodes/signature-call", "SignatureConverter")
  @js.native
  class SignatureConverter protected () extends ConverterNodeComponent[FunctionExpression | SignatureDeclaration] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    def convert(context: Context, node: FunctionExpression): Reflection = js.native
    def convert(context: Context, node: SignatureDeclaration): Reflection = js.native
  }
}

package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.ConverterNodeComponent
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typedoc.modelsMod.Reflection
import typingsSlinky.typescript.mod.FunctionDeclaration
import typingsSlinky.typescript.mod.MethodDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/nodes/function", JSImport.Namespace)
@js.native
object functionMod extends js.Object {
  
  @js.native
  class FunctionConverter () extends ConverterNodeComponent[FunctionDeclaration | MethodDeclaration] {
    
    def convert(context: Context, node: FunctionDeclaration): js.UndefOr[Reflection] = js.native
    def convert(context: Context, node: MethodDeclaration): js.UndefOr[Reflection] = js.native
  }
}

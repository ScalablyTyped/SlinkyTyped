package typingsSlinky.typedoc

import typingsSlinky.typedoc.abstractMod.ReflectionKind
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typedoc.modelsMod.SignatureReflection
import typingsSlinky.typescript.mod.SignatureDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signatureMod {
  
  @JSImport("typedoc/dist/lib/converter/factories/signature", "createSignature")
  @js.native
  def createSignature(context: Context, node: SignatureDeclaration, name: String, kind: ReflectionKind): SignatureReflection = js.native
}

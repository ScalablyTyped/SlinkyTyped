package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.IReferenceResolverHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ReferenceResolver")
@js.native
class ReferenceResolver protected ()
  extends typingsSlinky.typescriptServices.TypeScript.ReferenceResolver {
  def this(
    inputFileNames: js.Array[String],
    host: IReferenceResolverHost,
    useCaseSensitiveFileResolution: Boolean
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.ReferenceResolver")
@js.native
object ReferenceResolver extends js.Object {
  
  def resolve(
    inputFileNames: js.Array[String],
    host: IReferenceResolverHost,
    useCaseSensitiveFileResolution: Boolean
  ): typingsSlinky.typescriptServices.TypeScript.ReferenceResolutionResult = js.native
}

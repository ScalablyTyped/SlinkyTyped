package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.IReferenceResolverHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "ReferenceResolver")
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
@JSImport("typescript-services", "ReferenceResolver")
@js.native
object ReferenceResolver extends js.Object {
  
  def resolve(
    inputFileNames: js.Array[String],
    host: IReferenceResolverHost,
    useCaseSensitiveFileResolution: Boolean
  ): typingsSlinky.typescriptServices.TypeScript.ReferenceResolutionResult = js.native
}

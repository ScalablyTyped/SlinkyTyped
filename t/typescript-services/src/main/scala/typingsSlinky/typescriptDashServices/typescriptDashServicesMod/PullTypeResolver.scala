package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullTypeResolver")
@js.native
class PullTypeResolver protected ()
  extends typingsSlinky.typescriptDashServices.TypeScript.PullTypeResolver {
  def this(
    compilationSettings: typingsSlinky.typescriptDashServices.TypeScript.ImmutableCompilationSettings,
    semanticInfoChain: typingsSlinky.typescriptDashServices.TypeScript.SemanticInfoChain
  ) = this()
}

/* static members */
@JSImport("typescript-services", "PullTypeResolver")
@js.native
object PullTypeResolver extends js.Object {
  var globalTypeCheckPhase: Double = js.native
  def hasSetAccessorParameterTypeAnnotation(setAccessor: typingsSlinky.typescriptDashServices.TypeScript.SetAccessor): Boolean = js.native
  def typeCheck(
    compilationSettings: typingsSlinky.typescriptDashServices.TypeScript.ImmutableCompilationSettings,
    semanticInfoChain: typingsSlinky.typescriptDashServices.TypeScript.SemanticInfoChain,
    document: typingsSlinky.typescriptDashServices.TypeScript.Document
  ): Unit = js.native
}


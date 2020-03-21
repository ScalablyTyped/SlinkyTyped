package typingsSlinky.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullTypeResolver")
@js.native
class PullTypeResolver protected ()
  extends typingsSlinky.typescriptServices.TypeScript.PullTypeResolver {
  def this(
    compilationSettings: typingsSlinky.typescriptServices.TypeScript.ImmutableCompilationSettings,
    semanticInfoChain: typingsSlinky.typescriptServices.TypeScript.SemanticInfoChain
  ) = this()
}

/* static members */
@JSImport("typescript-services", "PullTypeResolver")
@js.native
object PullTypeResolver extends js.Object {
  var globalTypeCheckPhase: Double = js.native
  def hasSetAccessorParameterTypeAnnotation(setAccessor: typingsSlinky.typescriptServices.TypeScript.SetAccessor): Boolean = js.native
  def typeCheck(
    compilationSettings: typingsSlinky.typescriptServices.TypeScript.ImmutableCompilationSettings,
    semanticInfoChain: typingsSlinky.typescriptServices.TypeScript.SemanticInfoChain,
    document: typingsSlinky.typescriptServices.TypeScript.Document
  ): Unit = js.native
}


package typingsSlinky.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "CandidateInferenceInfo")
@js.native
class CandidateInferenceInfo ()
  extends typingsSlinky.typescriptServices.TypeScript.CandidateInferenceInfo {
  /* CompleteClass */
  override var _inferredTypeAfterFixing: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol = js.native
  /* CompleteClass */
  override var inferenceCandidates: js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol] = js.native
  /* CompleteClass */
  override var typeParameter: typingsSlinky.typescriptServices.TypeScript.PullTypeParameterSymbol = js.native
  /* CompleteClass */
  override def addCandidate(candidate: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol): Unit = js.native
  /* CompleteClass */
  override def fixTypeParameter(
    resolver: typingsSlinky.typescriptServices.TypeScript.PullTypeResolver,
    context: typingsSlinky.typescriptServices.TypeScript.PullTypeResolutionContext
  ): Unit = js.native
  /* CompleteClass */
  override def isFixed(): Boolean = js.native
}


package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.IBitMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "InvocationTypeArgumentInferenceContext")
@js.native
class InvocationTypeArgumentInferenceContext protected ()
  extends typingsSlinky.typescriptServices.TypeScript.InvocationTypeArgumentInferenceContext {
  def this(
    resolver: typingsSlinky.typescriptServices.TypeScript.PullTypeResolver,
    context: typingsSlinky.typescriptServices.TypeScript.PullTypeResolutionContext,
    signatureBeingInferred: typingsSlinky.typescriptServices.TypeScript.PullSignatureSymbol,
    argumentASTs: typingsSlinky.typescriptServices.TypeScript.ISeparatedSyntaxList2
  ) = this()
  /* CompleteClass */
  override var argumentASTs: typingsSlinky.typescriptServices.TypeScript.ISeparatedSyntaxList2 = js.native
  /* CompleteClass */
  override var candidateCache: js.Array[typingsSlinky.typescriptServices.TypeScript.CandidateInferenceInfo] = js.native
  /* CompleteClass */
  override var context: typingsSlinky.typescriptServices.TypeScript.PullTypeResolutionContext = js.native
  /* CompleteClass */
  override var inferenceCache: IBitMatrix = js.native
  /* CompleteClass */
  override var resolver: typingsSlinky.typescriptServices.TypeScript.PullTypeResolver = js.native
  /* CompleteClass */
  override var signatureBeingInferred: typingsSlinky.typescriptServices.TypeScript.PullSignatureSymbol = js.native
  /* CompleteClass */
  override def _finalizeInferredTypeArguments(): js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol] = js.native
  /* CompleteClass */
  override def addCandidateForInference(
    param: typingsSlinky.typescriptServices.TypeScript.PullTypeParameterSymbol,
    candidate: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol
  ): Unit = js.native
  /* CompleteClass */
  override def addInferenceRoot(param: typingsSlinky.typescriptServices.TypeScript.PullTypeParameterSymbol): Unit = js.native
  /* CompleteClass */
  override def alreadyRelatingTypes(
    objectType: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol,
    parameterType: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol
  ): Boolean = js.native
  /* CompleteClass */
  override def fixTypeParameter(typeParameter: typingsSlinky.typescriptServices.TypeScript.PullTypeParameterSymbol): Unit = js.native
  /* CompleteClass */
  override def getInferenceInfo(param: typingsSlinky.typescriptServices.TypeScript.PullTypeParameterSymbol): typingsSlinky.typescriptServices.TypeScript.CandidateInferenceInfo = js.native
  /* CompleteClass */
  override def inferTypeArguments(): js.Array[typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol] = js.native
  /* CompleteClass */
  override def isInvocationInferenceContext(): Boolean = js.native
  /* CompleteClass */
  override def resetRelationshipCache(): Unit = js.native
}


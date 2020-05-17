package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeArgumentInferenceContext extends js.Object {
  var candidateCache: js.Array[CandidateInferenceInfo] = js.native
  var context: PullTypeResolutionContext = js.native
  var inferenceCache: IBitMatrix = js.native
  var resolver: PullTypeResolver = js.native
  var signatureBeingInferred: PullSignatureSymbol = js.native
  def _finalizeInferredTypeArguments(): js.Array[PullTypeSymbol] = js.native
  def addCandidateForInference(param: PullTypeParameterSymbol, candidate: PullTypeSymbol): Unit = js.native
  def addInferenceRoot(param: PullTypeParameterSymbol): Unit = js.native
  def alreadyRelatingTypes(objectType: PullTypeSymbol, parameterType: PullTypeSymbol): Boolean = js.native
  def fixTypeParameter(typeParameter: PullTypeParameterSymbol): Unit = js.native
  def getInferenceInfo(param: PullTypeParameterSymbol): CandidateInferenceInfo = js.native
  def inferTypeArguments(): js.Array[PullTypeSymbol] = js.native
  def isInvocationInferenceContext(): Boolean = js.native
  def resetRelationshipCache(): Unit = js.native
}

object TypeArgumentInferenceContext {
  @scala.inline
  def apply(
    _finalizeInferredTypeArguments: () => js.Array[PullTypeSymbol],
    addCandidateForInference: (PullTypeParameterSymbol, PullTypeSymbol) => Unit,
    addInferenceRoot: PullTypeParameterSymbol => Unit,
    alreadyRelatingTypes: (PullTypeSymbol, PullTypeSymbol) => Boolean,
    candidateCache: js.Array[CandidateInferenceInfo],
    context: PullTypeResolutionContext,
    fixTypeParameter: PullTypeParameterSymbol => Unit,
    getInferenceInfo: PullTypeParameterSymbol => CandidateInferenceInfo,
    inferTypeArguments: () => js.Array[PullTypeSymbol],
    inferenceCache: IBitMatrix,
    isInvocationInferenceContext: () => Boolean,
    resetRelationshipCache: () => Unit,
    resolver: PullTypeResolver,
    signatureBeingInferred: PullSignatureSymbol
  ): TypeArgumentInferenceContext = {
    val __obj = js.Dynamic.literal(_finalizeInferredTypeArguments = js.Any.fromFunction0(_finalizeInferredTypeArguments), addCandidateForInference = js.Any.fromFunction2(addCandidateForInference), addInferenceRoot = js.Any.fromFunction1(addInferenceRoot), alreadyRelatingTypes = js.Any.fromFunction2(alreadyRelatingTypes), candidateCache = candidateCache.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], fixTypeParameter = js.Any.fromFunction1(fixTypeParameter), getInferenceInfo = js.Any.fromFunction1(getInferenceInfo), inferTypeArguments = js.Any.fromFunction0(inferTypeArguments), inferenceCache = inferenceCache.asInstanceOf[js.Any], isInvocationInferenceContext = js.Any.fromFunction0(isInvocationInferenceContext), resetRelationshipCache = js.Any.fromFunction0(resetRelationshipCache), resolver = resolver.asInstanceOf[js.Any], signatureBeingInferred = signatureBeingInferred.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeArgumentInferenceContext]
  }
  @scala.inline
  implicit class TypeArgumentInferenceContextOps[Self <: TypeArgumentInferenceContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_finalizeInferredTypeArguments(value: () => js.Array[PullTypeSymbol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_finalizeInferredTypeArguments")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddCandidateForInference(value: (PullTypeParameterSymbol, PullTypeSymbol) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCandidateForInference")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddInferenceRoot(value: PullTypeParameterSymbol => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addInferenceRoot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAlreadyRelatingTypes(value: (PullTypeSymbol, PullTypeSymbol) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alreadyRelatingTypes")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCandidateCache(value: js.Array[CandidateInferenceInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candidateCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: PullTypeResolutionContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixTypeParameter(value: PullTypeParameterSymbol => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixTypeParameter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetInferenceInfo(value: PullTypeParameterSymbol => CandidateInferenceInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInferenceInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInferTypeArguments(value: () => js.Array[PullTypeSymbol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inferTypeArguments")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInferenceCache(value: IBitMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inferenceCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInvocationInferenceContext(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInvocationInferenceContext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResetRelationshipCache(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetRelationshipCache")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResolver(value: PullTypeResolver): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatureBeingInferred(value: PullSignatureSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureBeingInferred")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


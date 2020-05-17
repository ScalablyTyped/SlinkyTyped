package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CandidateInferenceInfo extends js.Object {
  var _inferredTypeAfterFixing: PullTypeSymbol = js.native
  var inferenceCandidates: js.Array[PullTypeSymbol] = js.native
  var typeParameter: PullTypeParameterSymbol = js.native
  def addCandidate(candidate: PullTypeSymbol): Unit = js.native
  def fixTypeParameter(resolver: PullTypeResolver, context: PullTypeResolutionContext): Unit = js.native
  def isFixed(): Boolean = js.native
}

object CandidateInferenceInfo {
  @scala.inline
  def apply(
    _inferredTypeAfterFixing: PullTypeSymbol,
    addCandidate: PullTypeSymbol => Unit,
    fixTypeParameter: (PullTypeResolver, PullTypeResolutionContext) => Unit,
    inferenceCandidates: js.Array[PullTypeSymbol],
    isFixed: () => Boolean,
    typeParameter: PullTypeParameterSymbol
  ): CandidateInferenceInfo = {
    val __obj = js.Dynamic.literal(_inferredTypeAfterFixing = _inferredTypeAfterFixing.asInstanceOf[js.Any], addCandidate = js.Any.fromFunction1(addCandidate), fixTypeParameter = js.Any.fromFunction2(fixTypeParameter), inferenceCandidates = inferenceCandidates.asInstanceOf[js.Any], isFixed = js.Any.fromFunction0(isFixed), typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandidateInferenceInfo]
  }
  @scala.inline
  implicit class CandidateInferenceInfoOps[Self <: CandidateInferenceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_inferredTypeAfterFixing(value: PullTypeSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_inferredTypeAfterFixing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddCandidate(value: PullTypeSymbol => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCandidate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFixTypeParameter(value: (PullTypeResolver, PullTypeResolutionContext) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixTypeParameter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInferenceCandidates(value: js.Array[PullTypeSymbol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inferenceCandidates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFixed(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFixed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTypeParameter(value: PullTypeParameterSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


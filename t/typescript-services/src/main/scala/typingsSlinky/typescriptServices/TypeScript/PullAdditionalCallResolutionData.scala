package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullAdditionalCallResolutionData extends js.Object {
  var actualParametersContextTypeSymbols: js.Array[PullTypeSymbol] = js.native
  var candidateSignature: PullSignatureSymbol = js.native
  var diagnosticsFromOverloadResolution: js.Array[Diagnostic] = js.native
  var resolvedSignatures: js.Array[PullSignatureSymbol] = js.native
  var targetSymbol: PullSymbol = js.native
}

object PullAdditionalCallResolutionData {
  @scala.inline
  def apply(
    actualParametersContextTypeSymbols: js.Array[PullTypeSymbol],
    candidateSignature: PullSignatureSymbol,
    diagnosticsFromOverloadResolution: js.Array[Diagnostic],
    resolvedSignatures: js.Array[PullSignatureSymbol],
    targetSymbol: PullSymbol
  ): PullAdditionalCallResolutionData = {
    val __obj = js.Dynamic.literal(actualParametersContextTypeSymbols = actualParametersContextTypeSymbols.asInstanceOf[js.Any], candidateSignature = candidateSignature.asInstanceOf[js.Any], diagnosticsFromOverloadResolution = diagnosticsFromOverloadResolution.asInstanceOf[js.Any], resolvedSignatures = resolvedSignatures.asInstanceOf[js.Any], targetSymbol = targetSymbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullAdditionalCallResolutionData]
  }
  @scala.inline
  implicit class PullAdditionalCallResolutionDataOps[Self <: PullAdditionalCallResolutionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActualParametersContextTypeSymbols(value: js.Array[PullTypeSymbol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualParametersContextTypeSymbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCandidateSignature(value: PullSignatureSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candidateSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiagnosticsFromOverloadResolution(value: js.Array[Diagnostic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosticsFromOverloadResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolvedSignatures(value: js.Array[PullSignatureSymbol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedSignatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetSymbol(value: PullSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSymbol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


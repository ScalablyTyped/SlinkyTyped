package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceResolutionResult extends js.Object {
  var diagnostics: js.Array[Diagnostic] = js.native
  var resolvedFiles: js.Array[IResolvedFile] = js.native
  var seenNoDefaultLibTag: Boolean = js.native
}

object ReferenceResolutionResult {
  @scala.inline
  def apply(
    diagnostics: js.Array[Diagnostic],
    resolvedFiles: js.Array[IResolvedFile],
    seenNoDefaultLibTag: Boolean
  ): ReferenceResolutionResult = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], resolvedFiles = resolvedFiles.asInstanceOf[js.Any], seenNoDefaultLibTag = seenNoDefaultLibTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceResolutionResult]
  }
  @scala.inline
  implicit class ReferenceResolutionResultOps[Self <: ReferenceResolutionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiagnostics(value: js.Array[Diagnostic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolvedFiles(value: js.Array[IResolvedFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeenNoDefaultLibTag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seenNoDefaultLibTag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


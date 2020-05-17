package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompileResult extends js.Object {
  var diagnostics: js.Array[Diagnostic] = js.native
  var outputFiles: js.Array[OutputFile] = js.native
}

object CompileResult {
  @scala.inline
  def apply(diagnostics: js.Array[Diagnostic], outputFiles: js.Array[OutputFile]): CompileResult = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], outputFiles = outputFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileResult]
  }
  @scala.inline
  implicit class CompileResultOps[Self <: CompileResult] (val x: Self) extends AnyVal {
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
    def withOutputFiles(value: js.Array[OutputFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFiles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


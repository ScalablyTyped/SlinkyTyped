package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmitResult extends js.Object {
  /** Contains declaration emit diagnostics */
  var diagnostics: js.Array[Diagnostic] = js.native
  var emitSkipped: Boolean = js.native
  var emittedFiles: js.UndefOr[js.Array[java.lang.String]] = js.native
}

object EmitResult {
  @scala.inline
  def apply(diagnostics: js.Array[Diagnostic], emitSkipped: Boolean): EmitResult = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], emitSkipped = emitSkipped.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitResult]
  }
  @scala.inline
  implicit class EmitResultOps[Self <: EmitResult] (val x: Self) extends AnyVal {
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
    def withEmitSkipped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitSkipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmittedFiles(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emittedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmittedFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emittedFiles")(js.undefined)
        ret
    }
  }
  
}


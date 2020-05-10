package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranspileOutput extends js.Object {
  var diagnostics: js.UndefOr[js.Array[Diagnostic]] = js.native
  var outputText: java.lang.String = js.native
  var sourceMapText: js.UndefOr[java.lang.String] = js.native
}

object TranspileOutput {
  @scala.inline
  def apply(outputText: java.lang.String): TranspileOutput = {
    val __obj = js.Dynamic.literal(outputText = outputText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranspileOutput]
  }
  @scala.inline
  implicit class TranspileOutputOps[Self <: TranspileOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputText(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiagnostics(value: js.Array[Diagnostic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagnostics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnostics")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMapText(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMapText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapText")(js.undefined)
        ret
    }
  }
  
}


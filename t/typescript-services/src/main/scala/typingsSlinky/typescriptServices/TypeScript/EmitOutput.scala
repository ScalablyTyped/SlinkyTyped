package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmitOutput extends js.Object {
  var emitOutputResult: EmitOutputResult = js.native
  var outputFiles: js.Array[OutputFile] = js.native
}

object EmitOutput {
  @scala.inline
  def apply(emitOutputResult: EmitOutputResult, outputFiles: js.Array[OutputFile]): EmitOutput = {
    val __obj = js.Dynamic.literal(emitOutputResult = emitOutputResult.asInstanceOf[js.Any], outputFiles = outputFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitOutput]
  }
  @scala.inline
  implicit class EmitOutputOps[Self <: EmitOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmitOutputResult(value: EmitOutputResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitOutputResult")(value.asInstanceOf[js.Any])
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


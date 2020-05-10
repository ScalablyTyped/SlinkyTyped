package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProgramOptions extends js.Object {
  var configFileParsingDiagnostics: js.UndefOr[js.Array[Diagnostic]] = js.native
  var host: js.UndefOr[CompilerHost] = js.native
  var oldProgram: js.UndefOr[Program] = js.native
  var options: CompilerOptions = js.native
  var projectReferences: js.UndefOr[js.Array[ProjectReference]] = js.native
  var rootNames: js.Array[java.lang.String] = js.native
}

object CreateProgramOptions {
  @scala.inline
  def apply(options: CompilerOptions, rootNames: js.Array[java.lang.String]): CreateProgramOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], rootNames = rootNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProgramOptions]
  }
  @scala.inline
  implicit class CreateProgramOptionsOps[Self <: CreateProgramOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: CompilerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootNames(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigFileParsingDiagnostics(value: js.Array[Diagnostic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configFileParsingDiagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigFileParsingDiagnostics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configFileParsingDiagnostics")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: CompilerHost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withOldProgram(value: Program): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldProgram")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldProgram: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldProgram")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectReferences(value: js.Array[ProjectReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectReferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectReferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectReferences")(js.undefined)
        ret
    }
  }
  
}


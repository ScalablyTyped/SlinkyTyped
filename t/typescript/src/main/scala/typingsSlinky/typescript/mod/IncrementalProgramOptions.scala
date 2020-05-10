package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncrementalProgramOptions[T /* <: BuilderProgram */] extends js.Object {
  var configFileParsingDiagnostics: js.UndefOr[js.Array[Diagnostic]] = js.native
  var createProgram: js.UndefOr[CreateProgram_[T]] = js.native
  var host: js.UndefOr[CompilerHost] = js.native
  var options: CompilerOptions = js.native
  var projectReferences: js.UndefOr[js.Array[ProjectReference]] = js.native
  var rootNames: js.Array[java.lang.String] = js.native
}

object IncrementalProgramOptions {
  @scala.inline
  def apply[T](options: CompilerOptions, rootNames: js.Array[java.lang.String]): IncrementalProgramOptions[T] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], rootNames = rootNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncrementalProgramOptions[T]]
  }
  @scala.inline
  implicit class IncrementalProgramOptionsOps[Self[t] <: IncrementalProgramOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOptions(value: CompilerOptions): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootNames(value: js.Array[java.lang.String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigFileParsingDiagnostics(value: js.Array[Diagnostic]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configFileParsingDiagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigFileParsingDiagnostics: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configFileParsingDiagnostics")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateProgram(
      value: (/* rootNames */ js.UndefOr[js.Array[java.lang.String]], /* options */ js.UndefOr[CompilerOptions], /* host */ js.UndefOr[CompilerHost], /* oldProgram */ js.UndefOr[T], /* configFileParsingDiagnostics */ js.UndefOr[js.Array[Diagnostic]], /* projectReferences */ js.UndefOr[js.Array[ProjectReference]]) => T
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createProgram")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutCreateProgram: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createProgram")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: CompilerHost): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectReferences(value: js.Array[ProjectReference]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectReferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectReferences: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectReferences")(js.undefined)
        ret
    }
  }
  
}


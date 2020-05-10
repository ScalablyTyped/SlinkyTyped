package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranspileOptions extends js.Object {
  var compilerOptions: js.UndefOr[CompilerOptions] = js.native
  var fileName: js.UndefOr[java.lang.String] = js.native
  var moduleName: js.UndefOr[java.lang.String] = js.native
  var renamedDependencies: js.UndefOr[MapLike[java.lang.String]] = js.native
  var reportDiagnostics: js.UndefOr[Boolean] = js.native
  var transformers: js.UndefOr[CustomTransformers] = js.native
}

object TranspileOptions {
  @scala.inline
  def apply(): TranspileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranspileOptions]
  }
  @scala.inline
  implicit class TranspileOptionsOps[Self <: TranspileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompilerOptions(value: CompilerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompilerOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilerOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withFileName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(js.undefined)
        ret
    }
    @scala.inline
    def withRenamedDependencies(value: MapLike[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renamedDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenamedDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renamedDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withReportDiagnostics(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportDiagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportDiagnostics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportDiagnostics")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformers(value: CustomTransformers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformers")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedCommandLine extends js.Object {
  var compileOnSave: js.UndefOr[Boolean] = js.native
  var errors: js.Array[Diagnostic] = js.native
  var fileNames: js.Array[java.lang.String] = js.native
  var options: CompilerOptions = js.native
  var projectReferences: js.UndefOr[js.Array[ProjectReference]] = js.native
  var raw: js.UndefOr[js.Any] = js.native
  var typeAcquisition: js.UndefOr[TypeAcquisition] = js.native
  var watchOptions: js.UndefOr[WatchOptions] = js.native
  var wildcardDirectories: js.UndefOr[MapLike[WatchDirectoryFlags]] = js.native
}

object ParsedCommandLine {
  @scala.inline
  def apply(errors: js.Array[Diagnostic], fileNames: js.Array[java.lang.String], options: CompilerOptions): ParsedCommandLine = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], fileNames = fileNames.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedCommandLine]
  }
  @scala.inline
  implicit class ParsedCommandLineOps[Self <: ParsedCommandLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Array[Diagnostic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileNames(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: CompilerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompileOnSave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compileOnSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompileOnSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compileOnSave")(js.undefined)
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
    @scala.inline
    def withRaw(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeAcquisition(value: TypeAcquisition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAcquisition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeAcquisition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAcquisition")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchOptions(value: WatchOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withWildcardDirectories(value: MapLike[WatchDirectoryFlags]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wildcardDirectories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWildcardDirectories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wildcardDirectories")(js.undefined)
        ret
    }
  }
  
}


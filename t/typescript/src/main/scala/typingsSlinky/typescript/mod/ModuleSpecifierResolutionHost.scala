package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleSpecifierResolutionHost extends GetEffectiveTypeRootsHost {
  var fileExists: js.UndefOr[js.Function1[/* path */ java.lang.String, Boolean]] = js.native
  var readFile: js.UndefOr[js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]]] = js.native
  var useCaseSensitiveFileNames: js.UndefOr[js.Function0[Boolean]] = js.native
}

object ModuleSpecifierResolutionHost {
  @scala.inline
  def apply(): ModuleSpecifierResolutionHost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleSpecifierResolutionHost]
  }
  @scala.inline
  implicit class ModuleSpecifierResolutionHostOps[Self <: ModuleSpecifierResolutionHost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileExists(value: /* path */ java.lang.String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExists")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFileExists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExists")(js.undefined)
        ret
    }
    @scala.inline
    def withReadFile(value: /* path */ java.lang.String => js.UndefOr[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReadFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readFile")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCaseSensitiveFileNames(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCaseSensitiveFileNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUseCaseSensitiveFileNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCaseSensitiveFileNames")(js.undefined)
        ret
    }
  }
  
}


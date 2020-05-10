package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEffectiveTypeRootsHost extends js.Object {
  var directoryExists: js.UndefOr[js.Function1[/* directoryName */ java.lang.String, Boolean]] = js.native
  var getCurrentDirectory: js.UndefOr[js.Function0[java.lang.String]] = js.native
}

object GetEffectiveTypeRootsHost {
  @scala.inline
  def apply(): GetEffectiveTypeRootsHost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEffectiveTypeRootsHost]
  }
  @scala.inline
  implicit class GetEffectiveTypeRootsHostOps[Self <: GetEffectiveTypeRootsHost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryExists(value: /* directoryName */ java.lang.String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryExists")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDirectoryExists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryExists")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCurrentDirectory(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentDirectory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCurrentDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentDirectory")(js.undefined)
        ret
    }
  }
  
}


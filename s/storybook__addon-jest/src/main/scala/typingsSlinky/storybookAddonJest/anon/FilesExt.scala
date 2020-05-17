package typingsSlinky.storybookAddonJest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesExt extends js.Object {
  var filesExt: js.UndefOr[String] = js.native
  var results: js.Any = js.native
}

object FilesExt {
  @scala.inline
  def apply(results: js.Any): FilesExt = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesExt]
  }
  @scala.inline
  implicit class FilesExtOps[Self <: FilesExt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResults(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilesExt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesExt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilesExt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesExt")(js.undefined)
        ret
    }
  }
  
}


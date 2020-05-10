package typingsSlinky.targz.mod

import typingsSlinky.node.zlibMod.ZlibOptions
import typingsSlinky.tarFs.mod.ExtractOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait options extends js.Object {
  var dest: String = js.native
  var gz: js.UndefOr[ZlibOptions] = js.native
  var src: String = js.native
  var tar: js.UndefOr[ExtractOptions] = js.native
}

object options {
  @scala.inline
  def apply(dest: String, src: String): options = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[options]
  }
  @scala.inline
  implicit class optionsOps[Self <: options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGz(value: ZlibOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gz")(js.undefined)
        ret
    }
    @scala.inline
    def withTar(value: ExtractOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tar")(js.undefined)
        ret
    }
  }
  
}


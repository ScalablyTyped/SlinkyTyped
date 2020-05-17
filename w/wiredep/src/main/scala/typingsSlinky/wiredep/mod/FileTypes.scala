package typingsSlinky.wiredep.mod

import typingsSlinky.wiredep.anon.Block
import typingsSlinky.wiredep.anon.BlockDetect
import typingsSlinky.wiredep.anon.Detect
import typingsSlinky.wiredep.anon.DetectReplace
import typingsSlinky.wiredep.anon.Replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTypes extends js.Object {
  var fileExtension: Block = js.native
  // defaults:
  var html: Detect = js.native
  var jade: Detect = js.native
  var less: Replace = js.native
  var scss: BlockDetect = js.native
  var styl: DetectReplace = js.native
  var yaml: Detect = js.native
}

object FileTypes {
  @scala.inline
  def apply(
    fileExtension: Block,
    html: Detect,
    jade: Detect,
    less: Replace,
    scss: BlockDetect,
    styl: DetectReplace,
    yaml: Detect
  ): FileTypes = {
    val __obj = js.Dynamic.literal(fileExtension = fileExtension.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], jade = jade.asInstanceOf[js.Any], less = less.asInstanceOf[js.Any], scss = scss.asInstanceOf[js.Any], styl = styl.asInstanceOf[js.Any], yaml = yaml.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTypes]
  }
  @scala.inline
  implicit class FileTypesOps[Self <: FileTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileExtension(value: Block): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: Detect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJade(value: Detect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLess(value: Replace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("less")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScss(value: BlockDetect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyl(value: DetectReplace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYaml(value: Detect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaml")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


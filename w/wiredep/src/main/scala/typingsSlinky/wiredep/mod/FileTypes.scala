package typingsSlinky.wiredep.mod

import typingsSlinky.wiredep.AnonBlock
import typingsSlinky.wiredep.AnonBlockDetect
import typingsSlinky.wiredep.AnonDetect
import typingsSlinky.wiredep.AnonDetectReplace
import typingsSlinky.wiredep.AnonReplace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTypes extends js.Object {
  var fileExtension: AnonBlock = js.native
  // defaults:
  var html: AnonDetect = js.native
  var jade: AnonDetect = js.native
  var less: AnonReplace = js.native
  var scss: AnonBlockDetect = js.native
  var styl: AnonDetectReplace = js.native
  var yaml: AnonDetect = js.native
}

object FileTypes {
  @scala.inline
  def apply(
    fileExtension: AnonBlock,
    html: AnonDetect,
    jade: AnonDetect,
    less: AnonReplace,
    scss: AnonBlockDetect,
    styl: AnonDetectReplace,
    yaml: AnonDetect
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
    def withFileExtension(value: AnonBlock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: AnonDetect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJade(value: AnonDetect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLess(value: AnonReplace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("less")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScss(value: AnonBlockDetect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyl(value: AnonDetectReplace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYaml(value: AnonDetect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaml")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


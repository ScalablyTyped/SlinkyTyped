package typingsSlinky.wiredep.mod

import typingsSlinky.wiredep.AnonBlock
import typingsSlinky.wiredep.AnonBlockDetect
import typingsSlinky.wiredep.AnonDetect
import typingsSlinky.wiredep.AnonDetectReplace
import typingsSlinky.wiredep.AnonReplace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileTypes extends js.Object {
  var fileExtension: AnonBlock
  // defaults:
  var html: AnonDetect
  var jade: AnonDetect
  var less: AnonReplace
  var scss: AnonBlockDetect
  var styl: AnonDetectReplace
  var yaml: AnonDetect
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
}


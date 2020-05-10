package typingsSlinky.serveIndex.mod

import typingsSlinky.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locals extends js.Object {
  var directory: String = js.native
  var displayIcons: Boolean = js.native
  var fileList: js.Array[File] = js.native
  var name: String = js.native
  var path: String = js.native
  var stat: Stats = js.native
  var style: String = js.native
  var viewName: String = js.native
}

object Locals {
  @scala.inline
  def apply(
    directory: String,
    displayIcons: Boolean,
    fileList: js.Array[File],
    name: String,
    path: String,
    stat: Stats,
    style: String,
    viewName: String
  ): Locals = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], displayIcons = displayIcons.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], viewName = viewName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locals]
  }
  @scala.inline
  implicit class LocalsOps[Self <: Locals] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayIcons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileList(value: js.Array[File]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStat(value: Stats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


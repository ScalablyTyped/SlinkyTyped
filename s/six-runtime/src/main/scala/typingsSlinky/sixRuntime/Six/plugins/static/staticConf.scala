package typingsSlinky.sixRuntime.Six.plugins.static

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait staticConf extends js.Object {
  var cacheConf: typingsSlinky.sixRuntime.Six.plugins.static.cacheConf = js.native
  var rootPath: String = js.native
}

object staticConf {
  @scala.inline
  def apply(cacheConf: cacheConf, rootPath: String): staticConf = {
    val __obj = js.Dynamic.literal(cacheConf = cacheConf.asInstanceOf[js.Any], rootPath = rootPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[staticConf]
  }
  @scala.inline
  implicit class staticConfOps[Self <: staticConf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheConf(value: cacheConf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheConf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


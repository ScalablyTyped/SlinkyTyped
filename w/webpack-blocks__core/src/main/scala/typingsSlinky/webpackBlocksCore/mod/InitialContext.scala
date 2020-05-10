package typingsSlinky.webpackBlocksCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitialContext extends js.Object {
  var webpack: js.Any = js.native
  var webpackVersion: String = js.native
}

object InitialContext {
  @scala.inline
  def apply(webpack: js.Any, webpackVersion: String): InitialContext = {
    val __obj = js.Dynamic.literal(webpack = webpack.asInstanceOf[js.Any], webpackVersion = webpackVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialContext]
  }
  @scala.inline
  implicit class InitialContextOps[Self <: InitialContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWebpack(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webpack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebpackVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webpackVersion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


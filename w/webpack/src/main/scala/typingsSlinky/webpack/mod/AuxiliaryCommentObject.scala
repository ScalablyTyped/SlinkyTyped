package typingsSlinky.webpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ P in webpack.webpack.LibraryTarget ]: string} */
@js.native
trait AuxiliaryCommentObject extends js.Object {
  var amd: String = js.native
  var assign: String = js.native
  var commonjs: String = js.native
  var commonjs2: String = js.native
  var global: String = js.native
  var jsonp: String = js.native
  var system: String = js.native
  var `this`: String = js.native
  var umd: String = js.native
  var `var`: String = js.native
  var window: String = js.native
}

object AuxiliaryCommentObject {
  @scala.inline
  def apply(
    amd: String,
    assign: String,
    commonjs: String,
    commonjs2: String,
    global: String,
    jsonp: String,
    system: String,
    `this`: String,
    umd: String,
    `var`: String,
    window: String
  ): AuxiliaryCommentObject = {
    val __obj = js.Dynamic.literal(amd = amd.asInstanceOf[js.Any], assign = assign.asInstanceOf[js.Any], commonjs = commonjs.asInstanceOf[js.Any], commonjs2 = commonjs2.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], jsonp = jsonp.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], umd = umd.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuxiliaryCommentObject]
  }
  @scala.inline
  implicit class AuxiliaryCommentObjectOps[Self <: AuxiliaryCommentObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommonjs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonjs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommonjs2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonjs2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsonp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("this")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUmd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("umd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("var")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


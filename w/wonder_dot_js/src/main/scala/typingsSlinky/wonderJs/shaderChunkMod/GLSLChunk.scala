package typingsSlinky.wonderJs.shaderChunkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GLSLChunk extends js.Object {
  var body: js.UndefOr[String] = js.native
  var define: js.UndefOr[String] = js.native
  var funcDeclare: js.UndefOr[String] = js.native
  var funcDefine: js.UndefOr[String] = js.native
  var top: js.UndefOr[String] = js.native
  var varDeclare: js.UndefOr[String] = js.native
}

object GLSLChunk {
  @scala.inline
  def apply(): GLSLChunk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GLSLChunk]
  }
  @scala.inline
  implicit class GLSLChunkOps[Self <: GLSLChunk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withDefine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("define")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("define")(js.undefined)
        ret
    }
    @scala.inline
    def withFuncDeclare(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funcDeclare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFuncDeclare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funcDeclare")(js.undefined)
        ret
    }
    @scala.inline
    def withFuncDefine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funcDefine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFuncDefine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funcDefine")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withVarDeclare(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varDeclare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVarDeclare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varDeclare")(js.undefined)
        ret
    }
  }
  
}


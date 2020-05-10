package typingsSlinky.vueComponentCompilerUtils.compileStyleMod

import typingsSlinky.postcss.mod.LazyResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleCompileResults extends js.Object {
  var code: String = js.native
  var errors: js.Array[String] = js.native
  var map: js.Any | Unit = js.native
  var rawResult: LazyResult | Unit = js.native
}

object StyleCompileResults {
  @scala.inline
  def apply(code: String, errors: js.Array[String], map: js.Any | Unit, rawResult: LazyResult | Unit): StyleCompileResults = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], rawResult = rawResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleCompileResults]
  }
  @scala.inline
  implicit class StyleCompileResultsOps[Self <: StyleCompileResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMap(value: js.Any | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawResult(value: LazyResult | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawResult")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


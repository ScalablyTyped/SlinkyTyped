package typingsSlinky.webpack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Loc extends js.Object {
  var loc: String = js.native
  var module: String = js.native
  var moduleId: js.UndefOr[String | Double] = js.native
  var moduleIdentifier: String = js.native
  var moduleName: String = js.native
  var reasons: js.Array[String] = js.native
  var request: String = js.native
}

object Loc {
  @scala.inline
  def apply(
    loc: String,
    module: String,
    moduleIdentifier: String,
    moduleName: String,
    reasons: js.Array[String],
    request: String
  ): Loc = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], moduleIdentifier = moduleIdentifier.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any], reasons = reasons.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loc]
  }
  @scala.inline
  implicit class LocOps[Self <: Loc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReasons(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleId(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleId")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.yawnYaml.cjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YAWN extends js.Object {
  var json: js.Any = js.native
  var yaml: String = js.native
  def getRemark(path: String): String = js.native
  def setRemark(path: String, remark: String): Boolean = js.native
}

object YAWN {
  @scala.inline
  def apply(getRemark: String => String, json: js.Any, setRemark: (String, String) => Boolean, yaml: String): YAWN = {
    val __obj = js.Dynamic.literal(getRemark = js.Any.fromFunction1(getRemark), json = json.asInstanceOf[js.Any], setRemark = js.Any.fromFunction2(setRemark), yaml = yaml.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAWN]
  }
  @scala.inline
  implicit class YAWNOps[Self <: YAWN] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetRemark(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRemark")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withJson(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetRemark(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRemark")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withYaml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaml")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


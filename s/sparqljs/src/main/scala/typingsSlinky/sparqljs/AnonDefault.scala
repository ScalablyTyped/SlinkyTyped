package typingsSlinky.sparqljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefault extends js.Object {
  var default: js.Array[String] = js.native
  var named: js.Array[String] = js.native
}

object AnonDefault {
  @scala.inline
  def apply(default: js.Array[String], named: js.Array[String]): AnonDefault = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefault]
  }
  @scala.inline
  implicit class AnonDefaultOps[Self <: AnonDefault] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamed(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("named")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


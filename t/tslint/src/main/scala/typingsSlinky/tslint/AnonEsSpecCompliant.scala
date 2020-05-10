package typingsSlinky.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEsSpecCompliant extends js.Object {
  var esSpecCompliant: Boolean = js.native
  var multiline: String = js.native
  var singleline: String = js.native
}

object AnonEsSpecCompliant {
  @scala.inline
  def apply(esSpecCompliant: Boolean, multiline: String, singleline: String): AnonEsSpecCompliant = {
    val __obj = js.Dynamic.literal(esSpecCompliant = esSpecCompliant.asInstanceOf[js.Any], multiline = multiline.asInstanceOf[js.Any], singleline = singleline.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEsSpecCompliant]
  }
  @scala.inline
  implicit class AnonEsSpecCompliantOps[Self <: AnonEsSpecCompliant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEsSpecCompliant(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("esSpecCompliant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingleline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


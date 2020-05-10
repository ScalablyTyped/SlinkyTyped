package typingsSlinky.yaml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMAP extends js.Object {
  /** Default: `'tag:yaml.org,2002:map'` */
  var MAP: String = js.native
  /** Default: `'tag:yaml.org,2002:seq'` */
  var SEQ: String = js.native
  /** Default: `'tag:yaml.org,2002:str'` */
  var STR: String = js.native
}

object AnonMAP {
  @scala.inline
  def apply(MAP: String, SEQ: String, STR: String): AnonMAP = {
    val __obj = js.Dynamic.literal(MAP = MAP.asInstanceOf[js.Any], SEQ = SEQ.asInstanceOf[js.Any], STR = STR.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMAP]
  }
  @scala.inline
  implicit class AnonMAPOps[Self <: AnonMAP] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMAP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSEQ(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SEQ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.tensorflowTfjsCore.modelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaGraphInfo extends js.Object {
  var signatureDefs: SignatureDefInfo = js.native
  var tags: js.Array[String] = js.native
}

object MetaGraphInfo {
  @scala.inline
  def apply(signatureDefs: SignatureDefInfo, tags: js.Array[String]): MetaGraphInfo = {
    val __obj = js.Dynamic.literal(signatureDefs = signatureDefs.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaGraphInfo]
  }
  @scala.inline
  implicit class MetaGraphInfoOps[Self <: MetaGraphInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSignatureDefs(value: SignatureDefInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureDefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


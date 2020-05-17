package typingsSlinky.uuid1345.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UUID extends UuidTypes {
  var variant: String = js.native
  var version: String = js.native
  def toBuffer(): Buffer = js.native
}

object UUID {
  @scala.inline
  def apply(toBuffer: () => Buffer, variant: String, version: String): UUID = {
    val __obj = js.Dynamic.literal(toBuffer = js.Any.fromFunction0(toBuffer), variant = variant.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UUID]
  }
  @scala.inline
  implicit class UUIDOps[Self <: UUID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToBuffer(value: () => Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBuffer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVariant(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


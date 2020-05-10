package typingsSlinky.wif.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WIFReturn extends js.Object {
  val compressed: Boolean = js.native
  val privateKey: Buffer = js.native
  val version: Double = js.native
}

object WIFReturn {
  @scala.inline
  def apply(compressed: Boolean, privateKey: Buffer, version: Double): WIFReturn = {
    val __obj = js.Dynamic.literal(compressed = compressed.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WIFReturn]
  }
  @scala.inline
  implicit class WIFReturnOps[Self <: WIFReturn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompressed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateKey(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


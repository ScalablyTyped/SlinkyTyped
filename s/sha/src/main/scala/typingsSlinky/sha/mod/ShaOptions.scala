package typingsSlinky.sha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShaOptions extends js.Object {
  /** defaults to `sha1` and can be any of the algorithms supported by `crypto.createHash` */
  var algorithm: js.UndefOr[String] = js.native
}

object ShaOptions {
  @scala.inline
  def apply(): ShaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShaOptions]
  }
  @scala.inline
  implicit class ShaOptionsOps[Self <: ShaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(js.undefined)
        ret
    }
  }
  
}


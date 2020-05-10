package typingsSlinky.stellarBase.mod.SignerOptions

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sha256Hash extends js.Object {
  var sha256Hash: Buffer | String = js.native
  var weight: js.UndefOr[Double | String] = js.native
}

object Sha256Hash {
  @scala.inline
  def apply(sha256Hash: Buffer | String): Sha256Hash = {
    val __obj = js.Dynamic.literal(sha256Hash = sha256Hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sha256Hash]
  }
  @scala.inline
  implicit class Sha256HashOps[Self <: Sha256Hash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSha256Hash(value: Buffer | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256Hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
  }
  
}


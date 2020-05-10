package typingsSlinky.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHashDigest extends js.Object {
  var hashDigest: js.UndefOr[String] = js.native
  var hashDigestLength: js.UndefOr[Double] = js.native
  var hashFunction: js.UndefOr[String] = js.native
}

object AnonHashDigest {
  @scala.inline
  def apply(): AnonHashDigest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonHashDigest]
  }
  @scala.inline
  implicit class AnonHashDigestOps[Self <: AnonHashDigest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHashDigest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashDigest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashDigest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashDigest")(js.undefined)
        ret
    }
    @scala.inline
    def withHashDigestLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashDigestLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashDigestLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashDigestLength")(js.undefined)
        ret
    }
    @scala.inline
    def withHashFunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashFunction")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlobPropertyBag extends js.Object {
  var endings: js.UndefOr[EndingType] = js.native
  var `type`: js.UndefOr[java.lang.String] = js.native
}

object BlobPropertyBag {
  @scala.inline
  def apply(): BlobPropertyBag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlobPropertyBag]
  }
  @scala.inline
  implicit class BlobPropertyBagOps[Self <: org.scalajs.dom.raw.BlobPropertyBag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndings(value: EndingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endings")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.webpack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentHash extends js.Object {
  var contentHash: js.Any = js.native
  var hash: js.Any = js.native
  var name: js.Any = js.native
}

object ContentHash {
  @scala.inline
  def apply(contentHash: js.Any, hash: js.Any, name: js.Any): ContentHash = {
    val __obj = js.Dynamic.literal(contentHash = contentHash.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentHash]
  }
  @scala.inline
  implicit class ContentHashOps[Self <: ContentHash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentHash(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHash(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


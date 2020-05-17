package typingsSlinky.yamlFrontMatter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentKeyName[contentKeyName /* <: String */] extends js.Object {
  var contentKeyName: contentKeyName = js.native
}

object ContentKeyName {
  @scala.inline
  def apply[contentKeyName](contentKeyName: contentKeyName): ContentKeyName[contentKeyName] = {
    val __obj = js.Dynamic.literal(contentKeyName = contentKeyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentKeyName[contentKeyName]]
  }
  @scala.inline
  implicit class ContentKeyNameOps[Self[contentkeyname] <: ContentKeyName[contentkeyname], contentKeyName] (val x: Self[contentKeyName]) extends AnyVal {
    @scala.inline
    def duplicate: Self[contentKeyName] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[contentKeyName]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[contentKeyName] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[contentKeyName] with Other]
    @scala.inline
    def withContentKeyName(value: contentKeyName): Self[contentKeyName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentKeyName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


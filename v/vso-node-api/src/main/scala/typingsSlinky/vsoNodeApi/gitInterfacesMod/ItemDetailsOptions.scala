package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemDetailsOptions extends js.Object {
  /**
    * If true, include metadata about the file type
    */
  var includeContentMetadata: Boolean = js.native
  /**
    * Specifies whether to include children (OneLevel), all descendants (Full) or None for folder items
    */
  var recursionLevel: VersionControlRecursionType = js.native
}

object ItemDetailsOptions {
  @scala.inline
  def apply(includeContentMetadata: Boolean, recursionLevel: VersionControlRecursionType): ItemDetailsOptions = {
    val __obj = js.Dynamic.literal(includeContentMetadata = includeContentMetadata.asInstanceOf[js.Any], recursionLevel = recursionLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemDetailsOptions]
  }
  @scala.inline
  implicit class ItemDetailsOptionsOps[Self <: ItemDetailsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeContentMetadata(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeContentMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecursionLevel(value: VersionControlRecursionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursionLevel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


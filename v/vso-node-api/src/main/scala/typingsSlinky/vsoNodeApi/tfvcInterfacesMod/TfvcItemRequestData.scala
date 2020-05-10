package typingsSlinky.vsoNodeApi.tfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfvcItemRequestData extends js.Object {
  /**
    * If true, include metadata about the file type
    */
  var includeContentMetadata: Boolean = js.native
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean = js.native
  var itemDescriptors: js.Array[TfvcItemDescriptor] = js.native
}

object TfvcItemRequestData {
  @scala.inline
  def apply(
    includeContentMetadata: Boolean,
    includeLinks: Boolean,
    itemDescriptors: js.Array[TfvcItemDescriptor]
  ): TfvcItemRequestData = {
    val __obj = js.Dynamic.literal(includeContentMetadata = includeContentMetadata.asInstanceOf[js.Any], includeLinks = includeLinks.asInstanceOf[js.Any], itemDescriptors = itemDescriptors.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcItemRequestData]
  }
  @scala.inline
  implicit class TfvcItemRequestDataOps[Self <: TfvcItemRequestData] (val x: Self) extends AnyVal {
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
    def withIncludeLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemDescriptors(value: js.Array[TfvcItemDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDescriptors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


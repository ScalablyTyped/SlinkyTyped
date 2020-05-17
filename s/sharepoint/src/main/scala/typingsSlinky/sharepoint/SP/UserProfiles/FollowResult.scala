package typingsSlinky.sharepoint.SP.UserProfiles

import typingsSlinky.sharepoint.SP.ClientValueObject
import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returns information about a request to follow an item. */
@js.native
trait FollowResult extends ClientValueObject {
  /** Contains the item being followed. */
  def get_item(): FollowedItem = js.native
  /** Provides information about the attempt to follow an item. */
  def get_resultType(): FollowResultType = js.native
}

object FollowResult {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_item: () => FollowedItem,
    get_resultType: () => FollowResultType,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): FollowResult = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_item = js.Any.fromFunction0(get_item), get_resultType = js.Any.fromFunction0(get_resultType), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[FollowResult]
  }
  @scala.inline
  implicit class FollowResultOps[Self <: FollowResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_item(value: () => FollowedItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_item")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_resultType(value: () => FollowResultType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_resultType")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}


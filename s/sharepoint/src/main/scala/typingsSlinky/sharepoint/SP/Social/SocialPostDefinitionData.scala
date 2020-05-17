package typingsSlinky.sharepoint.SP.Social

import typingsSlinky.sharepoint.SP.ClientValueObject
import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides additional information about server-generated posts.
  This type can only be specified in a server-to-server call. */
@js.native
trait SocialPostDefinitionData extends ClientValueObject {
  def get_items(): js.Array[SocialPostDefinitionDataItem] = js.native
  def get_name(): String = js.native
  def set_items(value: js.Array[SocialPostDefinitionDataItem]): js.Array[SocialPostDefinitionDataItem] = js.native
  def set_name(value: String): String = js.native
}

object SocialPostDefinitionData {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_items: () => js.Array[SocialPostDefinitionDataItem],
    get_name: () => String,
    get_typeId: () => String,
    set_items: js.Array[SocialPostDefinitionDataItem] => js.Array[SocialPostDefinitionDataItem],
    set_name: String => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): SocialPostDefinitionData = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_items = js.Any.fromFunction0(get_items), get_name = js.Any.fromFunction0(get_name), get_typeId = js.Any.fromFunction0(get_typeId), set_items = js.Any.fromFunction1(set_items), set_name = js.Any.fromFunction1(set_name), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[SocialPostDefinitionData]
  }
  @scala.inline
  implicit class SocialPostDefinitionDataOps[Self <: SocialPostDefinitionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_items(value: () => js.Array[SocialPostDefinitionDataItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_items")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_name(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_name")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet_items(value: js.Array[SocialPostDefinitionDataItem] => js.Array[SocialPostDefinitionDataItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_items")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_name(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_name")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


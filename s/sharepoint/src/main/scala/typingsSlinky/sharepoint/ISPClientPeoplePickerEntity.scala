package typingsSlinky.sharepoint

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sharepoint.anon.Department
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait ISPClientPeoplePickerEntity
  extends /* name */ StringDictionary[js.Any] {
  var Description: js.UndefOr[String] = js.native
  var DisplayText: js.UndefOr[String] = js.native
  var DomainText: js.UndefOr[String] = js.native
  var EntityData: js.UndefOr[Department] = js.native
  var EntityType: js.UndefOr[String] = js.native
  var IsResolved: js.UndefOr[Boolean] = js.native
  var Key: js.UndefOr[String] = js.native
  var MultipleMatches: js.Array[ISPClientPeoplePickerEntity] = js.native
  var ProviderDisplayName: js.UndefOr[String] = js.native
  var ProviderName: js.UndefOr[String] = js.native
}

object ISPClientPeoplePickerEntity {
  @scala.inline
  def apply(MultipleMatches: js.Array[ISPClientPeoplePickerEntity]): ISPClientPeoplePickerEntity = {
    val __obj = js.Dynamic.literal(MultipleMatches = MultipleMatches.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISPClientPeoplePickerEntity]
  }
  @scala.inline
  implicit class ISPClientPeoplePickerEntityOps[Self <: ISPClientPeoplePickerEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultipleMatches(value: js.Array[ISPClientPeoplePickerEntity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultipleMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayText")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainText")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityData(value: Department): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityData")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityType")(js.undefined)
        ret
    }
    @scala.inline
    def withIsResolved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsResolved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResolved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsResolved")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderName")(js.undefined)
        ret
    }
  }
  
}


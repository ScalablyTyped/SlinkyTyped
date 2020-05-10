package typingsSlinky.vsoNodeApi.serializationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContractFieldMetadata extends js.Object {
  var dictionaryKeyEnumType: js.UndefOr[ContractEnumMetadata] = js.native
  var dictionaryKeyIsDate: js.UndefOr[Boolean] = js.native
  var dictionaryValueEnumType: js.UndefOr[ContractEnumMetadata] = js.native
  var dictionaryValueFieldInfo: js.UndefOr[ContractFieldMetadata] = js.native
  var dictionaryValueIsDate: js.UndefOr[Boolean] = js.native
  var dictionaryValueTypeInfo: js.UndefOr[ContractMetadata] = js.native
  var enumType: js.UndefOr[ContractEnumMetadata] = js.native
  var isArray: js.UndefOr[Boolean] = js.native
  var isDate: js.UndefOr[Boolean] = js.native
  var isDictionary: js.UndefOr[Boolean] = js.native
  var typeInfo: js.UndefOr[ContractMetadata] = js.native
}

object ContractFieldMetadata {
  @scala.inline
  def apply(): ContractFieldMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractFieldMetadata]
  }
  @scala.inline
  implicit class ContractFieldMetadataOps[Self <: ContractFieldMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDictionaryKeyEnumType(value: ContractEnumMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionaryKeyEnumType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictionaryKeyEnumType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionaryKeyEnumType")(js.undefined)
        ret
    }
    @scala.inline
    def withDictionaryKeyIsDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionaryKeyIsDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictionaryKeyIsDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionaryKeyIsDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDictionaryValueEnumType(value: ContractEnumMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionaryValueEnumType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictionaryValueEnumType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionaryValueEnumType")(js.undefined)
        ret
    }
    @scala.inline
    def withDictionaryValueFieldInfo(value: ContractFieldMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionaryValueFieldInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictionaryValueFieldInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionaryValueFieldInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withDictionaryValueIsDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionaryValueIsDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictionaryValueIsDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionaryValueIsDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDictionaryValueTypeInfo(value: ContractMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionaryValueTypeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictionaryValueTypeInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionaryValueTypeInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withEnumType(value: ContractEnumMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnumType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumType")(js.undefined)
        ret
    }
    @scala.inline
    def withIsArray(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isArray")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDate")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDictionary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDictionary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDictionary")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeInfo(value: ContractMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeInfo")(js.undefined)
        ret
    }
  }
  
}


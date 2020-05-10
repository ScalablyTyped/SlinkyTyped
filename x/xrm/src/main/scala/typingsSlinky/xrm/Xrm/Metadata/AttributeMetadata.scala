package typingsSlinky.xrm.Xrm.Metadata

import typingsSlinky.xrm.XrmEnum.AttributeTypeCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type to hold the Attribute metadata as part of the EntityMetadata
  */
@js.native
trait AttributeMetadata extends js.Object {
  var attributeType: AttributeTypeCode = js.native
  var defaultFormValue: Double = js.native
  var displayName: String = js.native
  var entityLogicalName: String = js.native
  var logicalName: String = js.native
  /**
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var optionSet: js.Array[OptionMetadata] = js.native
  /**
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var options: js.Array[String] = js.native
}

object AttributeMetadata {
  @scala.inline
  def apply(
    attributeType: AttributeTypeCode,
    defaultFormValue: Double,
    displayName: String,
    entityLogicalName: String,
    logicalName: String,
    optionSet: js.Array[OptionMetadata],
    options: js.Array[String]
  ): AttributeMetadata = {
    val __obj = js.Dynamic.literal(attributeType = attributeType.asInstanceOf[js.Any], defaultFormValue = defaultFormValue.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], entityLogicalName = entityLogicalName.asInstanceOf[js.Any], logicalName = logicalName.asInstanceOf[js.Any], optionSet = optionSet.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeMetadata]
  }
  @scala.inline
  implicit class AttributeMetadataOps[Self <: AttributeMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeType(value: AttributeTypeCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultFormValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFormValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityLogicalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityLogicalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogicalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logicalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionSet(value: js.Array[OptionMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldInfo extends js.Object {
  /**
    * The additional field display name
    */
  var displayName: String = js.native
  /**
    * The additional field type
    */
  var fieldType: FieldType = js.native
  /**
    * Indicates if the field definition is for an identity field.
    */
  var isIdentity: Boolean = js.native
  /**
    * The additional field reference name
    */
  var referenceName: String = js.native
}

object FieldInfo {
  @scala.inline
  def apply(displayName: String, fieldType: FieldType, isIdentity: Boolean, referenceName: String): FieldInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], fieldType = fieldType.asInstanceOf[js.Any], isIdentity = isIdentity.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldInfo]
  }
  @scala.inline
  implicit class FieldInfoOps[Self <: FieldInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldType(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsIdentity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferenceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BacklogFields extends js.Object {
  /**
    * Field Type (e.g. Order, Activity) to Field Reference Name map
    */
  var typeFields: StringDictionary[String] = js.native
}

object BacklogFields {
  @scala.inline
  def apply(typeFields: StringDictionary[String]): BacklogFields = {
    val __obj = js.Dynamic.literal(typeFields = typeFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[BacklogFields]
  }
  @scala.inline
  implicit class BacklogFieldsOps[Self <: BacklogFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypeFields(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeFields")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


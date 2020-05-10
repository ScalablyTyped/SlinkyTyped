package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefinitionNameAscending extends js.Object {
  var definitionNameAscending: Double = js.native
  var definitionNameDescending: Double = js.native
  var lastModifiedAscending: Double = js.native
  var lastModifiedDescending: Double = js.native
  var none: Double = js.native
}

object AnonDefinitionNameAscending {
  @scala.inline
  def apply(
    definitionNameAscending: Double,
    definitionNameDescending: Double,
    lastModifiedAscending: Double,
    lastModifiedDescending: Double,
    none: Double
  ): AnonDefinitionNameAscending = {
    val __obj = js.Dynamic.literal(definitionNameAscending = definitionNameAscending.asInstanceOf[js.Any], definitionNameDescending = definitionNameDescending.asInstanceOf[js.Any], lastModifiedAscending = lastModifiedAscending.asInstanceOf[js.Any], lastModifiedDescending = lastModifiedDescending.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefinitionNameAscending]
  }
  @scala.inline
  implicit class AnonDefinitionNameAscendingOps[Self <: AnonDefinitionNameAscending] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefinitionNameAscending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionNameAscending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinitionNameDescending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionNameDescending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedAscending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedAscending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedDescending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDescending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefinitionNameAscending extends js.Object {
  var definitionNameAscending: scala.Double = js.native
  var definitionNameDescending: scala.Double = js.native
  var lastModifiedAscending: scala.Double = js.native
  var lastModifiedDescending: scala.Double = js.native
  var none: scala.Double = js.native
}

object DefinitionNameAscending {
  @scala.inline
  def apply(
    definitionNameAscending: scala.Double,
    definitionNameDescending: scala.Double,
    lastModifiedAscending: scala.Double,
    lastModifiedDescending: scala.Double,
    none: scala.Double
  ): DefinitionNameAscending = {
    val __obj = js.Dynamic.literal(definitionNameAscending = definitionNameAscending.asInstanceOf[js.Any], definitionNameDescending = definitionNameDescending.asInstanceOf[js.Any], lastModifiedAscending = lastModifiedAscending.asInstanceOf[js.Any], lastModifiedDescending = lastModifiedDescending.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNameAscending]
  }
  @scala.inline
  implicit class DefinitionNameAscendingOps[Self <: DefinitionNameAscending] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefinitionNameAscending(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionNameAscending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinitionNameDescending(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionNameDescending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedAscending(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedAscending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedDescending(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDescending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


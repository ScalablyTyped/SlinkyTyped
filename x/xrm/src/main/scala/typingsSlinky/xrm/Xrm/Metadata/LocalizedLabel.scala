package typingsSlinky.xrm.Xrm.Metadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type to hold a Label as part of the EntityMetadata
  */
@js.native
trait LocalizedLabel extends js.Object {
  var Label: String = js.native
  var LanguageCode: Double = js.native
}

object LocalizedLabel {
  @scala.inline
  def apply(Label: String, LanguageCode: Double): LocalizedLabel = {
    val __obj = js.Dynamic.literal(Label = Label.asInstanceOf[js.Any], LanguageCode = LanguageCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizedLabel]
  }
  @scala.inline
  implicit class LocalizedLabelOps[Self <: LocalizedLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguageCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


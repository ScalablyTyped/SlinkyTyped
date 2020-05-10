package typingsSlinky.watsonDeveloperCloud.v3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Translation. */
@js.native
trait Translation extends js.Object {
  /** Translation output in UTF-8. */
  var translation_output: String = js.native
}

object Translation {
  @scala.inline
  def apply(translation_output: String): Translation = {
    val __obj = js.Dynamic.literal(translation_output = translation_output.asInstanceOf[js.Any])
    __obj.asInstanceOf[Translation]
  }
  @scala.inline
  implicit class TranslationOps[Self <: Translation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTranslation_output(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translation_output")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


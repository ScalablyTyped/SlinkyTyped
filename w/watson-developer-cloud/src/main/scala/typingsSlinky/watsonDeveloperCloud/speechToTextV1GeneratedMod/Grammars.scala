package typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Grammars. */
@js.native
trait Grammars extends js.Object {
  /** An array of `Grammar` objects that provides information about the grammars for the custom model. The array is empty if the custom model has no grammars. */
  var grammars: js.Array[Grammar] = js.native
}

object Grammars {
  @scala.inline
  def apply(grammars: js.Array[Grammar]): Grammars = {
    val __obj = js.Dynamic.literal(grammars = grammars.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grammars]
  }
  @scala.inline
  implicit class GrammarsOps[Self <: Grammars] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrammars(value: js.Array[Grammar]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grammars")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.tern.ternMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertiesQueryResult extends js.Object {
  /** The property names. */
  var completions: js.Array[String] = js.native
}

object PropertiesQueryResult {
  @scala.inline
  def apply(completions: js.Array[String]): PropertiesQueryResult = {
    val __obj = js.Dynamic.literal(completions = completions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesQueryResult]
  }
  @scala.inline
  implicit class PropertiesQueryResultOps[Self <: PropertiesQueryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


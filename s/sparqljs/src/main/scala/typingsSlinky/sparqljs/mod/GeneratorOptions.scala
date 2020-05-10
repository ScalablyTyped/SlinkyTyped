package typingsSlinky.sparqljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneratorOptions extends js.Object {
  var allPrefixes: js.UndefOr[Boolean] = js.native
}

object GeneratorOptions {
  @scala.inline
  def apply(): GeneratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratorOptions]
  }
  @scala.inline
  implicit class GeneratorOptionsOps[Self <: GeneratorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllPrefixes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allPrefixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllPrefixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allPrefixes")(js.undefined)
        ret
    }
  }
  
}


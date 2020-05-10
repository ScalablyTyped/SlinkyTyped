package typingsSlinky.sparqljs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBaseIRI extends js.Object {
  var baseIRI: js.UndefOr[String] = js.native
  var prefixes: js.UndefOr[StringDictionary[String]] = js.native
}

object AnonBaseIRI {
  @scala.inline
  def apply(): AnonBaseIRI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBaseIRI]
  }
  @scala.inline
  implicit class AnonBaseIRIOps[Self <: AnonBaseIRI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseIRI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseIRI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseIRI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseIRI")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixes(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixes")(js.undefined)
        ret
    }
  }
  
}


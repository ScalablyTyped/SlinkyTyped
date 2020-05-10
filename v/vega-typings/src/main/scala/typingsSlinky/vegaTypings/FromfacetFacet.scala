package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.markMod.Facet
import typingsSlinky.vegaTypings.markMod.FromFacet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vega-typings.vega-typings/types/spec/mark.From & {  facet  :vega-typings.vega-typings/types/spec/mark.Facet} */
@js.native
trait FromfacetFacet extends FromFacet {
  var data: js.UndefOr[String] = js.native
  var facet: Facet = js.native
}

object FromfacetFacet {
  @scala.inline
  def apply(facet: Facet): FromfacetFacet = {
    val __obj = js.Dynamic.literal(facet = facet.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromfacetFacet]
  }
  @scala.inline
  implicit class FromfacetFacetOps[Self <: FromfacetFacet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFacet(value: Facet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
  }
  
}


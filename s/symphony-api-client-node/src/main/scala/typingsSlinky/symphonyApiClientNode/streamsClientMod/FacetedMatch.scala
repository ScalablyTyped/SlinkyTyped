package typingsSlinky.symphonyApiClientNode.streamsClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FacetedMatch extends js.Object {
  
  var count: Double = js.native
  
  var facet: String = js.native
}
object FacetedMatch {
  
  @scala.inline
  def apply(count: Double, facet: String): FacetedMatch = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], facet = facet.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetedMatch]
  }
  
  @scala.inline
  implicit class FacetedMatchOps[Self <: FacetedMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacet(value: String): Self = this.set("facet", value.asInstanceOf[js.Any])
  }
}

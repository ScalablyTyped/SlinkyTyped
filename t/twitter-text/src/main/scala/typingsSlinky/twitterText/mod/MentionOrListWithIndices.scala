package typingsSlinky.twitterText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MentionOrListWithIndices extends EntityWithIndices {
  
  var indices: js.Tuple2[Double, Double] = js.native
  
  var listSlug: String = js.native
  
  var screenName: String = js.native
}
object MentionOrListWithIndices {
  
  @scala.inline
  def apply(indices: js.Tuple2[Double, Double], listSlug: String, screenName: String): MentionOrListWithIndices = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], listSlug = listSlug.asInstanceOf[js.Any], screenName = screenName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MentionOrListWithIndices]
  }
  
  @scala.inline
  implicit class MentionOrListWithIndicesOps[Self <: MentionOrListWithIndices] (val x: Self) extends AnyVal {
    
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
    def setIndices(value: js.Tuple2[Double, Double]): Self = this.set("indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListSlug(value: String): Self = this.set("listSlug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenName(value: String): Self = this.set("screenName", value.asInstanceOf[js.Any])
  }
}

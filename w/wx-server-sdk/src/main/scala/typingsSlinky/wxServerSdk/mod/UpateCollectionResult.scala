package typingsSlinky.wxServerSdk.mod

import typingsSlinky.wxServerSdk.anon.Updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpateCollectionResult extends StObject {
  
  var stats: Updated = js.native
}
object UpateCollectionResult {
  
  @scala.inline
  def apply(stats: Updated): UpateCollectionResult = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpateCollectionResult]
  }
  
  @scala.inline
  implicit class UpateCollectionResultMutableBuilder[Self <: UpateCollectionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStats(value: Updated): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}

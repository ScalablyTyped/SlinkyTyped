package typingsSlinky.storybookApi.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Headline extends StObject {
  
  var headline: String = js.native
  
  var subHeadline: js.UndefOr[String | ReactElement] = js.native
}
object Headline {
  
  @scala.inline
  def apply(headline: String): Headline = {
    val __obj = js.Dynamic.literal(headline = headline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headline]
  }
  
  @scala.inline
  implicit class HeadlineMutableBuilder[Self <: Headline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeadline(value: String): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubHeadline(value: String | ReactElement): Self = StObject.set(x, "subHeadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubHeadlineReactElement(value: ReactElement): Self = StObject.set(x, "subHeadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubHeadlineUndefined: Self = StObject.set(x, "subHeadline", js.undefined)
  }
}

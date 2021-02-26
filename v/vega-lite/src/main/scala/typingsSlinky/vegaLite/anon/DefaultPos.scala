package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaLite.vegaLiteStrings.mid
import typingsSlinky.vegaLite.vegaLiteStrings.x
import typingsSlinky.vegaLite.vegaLiteStrings.xc
import typingsSlinky.vegaLite.vegaLiteStrings.y
import typingsSlinky.vegaLite.vegaLiteStrings.yc
import typingsSlinky.vegaLite.vegaLiteStrings.zeroOrMax
import typingsSlinky.vegaLite.vegaLiteStrings.zeroOrMin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultPos extends StObject {
  
  var defaultPos: mid | zeroOrMin | zeroOrMax | Null = js.native
  
  var isMidPoint: js.UndefOr[Boolean] = js.native
  
  var vgChannel: js.UndefOr[x | y | xc | yc] = js.native
}
object DefaultPos {
  
  @scala.inline
  def apply(): DefaultPos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultPos]
  }
  
  @scala.inline
  implicit class DefaultPosMutableBuilder[Self <: DefaultPos] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultPos(value: mid | zeroOrMin | zeroOrMax): Self = StObject.set(x, "defaultPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPosNull: Self = StObject.set(x, "defaultPos", null)
    
    @scala.inline
    def setIsMidPoint(value: Boolean): Self = StObject.set(x, "isMidPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMidPointUndefined: Self = StObject.set(x, "isMidPoint", js.undefined)
    
    @scala.inline
    def setVgChannel(value: typingsSlinky.vegaLite.vegaLiteStrings.x | y | xc | yc): Self = StObject.set(x, "vgChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVgChannelUndefined: Self = StObject.set(x, "vgChannel", js.undefined)
  }
}

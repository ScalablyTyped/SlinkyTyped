package typingsSlinky.wordpressBlocks.anon

import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.BLOCKS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0` extends StObject {
  
  var mode: BLOCKS = js.native
}
object `0` {
  
  @scala.inline
  def apply(mode: BLOCKS): `0` = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: BLOCKS): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaLite.specBaseMod.LayoutSizeMixins
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Size extends StObject {
  
  var encoding: typingsSlinky.vegaLite.encodingMod.Encoding[String] = js.native
  
  var size: LayoutSizeMixins = js.native
}
object Size {
  
  @scala.inline
  def apply(encoding: typingsSlinky.vegaLite.encodingMod.Encoding[String], size: LayoutSizeMixins): Size = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  
  @scala.inline
  implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: typingsSlinky.vegaLite.encodingMod.Encoding[String]): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: LayoutSizeMixins): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.dataMod._Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parse extends _Format {
  
  var parse: typingsSlinky.vegaTypings.dataMod.Parse = js.native
}
object Parse {
  
  @scala.inline
  def apply(parse: typingsSlinky.vegaTypings.dataMod.Parse): Parse = {
    val __obj = js.Dynamic.literal(parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parse]
  }
  
  @scala.inline
  implicit class ParseMutableBuilder[Self <: Parse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParse(value: typingsSlinky.vegaTypings.dataMod.Parse): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.tuyaPanelKit.anon

import typingsSlinky.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `11`[EventName /* <: Extract[/* keyof {} */ String, String] */] extends StObject {
  
  var data: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['data'] */ js.Any
  ] = js.native
}
object `11` {
  
  @scala.inline
  def apply[EventName /* <: Extract[/* keyof {} */ String, String] */](): `11`[EventName] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`11`[EventName]]
  }
  
  @scala.inline
  implicit class `11MutableBuilder`[Self <: `11`[_], EventName /* <: Extract[/* keyof {} */ String, String] */] (val x: Self with `11`[EventName]) extends AnyVal {
    
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['data'] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}

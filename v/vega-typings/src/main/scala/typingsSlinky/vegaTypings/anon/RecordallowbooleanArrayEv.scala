package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.configMod.DefaultsConfig
import typingsSlinky.vegaTypings.streamMod.EventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'allow', boolean | std.Array<vega-typings.vega-typings/types/spec.EventType>> */
@js.native
trait RecordallowbooleanArrayEv extends DefaultsConfig {
  
  var allow: Boolean | js.Array[EventType] = js.native
}
object RecordallowbooleanArrayEv {
  
  @scala.inline
  def apply(allow: Boolean | js.Array[EventType]): RecordallowbooleanArrayEv = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordallowbooleanArrayEv]
  }
  
  @scala.inline
  implicit class RecordallowbooleanArrayEvMutableBuilder[Self <: RecordallowbooleanArrayEv] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow(value: Boolean | js.Array[EventType]): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowVarargs(value: EventType*): Self = StObject.set(x, "allow", js.Array(value :_*))
  }
}

package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.vegaTypingsStrings.nest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NestTransform extends _Transforms {
  
  var generate: js.UndefOr[Boolean | SignalRef] = js.native
  
  var keys: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.native
  
  var `type`: nest = js.native
}
object NestTransform {
  
  @scala.inline
  def apply(`type`: nest): NestTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestTransform]
  }
  
  @scala.inline
  implicit class NestTransformMutableBuilder[Self <: NestTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGenerate(value: Boolean | SignalRef): Self = StObject.set(x, "generate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateUndefined: Self = StObject.set(x, "generate", js.undefined)
    
    @scala.inline
    def setKeys(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: FieldRef*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    @scala.inline
    def setType(value: nest): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

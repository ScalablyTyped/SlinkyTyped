package typingsSlinky.shapefile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Done[RecordType] extends StObject {
    
    var done: Boolean = js.native
    
    var value: RecordType = js.native
  }
  object Done {
    
    @scala.inline
    def apply[RecordType](done: Boolean, value: RecordType): Done[RecordType] = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done[RecordType]]
    }
    
    @scala.inline
    implicit class DoneMutableBuilder[Self <: Done[_], RecordType] (val x: Self with Done[RecordType]) extends AnyVal {
      
      @scala.inline
      def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: RecordType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

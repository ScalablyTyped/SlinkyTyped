package typingsSlinky.yarnpkgLockfile

import typingsSlinky.yarnpkgLockfile.yarnpkgLockfileStrings.conflict
import typingsSlinky.yarnpkgLockfile.yarnpkgLockfileStrings.merge
import typingsSlinky.yarnpkgLockfile.yarnpkgLockfileStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Object extends StObject {
    
    var `object`: js.Any = js.native
    
    var `type`: success | merge | conflict = js.native
  }
  object Object {
    
    @scala.inline
    def apply(`object`: js.Any, `type`: success | merge | conflict): Object = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Object]
    }
    
    @scala.inline
    implicit class ObjectMutableBuilder[Self <: Object] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObject(value: js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: success | merge | conflict): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

package typingsSlinky.webpackBlocksCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Test extends StObject {
    
    var test: js.RegExp | js.Array[js.RegExp] = js.native
  }
  object Test {
    
    @scala.inline
    def apply(test: js.RegExp | js.Array[js.RegExp]): Test = {
      val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[Test]
    }
    
    @scala.inline
    implicit class TestMutableBuilder[Self <: Test] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTest(value: js.RegExp | js.Array[js.RegExp]): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestRegExp(value: js.RegExp): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestVarargs(value: js.RegExp*): Self = StObject.set(x, "test", js.Array(value :_*))
    }
  }
}

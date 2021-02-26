package typingsSlinky.vegaExpression

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Code extends StObject {
    
    /** The generated code as a string */
    var code: String = js.native
    
    /** A hash of all properties referenced within the _fieldvar_ scope */
    var fields: js.Array[String] = js.native
    
    /** A hash of all properties referenced outside a provided allowed list */
    var globals: js.Array[String] = js.native
  }
  object Code {
    
    @scala.inline
    def apply(code: String, fields: js.Array[String], globals: js.Array[String]): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      @scala.inline
      def setGlobals(value: js.Array[String]): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalsVarargs(value: String*): Self = StObject.set(x, "globals", js.Array(value :_*))
    }
  }
}

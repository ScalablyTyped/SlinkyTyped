package typingsSlinky.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsJoinColumnOptionsMod {
  
  @js.native
  trait JoinColumnOptions extends StObject {
    
    /**
      * Name of the column.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Name of the column in the entity to which this column is referenced.
      */
    var referencedColumnName: js.UndefOr[String] = js.native
  }
  object JoinColumnOptions {
    
    @scala.inline
    def apply(): JoinColumnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JoinColumnOptions]
    }
    
    @scala.inline
    implicit class JoinColumnOptionsMutableBuilder[Self <: JoinColumnOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setReferencedColumnName(value: String): Self = StObject.set(x, "referencedColumnName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferencedColumnNameUndefined: Self = StObject.set(x, "referencedColumnName", js.undefined)
    }
  }
}

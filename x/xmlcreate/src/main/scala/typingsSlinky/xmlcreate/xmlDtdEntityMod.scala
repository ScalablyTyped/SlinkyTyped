package typingsSlinky.xmlcreate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlDtdEntityMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlDtdEntity", JSImport.Default)
  @js.native
  class default[Parent] protected () extends XmlDtdEntity[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdEntityOptions) = this()
  }
  
  @js.native
  trait IXmlDtdEntityOptions extends StObject {
    
    /**
      * The text of the declaration.
      */
    var charData: String = js.native
  }
  object IXmlDtdEntityOptions {
    
    @scala.inline
    def apply(charData: String): IXmlDtdEntityOptions = {
      val __obj = js.Dynamic.literal(charData = charData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IXmlDtdEntityOptions]
    }
    
    @scala.inline
    implicit class IXmlDtdEntityOptionsMutableBuilder[Self <: IXmlDtdEntityOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharData(value: String): Self = StObject.set(x, "charData", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XmlDtdEntity[Parent] extends StObject {
    
    var _charData: js.Any = js.native
    
    val _parent: js.Any = js.native
    
    val _validation: js.Any = js.native
    
    /**
      * Gets the text of this entity declaration.
      */
    def charData: String = js.native
    /**
      * Sets the text of this entity declaration.
      */
    def charData_=(charData: String): Unit = js.native
    
    /**
      * Returns the parent of this entity declaration.
      */
    def up(): Parent = js.native
  }
}

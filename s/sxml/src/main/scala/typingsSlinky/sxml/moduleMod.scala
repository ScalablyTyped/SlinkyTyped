package typingsSlinky.sxml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleMod {
  
  @JSImport("sxml/lib/module", "XML")
  @js.native
  class XML ()
    extends typingsSlinky.sxml.xmlMod.XML {
    def this(str: String) = this()
    def this(xml: typingsSlinky.sxml.xmlMod.XML) = this()
  }
  /* static members */
  object XML {
    
    @JSImport("sxml/lib/module", "XML")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @hidden
      */
    @JSImport("sxml/lib/module", "XML._Compute_min_index")
    @js.native
    def _Compute_min_index: js.Any = js.native
    @scala.inline
    def _Compute_min_index_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Compute_min_index")(x.asInstanceOf[js.Any])
    
    /**
      * @hidden
      */
    @JSImport("sxml/lib/module", "XML._Repeat")
    @js.native
    def _Repeat: js.Any = js.native
    @scala.inline
    def _Repeat_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Repeat")(x.asInstanceOf[js.Any])
    
    @JSImport("sxml/lib/module", "XML.decode_property")
    @js.native
    def decodeProperty(str: String): String = js.native
    
    @JSImport("sxml/lib/module", "XML.decode_value")
    @js.native
    def decodeValue(str: String): String = js.native
    
    @JSImport("sxml/lib/module", "XML.encode_property")
    @js.native
    def encodeProperty(str: String): String = js.native
    
    @JSImport("sxml/lib/module", "XML.encode_value")
    @js.native
    def encodeValue(str: String): String = js.native
    
    @JSImport("sxml/lib/module", "XML.head")
    @js.native
    def head(): String = js.native
    @JSImport("sxml/lib/module", "XML.head")
    @js.native
    def head(encoding: String): String = js.native
  }
  
  @JSImport("sxml/lib/module", "XMLList")
  @js.native
  class XMLList ()
    extends typingsSlinky.sxml.xmllistMod.XMLList
}

package typingsSlinky.zoneJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ADDEVENTLISTENERSTR extends StObject {
    
    var ADD_EVENT_LISTENER_STR: String = js.native
    
    var FALSE_STR: String = js.native
    
    var REMOVE_EVENT_LISTENER_STR: String = js.native
    
    var TRUE_STR: String = js.native
    
    var ZONE_SYMBOL_PREFIX: String = js.native
    
    var eventNames: js.Array[String] = js.native
    
    var globalSources: js.Any = js.native
    
    var isBrowser: Boolean = js.native
    
    var isMix: Boolean = js.native
    
    var isNode: Boolean = js.native
    
    var zoneSymbolEventNames: js.Any = js.native
  }
  object ADDEVENTLISTENERSTR {
    
    @scala.inline
    def apply(
      ADD_EVENT_LISTENER_STR: String,
      FALSE_STR: String,
      REMOVE_EVENT_LISTENER_STR: String,
      TRUE_STR: String,
      ZONE_SYMBOL_PREFIX: String,
      eventNames: js.Array[String],
      globalSources: js.Any,
      isBrowser: Boolean,
      isMix: Boolean,
      isNode: Boolean,
      zoneSymbolEventNames: js.Any
    ): ADDEVENTLISTENERSTR = {
      val __obj = js.Dynamic.literal(ADD_EVENT_LISTENER_STR = ADD_EVENT_LISTENER_STR.asInstanceOf[js.Any], FALSE_STR = FALSE_STR.asInstanceOf[js.Any], REMOVE_EVENT_LISTENER_STR = REMOVE_EVENT_LISTENER_STR.asInstanceOf[js.Any], TRUE_STR = TRUE_STR.asInstanceOf[js.Any], ZONE_SYMBOL_PREFIX = ZONE_SYMBOL_PREFIX.asInstanceOf[js.Any], eventNames = eventNames.asInstanceOf[js.Any], globalSources = globalSources.asInstanceOf[js.Any], isBrowser = isBrowser.asInstanceOf[js.Any], isMix = isMix.asInstanceOf[js.Any], isNode = isNode.asInstanceOf[js.Any], zoneSymbolEventNames = zoneSymbolEventNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[ADDEVENTLISTENERSTR]
    }
    
    @scala.inline
    implicit class ADDEVENTLISTENERSTRMutableBuilder[Self <: ADDEVENTLISTENERSTR] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setADD_EVENT_LISTENER_STR(value: String): Self = StObject.set(x, "ADD_EVENT_LISTENER_STR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventNames(value: js.Array[String]): Self = StObject.set(x, "eventNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventNamesVarargs(value: String*): Self = StObject.set(x, "eventNames", js.Array(value :_*))
      
      @scala.inline
      def setFALSE_STR(value: String): Self = StObject.set(x, "FALSE_STR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSources(value: js.Any): Self = StObject.set(x, "globalSources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBrowser(value: Boolean): Self = StObject.set(x, "isBrowser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMix(value: Boolean): Self = StObject.set(x, "isMix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNode(value: Boolean): Self = StObject.set(x, "isNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setREMOVE_EVENT_LISTENER_STR(value: String): Self = StObject.set(x, "REMOVE_EVENT_LISTENER_STR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTRUE_STR(value: String): Self = StObject.set(x, "TRUE_STR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZONE_SYMBOL_PREFIX(value: String): Self = StObject.set(x, "ZONE_SYMBOL_PREFIX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoneSymbolEventNames(value: js.Any): Self = StObject.set(x, "zoneSymbolEventNames", value.asInstanceOf[js.Any])
    }
  }
}

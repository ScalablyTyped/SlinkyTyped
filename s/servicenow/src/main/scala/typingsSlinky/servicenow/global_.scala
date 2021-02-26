package typingsSlinky.servicenow

import typingsSlinky.servicenow.servicenow.GlideEmailOutbound
import typingsSlinky.servicenow.servicenow.GlideScriptedProcessor
import typingsSlinky.servicenow.servicenow.GlideServletRequest
import typingsSlinky.servicenow.servicenow.GlideServletResponse
import typingsSlinky.servicenow.servicenow.GlideSystem
import typingsSlinky.servicenow.servicenow.RestHTTPMethods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global_ {
  
  @JSGlobal("GlideDateTime")
  @js.native
  class GlideDateTime ()
    extends typingsSlinky.servicenow.GlideDateTime {
    def this(value: String) = this()
    def this(value: typingsSlinky.servicenow.GlideDateTime) = this()
  }
  
  @JSGlobal("GlideDuration")
  @js.native
  class GlideDuration ()
    extends typingsSlinky.servicenow.GlideDuration {
    def this(value: String) = this()
    def this(value: Double) = this()
    def this(value: typingsSlinky.servicenow.GlideDuration) = this()
  }
  
  @JSGlobal("GlideEvaluator")
  @js.native
  class GlideEvaluator ()
    extends typingsSlinky.servicenow.GlideEvaluator
  
  object GlideFilter {
    
    @JSGlobal("GlideFilter.checkRecord")
    @js.native
    def checkRecord(gr: typingsSlinky.servicenow.servicenow.GlideRecord, filter: String): Boolean = js.native
    @JSGlobal("GlideFilter.checkRecord")
    @js.native
    def checkRecord(gr: typingsSlinky.servicenow.servicenow.GlideRecord, filter: String, matchAll: js.Object): Boolean = js.native
  }
  
  object GlideGuid {
    
    @JSGlobal("GlideGuid.generate")
    @js.native
    def generate(): String = js.native
  }
  
  @JSGlobal("GlideLocale")
  @js.native
  class GlideLocale ()
    extends typingsSlinky.servicenow.GlideLocale
  object GlideLocale {
    
    /* static member */
    @JSGlobal("GlideLocale.get")
    @js.native
    def get(): typingsSlinky.servicenow.GlideLocale = js.native
  }
  
  object GlidePluginManager {
    
    @JSGlobal("GlidePluginManager.isActive")
    @js.native
    def isActive(pluginId: String): Boolean = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("GlideRecord")
  @js.native
  class GlideRecord protected ()
    extends typingsSlinky.servicenow.servicenow.GlideRecord {
    def this(`type`: String) = this()
  }
  @JSGlobal("GlideRecord")
  @js.native
  val GlideRecord: typingsSlinky.servicenow.servicenow.GlideRecord = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("GlideRecordSecure")
  @js.native
  class GlideRecordSecure protected ()
    extends typingsSlinky.servicenow.servicenow.GlideRecord {
    def this(`type`: String) = this()
  }
  @JSGlobal("GlideRecordSecure")
  @js.native
  val GlideRecordSecure: typingsSlinky.servicenow.servicenow.GlideRecord = js.native
  
  @JSGlobal("GlideSchedule")
  @js.native
  class GlideSchedule ()
    extends typingsSlinky.servicenow.GlideSchedule {
    def this(sysId: String, timeZone: String) = this()
  }
  
  object GlideSecureRandomUtil {
    
    @JSGlobal("GlideSecureRandomUtil.getSecureRandomInt")
    @js.native
    def getSecureRandomInt(): Double = js.native
    
    @JSGlobal("GlideSecureRandomUtil.getSecureRandomIntBound")
    @js.native
    def getSecureRandomIntBound(bound: Double): Double = js.native
    
    @JSGlobal("GlideSecureRandomUtil.getSecureRandomLong")
    @js.native
    def getSecureRandomLong(): Double = js.native
    
    @JSGlobal("GlideSecureRandomUtil.getSecureRandomString")
    @js.native
    def getSecureRandomString(length: Double): String = js.native
  }
  
  @JSGlobal("GlideSysAttachment")
  @js.native
  class GlideSysAttachment ()
    extends typingsSlinky.servicenow.GlideSysAttachment
  
  @JSGlobal("GlideTime")
  @js.native
  class GlideTime protected ()
    extends typingsSlinky.servicenow.GlideTime {
    def this(milliseconds: Double) = this()
  }
  
  object RP {
    
    @JSGlobal("RP.getParameterValue")
    @js.native
    def getParameterValue(value: String): String = js.native
    
    @JSGlobal("RP.getParameters")
    @js.native
    def getParameters(): js.Array[String] = js.native
    
    @JSGlobal("RP.getReferringURL")
    @js.native
    def getReferringURL(): String = js.native
    
    @JSGlobal("RP.getViewID")
    @js.native
    def getViewID(): String = js.native
    
    @JSGlobal("RP.isDialog")
    @js.native
    def isDialog(): Boolean = js.native
    
    @JSGlobal("RP.isHomePage")
    @js.native
    def isHomePage(): Boolean = js.native
    
    @JSGlobal("RP.isMobile")
    @js.native
    def isMobile(): Boolean = js.native
    
    @JSGlobal("RP.isPrint")
    @js.native
    def isPrint(): Boolean = js.native
  }
  
  @JSGlobal("XMLDocument2")
  @js.native
  class XMLDocument2 ()
    extends typingsSlinky.servicenow.XMLDocument2
  
  @JSGlobal("email")
  @js.native
  val email: GlideEmailOutbound = js.native
  
  @JSGlobal("g_processor")
  @js.native
  val gProcessor: GlideScriptedProcessor = js.native
  
  @JSGlobal("g_request")
  @js.native
  val gRequest: GlideServletRequest = js.native
  
  @JSGlobal("g_response")
  @js.native
  val gResponse: GlideServletResponse = js.native
  
  object global {
    
    object Class {
      
      @JSGlobal("global.Class.create")
      @js.native
      def create(): js.Any = js.native
    }
    
    object GlideStringUtil {
      
      @JSGlobal("global.GlideStringUtil.base64Decode")
      @js.native
      def base64Decode(value: String): String = js.native
      
      @JSGlobal("global.GlideStringUtil.base64DecodeAsBytes")
      @js.native
      def base64DecodeAsBytes(value: String): js.Any = js.native
      
      @JSGlobal("global.GlideStringUtil.escapeHTML")
      @js.native
      def escapeHTML(value: String): String = js.native
      
      @JSGlobal("global.GlideStringUtil.getStringFromStream")
      @js.native
      def getStringFromStream(stream: js.Object): String = js.native
    }
    
    @JSGlobal("global.Workflow")
    @js.native
    class Workflow ()
      extends typingsSlinky.servicenow.global.Workflow
  }
  
  @JSGlobal("gs")
  @js.native
  val gs: GlideSystem = js.native
  
  object snWs {
    
    @JSGlobal("sn_ws.RESTMessageV2")
    @js.native
    class RESTMessageV2 ()
      extends typingsSlinky.servicenow.snWs.RESTMessageV2 {
      def this(name: String, methodName: RestHTTPMethods) = this()
    }
    
    @JSGlobal("sn_ws.SOAPMessageV2")
    @js.native
    class SOAPMessageV2 ()
      extends typingsSlinky.servicenow.snWs.SOAPMessageV2 {
      def this(soapMessage: String, soapFunction: String) = this()
    }
  }
}

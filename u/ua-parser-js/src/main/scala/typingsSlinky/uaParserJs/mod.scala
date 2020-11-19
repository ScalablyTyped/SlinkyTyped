package typingsSlinky.uaParserJs

import typingsSlinky.uaParserJs.IUAParser.IBrowser
import typingsSlinky.uaParserJs.IUAParser.ICPU
import typingsSlinky.uaParserJs.IUAParser.IDevice
import typingsSlinky.uaParserJs.IUAParser.IEngine
import typingsSlinky.uaParserJs.IUAParser.IOS
import typingsSlinky.uaParserJs.IUAParser.IResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ua-parser-js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  /**
    * Create a new parser with UA prepopulated and extensions extended
    */
  class UAParser () extends js.Object {
    def this(uastring: String) = this()
    def this(uastring: js.UndefOr[scala.Nothing], extensions: js.Any) = this()
    def this(uastring: String, extensions: js.Any) = this()
    
    /**
      *  Returns browser information
      */
    def getBrowser(): IBrowser = js.native
    
    /**
      *  Returns parsed CPU information
      */
    def getCPU(): ICPU = js.native
    
    /**
      *  Returns device information
      */
    def getDevice(): IDevice = js.native
    
    /**
      *  Returns browsers engine information
      */
    def getEngine(): IEngine = js.native
    
    /**
      *  Returns OS information
      */
    def getOS(): IOS = js.native
    
    /**
      *  Returns parse result
      */
    def getResult(): IResult = js.native
    
    /**
      *  Returns UA string of current instance
      */
    def getUA(): String = js.native
    
    /**
      *  Set & parse UA string
      */
    def setUA(uastring: String): UAParser = js.native
  }
  /* static members */
  @js.native
  object UAParser extends js.Object {
    
    var BROWSER: typingsSlinky.uaParserJs.IUAParser.BROWSER = js.native
    
    var CPU: typingsSlinky.uaParserJs.IUAParser.CPU = js.native
    
    var DEVICE: typingsSlinky.uaParserJs.IUAParser.DEVICE = js.native
    
    var ENGINE: typingsSlinky.uaParserJs.IUAParser.ENGINE = js.native
    
    var OS: typingsSlinky.uaParserJs.IUAParser.OS = js.native
    
    var VERSION: String = js.native
  }
}

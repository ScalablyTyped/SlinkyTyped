package typingsSlinky.uaDashParserDashJs

import typingsSlinky.uaDashParserDashJs.IUAParser.IBrowser
import typingsSlinky.uaDashParserDashJs.IUAParser.ICPU
import typingsSlinky.uaDashParserDashJs.IUAParser.IDevice
import typingsSlinky.uaDashParserDashJs.IUAParser.IEngine
import typingsSlinky.uaDashParserDashJs.IUAParser.IOS
import typingsSlinky.uaDashParserDashJs.IUAParser.IResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ua-parser-js", JSImport.Namespace)
@js.native
object uaDashParserDashJsMod extends js.Object {
  @js.native
  /**
    * Create a new parser with UA prepopulated and extensions extended
    */
  class UAParser () extends js.Object {
    def this(uastring: String) = this()
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
    var BROWSER: typingsSlinky.uaDashParserDashJs.IUAParser.BROWSER = js.native
    var CPU: typingsSlinky.uaDashParserDashJs.IUAParser.CPU = js.native
    var DEVICE: typingsSlinky.uaDashParserDashJs.IUAParser.DEVICE = js.native
    var ENGINE: typingsSlinky.uaDashParserDashJs.IUAParser.ENGINE = js.native
    var OS: typingsSlinky.uaDashParserDashJs.IUAParser.OS = js.native
    var VERSION: String = js.native
  }
  
}


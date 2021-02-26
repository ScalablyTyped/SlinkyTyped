package typingsSlinky.yogRal

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.nodeRal.mod.BalanceContextConstructor
import typingsSlinky.nodeRal.mod.LoggerFactory
import typingsSlinky.nodeRal.mod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yog-ral", "Balance")
  @js.native
  abstract class Balance ()
    extends typingsSlinky.nodeRal.mod.Balance
  /* static members */
  object Balance {
    
    @JSImport("yog-ral", "Balance")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("yog-ral", "Balance.BalanceContext")
    @js.native
    def BalanceContext: BalanceContextConstructor = js.native
    
    @JSImport("yog-ral", "Balance.BalanceContextClass")
    @js.native
    class BalanceContextClass protected ()
      extends typingsSlinky.nodeRal.mod.Balance.BalanceContextClass {
      def this(serviceID: String, service: Service) = this()
    }
    
    @scala.inline
    def BalanceContext_=(x: BalanceContextConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BalanceContext")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("yog-ral", "Config")
  @js.native
  val Config: typingsSlinky.nodeRal.mod.Config = js.native
  
  @JSImport("yog-ral", "ConfigNormalizer")
  @js.native
  abstract class ConfigNormalizer ()
    extends typingsSlinky.nodeRal.mod.ConfigNormalizer
  
  @JSImport("yog-ral", "Converter")
  @js.native
  abstract class Converter ()
    extends typingsSlinky.nodeRal.mod.Converter
  
  @JSImport("yog-ral", "Logger")
  @js.native
  val Logger: LoggerFactory = js.native
  
  @JSImport("yog-ral", "Middleware")
  @js.native
  def Middleware(): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* resp */ Response_[_], 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  @JSImport("yog-ral", "Middleware")
  @js.native
  def Middleware(options: Service): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* resp */ Response_[_], 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  
  @JSImport("yog-ral", "Protocol")
  @js.native
  abstract class Protocol ()
    extends typingsSlinky.nodeRal.mod.Protocol
  /* static members */
  object Protocol {
    
    @JSImport("yog-ral", "Protocol.beforeRequest")
    @js.native
    def beforeRequest(context: js.Any): js.Any = js.native
    
    @JSImport("yog-ral", "Protocol.normalizeConfig")
    @js.native
    def normalizeConfig(context: js.Any): js.Any = js.native
  }
  
  object RAL {
    
    @JSImport("yog-ral", "RAL")
    @js.native
    def apply(serviceName: String): typingsSlinky.nodeRal.mod.RAL.RalRunner = js.native
    @JSImport("yog-ral", "RAL")
    @js.native
    def apply(serviceName: String, options: js.Object): typingsSlinky.nodeRal.mod.RAL.RalRunner = js.native
    
    @JSImport("yog-ral", "RAL.NormalizerManager")
    @js.native
    class NormalizerManager ()
      extends typingsSlinky.nodeRal.mod.RAL.NormalizerManager
    
    @JSImport("yog-ral", "RAL.RalRunner")
    @js.native
    class RalRunner protected ()
      extends typingsSlinky.nodeRal.mod.RAL.RalRunner {
      def this(serviceName: String) = this()
      def this(serviceName: String, options: js.Object) = this()
    }
    
    @JSImport("yog-ral", "RAL.appendExtPath")
    @js.native
    def appendExtPath(extPath: String): Unit = js.native
    
    @JSImport("yog-ral", "RAL.getConf")
    @js.native
    def getConf(name: String): typingsSlinky.nodeRal.mod.Config = js.native
    
    @JSImport("yog-ral", "RAL.getRawConf")
    @js.native
    def getRawConf(name: String): typingsSlinky.nodeRal.mod.Config = js.native
    
    @JSImport("yog-ral", "RAL.init")
    @js.native
    def init(): Unit = js.native
    @JSImport("yog-ral", "RAL.init")
    @js.native
    def init(options: js.Object): Unit = js.native
    
    @JSImport("yog-ral", "RAL.reload")
    @js.native
    def reload(): Unit = js.native
    @JSImport("yog-ral", "RAL.reload")
    @js.native
    def reload(options: js.Object): Unit = js.native
    
    @JSImport("yog-ral", "RAL.setConfigNormalizer")
    @js.native
    def setConfigNormalizer(normalizers: typingsSlinky.nodeRal.mod.ConfigNormalizer): Unit = js.native
  }
  
  @JSImport("yog-ral", "RALPromise")
  @js.native
  def RALPromise[T](name: String): js.Promise[T] = js.native
  @JSImport("yog-ral", "RALPromise")
  @js.native
  def RALPromise[T](name: String, options: js.Object): js.Promise[T] = js.native
  
  @JSImport("yog-ral", "RalModule")
  @js.native
  abstract class RalModule ()
    extends typingsSlinky.nodeRal.mod.RalModule
  /* static members */
  object RalModule {
    
    @JSImport("yog-ral", "RalModule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("yog-ral", "RalModule.clearCache")
    @js.native
    def clearCache(): Unit = js.native
    
    @JSImport("yog-ral", "RalModule.load")
    @js.native
    def load(pathOrModule: String): Unit = js.native
    @JSImport("yog-ral", "RalModule.load")
    @js.native
    def load(pathOrModule: typingsSlinky.nodeRal.mod.RalModule): Unit = js.native
    
    @JSImport("yog-ral", "RalModule.modules")
    @js.native
    def modules: StringDictionary[typingsSlinky.nodeRal.mod.RalModule] = js.native
    @scala.inline
    def modules_=(x: StringDictionary[typingsSlinky.nodeRal.mod.RalModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modules")(x.asInstanceOf[js.Any])
  }
}

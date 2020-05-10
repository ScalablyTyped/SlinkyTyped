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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yog-ral", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  abstract class Balance ()
    extends typingsSlinky.nodeRal.mod.Balance
  
  @js.native
  abstract class ConfigNormalizer ()
    extends typingsSlinky.nodeRal.mod.ConfigNormalizer
  
  @js.native
  abstract class Converter ()
    extends typingsSlinky.nodeRal.mod.Converter
  
  @js.native
  abstract class Protocol ()
    extends typingsSlinky.nodeRal.mod.Protocol
  
  @js.native
  abstract class RalModule ()
    extends typingsSlinky.nodeRal.mod.RalModule
  
  val Config: typingsSlinky.nodeRal.mod.Config = js.native
  val Logger: LoggerFactory = js.native
  def Middleware(): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* resp */ Response_[_], 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  def Middleware(options: Service): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* resp */ Response_[_], 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  /* static members */
  @js.native
  object Balance extends js.Object {
    @js.native
    class BalanceContextClass protected ()
      extends typingsSlinky.nodeRal.mod.Balance.BalanceContextClass {
      def this(serviceID: String, service: Service) = this()
    }
    
    var BalanceContext: BalanceContextConstructor = js.native
  }
  
  /* static members */
  @js.native
  object Protocol extends js.Object {
    def beforeRequest(context: js.Any): js.Any = js.native
    def normalizeConfig(context: js.Any): js.Any = js.native
  }
  
  @js.native
  object RAL extends js.Object {
    @js.native
    class NormalizerManager ()
      extends typingsSlinky.nodeRal.mod.RAL.NormalizerManager
    
    @js.native
    class RalRunner protected ()
      extends typingsSlinky.nodeRal.mod.RAL.RalRunner {
      def this(serviceName: String) = this()
      def this(serviceName: String, options: js.Object) = this()
    }
    
    def apply(serviceName: String): typingsSlinky.nodeRal.mod.RAL.RalRunner = js.native
    def apply(serviceName: String, options: js.Object): typingsSlinky.nodeRal.mod.RAL.RalRunner = js.native
    def appendExtPath(extPath: String): Unit = js.native
    def getConf(name: String): typingsSlinky.nodeRal.mod.Config = js.native
    def getRawConf(name: String): typingsSlinky.nodeRal.mod.Config = js.native
    def init(): Unit = js.native
    def init(options: js.Object): Unit = js.native
    def reload(): Unit = js.native
    def reload(options: js.Object): Unit = js.native
    def setConfigNormalizer(normalizers: typingsSlinky.nodeRal.mod.ConfigNormalizer): Unit = js.native
  }
  
  @js.native
  object RALPromise extends js.Object {
    def apply[T](name: String): js.Promise[T] = js.native
    def apply[T](name: String, options: js.Object): js.Promise[T] = js.native
  }
  
  /* static members */
  @js.native
  object RalModule extends js.Object {
    var modules: StringDictionary[typingsSlinky.nodeRal.mod.RalModule] = js.native
    def clearCache(): Unit = js.native
    def load(pathOrModule: String): Unit = js.native
    def load(pathOrModule: typingsSlinky.nodeRal.mod.RalModule): Unit = js.native
  }
  
}


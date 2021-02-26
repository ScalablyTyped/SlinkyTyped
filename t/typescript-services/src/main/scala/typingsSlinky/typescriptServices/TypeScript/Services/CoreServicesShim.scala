package typingsSlinky.typescriptServices.TypeScript.Services

import typingsSlinky.typescriptServices.TypeScript.ILogger
import typingsSlinky.typescriptServices.TypeScript.IScriptSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoreServicesShim extends ShimBase {
  
  def dumpMemory(dummy: js.Any): String = js.native
  
  /* private */ def forwardJSONCall(actionDescription: js.Any, action: js.Any): js.Any = js.native
  
  def getDefaultCompilationSettings(): String = js.native
  
  def getMemoryInfo(dummy: js.Any): String = js.native
  
  def getPreProcessedFileInfo(fileName: String, sourceText: IScriptSnapshot): String = js.native
  
  var host: ICoreServicesHost = js.native
  
  var logger: ILogger = js.native
  
  var services: CoreServices = js.native
}
object CoreServicesShim {
  
  @scala.inline
  def apply(
    dispose: js.Any => Unit,
    dumpMemory: js.Any => String,
    factory: js.Any,
    forwardJSONCall: (js.Any, js.Any) => js.Any,
    getDefaultCompilationSettings: () => String,
    getMemoryInfo: js.Any => String,
    getPreProcessedFileInfo: (String, IScriptSnapshot) => String,
    host: ICoreServicesHost,
    logger: ILogger,
    services: CoreServices
  ): CoreServicesShim = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction1(dispose), dumpMemory = js.Any.fromFunction1(dumpMemory), factory = factory.asInstanceOf[js.Any], forwardJSONCall = js.Any.fromFunction2(forwardJSONCall), getDefaultCompilationSettings = js.Any.fromFunction0(getDefaultCompilationSettings), getMemoryInfo = js.Any.fromFunction1(getMemoryInfo), getPreProcessedFileInfo = js.Any.fromFunction2(getPreProcessedFileInfo), host = host.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreServicesShim]
  }
  
  @scala.inline
  implicit class CoreServicesShimMutableBuilder[Self <: CoreServicesShim] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDumpMemory(value: js.Any => String): Self = StObject.set(x, "dumpMemory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForwardJSONCall(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "forwardJSONCall", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetDefaultCompilationSettings(value: () => String): Self = StObject.set(x, "getDefaultCompilationSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMemoryInfo(value: js.Any => String): Self = StObject.set(x, "getMemoryInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPreProcessedFileInfo(value: (String, IScriptSnapshot) => String): Self = StObject.set(x, "getPreProcessedFileInfo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHost(value: ICoreServicesHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogger(value: ILogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServices(value: CoreServices): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
  }
}

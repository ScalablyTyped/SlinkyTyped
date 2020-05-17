package typingsSlinky.typescriptServices.TypeScript.Services

import typingsSlinky.typescriptServices.TypeScript.ILogger
import typingsSlinky.typescriptServices.TypeScript.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoreServicesShim extends ShimBase {
  var host: ICoreServicesHost = js.native
  var logger: ILogger = js.native
  var services: CoreServices = js.native
  def dumpMemory(dummy: js.Any): String = js.native
  /* private */ def forwardJSONCall(actionDescription: js.Any, action: js.Any): js.Any = js.native
  def getDefaultCompilationSettings(): String = js.native
  def getMemoryInfo(dummy: js.Any): String = js.native
  def getPreProcessedFileInfo(fileName: String, sourceText: IScriptSnapshot): String = js.native
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
  implicit class CoreServicesShimOps[Self <: CoreServicesShim] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDumpMemory(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dumpMemory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withForwardJSONCall(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardJSONCall")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDefaultCompilationSettings(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultCompilationSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMemoryInfo(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMemoryInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPreProcessedFileInfo(value: (String, IScriptSnapshot) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreProcessedFileInfo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHost(value: ICoreServicesHost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogger(value: ILogger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServices(value: CoreServices): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


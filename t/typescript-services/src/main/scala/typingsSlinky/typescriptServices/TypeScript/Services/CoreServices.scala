package typingsSlinky.typescriptServices.TypeScript.Services

import typingsSlinky.typescriptServices.TypeScript.CompilationSettings
import typingsSlinky.typescriptServices.TypeScript.IPreProcessedFileInfo
import typingsSlinky.typescriptServices.TypeScript.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoreServices extends js.Object {
  var host: ICoreServicesHost = js.native
  def collectGarbage(): Unit = js.native
  def dumpMemory(): String = js.native
  def getDefaultCompilationSettings(): CompilationSettings = js.native
  def getMemoryInfo(): js.Array[_] = js.native
  def getPreProcessedFileInfo(fileName: String, sourceText: IScriptSnapshot): IPreProcessedFileInfo = js.native
}

object CoreServices {
  @scala.inline
  def apply(
    collectGarbage: () => Unit,
    dumpMemory: () => String,
    getDefaultCompilationSettings: () => CompilationSettings,
    getMemoryInfo: () => js.Array[_],
    getPreProcessedFileInfo: (String, IScriptSnapshot) => IPreProcessedFileInfo,
    host: ICoreServicesHost
  ): CoreServices = {
    val __obj = js.Dynamic.literal(collectGarbage = js.Any.fromFunction0(collectGarbage), dumpMemory = js.Any.fromFunction0(dumpMemory), getDefaultCompilationSettings = js.Any.fromFunction0(getDefaultCompilationSettings), getMemoryInfo = js.Any.fromFunction0(getMemoryInfo), getPreProcessedFileInfo = js.Any.fromFunction2(getPreProcessedFileInfo), host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreServices]
  }
  @scala.inline
  implicit class CoreServicesOps[Self <: CoreServices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollectGarbage(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectGarbage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDumpMemory(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dumpMemory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDefaultCompilationSettings(value: () => CompilationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultCompilationSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMemoryInfo(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMemoryInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPreProcessedFileInfo(value: (String, IScriptSnapshot) => IPreProcessedFileInfo): Self = {
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
  }
  
}


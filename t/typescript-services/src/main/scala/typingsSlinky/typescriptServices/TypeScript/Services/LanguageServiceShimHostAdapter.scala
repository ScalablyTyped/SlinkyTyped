package typingsSlinky.typescriptServices.TypeScript.Services

import typingsSlinky.typescriptServices.TypeScript.ByteOrderMark
import typingsSlinky.typescriptServices.TypeScript.CompilationSettings
import typingsSlinky.typescriptServices.TypeScript.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageServiceShimHostAdapter extends ILanguageServiceHost {
  
  var shimHost: js.Any = js.native
}
object LanguageServiceShimHostAdapter {
  
  @scala.inline
  def apply(
    debug: () => Boolean,
    directoryExists: String => Boolean,
    error: () => Boolean,
    fatal: () => Boolean,
    fileExists: String => Boolean,
    getCompilationSettings: () => CompilationSettings,
    getDiagnosticsObject: () => ILanguageServicesDiagnostics,
    getLocalizedDiagnosticMessages: () => js.Any,
    getParentDirectory: String => String,
    getScriptByteOrderMark: String => ByteOrderMark,
    getScriptFileNames: () => js.Array[String],
    getScriptIsOpen: String => Boolean,
    getScriptSnapshot: String => IScriptSnapshot,
    getScriptVersion: String => Double,
    information: () => Boolean,
    log: String => Unit,
    resolveRelativePath: (String, String) => String,
    shimHost: js.Any,
    warning: () => Boolean
  ): LanguageServiceShimHostAdapter = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction0(debug), directoryExists = js.Any.fromFunction1(directoryExists), error = js.Any.fromFunction0(error), fatal = js.Any.fromFunction0(fatal), fileExists = js.Any.fromFunction1(fileExists), getCompilationSettings = js.Any.fromFunction0(getCompilationSettings), getDiagnosticsObject = js.Any.fromFunction0(getDiagnosticsObject), getLocalizedDiagnosticMessages = js.Any.fromFunction0(getLocalizedDiagnosticMessages), getParentDirectory = js.Any.fromFunction1(getParentDirectory), getScriptByteOrderMark = js.Any.fromFunction1(getScriptByteOrderMark), getScriptFileNames = js.Any.fromFunction0(getScriptFileNames), getScriptIsOpen = js.Any.fromFunction1(getScriptIsOpen), getScriptSnapshot = js.Any.fromFunction1(getScriptSnapshot), getScriptVersion = js.Any.fromFunction1(getScriptVersion), information = js.Any.fromFunction0(information), log = js.Any.fromFunction1(log), resolveRelativePath = js.Any.fromFunction2(resolveRelativePath), shimHost = shimHost.asInstanceOf[js.Any], warning = js.Any.fromFunction0(warning))
    __obj.asInstanceOf[LanguageServiceShimHostAdapter]
  }
  
  @scala.inline
  implicit class LanguageServiceShimHostAdapterOps[Self <: LanguageServiceShimHostAdapter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setShimHost(value: js.Any): Self = this.set("shimHost", value.asInstanceOf[js.Any])
  }
}

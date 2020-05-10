package typingsSlinky.typescriptServices.TypeScript.Services

import typingsSlinky.typescriptServices.TypeScript.ByteOrderMark
import typingsSlinky.typescriptServices.TypeScript.CompilationSettings
import typingsSlinky.typescriptServices.TypeScript.ILogger
import typingsSlinky.typescriptServices.TypeScript.IReferenceResolverHost
import typingsSlinky.typescriptServices.TypeScript.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILanguageServiceHost
  extends ILogger
     with IReferenceResolverHost {
  def getCompilationSettings(): CompilationSettings = js.native
  def getDiagnosticsObject(): ILanguageServicesDiagnostics = js.native
  def getLocalizedDiagnosticMessages(): js.Any = js.native
  def getScriptByteOrderMark(fileName: String): ByteOrderMark = js.native
  def getScriptFileNames(): js.Array[String] = js.native
  def getScriptIsOpen(fileName: String): Boolean = js.native
  def getScriptVersion(fileName: String): Double = js.native
}

object ILanguageServiceHost {
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
    warning: () => Boolean
  ): ILanguageServiceHost = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction0(debug), directoryExists = js.Any.fromFunction1(directoryExists), error = js.Any.fromFunction0(error), fatal = js.Any.fromFunction0(fatal), fileExists = js.Any.fromFunction1(fileExists), getCompilationSettings = js.Any.fromFunction0(getCompilationSettings), getDiagnosticsObject = js.Any.fromFunction0(getDiagnosticsObject), getLocalizedDiagnosticMessages = js.Any.fromFunction0(getLocalizedDiagnosticMessages), getParentDirectory = js.Any.fromFunction1(getParentDirectory), getScriptByteOrderMark = js.Any.fromFunction1(getScriptByteOrderMark), getScriptFileNames = js.Any.fromFunction0(getScriptFileNames), getScriptIsOpen = js.Any.fromFunction1(getScriptIsOpen), getScriptSnapshot = js.Any.fromFunction1(getScriptSnapshot), getScriptVersion = js.Any.fromFunction1(getScriptVersion), information = js.Any.fromFunction0(information), log = js.Any.fromFunction1(log), resolveRelativePath = js.Any.fromFunction2(resolveRelativePath), warning = js.Any.fromFunction0(warning))
    __obj.asInstanceOf[ILanguageServiceHost]
  }
  @scala.inline
  implicit class ILanguageServiceHostOps[Self <: ILanguageServiceHost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCompilationSettings(value: () => CompilationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCompilationSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDiagnosticsObject(value: () => ILanguageServicesDiagnostics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDiagnosticsObject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLocalizedDiagnosticMessages(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocalizedDiagnosticMessages")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScriptByteOrderMark(value: String => ByteOrderMark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScriptByteOrderMark")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetScriptFileNames(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScriptFileNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScriptIsOpen(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScriptIsOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetScriptVersion(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScriptVersion")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


package typingsSlinky.tsNode

import typingsSlinky.typescript.mod.CancellationToken
import typingsSlinky.typescript.mod.Diagnostic
import typingsSlinky.typescript.mod.DiagnosticMessageChain
import typingsSlinky.typescript.mod.DocumentRegistry
import typingsSlinky.typescript.mod.IScriptSnapshot
import typingsSlinky.typescript.mod.LanguageService
import typingsSlinky.typescript.mod.LanguageServiceHost
import typingsSlinky.typescript.mod.LanguageServiceMode
import typingsSlinky.typescript.mod.Program
import typingsSlinky.typescript.mod.SourceFile
import typingsSlinky.typescript.mod.SymbolDisplayPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): String = js.native
    def apply(displayParts: js.Array[SymbolDisplayPart]): String = js.native
  }
  
  @js.native
  trait FnCallDiagNewLineIndent extends StObject {
    
    def apply(diag: js.UndefOr[scala.Nothing], newLine: String): String = js.native
    def apply(diag: js.UndefOr[scala.Nothing], newLine: String, indent: Double): String = js.native
    def apply(diag: String, newLine: String): String = js.native
    def apply(diag: String, newLine: String, indent: Double): String = js.native
    def apply(diag: DiagnosticMessageChain, newLine: String): String = js.native
    def apply(diag: DiagnosticMessageChain, newLine: String, indent: Double): String = js.native
  }
  
  @js.native
  trait FnCallHostDocumentRegistrySyntaxOnlyOrLanguageServiceMode extends StObject {
    
    def apply(host: LanguageServiceHost): LanguageService = js.native
    def apply(
      host: LanguageServiceHost,
      documentRegistry: js.UndefOr[scala.Nothing],
      syntaxOnlyOrLanguageServiceMode: Boolean
    ): LanguageService = js.native
    def apply(
      host: LanguageServiceHost,
      documentRegistry: js.UndefOr[scala.Nothing],
      syntaxOnlyOrLanguageServiceMode: LanguageServiceMode
    ): LanguageService = js.native
    def apply(host: LanguageServiceHost, documentRegistry: DocumentRegistry): LanguageService = js.native
    def apply(
      host: LanguageServiceHost,
      documentRegistry: DocumentRegistry,
      syntaxOnlyOrLanguageServiceMode: Boolean
    ): LanguageService = js.native
    def apply(
      host: LanguageServiceHost,
      documentRegistry: DocumentRegistry,
      syntaxOnlyOrLanguageServiceMode: LanguageServiceMode
    ): LanguageService = js.native
  }
  
  @js.native
  trait FnCallProgramSourceFileCancellationToken extends StObject {
    
    def apply(program: Program): js.Array[Diagnostic] = js.native
    def apply(program: Program, sourceFile: js.UndefOr[scala.Nothing], cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
    def apply(program: Program, sourceFile: SourceFile): js.Array[Diagnostic] = js.native
    def apply(program: Program, sourceFile: SourceFile, cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
  }
  
  @js.native
  trait FnCallSearchPathFileExistsConfigName extends StObject {
    
    def apply(searchPath: String, fileExists: js.Function1[/* fileName */ String, Boolean]): js.UndefOr[String] = js.native
    def apply(searchPath: String, fileExists: js.Function1[/* fileName */ String, Boolean], configName: String): js.UndefOr[String] = js.native
  }
  
  @js.native
  trait TypeofScriptSnapshot extends StObject {
    
    def fromString(text: String): IScriptSnapshot = js.native
  }
  object TypeofScriptSnapshot {
    
    @scala.inline
    def apply(fromString: String => IScriptSnapshot): TypeofScriptSnapshot = {
      val __obj = js.Dynamic.literal(fromString = js.Any.fromFunction1(fromString))
      __obj.asInstanceOf[TypeofScriptSnapshot]
    }
    
    @scala.inline
    implicit class TypeofScriptSnapshotMutableBuilder[Self <: TypeofScriptSnapshot] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromString(value: String => IScriptSnapshot): Self = StObject.set(x, "fromString", js.Any.fromFunction1(value))
    }
  }
}

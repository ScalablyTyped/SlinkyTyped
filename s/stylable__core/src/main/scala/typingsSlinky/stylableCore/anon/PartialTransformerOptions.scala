package typingsSlinky.stylableCore.anon

import typingsSlinky.stylableCore.cachedProcessFileMod.FileProcessor
import typingsSlinky.stylableCore.diagnosticsMod.Diagnostics
import typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta
import typingsSlinky.stylableCore.stylableTransformerMod.EnvMode
import typingsSlinky.stylableCore.stylableTransformerMod.StylableResults
import typingsSlinky.stylableCore.stylableTransformerMod.StylableTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@stylable/core.@stylable/core/cjs/stylable-transformer.TransformerOptions> */
@js.native
trait PartialTransformerOptions extends StObject {
  
  var delimiter: js.UndefOr[String] = js.native
  
  var diagnostics: js.UndefOr[Diagnostics] = js.native
  
  var fileProcessor: js.UndefOr[FileProcessor[StylableMeta]] = js.native
  
  var keepValues: js.UndefOr[Boolean] = js.native
  
  var mode: js.UndefOr[EnvMode] = js.native
  
  var postProcessor: js.UndefOr[typingsSlinky.stylableCore.stylableTransformerMod.postProcessor[js.Object]] = js.native
  
  var replaceValueHook: js.UndefOr[typingsSlinky.stylableCore.stylableTransformerMod.replaceValueHook] = js.native
  
  var requireModule: js.UndefOr[js.Function1[/* modulePath */ String, _]] = js.native
}
object PartialTransformerOptions {
  
  @scala.inline
  def apply(): PartialTransformerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTransformerOptions]
  }
  
  @scala.inline
  implicit class PartialTransformerOptionsMutableBuilder[Self <: PartialTransformerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    @scala.inline
    def setDiagnostics(value: Diagnostics): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    @scala.inline
    def setFileProcessor(value: FileProcessor[StylableMeta]): Self = StObject.set(x, "fileProcessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileProcessorUndefined: Self = StObject.set(x, "fileProcessor", js.undefined)
    
    @scala.inline
    def setKeepValues(value: Boolean): Self = StObject.set(x, "keepValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepValuesUndefined: Self = StObject.set(x, "keepValues", js.undefined)
    
    @scala.inline
    def setMode(value: EnvMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setPostProcessor(
      value: (/* stylableResults */ StylableResults, /* transformer */ StylableTransformer) => StylableResults with js.Object
    ): Self = StObject.set(x, "postProcessor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPostProcessorUndefined: Self = StObject.set(x, "postProcessor", js.undefined)
    
    @scala.inline
    def setReplaceValueHook(
      value: (/* value */ String, /* name */ String | Args, /* isLocal */ Boolean, /* passedThrough */ js.Array[String]) => String
    ): Self = StObject.set(x, "replaceValueHook", js.Any.fromFunction4(value))
    
    @scala.inline
    def setReplaceValueHookUndefined: Self = StObject.set(x, "replaceValueHook", js.undefined)
    
    @scala.inline
    def setRequireModule(value: /* modulePath */ String => _): Self = StObject.set(x, "requireModule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequireModuleUndefined: Self = StObject.set(x, "requireModule", js.undefined)
  }
}

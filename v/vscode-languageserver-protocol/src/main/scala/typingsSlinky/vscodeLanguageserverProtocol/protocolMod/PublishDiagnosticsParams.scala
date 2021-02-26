package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverTypes.mod.Diagnostic
import typingsSlinky.vscodeLanguageserverTypes.mod.DocumentUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishDiagnosticsParams extends StObject {
  
  /**
    * An array of diagnostic information items.
    */
  var diagnostics: js.Array[Diagnostic] = js.native
  
  /**
    * The URI for which diagnostic information is reported.
    */
  var uri: DocumentUri = js.native
  
  /**
    * Optional the version number of the document the diagnostics are published for.
    *
    * @since 3.15.0
    */
  var version: js.UndefOr[Double] = js.native
}
object PublishDiagnosticsParams {
  
  @scala.inline
  def apply(diagnostics: js.Array[Diagnostic], uri: DocumentUri): PublishDiagnosticsParams = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishDiagnosticsParams]
  }
  
  @scala.inline
  implicit class PublishDiagnosticsParamsMutableBuilder[Self <: PublishDiagnosticsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value :_*))
    
    @scala.inline
    def setUri(value: DocumentUri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvedModule extends StObject {
  
  /** True if `resolvedFileName` comes from `node_modules`. */
  var isExternalLibraryImport: js.UndefOr[Boolean] = js.native
  
  /** Path of the file the module was resolved to. */
  var resolvedFileName: java.lang.String = js.native
}
object ResolvedModule {
  
  @scala.inline
  def apply(resolvedFileName: java.lang.String): ResolvedModule = {
    val __obj = js.Dynamic.literal(resolvedFileName = resolvedFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedModule]
  }
  
  @scala.inline
  implicit class ResolvedModuleMutableBuilder[Self <: ResolvedModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsExternalLibraryImport(value: Boolean): Self = StObject.set(x, "isExternalLibraryImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExternalLibraryImportUndefined: Self = StObject.set(x, "isExternalLibraryImport", js.undefined)
    
    @scala.inline
    def setResolvedFileName(value: java.lang.String): Self = StObject.set(x, "resolvedFileName", value.asInstanceOf[js.Any])
  }
}

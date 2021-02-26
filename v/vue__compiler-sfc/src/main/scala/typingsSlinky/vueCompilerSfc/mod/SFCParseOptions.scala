package typingsSlinky.vueCompilerSfc.mod

import typingsSlinky.vueCompilerSfc.vueCompilerSfcStrings.line
import typingsSlinky.vueCompilerSfc.vueCompilerSfcStrings.space
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFCParseOptions extends StObject {
  
  var compiler: js.UndefOr[TemplateCompiler] = js.native
  
  var filename: js.UndefOr[String] = js.native
  
  var pad: js.UndefOr[Boolean | line | space] = js.native
  
  var sourceMap: js.UndefOr[Boolean] = js.native
  
  var sourceRoot: js.UndefOr[String] = js.native
}
object SFCParseOptions {
  
  @scala.inline
  def apply(): SFCParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SFCParseOptions]
  }
  
  @scala.inline
  implicit class SFCParseOptionsMutableBuilder[Self <: SFCParseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompiler(value: TemplateCompiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setPad(value: Boolean | line | space): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    @scala.inline
    def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    
    @scala.inline
    def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
  }
}

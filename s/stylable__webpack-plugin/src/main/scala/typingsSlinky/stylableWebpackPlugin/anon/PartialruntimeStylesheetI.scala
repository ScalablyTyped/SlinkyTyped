package typingsSlinky.stylableWebpackPlugin.anon

import typingsSlinky.stylableWebpackPlugin.stylableWebpackPluginStrings.module
import typingsSlinky.stylableWebpackPlugin.stylableWebpackPluginStrings.namespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  runtimeStylesheetId :'module' | 'namespace',   afterTransform :any}> */
@js.native
trait PartialruntimeStylesheetI extends StObject {
  
  var afterTransform: js.UndefOr[js.Any] = js.native
  
  var runtimeStylesheetId: js.UndefOr[module | namespace] = js.native
}
object PartialruntimeStylesheetI {
  
  @scala.inline
  def apply(): PartialruntimeStylesheetI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialruntimeStylesheetI]
  }
  
  @scala.inline
  implicit class PartialruntimeStylesheetIMutableBuilder[Self <: PartialruntimeStylesheetI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterTransform(value: js.Any): Self = StObject.set(x, "afterTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterTransformUndefined: Self = StObject.set(x, "afterTransform", js.undefined)
    
    @scala.inline
    def setRuntimeStylesheetId(value: module | namespace): Self = StObject.set(x, "runtimeStylesheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeStylesheetIdUndefined: Self = StObject.set(x, "runtimeStylesheetId", js.undefined)
  }
}
